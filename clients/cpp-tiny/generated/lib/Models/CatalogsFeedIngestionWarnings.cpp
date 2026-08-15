

#include "CatalogsFeedIngestionWarnings.h"

using namespace Tiny;

CatalogsFeedIngestionWarnings::CatalogsFeedIngestionWarnings()
{
	aD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR = int(0);
	aD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR = int(0);
	aD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE = int(0);
	aD_IMAGE_DOWNLOAD_FILE_NOT_FOUND = int(0);
	aD_IMAGE_DOWNLOAD_HTTP_STATUS_400 = int(0);
	aD_IMAGE_DOWNLOAD_HTTP_STATUS_403 = int(0);
	aD_IMAGE_DOWNLOAD_HTTP_STATUS_404 = int(0);
	aD_IMAGE_DOWNLOAD_HTTP_STATUS_405 = int(0);
	aD_IMAGE_DOWNLOAD_HTTP_STATUS_410 = int(0);
	aD_IMAGE_DOWNLOAD_HTTP_STATUS_429 = int(0);
	aD_IMAGE_DOWNLOAD_HTTP_STATUS_500 = int(0);
	aD_IMAGE_DOWNLOAD_HTTP_STATUS_502 = int(0);
	aD_IMAGE_DOWNLOAD_HTTP_STATUS_503 = int(0);
	aD_IMAGE_DOWNLOAD_HTTP_STATUS_504 = int(0);
	aD_IMAGE_DOWNLOAD_HTTP_STATUS_507 = int(0);
	aD_IMAGE_DOWNLOAD_HTTP_STATUS_508 = int(0);
	aD_IMAGE_DOWNLOAD_HTTP_STATUS_520 = int(0);
	aD_IMAGE_DOWNLOAD_HTTP_STATUS_521 = int(0);
	aD_IMAGE_DOWNLOAD_HTTP_STATUS_522 = int(0);
	aD_IMAGE_DOWNLOAD_HTTP_STATUS_525 = int(0);
	aD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR = int(0);
	aD_IMAGE_DOWNLOAD_INTERNAL_ERROR = int(0);
	aD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD = int(0);
	aD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL = int(0);
	aD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED = int(0);
	aD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED = int(0);
	aD_IMAGE_DOWNLOAD_INVALID_FILE = int(0);
	aD_IMAGE_DOWNLOAD_SITE_ERROR = int(0);
	aD_IMAGE_DOWNLOAD_SITE_TIMEOUT = int(0);
	aD_IMAGE_DOWNLOAD_SSL_ERROR = int(0);
	aD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR = int(0);
	aD_IMAGE_PROCESSING_EMPTY_FILE = int(0);
	aD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL = int(0);
	aD_IMAGE_PROCESSING_TOO_MANY_PIXELS = int(0);
	aD_IMAGE_PROCESSING_TYPE_MISMATCH = int(0);
	aD_IMAGE_PROCESSING_WIDTH_TOO_SMALL = int(0);
	aD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR = int(0);
	aD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR = int(0);
	aD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE = int(0);
	aD_VIDEO_DOWNLOAD_FILE_NOT_FOUND = int(0);
	aD_VIDEO_DOWNLOAD_HTTP_STATUS_400 = int(0);
	aD_VIDEO_DOWNLOAD_HTTP_STATUS_403 = int(0);
	aD_VIDEO_DOWNLOAD_HTTP_STATUS_404 = int(0);
	aD_VIDEO_DOWNLOAD_HTTP_STATUS_405 = int(0);
	aD_VIDEO_DOWNLOAD_HTTP_STATUS_410 = int(0);
	aD_VIDEO_DOWNLOAD_HTTP_STATUS_429 = int(0);
	aD_VIDEO_DOWNLOAD_HTTP_STATUS_500 = int(0);
	aD_VIDEO_DOWNLOAD_HTTP_STATUS_502 = int(0);
	aD_VIDEO_DOWNLOAD_HTTP_STATUS_503 = int(0);
	aD_VIDEO_DOWNLOAD_HTTP_STATUS_504 = int(0);
	aD_VIDEO_DOWNLOAD_HTTP_STATUS_507 = int(0);
	aD_VIDEO_DOWNLOAD_HTTP_STATUS_508 = int(0);
	aD_VIDEO_DOWNLOAD_HTTP_STATUS_520 = int(0);
	aD_VIDEO_DOWNLOAD_HTTP_STATUS_521 = int(0);
	aD_VIDEO_DOWNLOAD_HTTP_STATUS_522 = int(0);
	aD_VIDEO_DOWNLOAD_HTTP_STATUS_525 = int(0);
	aD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR = int(0);
	aD_VIDEO_DOWNLOAD_INTERNAL_ERROR = int(0);
	aD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD = int(0);
	aD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL = int(0);
	aD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED = int(0);
	aD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED = int(0);
	aD_VIDEO_DOWNLOAD_INVALID_FILE = int(0);
	aD_VIDEO_DOWNLOAD_SITE_ERROR = int(0);
	aD_VIDEO_DOWNLOAD_SITE_TIMEOUT = int(0);
	aD_VIDEO_DOWNLOAD_SSL_ERROR = int(0);
	aD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR = int(0);
	aD_VIDEO_LENGTH_TOO_SHORT = int(0);
	aD_VIDEO_PROCESSING_EMPTY_FILE = int(0);
	aD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL = int(0);
	aD_VIDEO_PROCESSING_TOO_MANY_PIXELS = int(0);
	aD_VIDEO_PROCESSING_TYPE_MISMATCH = int(0);
	aD_VIDEO_PROCESSING_WIDTH_TOO_SMALL = int(0);
	aDDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE = int(0);
	aDDITIONAL_IMAGE_FILE_NOT_FOUND = int(0);
	aDDITIONAL_IMAGE_INVALID_FILE = int(0);
	aDDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR = int(0);
	aDDITIONAL_IMAGE_MALFORMED_URL = int(0);
	fETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT = int(0);
	hOTEL_PRICE_HEADER_IS_PRESENT = int(0);
	vIDEO_DOWNLOAD_VIDEO_TOO_SHORT = int(0);
	vIDEO_FILE_NOT_ACCESSIBLE = int(0);
	vIDEO_FILE_NOT_FOUND = int(0);
	vIDEO_INVALID_FILE = int(0);
	vIDEO_LEVEL_INTERNAL_ERROR = int(0);
	vIDEO_MALFORMED_URL = int(0);
}

