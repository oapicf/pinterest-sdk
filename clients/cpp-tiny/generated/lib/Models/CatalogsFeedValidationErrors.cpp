

#include "CatalogsFeedValidationErrors.h"

using namespace Tiny;

CatalogsFeedValidationErrors::CatalogsFeedValidationErrors()
{
	aDULT_INVALID = int(0);
	aDWORDS_FORMAT_INVALID = int(0);
	aVAILABILITY_INVALID = int(0);
	bLOCKLISTED_IMAGE_SIGNATURE = int(0);
	dELIMITER_ERROR = int(0);
	dESCRIPTION_MISSING = int(0);
	dUPLICATE_PRODUCTS = int(0);
	eNCODING_ERROR = int(0);
	fEED_LENGTH_TOO_LONG = int(0);
	fEED_TOO_SMALL = int(0);
	fETCH_ERROR = int(0);
	fETCH_INACTIVE_FEED_ERROR = int(0);
	iMAGE_LINK_INVALID = int(0);
	iMAGE_LINK_LENGTH_TOO_LONG = int(0);
	iMAGE_LINK_MISSING = int(0);
	iNTERNAL_SERVICE_ERROR = int(0);
	iNVALID_DOMAIN = int(0);
	iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE = int(0);
	iTEMID_MISSING = int(0);
	lINK_FORMAT_INVALID = int(0);
	lINK_LENGTH_TOO_LONG = int(0);
	lIST_PRICE_INVALID = int(0);
	mALFORMED_XML = int(0);
	mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED = int(0);
	nO_VERIFIED_DOMAIN = int(0);
	pARSE_LINE_ERROR = int(0);
	pINJOIN_CONTENT_UNSAFE = int(0);
	pRICE_CANNOT_BE_DETERMINED = int(0);
	pRICE_MISSING = int(0);
	pRODUCT_LINK_MISSING = int(0);
	pRODUCT_PRICE_INVALID = int(0);
	rEQUIRED_COLUMNS_MISSING = int(0);
	tITLE_MISSING = int(0);
}

