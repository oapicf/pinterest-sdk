/*
 * CatalogsItemValidationWarnings.h
 *
 * 
 */

#ifndef _CatalogsItemValidationWarnings_H_
#define _CatalogsItemValidationWarnings_H_


#include <string>
#include "CatalogsItemValidationDetails.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsItemValidationWarnings : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsItemValidationWarnings();
	CatalogsItemValidationWarnings(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsItemValidationWarnings();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADLINKFORMATWARNING();

	/*! \brief Set 
	 */
	void setADLINKFORMATWARNING(CatalogsItemValidationDetails  aD_LINK_FORMAT_WARNING);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADLINKSAMEASLINK();

	/*! \brief Set 
	 */
	void setADLINKSAMEASLINK(CatalogsItemValidationDetails  aD_LINK_SAME_AS_LINK);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADDITIONALIMAGELINKLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setADDITIONALIMAGELINKLENGTHTOOLONG(CatalogsItemValidationDetails  aDDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADDITIONALIMAGELINKWARNING();

	/*! \brief Set 
	 */
	void setADDITIONALIMAGELINKWARNING(CatalogsItemValidationDetails  aDDITIONAL_IMAGE_LINK_WARNING);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADWORDSFORMATWARNING();

	/*! \brief Set 
	 */
	void setADWORDSFORMATWARNING(CatalogsItemValidationDetails  aDWORDS_FORMAT_WARNING);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADWORDSSAMEASLINK();

	/*! \brief Set 
	 */
	void setADWORDSSAMEASLINK(CatalogsItemValidationDetails  aDWORDS_SAME_AS_LINK);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getAGEGROUPINVALID();

	/*! \brief Set 
	 */
	void setAGEGROUPINVALID(CatalogsItemValidationDetails  aGE_GROUP_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getSIZESYSTEMINVALID();

	/*! \brief Set 
	 */
	void setSIZESYSTEMINVALID(CatalogsItemValidationDetails  sIZE_SYSTEM_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getANDROIDDEEPLINKINVALID();

	/*! \brief Set 
	 */
	void setANDROIDDEEPLINKINVALID(CatalogsItemValidationDetails  aNDROID_DEEP_LINK_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getAVAILABILITYDATEINVALID();

	/*! \brief Set 
	 */
	void setAVAILABILITYDATEINVALID(CatalogsItemValidationDetails  aVAILABILITY_DATE_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getCOUNTRYDOESNOTMAPTOCURRENCY();

	/*! \brief Set 
	 */
	void setCOUNTRYDOESNOTMAPTOCURRENCY(CatalogsItemValidationDetails  cOUNTRY_DOES_NOT_MAP_TO_CURRENCY);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getCUSTOMLABELLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setCUSTOMLABELLENGTHTOOLONG(CatalogsItemValidationDetails  cUSTOM_LABEL_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getDESCRIPTIONLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setDESCRIPTIONLENGTHTOOLONG(CatalogsItemValidationDetails  dESCRIPTION_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getEXPIRATIONDATEINVALID();

	/*! \brief Set 
	 */
	void setEXPIRATIONDATEINVALID(CatalogsItemValidationDetails  eXPIRATION_DATE_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getGENDERINVALID();

	/*! \brief Set 
	 */
	void setGENDERINVALID(CatalogsItemValidationDetails  gENDER_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getGTININVALID();

	/*! \brief Set 
	 */
	void setGTININVALID(CatalogsItemValidationDetails  gTIN_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getIMAGELINKWARNING();

	/*! \brief Set 
	 */
	void setIMAGELINKWARNING(CatalogsItemValidationDetails  iMAGE_LINK_WARNING);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getIOSDEEPLINKINVALID();

	/*! \brief Set 
	 */
	void setIOSDEEPLINKINVALID(CatalogsItemValidationDetails  iOS_DEEP_LINK_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getISBUNDLEINVALID();

	/*! \brief Set 
	 */
	void setISBUNDLEINVALID(CatalogsItemValidationDetails  iS_BUNDLE_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getITEMADDITIONALIMAGEDOWNLOADFAILURE();

	/*! \brief Set 
	 */
	void setITEMADDITIONALIMAGEDOWNLOADFAILURE(CatalogsItemValidationDetails  iTEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getLINKFORMATWARNING();

	/*! \brief Set 
	 */
	void setLINKFORMATWARNING(CatalogsItemValidationDetails  lINK_FORMAT_WARNING);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getMINADPRICEINVALID();

	/*! \brief Set 
	 */
	void setMINADPRICEINVALID(CatalogsItemValidationDetails  mIN_AD_PRICE_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getMPNINVALID();

	/*! \brief Set 
	 */
	void setMPNINVALID(CatalogsItemValidationDetails  mPN_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getMULTIPACKINVALID();

	/*! \brief Set 
	 */
	void setMULTIPACKINVALID(CatalogsItemValidationDetails  mULTIPACK_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getOPTIONALCONDITIONINVALID();

	/*! \brief Set 
	 */
	void setOPTIONALCONDITIONINVALID(CatalogsItemValidationDetails  oPTIONAL_CONDITION_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getOPTIONALCONDITIONMISSING();

	/*! \brief Set 
	 */
	void setOPTIONALCONDITIONMISSING(CatalogsItemValidationDetails  oPTIONAL_CONDITION_MISSING);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getOPTIONALPRODUCTCATEGORYINVALID();

	/*! \brief Set 
	 */
	void setOPTIONALPRODUCTCATEGORYINVALID(CatalogsItemValidationDetails  oPTIONAL_PRODUCT_CATEGORY_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getOPTIONALPRODUCTCATEGORYMISSING();

	/*! \brief Set 
	 */
	void setOPTIONALPRODUCTCATEGORYMISSING(CatalogsItemValidationDetails  oPTIONAL_PRODUCT_CATEGORY_MISSING);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getPRODUCTCATEGORYDEPTHWARNING();

	/*! \brief Set 
	 */
	void setPRODUCTCATEGORYDEPTHWARNING(CatalogsItemValidationDetails  pRODUCT_CATEGORY_DEPTH_WARNING);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getPRODUCTTYPELENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setPRODUCTTYPELENGTHTOOLONG(CatalogsItemValidationDetails  pRODUCT_TYPE_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getSALESPRICEINVALID();

	/*! \brief Set 
	 */
	void setSALESPRICEINVALID(CatalogsItemValidationDetails  sALES_PRICE_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getSALESPRICETOOLOW();

	/*! \brief Set 
	 */
	void setSALESPRICETOOLOW(CatalogsItemValidationDetails  sALES_PRICE_TOO_LOW);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getSALESPRICETOOHIGH();

	/*! \brief Set 
	 */
	void setSALESPRICETOOHIGH(CatalogsItemValidationDetails  sALES_PRICE_TOO_HIGH);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getSALEDATEINVALID();

	/*! \brief Set 
	 */
	void setSALEDATEINVALID(CatalogsItemValidationDetails  sALE_DATE_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getSHIPPINGINVALID();

	/*! \brief Set 
	 */
	void setSHIPPINGINVALID(CatalogsItemValidationDetails  sHIPPING_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getSHIPPINGHEIGHTINVALID();

	/*! \brief Set 
	 */
	void setSHIPPINGHEIGHTINVALID(CatalogsItemValidationDetails  sHIPPING_HEIGHT_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getSHIPPINGWEIGHTINVALID();

	/*! \brief Set 
	 */
	void setSHIPPINGWEIGHTINVALID(CatalogsItemValidationDetails  sHIPPING_WEIGHT_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getSHIPPINGWIDTHINVALID();

	/*! \brief Set 
	 */
	void setSHIPPINGWIDTHINVALID(CatalogsItemValidationDetails  sHIPPING_WIDTH_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getSIZETYPEINVALID();

	/*! \brief Set 
	 */
	void setSIZETYPEINVALID(CatalogsItemValidationDetails  sIZE_TYPE_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getTAXINVALID();

	/*! \brief Set 
	 */
	void setTAXINVALID(CatalogsItemValidationDetails  tAX_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getTITLELENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setTITLELENGTHTOOLONG(CatalogsItemValidationDetails  tITLE_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getTOOMANYADDITIONALIMAGELINKS();

	/*! \brief Set 
	 */
	void setTOOMANYADDITIONALIMAGELINKS(CatalogsItemValidationDetails  tOO_MANY_ADDITIONAL_IMAGE_LINKS);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getUTMSOURCEAUTOCORRECTED();

	/*! \brief Set 
	 */
	void setUTMSOURCEAUTOCORRECTED(CatalogsItemValidationDetails  uTM_SOURCE_AUTO_CORRECTED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getWEIGHTUNITINVALID();

	/*! \brief Set 
	 */
	void setWEIGHTUNITINVALID(CatalogsItemValidationDetails  wEIGHT_UNIT_INVALID);

private:
	CatalogsItemValidationDetails aD_LINK_FORMAT_WARNING;
	CatalogsItemValidationDetails aD_LINK_SAME_AS_LINK;
	CatalogsItemValidationDetails aDDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG;
	CatalogsItemValidationDetails aDDITIONAL_IMAGE_LINK_WARNING;
	CatalogsItemValidationDetails aDWORDS_FORMAT_WARNING;
	CatalogsItemValidationDetails aDWORDS_SAME_AS_LINK;
	CatalogsItemValidationDetails aGE_GROUP_INVALID;
	CatalogsItemValidationDetails sIZE_SYSTEM_INVALID;
	CatalogsItemValidationDetails aNDROID_DEEP_LINK_INVALID;
	CatalogsItemValidationDetails aVAILABILITY_DATE_INVALID;
	CatalogsItemValidationDetails cOUNTRY_DOES_NOT_MAP_TO_CURRENCY;
	CatalogsItemValidationDetails cUSTOM_LABEL_LENGTH_TOO_LONG;
	CatalogsItemValidationDetails dESCRIPTION_LENGTH_TOO_LONG;
	CatalogsItemValidationDetails eXPIRATION_DATE_INVALID;
	CatalogsItemValidationDetails gENDER_INVALID;
	CatalogsItemValidationDetails gTIN_INVALID;
	CatalogsItemValidationDetails iMAGE_LINK_WARNING;
	CatalogsItemValidationDetails iOS_DEEP_LINK_INVALID;
	CatalogsItemValidationDetails iS_BUNDLE_INVALID;
	CatalogsItemValidationDetails iTEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE;
	CatalogsItemValidationDetails lINK_FORMAT_WARNING;
	CatalogsItemValidationDetails mIN_AD_PRICE_INVALID;
	CatalogsItemValidationDetails mPN_INVALID;
	CatalogsItemValidationDetails mULTIPACK_INVALID;
	CatalogsItemValidationDetails oPTIONAL_CONDITION_INVALID;
	CatalogsItemValidationDetails oPTIONAL_CONDITION_MISSING;
	CatalogsItemValidationDetails oPTIONAL_PRODUCT_CATEGORY_INVALID;
	CatalogsItemValidationDetails oPTIONAL_PRODUCT_CATEGORY_MISSING;
	CatalogsItemValidationDetails pRODUCT_CATEGORY_DEPTH_WARNING;
	CatalogsItemValidationDetails pRODUCT_TYPE_LENGTH_TOO_LONG;
	CatalogsItemValidationDetails sALES_PRICE_INVALID;
	CatalogsItemValidationDetails sALES_PRICE_TOO_LOW;
	CatalogsItemValidationDetails sALES_PRICE_TOO_HIGH;
	CatalogsItemValidationDetails sALE_DATE_INVALID;
	CatalogsItemValidationDetails sHIPPING_INVALID;
	CatalogsItemValidationDetails sHIPPING_HEIGHT_INVALID;
	CatalogsItemValidationDetails sHIPPING_WEIGHT_INVALID;
	CatalogsItemValidationDetails sHIPPING_WIDTH_INVALID;
	CatalogsItemValidationDetails sIZE_TYPE_INVALID;
	CatalogsItemValidationDetails tAX_INVALID;
	CatalogsItemValidationDetails tITLE_LENGTH_TOO_LONG;
	CatalogsItemValidationDetails tOO_MANY_ADDITIONAL_IMAGE_LINKS;
	CatalogsItemValidationDetails uTM_SOURCE_AUTO_CORRECTED;
	CatalogsItemValidationDetails wEIGHT_UNIT_INVALID;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsItemValidationWarnings_H_ */