CatalogsFeedIngestionWarnings::CatalogsFeedIngestionWarnings(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsFeedIngestionWarnings::~CatalogsFeedIngestionWarnings()
{

}

void
CatalogsFeedIngestionWarnings::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *aD_IMAGE_DOWNLOAD_CONTENT_READ_ERRORKey = "AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR";

    if(object.has_key(aD_IMAGE_DOWNLOAD_CONTENT_READ_ERRORKey))
    {
        bourne::json value = object[aD_IMAGE_DOWNLOAD_CONTENT_READ_ERRORKey];



        jsonToValue(&aD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR, value, "int");


    }

    const char *aD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERRORKey = "AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR";

    if(object.has_key(aD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERRORKey))
    {
        bourne::json value = object[aD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERRORKey];



        jsonToValue(&aD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR, value, "int");


    }

    const char *aD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLEKey = "AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE";

    if(object.has_key(aD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLEKey))
    {
        bourne::json value = object[aD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLEKey];



        jsonToValue(&aD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE, value, "int");


    }

    const char *aD_IMAGE_DOWNLOAD_FILE_NOT_FOUNDKey = "AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND";

    if(object.has_key(aD_IMAGE_DOWNLOAD_FILE_NOT_FOUNDKey))
    {
        bourne::json value = object[aD_IMAGE_DOWNLOAD_FILE_NOT_FOUNDKey];



        jsonToValue(&aD_IMAGE_DOWNLOAD_FILE_NOT_FOUND, value, "int");


    }

    const char *aD_IMAGE_DOWNLOAD_HTTP_STATUS_400Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_400";

    if(object.has_key(aD_IMAGE_DOWNLOAD_HTTP_STATUS_400Key))
    {
        bourne::json value = object[aD_IMAGE_DOWNLOAD_HTTP_STATUS_400Key];



        jsonToValue(&aD_IMAGE_DOWNLOAD_HTTP_STATUS_400, value, "int");


    }

    const char *aD_IMAGE_DOWNLOAD_HTTP_STATUS_403Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_403";

    if(object.has_key(aD_IMAGE_DOWNLOAD_HTTP_STATUS_403Key))
    {
        bourne::json value = object[aD_IMAGE_DOWNLOAD_HTTP_STATUS_403Key];



        jsonToValue(&aD_IMAGE_DOWNLOAD_HTTP_STATUS_403, value, "int");


    }

    const char *aD_IMAGE_DOWNLOAD_HTTP_STATUS_404Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_404";

    if(object.has_key(aD_IMAGE_DOWNLOAD_HTTP_STATUS_404Key))
    {
        bourne::json value = object[aD_IMAGE_DOWNLOAD_HTTP_STATUS_404Key];



        jsonToValue(&aD_IMAGE_DOWNLOAD_HTTP_STATUS_404, value, "int");


    }

    const char *aD_IMAGE_DOWNLOAD_HTTP_STATUS_405Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_405";

    if(object.has_key(aD_IMAGE_DOWNLOAD_HTTP_STATUS_405Key))
    {
        bourne::json value = object[aD_IMAGE_DOWNLOAD_HTTP_STATUS_405Key];



        jsonToValue(&aD_IMAGE_DOWNLOAD_HTTP_STATUS_405, value, "int");


    }

    const char *aD_IMAGE_DOWNLOAD_HTTP_STATUS_410Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_410";

    if(object.has_key(aD_IMAGE_DOWNLOAD_HTTP_STATUS_410Key))
    {
        bourne::json value = object[aD_IMAGE_DOWNLOAD_HTTP_STATUS_410Key];



        jsonToValue(&aD_IMAGE_DOWNLOAD_HTTP_STATUS_410, value, "int");


    }

    const char *aD_IMAGE_DOWNLOAD_HTTP_STATUS_429Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_429";

    if(object.has_key(aD_IMAGE_DOWNLOAD_HTTP_STATUS_429Key))
    {
        bourne::json value = object[aD_IMAGE_DOWNLOAD_HTTP_STATUS_429Key];



        jsonToValue(&aD_IMAGE_DOWNLOAD_HTTP_STATUS_429, value, "int");


    }

    const char *aD_IMAGE_DOWNLOAD_HTTP_STATUS_500Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_500";

    if(object.has_key(aD_IMAGE_DOWNLOAD_HTTP_STATUS_500Key))
    {
        bourne::json value = object[aD_IMAGE_DOWNLOAD_HTTP_STATUS_500Key];



        jsonToValue(&aD_IMAGE_DOWNLOAD_HTTP_STATUS_500, value, "int");


    }

    const char *aD_IMAGE_DOWNLOAD_HTTP_STATUS_502Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_502";

    if(object.has_key(aD_IMAGE_DOWNLOAD_HTTP_STATUS_502Key))
    {
        bourne::json value = object[aD_IMAGE_DOWNLOAD_HTTP_STATUS_502Key];



        jsonToValue(&aD_IMAGE_DOWNLOAD_HTTP_STATUS_502, value, "int");


    }

    const char *aD_IMAGE_DOWNLOAD_HTTP_STATUS_503Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_503";

    if(object.has_key(aD_IMAGE_DOWNLOAD_HTTP_STATUS_503Key))
    {
        bourne::json value = object[aD_IMAGE_DOWNLOAD_HTTP_STATUS_503Key];



        jsonToValue(&aD_IMAGE_DOWNLOAD_HTTP_STATUS_503, value, "int");


    }

    const char *aD_IMAGE_DOWNLOAD_HTTP_STATUS_504Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_504";

    if(object.has_key(aD_IMAGE_DOWNLOAD_HTTP_STATUS_504Key))
    {
        bourne::json value = object[aD_IMAGE_DOWNLOAD_HTTP_STATUS_504Key];



        jsonToValue(&aD_IMAGE_DOWNLOAD_HTTP_STATUS_504, value, "int");


    }

    const char *aD_IMAGE_DOWNLOAD_HTTP_STATUS_507Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_507";

    if(object.has_key(aD_IMAGE_DOWNLOAD_HTTP_STATUS_507Key))
    {
        bourne::json value = object[aD_IMAGE_DOWNLOAD_HTTP_STATUS_507Key];



        jsonToValue(&aD_IMAGE_DOWNLOAD_HTTP_STATUS_507, value, "int");


    }

    const char *aD_IMAGE_DOWNLOAD_HTTP_STATUS_508Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_508";

    if(object.has_key(aD_IMAGE_DOWNLOAD_HTTP_STATUS_508Key))
    {
        bourne::json value = object[aD_IMAGE_DOWNLOAD_HTTP_STATUS_508Key];



        jsonToValue(&aD_IMAGE_DOWNLOAD_HTTP_STATUS_508, value, "int");


    }

    const char *aD_IMAGE_DOWNLOAD_HTTP_STATUS_520Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_520";

    if(object.has_key(aD_IMAGE_DOWNLOAD_HTTP_STATUS_520Key))
    {
        bourne::json value = object[aD_IMAGE_DOWNLOAD_HTTP_STATUS_520Key];



        jsonToValue(&aD_IMAGE_DOWNLOAD_HTTP_STATUS_520, value, "int");


    }

    const char *aD_IMAGE_DOWNLOAD_HTTP_STATUS_521Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_521";

    if(object.has_key(aD_IMAGE_DOWNLOAD_HTTP_STATUS_521Key))
    {
        bourne::json value = object[aD_IMAGE_DOWNLOAD_HTTP_STATUS_521Key];



        jsonToValue(&aD_IMAGE_DOWNLOAD_HTTP_STATUS_521, value, "int");


    }

    const char *aD_IMAGE_DOWNLOAD_HTTP_STATUS_522Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_522";

    if(object.has_key(aD_IMAGE_DOWNLOAD_HTTP_STATUS_522Key))
    {
        bourne::json value = object[aD_IMAGE_DOWNLOAD_HTTP_STATUS_522Key];



        jsonToValue(&aD_IMAGE_DOWNLOAD_HTTP_STATUS_522, value, "int");


    }

    const char *aD_IMAGE_DOWNLOAD_HTTP_STATUS_525Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_525";

    if(object.has_key(aD_IMAGE_DOWNLOAD_HTTP_STATUS_525Key))
    {
        bourne::json value = object[aD_IMAGE_DOWNLOAD_HTTP_STATUS_525Key];



        jsonToValue(&aD_IMAGE_DOWNLOAD_HTTP_STATUS_525, value, "int");


    }

    const char *aD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERRORKey = "AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR";

    if(object.has_key(aD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERRORKey))
    {
        bourne::json value = object[aD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERRORKey];



        jsonToValue(&aD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR, value, "int");


    }

    const char *aD_IMAGE_DOWNLOAD_INTERNAL_ERRORKey = "AD_IMAGE_DOWNLOAD_INTERNAL_ERROR";

    if(object.has_key(aD_IMAGE_DOWNLOAD_INTERNAL_ERRORKey))
    {
        bourne::json value = object[aD_IMAGE_DOWNLOAD_INTERNAL_ERRORKey];



        jsonToValue(&aD_IMAGE_DOWNLOAD_INTERNAL_ERROR, value, "int");


    }

    const char *aD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOADKey = "AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD";

    if(object.has_key(aD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOADKey))
    {
        bourne::json value = object[aD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOADKey];



        jsonToValue(&aD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD, value, "int");


    }

    const char *aD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URLKey = "AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL";

    if(object.has_key(aD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URLKey))
    {
        bourne::json value = object[aD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URLKey];



        jsonToValue(&aD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL, value, "int");


    }

    const char *aD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITEDKey = "AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED";

    if(object.has_key(aD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITEDKey))
    {
        bourne::json value = object[aD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITEDKey];



        jsonToValue(&aD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED, value, "int");


    }

    const char *aD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIREDKey = "AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED";

    if(object.has_key(aD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIREDKey))
    {
        bourne::json value = object[aD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIREDKey];



        jsonToValue(&aD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED, value, "int");


    }

    const char *aD_IMAGE_DOWNLOAD_INVALID_FILEKey = "AD_IMAGE_DOWNLOAD_INVALID_FILE";

    if(object.has_key(aD_IMAGE_DOWNLOAD_INVALID_FILEKey))
    {
        bourne::json value = object[aD_IMAGE_DOWNLOAD_INVALID_FILEKey];



        jsonToValue(&aD_IMAGE_DOWNLOAD_INVALID_FILE, value, "int");


    }

    const char *aD_IMAGE_DOWNLOAD_SITE_ERRORKey = "AD_IMAGE_DOWNLOAD_SITE_ERROR";

    if(object.has_key(aD_IMAGE_DOWNLOAD_SITE_ERRORKey))
    {
        bourne::json value = object[aD_IMAGE_DOWNLOAD_SITE_ERRORKey];



        jsonToValue(&aD_IMAGE_DOWNLOAD_SITE_ERROR, value, "int");


    }

    const char *aD_IMAGE_DOWNLOAD_SITE_TIMEOUTKey = "AD_IMAGE_DOWNLOAD_SITE_TIMEOUT";

    if(object.has_key(aD_IMAGE_DOWNLOAD_SITE_TIMEOUTKey))
    {
        bourne::json value = object[aD_IMAGE_DOWNLOAD_SITE_TIMEOUTKey];



        jsonToValue(&aD_IMAGE_DOWNLOAD_SITE_TIMEOUT, value, "int");


    }

    const char *aD_IMAGE_DOWNLOAD_SSL_ERRORKey = "AD_IMAGE_DOWNLOAD_SSL_ERROR";

    if(object.has_key(aD_IMAGE_DOWNLOAD_SSL_ERRORKey))
    {
        bourne::json value = object[aD_IMAGE_DOWNLOAD_SSL_ERRORKey];



        jsonToValue(&aD_IMAGE_DOWNLOAD_SSL_ERROR, value, "int");


    }

    const char *aD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERRORKey = "AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR";

    if(object.has_key(aD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERRORKey))
    {
        bourne::json value = object[aD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERRORKey];



        jsonToValue(&aD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR, value, "int");


    }

    const char *aD_IMAGE_PROCESSING_EMPTY_FILEKey = "AD_IMAGE_PROCESSING_EMPTY_FILE";

    if(object.has_key(aD_IMAGE_PROCESSING_EMPTY_FILEKey))
    {
        bourne::json value = object[aD_IMAGE_PROCESSING_EMPTY_FILEKey];



        jsonToValue(&aD_IMAGE_PROCESSING_EMPTY_FILE, value, "int");


    }

    const char *aD_IMAGE_PROCESSING_HEIGHT_TOO_SMALLKey = "AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL";

    if(object.has_key(aD_IMAGE_PROCESSING_HEIGHT_TOO_SMALLKey))
    {
        bourne::json value = object[aD_IMAGE_PROCESSING_HEIGHT_TOO_SMALLKey];



        jsonToValue(&aD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL, value, "int");


    }

    const char *aD_IMAGE_PROCESSING_TOO_MANY_PIXELSKey = "AD_IMAGE_PROCESSING_TOO_MANY_PIXELS";

    if(object.has_key(aD_IMAGE_PROCESSING_TOO_MANY_PIXELSKey))
    {
        bourne::json value = object[aD_IMAGE_PROCESSING_TOO_MANY_PIXELSKey];



        jsonToValue(&aD_IMAGE_PROCESSING_TOO_MANY_PIXELS, value, "int");


    }

    const char *aD_IMAGE_PROCESSING_TYPE_MISMATCHKey = "AD_IMAGE_PROCESSING_TYPE_MISMATCH";

    if(object.has_key(aD_IMAGE_PROCESSING_TYPE_MISMATCHKey))
    {
        bourne::json value = object[aD_IMAGE_PROCESSING_TYPE_MISMATCHKey];



        jsonToValue(&aD_IMAGE_PROCESSING_TYPE_MISMATCH, value, "int");


    }

    const char *aD_IMAGE_PROCESSING_WIDTH_TOO_SMALLKey = "AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL";

    if(object.has_key(aD_IMAGE_PROCESSING_WIDTH_TOO_SMALLKey))
    {
        bourne::json value = object[aD_IMAGE_PROCESSING_WIDTH_TOO_SMALLKey];



        jsonToValue(&aD_IMAGE_PROCESSING_WIDTH_TOO_SMALL, value, "int");


    }

    const char *aD_VIDEO_DOWNLOAD_CONTENT_READ_ERRORKey = "AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR";

    if(object.has_key(aD_VIDEO_DOWNLOAD_CONTENT_READ_ERRORKey))
    {
        bourne::json value = object[aD_VIDEO_DOWNLOAD_CONTENT_READ_ERRORKey];



        jsonToValue(&aD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR, value, "int");


    }

    const char *aD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERRORKey = "AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR";

    if(object.has_key(aD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERRORKey))
    {
        bourne::json value = object[aD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERRORKey];



        jsonToValue(&aD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR, value, "int");


    }

    const char *aD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLEKey = "AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE";

    if(object.has_key(aD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLEKey))
    {
        bourne::json value = object[aD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLEKey];



        jsonToValue(&aD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE, value, "int");


    }

    const char *aD_VIDEO_DOWNLOAD_FILE_NOT_FOUNDKey = "AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND";

    if(object.has_key(aD_VIDEO_DOWNLOAD_FILE_NOT_FOUNDKey))
    {
        bourne::json value = object[aD_VIDEO_DOWNLOAD_FILE_NOT_FOUNDKey];



        jsonToValue(&aD_VIDEO_DOWNLOAD_FILE_NOT_FOUND, value, "int");


    }

    const char *aD_VIDEO_DOWNLOAD_HTTP_STATUS_400Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_400";

    if(object.has_key(aD_VIDEO_DOWNLOAD_HTTP_STATUS_400Key))
    {
        bourne::json value = object[aD_VIDEO_DOWNLOAD_HTTP_STATUS_400Key];



        jsonToValue(&aD_VIDEO_DOWNLOAD_HTTP_STATUS_400, value, "int");


    }

    const char *aD_VIDEO_DOWNLOAD_HTTP_STATUS_403Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_403";

    if(object.has_key(aD_VIDEO_DOWNLOAD_HTTP_STATUS_403Key))
    {
        bourne::json value = object[aD_VIDEO_DOWNLOAD_HTTP_STATUS_403Key];



        jsonToValue(&aD_VIDEO_DOWNLOAD_HTTP_STATUS_403, value, "int");


    }

    const char *aD_VIDEO_DOWNLOAD_HTTP_STATUS_404Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_404";

    if(object.has_key(aD_VIDEO_DOWNLOAD_HTTP_STATUS_404Key))
    {
        bourne::json value = object[aD_VIDEO_DOWNLOAD_HTTP_STATUS_404Key];



        jsonToValue(&aD_VIDEO_DOWNLOAD_HTTP_STATUS_404, value, "int");


    }

    const char *aD_VIDEO_DOWNLOAD_HTTP_STATUS_405Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_405";

    if(object.has_key(aD_VIDEO_DOWNLOAD_HTTP_STATUS_405Key))
    {
        bourne::json value = object[aD_VIDEO_DOWNLOAD_HTTP_STATUS_405Key];



        jsonToValue(&aD_VIDEO_DOWNLOAD_HTTP_STATUS_405, value, "int");


    }

    const char *aD_VIDEO_DOWNLOAD_HTTP_STATUS_410Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_410";

    if(object.has_key(aD_VIDEO_DOWNLOAD_HTTP_STATUS_410Key))
    {
        bourne::json value = object[aD_VIDEO_DOWNLOAD_HTTP_STATUS_410Key];



        jsonToValue(&aD_VIDEO_DOWNLOAD_HTTP_STATUS_410, value, "int");


    }

    const char *aD_VIDEO_DOWNLOAD_HTTP_STATUS_429Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_429";

    if(object.has_key(aD_VIDEO_DOWNLOAD_HTTP_STATUS_429Key))
    {
        bourne::json value = object[aD_VIDEO_DOWNLOAD_HTTP_STATUS_429Key];



        jsonToValue(&aD_VIDEO_DOWNLOAD_HTTP_STATUS_429, value, "int");


    }

    const char *aD_VIDEO_DOWNLOAD_HTTP_STATUS_500Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_500";

    if(object.has_key(aD_VIDEO_DOWNLOAD_HTTP_STATUS_500Key))
    {
        bourne::json value = object[aD_VIDEO_DOWNLOAD_HTTP_STATUS_500Key];



        jsonToValue(&aD_VIDEO_DOWNLOAD_HTTP_STATUS_500, value, "int");


    }

    const char *aD_VIDEO_DOWNLOAD_HTTP_STATUS_502Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_502";

    if(object.has_key(aD_VIDEO_DOWNLOAD_HTTP_STATUS_502Key))
    {
        bourne::json value = object[aD_VIDEO_DOWNLOAD_HTTP_STATUS_502Key];



        jsonToValue(&aD_VIDEO_DOWNLOAD_HTTP_STATUS_502, value, "int");


    }

    const char *aD_VIDEO_DOWNLOAD_HTTP_STATUS_503Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_503";

    if(object.has_key(aD_VIDEO_DOWNLOAD_HTTP_STATUS_503Key))
    {
        bourne::json value = object[aD_VIDEO_DOWNLOAD_HTTP_STATUS_503Key];



        jsonToValue(&aD_VIDEO_DOWNLOAD_HTTP_STATUS_503, value, "int");


    }

    const char *aD_VIDEO_DOWNLOAD_HTTP_STATUS_504Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_504";

    if(object.has_key(aD_VIDEO_DOWNLOAD_HTTP_STATUS_504Key))
    {
        bourne::json value = object[aD_VIDEO_DOWNLOAD_HTTP_STATUS_504Key];



        jsonToValue(&aD_VIDEO_DOWNLOAD_HTTP_STATUS_504, value, "int");


    }

    const char *aD_VIDEO_DOWNLOAD_HTTP_STATUS_507Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_507";

    if(object.has_key(aD_VIDEO_DOWNLOAD_HTTP_STATUS_507Key))
    {
        bourne::json value = object[aD_VIDEO_DOWNLOAD_HTTP_STATUS_507Key];



        jsonToValue(&aD_VIDEO_DOWNLOAD_HTTP_STATUS_507, value, "int");


    }

    const char *aD_VIDEO_DOWNLOAD_HTTP_STATUS_508Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_508";

    if(object.has_key(aD_VIDEO_DOWNLOAD_HTTP_STATUS_508Key))
    {
        bourne::json value = object[aD_VIDEO_DOWNLOAD_HTTP_STATUS_508Key];



        jsonToValue(&aD_VIDEO_DOWNLOAD_HTTP_STATUS_508, value, "int");


    }

    const char *aD_VIDEO_DOWNLOAD_HTTP_STATUS_520Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_520";

    if(object.has_key(aD_VIDEO_DOWNLOAD_HTTP_STATUS_520Key))
    {
        bourne::json value = object[aD_VIDEO_DOWNLOAD_HTTP_STATUS_520Key];



        jsonToValue(&aD_VIDEO_DOWNLOAD_HTTP_STATUS_520, value, "int");


    }

    const char *aD_VIDEO_DOWNLOAD_HTTP_STATUS_521Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_521";

    if(object.has_key(aD_VIDEO_DOWNLOAD_HTTP_STATUS_521Key))
    {
        bourne::json value = object[aD_VIDEO_DOWNLOAD_HTTP_STATUS_521Key];



        jsonToValue(&aD_VIDEO_DOWNLOAD_HTTP_STATUS_521, value, "int");


    }

    const char *aD_VIDEO_DOWNLOAD_HTTP_STATUS_522Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_522";

    if(object.has_key(aD_VIDEO_DOWNLOAD_HTTP_STATUS_522Key))
    {
        bourne::json value = object[aD_VIDEO_DOWNLOAD_HTTP_STATUS_522Key];



        jsonToValue(&aD_VIDEO_DOWNLOAD_HTTP_STATUS_522, value, "int");


    }

    const char *aD_VIDEO_DOWNLOAD_HTTP_STATUS_525Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_525";

    if(object.has_key(aD_VIDEO_DOWNLOAD_HTTP_STATUS_525Key))
    {
        bourne::json value = object[aD_VIDEO_DOWNLOAD_HTTP_STATUS_525Key];



        jsonToValue(&aD_VIDEO_DOWNLOAD_HTTP_STATUS_525, value, "int");


    }

    const char *aD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERRORKey = "AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR";

    if(object.has_key(aD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERRORKey))
    {
        bourne::json value = object[aD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERRORKey];



        jsonToValue(&aD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR, value, "int");


    }

    const char *aD_VIDEO_DOWNLOAD_INTERNAL_ERRORKey = "AD_VIDEO_DOWNLOAD_INTERNAL_ERROR";

    if(object.has_key(aD_VIDEO_DOWNLOAD_INTERNAL_ERRORKey))
    {
        bourne::json value = object[aD_VIDEO_DOWNLOAD_INTERNAL_ERRORKey];



        jsonToValue(&aD_VIDEO_DOWNLOAD_INTERNAL_ERROR, value, "int");


    }

    const char *aD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOADKey = "AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD";

    if(object.has_key(aD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOADKey))
    {
        bourne::json value = object[aD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOADKey];



        jsonToValue(&aD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD, value, "int");


    }

    const char *aD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URLKey = "AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL";

    if(object.has_key(aD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URLKey))
    {
        bourne::json value = object[aD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URLKey];



        jsonToValue(&aD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL, value, "int");


    }

    const char *aD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITEDKey = "AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED";

    if(object.has_key(aD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITEDKey))
    {
        bourne::json value = object[aD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITEDKey];



        jsonToValue(&aD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED, value, "int");


    }

    const char *aD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIREDKey = "AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED";

    if(object.has_key(aD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIREDKey))
    {
        bourne::json value = object[aD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIREDKey];



        jsonToValue(&aD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED, value, "int");


    }

    const char *aD_VIDEO_DOWNLOAD_INVALID_FILEKey = "AD_VIDEO_DOWNLOAD_INVALID_FILE";

    if(object.has_key(aD_VIDEO_DOWNLOAD_INVALID_FILEKey))
    {
        bourne::json value = object[aD_VIDEO_DOWNLOAD_INVALID_FILEKey];



        jsonToValue(&aD_VIDEO_DOWNLOAD_INVALID_FILE, value, "int");


    }

    const char *aD_VIDEO_DOWNLOAD_SITE_ERRORKey = "AD_VIDEO_DOWNLOAD_SITE_ERROR";

    if(object.has_key(aD_VIDEO_DOWNLOAD_SITE_ERRORKey))
    {
        bourne::json value = object[aD_VIDEO_DOWNLOAD_SITE_ERRORKey];



        jsonToValue(&aD_VIDEO_DOWNLOAD_SITE_ERROR, value, "int");


    }

    const char *aD_VIDEO_DOWNLOAD_SITE_TIMEOUTKey = "AD_VIDEO_DOWNLOAD_SITE_TIMEOUT";

    if(object.has_key(aD_VIDEO_DOWNLOAD_SITE_TIMEOUTKey))
    {
        bourne::json value = object[aD_VIDEO_DOWNLOAD_SITE_TIMEOUTKey];



        jsonToValue(&aD_VIDEO_DOWNLOAD_SITE_TIMEOUT, value, "int");


    }

    const char *aD_VIDEO_DOWNLOAD_SSL_ERRORKey = "AD_VIDEO_DOWNLOAD_SSL_ERROR";

    if(object.has_key(aD_VIDEO_DOWNLOAD_SSL_ERRORKey))
    {
        bourne::json value = object[aD_VIDEO_DOWNLOAD_SSL_ERRORKey];



        jsonToValue(&aD_VIDEO_DOWNLOAD_SSL_ERROR, value, "int");


    }

    const char *aD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERRORKey = "AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR";

    if(object.has_key(aD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERRORKey))
    {
        bourne::json value = object[aD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERRORKey];



        jsonToValue(&aD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR, value, "int");


    }

    const char *aD_VIDEO_LENGTH_TOO_SHORTKey = "AD_VIDEO_LENGTH_TOO_SHORT";

    if(object.has_key(aD_VIDEO_LENGTH_TOO_SHORTKey))
    {
        bourne::json value = object[aD_VIDEO_LENGTH_TOO_SHORTKey];



        jsonToValue(&aD_VIDEO_LENGTH_TOO_SHORT, value, "int");


    }

    const char *aD_VIDEO_PROCESSING_EMPTY_FILEKey = "AD_VIDEO_PROCESSING_EMPTY_FILE";

    if(object.has_key(aD_VIDEO_PROCESSING_EMPTY_FILEKey))
    {
        bourne::json value = object[aD_VIDEO_PROCESSING_EMPTY_FILEKey];



        jsonToValue(&aD_VIDEO_PROCESSING_EMPTY_FILE, value, "int");


    }

    const char *aD_VIDEO_PROCESSING_HEIGHT_TOO_SMALLKey = "AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL";

    if(object.has_key(aD_VIDEO_PROCESSING_HEIGHT_TOO_SMALLKey))
    {
        bourne::json value = object[aD_VIDEO_PROCESSING_HEIGHT_TOO_SMALLKey];



        jsonToValue(&aD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL, value, "int");


    }

    const char *aD_VIDEO_PROCESSING_TOO_MANY_PIXELSKey = "AD_VIDEO_PROCESSING_TOO_MANY_PIXELS";

    if(object.has_key(aD_VIDEO_PROCESSING_TOO_MANY_PIXELSKey))
    {
        bourne::json value = object[aD_VIDEO_PROCESSING_TOO_MANY_PIXELSKey];



        jsonToValue(&aD_VIDEO_PROCESSING_TOO_MANY_PIXELS, value, "int");


    }

    const char *aD_VIDEO_PROCESSING_TYPE_MISMATCHKey = "AD_VIDEO_PROCESSING_TYPE_MISMATCH";

    if(object.has_key(aD_VIDEO_PROCESSING_TYPE_MISMATCHKey))
    {
        bourne::json value = object[aD_VIDEO_PROCESSING_TYPE_MISMATCHKey];



        jsonToValue(&aD_VIDEO_PROCESSING_TYPE_MISMATCH, value, "int");


    }

    const char *aD_VIDEO_PROCESSING_WIDTH_TOO_SMALLKey = "AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL";

    if(object.has_key(aD_VIDEO_PROCESSING_WIDTH_TOO_SMALLKey))
    {
        bourne::json value = object[aD_VIDEO_PROCESSING_WIDTH_TOO_SMALLKey];



        jsonToValue(&aD_VIDEO_PROCESSING_WIDTH_TOO_SMALL, value, "int");


    }

    const char *aDDITIONAL_IMAGE_FILE_NOT_ACCESSIBLEKey = "ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE";

    if(object.has_key(aDDITIONAL_IMAGE_FILE_NOT_ACCESSIBLEKey))
    {
        bourne::json value = object[aDDITIONAL_IMAGE_FILE_NOT_ACCESSIBLEKey];



        jsonToValue(&aDDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE, value, "int");


    }

    const char *aDDITIONAL_IMAGE_FILE_NOT_FOUNDKey = "ADDITIONAL_IMAGE_FILE_NOT_FOUND";

    if(object.has_key(aDDITIONAL_IMAGE_FILE_NOT_FOUNDKey))
    {
        bourne::json value = object[aDDITIONAL_IMAGE_FILE_NOT_FOUNDKey];



        jsonToValue(&aDDITIONAL_IMAGE_FILE_NOT_FOUND, value, "int");


    }

    const char *aDDITIONAL_IMAGE_INVALID_FILEKey = "ADDITIONAL_IMAGE_INVALID_FILE";

    if(object.has_key(aDDITIONAL_IMAGE_INVALID_FILEKey))
    {
        bourne::json value = object[aDDITIONAL_IMAGE_INVALID_FILEKey];



        jsonToValue(&aDDITIONAL_IMAGE_INVALID_FILE, value, "int");


    }

    const char *aDDITIONAL_IMAGE_LEVEL_INTERNAL_ERRORKey = "ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR";

    if(object.has_key(aDDITIONAL_IMAGE_LEVEL_INTERNAL_ERRORKey))
    {
        bourne::json value = object[aDDITIONAL_IMAGE_LEVEL_INTERNAL_ERRORKey];



        jsonToValue(&aDDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR, value, "int");


    }

    const char *aDDITIONAL_IMAGE_MALFORMED_URLKey = "ADDITIONAL_IMAGE_MALFORMED_URL";

    if(object.has_key(aDDITIONAL_IMAGE_MALFORMED_URLKey))
    {
        bourne::json value = object[aDDITIONAL_IMAGE_MALFORMED_URLKey];



        jsonToValue(&aDDITIONAL_IMAGE_MALFORMED_URL, value, "int");


    }

    const char *fETCH_GOOGLE_SHEET_PUBLIC_CAN_EDITKey = "FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT";

    if(object.has_key(fETCH_GOOGLE_SHEET_PUBLIC_CAN_EDITKey))
    {
        bourne::json value = object[fETCH_GOOGLE_SHEET_PUBLIC_CAN_EDITKey];



        jsonToValue(&fETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT, value, "int");


    }

    const char *hOTEL_PRICE_HEADER_IS_PRESENTKey = "HOTEL_PRICE_HEADER_IS_PRESENT";

    if(object.has_key(hOTEL_PRICE_HEADER_IS_PRESENTKey))
    {
        bourne::json value = object[hOTEL_PRICE_HEADER_IS_PRESENTKey];



        jsonToValue(&hOTEL_PRICE_HEADER_IS_PRESENT, value, "int");


    }

    const char *vIDEO_DOWNLOAD_VIDEO_TOO_SHORTKey = "VIDEO_DOWNLOAD_VIDEO_TOO_SHORT";

    if(object.has_key(vIDEO_DOWNLOAD_VIDEO_TOO_SHORTKey))
    {
        bourne::json value = object[vIDEO_DOWNLOAD_VIDEO_TOO_SHORTKey];



        jsonToValue(&vIDEO_DOWNLOAD_VIDEO_TOO_SHORT, value, "int");


    }

    const char *vIDEO_FILE_NOT_ACCESSIBLEKey = "VIDEO_FILE_NOT_ACCESSIBLE";

    if(object.has_key(vIDEO_FILE_NOT_ACCESSIBLEKey))
    {
        bourne::json value = object[vIDEO_FILE_NOT_ACCESSIBLEKey];



        jsonToValue(&vIDEO_FILE_NOT_ACCESSIBLE, value, "int");


    }

    const char *vIDEO_FILE_NOT_FOUNDKey = "VIDEO_FILE_NOT_FOUND";

    if(object.has_key(vIDEO_FILE_NOT_FOUNDKey))
    {
        bourne::json value = object[vIDEO_FILE_NOT_FOUNDKey];



        jsonToValue(&vIDEO_FILE_NOT_FOUND, value, "int");


    }

    const char *vIDEO_INVALID_FILEKey = "VIDEO_INVALID_FILE";

    if(object.has_key(vIDEO_INVALID_FILEKey))
    {
        bourne::json value = object[vIDEO_INVALID_FILEKey];



        jsonToValue(&vIDEO_INVALID_FILE, value, "int");


    }

    const char *vIDEO_LEVEL_INTERNAL_ERRORKey = "VIDEO_LEVEL_INTERNAL_ERROR";

    if(object.has_key(vIDEO_LEVEL_INTERNAL_ERRORKey))
    {
        bourne::json value = object[vIDEO_LEVEL_INTERNAL_ERRORKey];



        jsonToValue(&vIDEO_LEVEL_INTERNAL_ERROR, value, "int");


    }

    const char *vIDEO_MALFORMED_URLKey = "VIDEO_MALFORMED_URL";

    if(object.has_key(vIDEO_MALFORMED_URLKey))
    {
        bourne::json value = object[vIDEO_MALFORMED_URLKey];



        jsonToValue(&vIDEO_MALFORMED_URL, value, "int");


    }


}