CatalogsFeedValidationErrors::CatalogsFeedValidationErrors(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsFeedValidationErrors::~CatalogsFeedValidationErrors()
{

}

void
CatalogsFeedValidationErrors::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *aDULT_INVALIDKey = "ADULT_INVALID";

    if(object.has_key(aDULT_INVALIDKey))
    {
        bourne::json value = object[aDULT_INVALIDKey];



        jsonToValue(&aDULT_INVALID, value, "int");


    }

    const char *aDWORDS_FORMAT_INVALIDKey = "ADWORDS_FORMAT_INVALID";

    if(object.has_key(aDWORDS_FORMAT_INVALIDKey))
    {
        bourne::json value = object[aDWORDS_FORMAT_INVALIDKey];



        jsonToValue(&aDWORDS_FORMAT_INVALID, value, "int");


    }

    const char *aVAILABILITY_INVALIDKey = "AVAILABILITY_INVALID";

    if(object.has_key(aVAILABILITY_INVALIDKey))
    {
        bourne::json value = object[aVAILABILITY_INVALIDKey];



        jsonToValue(&aVAILABILITY_INVALID, value, "int");


    }

    const char *bLOCKLISTED_IMAGE_SIGNATUREKey = "BLOCKLISTED_IMAGE_SIGNATURE";

    if(object.has_key(bLOCKLISTED_IMAGE_SIGNATUREKey))
    {
        bourne::json value = object[bLOCKLISTED_IMAGE_SIGNATUREKey];



        jsonToValue(&bLOCKLISTED_IMAGE_SIGNATURE, value, "int");


    }

    const char *dELIMITER_ERRORKey = "DELIMITER_ERROR";

    if(object.has_key(dELIMITER_ERRORKey))
    {
        bourne::json value = object[dELIMITER_ERRORKey];



        jsonToValue(&dELIMITER_ERROR, value, "int");


    }

    const char *dESCRIPTION_MISSINGKey = "DESCRIPTION_MISSING";

    if(object.has_key(dESCRIPTION_MISSINGKey))
    {
        bourne::json value = object[dESCRIPTION_MISSINGKey];



        jsonToValue(&dESCRIPTION_MISSING, value, "int");


    }

    const char *dUPLICATE_PRODUCTSKey = "DUPLICATE_PRODUCTS";

    if(object.has_key(dUPLICATE_PRODUCTSKey))
    {
        bourne::json value = object[dUPLICATE_PRODUCTSKey];



        jsonToValue(&dUPLICATE_PRODUCTS, value, "int");


    }

    const char *eNCODING_ERRORKey = "ENCODING_ERROR";

    if(object.has_key(eNCODING_ERRORKey))
    {
        bourne::json value = object[eNCODING_ERRORKey];



        jsonToValue(&eNCODING_ERROR, value, "int");


    }

    const char *fEED_LENGTH_TOO_LONGKey = "FEED_LENGTH_TOO_LONG";

    if(object.has_key(fEED_LENGTH_TOO_LONGKey))
    {
        bourne::json value = object[fEED_LENGTH_TOO_LONGKey];



        jsonToValue(&fEED_LENGTH_TOO_LONG, value, "int");


    }

    const char *fEED_TOO_SMALLKey = "FEED_TOO_SMALL";

    if(object.has_key(fEED_TOO_SMALLKey))
    {
        bourne::json value = object[fEED_TOO_SMALLKey];



        jsonToValue(&fEED_TOO_SMALL, value, "int");


    }

    const char *fETCH_ERRORKey = "FETCH_ERROR";

    if(object.has_key(fETCH_ERRORKey))
    {
        bourne::json value = object[fETCH_ERRORKey];



        jsonToValue(&fETCH_ERROR, value, "int");


    }

    const char *fETCH_INACTIVE_FEED_ERRORKey = "FETCH_INACTIVE_FEED_ERROR";

    if(object.has_key(fETCH_INACTIVE_FEED_ERRORKey))
    {
        bourne::json value = object[fETCH_INACTIVE_FEED_ERRORKey];



        jsonToValue(&fETCH_INACTIVE_FEED_ERROR, value, "int");


    }

    const char *iMAGE_LINK_INVALIDKey = "IMAGE_LINK_INVALID";

    if(object.has_key(iMAGE_LINK_INVALIDKey))
    {
        bourne::json value = object[iMAGE_LINK_INVALIDKey];



        jsonToValue(&iMAGE_LINK_INVALID, value, "int");


    }

    const char *iMAGE_LINK_LENGTH_TOO_LONGKey = "IMAGE_LINK_LENGTH_TOO_LONG";

    if(object.has_key(iMAGE_LINK_LENGTH_TOO_LONGKey))
    {
        bourne::json value = object[iMAGE_LINK_LENGTH_TOO_LONGKey];



        jsonToValue(&iMAGE_LINK_LENGTH_TOO_LONG, value, "int");


    }

    const char *iMAGE_LINK_MISSINGKey = "IMAGE_LINK_MISSING";

    if(object.has_key(iMAGE_LINK_MISSINGKey))
    {
        bourne::json value = object[iMAGE_LINK_MISSINGKey];



        jsonToValue(&iMAGE_LINK_MISSING, value, "int");


    }

    const char *iNTERNAL_SERVICE_ERRORKey = "INTERNAL_SERVICE_ERROR";

    if(object.has_key(iNTERNAL_SERVICE_ERRORKey))
    {
        bourne::json value = object[iNTERNAL_SERVICE_ERRORKey];



        jsonToValue(&iNTERNAL_SERVICE_ERROR, value, "int");


    }

    const char *iNVALID_DOMAINKey = "INVALID_DOMAIN";

    if(object.has_key(iNVALID_DOMAINKey))
    {
        bourne::json value = object[iNVALID_DOMAINKey];



        jsonToValue(&iNVALID_DOMAIN, value, "int");


    }

    const char *iTEM_MAIN_IMAGE_DOWNLOAD_FAILUREKey = "ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE";

    if(object.has_key(iTEM_MAIN_IMAGE_DOWNLOAD_FAILUREKey))
    {
        bourne::json value = object[iTEM_MAIN_IMAGE_DOWNLOAD_FAILUREKey];



        jsonToValue(&iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE, value, "int");


    }

    const char *iTEMID_MISSINGKey = "ITEMID_MISSING";

    if(object.has_key(iTEMID_MISSINGKey))
    {
        bourne::json value = object[iTEMID_MISSINGKey];



        jsonToValue(&iTEMID_MISSING, value, "int");


    }

    const char *lINK_FORMAT_INVALIDKey = "LINK_FORMAT_INVALID";

    if(object.has_key(lINK_FORMAT_INVALIDKey))
    {
        bourne::json value = object[lINK_FORMAT_INVALIDKey];



        jsonToValue(&lINK_FORMAT_INVALID, value, "int");


    }

    const char *lINK_LENGTH_TOO_LONGKey = "LINK_LENGTH_TOO_LONG";

    if(object.has_key(lINK_LENGTH_TOO_LONGKey))
    {
        bourne::json value = object[lINK_LENGTH_TOO_LONGKey];



        jsonToValue(&lINK_LENGTH_TOO_LONG, value, "int");


    }

    const char *lIST_PRICE_INVALIDKey = "LIST_PRICE_INVALID";

    if(object.has_key(lIST_PRICE_INVALIDKey))
    {
        bourne::json value = object[lIST_PRICE_INVALIDKey];



        jsonToValue(&lIST_PRICE_INVALID, value, "int");


    }

    const char *mALFORMED_XMLKey = "MALFORMED_XML";

    if(object.has_key(mALFORMED_XMLKey))
    {
        bourne::json value = object[mALFORMED_XMLKey];



        jsonToValue(&mALFORMED_XML, value, "int");


    }

    const char *mAX_ITEMS_PER_ITEM_GROUP_EXCEEDEDKey = "MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED";

    if(object.has_key(mAX_ITEMS_PER_ITEM_GROUP_EXCEEDEDKey))
    {
        bourne::json value = object[mAX_ITEMS_PER_ITEM_GROUP_EXCEEDEDKey];



        jsonToValue(&mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED, value, "int");


    }

    const char *nO_VERIFIED_DOMAINKey = "NO_VERIFIED_DOMAIN";

    if(object.has_key(nO_VERIFIED_DOMAINKey))
    {
        bourne::json value = object[nO_VERIFIED_DOMAINKey];



        jsonToValue(&nO_VERIFIED_DOMAIN, value, "int");


    }

    const char *pARSE_LINE_ERRORKey = "PARSE_LINE_ERROR";

    if(object.has_key(pARSE_LINE_ERRORKey))
    {
        bourne::json value = object[pARSE_LINE_ERRORKey];



        jsonToValue(&pARSE_LINE_ERROR, value, "int");


    }

    const char *pINJOIN_CONTENT_UNSAFEKey = "PINJOIN_CONTENT_UNSAFE";

    if(object.has_key(pINJOIN_CONTENT_UNSAFEKey))
    {
        bourne::json value = object[pINJOIN_CONTENT_UNSAFEKey];



        jsonToValue(&pINJOIN_CONTENT_UNSAFE, value, "int");


    }

    const char *pRICE_CANNOT_BE_DETERMINEDKey = "PRICE_CANNOT_BE_DETERMINED";

    if(object.has_key(pRICE_CANNOT_BE_DETERMINEDKey))
    {
        bourne::json value = object[pRICE_CANNOT_BE_DETERMINEDKey];



        jsonToValue(&pRICE_CANNOT_BE_DETERMINED, value, "int");


    }

    const char *pRICE_MISSINGKey = "PRICE_MISSING";

    if(object.has_key(pRICE_MISSINGKey))
    {
        bourne::json value = object[pRICE_MISSINGKey];



        jsonToValue(&pRICE_MISSING, value, "int");


    }

    const char *pRODUCT_LINK_MISSINGKey = "PRODUCT_LINK_MISSING";

    if(object.has_key(pRODUCT_LINK_MISSINGKey))
    {
        bourne::json value = object[pRODUCT_LINK_MISSINGKey];



        jsonToValue(&pRODUCT_LINK_MISSING, value, "int");


    }

    const char *pRODUCT_PRICE_INVALIDKey = "PRODUCT_PRICE_INVALID";

    if(object.has_key(pRODUCT_PRICE_INVALIDKey))
    {
        bourne::json value = object[pRODUCT_PRICE_INVALIDKey];



        jsonToValue(&pRODUCT_PRICE_INVALID, value, "int");


    }

    const char *rEQUIRED_COLUMNS_MISSINGKey = "REQUIRED_COLUMNS_MISSING";

    if(object.has_key(rEQUIRED_COLUMNS_MISSINGKey))
    {
        bourne::json value = object[rEQUIRED_COLUMNS_MISSINGKey];



        jsonToValue(&rEQUIRED_COLUMNS_MISSING, value, "int");


    }

    const char *tITLE_MISSINGKey = "TITLE_MISSING";

    if(object.has_key(tITLE_MISSINGKey))
    {
        bourne::json value = object[tITLE_MISSINGKey];



        jsonToValue(&tITLE_MISSING, value, "int");


    }


}

