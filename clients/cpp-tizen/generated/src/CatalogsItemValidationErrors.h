/*
 * CatalogsItemValidationErrors.h
 *
 * 
 */

#ifndef _CatalogsItemValidationErrors_H_
#define _CatalogsItemValidationErrors_H_


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

class CatalogsItemValidationErrors : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsItemValidationErrors();
	CatalogsItemValidationErrors(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsItemValidationErrors();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADULTINVALID();

	/*! \brief Set 
	 */
	void setADULTINVALID(CatalogsItemValidationDetails  aDULT_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getADWORDSFORMATINVALID();

	/*! \brief Set 
	 */
	void setADWORDSFORMATINVALID(CatalogsItemValidationDetails  aDWORDS_FORMAT_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getAVAILABILITYINVALID();

	/*! \brief Set 
	 */
	void setAVAILABILITYINVALID(CatalogsItemValidationDetails  aVAILABILITY_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getBLOCKLISTEDIMAGESIGNATURE();

	/*! \brief Set 
	 */
	void setBLOCKLISTEDIMAGESIGNATURE(CatalogsItemValidationDetails  bLOCKLISTED_IMAGE_SIGNATURE);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getDESCRIPTIONMISSING();

	/*! \brief Set 
	 */
	void setDESCRIPTIONMISSING(CatalogsItemValidationDetails  dESCRIPTION_MISSING);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getIMAGELINKINVALID();

	/*! \brief Set 
	 */
	void setIMAGELINKINVALID(CatalogsItemValidationDetails  iMAGE_LINK_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getIMAGELINKLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setIMAGELINKLENGTHTOOLONG(CatalogsItemValidationDetails  iMAGE_LINK_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getIMAGELINKMISSING();

	/*! \brief Set 
	 */
	void setIMAGELINKMISSING(CatalogsItemValidationDetails  iMAGE_LINK_MISSING);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getINVALIDDOMAIN();

	/*! \brief Set 
	 */
	void setINVALIDDOMAIN(CatalogsItemValidationDetails  iNVALID_DOMAIN);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getITEMIDMISSING();

	/*! \brief Set 
	 */
	void setITEMIDMISSING(CatalogsItemValidationDetails  iTEMID_MISSING);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getITEMMAINIMAGEDOWNLOADFAILURE();

	/*! \brief Set 
	 */
	void setITEMMAINIMAGEDOWNLOADFAILURE(CatalogsItemValidationDetails  iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getLINKFORMATINVALID();

	/*! \brief Set 
	 */
	void setLINKFORMATINVALID(CatalogsItemValidationDetails  lINK_FORMAT_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getLINKLENGTHTOOLONG();

	/*! \brief Set 
	 */
	void setLINKLENGTHTOOLONG(CatalogsItemValidationDetails  lINK_LENGTH_TOO_LONG);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getMAXITEMSPERITEMGROUPEXCEEDED();

	/*! \brief Set 
	 */
	void setMAXITEMSPERITEMGROUPEXCEEDED(CatalogsItemValidationDetails  mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getPARSELINEERROR();

	/*! \brief Set 
	 */
	void setPARSELINEERROR(CatalogsItemValidationDetails  pARSE_LINE_ERROR);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getPINJOINCONTENTUNSAFE();

	/*! \brief Set 
	 */
	void setPINJOINCONTENTUNSAFE(CatalogsItemValidationDetails  pINJOIN_CONTENT_UNSAFE);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getPRICEMISSING();

	/*! \brief Set 
	 */
	void setPRICEMISSING(CatalogsItemValidationDetails  pRICE_MISSING);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getPRODUCTLINKMISSING();

	/*! \brief Set 
	 */
	void setPRODUCTLINKMISSING(CatalogsItemValidationDetails  pRODUCT_LINK_MISSING);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getPRODUCTPRICEINVALID();

	/*! \brief Set 
	 */
	void setPRODUCTPRICEINVALID(CatalogsItemValidationDetails  pRODUCT_PRICE_INVALID);
	/*! \brief Get 
	 */
	CatalogsItemValidationDetails getTITLEMISSING();

	/*! \brief Set 
	 */
	void setTITLEMISSING(CatalogsItemValidationDetails  tITLE_MISSING);

private:
	CatalogsItemValidationDetails aDULT_INVALID;
	CatalogsItemValidationDetails aDWORDS_FORMAT_INVALID;
	CatalogsItemValidationDetails aVAILABILITY_INVALID;
	CatalogsItemValidationDetails bLOCKLISTED_IMAGE_SIGNATURE;
	CatalogsItemValidationDetails dESCRIPTION_MISSING;
	CatalogsItemValidationDetails iMAGE_LINK_INVALID;
	CatalogsItemValidationDetails iMAGE_LINK_LENGTH_TOO_LONG;
	CatalogsItemValidationDetails iMAGE_LINK_MISSING;
	CatalogsItemValidationDetails iNVALID_DOMAIN;
	CatalogsItemValidationDetails iTEMID_MISSING;
	CatalogsItemValidationDetails iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE;
	CatalogsItemValidationDetails lINK_FORMAT_INVALID;
	CatalogsItemValidationDetails lINK_LENGTH_TOO_LONG;
	CatalogsItemValidationDetails mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;
	CatalogsItemValidationDetails pARSE_LINE_ERROR;
	CatalogsItemValidationDetails pINJOIN_CONTENT_UNSAFE;
	CatalogsItemValidationDetails pRICE_MISSING;
	CatalogsItemValidationDetails pRODUCT_LINK_MISSING;
	CatalogsItemValidationDetails pRODUCT_PRICE_INVALID;
	CatalogsItemValidationDetails tITLE_MISSING;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsItemValidationErrors_H_ */