bourne::json
CatalogsFeedIngestionWarnings::toJson()
{
    bourne::json object = bourne::json::object();





    object["aD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR"] = getADIMAGEDOWNLOADCONTENTREADERROR();






    object["aD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR"] = getADIMAGEDOWNLOADDNSLOOKUPERROR();






    object["aD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE"] = getADIMAGEDOWNLOADFILENOTACCESSIBLE();






    object["aD_IMAGE_DOWNLOAD_FILE_NOT_FOUND"] = getADIMAGEDOWNLOADFILENOTFOUND();






    object["aD_IMAGE_DOWNLOAD_HTTP_STATUS_400"] = getADIMAGEDOWNLOADHTTPSTATUS400();






    object["aD_IMAGE_DOWNLOAD_HTTP_STATUS_403"] = getADIMAGEDOWNLOADHTTPSTATUS403();






    object["aD_IMAGE_DOWNLOAD_HTTP_STATUS_404"] = getADIMAGEDOWNLOADHTTPSTATUS404();






    object["aD_IMAGE_DOWNLOAD_HTTP_STATUS_405"] = getADIMAGEDOWNLOADHTTPSTATUS405();






    object["aD_IMAGE_DOWNLOAD_HTTP_STATUS_410"] = getADIMAGEDOWNLOADHTTPSTATUS410();






    object["aD_IMAGE_DOWNLOAD_HTTP_STATUS_429"] = getADIMAGEDOWNLOADHTTPSTATUS429();






    object["aD_IMAGE_DOWNLOAD_HTTP_STATUS_500"] = getADIMAGEDOWNLOADHTTPSTATUS500();






    object["aD_IMAGE_DOWNLOAD_HTTP_STATUS_502"] = getADIMAGEDOWNLOADHTTPSTATUS502();






    object["aD_IMAGE_DOWNLOAD_HTTP_STATUS_503"] = getADIMAGEDOWNLOADHTTPSTATUS503();






    object["aD_IMAGE_DOWNLOAD_HTTP_STATUS_504"] = getADIMAGEDOWNLOADHTTPSTATUS504();






    object["aD_IMAGE_DOWNLOAD_HTTP_STATUS_507"] = getADIMAGEDOWNLOADHTTPSTATUS507();






    object["aD_IMAGE_DOWNLOAD_HTTP_STATUS_508"] = getADIMAGEDOWNLOADHTTPSTATUS508();






    object["aD_IMAGE_DOWNLOAD_HTTP_STATUS_520"] = getADIMAGEDOWNLOADHTTPSTATUS520();






    object["aD_IMAGE_DOWNLOAD_HTTP_STATUS_521"] = getADIMAGEDOWNLOADHTTPSTATUS521();






    object["aD_IMAGE_DOWNLOAD_HTTP_STATUS_522"] = getADIMAGEDOWNLOADHTTPSTATUS522();






    object["aD_IMAGE_DOWNLOAD_HTTP_STATUS_525"] = getADIMAGEDOWNLOADHTTPSTATUS525();






    object["aD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR"] = getADIMAGEDOWNLOADINTERNALCONFIGURATIONERROR();






    object["aD_IMAGE_DOWNLOAD_INTERNAL_ERROR"] = getADIMAGEDOWNLOADINTERNALERROR();






    object["aD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD"] = getADIMAGEDOWNLOADINTERNALFAILEDTODOWNLOAD();






    object["aD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL"] = getADIMAGEDOWNLOADINTERNALMALFORMEDURL();






    object["aD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED"] = getADIMAGEDOWNLOADINTERNALRATELIMITED();






    object["aD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED"] = getADIMAGEDOWNLOADINTERNALREQUESTEXPIRED();






    object["aD_IMAGE_DOWNLOAD_INVALID_FILE"] = getADIMAGEDOWNLOADINVALIDFILE();






    object["aD_IMAGE_DOWNLOAD_SITE_ERROR"] = getADIMAGEDOWNLOADSITEERROR();






    object["aD_IMAGE_DOWNLOAD_SITE_TIMEOUT"] = getADIMAGEDOWNLOADSITETIMEOUT();






    object["aD_IMAGE_DOWNLOAD_SSL_ERROR"] = getADIMAGEDOWNLOADSSLERROR();






    object["aD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR"] = getADIMAGEDOWNLOADSSLHANDSHAKEERROR();






    object["aD_IMAGE_PROCESSING_EMPTY_FILE"] = getADIMAGEPROCESSINGEMPTYFILE();






    object["aD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL"] = getADIMAGEPROCESSINGHEIGHTTOOSMALL();






    object["aD_IMAGE_PROCESSING_TOO_MANY_PIXELS"] = getADIMAGEPROCESSINGTOOMANYPIXELS();






    object["aD_IMAGE_PROCESSING_TYPE_MISMATCH"] = getADIMAGEPROCESSINGTYPEMISMATCH();






    object["aD_IMAGE_PROCESSING_WIDTH_TOO_SMALL"] = getADIMAGEPROCESSINGWIDTHTOOSMALL();






    object["aD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR"] = getADVIDEODOWNLOADCONTENTREADERROR();






    object["aD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR"] = getADVIDEODOWNLOADDNSLOOKUPERROR();






    object["aD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE"] = getADVIDEODOWNLOADFILENOTACCESSIBLE();






    object["aD_VIDEO_DOWNLOAD_FILE_NOT_FOUND"] = getADVIDEODOWNLOADFILENOTFOUND();






    object["aD_VIDEO_DOWNLOAD_HTTP_STATUS_400"] = getADVIDEODOWNLOADHTTPSTATUS400();






    object["aD_VIDEO_DOWNLOAD_HTTP_STATUS_403"] = getADVIDEODOWNLOADHTTPSTATUS403();






    object["aD_VIDEO_DOWNLOAD_HTTP_STATUS_404"] = getADVIDEODOWNLOADHTTPSTATUS404();






    object["aD_VIDEO_DOWNLOAD_HTTP_STATUS_405"] = getADVIDEODOWNLOADHTTPSTATUS405();






    object["aD_VIDEO_DOWNLOAD_HTTP_STATUS_410"] = getADVIDEODOWNLOADHTTPSTATUS410();






    object["aD_VIDEO_DOWNLOAD_HTTP_STATUS_429"] = getADVIDEODOWNLOADHTTPSTATUS429();






    object["aD_VIDEO_DOWNLOAD_HTTP_STATUS_500"] = getADVIDEODOWNLOADHTTPSTATUS500();






    object["aD_VIDEO_DOWNLOAD_HTTP_STATUS_502"] = getADVIDEODOWNLOADHTTPSTATUS502();






    object["aD_VIDEO_DOWNLOAD_HTTP_STATUS_503"] = getADVIDEODOWNLOADHTTPSTATUS503();






    object["aD_VIDEO_DOWNLOAD_HTTP_STATUS_504"] = getADVIDEODOWNLOADHTTPSTATUS504();






    object["aD_VIDEO_DOWNLOAD_HTTP_STATUS_507"] = getADVIDEODOWNLOADHTTPSTATUS507();






    object["aD_VIDEO_DOWNLOAD_HTTP_STATUS_508"] = getADVIDEODOWNLOADHTTPSTATUS508();






    object["aD_VIDEO_DOWNLOAD_HTTP_STATUS_520"] = getADVIDEODOWNLOADHTTPSTATUS520();






    object["aD_VIDEO_DOWNLOAD_HTTP_STATUS_521"] = getADVIDEODOWNLOADHTTPSTATUS521();






    object["aD_VIDEO_DOWNLOAD_HTTP_STATUS_522"] = getADVIDEODOWNLOADHTTPSTATUS522();






    object["aD_VIDEO_DOWNLOAD_HTTP_STATUS_525"] = getADVIDEODOWNLOADHTTPSTATUS525();






    object["aD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR"] = getADVIDEODOWNLOADINTERNALCONFIGURATIONERROR();






    object["aD_VIDEO_DOWNLOAD_INTERNAL_ERROR"] = getADVIDEODOWNLOADINTERNALERROR();






    object["aD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD"] = getADVIDEODOWNLOADINTERNALFAILEDTODOWNLOAD();






    object["aD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL"] = getADVIDEODOWNLOADINTERNALMALFORMEDURL();






    object["aD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED"] = getADVIDEODOWNLOADINTERNALRATELIMITED();






    object["aD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED"] = getADVIDEODOWNLOADINTERNALREQUESTEXPIRED();






    object["aD_VIDEO_DOWNLOAD_INVALID_FILE"] = getADVIDEODOWNLOADINVALIDFILE();






    object["aD_VIDEO_DOWNLOAD_SITE_ERROR"] = getADVIDEODOWNLOADSITEERROR();






    object["aD_VIDEO_DOWNLOAD_SITE_TIMEOUT"] = getADVIDEODOWNLOADSITETIMEOUT();






    object["aD_VIDEO_DOWNLOAD_SSL_ERROR"] = getADVIDEODOWNLOADSSLERROR();






    object["aD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR"] = getADVIDEODOWNLOADSSLHANDSHAKEERROR();






    object["aD_VIDEO_LENGTH_TOO_SHORT"] = getADVIDEOLENGTHTOOSHORT();






    object["aD_VIDEO_PROCESSING_EMPTY_FILE"] = getADVIDEOPROCESSINGEMPTYFILE();






    object["aD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL"] = getADVIDEOPROCESSINGHEIGHTTOOSMALL();






    object["aD_VIDEO_PROCESSING_TOO_MANY_PIXELS"] = getADVIDEOPROCESSINGTOOMANYPIXELS();






    object["aD_VIDEO_PROCESSING_TYPE_MISMATCH"] = getADVIDEOPROCESSINGTYPEMISMATCH();






    object["aD_VIDEO_PROCESSING_WIDTH_TOO_SMALL"] = getADVIDEOPROCESSINGWIDTHTOOSMALL();






    object["aDDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE"] = getADDITIONALIMAGEFILENOTACCESSIBLE();






    object["aDDITIONAL_IMAGE_FILE_NOT_FOUND"] = getADDITIONALIMAGEFILENOTFOUND();






    object["aDDITIONAL_IMAGE_INVALID_FILE"] = getADDITIONALIMAGEINVALIDFILE();






    object["aDDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR"] = getADDITIONALIMAGELEVELINTERNALERROR();






    object["aDDITIONAL_IMAGE_MALFORMED_URL"] = getADDITIONALIMAGEMALFORMEDURL();






    object["fETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT"] = getFETCHGOOGLESHEETPUBLICCANEDIT();






    object["hOTEL_PRICE_HEADER_IS_PRESENT"] = getHOTELPRICEHEADERISPRESENT();






    object["vIDEO_DOWNLOAD_VIDEO_TOO_SHORT"] = getVIDEODOWNLOADVIDEOTOOSHORT();






    object["vIDEO_FILE_NOT_ACCESSIBLE"] = getVIDEOFILENOTACCESSIBLE();






    object["vIDEO_FILE_NOT_FOUND"] = getVIDEOFILENOTFOUND();






    object["vIDEO_INVALID_FILE"] = getVIDEOINVALIDFILE();






    object["vIDEO_LEVEL_INTERNAL_ERROR"] = getVIDEOLEVELINTERNALERROR();






    object["vIDEO_MALFORMED_URL"] = getVIDEOMALFORMEDURL();



    return object;

}