bourne::json
CatalogsFeedValidationErrors::toJson()
{
    bourne::json object = bourne::json::object();





    object["aDULT_INVALID"] = getADULTINVALID();






    object["aDWORDS_FORMAT_INVALID"] = getADWORDSFORMATINVALID();






    object["aVAILABILITY_INVALID"] = getAVAILABILITYINVALID();






    object["bLOCKLISTED_IMAGE_SIGNATURE"] = getBLOCKLISTEDIMAGESIGNATURE();






    object["dELIMITER_ERROR"] = getDELIMITERERROR();






    object["dESCRIPTION_MISSING"] = getDESCRIPTIONMISSING();






    object["dUPLICATE_PRODUCTS"] = getDUPLICATEPRODUCTS();






    object["eNCODING_ERROR"] = getENCODINGERROR();






    object["fEED_LENGTH_TOO_LONG"] = getFEEDLENGTHTOOLONG();






    object["fEED_TOO_SMALL"] = getFEEDTOOSMALL();






    object["fETCH_ERROR"] = getFETCHERROR();






    object["fETCH_INACTIVE_FEED_ERROR"] = getFETCHINACTIVEFEEDERROR();






    object["iMAGE_LINK_INVALID"] = getIMAGELINKINVALID();






    object["iMAGE_LINK_LENGTH_TOO_LONG"] = getIMAGELINKLENGTHTOOLONG();






    object["iMAGE_LINK_MISSING"] = getIMAGELINKMISSING();






    object["iNTERNAL_SERVICE_ERROR"] = getINTERNALSERVICEERROR();






    object["iNVALID_DOMAIN"] = getINVALIDDOMAIN();






    object["iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE"] = getITEMMAINIMAGEDOWNLOADFAILURE();






    object["iTEMID_MISSING"] = getITEMIDMISSING();






    object["lINK_FORMAT_INVALID"] = getLINKFORMATINVALID();






    object["lINK_LENGTH_TOO_LONG"] = getLINKLENGTHTOOLONG();






    object["lIST_PRICE_INVALID"] = getLISTPRICEINVALID();






    object["mALFORMED_XML"] = getMALFORMEDXML();






    object["mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED"] = getMAXITEMSPERITEMGROUPEXCEEDED();






    object["nO_VERIFIED_DOMAIN"] = getNOVERIFIEDDOMAIN();






    object["pARSE_LINE_ERROR"] = getPARSELINEERROR();






    object["pINJOIN_CONTENT_UNSAFE"] = getPINJOINCONTENTUNSAFE();






    object["pRICE_CANNOT_BE_DETERMINED"] = getPRICECANNOTBEDETERMINED();






    object["pRICE_MISSING"] = getPRICEMISSING();






    object["pRODUCT_LINK_MISSING"] = getPRODUCTLINKMISSING();






    object["pRODUCT_PRICE_INVALID"] = getPRODUCTPRICEINVALID();






    object["rEQUIRED_COLUMNS_MISSING"] = getREQUIREDCOLUMNSMISSING();






    object["tITLE_MISSING"] = getTITLEMISSING();



    return object;

}

