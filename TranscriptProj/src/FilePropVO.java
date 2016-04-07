


import java.io.BufferedWriter;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilePropVO /*extends BaseTranslatorVO*/{
	
	public String strFileName;	
	public BufferedWriter objErrWriter;
	public BufferedWriter objQryWriter;
	
	public File objInputFile;
	
	public String strMyClsNm;	
	public String strRetObj;
	public String strMetNm;
	public String strInput;
	public String strQuery;
	
	
	public boolean blVOExists;
	public boolean blDAOImplExists;
	public boolean blDAOIntfExists;
	public boolean blBussImplExists;
	public boolean blBussIntfExists;
	public boolean blServImplExists;
	public boolean blServIntfExists;	
	
	public String strStatusMsg;
	public String strVOStatusMsg;
	public String strBussImplStatusMsg;
	public String strBussIntfStatusMsg;
	public String strServImplStatusMsg;
	public String strServIntfStatusMsg;
	public String strActionStatusMsg;
	public String strUtilStatusMsg;
	public String strDAOImplStatusMsg;
	public String strDAOIntfStatusMsg;
	public String strHTMLStatusMsg;
	

	public StringBuffer strComments = new StringBuffer();
	public String displayComments ;
	
	public Map<String,String> dwVarMap = new HashMap<>();
	
	public String getStrFileName() {
		return strFileName;
	}
	public void setStrFileName(String strFileName) {
		this.strFileName = (strFileName != null ? strFileName.trim() : strFileName);
	}
	public BufferedWriter getObjErrWriter() {
		return objErrWriter;
	}
	public void setObjErrWriter(BufferedWriter objErrWriter) {
		this.objErrWriter =  objErrWriter;
	}
	public BufferedWriter getObjQryWriter() {
		return objQryWriter;
	}
	public void setObjQryWriter(BufferedWriter objQryWriter) {
		this.objQryWriter =  objQryWriter;
	}
	public File getObjInputFile() {
		return objInputFile;
	}
	public void setObjInputFile(File objInputFile) {
		this.objInputFile =  objInputFile;
	}
	public String getStrMyClsNm() {
		return strMyClsNm;
	}
	public void setStrMyClsNm(String strMyClsNm) {
		this.strMyClsNm = (strMyClsNm != null ? strMyClsNm.trim() : strMyClsNm);
	}
	public String getStrRetObj() {
		return strRetObj;
	}
	public void setStrRetObj(String strRetObj) {
		this.strRetObj = (strRetObj != null ? strRetObj.trim() : strRetObj);
	}
	public String getStrMetNm() {
		return strMetNm;
	}
	public void setStrMetNm(String strMetNm) {
		this.strMetNm = (strMetNm != null ? strMetNm.trim() : strMetNm);
	}
	public String getStrInput() {
		return strInput;
	}
	public void setStrInput(String strInput) {
		this.strInput = (strInput != null ? strInput.trim() : strInput);
	}
	public String getStrQuery() {
		return strQuery;
	}
	public void setStrQuery(String strQuery) {
		this.strQuery = (strQuery != null ? strQuery.trim() : strQuery);
	}
	public boolean isBlVOExists() {
		return blVOExists;
	}
	public void setBlVOExists(boolean blVOExists) {
		this.blVOExists =  blVOExists;
	}
	public boolean isBlDAOImplExists() {
		return blDAOImplExists;
	}
	public void setBlDAOImplExists(boolean blDAOImplExists) {
		this.blDAOImplExists = blDAOImplExists;
	}
	public boolean isBlDAOIntfExists() {
		return blDAOIntfExists;
	}
	public void setBlDAOIntfExists(boolean blDAOIntfExists) {
		this.blDAOIntfExists =  blDAOIntfExists;
	}
	public boolean isBlBussImplExists() {
		return blBussImplExists;
	}
	public void setBlBussImplExists(boolean blBussImplExists) {
		this.blBussImplExists =  blBussImplExists;
	}
	public boolean isBlBussIntfExists() {
		return blBussIntfExists;
	}
	public void setBlBussIntfExists(boolean blBussIntfExists) {
		this.blBussIntfExists = blBussIntfExists;
	}
	public boolean isBlServImplExists() {
		return blServImplExists;
	}
	public void setBlServImplExists(boolean blServImplExists) {
		this.blServImplExists = blServImplExists;
	}
	public boolean isBlServIntfExists() {
		return blServIntfExists;
	}
	public void setBlServIntfExists(boolean blServIntfExists) {
		this.blServIntfExists =  blServIntfExists;
	}
	public String getStrStatusMsg() {
		return strStatusMsg;
	}
	public void setStrStatusMsg(String strStatusMsg) {
		this.strStatusMsg = (strStatusMsg != null ? strStatusMsg.trim()
				: strStatusMsg);
	}
	public String getStrVOStatusMsg() {
		return strVOStatusMsg;
	}
	public void setStrVOStatusMsg(String strVOStatusMsg) {
		this.strVOStatusMsg = (strVOStatusMsg != null ? strVOStatusMsg.trim()
				: strVOStatusMsg);
	}
	public String getStrBussImplStatusMsg() {
		return strBussImplStatusMsg;
	}
	public void setStrBussImplStatusMsg(String strBussImplStatusMsg) {
		this.strBussImplStatusMsg = (strBussImplStatusMsg != null ? strBussImplStatusMsg
				.trim() : strBussImplStatusMsg);
	}
	public String getStrBussIntfStatusMsg() {
		return strBussIntfStatusMsg;
	}
	public void setStrBussIntfStatusMsg(String strBussIntfStatusMsg) {
		this.strBussIntfStatusMsg = (strBussIntfStatusMsg != null ? strBussIntfStatusMsg
				.trim() : strBussIntfStatusMsg);
	}
	public String getStrServImplStatusMsg() {
		return strServImplStatusMsg;
	}
	public void setStrServImplStatusMsg(String strServImplStatusMsg) {
		this.strServImplStatusMsg = (strServImplStatusMsg != null ? strServImplStatusMsg
				.trim() : strServImplStatusMsg);
	}
	public String getStrServIntfStatusMsg() {
		return strServIntfStatusMsg;
	}
	public void setStrServIntfStatusMsg(String strServIntfStatusMsg) {
		this.strServIntfStatusMsg = (strServIntfStatusMsg != null ? strServIntfStatusMsg
				.trim() : strServIntfStatusMsg);
	}
	public String getStrActionStatusMsg() {
		return strActionStatusMsg;
	}
	public void setStrActionStatusMsg(String strActionStatusMsg) {
		this.strActionStatusMsg = (strActionStatusMsg != null ? strActionStatusMsg
				.trim() : strActionStatusMsg);
	}
	public String getStrUtilStatusMsg() {
		return strUtilStatusMsg;
	}
	public void setStrUtilStatusMsg(String strUtilStatusMsg) {
		this.strUtilStatusMsg = (strUtilStatusMsg != null ? strUtilStatusMsg.trim()
				: strUtilStatusMsg);
	}
	public String getStrDAOImplStatusMsg() {
		return strDAOImplStatusMsg;
	}
	public void setStrDAOImplStatusMsg(String strDAOImplStatusMsg) {
		this.strDAOImplStatusMsg = (strDAOImplStatusMsg != null ? strDAOImplStatusMsg
				.trim() : strDAOImplStatusMsg);
	}
	public String getStrDAOIntfStatusMsg() {
		return strDAOIntfStatusMsg;
	}
	public void setStrDAOIntfStatusMsg(String strDAOIntfStatusMsg) {
		this.strDAOIntfStatusMsg = (strDAOIntfStatusMsg != null ? strDAOIntfStatusMsg
				.trim() : strDAOIntfStatusMsg);
	}
	public String getStrHTMLStatusMsg() {
		return strHTMLStatusMsg;
	}
	public void setStrHTMLStatusMsg(String strHTMLStatusMsg) {
		this.strHTMLStatusMsg = (strHTMLStatusMsg != null ? strHTMLStatusMsg.trim()
				: strHTMLStatusMsg);
	}
	public StringBuffer getStrComments() {
		return strComments;
	}
	public void setStrComments(StringBuffer strComments) {
		this.strComments = strComments;
	}
	
	public Map<String, String> getDwVarMap() {
		return dwVarMap;
	}
	public void setDwVarMap(Map<String, String> dwVarMap) {
		this.dwVarMap = dwVarMap;
	}

	
	
}