int
CatalogsFeedIngestionWarnings::getADIMAGEDOWNLOADCONTENTREADERROR()
{
	return aD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR;
}

void
CatalogsFeedIngestionWarnings::setADIMAGEDOWNLOADCONTENTREADERROR(int  aD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR)
{
	this->aD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR = aD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR;
}

int
CatalogsFeedIngestionWarnings::getADIMAGEDOWNLOADDNSLOOKUPERROR()
{
	return aD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR;
}

void
CatalogsFeedIngestionWarnings::setADIMAGEDOWNLOADDNSLOOKUPERROR(int  aD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR)
{
	this->aD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR = aD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR;
}

int
CatalogsFeedIngestionWarnings::getADIMAGEDOWNLOADFILENOTACCESSIBLE()
{
	return aD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE;
}

void
CatalogsFeedIngestionWarnings::setADIMAGEDOWNLOADFILENOTACCESSIBLE(int  aD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE)
{
	this->aD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE = aD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE;
}

int
CatalogsFeedIngestionWarnings::getADIMAGEDOWNLOADFILENOTFOUND()
{
	return aD_IMAGE_DOWNLOAD_FILE_NOT_FOUND;
}

void
CatalogsFeedIngestionWarnings::setADIMAGEDOWNLOADFILENOTFOUND(int  aD_IMAGE_DOWNLOAD_FILE_NOT_FOUND)
{
	this->aD_IMAGE_DOWNLOAD_FILE_NOT_FOUND = aD_IMAGE_DOWNLOAD_FILE_NOT_FOUND;
}