int
CatalogsFeedValidationErrors::getADULTINVALID()
{
	return aDULT_INVALID;
}

void
CatalogsFeedValidationErrors::setADULTINVALID(int  aDULT_INVALID)
{
	this->aDULT_INVALID = aDULT_INVALID;
}

int
CatalogsFeedValidationErrors::getADWORDSFORMATINVALID()
{
	return aDWORDS_FORMAT_INVALID;
}

void
CatalogsFeedValidationErrors::setADWORDSFORMATINVALID(int  aDWORDS_FORMAT_INVALID)
{
	this->aDWORDS_FORMAT_INVALID = aDWORDS_FORMAT_INVALID;
}

int
CatalogsFeedValidationErrors::getAVAILABILITYINVALID()
{
	return aVAILABILITY_INVALID;
}

void
CatalogsFeedValidationErrors::setAVAILABILITYINVALID(int  aVAILABILITY_INVALID)
{
	this->aVAILABILITY_INVALID = aVAILABILITY_INVALID;
}

int
CatalogsFeedValidationErrors::getBLOCKLISTEDIMAGESIGNATURE()
{
	return bLOCKLISTED_IMAGE_SIGNATURE;
}

void
CatalogsFeedValidationErrors::setBLOCKLISTEDIMAGESIGNATURE(int  bLOCKLISTED_IMAGE_SIGNATURE)
{
	this->bLOCKLISTED_IMAGE_SIGNATURE = bLOCKLISTED_IMAGE_SIGNATURE;
}

