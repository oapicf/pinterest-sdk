

#include "CatalogsItemValidationErrors.h"

using namespace Tiny;

CatalogsItemValidationErrors::CatalogsItemValidationErrors()
{
	aDULT_INVALID = null;
	aDWORDS_FORMAT_INVALID = null;
	aVAILABILITY_INVALID = null;
	bLOCKLISTED_IMAGE_SIGNATURE = null;
	dESCRIPTION_MISSING = null;
	dUPLICATE_PRODUCTS = null;
	iMAGE_LINK_INVALID = null;
	iMAGE_LINK_LENGTH_TOO_LONG = null;
	iMAGE_LINK_MISSING = null;
	iNVALID_DOMAIN = null;
	iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE = null;
	iTEMID_MISSING = null;
	lINK_FORMAT_INVALID = null;
	lINK_LENGTH_TOO_LONG = null;
	lIST_PRICE_INVALID = null;
	mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED = null;
	pARSE_LINE_ERROR = null;
	pINJOIN_CONTENT_UNSAFE = null;
	pRICE_CANNOT_BE_DETERMINED = null;
	pRICE_MISSING = null;
	pRODUCT_LINK_MISSING = null;
	pRODUCT_PRICE_INVALID = null;
	tITLE_MISSING = null;
}

CatalogsItemValidationErrors::CatalogsItemValidationErrors(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsItemValidationErrors::~CatalogsItemValidationErrors()
{

}

void
CatalogsItemValidationErrors::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *aDULT_INVALIDKey = "ADULT_INVALID";

    if(object.has_key(aDULT_INVALIDKey))
    {
        bourne::json value = object[aDULT_INVALIDKey];




        CatalogsItemValidationDetails* obj = &aDULT_INVALID;
		obj->fromJson(value.dump());

    }

    const char *aDWORDS_FORMAT_INVALIDKey = "ADWORDS_FORMAT_INVALID";

    if(object.has_key(aDWORDS_FORMAT_INVALIDKey))
    {
        bourne::json value = object[aDWORDS_FORMAT_INVALIDKey];




        CatalogsItemValidationDetails* obj = &aDWORDS_FORMAT_INVALID;
		obj->fromJson(value.dump());

    }

    const char *aVAILABILITY_INVALIDKey = "AVAILABILITY_INVALID";

    if(object.has_key(aVAILABILITY_INVALIDKey))
    {
        bourne::json value = object[aVAILABILITY_INVALIDKey];




        CatalogsItemValidationDetails* obj = &aVAILABILITY_INVALID;
		obj->fromJson(value.dump());

    }

    const char *bLOCKLISTED_IMAGE_SIGNATUREKey = "BLOCKLISTED_IMAGE_SIGNATURE";

    if(object.has_key(bLOCKLISTED_IMAGE_SIGNATUREKey))
    {
        bourne::json value = object[bLOCKLISTED_IMAGE_SIGNATUREKey];




        CatalogsItemValidationDetails* obj = &bLOCKLISTED_IMAGE_SIGNATURE;
		obj->fromJson(value.dump());

    }

    const char *dESCRIPTION_MISSINGKey = "DESCRIPTION_MISSING";

    if(object.has_key(dESCRIPTION_MISSINGKey))
    {
        bourne::json value = object[dESCRIPTION_MISSINGKey];




        CatalogsItemValidationDetails* obj = &dESCRIPTION_MISSING;
		obj->fromJson(value.dump());

    }

    const char *dUPLICATE_PRODUCTSKey = "DUPLICATE_PRODUCTS";

    if(object.has_key(dUPLICATE_PRODUCTSKey))
    {
        bourne::json value = object[dUPLICATE_PRODUCTSKey];




        CatalogsItemValidationDetails* obj = &dUPLICATE_PRODUCTS;
		obj->fromJson(value.dump());

    }

    const char *iMAGE_LINK_INVALIDKey = "IMAGE_LINK_INVALID";

    if(object.has_key(iMAGE_LINK_INVALIDKey))
    {
        bourne::json value = object[iMAGE_LINK_INVALIDKey];




        CatalogsItemValidationDetails* obj = &iMAGE_LINK_INVALID;
		obj->fromJson(value.dump());

    }

    const char *iMAGE_LINK_LENGTH_TOO_LONGKey = "IMAGE_LINK_LENGTH_TOO_LONG";

    if(object.has_key(iMAGE_LINK_LENGTH_TOO_LONGKey))
    {
        bourne::json value = object[iMAGE_LINK_LENGTH_TOO_LONGKey];




        CatalogsItemValidationDetails* obj = &iMAGE_LINK_LENGTH_TOO_LONG;
		obj->fromJson(value.dump());

    }

    const char *iMAGE_LINK_MISSINGKey = "IMAGE_LINK_MISSING";

    if(object.has_key(iMAGE_LINK_MISSINGKey))
    {
        bourne::json value = object[iMAGE_LINK_MISSINGKey];




        CatalogsItemValidationDetails* obj = &iMAGE_LINK_MISSING;
		obj->fromJson(value.dump());

    }

    const char *iNVALID_DOMAINKey = "INVALID_DOMAIN";

    if(object.has_key(iNVALID_DOMAINKey))
    {
        bourne::json value = object[iNVALID_DOMAINKey];




        CatalogsItemValidationDetails* obj = &iNVALID_DOMAIN;
		obj->fromJson(value.dump());

    }

    const char *iTEM_MAIN_IMAGE_DOWNLOAD_FAILUREKey = "ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE";

    if(object.has_key(iTEM_MAIN_IMAGE_DOWNLOAD_FAILUREKey))
    {
        bourne::json value = object[iTEM_MAIN_IMAGE_DOWNLOAD_FAILUREKey];




        CatalogsItemValidationDetails* obj = &iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE;
		obj->fromJson(value.dump());

    }

    const char *iTEMID_MISSINGKey = "ITEMID_MISSING";

    if(object.has_key(iTEMID_MISSINGKey))
    {
        bourne::json value = object[iTEMID_MISSINGKey];




        CatalogsItemValidationDetails* obj = &iTEMID_MISSING;
		obj->fromJson(value.dump());

    }

    const char *lINK_FORMAT_INVALIDKey = "LINK_FORMAT_INVALID";

    if(object.has_key(lINK_FORMAT_INVALIDKey))
    {
        bourne::json value = object[lINK_FORMAT_INVALIDKey];




        CatalogsItemValidationDetails* obj = &lINK_FORMAT_INVALID;
		obj->fromJson(value.dump());

    }

    const char *lINK_LENGTH_TOO_LONGKey = "LINK_LENGTH_TOO_LONG";

    if(object.has_key(lINK_LENGTH_TOO_LONGKey))
    {
        bourne::json value = object[lINK_LENGTH_TOO_LONGKey];




        CatalogsItemValidationDetails* obj = &lINK_LENGTH_TOO_LONG;
		obj->fromJson(value.dump());

    }

    const char *lIST_PRICE_INVALIDKey = "LIST_PRICE_INVALID";

    if(object.has_key(lIST_PRICE_INVALIDKey))
    {
        bourne::json value = object[lIST_PRICE_INVALIDKey];




        CatalogsItemValidationDetails* obj = &lIST_PRICE_INVALID;
		obj->fromJson(value.dump());

    }

    const char *mAX_ITEMS_PER_ITEM_GROUP_EXCEEDEDKey = "MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED";

    if(object.has_key(mAX_ITEMS_PER_ITEM_GROUP_EXCEEDEDKey))
    {
        bourne::json value = object[mAX_ITEMS_PER_ITEM_GROUP_EXCEEDEDKey];




        CatalogsItemValidationDetails* obj = &mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;
		obj->fromJson(value.dump());

    }

    const char *pARSE_LINE_ERRORKey = "PARSE_LINE_ERROR";

    if(object.has_key(pARSE_LINE_ERRORKey))
    {
        bourne::json value = object[pARSE_LINE_ERRORKey];




        CatalogsItemValidationDetails* obj = &pARSE_LINE_ERROR;
		obj->fromJson(value.dump());

    }

    const char *pINJOIN_CONTENT_UNSAFEKey = "PINJOIN_CONTENT_UNSAFE";

    if(object.has_key(pINJOIN_CONTENT_UNSAFEKey))
    {
        bourne::json value = object[pINJOIN_CONTENT_UNSAFEKey];




        CatalogsItemValidationDetails* obj = &pINJOIN_CONTENT_UNSAFE;
		obj->fromJson(value.dump());

    }

    const char *pRICE_CANNOT_BE_DETERMINEDKey = "PRICE_CANNOT_BE_DETERMINED";

    if(object.has_key(pRICE_CANNOT_BE_DETERMINEDKey))
    {
        bourne::json value = object[pRICE_CANNOT_BE_DETERMINEDKey];




        CatalogsItemValidationDetails* obj = &pRICE_CANNOT_BE_DETERMINED;
		obj->fromJson(value.dump());

    }

    const char *pRICE_MISSINGKey = "PRICE_MISSING";

    if(object.has_key(pRICE_MISSINGKey))
    {
        bourne::json value = object[pRICE_MISSINGKey];




        CatalogsItemValidationDetails* obj = &pRICE_MISSING;
		obj->fromJson(value.dump());

    }

    const char *pRODUCT_LINK_MISSINGKey = "PRODUCT_LINK_MISSING";

    if(object.has_key(pRODUCT_LINK_MISSINGKey))
    {
        bourne::json value = object[pRODUCT_LINK_MISSINGKey];




        CatalogsItemValidationDetails* obj = &pRODUCT_LINK_MISSING;
		obj->fromJson(value.dump());

    }

    const char *pRODUCT_PRICE_INVALIDKey = "PRODUCT_PRICE_INVALID";

    if(object.has_key(pRODUCT_PRICE_INVALIDKey))
    {
        bourne::json value = object[pRODUCT_PRICE_INVALIDKey];




        CatalogsItemValidationDetails* obj = &pRODUCT_PRICE_INVALID;
		obj->fromJson(value.dump());

    }

    const char *tITLE_MISSINGKey = "TITLE_MISSING";

    if(object.has_key(tITLE_MISSINGKey))
    {
        bourne::json value = object[tITLE_MISSINGKey];




        CatalogsItemValidationDetails* obj = &tITLE_MISSING;
		obj->fromJson(value.dump());

    }


}