int
CatalogsFeedIngestionWarnings::getADIMAGEDOWNLOADHTTPSTATUS400()
{
	return aD_IMAGE_DOWNLOAD_HTTP_STATUS_400;
}

void
CatalogsFeedIngestionWarnings::setADIMAGEDOWNLOADHTTPSTATUS400(int  aD_IMAGE_DOWNLOAD_HTTP_STATUS_400)
{
	this->aD_IMAGE_DOWNLOAD_HTTP_STATUS_400 = aD_IMAGE_DOWNLOAD_HTTP_STATUS_400;
}

int
CatalogsFeedIngestionWarnings::getADIMAGEDOWNLOADHTTPSTATUS403()
{
	return aD_IMAGE_DOWNLOAD_HTTP_STATUS_403;
}

void
CatalogsFeedIngestionWarnings::setADIMAGEDOWNLOADHTTPSTATUS403(int  aD_IMAGE_DOWNLOAD_HTTP_STATUS_403)
{
	this->aD_IMAGE_DOWNLOAD_HTTP_STATUS_403 = aD_IMAGE_DOWNLOAD_HTTP_STATUS_403;
}

int
CatalogsFeedIngestionWarnings::getADIMAGEDOWNLOADHTTPSTATUS404()
{
	return aD_IMAGE_DOWNLOAD_HTTP_STATUS_404;
}

void
CatalogsFeedIngestionWarnings::setADIMAGEDOWNLOADHTTPSTATUS404(int  aD_IMAGE_DOWNLOAD_HTTP_STATUS_404)
{
	this->aD_IMAGE_DOWNLOAD_HTTP_STATUS_404 = aD_IMAGE_DOWNLOAD_HTTP_STATUS_404;
}

int
CatalogsFeedIngestionWarnings::getADIMAGEDOWNLOADHTTPSTATUS405()
{
	return aD_IMAGE_DOWNLOAD_HTTP_STATUS_405;
}

void
CatalogsFeedIngestionWarnings::setADIMAGEDOWNLOADHTTPSTATUS405(int  aD_IMAGE_DOWNLOAD_HTTP_STATUS_405)
{
	this->aD_IMAGE_DOWNLOAD_HTTP_STATUS_405 = aD_IMAGE_DOWNLOAD_HTTP_STATUS_405;
}

int
CatalogsFeedIngestionWarnings::getADIMAGEDOWNLOADHTTPSTATUS410()
{
	return aD_IMAGE_DOWNLOAD_HTTP_STATUS_410;
}

void
CatalogsFeedIngestionWarnings::setADIMAGEDOWNLOADHTTPSTATUS410(int  aD_IMAGE_DOWNLOAD_HTTP_STATUS_410)
{
	this->aD_IMAGE_DOWNLOAD_HTTP_STATUS_410 = aD_IMAGE_DOWNLOAD_HTTP_STATUS_410;
}

int
CatalogsFeedIngestionWarnings::getADIMAGEDOWNLOADHTTPSTATUS429()
{
	return aD_IMAGE_DOWNLOAD_HTTP_STATUS_429;
}

void
CatalogsFeedIngestionWarnings::setADIMAGEDOWNLOADHTTPSTATUS429(int  aD_IMAGE_DOWNLOAD_HTTP_STATUS_429)
{
	this->aD_IMAGE_DOWNLOAD_HTTP_STATUS_429 = aD_IMAGE_DOWNLOAD_HTTP_STATUS_429;
}

int
CatalogsFeedIngestionWarnings::getADIMAGEDOWNLOADHTTPSTATUS500()
{
	return aD_IMAGE_DOWNLOAD_HTTP_STATUS_500;
}

void
CatalogsFeedIngestionWarnings::setADIMAGEDOWNLOADHTTPSTATUS500(int  aD_IMAGE_DOWNLOAD_HTTP_STATUS_500)
{
	this->aD_IMAGE_DOWNLOAD_HTTP_STATUS_500 = aD_IMAGE_DOWNLOAD_HTTP_STATUS_500;
}

int
CatalogsFeedIngestionWarnings::getADIMAGEDOWNLOADHTTPSTATUS502()
{
	return aD_IMAGE_DOWNLOAD_HTTP_STATUS_502;
}

void
CatalogsFeedIngestionWarnings::setADIMAGEDOWNLOADHTTPSTATUS502(int  aD_IMAGE_DOWNLOAD_HTTP_STATUS_502)
{
	this->aD_IMAGE_DOWNLOAD_HTTP_STATUS_502 = aD_IMAGE_DOWNLOAD_HTTP_STATUS_502;
}

int
CatalogsFeedIngestionWarnings::getADIMAGEDOWNLOADHTTPSTATUS503()
{
	return aD_IMAGE_DOWNLOAD_HTTP_STATUS_503;
}

void
CatalogsFeedIngestionWarnings::setADIMAGEDOWNLOADHTTPSTATUS503(int  aD_IMAGE_DOWNLOAD_HTTP_STATUS_503)
{
	this->aD_IMAGE_DOWNLOAD_HTTP_STATUS_503 = aD_IMAGE_DOWNLOAD_HTTP_STATUS_503;
}