int
CatalogsFeedValidationErrors::getDELIMITERERROR()
{
	return dELIMITER_ERROR;
}

void
CatalogsFeedValidationErrors::setDELIMITERERROR(int  dELIMITER_ERROR)
{
	this->dELIMITER_ERROR = dELIMITER_ERROR;
}

int
CatalogsFeedValidationErrors::getDESCRIPTIONMISSING()
{
	return dESCRIPTION_MISSING;
}

void
CatalogsFeedValidationErrors::setDESCRIPTIONMISSING(int  dESCRIPTION_MISSING)
{
	this->dESCRIPTION_MISSING = dESCRIPTION_MISSING;
}

int
CatalogsFeedValidationErrors::getDUPLICATEPRODUCTS()
{
	return dUPLICATE_PRODUCTS;
}

void
CatalogsFeedValidationErrors::setDUPLICATEPRODUCTS(int  dUPLICATE_PRODUCTS)
{
	this->dUPLICATE_PRODUCTS = dUPLICATE_PRODUCTS;
}

int
CatalogsFeedValidationErrors::getENCODINGERROR()
{
	return eNCODING_ERROR;
}

void
CatalogsFeedValidationErrors::setENCODINGERROR(int  eNCODING_ERROR)
{
	this->eNCODING_ERROR = eNCODING_ERROR;
}

int
CatalogsFeedValidationErrors::getFEEDLENGTHTOOLONG()
{
	return fEED_LENGTH_TOO_LONG;
}

void
CatalogsFeedValidationErrors::setFEEDLENGTHTOOLONG(int  fEED_LENGTH_TOO_LONG)
{
	this->fEED_LENGTH_TOO_LONG = fEED_LENGTH_TOO_LONG;
}

int
CatalogsFeedValidationErrors::getFEEDTOOSMALL()
{
	return fEED_TOO_SMALL;
}

void
CatalogsFeedValidationErrors::setFEEDTOOSMALL(int  fEED_TOO_SMALL)
{
	this->fEED_TOO_SMALL = fEED_TOO_SMALL;
}

int
CatalogsFeedValidationErrors::getFETCHERROR()
{
	return fETCH_ERROR;
}