bourne::json
CatalogsItemValidationErrors::toJson()
{
    bourne::json object = bourne::json::object();






	object["aDULT_INVALID"] = getADULTINVALID().toJson();






	object["aDWORDS_FORMAT_INVALID"] = getADWORDSFORMATINVALID().toJson();






	object["aVAILABILITY_INVALID"] = getAVAILABILITYINVALID().toJson();






	object["bLOCKLISTED_IMAGE_SIGNATURE"] = getBLOCKLISTEDIMAGESIGNATURE().toJson();






	object["dESCRIPTION_MISSING"] = getDESCRIPTIONMISSING().toJson();






	object["dUPLICATE_PRODUCTS"] = getDUPLICATEPRODUCTS().toJson();






	object["iMAGE_LINK_INVALID"] = getIMAGELINKINVALID().toJson();






	object["iMAGE_LINK_LENGTH_TOO_LONG"] = getIMAGELINKLENGTHTOOLONG().toJson();






	object["iMAGE_LINK_MISSING"] = getIMAGELINKMISSING().toJson();






	object["iNVALID_DOMAIN"] = getINVALIDDOMAIN().toJson();






	object["iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE"] = getITEMMAINIMAGEDOWNLOADFAILURE().toJson();






	object["iTEMID_MISSING"] = getITEMIDMISSING().toJson();






	object["lINK_FORMAT_INVALID"] = getLINKFORMATINVALID().toJson();






	object["lINK_LENGTH_TOO_LONG"] = getLINKLENGTHTOOLONG().toJson();






	object["lIST_PRICE_INVALID"] = getLISTPRICEINVALID().toJson();






	object["mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED"] = getMAXITEMSPERITEMGROUPEXCEEDED().toJson();






	object["pARSE_LINE_ERROR"] = getPARSELINEERROR().toJson();






	object["pINJOIN_CONTENT_UNSAFE"] = getPINJOINCONTENTUNSAFE().toJson();






	object["pRICE_CANNOT_BE_DETERMINED"] = getPRICECANNOTBEDETERMINED().toJson();






	object["pRICE_MISSING"] = getPRICEMISSING().toJson();






	object["pRODUCT_LINK_MISSING"] = getPRODUCTLINKMISSING().toJson();






	object["pRODUCT_PRICE_INVALID"] = getPRODUCTPRICEINVALID().toJson();






	object["tITLE_MISSING"] = getTITLEMISSING().toJson();


    return object;

}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getADULTINVALID()
{
	return aDULT_INVALID;
}