int
CatalogsFeedIngestionWarnings::getADIMAGEDOWNLOADHTTPSTATUS504()
{
	return aD_IMAGE_DOWNLOAD_HTTP_STATUS_504;
}

void
CatalogsFeedIngestionWarnings::setADIMAGEDOWNLOADHTTPSTATUS504(int  aD_IMAGE_DOWNLOAD_HTTP_STATUS_504)
{
	this->aD_IMAGE_DOWNLOAD_HTTP_STATUS_504 = aD_IMAGE_DOWNLOAD_HTTP_STATUS_504;
}

int
CatalogsFeedIngestionWarnings::getADIMAGEDOWNLOADHTTPSTATUS507()
{
	return aD_IMAGE_DOWNLOAD_HTTP_STATUS_507;
}

void
CatalogsFeedIngestionWarnings::setADIMAGEDOWNLOADHTTPSTATUS507(int  aD_IMAGE_DOWNLOAD_HTTP_STATUS_507)
{
	this->aD_IMAGE_DOWNLOAD_HTTP_STATUS_507 = aD_IMAGE_DOWNLOAD_HTTP_STATUS_507;
}

int
CatalogsFeedIngestionWarnings::getADIMAGEDOWNLOADHTTPSTATUS508()
{
	return aD_IMAGE_DOWNLOAD_HTTP_STATUS_508;
}

void
CatalogsFeedIngestionWarnings::setADIMAGEDOWNLOADHTTPSTATUS508(int  aD_IMAGE_DOWNLOAD_HTTP_STATUS_508)
{
	this->aD_IMAGE_DOWNLOAD_HTTP_STATUS_508 = aD_IMAGE_DOWNLOAD_HTTP_STATUS_508;
}

int
CatalogsFeedIngestionWarnings::getADIMAGEDOWNLOADHTTPSTATUS520()
{
	return aD_IMAGE_DOWNLOAD_HTTP_STATUS_520;
}

void
CatalogsFeedIngestionWarnings::setADIMAGEDOWNLOADHTTPSTATUS520(int  aD_IMAGE_DOWNLOAD_HTTP_STATUS_520)
{
	this->aD_IMAGE_DOWNLOAD_HTTP_STATUS_520 = aD_IMAGE_DOWNLOAD_HTTP_STATUS_520;
}

int
CatalogsFeedIngestionWarnings::getADIMAGEDOWNLOADHTTPSTATUS521()
{
	return aD_IMAGE_DOWNLOAD_HTTP_STATUS_521;
}

void
CatalogsFeedIngestionWarnings::setADIMAGEDOWNLOADHTTPSTATUS521(int  aD_IMAGE_DOWNLOAD_HTTP_STATUS_521)
{
	this->aD_IMAGE_DOWNLOAD_HTTP_STATUS_521 = aD_IMAGE_DOWNLOAD_HTTP_STATUS_521;
}

int
CatalogsFeedIngestionWarnings::getADIMAGEDOWNLOADHTTPSTATUS522()
{
	return aD_IMAGE_DOWNLOAD_HTTP_STATUS_522;
}

void
CatalogsFeedIngestionWarnings::setADIMAGEDOWNLOADHTTPSTATUS522(int  aD_IMAGE_DOWNLOAD_HTTP_STATUS_522)
{
	this->aD_IMAGE_DOWNLOAD_HTTP_STATUS_522 = aD_IMAGE_DOWNLOAD_HTTP_STATUS_522;
}

int
CatalogsFeedIngestionWarnings::getADIMAGEDOWNLOADHTTPSTATUS525()
{
	return aD_IMAGE_DOWNLOAD_HTTP_STATUS_525;
}

void
CatalogsFeedIngestionWarnings::setADIMAGEDOWNLOADHTTPSTATUS525(int  aD_IMAGE_DOWNLOAD_HTTP_STATUS_525)
{
	this->aD_IMAGE_DOWNLOAD_HTTP_STATUS_525 = aD_IMAGE_DOWNLOAD_HTTP_STATUS_525;
}

int
CatalogsFeedIngestionWarnings::getADIMAGEDOWNLOADINTERNALCONFIGURATIONERROR()
{
	return aD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR;
}

void
CatalogsFeedIngestionWarnings::setADIMAGEDOWNLOADINTERNALCONFIGURATIONERROR(int  aD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR)
{
	this->aD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR = aD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR;
}

int
CatalogsFeedIngestionWarnings::getADIMAGEDOWNLOADINTERNALERROR()
{
	return aD_IMAGE_DOWNLOAD_INTERNAL_ERROR;
}

void
CatalogsFeedIngestionWarnings::setADIMAGEDOWNLOADINTERNALERROR(int  aD_IMAGE_DOWNLOAD_INTERNAL_ERROR)
{
	this->aD_IMAGE_DOWNLOAD_INTERNAL_ERROR = aD_IMAGE_DOWNLOAD_INTERNAL_ERROR;
}

int
CatalogsFeedIngestionWarnings::getADIMAGEDOWNLOADINTERNALFAILEDTODOWNLOAD()
{
	return aD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD;
}

void
CatalogsFeedIngestionWarnings::setADIMAGEDOWNLOADINTERNALFAILEDTODOWNLOAD(int  aD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD)
{
	this->aD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD = aD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD;
}

int
CatalogsFeedIngestionWarnings::getADIMAGEDOWNLOADINTERNALMALFORMEDURL()
{
	return aD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL;
}

void
CatalogsFeedIngestionWarnings::setADIMAGEDOWNLOADINTERNALMALFORMEDURL(int  aD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL)
{
	this->aD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL = aD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL;
}

int
CatalogsFeedIngestionWarnings::getADIMAGEDOWNLOADINTERNALRATELIMITED()
{
	return aD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED;
}

void
CatalogsFeedIngestionWarnings::setADIMAGEDOWNLOADINTERNALRATELIMITED(int  aD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED)
{
	this->aD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED = aD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED;
}

int
CatalogsFeedIngestionWarnings::getADIMAGEDOWNLOADINTERNALREQUESTEXPIRED()
{
	return aD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED;
}

void
CatalogsFeedIngestionWarnings::setADIMAGEDOWNLOADINTERNALREQUESTEXPIRED(int  aD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED)
{
	this->aD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED = aD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED;
}

int
CatalogsFeedIngestionWarnings::getADIMAGEDOWNLOADINVALIDFILE()
{
	return aD_IMAGE_DOWNLOAD_INVALID_FILE;
}

void
CatalogsFeedIngestionWarnings::setADIMAGEDOWNLOADINVALIDFILE(int  aD_IMAGE_DOWNLOAD_INVALID_FILE)
{
	this->aD_IMAGE_DOWNLOAD_INVALID_FILE = aD_IMAGE_DOWNLOAD_INVALID_FILE;
}

int
CatalogsFeedIngestionWarnings::getADIMAGEDOWNLOADSITEERROR()
{
	return aD_IMAGE_DOWNLOAD_SITE_ERROR;
}

void
CatalogsFeedIngestionWarnings::setADIMAGEDOWNLOADSITEERROR(int  aD_IMAGE_DOWNLOAD_SITE_ERROR)
{
	this->aD_IMAGE_DOWNLOAD_SITE_ERROR = aD_IMAGE_DOWNLOAD_SITE_ERROR;
}

int
CatalogsFeedIngestionWarnings::getADIMAGEDOWNLOADSITETIMEOUT()
{
	return aD_IMAGE_DOWNLOAD_SITE_TIMEOUT;
}

void
CatalogsFeedIngestionWarnings::setADIMAGEDOWNLOADSITETIMEOUT(int  aD_IMAGE_DOWNLOAD_SITE_TIMEOUT)
{
	this->aD_IMAGE_DOWNLOAD_SITE_TIMEOUT = aD_IMAGE_DOWNLOAD_SITE_TIMEOUT;
}

int
CatalogsFeedIngestionWarnings::getADIMAGEDOWNLOADSSLERROR()
{
	return aD_IMAGE_DOWNLOAD_SSL_ERROR;
}

void
CatalogsFeedIngestionWarnings::setADIMAGEDOWNLOADSSLERROR(int  aD_IMAGE_DOWNLOAD_SSL_ERROR)
{
	this->aD_IMAGE_DOWNLOAD_SSL_ERROR = aD_IMAGE_DOWNLOAD_SSL_ERROR;
}

int
CatalogsFeedIngestionWarnings::getADIMAGEDOWNLOADSSLHANDSHAKEERROR()
{
	return aD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR;
}

void
CatalogsFeedIngestionWarnings::setADIMAGEDOWNLOADSSLHANDSHAKEERROR(int  aD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR)
{
	this->aD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR = aD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR;
}

int
CatalogsFeedIngestionWarnings::getADIMAGEPROCESSINGEMPTYFILE()
{
	return aD_IMAGE_PROCESSING_EMPTY_FILE;
}

void
CatalogsFeedIngestionWarnings::setADIMAGEPROCESSINGEMPTYFILE(int  aD_IMAGE_PROCESSING_EMPTY_FILE)
{
	this->aD_IMAGE_PROCESSING_EMPTY_FILE = aD_IMAGE_PROCESSING_EMPTY_FILE;
}

int
CatalogsFeedIngestionWarnings::getADIMAGEPROCESSINGHEIGHTTOOSMALL()
{
	return aD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL;
}

void
CatalogsFeedIngestionWarnings::setADIMAGEPROCESSINGHEIGHTTOOSMALL(int  aD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL)
{
	this->aD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL = aD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL;
}

int
CatalogsFeedIngestionWarnings::getADIMAGEPROCESSINGTOOMANYPIXELS()
{
	return aD_IMAGE_PROCESSING_TOO_MANY_PIXELS;
}

void
CatalogsFeedIngestionWarnings::setADIMAGEPROCESSINGTOOMANYPIXELS(int  aD_IMAGE_PROCESSING_TOO_MANY_PIXELS)
{
	this->aD_IMAGE_PROCESSING_TOO_MANY_PIXELS = aD_IMAGE_PROCESSING_TOO_MANY_PIXELS;
}

int
CatalogsFeedIngestionWarnings::getADIMAGEPROCESSINGTYPEMISMATCH()
{
	return aD_IMAGE_PROCESSING_TYPE_MISMATCH;
}

void
CatalogsFeedIngestionWarnings::setADIMAGEPROCESSINGTYPEMISMATCH(int  aD_IMAGE_PROCESSING_TYPE_MISMATCH)
{
	this->aD_IMAGE_PROCESSING_TYPE_MISMATCH = aD_IMAGE_PROCESSING_TYPE_MISMATCH;
}

int
CatalogsFeedIngestionWarnings::getADIMAGEPROCESSINGWIDTHTOOSMALL()
{
	return aD_IMAGE_PROCESSING_WIDTH_TOO_SMALL;
}

void
CatalogsFeedIngestionWarnings::setADIMAGEPROCESSINGWIDTHTOOSMALL(int  aD_IMAGE_PROCESSING_WIDTH_TOO_SMALL)
{
	this->aD_IMAGE_PROCESSING_WIDTH_TOO_SMALL = aD_IMAGE_PROCESSING_WIDTH_TOO_SMALL;
}

int
CatalogsFeedIngestionWarnings::getADVIDEODOWNLOADCONTENTREADERROR()
{
	return aD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR;
}

void
CatalogsFeedIngestionWarnings::setADVIDEODOWNLOADCONTENTREADERROR(int  aD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR)
{
	this->aD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR = aD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR;
}

