

#include "CatalogsFeedIngestionErrors.h"

using namespace Tiny;

CatalogsFeedIngestionErrors::CatalogsFeedIngestionErrors()
{
	aCCOUNT_FLAGGED = int(0);
	fETCH_GOOGLE_SHEET_NOT_SHARED = int(0);
	iMAGE_FILE_NOT_ACCESSIBLE = int(0);
	iMAGE_FILE_NOT_FOUND = int(0);
	iMAGE_INVALID_FILE = int(0);
	iMAGE_LEVEL_INTERNAL_ERROR = int(0);
	iMAGE_MALFORMED_URL = int(0);
	lARGE_PRODUCT_COUNT_DECREASE = int(0);
	lINE_LEVEL_INTERNAL_ERROR = int(0);
}

CatalogsFeedIngestionErrors::CatalogsFeedIngestionErrors(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsFeedIngestionErrors::~CatalogsFeedIngestionErrors()
{

}

void
CatalogsFeedIngestionErrors::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *aCCOUNT_FLAGGEDKey = "ACCOUNT_FLAGGED";

    if(object.has_key(aCCOUNT_FLAGGEDKey))
    {
        bourne::json value = object[aCCOUNT_FLAGGEDKey];



        jsonToValue(&aCCOUNT_FLAGGED, value, "int");


    }

    const char *fETCH_GOOGLE_SHEET_NOT_SHAREDKey = "FETCH_GOOGLE_SHEET_NOT_SHARED";

    if(object.has_key(fETCH_GOOGLE_SHEET_NOT_SHAREDKey))
    {
        bourne::json value = object[fETCH_GOOGLE_SHEET_NOT_SHAREDKey];



        jsonToValue(&fETCH_GOOGLE_SHEET_NOT_SHARED, value, "int");


    }

    const char *iMAGE_FILE_NOT_ACCESSIBLEKey = "IMAGE_FILE_NOT_ACCESSIBLE";

    if(object.has_key(iMAGE_FILE_NOT_ACCESSIBLEKey))
    {
        bourne::json value = object[iMAGE_FILE_NOT_ACCESSIBLEKey];



        jsonToValue(&iMAGE_FILE_NOT_ACCESSIBLE, value, "int");


    }

    const char *iMAGE_FILE_NOT_FOUNDKey = "IMAGE_FILE_NOT_FOUND";

    if(object.has_key(iMAGE_FILE_NOT_FOUNDKey))
    {
        bourne::json value = object[iMAGE_FILE_NOT_FOUNDKey];



        jsonToValue(&iMAGE_FILE_NOT_FOUND, value, "int");


    }

    const char *iMAGE_INVALID_FILEKey = "IMAGE_INVALID_FILE";

    if(object.has_key(iMAGE_INVALID_FILEKey))
    {
        bourne::json value = object[iMAGE_INVALID_FILEKey];



        jsonToValue(&iMAGE_INVALID_FILE, value, "int");


    }

    const char *iMAGE_LEVEL_INTERNAL_ERRORKey = "IMAGE_LEVEL_INTERNAL_ERROR";

    if(object.has_key(iMAGE_LEVEL_INTERNAL_ERRORKey))
    {
        bourne::json value = object[iMAGE_LEVEL_INTERNAL_ERRORKey];



        jsonToValue(&iMAGE_LEVEL_INTERNAL_ERROR, value, "int");


    }

    const char *iMAGE_MALFORMED_URLKey = "IMAGE_MALFORMED_URL";

    if(object.has_key(iMAGE_MALFORMED_URLKey))
    {
        bourne::json value = object[iMAGE_MALFORMED_URLKey];



        jsonToValue(&iMAGE_MALFORMED_URL, value, "int");


    }

    const char *lARGE_PRODUCT_COUNT_DECREASEKey = "LARGE_PRODUCT_COUNT_DECREASE";

    if(object.has_key(lARGE_PRODUCT_COUNT_DECREASEKey))
    {
        bourne::json value = object[lARGE_PRODUCT_COUNT_DECREASEKey];



        jsonToValue(&lARGE_PRODUCT_COUNT_DECREASE, value, "int");


    }

    const char *lINE_LEVEL_INTERNAL_ERRORKey = "LINE_LEVEL_INTERNAL_ERROR";

    if(object.has_key(lINE_LEVEL_INTERNAL_ERRORKey))
    {
        bourne::json value = object[lINE_LEVEL_INTERNAL_ERRORKey];



        jsonToValue(&lINE_LEVEL_INTERNAL_ERROR, value, "int");


    }


}