void
CatalogsFeedValidationErrors::setFETCHERROR(int  fETCH_ERROR)
{
	this->fETCH_ERROR = fETCH_ERROR;
}

int
CatalogsFeedValidationErrors::getFETCHINACTIVEFEEDERROR()
{
	return fETCH_INACTIVE_FEED_ERROR;
}

void
CatalogsFeedValidationErrors::setFETCHINACTIVEFEEDERROR(int  fETCH_INACTIVE_FEED_ERROR)
{
	this->fETCH_INACTIVE_FEED_ERROR = fETCH_INACTIVE_FEED_ERROR;
}

int
CatalogsFeedValidationErrors::getIMAGELINKINVALID()
{
	return iMAGE_LINK_INVALID;
}

void
CatalogsFeedValidationErrors::setIMAGELINKINVALID(int  iMAGE_LINK_INVALID)
{
	this->iMAGE_LINK_INVALID = iMAGE_LINK_INVALID;
}

int
CatalogsFeedValidationErrors::getIMAGELINKLENGTHTOOLONG()
{
	return iMAGE_LINK_LENGTH_TOO_LONG;
}

void
CatalogsFeedValidationErrors::setIMAGELINKLENGTHTOOLONG(int  iMAGE_LINK_LENGTH_TOO_LONG)
{
	this->iMAGE_LINK_LENGTH_TOO_LONG = iMAGE_LINK_LENGTH_TOO_LONG;
}

int
CatalogsFeedValidationErrors::getIMAGELINKMISSING()
{
	return iMAGE_LINK_MISSING;
}

void
CatalogsFeedValidationErrors::setIMAGELINKMISSING(int  iMAGE_LINK_MISSING)
{
	this->iMAGE_LINK_MISSING = iMAGE_LINK_MISSING;
}

int
CatalogsFeedValidationErrors::getINTERNALSERVICEERROR()
{
	return iNTERNAL_SERVICE_ERROR;
}

void
CatalogsFeedValidationErrors::setINTERNALSERVICEERROR(int  iNTERNAL_SERVICE_ERROR)
{
	this->iNTERNAL_SERVICE_ERROR = iNTERNAL_SERVICE_ERROR;
}

int
CatalogsFeedValidationErrors::getINVALIDDOMAIN()
{
	return iNVALID_DOMAIN;
}

void
CatalogsFeedValidationErrors::setINVALIDDOMAIN(int  iNVALID_DOMAIN)
{
	this->iNVALID_DOMAIN = iNVALID_DOMAIN;
}

int
CatalogsFeedValidationErrors::getITEMMAINIMAGEDOWNLOADFAILURE()
{
	return iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE;
}

void
CatalogsFeedValidationErrors::setITEMMAINIMAGEDOWNLOADFAILURE(int  iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE)
{
	this->iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE = iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE;
}

int
CatalogsFeedValidationErrors::getITEMIDMISSING()
{
	return iTEMID_MISSING;
}

void
CatalogsFeedValidationErrors::setITEMIDMISSING(int  iTEMID_MISSING)
{
	this->iTEMID_MISSING = iTEMID_MISSING;
}

int
CatalogsFeedValidationErrors::getLINKFORMATINVALID()
{
	return lINK_FORMAT_INVALID;
}

void
CatalogsFeedValidationErrors::setLINKFORMATINVALID(int  lINK_FORMAT_INVALID)
{
	this->lINK_FORMAT_INVALID = lINK_FORMAT_INVALID;
}

int
CatalogsFeedValidationErrors::getLINKLENGTHTOOLONG()
{
	return lINK_LENGTH_TOO_LONG;
}

void
CatalogsFeedValidationErrors::setLINKLENGTHTOOLONG(int  lINK_LENGTH_TOO_LONG)
{
	this->lINK_LENGTH_TOO_LONG = lINK_LENGTH_TOO_LONG;
}

int
CatalogsFeedValidationErrors::getLISTPRICEINVALID()
{
	return lIST_PRICE_INVALID;
}

