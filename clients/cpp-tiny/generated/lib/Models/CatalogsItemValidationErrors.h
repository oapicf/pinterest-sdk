
/*
 * CatalogsItemValidationErrors.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsItemValidationErrors_H_
#define TINY_CPP_CLIENT_CatalogsItemValidationErrors_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsItemValidationDetails.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsItemValidationErrors{
public:

    /*! \brief Constructor.
	 */
    CatalogsItemValidationErrors();
    CatalogsItemValidationErrors(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsItemValidationErrors();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Item has an invalid adult value.
	 */
	CatalogsItemValidationDetails getADULTINVALID();

	/*! \brief Set Item has an invalid adult value.
	 */
	void setADULTINVALID(CatalogsItemValidationDetails aDULT_INVALID);
	/*! \brief Get Adword link contains too many characters.
	 */
	CatalogsItemValidationDetails getADWORDSFORMATINVALID();

	/*! \brief Set Adword link contains too many characters.
	 */
	void setADWORDSFORMATINVALID(CatalogsItemValidationDetails aDWORDS_FORMAT_INVALID);
	/*! \brief Get Item is missing availability value in its product metadata, this item will not be published.
	 */
	CatalogsItemValidationDetails getAVAILABILITYINVALID();

	/*! \brief Set Item is missing availability value in its product metadata, this item will not be published.
	 */
	void setAVAILABILITYINVALID(CatalogsItemValidationDetails aVAILABILITY_INVALID);
	/*! \brief Get Item will not be published because it doesn't meet Pinterest's Merchant Guidelines.
	 */
	CatalogsItemValidationDetails getBLOCKLISTEDIMAGESIGNATURE();

	/*! \brief Set Item will not be published because it doesn't meet Pinterest's Merchant Guidelines.
	 */
	void setBLOCKLISTEDIMAGESIGNATURE(CatalogsItemValidationDetails bLOCKLISTED_IMAGE_SIGNATURE);
	/*! \brief Get Item is missing description in its product metadata, this item will not be published.
	 */
	CatalogsItemValidationDetails getDESCRIPTIONMISSING();

	/*! \brief Set Item is missing description in its product metadata, this item will not be published.
	 */
	void setDESCRIPTIONMISSING(CatalogsItemValidationDetails dESCRIPTION_MISSING);
	/*! \brief Get This product is duplicated. The duplicate entry will not be published.
	 */
	CatalogsItemValidationDetails getDUPLICATEPRODUCTS();

	/*! \brief Set This product is duplicated. The duplicate entry will not be published.
	 */
	void setDUPLICATEPRODUCTS(CatalogsItemValidationDetails dUPLICATE_PRODUCTS);
	/*! \brief Get Image link is invalid.
	 */
	CatalogsItemValidationDetails getIMAGELINKINVALID();

	/*! \brief Set Image link is invalid.
	 */
	void setIMAGELINKINVALID(CatalogsItemValidationDetails iMAGE_LINK_INVALID);
	/*! \brief Get Item has image_link URL that contains too many characters, so the item will not be published.
	 */
	CatalogsItemValidationDetails getIMAGELINKLENGTHTOOLONG();

	/*! \brief Set Item has image_link URL that contains too many characters, so the item will not be published.
	 */
	void setIMAGELINKLENGTHTOOLONG(CatalogsItemValidationDetails iMAGE_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Item is missing an image link URL in its product metadata, this item will not be published.
	 */
	CatalogsItemValidationDetails getIMAGELINKMISSING();

	/*! \brief Set Item is missing an image link URL in its product metadata, this item will not be published.
	 */
	void setIMAGELINKMISSING(CatalogsItemValidationDetails iMAGE_LINK_MISSING);
	/*! \brief Get Product link value doesn't match the verified domain associated with this account.
	 */
	CatalogsItemValidationDetails getINVALIDDOMAIN();

	/*! \brief Set Product link value doesn't match the verified domain associated with this account.
	 */
	void setINVALIDDOMAIN(CatalogsItemValidationDetails iNVALID_DOMAIN);
	/*! \brief Get Main image can't be found.
	 */
	CatalogsItemValidationDetails getITEMMAINIMAGEDOWNLOADFAILURE();

	/*! \brief Set Main image can't be found.
	 */
	void setITEMMAINIMAGEDOWNLOADFAILURE(CatalogsItemValidationDetails iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE);
	/*! \brief Get Item is missing item id in its product metadata, this item will not be published.
	 */
	CatalogsItemValidationDetails getITEMIDMISSING();

	/*! \brief Set Item is missing item id in its product metadata, this item will not be published.
	 */
	void setITEMIDMISSING(CatalogsItemValidationDetails iTEMID_MISSING);
	/*! \brief Get Link is invalid.
	 */
	CatalogsItemValidationDetails getLINKFORMATINVALID();

	/*! \brief Set Link is invalid.
	 */
	void setLINKFORMATINVALID(CatalogsItemValidationDetails lINK_FORMAT_INVALID);
	/*! \brief Get Product link contains too many characters, this item will not be published.
	 */
	CatalogsItemValidationDetails getLINKLENGTHTOOLONG();

	/*! \brief Set Product link contains too many characters, this item will not be published.
	 */
	void setLINKLENGTHTOOLONG(CatalogsItemValidationDetails lINK_LENGTH_TOO_LONG);
	/*! \brief Get Item has a list price formatting error, this item will not be published.
	 */
	CatalogsItemValidationDetails getLISTPRICEINVALID();

	/*! \brief Set Item has a list price formatting error, this item will not be published.
	 */
	void setLISTPRICEINVALID(CatalogsItemValidationDetails lIST_PRICE_INVALID);
	/*! \brief Get Item exceed the maximum number of items per item group, this item will not be published.
	 */
	CatalogsItemValidationDetails getMAXITEMSPERITEMGROUPEXCEEDED();

	/*! \brief Set Item exceed the maximum number of items per item group, this item will not be published.
	 */
	void setMAXITEMSPERITEMGROUPEXCEEDED(CatalogsItemValidationDetails mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED);
	/*! \brief Get Item contains formating errors.
	 */
	CatalogsItemValidationDetails getPARSELINEERROR();

	/*! \brief Set Item contains formating errors.
	 */
	void setPARSELINEERROR(CatalogsItemValidationDetails pARSE_LINE_ERROR);
	/*! \brief Get Item will not be published because it doesn't meet Pinterest's Merchant Guidelines.
	 */
	CatalogsItemValidationDetails getPINJOINCONTENTUNSAFE();

	/*! \brief Set Item will not be published because it doesn't meet Pinterest's Merchant Guidelines.
	 */
	void setPINJOINCONTENTUNSAFE(CatalogsItemValidationDetails pINJOIN_CONTENT_UNSAFE);
	/*! \brief Get Item price cannot be determined because the price, list price, and sale price are all different.
	 */
	CatalogsItemValidationDetails getPRICECANNOTBEDETERMINED();

	/*! \brief Set Item price cannot be determined because the price, list price, and sale price are all different.
	 */
	void setPRICECANNOTBEDETERMINED(CatalogsItemValidationDetails pRICE_CANNOT_BE_DETERMINED);
	/*! \brief Get Product is missing a price, this item will not be published.
	 */
	CatalogsItemValidationDetails getPRICEMISSING();

	/*! \brief Set Product is missing a price, this item will not be published.
	 */
	void setPRICEMISSING(CatalogsItemValidationDetails pRICE_MISSING);
	/*! \brief Get Item is missing a link URL in its product metadata, this item will not be published.
	 */
	CatalogsItemValidationDetails getPRODUCTLINKMISSING();

	/*! \brief Set Item is missing a link URL in its product metadata, this item will not be published.
	 */
	void setPRODUCTLINKMISSING(CatalogsItemValidationDetails pRODUCT_LINK_MISSING);
	/*! \brief Get Item has a price formatting error in its product metadata, this item will not be published.
	 */
	CatalogsItemValidationDetails getPRODUCTPRICEINVALID();

	/*! \brief Set Item has a price formatting error in its product metadata, this item will not be published.
	 */
	void setPRODUCTPRICEINVALID(CatalogsItemValidationDetails pRODUCT_PRICE_INVALID);
	/*! \brief Get Item is missing title in its product metadata, this item will not be published.
	 */
	CatalogsItemValidationDetails getTITLEMISSING();

	/*! \brief Set Item is missing title in its product metadata, this item will not be published.
	 */
	void setTITLEMISSING(CatalogsItemValidationDetails tITLE_MISSING);


    private:
    CatalogsItemValidationDetails aDULT_INVALID;
    CatalogsItemValidationDetails aDWORDS_FORMAT_INVALID;
    CatalogsItemValidationDetails aVAILABILITY_INVALID;
    CatalogsItemValidationDetails bLOCKLISTED_IMAGE_SIGNATURE;
    CatalogsItemValidationDetails dESCRIPTION_MISSING;
    CatalogsItemValidationDetails dUPLICATE_PRODUCTS;
    CatalogsItemValidationDetails iMAGE_LINK_INVALID;
    CatalogsItemValidationDetails iMAGE_LINK_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails iMAGE_LINK_MISSING;
    CatalogsItemValidationDetails iNVALID_DOMAIN;
    CatalogsItemValidationDetails iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE;
    CatalogsItemValidationDetails iTEMID_MISSING;
    CatalogsItemValidationDetails lINK_FORMAT_INVALID;
    CatalogsItemValidationDetails lINK_LENGTH_TOO_LONG;
    CatalogsItemValidationDetails lIST_PRICE_INVALID;
    CatalogsItemValidationDetails mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;
    CatalogsItemValidationDetails pARSE_LINE_ERROR;
    CatalogsItemValidationDetails pINJOIN_CONTENT_UNSAFE;
    CatalogsItemValidationDetails pRICE_CANNOT_BE_DETERMINED;
    CatalogsItemValidationDetails pRICE_MISSING;
    CatalogsItemValidationDetails pRODUCT_LINK_MISSING;
    CatalogsItemValidationDetails pRODUCT_PRICE_INVALID;
    CatalogsItemValidationDetails tITLE_MISSING;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsItemValidationErrors_H_ */