int
CatalogsFeedIngestionWarnings::getADVIDEODOWNLOADDNSLOOKUPERROR()
{
	return aD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR;
}

void
CatalogsFeedIngestionWarnings::setADVIDEODOWNLOADDNSLOOKUPERROR(int  aD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR)
{
	this->aD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR = aD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR;
}

int
CatalogsFeedIngestionWarnings::getADVIDEODOWNLOADFILENOTACCESSIBLE()
{
	return aD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE;
}

void
CatalogsFeedIngestionWarnings::setADVIDEODOWNLOADFILENOTACCESSIBLE(int  aD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE)
{
	this->aD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE = aD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE;
}

int
CatalogsFeedIngestionWarnings::getADVIDEODOWNLOADFILENOTFOUND()
{
	return aD_VIDEO_DOWNLOAD_FILE_NOT_FOUND;
}

void
CatalogsFeedIngestionWarnings::setADVIDEODOWNLOADFILENOTFOUND(int  aD_VIDEO_DOWNLOAD_FILE_NOT_FOUND)
{
	this->aD_VIDEO_DOWNLOAD_FILE_NOT_FOUND = aD_VIDEO_DOWNLOAD_FILE_NOT_FOUND;
}

int
CatalogsFeedIngestionWarnings::getADVIDEODOWNLOADHTTPSTATUS400()
{
	return aD_VIDEO_DOWNLOAD_HTTP_STATUS_400;
}

void
CatalogsFeedIngestionWarnings::setADVIDEODOWNLOADHTTPSTATUS400(int  aD_VIDEO_DOWNLOAD_HTTP_STATUS_400)
{
	this->aD_VIDEO_DOWNLOAD_HTTP_STATUS_400 = aD_VIDEO_DOWNLOAD_HTTP_STATUS_400;
}

int
CatalogsFeedIngestionWarnings::getADVIDEODOWNLOADHTTPSTATUS403()
{
	return aD_VIDEO_DOWNLOAD_HTTP_STATUS_403;
}

void
CatalogsFeedIngestionWarnings::setADVIDEODOWNLOADHTTPSTATUS403(int  aD_VIDEO_DOWNLOAD_HTTP_STATUS_403)
{
	this->aD_VIDEO_DOWNLOAD_HTTP_STATUS_403 = aD_VIDEO_DOWNLOAD_HTTP_STATUS_403;
}

int
CatalogsFeedIngestionWarnings::getADVIDEODOWNLOADHTTPSTATUS404()
{
	return aD_VIDEO_DOWNLOAD_HTTP_STATUS_404;
}

void
CatalogsFeedIngestionWarnings::setADVIDEODOWNLOADHTTPSTATUS404(int  aD_VIDEO_DOWNLOAD_HTTP_STATUS_404)
{
	this->aD_VIDEO_DOWNLOAD_HTTP_STATUS_404 = aD_VIDEO_DOWNLOAD_HTTP_STATUS_404;
}

int
CatalogsFeedIngestionWarnings::getADVIDEODOWNLOADHTTPSTATUS405()
{
	return aD_VIDEO_DOWNLOAD_HTTP_STATUS_405;
}

void
CatalogsFeedIngestionWarnings::setADVIDEODOWNLOADHTTPSTATUS405(int  aD_VIDEO_DOWNLOAD_HTTP_STATUS_405)
{
	this->aD_VIDEO_DOWNLOAD_HTTP_STATUS_405 = aD_VIDEO_DOWNLOAD_HTTP_STATUS_405;
}

int
CatalogsFeedIngestionWarnings::getADVIDEODOWNLOADHTTPSTATUS410()
{
	return aD_VIDEO_DOWNLOAD_HTTP_STATUS_410;
}

void
CatalogsFeedIngestionWarnings::setADVIDEODOWNLOADHTTPSTATUS410(int  aD_VIDEO_DOWNLOAD_HTTP_STATUS_410)
{
	this->aD_VIDEO_DOWNLOAD_HTTP_STATUS_410 = aD_VIDEO_DOWNLOAD_HTTP_STATUS_410;
}

int
CatalogsFeedIngestionWarnings::getADVIDEODOWNLOADHTTPSTATUS429()
{
	return aD_VIDEO_DOWNLOAD_HTTP_STATUS_429;
}

void
CatalogsFeedIngestionWarnings::setADVIDEODOWNLOADHTTPSTATUS429(int  aD_VIDEO_DOWNLOAD_HTTP_STATUS_429)
{
	this->aD_VIDEO_DOWNLOAD_HTTP_STATUS_429 = aD_VIDEO_DOWNLOAD_HTTP_STATUS_429;
}

int
CatalogsFeedIngestionWarnings::getADVIDEODOWNLOADHTTPSTATUS500()
{
	return aD_VIDEO_DOWNLOAD_HTTP_STATUS_500;
}

void
CatalogsFeedIngestionWarnings::setADVIDEODOWNLOADHTTPSTATUS500(int  aD_VIDEO_DOWNLOAD_HTTP_STATUS_500)
{
	this->aD_VIDEO_DOWNLOAD_HTTP_STATUS_500 = aD_VIDEO_DOWNLOAD_HTTP_STATUS_500;
}

int
CatalogsFeedIngestionWarnings::getADVIDEODOWNLOADHTTPSTATUS502()
{
	return aD_VIDEO_DOWNLOAD_HTTP_STATUS_502;
}

void
CatalogsFeedIngestionWarnings::setADVIDEODOWNLOADHTTPSTATUS502(int  aD_VIDEO_DOWNLOAD_HTTP_STATUS_502)
{
	this->aD_VIDEO_DOWNLOAD_HTTP_STATUS_502 = aD_VIDEO_DOWNLOAD_HTTP_STATUS_502;
}

int
CatalogsFeedIngestionWarnings::getADVIDEODOWNLOADHTTPSTATUS503()
{
	return aD_VIDEO_DOWNLOAD_HTTP_STATUS_503;
}

void
CatalogsFeedIngestionWarnings::setADVIDEODOWNLOADHTTPSTATUS503(int  aD_VIDEO_DOWNLOAD_HTTP_STATUS_503)
{
	this->aD_VIDEO_DOWNLOAD_HTTP_STATUS_503 = aD_VIDEO_DOWNLOAD_HTTP_STATUS_503;
}

int
CatalogsFeedIngestionWarnings::getADVIDEODOWNLOADHTTPSTATUS504()
{
	return aD_VIDEO_DOWNLOAD_HTTP_STATUS_504;
}

void
CatalogsFeedIngestionWarnings::setADVIDEODOWNLOADHTTPSTATUS504(int  aD_VIDEO_DOWNLOAD_HTTP_STATUS_504)
{
	this->aD_VIDEO_DOWNLOAD_HTTP_STATUS_504 = aD_VIDEO_DOWNLOAD_HTTP_STATUS_504;
}

int
CatalogsFeedIngestionWarnings::getADVIDEODOWNLOADHTTPSTATUS507()
{
	return aD_VIDEO_DOWNLOAD_HTTP_STATUS_507;
}

void
CatalogsFeedIngestionWarnings::setADVIDEODOWNLOADHTTPSTATUS507(int  aD_VIDEO_DOWNLOAD_HTTP_STATUS_507)
{
	this->aD_VIDEO_DOWNLOAD_HTTP_STATUS_507 = aD_VIDEO_DOWNLOAD_HTTP_STATUS_507;
}

int
CatalogsFeedIngestionWarnings::getADVIDEODOWNLOADHTTPSTATUS508()
{
	return aD_VIDEO_DOWNLOAD_HTTP_STATUS_508;
}

void
CatalogsFeedIngestionWarnings::setADVIDEODOWNLOADHTTPSTATUS508(int  aD_VIDEO_DOWNLOAD_HTTP_STATUS_508)
{
	this->aD_VIDEO_DOWNLOAD_HTTP_STATUS_508 = aD_VIDEO_DOWNLOAD_HTTP_STATUS_508;
}

int
CatalogsFeedIngestionWarnings::getADVIDEODOWNLOADHTTPSTATUS520()
{
	return aD_VIDEO_DOWNLOAD_HTTP_STATUS_520;
}

void
CatalogsFeedIngestionWarnings::setADVIDEODOWNLOADHTTPSTATUS520(int  aD_VIDEO_DOWNLOAD_HTTP_STATUS_520)
{
	this->aD_VIDEO_DOWNLOAD_HTTP_STATUS_520 = aD_VIDEO_DOWNLOAD_HTTP_STATUS_520;
}

int
CatalogsFeedIngestionWarnings::getADVIDEODOWNLOADHTTPSTATUS521()
{
	return aD_VIDEO_DOWNLOAD_HTTP_STATUS_521;
}

void
CatalogsFeedIngestionWarnings::setADVIDEODOWNLOADHTTPSTATUS521(int  aD_VIDEO_DOWNLOAD_HTTP_STATUS_521)
{
	this->aD_VIDEO_DOWNLOAD_HTTP_STATUS_521 = aD_VIDEO_DOWNLOAD_HTTP_STATUS_521;
}

int
CatalogsFeedIngestionWarnings::getADVIDEODOWNLOADHTTPSTATUS522()
{
	return aD_VIDEO_DOWNLOAD_HTTP_STATUS_522;
}

void
CatalogsFeedIngestionWarnings::setADVIDEODOWNLOADHTTPSTATUS522(int  aD_VIDEO_DOWNLOAD_HTTP_STATUS_522)
{
	this->aD_VIDEO_DOWNLOAD_HTTP_STATUS_522 = aD_VIDEO_DOWNLOAD_HTTP_STATUS_522;
}

int
CatalogsFeedIngestionWarnings::getADVIDEODOWNLOADHTTPSTATUS525()
{
	return aD_VIDEO_DOWNLOAD_HTTP_STATUS_525;
}

void
CatalogsFeedIngestionWarnings::setADVIDEODOWNLOADHTTPSTATUS525(int  aD_VIDEO_DOWNLOAD_HTTP_STATUS_525)
{
	this->aD_VIDEO_DOWNLOAD_HTTP_STATUS_525 = aD_VIDEO_DOWNLOAD_HTTP_STATUS_525;
}

int
CatalogsFeedIngestionWarnings::getADVIDEODOWNLOADINTERNALCONFIGURATIONERROR()
{
	return aD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR;
}

void
CatalogsFeedIngestionWarnings::setADVIDEODOWNLOADINTERNALCONFIGURATIONERROR(int  aD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR)
{
	this->aD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR = aD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR;
}

int
CatalogsFeedIngestionWarnings::getADVIDEODOWNLOADINTERNALERROR()
{
	return aD_VIDEO_DOWNLOAD_INTERNAL_ERROR;
}

void
CatalogsFeedIngestionWarnings::setADVIDEODOWNLOADINTERNALERROR(int  aD_VIDEO_DOWNLOAD_INTERNAL_ERROR)
{
	this->aD_VIDEO_DOWNLOAD_INTERNAL_ERROR = aD_VIDEO_DOWNLOAD_INTERNAL_ERROR;
}

int
CatalogsFeedIngestionWarnings::getADVIDEODOWNLOADINTERNALFAILEDTODOWNLOAD()
{
	return aD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD;
}

void
CatalogsFeedIngestionWarnings::setADVIDEODOWNLOADINTERNALFAILEDTODOWNLOAD(int  aD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD)
{
	this->aD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD = aD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD;
}

int
CatalogsFeedIngestionWarnings::getADVIDEODOWNLOADINTERNALMALFORMEDURL()
{
	return aD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL;
}

void
CatalogsFeedIngestionWarnings::setADVIDEODOWNLOADINTERNALMALFORMEDURL(int  aD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL)
{
	this->aD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL = aD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL;
}

