public class ToolMgr {

	
	final static String strSource = "C:\\Users\\Yang.Ye\\Desktop\\CobolFiles";	
	final static String strDest = "C:\\Users\\Yang.Ye\\Desktop\\CobolFiles";
	
	public final static String SRC_COBOL = "Cobol";
	public final static String SRC_MSSQL_SP = "MSSQL SP";
	
	public final static String JAVA_LANG = "Java";
	final static String strPkg = "com.ips";
	
	public static void main(String args[])
	{
		try 
		{
			BaseTranslatorVO objBase = new BaseTranslatorVO();
			objBase.setStrSrcLang(SRC_COBOL);
			objBase.setStrInFolder(strSource);
			objBase.setStrOutFolder(strDest);
			objBase.setStrDestLang(JAVA_LANG);
			objBase.setStrDestFileXtn(".java");

			objBase.setStrPkgOrNmSpace(strPkg);
			objBase.setBlCustomProp(false);
			
			CobolTranslator objTrans = new CobolTranslator(objBase);
			objTrans.startTranslation();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	
	
	
}
