

import java.util.Map;

public class BaseTranslatorVO {

	private String strInFolder;
	private String strOutFolder;
	private String strSrcLang;
	private String strDestLang;
	private String strDestFrmWrk;	
	private String strPkgOrNmSpace;
	private String strCustomProps;
	private String strDestFileXtn;
	
	private String strBussIntfFolder;
	private String strBussImplFolder;
	private String strServIntfFolder;
	private String strServImplFolder;
	private String strDaoIntfFolder;
	private String strDaoImplFolder;
	private String strActionFolder;
	private String strUtilFolder;
	private String strVOFolder;
	private String strHTMLFolder;	
	private String strIncludesFolder;
	private String strScriptsFolder;
	private String strStylesFolder;
	private String strLogsFolder;
	private String strTemplateFolder;
	
	//Package or namespace  name attributes
	private String strPkgVO;
	private String strPkgBussImpl;
	private String strPkgBussIntf;
	private String strPkgServImpl;
	private String strPkgServIntf;
	private String strPkgDAOImpl;
	private String strPkgDAOIntf;
	private String strPkgAction;
	private String strPkgUtil;
	private String strKeyWordPkg;
	
	
	private Map<String, Integer> locMap;
	private boolean blCustomProp;


	public String getStrInFolder() {
		return strInFolder;
	}


	public void setStrInFolder(String strInFolder) {
		this.strInFolder = (strInFolder != null ? strInFolder.trim() : strInFolder);
	}


	public String getStrOutFolder() {
		return strOutFolder;
	}


	public void setStrOutFolder(String strOutFolder) {
		this.strOutFolder = (strOutFolder != null ? strOutFolder.trim()
				: strOutFolder);
	}


	public String getStrDestLang() {
		return strDestLang;
	}


	public void setStrDestLang(String strDestLang) {
		this.strDestLang = (strDestLang != null ? strDestLang.trim() : strDestLang);
	}


	public String getStrDestFrmWrk() {
		return strDestFrmWrk;
	}


	public void setStrDestFrmWrk(String strDestFrmWrk) {
		this.strDestFrmWrk = (strDestFrmWrk != null ? strDestFrmWrk.trim()
				: strDestFrmWrk);
	}


	public String getStrPkgOrNmSpace() {
		return strPkgOrNmSpace;
	}


	public void setStrPkgOrNmSpace(String strPkgOrNmSpace) {
		this.strPkgOrNmSpace = (strPkgOrNmSpace != null ? strPkgOrNmSpace.trim()
				: strPkgOrNmSpace);
	}


	public String getStrCustomProps() {
		return strCustomProps;
	}


	public void setStrCustomProps(String strCustomProps) {
		this.strCustomProps = (strCustomProps != null ? strCustomProps.trim()
				: strCustomProps);
	}


	public String getStrDestFileXtn() {
		return strDestFileXtn;
	}


	public void setStrDestFileXtn(String strDestFileXtn) {
		this.strDestFileXtn = (strDestFileXtn != null ? strDestFileXtn.trim()
				: strDestFileXtn);
	}


	public String getStrBussIntfFolder() {
		return strBussIntfFolder;
	}


	public void setStrBussIntfFolder(String strBussIntfFolder) {
		this.strBussIntfFolder = (strBussIntfFolder != null ? strBussIntfFolder
				.trim() : strBussIntfFolder);
	}


	public String getStrBussImplFolder() {
		return strBussImplFolder;
	}


	public void setStrBussImplFolder(String strBussImplFolder) {
		this.strBussImplFolder = (strBussImplFolder != null ? strBussImplFolder
				.trim() : strBussImplFolder);
	}


	public String getStrServIntfFolder() {
		return strServIntfFolder;
	}


	public void setStrServIntfFolder(String strServIntfFolder) {
		this.strServIntfFolder = (strServIntfFolder != null ? strServIntfFolder
				.trim() : strServIntfFolder);
	}


	public String getStrServImplFolder() {
		return strServImplFolder;
	}


	public void setStrServImplFolder(String strServImplFolder) {
		this.strServImplFolder = (strServImplFolder != null ? strServImplFolder
				.trim() : strServImplFolder);
	}


	public String getStrDaoIntfFolder() {
		return strDaoIntfFolder;
	}


	public void setStrDaoIntfFolder(String strDaoIntfFolder) {
		this.strDaoIntfFolder = (strDaoIntfFolder != null ? strDaoIntfFolder.trim()
				: strDaoIntfFolder);
	}


	public String getStrDaoImplFolder() {
		return strDaoImplFolder;
	}


	public void setStrDaoImplFolder(String strDaoImplFolder) {
		this.strDaoImplFolder = (strDaoImplFolder != null ? strDaoImplFolder.trim()
				: strDaoImplFolder);
	}


	public String getStrActionFolder() {
		return strActionFolder;
	}


	public void setStrActionFolder(String strActionFolder) {
		this.strActionFolder = (strActionFolder != null ? strActionFolder.trim()
				: strActionFolder);
	}


	public String getStrUtilFolder() {
		return strUtilFolder;
	}


