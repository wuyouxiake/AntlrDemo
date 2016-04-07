

import java.io.File;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.io.FileUtils;

public class CobolTranslator 
{	
	private BaseTranslatorVO objBase;
	public CobolTranslator(BaseTranslatorVO objBase)
	{
		this.objBase = objBase;
	}
	
	
	/**
	 1. Set sysout  & sys errlogs
	 2. Analyze files
	 3. Decode
	 4. Generate UI
	 5. Generate Reports 
	 */
	public void startTranslation()
	{		
		try 
		{

			workCobol();
	
			
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}		
	}
	public void workCobol()
	{
		List<File> liFiles = null;
		try 
		{
			//initOutErrLogging(objBase, "CBL");
			String[] srw_xtn = {"cbl"};
			liFiles = new ArrayList<File>(FileUtils.listFiles(new File(objBase.getStrInFolder()),srw_xtn,true));			
			if(liFiles.size()>0)	decodeCBL(liFiles);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
	public void decodeCBL(List<File> liFiles)
	{
		Iterator<File> fileIter = null;
		ANTLRInputStream antlrInput = null;
		CobolLexer lexer = null;
		CommonTokenStream token = null;
		CobolParser parser = null;
		ParseTree tree = null;
		ParseTreeWalker walker = null;
		
		CobolDecoder converter = null;
		
		List<FilePropVO> liReportFiles = null;
		String strFileName = null;
		try 
		{
			if(liFiles!=null && liFiles.size()>0)
			{
				
				liReportFiles = new ArrayList<FilePropVO>();
				fileIter = liFiles.listIterator();
				while (fileIter.hasNext()) 
				{
					File file = (File) fileIter.next();
					FilePropVO objFPropVO = new FilePropVO();				
					objFPropVO.setStrFileName(file.getName());
					objFPropVO.setObjInputFile(file);
					
					
					antlrInput = new ANTLRInputStream(new FileInputStream(file));
					lexer = new CobolLexer(antlrInput);
					lexer.removeErrorListeners();
					token = new CommonTokenStream(lexer);
					parser = new CobolParser(token);
					parser.setBuildParseTree(true);
					tree = parser.startRule(); 
					walker = new ParseTreeWalker();
					converter = new CobolDecoder(objFPropVO);				
					walker.walk(converter, tree);
					
					
					objFPropVO.setStrComments(null);
					liReportFiles.add(objFPropVO);
					objFPropVO.setDwVarMap(null);
					antlrInput = null;
					lexer = null;
					token = null;
					parser = null;
					tree = null;
					walker =null;
					converter = null;					
				}	
				//ReportMgr.generateSRUReport(liReportFiles);
			}
		}
		catch (Exception e) 
		{
			System.err.println("FileName: "+strFileName);
			e.printStackTrace();
		}
	}
	
	protected static void initOutErrLogging(BaseTranslatorVO objBase,String sFileType)
	{
		try 
		{
			PrintStream objErrStream = new PrintStream(new File(objBase.getStrLogsFolder()+"IMOD_"+sFileType+"_SysErr.log"));
			PrintStream objOutStream = new PrintStream(new File(objBase.getStrLogsFolder()+"IMOD_"+sFileType+"_SysOut.log"));

			System.setErr(objErrStream);
			System.setOut(objOutStream);
			System.err.println("Error Stream Initialized");
			System.out.println("Out Stream Initialized");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
