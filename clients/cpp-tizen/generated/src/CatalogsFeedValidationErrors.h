/*
 * CatalogsFeedValidationErrors.h
 *
 * 
 */

#ifndef _CatalogsFeedValidationErrors_H_
#define _CatalogsFeedValidationErrors_H_


#include <string>
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

class CatalogsFeedValidationErrors : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsFeedValidationErrors();
	CatalogsFeedValidationErrors(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsFeedValidationErrors();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Pinterest couldn't download your feed.
	 */
	int getFETCHERROR();

	/*! \brief Set Pinterest couldn't download your feed.
	 */
	void setFETCHERROR(int  fETCH_ERROR);
	/*! \brief Get Your feed wasn't ingested because it hasn’t changed in the previous 90 days.
	 */
	int getFETCHINACTIVEFEEDERROR();

	/*! \brief Set Your feed wasn't ingested because it hasn’t changed in the previous 90 days.
	 */
	void setFETCHINACTIVEFEEDERROR(int  fETCH_INACTIVE_FEED_ERROR);
	/*! \brief Get Your feed includes data with an unsupported encoding format.
	 */
	int getENCODINGERROR();

	/*! \brief Set Your feed includes data with an unsupported encoding format.
	 */
	void setENCODINGERROR(int  eNCODING_ERROR);
	/*! \brief Get Your feed includes data with formatting errors.
	 */
	int getDELIMITERERROR();

	/*! \brief Set Your feed includes data with formatting errors.
	 */
	void setDELIMITERERROR(int  dELIMITER_ERROR);
	/*! \brief Get Your feed is missing some required column headers.
	 */
	int getREQUIREDCOLUMNSMISSING();

	/*! \brief Set Your feed is missing some required column headers.
	 */
	void setREQUIREDCOLUMNSMISSING(int  rEQUIRED_COLUMNS_MISSING);
	/*! \brief Get Some image links are formatted incorrectly.
	 */
	int getIMAGELINKINVALID();

	/*! \brief Set Some image links are formatted incorrectly.
	 */
	void setIMAGELINKINVALID(int  iMAGE_LINK_INVALID);
	/*! \brief Get Some items are missing an item id in their product metadata, those items will not be published.
	 */
	int getITEMIDMISSING();

	/*! \brief Set Some items are missing an item id in their product metadata, those items will not be published.
	 */
	void setITEMIDMISSING(int  iTEMID_MISSING);
	/*! \brief Get Some items are missing a title in their product metadata, those items will not be published.
	 */
	int getTITLEMISSING();

	/*! \brief Set Some items are missing a title in their product metadata, those items will not be published.
	 */
	void setTITLEMISSING(int  tITLE_MISSING);
	/*! \brief Get Some items are missing a description in their product metadata, those items will not be published.
	 */
	int getDESCRIPTIONMISSING();

	/*! \brief Set Some items are missing a description in their product metadata, those items will not be published.
	 */
	void setDESCRIPTIONMISSING(int  dESCRIPTION_MISSING);
	/*! \brief Get Some items are missing a link URL in their product metadata, those items will not be published.
	 */
	int getPRODUCTLINKMISSING();

	/*! \brief Set Some items are missing a link URL in their product metadata, those items will not be published.
	 */
	void setPRODUCTLINKMISSING(int  pRODUCT_LINK_MISSING);
	/*! \brief Get Some items are missing an image link URL in their product metadata, those items will not be published.
	 */
	int getIMAGELINKMISSING();

	/*! \brief Set Some items are missing an image link URL in their product metadata, those items will not be published.
	 */
	void setIMAGELINKMISSING(int  iMAGE_LINK_MISSING);
	/*! \brief Get Some items are missing an availability value in their product metadata, those items will not be published.
	 */
	int getAVAILABILITYINVALID();

	/*! \brief Set Some items are missing an availability value in their product metadata, those items will not be published.
	 */
	void setAVAILABILITYINVALID(int  aVAILABILITY_INVALID);
	/*! \brief Get Some items have price formatting errors in their product metadata, those items will not be published.
	 */
	int getPRODUCTPRICEINVALID();

	/*! \brief Set Some items have price formatting errors in their product metadata, those items will not be published.
	 */
	void setPRODUCTPRICEINVALID(int  pRODUCT_PRICE_INVALID);
	/*! \brief Get Some link values are formatted incorrectly.
	 */
	int getLINKFORMATINVALID();

	/*! \brief Set Some link values are formatted incorrectly.
	 */
	void setLINKFORMATINVALID(int  lINK_FORMAT_INVALID);
	/*! \brief Get Your feed contains formatting errors for some items.
	 */
	int getPARSELINEERROR();

	/*! \brief Set Your feed contains formatting errors for some items.
	 */
	void setPARSELINEERROR(int  pARSE_LINE_ERROR);
	/*! \brief Get Some adwords links contain too many characters.
	 */
	int getADWORDSFORMATINVALID();

	/*! \brief Set Some adwords links contain too many characters.
	 */
	void setADWORDSFORMATINVALID(int  aDWORDS_FORMAT_INVALID);
	/*! \brief Get We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours.
	 */
	int getINTERNALSERVICEERROR();

	/*! \brief Set We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours.
	 */
	void setINTERNALSERVICEERROR(int  iNTERNAL_SERVICE_ERROR);
	/*! \brief Get Your merchant domain needs to be claimed.
	 */
	int getNOVERIFIEDDOMAIN();

	/*! \brief Set Your merchant domain needs to be claimed.
	 */
	void setNOVERIFIEDDOMAIN(int  nO_VERIFIED_DOMAIN);
	/*! \brief Get Some items have invalid adult values.
	 */
	int getADULTINVALID();

	/*! \brief Set Some items have invalid adult values.
	 */
	void setADULTINVALID(int  aDULT_INVALID);
	/*! \brief Get Some items have image_link URLs that contain too many characters, so those items will not be published.
	 */
	int getIMAGELINKLENGTHTOOLONG();

	/*! \brief Set Some items have image_link URLs that contain too many characters, so those items will not be published.
	 */
	void setIMAGELINKLENGTHTOOLONG(int  iMAGE_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Some of your product link values don't match the verified domain associated with this account.
	 */
	int getINVALIDDOMAIN();

	/*! \brief Set Some of your product link values don't match the verified domain associated with this account.
	 */
	void setINVALIDDOMAIN(int  iNVALID_DOMAIN);
	/*! \brief Get Your feed contains too many items, some items will not be published.
	 */
	int getFEEDLENGTHTOOLONG();

	/*! \brief Set Your feed contains too many items, some items will not be published.
	 */
	void setFEEDLENGTHTOOLONG(int  fEED_LENGTH_TOO_LONG);
	/*! \brief Get Some product links contain too many characters, those items will not be published.
	 */
	int getLINKLENGTHTOOLONG();

	/*! \brief Set Some product links contain too many characters, those items will not be published.
	 */
	void setLINKLENGTHTOOLONG(int  lINK_LENGTH_TOO_LONG);
	/*! \brief Get Your feed couldn't be validated because the xml file is formatted incorrectly.
	 */
	int getMALFORMEDXML();

	/*! \brief Set Your feed couldn't be validated because the xml file is formatted incorrectly.
	 */
	void setMALFORMEDXML(int  mALFORMED_XML);
	/*! \brief Get Some products are missing a price, those items will not be published.
	 */
	int getPRICEMISSING();

	/*! \brief Set Some products are missing a price, those items will not be published.
	 */
	void setPRICEMISSING(int  pRICE_MISSING);
	/*! \brief Get Your feed couldn't be validated because the file doesn't contain the minimum number of lines required.
	 */
	int getFEEDTOOSMALL();

	/*! \brief Set Your feed couldn't be validated because the file doesn't contain the minimum number of lines required.
	 */
	void setFEEDTOOSMALL(int  fEED_TOO_SMALL);
	/*! \brief Get Some items exceed the maximum number of items per item group, those items will not be published.
	 */
	int getMAXITEMSPERITEMGROUPEXCEEDED();

	/*! \brief Set Some items exceed the maximum number of items per item group, those items will not be published.
	 */
	void setMAXITEMSPERITEMGROUPEXCEEDED(int  mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED);
	/*! \brief Get Some items' main images can't be found.
	 */
	int getITEMMAINIMAGEDOWNLOADFAILURE();

	/*! \brief Set Some items' main images can't be found.
	 */
	void setITEMMAINIMAGEDOWNLOADFAILURE(int  iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE);
	/*! \brief Get Some items were not published because they don't meet Pinterest's Merchant Guidelines.
	 */
	int getPINJOINCONTENTUNSAFE();

	/*! \brief Set Some items were not published because they don't meet Pinterest's Merchant Guidelines.
	 */
	void setPINJOINCONTENTUNSAFE(int  pINJOIN_CONTENT_UNSAFE);
	/*! \brief Get Some items were not published because they don't meet Pinterest's Merchant Guidelines.
	 */
	int getBLOCKLISTEDIMAGESIGNATURE();

	/*! \brief Set Some items were not published because they don't meet Pinterest's Merchant Guidelines.
	 */
	void setBLOCKLISTEDIMAGESIGNATURE(int  bLOCKLISTED_IMAGE_SIGNATURE);
	/*! \brief Get Some items have list price formatting errors in their product metadata, those items will not be published.
	 */
	int getLISTPRICEINVALID();

	/*! \brief Set Some items have list price formatting errors in their product metadata, those items will not be published.
	 */
	void setLISTPRICEINVALID(int  lIST_PRICE_INVALID);
	/*! \brief Get Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published.
	 */
	int getPRICECANNOTBEDETERMINED();

	/*! \brief Set Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published.
	 */
	void setPRICECANNOTBEDETERMINED(int  pRICE_CANNOT_BE_DETERMINED);

private:
	int fETCH_ERROR;
	int fETCH_INACTIVE_FEED_ERROR;
	int eNCODING_ERROR;
	int dELIMITER_ERROR;
	int rEQUIRED_COLUMNS_MISSING;
	int iMAGE_LINK_INVALID;
	int iTEMID_MISSING;
	int tITLE_MISSING;
	int dESCRIPTION_MISSING;
	int pRODUCT_LINK_MISSING;
	int iMAGE_LINK_MISSING;
	int aVAILABILITY_INVALID;
	int pRODUCT_PRICE_INVALID;
	int lINK_FORMAT_INVALID;
	int pARSE_LINE_ERROR;
	int aDWORDS_FORMAT_INVALID;
	int iNTERNAL_SERVICE_ERROR;
	int nO_VERIFIED_DOMAIN;
	int aDULT_INVALID;
	int iMAGE_LINK_LENGTH_TOO_LONG;
	int iNVALID_DOMAIN;
	int fEED_LENGTH_TOO_LONG;
	int lINK_LENGTH_TOO_LONG;
	int mALFORMED_XML;
	int pRICE_MISSING;
	int fEED_TOO_SMALL;
	int mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;
	int iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE;
	int pINJOIN_CONTENT_UNSAFE;
	int bLOCKLISTED_IMAGE_SIGNATURE;
	int lIST_PRICE_INVALID;
	int pRICE_CANNOT_BE_DETERMINED;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsFeedValidationErrors_H_ */