void
CatalogsItemValidationErrors::setADULTINVALID(CatalogsItemValidationDetails aDULT_INVALID)
{
	this->aDULT_INVALID = aDULT_INVALID;
}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getADWORDSFORMATINVALID()
{
	return aDWORDS_FORMAT_INVALID;
}

void
CatalogsItemValidationErrors::setADWORDSFORMATINVALID(CatalogsItemValidationDetails aDWORDS_FORMAT_INVALID)
{
	this->aDWORDS_FORMAT_INVALID = aDWORDS_FORMAT_INVALID;
}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getAVAILABILITYINVALID()
{
	return aVAILABILITY_INVALID;
}

void
CatalogsItemValidationErrors::setAVAILABILITYINVALID(CatalogsItemValidationDetails aVAILABILITY_INVALID)
{
	this->aVAILABILITY_INVALID = aVAILABILITY_INVALID;
}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getBLOCKLISTEDIMAGESIGNATURE()
{
	return bLOCKLISTED_IMAGE_SIGNATURE;
}

void
CatalogsItemValidationErrors::setBLOCKLISTEDIMAGESIGNATURE(CatalogsItemValidationDetails bLOCKLISTED_IMAGE_SIGNATURE)
{
	this->bLOCKLISTED_IMAGE_SIGNATURE = bLOCKLISTED_IMAGE_SIGNATURE;
}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getDESCRIPTIONMISSING()
{
	return dESCRIPTION_MISSING;
}