	public void setStrUtilFolder(String strUtilFolder) {
		this.strUtilFolder = (strUtilFolder != null ? strUtilFolder.trim()
				: strUtilFolder);
	}


	public String getStrVOFolder() {
		return strVOFolder;
	}


	public void setStrVOFolder(String strVOFolder) {
		this.strVOFolder = (strVOFolder != null ? strVOFolder.trim() : strVOFolder);
	}


	public String getStrHTMLFolder() {
		return strHTMLFolder;
	}


	public void setStrHTMLFolder(String strHTMLFolder) {
		this.strHTMLFolder = (strHTMLFolder != null ? strHTMLFolder.trim()
				: strHTMLFolder);
	}


	public String getStrIncludesFolder() {
		return strIncludesFolder;
	}


	public void setStrIncludesFolder(String strIncludesFolder) {
		this.strIncludesFolder = (strIncludesFolder != null ? strIncludesFolder
				.trim() : strIncludesFolder);
	}


	public String getStrLogsFolder() {
		return strLogsFolder;
	}


	public void setStrLogsFolder(String strLogsFolder) {
		this.strLogsFolder = (strLogsFolder != null ? strLogsFolder.trim()
				: strLogsFolder);
	}


	public String getStrTemplateFolder() {
		return strTemplateFolder;
	}


	public void setStrTemplateFolder(String strTemplateFolder) {
		this.strTemplateFolder = (strTemplateFolder != null ? strTemplateFolder
				.trim() : strTemplateFolder);
	}


	public String getStrPkgVO() {
		return strPkgVO;
	}


	public void setStrPkgVO(String strPkgVO) {
		this.strPkgVO = (strPkgVO != null ? strPkgVO.trim() : strPkgVO);
	}


	public String getStrPkgBussImpl() {
		return strPkgBussImpl;
	}


	public void setStrPkgBussImpl(String strPkgBussImpl) {
		this.strPkgBussImpl = (strPkgBussImpl != null ? strPkgBussImpl.trim()
				: strPkgBussImpl);
	}


	public String getStrPkgBussIntf() {
		return strPkgBussIntf;
	}


	public void setStrPkgBussIntf(String strPkgBussIntf) {
		this.strPkgBussIntf = (strPkgBussIntf != null ? strPkgBussIntf.trim()
				: strPkgBussIntf);
	}


	public String getStrPkgServImpl() {
		return strPkgServImpl;
	}


	public void setStrPkgServImpl(String strPkgServImpl) {
		this.strPkgServImpl = (strPkgServImpl != null ? strPkgServImpl.trim()
				: strPkgServImpl);
	}


	public String getStrPkgServIntf() {
		return strPkgServIntf;
	}


	public void setStrPkgServIntf(String strPkgServIntf) {
		this.strPkgServIntf = (strPkgServIntf != null ? strPkgServIntf.trim()
				: strPkgServIntf);
	}


	public String getStrPkgDAOImpl() {
		return strPkgDAOImpl;
	}


	public void setStrPkgDAOImpl(String strPkgDAOImpl) {
		this.strPkgDAOImpl = (strPkgDAOImpl != null ? strPkgDAOImpl.trim()
				: strPkgDAOImpl);
	}


	

	public String getStrPkgAction() {
		return strPkgAction;
	}


	public void setStrPkgAction(String strPkgAction) {
		this.strPkgAction = (strPkgAction != null ? strPkgAction.trim()
				: strPkgAction);
	}


	public String getStrPkgUtil() {
		return strPkgUtil;
	}


	public void setStrPkgUtil(String strPkgUtil) {
		this.strPkgUtil = (strPkgUtil != null ? strPkgUtil.trim() : strPkgUtil);
	}


	public String getStrKeyWordPkg() {
		return strKeyWordPkg;
	}


	public void setStrKeyWordPkg(String strKeyWordPkg) {
		this.strKeyWordPkg = (strKeyWordPkg != null ? strKeyWordPkg.trim()
				: strKeyWordPkg);
	}


	public String getStrSrcLang() {
		return strSrcLang;
	}


	public void setStrSrcLang(String strSrcLang) {
		this.strSrcLang = strSrcLang;
	}


	public boolean isBlCustomProp() {
		return blCustomProp;
	}


	public void setBlCustomProp(boolean blCustomProp) {
		this.blCustomProp = blCustomProp;
	}


	public String getStrPkgDAOIntf() {
		return strPkgDAOIntf;
	}


	public void setStrPkgDAOIntf(String strPkgDAOIntf) {
		this.strPkgDAOIntf = (strPkgDAOIntf != null ? strPkgDAOIntf.trim()
				: strPkgDAOIntf);
	}


	public String getStrScriptsFolder() {
		return strScriptsFolder;
	}


	public void setStrScriptsFolder(String strScriptsFolder) {
		this.strScriptsFolder = strScriptsFolder;
	}


	public String getStrStylesFolder() {
		return strStylesFolder;
	}


	public void setStrStylesFolder(String strStylesFolder) {
		this.strStylesFolder = strStylesFolder;
	}


	public Map<String, Integer> getLocMap() {
		return locMap;
	}


	public void setLocMap(Map<String, Integer> locMap) {
		this.locMap = locMap;
	}
	

	


	
}