int
CatalogsFeedIngestionWarnings::getADVIDEODOWNLOADINTERNALRATELIMITED()
{
	return aD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED;
}

void
CatalogsFeedIngestionWarnings::setADVIDEODOWNLOADINTERNALRATELIMITED(int  aD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED)
{
	this->aD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED = aD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED;
}

int
CatalogsFeedIngestionWarnings::getADVIDEODOWNLOADINTERNALREQUESTEXPIRED()
{
	return aD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED;
}

void
CatalogsFeedIngestionWarnings::setADVIDEODOWNLOADINTERNALREQUESTEXPIRED(int  aD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED)
{
	this->aD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED = aD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED;
}

int
CatalogsFeedIngestionWarnings::getADVIDEODOWNLOADINVALIDFILE()
{
	return aD_VIDEO_DOWNLOAD_INVALID_FILE;
}

void
CatalogsFeedIngestionWarnings::setADVIDEODOWNLOADINVALIDFILE(int  aD_VIDEO_DOWNLOAD_INVALID_FILE)
{
	this->aD_VIDEO_DOWNLOAD_INVALID_FILE = aD_VIDEO_DOWNLOAD_INVALID_FILE;
}

int
CatalogsFeedIngestionWarnings::getADVIDEODOWNLOADSITEERROR()
{
	return aD_VIDEO_DOWNLOAD_SITE_ERROR;
}

void
CatalogsFeedIngestionWarnings::setADVIDEODOWNLOADSITEERROR(int  aD_VIDEO_DOWNLOAD_SITE_ERROR)
{
	this->aD_VIDEO_DOWNLOAD_SITE_ERROR = aD_VIDEO_DOWNLOAD_SITE_ERROR;
}

int
CatalogsFeedIngestionWarnings::getADVIDEODOWNLOADSITETIMEOUT()
{
	return aD_VIDEO_DOWNLOAD_SITE_TIMEOUT;
}

void
CatalogsFeedIngestionWarnings::setADVIDEODOWNLOADSITETIMEOUT(int  aD_VIDEO_DOWNLOAD_SITE_TIMEOUT)
{
	this->aD_VIDEO_DOWNLOAD_SITE_TIMEOUT = aD_VIDEO_DOWNLOAD_SITE_TIMEOUT;
}

int
CatalogsFeedIngestionWarnings::getADVIDEODOWNLOADSSLERROR()
{
	return aD_VIDEO_DOWNLOAD_SSL_ERROR;
}

void
CatalogsFeedIngestionWarnings::setADVIDEODOWNLOADSSLERROR(int  aD_VIDEO_DOWNLOAD_SSL_ERROR)
{
	this->aD_VIDEO_DOWNLOAD_SSL_ERROR = aD_VIDEO_DOWNLOAD_SSL_ERROR;
}

int
CatalogsFeedIngestionWarnings::getADVIDEODOWNLOADSSLHANDSHAKEERROR()
{
	return aD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR;
}

void
CatalogsFeedIngestionWarnings::setADVIDEODOWNLOADSSLHANDSHAKEERROR(int  aD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR)
{
	this->aD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR = aD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR;
}

int
CatalogsFeedIngestionWarnings::getADVIDEOLENGTHTOOSHORT()
{
	return aD_VIDEO_LENGTH_TOO_SHORT;
}

void
CatalogsFeedIngestionWarnings::setADVIDEOLENGTHTOOSHORT(int  aD_VIDEO_LENGTH_TOO_SHORT)
{
	this->aD_VIDEO_LENGTH_TOO_SHORT = aD_VIDEO_LENGTH_TOO_SHORT;
}

int
CatalogsFeedIngestionWarnings::getADVIDEOPROCESSINGEMPTYFILE()
{
	return aD_VIDEO_PROCESSING_EMPTY_FILE;
}

void
CatalogsFeedIngestionWarnings::setADVIDEOPROCESSINGEMPTYFILE(int  aD_VIDEO_PROCESSING_EMPTY_FILE)
{
	this->aD_VIDEO_PROCESSING_EMPTY_FILE = aD_VIDEO_PROCESSING_EMPTY_FILE;
}

int
CatalogsFeedIngestionWarnings::getADVIDEOPROCESSINGHEIGHTTOOSMALL()
{
	return aD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL;
}

void
CatalogsFeedIngestionWarnings::setADVIDEOPROCESSINGHEIGHTTOOSMALL(int  aD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL)
{
	this->aD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL = aD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL;
}

int
CatalogsFeedIngestionWarnings::getADVIDEOPROCESSINGTOOMANYPIXELS()
{
	return aD_VIDEO_PROCESSING_TOO_MANY_PIXELS;
}

void
CatalogsFeedIngestionWarnings::setADVIDEOPROCESSINGTOOMANYPIXELS(int  aD_VIDEO_PROCESSING_TOO_MANY_PIXELS)
{
	this->aD_VIDEO_PROCESSING_TOO_MANY_PIXELS = aD_VIDEO_PROCESSING_TOO_MANY_PIXELS;
}

int
CatalogsFeedIngestionWarnings::getADVIDEOPROCESSINGTYPEMISMATCH()
{
	return aD_VIDEO_PROCESSING_TYPE_MISMATCH;
}

void
CatalogsFeedIngestionWarnings::setADVIDEOPROCESSINGTYPEMISMATCH(int  aD_VIDEO_PROCESSING_TYPE_MISMATCH)
{
	this->aD_VIDEO_PROCESSING_TYPE_MISMATCH = aD_VIDEO_PROCESSING_TYPE_MISMATCH;
}

int
CatalogsFeedIngestionWarnings::getADVIDEOPROCESSINGWIDTHTOOSMALL()
{
	return aD_VIDEO_PROCESSING_WIDTH_TOO_SMALL;
}

void
CatalogsFeedIngestionWarnings::setADVIDEOPROCESSINGWIDTHTOOSMALL(int  aD_VIDEO_PROCESSING_WIDTH_TOO_SMALL)
{
	this->aD_VIDEO_PROCESSING_WIDTH_TOO_SMALL = aD_VIDEO_PROCESSING_WIDTH_TOO_SMALL;
}

int
CatalogsFeedIngestionWarnings::getADDITIONALIMAGEFILENOTACCESSIBLE()
{
	return aDDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE;
}

void
CatalogsFeedIngestionWarnings::setADDITIONALIMAGEFILENOTACCESSIBLE(int  aDDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE)
{
	this->aDDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE = aDDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE;
}

int
CatalogsFeedIngestionWarnings::getADDITIONALIMAGEFILENOTFOUND()
{
	return aDDITIONAL_IMAGE_FILE_NOT_FOUND;
}

void
CatalogsFeedIngestionWarnings::setADDITIONALIMAGEFILENOTFOUND(int  aDDITIONAL_IMAGE_FILE_NOT_FOUND)
{
	this->aDDITIONAL_IMAGE_FILE_NOT_FOUND = aDDITIONAL_IMAGE_FILE_NOT_FOUND;
}

int
CatalogsFeedIngestionWarnings::getADDITIONALIMAGEINVALIDFILE()
{
	return aDDITIONAL_IMAGE_INVALID_FILE;
}

void
CatalogsFeedIngestionWarnings::setADDITIONALIMAGEINVALIDFILE(int  aDDITIONAL_IMAGE_INVALID_FILE)
{
	this->aDDITIONAL_IMAGE_INVALID_FILE = aDDITIONAL_IMAGE_INVALID_FILE;
}

int
CatalogsFeedIngestionWarnings::getADDITIONALIMAGELEVELINTERNALERROR()
{
	return aDDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR;
}

void
CatalogsFeedIngestionWarnings::setADDITIONALIMAGELEVELINTERNALERROR(int  aDDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR)
{
	this->aDDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR = aDDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR;
}

int
CatalogsFeedIngestionWarnings::getADDITIONALIMAGEMALFORMEDURL()
{
	return aDDITIONAL_IMAGE_MALFORMED_URL;
}

void
CatalogsFeedIngestionWarnings::setADDITIONALIMAGEMALFORMEDURL(int  aDDITIONAL_IMAGE_MALFORMED_URL)
{
	this->aDDITIONAL_IMAGE_MALFORMED_URL = aDDITIONAL_IMAGE_MALFORMED_URL;
}

int
CatalogsFeedIngestionWarnings::getFETCHGOOGLESHEETPUBLICCANEDIT()
{
	return fETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT;
}

void
CatalogsFeedIngestionWarnings::setFETCHGOOGLESHEETPUBLICCANEDIT(int  fETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT)
{
	this->fETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT = fETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT;
}

int
CatalogsFeedIngestionWarnings::getHOTELPRICEHEADERISPRESENT()
{
	return hOTEL_PRICE_HEADER_IS_PRESENT;
}

void
CatalogsFeedIngestionWarnings::setHOTELPRICEHEADERISPRESENT(int  hOTEL_PRICE_HEADER_IS_PRESENT)
{
	this->hOTEL_PRICE_HEADER_IS_PRESENT = hOTEL_PRICE_HEADER_IS_PRESENT;
}

int
CatalogsFeedIngestionWarnings::getVIDEODOWNLOADVIDEOTOOSHORT()
{
	return vIDEO_DOWNLOAD_VIDEO_TOO_SHORT;
}

void
CatalogsFeedIngestionWarnings::setVIDEODOWNLOADVIDEOTOOSHORT(int  vIDEO_DOWNLOAD_VIDEO_TOO_SHORT)
{
	this->vIDEO_DOWNLOAD_VIDEO_TOO_SHORT = vIDEO_DOWNLOAD_VIDEO_TOO_SHORT;
}

int
CatalogsFeedIngestionWarnings::getVIDEOFILENOTACCESSIBLE()
{
	return vIDEO_FILE_NOT_ACCESSIBLE;
}

void
CatalogsFeedIngestionWarnings::setVIDEOFILENOTACCESSIBLE(int  vIDEO_FILE_NOT_ACCESSIBLE)
{
	this->vIDEO_FILE_NOT_ACCESSIBLE = vIDEO_FILE_NOT_ACCESSIBLE;
}

int
CatalogsFeedIngestionWarnings::getVIDEOFILENOTFOUND()
{
	return vIDEO_FILE_NOT_FOUND;
}

void
CatalogsFeedIngestionWarnings::setVIDEOFILENOTFOUND(int  vIDEO_FILE_NOT_FOUND)
{
	this->vIDEO_FILE_NOT_FOUND = vIDEO_FILE_NOT_FOUND;
}

int
CatalogsFeedIngestionWarnings::getVIDEOINVALIDFILE()
{
	return vIDEO_INVALID_FILE;
}

void
CatalogsFeedIngestionWarnings::setVIDEOINVALIDFILE(int  vIDEO_INVALID_FILE)
{
	this->vIDEO_INVALID_FILE = vIDEO_INVALID_FILE;
}

int
CatalogsFeedIngestionWarnings::getVIDEOLEVELINTERNALERROR()
{
	return vIDEO_LEVEL_INTERNAL_ERROR;
}

void
CatalogsFeedIngestionWarnings::setVIDEOLEVELINTERNALERROR(int  vIDEO_LEVEL_INTERNAL_ERROR)
{
	this->vIDEO_LEVEL_INTERNAL_ERROR = vIDEO_LEVEL_INTERNAL_ERROR;
}

int
CatalogsFeedIngestionWarnings::getVIDEOMALFORMEDURL()
{
	return vIDEO_MALFORMED_URL;
}

void
CatalogsFeedIngestionWarnings::setVIDEOMALFORMEDURL(int  vIDEO_MALFORMED_URL)
{
	this->vIDEO_MALFORMED_URL = vIDEO_MALFORMED_URL;
}