void
CatalogsItemValidationErrors::setDESCRIPTIONMISSING(CatalogsItemValidationDetails dESCRIPTION_MISSING)
{
	this->dESCRIPTION_MISSING = dESCRIPTION_MISSING;
}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getDUPLICATEPRODUCTS()
{
	return dUPLICATE_PRODUCTS;
}

void
CatalogsItemValidationErrors::setDUPLICATEPRODUCTS(CatalogsItemValidationDetails dUPLICATE_PRODUCTS)
{
	this->dUPLICATE_PRODUCTS = dUPLICATE_PRODUCTS;
}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getIMAGELINKINVALID()
{
	return iMAGE_LINK_INVALID;
}

void
CatalogsItemValidationErrors::setIMAGELINKINVALID(CatalogsItemValidationDetails iMAGE_LINK_INVALID)
{
	this->iMAGE_LINK_INVALID = iMAGE_LINK_INVALID;
}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getIMAGELINKLENGTHTOOLONG()
{
	return iMAGE_LINK_LENGTH_TOO_LONG;
}

void
CatalogsItemValidationErrors::setIMAGELINKLENGTHTOOLONG(CatalogsItemValidationDetails iMAGE_LINK_LENGTH_TOO_LONG)
{
	this->iMAGE_LINK_LENGTH_TOO_LONG = iMAGE_LINK_LENGTH_TOO_LONG;
}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getIMAGELINKMISSING()
{
	return iMAGE_LINK_MISSING;
}

void
CatalogsItemValidationErrors::setIMAGELINKMISSING(CatalogsItemValidationDetails iMAGE_LINK_MISSING)
{
	this->iMAGE_LINK_MISSING = iMAGE_LINK_MISSING;
}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getINVALIDDOMAIN()
{
	return iNVALID_DOMAIN;
}

void
CatalogsItemValidationErrors::setINVALIDDOMAIN(CatalogsItemValidationDetails iNVALID_DOMAIN)
{
	this->iNVALID_DOMAIN = iNVALID_DOMAIN;
}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getITEMMAINIMAGEDOWNLOADFAILURE()
{
	return iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE;
}