bourne::json
CatalogsFeedIngestionErrors::toJson()
{
    bourne::json object = bourne::json::object();





    object["aCCOUNT_FLAGGED"] = getACCOUNTFLAGGED();






    object["fETCH_GOOGLE_SHEET_NOT_SHARED"] = getFETCHGOOGLESHEETNOTSHARED();






    object["iMAGE_FILE_NOT_ACCESSIBLE"] = getIMAGEFILENOTACCESSIBLE();






    object["iMAGE_FILE_NOT_FOUND"] = getIMAGEFILENOTFOUND();






    object["iMAGE_INVALID_FILE"] = getIMAGEINVALIDFILE();






    object["iMAGE_LEVEL_INTERNAL_ERROR"] = getIMAGELEVELINTERNALERROR();






    object["iMAGE_MALFORMED_URL"] = getIMAGEMALFORMEDURL();






    object["lARGE_PRODUCT_COUNT_DECREASE"] = getLARGEPRODUCTCOUNTDECREASE();






    object["lINE_LEVEL_INTERNAL_ERROR"] = getLINELEVELINTERNALERROR();



    return object;

}

int
CatalogsFeedIngestionErrors::getACCOUNTFLAGGED()
{
	return aCCOUNT_FLAGGED;
}

void
CatalogsFeedIngestionErrors::setACCOUNTFLAGGED(int aCCOUNT_FLAGGED)
{
	this->aCCOUNT_FLAGGED = aCCOUNT_FLAGGED;
}

int
CatalogsFeedIngestionErrors::getFETCHGOOGLESHEETNOTSHARED()
{
	return fETCH_GOOGLE_SHEET_NOT_SHARED;
}

void
CatalogsFeedIngestionErrors::setFETCHGOOGLESHEETNOTSHARED(int fETCH_GOOGLE_SHEET_NOT_SHARED)
{
	this->fETCH_GOOGLE_SHEET_NOT_SHARED = fETCH_GOOGLE_SHEET_NOT_SHARED;
}

int
CatalogsFeedIngestionErrors::getIMAGEFILENOTACCESSIBLE()
{
	return iMAGE_FILE_NOT_ACCESSIBLE;
}

void
CatalogsFeedIngestionErrors::setIMAGEFILENOTACCESSIBLE(int iMAGE_FILE_NOT_ACCESSIBLE)
{
	this->iMAGE_FILE_NOT_ACCESSIBLE = iMAGE_FILE_NOT_ACCESSIBLE;
}

int
CatalogsFeedIngestionErrors::getIMAGEFILENOTFOUND()
{
	return iMAGE_FILE_NOT_FOUND;
}

void
CatalogsFeedIngestionErrors::setIMAGEFILENOTFOUND(int iMAGE_FILE_NOT_FOUND)
{
	this->iMAGE_FILE_NOT_FOUND = iMAGE_FILE_NOT_FOUND;
}

int
CatalogsFeedIngestionErrors::getIMAGEINVALIDFILE()
{
	return iMAGE_INVALID_FILE;
}

void
CatalogsFeedIngestionErrors::setIMAGEINVALIDFILE(int iMAGE_INVALID_FILE)
{
	this->iMAGE_INVALID_FILE = iMAGE_INVALID_FILE;
}

int
CatalogsFeedIngestionErrors::getIMAGELEVELINTERNALERROR()
{
	return iMAGE_LEVEL_INTERNAL_ERROR;
}

void
CatalogsFeedIngestionErrors::setIMAGELEVELINTERNALERROR(int iMAGE_LEVEL_INTERNAL_ERROR)
{
	this->iMAGE_LEVEL_INTERNAL_ERROR = iMAGE_LEVEL_INTERNAL_ERROR;
}

int
CatalogsFeedIngestionErrors::getIMAGEMALFORMEDURL()
{
	return iMAGE_MALFORMED_URL;
}

void
CatalogsFeedIngestionErrors::setIMAGEMALFORMEDURL(int iMAGE_MALFORMED_URL)
{
	this->iMAGE_MALFORMED_URL = iMAGE_MALFORMED_URL;
}

int
CatalogsFeedIngestionErrors::getLARGEPRODUCTCOUNTDECREASE()
{
	return lARGE_PRODUCT_COUNT_DECREASE;
}

void
CatalogsFeedIngestionErrors::setLARGEPRODUCTCOUNTDECREASE(int lARGE_PRODUCT_COUNT_DECREASE)
{
	this->lARGE_PRODUCT_COUNT_DECREASE = lARGE_PRODUCT_COUNT_DECREASE;
}

int
CatalogsFeedIngestionErrors::getLINELEVELINTERNALERROR()
{
	return lINE_LEVEL_INTERNAL_ERROR;
}

void
CatalogsFeedIngestionErrors::setLINELEVELINTERNALERROR(int lINE_LEVEL_INTERNAL_ERROR)
{
	this->lINE_LEVEL_INTERNAL_ERROR = lINE_LEVEL_INTERNAL_ERROR;
}