void
CatalogsFeedValidationErrors::setLISTPRICEINVALID(int  lIST_PRICE_INVALID)
{
	this->lIST_PRICE_INVALID = lIST_PRICE_INVALID;
}

int
CatalogsFeedValidationErrors::getMALFORMEDXML()
{
	return mALFORMED_XML;
}

void
CatalogsFeedValidationErrors::setMALFORMEDXML(int  mALFORMED_XML)
{
	this->mALFORMED_XML = mALFORMED_XML;
}

int
CatalogsFeedValidationErrors::getMAXITEMSPERITEMGROUPEXCEEDED()
{
	return mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;
}

void
CatalogsFeedValidationErrors::setMAXITEMSPERITEMGROUPEXCEEDED(int  mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED)
{
	this->mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED = mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;
}

int
CatalogsFeedValidationErrors::getNOVERIFIEDDOMAIN()
{
	return nO_VERIFIED_DOMAIN;
}

void
CatalogsFeedValidationErrors::setNOVERIFIEDDOMAIN(int  nO_VERIFIED_DOMAIN)
{
	this->nO_VERIFIED_DOMAIN = nO_VERIFIED_DOMAIN;
}

int
CatalogsFeedValidationErrors::getPARSELINEERROR()
{
	return pARSE_LINE_ERROR;
}

void
CatalogsFeedValidationErrors::setPARSELINEERROR(int  pARSE_LINE_ERROR)
{
	this->pARSE_LINE_ERROR = pARSE_LINE_ERROR;
}

int
CatalogsFeedValidationErrors::getPINJOINCONTENTUNSAFE()
{
	return pINJOIN_CONTENT_UNSAFE;
}

void
CatalogsFeedValidationErrors::setPINJOINCONTENTUNSAFE(int  pINJOIN_CONTENT_UNSAFE)
{
	this->pINJOIN_CONTENT_UNSAFE = pINJOIN_CONTENT_UNSAFE;
}

int
CatalogsFeedValidationErrors::getPRICECANNOTBEDETERMINED()
{
	return pRICE_CANNOT_BE_DETERMINED;
}

void
CatalogsFeedValidationErrors::setPRICECANNOTBEDETERMINED(int  pRICE_CANNOT_BE_DETERMINED)
{
	this->pRICE_CANNOT_BE_DETERMINED = pRICE_CANNOT_BE_DETERMINED;
}

int
CatalogsFeedValidationErrors::getPRICEMISSING()
{
	return pRICE_MISSING;
}

void
CatalogsFeedValidationErrors::setPRICEMISSING(int  pRICE_MISSING)
{
	this->pRICE_MISSING = pRICE_MISSING;
}

int
CatalogsFeedValidationErrors::getPRODUCTLINKMISSING()
{
	return pRODUCT_LINK_MISSING;
}

void
CatalogsFeedValidationErrors::setPRODUCTLINKMISSING(int  pRODUCT_LINK_MISSING)
{
	this->pRODUCT_LINK_MISSING = pRODUCT_LINK_MISSING;
}

int
CatalogsFeedValidationErrors::getPRODUCTPRICEINVALID()
{
	return pRODUCT_PRICE_INVALID;
}

void
CatalogsFeedValidationErrors::setPRODUCTPRICEINVALID(int  pRODUCT_PRICE_INVALID)
{
	this->pRODUCT_PRICE_INVALID = pRODUCT_PRICE_INVALID;
}

int
CatalogsFeedValidationErrors::getREQUIREDCOLUMNSMISSING()
{
	return rEQUIRED_COLUMNS_MISSING;
}

void
CatalogsFeedValidationErrors::setREQUIREDCOLUMNSMISSING(int  rEQUIRED_COLUMNS_MISSING)
{
	this->rEQUIRED_COLUMNS_MISSING = rEQUIRED_COLUMNS_MISSING;
}

int
CatalogsFeedValidationErrors::getTITLEMISSING()
{
	return tITLE_MISSING;
}

void
CatalogsFeedValidationErrors::setTITLEMISSING(int  tITLE_MISSING)
{
	this->tITLE_MISSING = tITLE_MISSING;
}