void
CatalogsItemValidationErrors::setITEMMAINIMAGEDOWNLOADFAILURE(CatalogsItemValidationDetails iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE)
{
	this->iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE = iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE;
}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getITEMIDMISSING()
{
	return iTEMID_MISSING;
}

void
CatalogsItemValidationErrors::setITEMIDMISSING(CatalogsItemValidationDetails iTEMID_MISSING)
{
	this->iTEMID_MISSING = iTEMID_MISSING;
}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getLINKFORMATINVALID()
{
	return lINK_FORMAT_INVALID;
}

void
CatalogsItemValidationErrors::setLINKFORMATINVALID(CatalogsItemValidationDetails lINK_FORMAT_INVALID)
{
	this->lINK_FORMAT_INVALID = lINK_FORMAT_INVALID;
}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getLINKLENGTHTOOLONG()
{
	return lINK_LENGTH_TOO_LONG;
}

void
CatalogsItemValidationErrors::setLINKLENGTHTOOLONG(CatalogsItemValidationDetails lINK_LENGTH_TOO_LONG)
{
	this->lINK_LENGTH_TOO_LONG = lINK_LENGTH_TOO_LONG;
}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getLISTPRICEINVALID()
{
	return lIST_PRICE_INVALID;
}

void
CatalogsItemValidationErrors::setLISTPRICEINVALID(CatalogsItemValidationDetails lIST_PRICE_INVALID)
{
	this->lIST_PRICE_INVALID = lIST_PRICE_INVALID;
}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getMAXITEMSPERITEMGROUPEXCEEDED()
{
	return mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;
}

void
CatalogsItemValidationErrors::setMAXITEMSPERITEMGROUPEXCEEDED(CatalogsItemValidationDetails mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED)
{
	this->mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED = mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;
}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getPARSELINEERROR()
{
	return pARSE_LINE_ERROR;
}

void
CatalogsItemValidationErrors::setPARSELINEERROR(CatalogsItemValidationDetails pARSE_LINE_ERROR)
{
	this->pARSE_LINE_ERROR = pARSE_LINE_ERROR;
}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getPINJOINCONTENTUNSAFE()
{
	return pINJOIN_CONTENT_UNSAFE;
}

void
CatalogsItemValidationErrors::setPINJOINCONTENTUNSAFE(CatalogsItemValidationDetails pINJOIN_CONTENT_UNSAFE)
{
	this->pINJOIN_CONTENT_UNSAFE = pINJOIN_CONTENT_UNSAFE;
}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getPRICECANNOTBEDETERMINED()
{
	return pRICE_CANNOT_BE_DETERMINED;
}

void
CatalogsItemValidationErrors::setPRICECANNOTBEDETERMINED(CatalogsItemValidationDetails pRICE_CANNOT_BE_DETERMINED)
{
	this->pRICE_CANNOT_BE_DETERMINED = pRICE_CANNOT_BE_DETERMINED;
}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getPRICEMISSING()
{
	return pRICE_MISSING;
}

void
CatalogsItemValidationErrors::setPRICEMISSING(CatalogsItemValidationDetails pRICE_MISSING)
{
	this->pRICE_MISSING = pRICE_MISSING;
}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getPRODUCTLINKMISSING()
{
	return pRODUCT_LINK_MISSING;
}

void
CatalogsItemValidationErrors::setPRODUCTLINKMISSING(CatalogsItemValidationDetails pRODUCT_LINK_MISSING)
{
	this->pRODUCT_LINK_MISSING = pRODUCT_LINK_MISSING;
}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getPRODUCTPRICEINVALID()
{
	return pRODUCT_PRICE_INVALID;
}

void
CatalogsItemValidationErrors::setPRODUCTPRICEINVALID(CatalogsItemValidationDetails pRODUCT_PRICE_INVALID)
{
	this->pRODUCT_PRICE_INVALID = pRODUCT_PRICE_INVALID;
}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getTITLEMISSING()
{
	return tITLE_MISSING;
}

void
CatalogsItemValidationErrors::setTITLEMISSING(CatalogsItemValidationDetails tITLE_MISSING)
{
	this->tITLE_MISSING = tITLE_MISSING;
}



