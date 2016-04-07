

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CobolConverter {
	public static void main(String args[]){
		String strInputFolder = "E:\\Cobol2Java\\RES\\RES\\anth";
		String strDestFolder = "E:\\Cobol2Java\\RES\\RES\\anth";
		File folder = new File(strInputFolder);
		int fileNum = folder.listFiles().length;
		String strInputFileName;
		String strOutputFileName;
		String sectionStatus = "";
		boolean inExec = false;
		for (final File n : folder.listFiles()) {
			strInputFileName = n.getName();
            if (strInputFileName.endsWith(".cbl")) {
            	//create a new file to be written	
    			strOutputFileName = n.getName().replace(".cbl", "")+"_NEW.cbl";
    			File file = new File(strDestFolder+"\\"+strOutputFileName);

    			// if file doesnt exists, then create it
    			if (!file.exists()) {
    				try {
    					file.createNewFile();
    				} catch (IOException e) {
    					// TODO Auto-generated catch block
    					e.printStackTrace();
    				}
    			}
    			BufferedReader br = null;
				try {
					br = new BufferedReader(new FileReader(strInputFolder+"\\"+strInputFileName));
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            	try  {
        			String line;
        			FileWriter fw = new FileWriter(file.getAbsoluteFile());
    				BufferedWriter bw = new BufferedWriter(fw);
        			while ((line = br.readLine()) != null) {
        				//System.out.println(line);
        				//if current line is not comments
        				if(line.length()<=6){
        					bw.write(line+"\n");
        					continue;
        				}
        				if(line.charAt(6)!='*'){
//	Clean the file remove comments and other unwanted values in cobol areas  cmpl
//  File control: selection filename will always have assign to clause ????
//  Data variables declaration: change 999 or S9 or X or Z(Z to 9( or S( or X( or Z(Z CMPL
//  Replace ++ with empty  cmpl
//  Remove EXEC SQL statements in working storage section  cmpl
        					
        					if(line.contains("WORKING-STORAGE SECTION")){
        						sectionStatus = "WORKING-STORAGE SECTION";
        					}else if(line.contains("ENVIRONMENT DIVISION")){
        						sectionStatus = "ENVIRONMENT DIVISION";
        					}else if(line.contains("CONFIGURATION SECTION")){
        						sectionStatus = "CONFIGURATION SECTION";
        					}else if(line.contains("INPUT-OUTPUT SECTION")){
        						sectionStatus = "INPUT-OUTPUT SECTION";
        					}else if(line.contains("FILE-CONTROL")){
        						sectionStatus = "FILE-CONTROL";
        					}else if(line.contains("DATA DIVISION")){
        						sectionStatus = "DATA DIVISION";
        					}else if(line.contains("FILE SECTION")){
        						sectionStatus = "FILE SECTION";
        					}else if(line.contains("LINKAGE SECTION")){
        						sectionStatus = "LINKAGE SECTION";
        					}else if(line.contains("COMMUNICATION SECTION")){
        						sectionStatus = "COMMUNICATION SECTION";
        					}else if(line.contains("SCREEN SECTION")){
        						sectionStatus = "SCREEN SECTION";
        					}else if(line.contains("REPORT SECTION")){
        						sectionStatus = "REPORT SECTION";
        					}else if(line.contains("PROCEDURE DIVISION")){
        						sectionStatus = "PROCEDURE DIVISION";
        					}
        					
        					if(sectionStatus.equalsIgnoreCase("WORKING-STORAGE SECTION")){
        						if(line.contains("EXEC CICS")){
        							inExec = true;
        							continue;
        						}
        					}
        					if(line.contains("END-EXEC")){
        						inExec = false;
        						continue;
        					}
        					if(inExec){
        						continue;
        					}
        					
        					//Change data type in Pic clause
        					/*line = line.replace("PIC 999", "PIC 9(");
        					line = line.replace("PIC S9", "PIC S(");
        					line = line.replace("PIC X", "PIC X(");
        					line = line.replace("PIC Z", "PIC Z(Z");
        					line = line.replace("++", "");*/
        					bw.write(line+"\n");
        				}
        			}
        			bw.close();
        		} catch (IOException e) {
        			e.printStackTrace();
        		}finally{
        			System.out.println(strInputFileName+" is Done!");
        		}
            }
        }
	}
}
