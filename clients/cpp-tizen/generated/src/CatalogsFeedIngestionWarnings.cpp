#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsFeedIngestionWarnings.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsFeedIngestionWarnings::CatalogsFeedIngestionWarnings()
{
	//__init();
}

CatalogsFeedIngestionWarnings::~CatalogsFeedIngestionWarnings()
{
	//__cleanup();
}

void
CatalogsFeedIngestionWarnings::__init()
{
	//aD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR = int(0);
	//aD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR = int(0);
	//aD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE = int(0);
	//aD_IMAGE_DOWNLOAD_FILE_NOT_FOUND = int(0);
	//aD_IMAGE_DOWNLOAD_HTTP_STATUS_400 = int(0);
	//aD_IMAGE_DOWNLOAD_HTTP_STATUS_403 = int(0);
	//aD_IMAGE_DOWNLOAD_HTTP_STATUS_404 = int(0);
	//aD_IMAGE_DOWNLOAD_HTTP_STATUS_405 = int(0);
	//aD_IMAGE_DOWNLOAD_HTTP_STATUS_410 = int(0);
	//aD_IMAGE_DOWNLOAD_HTTP_STATUS_429 = int(0);
	//aD_IMAGE_DOWNLOAD_HTTP_STATUS_500 = int(0);
	//aD_IMAGE_DOWNLOAD_HTTP_STATUS_502 = int(0);
	//aD_IMAGE_DOWNLOAD_HTTP_STATUS_503 = int(0);
	//aD_IMAGE_DOWNLOAD_HTTP_STATUS_504 = int(0);
	//aD_IMAGE_DOWNLOAD_HTTP_STATUS_507 = int(0);
	//aD_IMAGE_DOWNLOAD_HTTP_STATUS_508 = int(0);
	//aD_IMAGE_DOWNLOAD_HTTP_STATUS_520 = int(0);
	//aD_IMAGE_DOWNLOAD_HTTP_STATUS_521 = int(0);
	//aD_IMAGE_DOWNLOAD_HTTP_STATUS_522 = int(0);
	//aD_IMAGE_DOWNLOAD_HTTP_STATUS_525 = int(0);
	//aD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR = int(0);
	//aD_IMAGE_DOWNLOAD_INTERNAL_ERROR = int(0);
	//aD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD = int(0);
	//aD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL = int(0);
	//aD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED = int(0);
	//aD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED = int(0);
	//aD_IMAGE_DOWNLOAD_INVALID_FILE = int(0);
	//aD_IMAGE_DOWNLOAD_SITE_ERROR = int(0);
	//aD_IMAGE_DOWNLOAD_SITE_TIMEOUT = int(0);
	//aD_IMAGE_DOWNLOAD_SSL_ERROR = int(0);
	//aD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR = int(0);
	//aD_IMAGE_PROCESSING_EMPTY_FILE = int(0);
	//aD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL = int(0);
	//aD_IMAGE_PROCESSING_TOO_MANY_PIXELS = int(0);
	//aD_IMAGE_PROCESSING_TYPE_MISMATCH = int(0);
	//aD_IMAGE_PROCESSING_WIDTH_TOO_SMALL = int(0);
	//aD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR = int(0);
	//aD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR = int(0);
	//aD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE = int(0);
	//aD_VIDEO_DOWNLOAD_FILE_NOT_FOUND = int(0);
	//aD_VIDEO_DOWNLOAD_HTTP_STATUS_400 = int(0);
	//aD_VIDEO_DOWNLOAD_HTTP_STATUS_403 = int(0);
	//aD_VIDEO_DOWNLOAD_HTTP_STATUS_404 = int(0);
	//aD_VIDEO_DOWNLOAD_HTTP_STATUS_405 = int(0);
	//aD_VIDEO_DOWNLOAD_HTTP_STATUS_410 = int(0);
	//aD_VIDEO_DOWNLOAD_HTTP_STATUS_429 = int(0);
	//aD_VIDEO_DOWNLOAD_HTTP_STATUS_500 = int(0);
	//aD_VIDEO_DOWNLOAD_HTTP_STATUS_502 = int(0);
	//aD_VIDEO_DOWNLOAD_HTTP_STATUS_503 = int(0);
	//aD_VIDEO_DOWNLOAD_HTTP_STATUS_504 = int(0);
	//aD_VIDEO_DOWNLOAD_HTTP_STATUS_507 = int(0);
	//aD_VIDEO_DOWNLOAD_HTTP_STATUS_508 = int(0);
	//aD_VIDEO_DOWNLOAD_HTTP_STATUS_520 = int(0);
	//aD_VIDEO_DOWNLOAD_HTTP_STATUS_521 = int(0);
	//aD_VIDEO_DOWNLOAD_HTTP_STATUS_522 = int(0);
	//aD_VIDEO_DOWNLOAD_HTTP_STATUS_525 = int(0);
	//aD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR = int(0);
	//aD_VIDEO_DOWNLOAD_INTERNAL_ERROR = int(0);
	//aD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD = int(0);
	//aD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL = int(0);
	//aD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED = int(0);
	//aD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED = int(0);
	//aD_VIDEO_DOWNLOAD_INVALID_FILE = int(0);
	//aD_VIDEO_DOWNLOAD_SITE_ERROR = int(0);
	//aD_VIDEO_DOWNLOAD_SITE_TIMEOUT = int(0);
	//aD_VIDEO_DOWNLOAD_SSL_ERROR = int(0);
	//aD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR = int(0);
	//aD_VIDEO_LENGTH_TOO_SHORT = int(0);
	//aD_VIDEO_PROCESSING_EMPTY_FILE = int(0);
	//aD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL = int(0);
	//aD_VIDEO_PROCESSING_TOO_MANY_PIXELS = int(0);
	//aD_VIDEO_PROCESSING_TYPE_MISMATCH = int(0);
	//aD_VIDEO_PROCESSING_WIDTH_TOO_SMALL = int(0);
	//aDDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE = int(0);
	//aDDITIONAL_IMAGE_FILE_NOT_FOUND = int(0);
	//aDDITIONAL_IMAGE_INVALID_FILE = int(0);
	//aDDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR = int(0);
	//aDDITIONAL_IMAGE_MALFORMED_URL = int(0);
	//fETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT = int(0);
	//hOTEL_PRICE_HEADER_IS_PRESENT = int(0);
	//vIDEO_DOWNLOAD_VIDEO_TOO_SHORT = int(0);
	//vIDEO_FILE_NOT_ACCESSIBLE = int(0);
	//vIDEO_FILE_NOT_FOUND = int(0);
	//vIDEO_INVALID_FILE = int(0);
	//vIDEO_LEVEL_INTERNAL_ERROR = int(0);
	//vIDEO_MALFORMED_URL = int(0);
}

void
CatalogsFeedIngestionWarnings::__cleanup()
{
	//if(aD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR != NULL) {
	//
	//delete aD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR;
	//aD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR = NULL;
	//}
	//if(aD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR != NULL) {
	//
	//delete aD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR;
	//aD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR = NULL;
	//}
	//if(aD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE != NULL) {
	//
	//delete aD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE;
	//aD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE = NULL;
	//}
	//if(aD_IMAGE_DOWNLOAD_FILE_NOT_FOUND != NULL) {
	//
	//delete aD_IMAGE_DOWNLOAD_FILE_NOT_FOUND;
	//aD_IMAGE_DOWNLOAD_FILE_NOT_FOUND = NULL;
	//}
	//if(aD_IMAGE_DOWNLOAD_HTTP_STATUS_400 != NULL) {
	//
	//delete aD_IMAGE_DOWNLOAD_HTTP_STATUS_400;
	//aD_IMAGE_DOWNLOAD_HTTP_STATUS_400 = NULL;
	//}
	//if(aD_IMAGE_DOWNLOAD_HTTP_STATUS_403 != NULL) {
	//
	//delete aD_IMAGE_DOWNLOAD_HTTP_STATUS_403;
	//aD_IMAGE_DOWNLOAD_HTTP_STATUS_403 = NULL;
	//}
	//if(aD_IMAGE_DOWNLOAD_HTTP_STATUS_404 != NULL) {
	//
	//delete aD_IMAGE_DOWNLOAD_HTTP_STATUS_404;
	//aD_IMAGE_DOWNLOAD_HTTP_STATUS_404 = NULL;
	//}
	//if(aD_IMAGE_DOWNLOAD_HTTP_STATUS_405 != NULL) {
	//
	//delete aD_IMAGE_DOWNLOAD_HTTP_STATUS_405;
	//aD_IMAGE_DOWNLOAD_HTTP_STATUS_405 = NULL;
	//}
	//if(aD_IMAGE_DOWNLOAD_HTTP_STATUS_410 != NULL) {
	//
	//delete aD_IMAGE_DOWNLOAD_HTTP_STATUS_410;
	//aD_IMAGE_DOWNLOAD_HTTP_STATUS_410 = NULL;
	//}
	//if(aD_IMAGE_DOWNLOAD_HTTP_STATUS_429 != NULL) {
	//
	//delete aD_IMAGE_DOWNLOAD_HTTP_STATUS_429;
	//aD_IMAGE_DOWNLOAD_HTTP_STATUS_429 = NULL;
	//}
	//if(aD_IMAGE_DOWNLOAD_HTTP_STATUS_500 != NULL) {
	//
	//delete aD_IMAGE_DOWNLOAD_HTTP_STATUS_500;
	//aD_IMAGE_DOWNLOAD_HTTP_STATUS_500 = NULL;
	//}
	//if(aD_IMAGE_DOWNLOAD_HTTP_STATUS_502 != NULL) {
	//
	//delete aD_IMAGE_DOWNLOAD_HTTP_STATUS_502;
	//aD_IMAGE_DOWNLOAD_HTTP_STATUS_502 = NULL;
	//}
	//if(aD_IMAGE_DOWNLOAD_HTTP_STATUS_503 != NULL) {
	//
	//delete aD_IMAGE_DOWNLOAD_HTTP_STATUS_503;
	//aD_IMAGE_DOWNLOAD_HTTP_STATUS_503 = NULL;
	//}
	//if(aD_IMAGE_DOWNLOAD_HTTP_STATUS_504 != NULL) {
	//
	//delete aD_IMAGE_DOWNLOAD_HTTP_STATUS_504;
	//aD_IMAGE_DOWNLOAD_HTTP_STATUS_504 = NULL;
	//}
	//if(aD_IMAGE_DOWNLOAD_HTTP_STATUS_507 != NULL) {
	//
	//delete aD_IMAGE_DOWNLOAD_HTTP_STATUS_507;
	//aD_IMAGE_DOWNLOAD_HTTP_STATUS_507 = NULL;
	//}
	//if(aD_IMAGE_DOWNLOAD_HTTP_STATUS_508 != NULL) {
	//
	//delete aD_IMAGE_DOWNLOAD_HTTP_STATUS_508;
	//aD_IMAGE_DOWNLOAD_HTTP_STATUS_508 = NULL;
	//}
	//if(aD_IMAGE_DOWNLOAD_HTTP_STATUS_520 != NULL) {
	//
	//delete aD_IMAGE_DOWNLOAD_HTTP_STATUS_520;
	//aD_IMAGE_DOWNLOAD_HTTP_STATUS_520 = NULL;
	//}
	//if(aD_IMAGE_DOWNLOAD_HTTP_STATUS_521 != NULL) {
	//
	//delete aD_IMAGE_DOWNLOAD_HTTP_STATUS_521;
	//aD_IMAGE_DOWNLOAD_HTTP_STATUS_521 = NULL;
	//}
	//if(aD_IMAGE_DOWNLOAD_HTTP_STATUS_522 != NULL) {
	//
	//delete aD_IMAGE_DOWNLOAD_HTTP_STATUS_522;
	//aD_IMAGE_DOWNLOAD_HTTP_STATUS_522 = NULL;
	//}
	//if(aD_IMAGE_DOWNLOAD_HTTP_STATUS_525 != NULL) {
	//
	//delete aD_IMAGE_DOWNLOAD_HTTP_STATUS_525;
	//aD_IMAGE_DOWNLOAD_HTTP_STATUS_525 = NULL;
	//}
	//if(aD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR != NULL) {
	//
	//delete aD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR;
	//aD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR = NULL;
	//}
	//if(aD_IMAGE_DOWNLOAD_INTERNAL_ERROR != NULL) {
	//
	//delete aD_IMAGE_DOWNLOAD_INTERNAL_ERROR;
	//aD_IMAGE_DOWNLOAD_INTERNAL_ERROR = NULL;
	//}
	//if(aD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD != NULL) {
	//
	//delete aD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD;
	//aD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD = NULL;
	//}
	//if(aD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL != NULL) {
	//
	//delete aD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL;
	//aD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL = NULL;
	//}
	//if(aD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED != NULL) {
	//
	//delete aD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED;
	//aD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED = NULL;
	//}
	//if(aD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED != NULL) {
	//
	//delete aD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED;
	//aD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED = NULL;
	//}
	//if(aD_IMAGE_DOWNLOAD_INVALID_FILE != NULL) {
	//
	//delete aD_IMAGE_DOWNLOAD_INVALID_FILE;
	//aD_IMAGE_DOWNLOAD_INVALID_FILE = NULL;
	//}
	//if(aD_IMAGE_DOWNLOAD_SITE_ERROR != NULL) {
	//
	//delete aD_IMAGE_DOWNLOAD_SITE_ERROR;
	//aD_IMAGE_DOWNLOAD_SITE_ERROR = NULL;
	//}
	//if(aD_IMAGE_DOWNLOAD_SITE_TIMEOUT != NULL) {
	//
	//delete aD_IMAGE_DOWNLOAD_SITE_TIMEOUT;
	//aD_IMAGE_DOWNLOAD_SITE_TIMEOUT = NULL;
	//}
	//if(aD_IMAGE_DOWNLOAD_SSL_ERROR != NULL) {
	//
	//delete aD_IMAGE_DOWNLOAD_SSL_ERROR;
	//aD_IMAGE_DOWNLOAD_SSL_ERROR = NULL;
	//}
	//if(aD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR != NULL) {
	//
	//delete aD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR;
	//aD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR = NULL;
	//}
	//if(aD_IMAGE_PROCESSING_EMPTY_FILE != NULL) {
	//
	//delete aD_IMAGE_PROCESSING_EMPTY_FILE;
	//aD_IMAGE_PROCESSING_EMPTY_FILE = NULL;
	//}
	//if(aD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL != NULL) {
	//
	//delete aD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL;
	//aD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL = NULL;
	//}
	//if(aD_IMAGE_PROCESSING_TOO_MANY_PIXELS != NULL) {
	//
	//delete aD_IMAGE_PROCESSING_TOO_MANY_PIXELS;
	//aD_IMAGE_PROCESSING_TOO_MANY_PIXELS = NULL;
	//}
	//if(aD_IMAGE_PROCESSING_TYPE_MISMATCH != NULL) {
	//
	//delete aD_IMAGE_PROCESSING_TYPE_MISMATCH;
	//aD_IMAGE_PROCESSING_TYPE_MISMATCH = NULL;
	//}
	//if(aD_IMAGE_PROCESSING_WIDTH_TOO_SMALL != NULL) {
	//
	//delete aD_IMAGE_PROCESSING_WIDTH_TOO_SMALL;
	//aD_IMAGE_PROCESSING_WIDTH_TOO_SMALL = NULL;
	//}
	//if(aD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR != NULL) {
	//
	//delete aD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR;
	//aD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR = NULL;
	//}
	//if(aD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR != NULL) {
	//
	//delete aD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR;
	//aD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR = NULL;
	//}
	//if(aD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE != NULL) {
	//
	//delete aD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE;
	//aD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE = NULL;
	//}
	//if(aD_VIDEO_DOWNLOAD_FILE_NOT_FOUND != NULL) {
	//
	//delete aD_VIDEO_DOWNLOAD_FILE_NOT_FOUND;
	//aD_VIDEO_DOWNLOAD_FILE_NOT_FOUND = NULL;
	//}
	//if(aD_VIDEO_DOWNLOAD_HTTP_STATUS_400 != NULL) {
	//
	//delete aD_VIDEO_DOWNLOAD_HTTP_STATUS_400;
	//aD_VIDEO_DOWNLOAD_HTTP_STATUS_400 = NULL;
	//}
	//if(aD_VIDEO_DOWNLOAD_HTTP_STATUS_403 != NULL) {
	//
	//delete aD_VIDEO_DOWNLOAD_HTTP_STATUS_403;
	//aD_VIDEO_DOWNLOAD_HTTP_STATUS_403 = NULL;
	//}
	//if(aD_VIDEO_DOWNLOAD_HTTP_STATUS_404 != NULL) {
	//
	//delete aD_VIDEO_DOWNLOAD_HTTP_STATUS_404;
	//aD_VIDEO_DOWNLOAD_HTTP_STATUS_404 = NULL;
	//}
	//if(aD_VIDEO_DOWNLOAD_HTTP_STATUS_405 != NULL) {
	//
	//delete aD_VIDEO_DOWNLOAD_HTTP_STATUS_405;
	//aD_VIDEO_DOWNLOAD_HTTP_STATUS_405 = NULL;
	//}
	//if(aD_VIDEO_DOWNLOAD_HTTP_STATUS_410 != NULL) {
	//
	//delete aD_VIDEO_DOWNLOAD_HTTP_STATUS_410;
	//aD_VIDEO_DOWNLOAD_HTTP_STATUS_410 = NULL;
	//}
	//if(aD_VIDEO_DOWNLOAD_HTTP_STATUS_429 != NULL) {
	//
	//delete aD_VIDEO_DOWNLOAD_HTTP_STATUS_429;
	//aD_VIDEO_DOWNLOAD_HTTP_STATUS_429 = NULL;
	//}
	//if(aD_VIDEO_DOWNLOAD_HTTP_STATUS_500 != NULL) {
	//
	//delete aD_VIDEO_DOWNLOAD_HTTP_STATUS_500;
	//aD_VIDEO_DOWNLOAD_HTTP_STATUS_500 = NULL;
	//}
	//if(aD_VIDEO_DOWNLOAD_HTTP_STATUS_502 != NULL) {
	//
	//delete aD_VIDEO_DOWNLOAD_HTTP_STATUS_502;
	//aD_VIDEO_DOWNLOAD_HTTP_STATUS_502 = NULL;
	//}
	//if(aD_VIDEO_DOWNLOAD_HTTP_STATUS_503 != NULL) {
	//
	//delete aD_VIDEO_DOWNLOAD_HTTP_STATUS_503;
	//aD_VIDEO_DOWNLOAD_HTTP_STATUS_503 = NULL;
	//}
	//if(aD_VIDEO_DOWNLOAD_HTTP_STATUS_504 != NULL) {
	//
	//delete aD_VIDEO_DOWNLOAD_HTTP_STATUS_504;
	//aD_VIDEO_DOWNLOAD_HTTP_STATUS_504 = NULL;
	//}
	//if(aD_VIDEO_DOWNLOAD_HTTP_STATUS_507 != NULL) {
	//
	//delete aD_VIDEO_DOWNLOAD_HTTP_STATUS_507;
	//aD_VIDEO_DOWNLOAD_HTTP_STATUS_507 = NULL;
	//}
	//if(aD_VIDEO_DOWNLOAD_HTTP_STATUS_508 != NULL) {
	//
	//delete aD_VIDEO_DOWNLOAD_HTTP_STATUS_508;
	//aD_VIDEO_DOWNLOAD_HTTP_STATUS_508 = NULL;
	//}
	//if(aD_VIDEO_DOWNLOAD_HTTP_STATUS_520 != NULL) {
	//
	//delete aD_VIDEO_DOWNLOAD_HTTP_STATUS_520;
	//aD_VIDEO_DOWNLOAD_HTTP_STATUS_520 = NULL;
	//}
	//if(aD_VIDEO_DOWNLOAD_HTTP_STATUS_521 != NULL) {
	//
	//delete aD_VIDEO_DOWNLOAD_HTTP_STATUS_521;
	//aD_VIDEO_DOWNLOAD_HTTP_STATUS_521 = NULL;
	//}
	//if(aD_VIDEO_DOWNLOAD_HTTP_STATUS_522 != NULL) {
	//
	//delete aD_VIDEO_DOWNLOAD_HTTP_STATUS_522;
	//aD_VIDEO_DOWNLOAD_HTTP_STATUS_522 = NULL;
	//}
	//if(aD_VIDEO_DOWNLOAD_HTTP_STATUS_525 != NULL) {
	//
	//delete aD_VIDEO_DOWNLOAD_HTTP_STATUS_525;
	//aD_VIDEO_DOWNLOAD_HTTP_STATUS_525 = NULL;
	//}
	//if(aD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR != NULL) {
	//
	//delete aD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR;
	//aD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR = NULL;
	//}
	//if(aD_VIDEO_DOWNLOAD_INTERNAL_ERROR != NULL) {
	//
	//delete aD_VIDEO_DOWNLOAD_INTERNAL_ERROR;
	//aD_VIDEO_DOWNLOAD_INTERNAL_ERROR = NULL;
	//}
	//if(aD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD != NULL) {
	//
	//delete aD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD;
	//aD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD = NULL;
	//}
	//if(aD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL != NULL) {
	//
	//delete aD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL;
	//aD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL = NULL;
	//}
	//if(aD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED != NULL) {
	//
	//delete aD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED;
	//aD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED = NULL;
	//}
	//if(aD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED != NULL) {
	//
	//delete aD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED;
	//aD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED = NULL;
	//}
	//if(aD_VIDEO_DOWNLOAD_INVALID_FILE != NULL) {
	//
	//delete aD_VIDEO_DOWNLOAD_INVALID_FILE;
	//aD_VIDEO_DOWNLOAD_INVALID_FILE = NULL;
	//}
	//if(aD_VIDEO_DOWNLOAD_SITE_ERROR != NULL) {
	//
	//delete aD_VIDEO_DOWNLOAD_SITE_ERROR;
	//aD_VIDEO_DOWNLOAD_SITE_ERROR = NULL;
	//}
	//if(aD_VIDEO_DOWNLOAD_SITE_TIMEOUT != NULL) {
	//
	//delete aD_VIDEO_DOWNLOAD_SITE_TIMEOUT;
	//aD_VIDEO_DOWNLOAD_SITE_TIMEOUT = NULL;
	//}
	//if(aD_VIDEO_DOWNLOAD_SSL_ERROR != NULL) {
	//
	//delete aD_VIDEO_DOWNLOAD_SSL_ERROR;
	//aD_VIDEO_DOWNLOAD_SSL_ERROR = NULL;
	//}
	//if(aD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR != NULL) {
	//
	//delete aD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR;
	//aD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR = NULL;
	//}
	//if(aD_VIDEO_LENGTH_TOO_SHORT != NULL) {
	//
	//delete aD_VIDEO_LENGTH_TOO_SHORT;
	//aD_VIDEO_LENGTH_TOO_SHORT = NULL;
	//}
	//if(aD_VIDEO_PROCESSING_EMPTY_FILE != NULL) {
	//
	//delete aD_VIDEO_PROCESSING_EMPTY_FILE;
	//aD_VIDEO_PROCESSING_EMPTY_FILE = NULL;
	//}
	//if(aD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL != NULL) {
	//
	//delete aD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL;
	//aD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL = NULL;
	//}
	//if(aD_VIDEO_PROCESSING_TOO_MANY_PIXELS != NULL) {
	//
	//delete aD_VIDEO_PROCESSING_TOO_MANY_PIXELS;
	//aD_VIDEO_PROCESSING_TOO_MANY_PIXELS = NULL;
	//}
	//if(aD_VIDEO_PROCESSING_TYPE_MISMATCH != NULL) {
	//
	//delete aD_VIDEO_PROCESSING_TYPE_MISMATCH;
	//aD_VIDEO_PROCESSING_TYPE_MISMATCH = NULL;
	//}
	//if(aD_VIDEO_PROCESSING_WIDTH_TOO_SMALL != NULL) {
	//
	//delete aD_VIDEO_PROCESSING_WIDTH_TOO_SMALL;
	//aD_VIDEO_PROCESSING_WIDTH_TOO_SMALL = NULL;
	//}
	//if(aDDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE != NULL) {
	//
	//delete aDDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE;
	//aDDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE = NULL;
	//}
	//if(aDDITIONAL_IMAGE_FILE_NOT_FOUND != NULL) {
	//
	//delete aDDITIONAL_IMAGE_FILE_NOT_FOUND;
	//aDDITIONAL_IMAGE_FILE_NOT_FOUND = NULL;
	//}
	//if(aDDITIONAL_IMAGE_INVALID_FILE != NULL) {
	//
	//delete aDDITIONAL_IMAGE_INVALID_FILE;
	//aDDITIONAL_IMAGE_INVALID_FILE = NULL;
	//}
	//if(aDDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR != NULL) {
	//
	//delete aDDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR;
	//aDDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR = NULL;
	//}
	//if(aDDITIONAL_IMAGE_MALFORMED_URL != NULL) {
	//
	//delete aDDITIONAL_IMAGE_MALFORMED_URL;
	//aDDITIONAL_IMAGE_MALFORMED_URL = NULL;
	//}
	//if(fETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT != NULL) {
	//
	//delete fETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT;
	//fETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT = NULL;
	//}
	//if(hOTEL_PRICE_HEADER_IS_PRESENT != NULL) {
	//
	//delete hOTEL_PRICE_HEADER_IS_PRESENT;
	//hOTEL_PRICE_HEADER_IS_PRESENT = NULL;
	//}
	//if(vIDEO_DOWNLOAD_VIDEO_TOO_SHORT != NULL) {
	//
	//delete vIDEO_DOWNLOAD_VIDEO_TOO_SHORT;
	//vIDEO_DOWNLOAD_VIDEO_TOO_SHORT = NULL;
	//}
	//if(vIDEO_FILE_NOT_ACCESSIBLE != NULL) {
	//
	//delete vIDEO_FILE_NOT_ACCESSIBLE;
	//vIDEO_FILE_NOT_ACCESSIBLE = NULL;
	//}
	//if(vIDEO_FILE_NOT_FOUND != NULL) {
	//
	//delete vIDEO_FILE_NOT_FOUND;
	//vIDEO_FILE_NOT_FOUND = NULL;
	//}
	//if(vIDEO_INVALID_FILE != NULL) {
	//
	//delete vIDEO_INVALID_FILE;
	//vIDEO_INVALID_FILE = NULL;
	//}
	//if(vIDEO_LEVEL_INTERNAL_ERROR != NULL) {
	//
	//delete vIDEO_LEVEL_INTERNAL_ERROR;
	//vIDEO_LEVEL_INTERNAL_ERROR = NULL;
	//}
	//if(vIDEO_MALFORMED_URL != NULL) {
	//
	//delete vIDEO_MALFORMED_URL;
	//vIDEO_MALFORMED_URL = NULL;
	//}
	//
}

void
CatalogsFeedIngestionWarnings::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *aD_IMAGE_DOWNLOAD_CONTENT_READ_ERRORKey = "AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR";
	node = json_object_get_member(pJsonObject, aD_IMAGE_DOWNLOAD_CONTENT_READ_ERRORKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERRORKey = "AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR";
	node = json_object_get_member(pJsonObject, aD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERRORKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLEKey = "AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE";
	node = json_object_get_member(pJsonObject, aD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLEKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_IMAGE_DOWNLOAD_FILE_NOT_FOUNDKey = "AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND";
	node = json_object_get_member(pJsonObject, aD_IMAGE_DOWNLOAD_FILE_NOT_FOUNDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_IMAGE_DOWNLOAD_FILE_NOT_FOUND, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_IMAGE_DOWNLOAD_HTTP_STATUS_400Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_400";
	node = json_object_get_member(pJsonObject, aD_IMAGE_DOWNLOAD_HTTP_STATUS_400Key);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_IMAGE_DOWNLOAD_HTTP_STATUS_400, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_IMAGE_DOWNLOAD_HTTP_STATUS_403Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_403";
	node = json_object_get_member(pJsonObject, aD_IMAGE_DOWNLOAD_HTTP_STATUS_403Key);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_IMAGE_DOWNLOAD_HTTP_STATUS_403, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_IMAGE_DOWNLOAD_HTTP_STATUS_404Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_404";
	node = json_object_get_member(pJsonObject, aD_IMAGE_DOWNLOAD_HTTP_STATUS_404Key);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_IMAGE_DOWNLOAD_HTTP_STATUS_404, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_IMAGE_DOWNLOAD_HTTP_STATUS_405Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_405";
	node = json_object_get_member(pJsonObject, aD_IMAGE_DOWNLOAD_HTTP_STATUS_405Key);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_IMAGE_DOWNLOAD_HTTP_STATUS_405, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_IMAGE_DOWNLOAD_HTTP_STATUS_410Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_410";
	node = json_object_get_member(pJsonObject, aD_IMAGE_DOWNLOAD_HTTP_STATUS_410Key);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_IMAGE_DOWNLOAD_HTTP_STATUS_410, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_IMAGE_DOWNLOAD_HTTP_STATUS_429Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_429";
	node = json_object_get_member(pJsonObject, aD_IMAGE_DOWNLOAD_HTTP_STATUS_429Key);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_IMAGE_DOWNLOAD_HTTP_STATUS_429, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_IMAGE_DOWNLOAD_HTTP_STATUS_500Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_500";
	node = json_object_get_member(pJsonObject, aD_IMAGE_DOWNLOAD_HTTP_STATUS_500Key);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_IMAGE_DOWNLOAD_HTTP_STATUS_500, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_IMAGE_DOWNLOAD_HTTP_STATUS_502Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_502";
	node = json_object_get_member(pJsonObject, aD_IMAGE_DOWNLOAD_HTTP_STATUS_502Key);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_IMAGE_DOWNLOAD_HTTP_STATUS_502, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_IMAGE_DOWNLOAD_HTTP_STATUS_503Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_503";
	node = json_object_get_member(pJsonObject, aD_IMAGE_DOWNLOAD_HTTP_STATUS_503Key);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_IMAGE_DOWNLOAD_HTTP_STATUS_503, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_IMAGE_DOWNLOAD_HTTP_STATUS_504Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_504";
	node = json_object_get_member(pJsonObject, aD_IMAGE_DOWNLOAD_HTTP_STATUS_504Key);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_IMAGE_DOWNLOAD_HTTP_STATUS_504, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_IMAGE_DOWNLOAD_HTTP_STATUS_507Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_507";
	node = json_object_get_member(pJsonObject, aD_IMAGE_DOWNLOAD_HTTP_STATUS_507Key);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_IMAGE_DOWNLOAD_HTTP_STATUS_507, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_IMAGE_DOWNLOAD_HTTP_STATUS_508Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_508";
	node = json_object_get_member(pJsonObject, aD_IMAGE_DOWNLOAD_HTTP_STATUS_508Key);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_IMAGE_DOWNLOAD_HTTP_STATUS_508, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_IMAGE_DOWNLOAD_HTTP_STATUS_520Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_520";
	node = json_object_get_member(pJsonObject, aD_IMAGE_DOWNLOAD_HTTP_STATUS_520Key);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_IMAGE_DOWNLOAD_HTTP_STATUS_520, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_IMAGE_DOWNLOAD_HTTP_STATUS_521Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_521";
	node = json_object_get_member(pJsonObject, aD_IMAGE_DOWNLOAD_HTTP_STATUS_521Key);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_IMAGE_DOWNLOAD_HTTP_STATUS_521, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_IMAGE_DOWNLOAD_HTTP_STATUS_522Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_522";
	node = json_object_get_member(pJsonObject, aD_IMAGE_DOWNLOAD_HTTP_STATUS_522Key);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_IMAGE_DOWNLOAD_HTTP_STATUS_522, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_IMAGE_DOWNLOAD_HTTP_STATUS_525Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_525";
	node = json_object_get_member(pJsonObject, aD_IMAGE_DOWNLOAD_HTTP_STATUS_525Key);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_IMAGE_DOWNLOAD_HTTP_STATUS_525, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERRORKey = "AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR";
	node = json_object_get_member(pJsonObject, aD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERRORKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_IMAGE_DOWNLOAD_INTERNAL_ERRORKey = "AD_IMAGE_DOWNLOAD_INTERNAL_ERROR";
	node = json_object_get_member(pJsonObject, aD_IMAGE_DOWNLOAD_INTERNAL_ERRORKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_IMAGE_DOWNLOAD_INTERNAL_ERROR, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOADKey = "AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD";
	node = json_object_get_member(pJsonObject, aD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOADKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URLKey = "AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL";
	node = json_object_get_member(pJsonObject, aD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URLKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITEDKey = "AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED";
	node = json_object_get_member(pJsonObject, aD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITEDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIREDKey = "AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED";
	node = json_object_get_member(pJsonObject, aD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIREDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_IMAGE_DOWNLOAD_INVALID_FILEKey = "AD_IMAGE_DOWNLOAD_INVALID_FILE";
	node = json_object_get_member(pJsonObject, aD_IMAGE_DOWNLOAD_INVALID_FILEKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_IMAGE_DOWNLOAD_INVALID_FILE, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_IMAGE_DOWNLOAD_SITE_ERRORKey = "AD_IMAGE_DOWNLOAD_SITE_ERROR";
	node = json_object_get_member(pJsonObject, aD_IMAGE_DOWNLOAD_SITE_ERRORKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_IMAGE_DOWNLOAD_SITE_ERROR, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_IMAGE_DOWNLOAD_SITE_TIMEOUTKey = "AD_IMAGE_DOWNLOAD_SITE_TIMEOUT";
	node = json_object_get_member(pJsonObject, aD_IMAGE_DOWNLOAD_SITE_TIMEOUTKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_IMAGE_DOWNLOAD_SITE_TIMEOUT, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_IMAGE_DOWNLOAD_SSL_ERRORKey = "AD_IMAGE_DOWNLOAD_SSL_ERROR";
	node = json_object_get_member(pJsonObject, aD_IMAGE_DOWNLOAD_SSL_ERRORKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_IMAGE_DOWNLOAD_SSL_ERROR, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERRORKey = "AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR";
	node = json_object_get_member(pJsonObject, aD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERRORKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_IMAGE_PROCESSING_EMPTY_FILEKey = "AD_IMAGE_PROCESSING_EMPTY_FILE";
	node = json_object_get_member(pJsonObject, aD_IMAGE_PROCESSING_EMPTY_FILEKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_IMAGE_PROCESSING_EMPTY_FILE, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_IMAGE_PROCESSING_HEIGHT_TOO_SMALLKey = "AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL";
	node = json_object_get_member(pJsonObject, aD_IMAGE_PROCESSING_HEIGHT_TOO_SMALLKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_IMAGE_PROCESSING_TOO_MANY_PIXELSKey = "AD_IMAGE_PROCESSING_TOO_MANY_PIXELS";
	node = json_object_get_member(pJsonObject, aD_IMAGE_PROCESSING_TOO_MANY_PIXELSKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_IMAGE_PROCESSING_TOO_MANY_PIXELS, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_IMAGE_PROCESSING_TYPE_MISMATCHKey = "AD_IMAGE_PROCESSING_TYPE_MISMATCH";
	node = json_object_get_member(pJsonObject, aD_IMAGE_PROCESSING_TYPE_MISMATCHKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_IMAGE_PROCESSING_TYPE_MISMATCH, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_IMAGE_PROCESSING_WIDTH_TOO_SMALLKey = "AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL";
	node = json_object_get_member(pJsonObject, aD_IMAGE_PROCESSING_WIDTH_TOO_SMALLKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_IMAGE_PROCESSING_WIDTH_TOO_SMALL, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_VIDEO_DOWNLOAD_CONTENT_READ_ERRORKey = "AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR";
	node = json_object_get_member(pJsonObject, aD_VIDEO_DOWNLOAD_CONTENT_READ_ERRORKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERRORKey = "AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR";
	node = json_object_get_member(pJsonObject, aD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERRORKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLEKey = "AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE";
	node = json_object_get_member(pJsonObject, aD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLEKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_VIDEO_DOWNLOAD_FILE_NOT_FOUNDKey = "AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND";
	node = json_object_get_member(pJsonObject, aD_VIDEO_DOWNLOAD_FILE_NOT_FOUNDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_VIDEO_DOWNLOAD_FILE_NOT_FOUND, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_VIDEO_DOWNLOAD_HTTP_STATUS_400Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_400";
	node = json_object_get_member(pJsonObject, aD_VIDEO_DOWNLOAD_HTTP_STATUS_400Key);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_VIDEO_DOWNLOAD_HTTP_STATUS_400, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_VIDEO_DOWNLOAD_HTTP_STATUS_403Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_403";
	node = json_object_get_member(pJsonObject, aD_VIDEO_DOWNLOAD_HTTP_STATUS_403Key);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_VIDEO_DOWNLOAD_HTTP_STATUS_403, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_VIDEO_DOWNLOAD_HTTP_STATUS_404Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_404";
	node = json_object_get_member(pJsonObject, aD_VIDEO_DOWNLOAD_HTTP_STATUS_404Key);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_VIDEO_DOWNLOAD_HTTP_STATUS_404, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_VIDEO_DOWNLOAD_HTTP_STATUS_405Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_405";
	node = json_object_get_member(pJsonObject, aD_VIDEO_DOWNLOAD_HTTP_STATUS_405Key);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_VIDEO_DOWNLOAD_HTTP_STATUS_405, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_VIDEO_DOWNLOAD_HTTP_STATUS_410Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_410";
	node = json_object_get_member(pJsonObject, aD_VIDEO_DOWNLOAD_HTTP_STATUS_410Key);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_VIDEO_DOWNLOAD_HTTP_STATUS_410, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_VIDEO_DOWNLOAD_HTTP_STATUS_429Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_429";
	node = json_object_get_member(pJsonObject, aD_VIDEO_DOWNLOAD_HTTP_STATUS_429Key);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_VIDEO_DOWNLOAD_HTTP_STATUS_429, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_VIDEO_DOWNLOAD_HTTP_STATUS_500Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_500";
	node = json_object_get_member(pJsonObject, aD_VIDEO_DOWNLOAD_HTTP_STATUS_500Key);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_VIDEO_DOWNLOAD_HTTP_STATUS_500, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_VIDEO_DOWNLOAD_HTTP_STATUS_502Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_502";
	node = json_object_get_member(pJsonObject, aD_VIDEO_DOWNLOAD_HTTP_STATUS_502Key);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_VIDEO_DOWNLOAD_HTTP_STATUS_502, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_VIDEO_DOWNLOAD_HTTP_STATUS_503Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_503";
	node = json_object_get_member(pJsonObject, aD_VIDEO_DOWNLOAD_HTTP_STATUS_503Key);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_VIDEO_DOWNLOAD_HTTP_STATUS_503, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_VIDEO_DOWNLOAD_HTTP_STATUS_504Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_504";
	node = json_object_get_member(pJsonObject, aD_VIDEO_DOWNLOAD_HTTP_STATUS_504Key);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_VIDEO_DOWNLOAD_HTTP_STATUS_504, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_VIDEO_DOWNLOAD_HTTP_STATUS_507Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_507";
	node = json_object_get_member(pJsonObject, aD_VIDEO_DOWNLOAD_HTTP_STATUS_507Key);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_VIDEO_DOWNLOAD_HTTP_STATUS_507, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_VIDEO_DOWNLOAD_HTTP_STATUS_508Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_508";
	node = json_object_get_member(pJsonObject, aD_VIDEO_DOWNLOAD_HTTP_STATUS_508Key);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_VIDEO_DOWNLOAD_HTTP_STATUS_508, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_VIDEO_DOWNLOAD_HTTP_STATUS_520Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_520";
	node = json_object_get_member(pJsonObject, aD_VIDEO_DOWNLOAD_HTTP_STATUS_520Key);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_VIDEO_DOWNLOAD_HTTP_STATUS_520, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_VIDEO_DOWNLOAD_HTTP_STATUS_521Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_521";
	node = json_object_get_member(pJsonObject, aD_VIDEO_DOWNLOAD_HTTP_STATUS_521Key);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_VIDEO_DOWNLOAD_HTTP_STATUS_521, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_VIDEO_DOWNLOAD_HTTP_STATUS_522Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_522";
	node = json_object_get_member(pJsonObject, aD_VIDEO_DOWNLOAD_HTTP_STATUS_522Key);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_VIDEO_DOWNLOAD_HTTP_STATUS_522, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_VIDEO_DOWNLOAD_HTTP_STATUS_525Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_525";
	node = json_object_get_member(pJsonObject, aD_VIDEO_DOWNLOAD_HTTP_STATUS_525Key);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_VIDEO_DOWNLOAD_HTTP_STATUS_525, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERRORKey = "AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR";
	node = json_object_get_member(pJsonObject, aD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERRORKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_VIDEO_DOWNLOAD_INTERNAL_ERRORKey = "AD_VIDEO_DOWNLOAD_INTERNAL_ERROR";
	node = json_object_get_member(pJsonObject, aD_VIDEO_DOWNLOAD_INTERNAL_ERRORKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_VIDEO_DOWNLOAD_INTERNAL_ERROR, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOADKey = "AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD";
	node = json_object_get_member(pJsonObject, aD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOADKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URLKey = "AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL";
	node = json_object_get_member(pJsonObject, aD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URLKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITEDKey = "AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED";
	node = json_object_get_member(pJsonObject, aD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITEDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIREDKey = "AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED";
	node = json_object_get_member(pJsonObject, aD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIREDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_VIDEO_DOWNLOAD_INVALID_FILEKey = "AD_VIDEO_DOWNLOAD_INVALID_FILE";
	node = json_object_get_member(pJsonObject, aD_VIDEO_DOWNLOAD_INVALID_FILEKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_VIDEO_DOWNLOAD_INVALID_FILE, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_VIDEO_DOWNLOAD_SITE_ERRORKey = "AD_VIDEO_DOWNLOAD_SITE_ERROR";
	node = json_object_get_member(pJsonObject, aD_VIDEO_DOWNLOAD_SITE_ERRORKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_VIDEO_DOWNLOAD_SITE_ERROR, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_VIDEO_DOWNLOAD_SITE_TIMEOUTKey = "AD_VIDEO_DOWNLOAD_SITE_TIMEOUT";
	node = json_object_get_member(pJsonObject, aD_VIDEO_DOWNLOAD_SITE_TIMEOUTKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_VIDEO_DOWNLOAD_SITE_TIMEOUT, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_VIDEO_DOWNLOAD_SSL_ERRORKey = "AD_VIDEO_DOWNLOAD_SSL_ERROR";
	node = json_object_get_member(pJsonObject, aD_VIDEO_DOWNLOAD_SSL_ERRORKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_VIDEO_DOWNLOAD_SSL_ERROR, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERRORKey = "AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR";
	node = json_object_get_member(pJsonObject, aD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERRORKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_VIDEO_LENGTH_TOO_SHORTKey = "AD_VIDEO_LENGTH_TOO_SHORT";
	node = json_object_get_member(pJsonObject, aD_VIDEO_LENGTH_TOO_SHORTKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_VIDEO_LENGTH_TOO_SHORT, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_VIDEO_PROCESSING_EMPTY_FILEKey = "AD_VIDEO_PROCESSING_EMPTY_FILE";
	node = json_object_get_member(pJsonObject, aD_VIDEO_PROCESSING_EMPTY_FILEKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_VIDEO_PROCESSING_EMPTY_FILE, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_VIDEO_PROCESSING_HEIGHT_TOO_SMALLKey = "AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL";
	node = json_object_get_member(pJsonObject, aD_VIDEO_PROCESSING_HEIGHT_TOO_SMALLKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_VIDEO_PROCESSING_TOO_MANY_PIXELSKey = "AD_VIDEO_PROCESSING_TOO_MANY_PIXELS";
	node = json_object_get_member(pJsonObject, aD_VIDEO_PROCESSING_TOO_MANY_PIXELSKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_VIDEO_PROCESSING_TOO_MANY_PIXELS, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_VIDEO_PROCESSING_TYPE_MISMATCHKey = "AD_VIDEO_PROCESSING_TYPE_MISMATCH";
	node = json_object_get_member(pJsonObject, aD_VIDEO_PROCESSING_TYPE_MISMATCHKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_VIDEO_PROCESSING_TYPE_MISMATCH, node, "int", "");
		} else {
			
		}
	}
	const gchar *aD_VIDEO_PROCESSING_WIDTH_TOO_SMALLKey = "AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL";
	node = json_object_get_member(pJsonObject, aD_VIDEO_PROCESSING_WIDTH_TOO_SMALLKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aD_VIDEO_PROCESSING_WIDTH_TOO_SMALL, node, "int", "");
		} else {
			
		}
	}
	const gchar *aDDITIONAL_IMAGE_FILE_NOT_ACCESSIBLEKey = "ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE";
	node = json_object_get_member(pJsonObject, aDDITIONAL_IMAGE_FILE_NOT_ACCESSIBLEKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aDDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE, node, "int", "");
		} else {
			
		}
	}
	const gchar *aDDITIONAL_IMAGE_FILE_NOT_FOUNDKey = "ADDITIONAL_IMAGE_FILE_NOT_FOUND";
	node = json_object_get_member(pJsonObject, aDDITIONAL_IMAGE_FILE_NOT_FOUNDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aDDITIONAL_IMAGE_FILE_NOT_FOUND, node, "int", "");
		} else {
			
		}
	}
	const gchar *aDDITIONAL_IMAGE_INVALID_FILEKey = "ADDITIONAL_IMAGE_INVALID_FILE";
	node = json_object_get_member(pJsonObject, aDDITIONAL_IMAGE_INVALID_FILEKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aDDITIONAL_IMAGE_INVALID_FILE, node, "int", "");
		} else {
			
		}
	}
	const gchar *aDDITIONAL_IMAGE_LEVEL_INTERNAL_ERRORKey = "ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR";
	node = json_object_get_member(pJsonObject, aDDITIONAL_IMAGE_LEVEL_INTERNAL_ERRORKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aDDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR, node, "int", "");
		} else {
			
		}
	}
	const gchar *aDDITIONAL_IMAGE_MALFORMED_URLKey = "ADDITIONAL_IMAGE_MALFORMED_URL";
	node = json_object_get_member(pJsonObject, aDDITIONAL_IMAGE_MALFORMED_URLKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aDDITIONAL_IMAGE_MALFORMED_URL, node, "int", "");
		} else {
			
		}
	}
	const gchar *fETCH_GOOGLE_SHEET_PUBLIC_CAN_EDITKey = "FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT";
	node = json_object_get_member(pJsonObject, fETCH_GOOGLE_SHEET_PUBLIC_CAN_EDITKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&fETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT, node, "int", "");
		} else {
			
		}
	}
	const gchar *hOTEL_PRICE_HEADER_IS_PRESENTKey = "HOTEL_PRICE_HEADER_IS_PRESENT";
	node = json_object_get_member(pJsonObject, hOTEL_PRICE_HEADER_IS_PRESENTKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&hOTEL_PRICE_HEADER_IS_PRESENT, node, "int", "");
		} else {
			
		}
	}
	const gchar *vIDEO_DOWNLOAD_VIDEO_TOO_SHORTKey = "VIDEO_DOWNLOAD_VIDEO_TOO_SHORT";
	node = json_object_get_member(pJsonObject, vIDEO_DOWNLOAD_VIDEO_TOO_SHORTKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&vIDEO_DOWNLOAD_VIDEO_TOO_SHORT, node, "int", "");
		} else {
			
		}
	}
	const gchar *vIDEO_FILE_NOT_ACCESSIBLEKey = "VIDEO_FILE_NOT_ACCESSIBLE";
	node = json_object_get_member(pJsonObject, vIDEO_FILE_NOT_ACCESSIBLEKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&vIDEO_FILE_NOT_ACCESSIBLE, node, "int", "");
		} else {
			
		}
	}
	const gchar *vIDEO_FILE_NOT_FOUNDKey = "VIDEO_FILE_NOT_FOUND";
	node = json_object_get_member(pJsonObject, vIDEO_FILE_NOT_FOUNDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&vIDEO_FILE_NOT_FOUND, node, "int", "");
		} else {
			
		}
	}
	const gchar *vIDEO_INVALID_FILEKey = "VIDEO_INVALID_FILE";
	node = json_object_get_member(pJsonObject, vIDEO_INVALID_FILEKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&vIDEO_INVALID_FILE, node, "int", "");
		} else {
			
		}
	}
	const gchar *vIDEO_LEVEL_INTERNAL_ERRORKey = "VIDEO_LEVEL_INTERNAL_ERROR";
	node = json_object_get_member(pJsonObject, vIDEO_LEVEL_INTERNAL_ERRORKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&vIDEO_LEVEL_INTERNAL_ERROR, node, "int", "");
		} else {
			
		}
	}
	const gchar *vIDEO_MALFORMED_URLKey = "VIDEO_MALFORMED_URL";
	node = json_object_get_member(pJsonObject, vIDEO_MALFORMED_URLKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&vIDEO_MALFORMED_URL, node, "int", "");
		} else {
			
		}
	}
}

CatalogsFeedIngestionWarnings::CatalogsFeedIngestionWarnings(char* json)
{
	this->fromJson(json);
}

char*
CatalogsFeedIngestionWarnings::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getADIMAGEDOWNLOADCONTENTREADERROR();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_IMAGE_DOWNLOAD_CONTENT_READ_ERRORKey = "AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR";
	json_object_set_member(pJsonObject, aD_IMAGE_DOWNLOAD_CONTENT_READ_ERRORKey, node);
	if (isprimitive("int")) {
		int obj = getADIMAGEDOWNLOADDNSLOOKUPERROR();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERRORKey = "AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR";
	json_object_set_member(pJsonObject, aD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERRORKey, node);
	if (isprimitive("int")) {
		int obj = getADIMAGEDOWNLOADFILENOTACCESSIBLE();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLEKey = "AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE";
	json_object_set_member(pJsonObject, aD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLEKey, node);
	if (isprimitive("int")) {
		int obj = getADIMAGEDOWNLOADFILENOTFOUND();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_IMAGE_DOWNLOAD_FILE_NOT_FOUNDKey = "AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND";
	json_object_set_member(pJsonObject, aD_IMAGE_DOWNLOAD_FILE_NOT_FOUNDKey, node);
	if (isprimitive("int")) {
		int obj = getADIMAGEDOWNLOADHTTPSTATUS400();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_IMAGE_DOWNLOAD_HTTP_STATUS_400Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_400";
	json_object_set_member(pJsonObject, aD_IMAGE_DOWNLOAD_HTTP_STATUS_400Key, node);
	if (isprimitive("int")) {
		int obj = getADIMAGEDOWNLOADHTTPSTATUS403();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_IMAGE_DOWNLOAD_HTTP_STATUS_403Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_403";
	json_object_set_member(pJsonObject, aD_IMAGE_DOWNLOAD_HTTP_STATUS_403Key, node);
	if (isprimitive("int")) {
		int obj = getADIMAGEDOWNLOADHTTPSTATUS404();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_IMAGE_DOWNLOAD_HTTP_STATUS_404Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_404";
	json_object_set_member(pJsonObject, aD_IMAGE_DOWNLOAD_HTTP_STATUS_404Key, node);
	if (isprimitive("int")) {
		int obj = getADIMAGEDOWNLOADHTTPSTATUS405();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_IMAGE_DOWNLOAD_HTTP_STATUS_405Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_405";
	json_object_set_member(pJsonObject, aD_IMAGE_DOWNLOAD_HTTP_STATUS_405Key, node);
	if (isprimitive("int")) {
		int obj = getADIMAGEDOWNLOADHTTPSTATUS410();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_IMAGE_DOWNLOAD_HTTP_STATUS_410Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_410";
	json_object_set_member(pJsonObject, aD_IMAGE_DOWNLOAD_HTTP_STATUS_410Key, node);
	if (isprimitive("int")) {
		int obj = getADIMAGEDOWNLOADHTTPSTATUS429();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_IMAGE_DOWNLOAD_HTTP_STATUS_429Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_429";
	json_object_set_member(pJsonObject, aD_IMAGE_DOWNLOAD_HTTP_STATUS_429Key, node);
	if (isprimitive("int")) {
		int obj = getADIMAGEDOWNLOADHTTPSTATUS500();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_IMAGE_DOWNLOAD_HTTP_STATUS_500Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_500";
	json_object_set_member(pJsonObject, aD_IMAGE_DOWNLOAD_HTTP_STATUS_500Key, node);
	if (isprimitive("int")) {
		int obj = getADIMAGEDOWNLOADHTTPSTATUS502();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_IMAGE_DOWNLOAD_HTTP_STATUS_502Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_502";
	json_object_set_member(pJsonObject, aD_IMAGE_DOWNLOAD_HTTP_STATUS_502Key, node);
	if (isprimitive("int")) {
		int obj = getADIMAGEDOWNLOADHTTPSTATUS503();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_IMAGE_DOWNLOAD_HTTP_STATUS_503Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_503";
	json_object_set_member(pJsonObject, aD_IMAGE_DOWNLOAD_HTTP_STATUS_503Key, node);
	if (isprimitive("int")) {
		int obj = getADIMAGEDOWNLOADHTTPSTATUS504();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_IMAGE_DOWNLOAD_HTTP_STATUS_504Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_504";
	json_object_set_member(pJsonObject, aD_IMAGE_DOWNLOAD_HTTP_STATUS_504Key, node);
	if (isprimitive("int")) {
		int obj = getADIMAGEDOWNLOADHTTPSTATUS507();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_IMAGE_DOWNLOAD_HTTP_STATUS_507Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_507";
	json_object_set_member(pJsonObject, aD_IMAGE_DOWNLOAD_HTTP_STATUS_507Key, node);
	if (isprimitive("int")) {
		int obj = getADIMAGEDOWNLOADHTTPSTATUS508();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_IMAGE_DOWNLOAD_HTTP_STATUS_508Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_508";
	json_object_set_member(pJsonObject, aD_IMAGE_DOWNLOAD_HTTP_STATUS_508Key, node);
	if (isprimitive("int")) {
		int obj = getADIMAGEDOWNLOADHTTPSTATUS520();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_IMAGE_DOWNLOAD_HTTP_STATUS_520Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_520";
	json_object_set_member(pJsonObject, aD_IMAGE_DOWNLOAD_HTTP_STATUS_520Key, node);
	if (isprimitive("int")) {
		int obj = getADIMAGEDOWNLOADHTTPSTATUS521();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_IMAGE_DOWNLOAD_HTTP_STATUS_521Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_521";
	json_object_set_member(pJsonObject, aD_IMAGE_DOWNLOAD_HTTP_STATUS_521Key, node);
	if (isprimitive("int")) {
		int obj = getADIMAGEDOWNLOADHTTPSTATUS522();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_IMAGE_DOWNLOAD_HTTP_STATUS_522Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_522";
	json_object_set_member(pJsonObject, aD_IMAGE_DOWNLOAD_HTTP_STATUS_522Key, node);
	if (isprimitive("int")) {
		int obj = getADIMAGEDOWNLOADHTTPSTATUS525();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_IMAGE_DOWNLOAD_HTTP_STATUS_525Key = "AD_IMAGE_DOWNLOAD_HTTP_STATUS_525";
	json_object_set_member(pJsonObject, aD_IMAGE_DOWNLOAD_HTTP_STATUS_525Key, node);
	if (isprimitive("int")) {
		int obj = getADIMAGEDOWNLOADINTERNALCONFIGURATIONERROR();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERRORKey = "AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR";
	json_object_set_member(pJsonObject, aD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERRORKey, node);
	if (isprimitive("int")) {
		int obj = getADIMAGEDOWNLOADINTERNALERROR();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_IMAGE_DOWNLOAD_INTERNAL_ERRORKey = "AD_IMAGE_DOWNLOAD_INTERNAL_ERROR";
	json_object_set_member(pJsonObject, aD_IMAGE_DOWNLOAD_INTERNAL_ERRORKey, node);
	if (isprimitive("int")) {
		int obj = getADIMAGEDOWNLOADINTERNALFAILEDTODOWNLOAD();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOADKey = "AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD";
	json_object_set_member(pJsonObject, aD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOADKey, node);
	if (isprimitive("int")) {
		int obj = getADIMAGEDOWNLOADINTERNALMALFORMEDURL();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URLKey = "AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL";
	json_object_set_member(pJsonObject, aD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URLKey, node);
	if (isprimitive("int")) {
		int obj = getADIMAGEDOWNLOADINTERNALRATELIMITED();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITEDKey = "AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED";
	json_object_set_member(pJsonObject, aD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITEDKey, node);
	if (isprimitive("int")) {
		int obj = getADIMAGEDOWNLOADINTERNALREQUESTEXPIRED();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIREDKey = "AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED";
	json_object_set_member(pJsonObject, aD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIREDKey, node);
	if (isprimitive("int")) {
		int obj = getADIMAGEDOWNLOADINVALIDFILE();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_IMAGE_DOWNLOAD_INVALID_FILEKey = "AD_IMAGE_DOWNLOAD_INVALID_FILE";
	json_object_set_member(pJsonObject, aD_IMAGE_DOWNLOAD_INVALID_FILEKey, node);
	if (isprimitive("int")) {
		int obj = getADIMAGEDOWNLOADSITEERROR();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_IMAGE_DOWNLOAD_SITE_ERRORKey = "AD_IMAGE_DOWNLOAD_SITE_ERROR";
	json_object_set_member(pJsonObject, aD_IMAGE_DOWNLOAD_SITE_ERRORKey, node);
	if (isprimitive("int")) {
		int obj = getADIMAGEDOWNLOADSITETIMEOUT();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_IMAGE_DOWNLOAD_SITE_TIMEOUTKey = "AD_IMAGE_DOWNLOAD_SITE_TIMEOUT";
	json_object_set_member(pJsonObject, aD_IMAGE_DOWNLOAD_SITE_TIMEOUTKey, node);
	if (isprimitive("int")) {
		int obj = getADIMAGEDOWNLOADSSLERROR();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_IMAGE_DOWNLOAD_SSL_ERRORKey = "AD_IMAGE_DOWNLOAD_SSL_ERROR";
	json_object_set_member(pJsonObject, aD_IMAGE_DOWNLOAD_SSL_ERRORKey, node);
	if (isprimitive("int")) {
		int obj = getADIMAGEDOWNLOADSSLHANDSHAKEERROR();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERRORKey = "AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR";
	json_object_set_member(pJsonObject, aD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERRORKey, node);
	if (isprimitive("int")) {
		int obj = getADIMAGEPROCESSINGEMPTYFILE();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_IMAGE_PROCESSING_EMPTY_FILEKey = "AD_IMAGE_PROCESSING_EMPTY_FILE";
	json_object_set_member(pJsonObject, aD_IMAGE_PROCESSING_EMPTY_FILEKey, node);
	if (isprimitive("int")) {
		int obj = getADIMAGEPROCESSINGHEIGHTTOOSMALL();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_IMAGE_PROCESSING_HEIGHT_TOO_SMALLKey = "AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL";
	json_object_set_member(pJsonObject, aD_IMAGE_PROCESSING_HEIGHT_TOO_SMALLKey, node);
	if (isprimitive("int")) {
		int obj = getADIMAGEPROCESSINGTOOMANYPIXELS();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_IMAGE_PROCESSING_TOO_MANY_PIXELSKey = "AD_IMAGE_PROCESSING_TOO_MANY_PIXELS";
	json_object_set_member(pJsonObject, aD_IMAGE_PROCESSING_TOO_MANY_PIXELSKey, node);
	if (isprimitive("int")) {
		int obj = getADIMAGEPROCESSINGTYPEMISMATCH();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_IMAGE_PROCESSING_TYPE_MISMATCHKey = "AD_IMAGE_PROCESSING_TYPE_MISMATCH";
	json_object_set_member(pJsonObject, aD_IMAGE_PROCESSING_TYPE_MISMATCHKey, node);
	if (isprimitive("int")) {
		int obj = getADIMAGEPROCESSINGWIDTHTOOSMALL();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_IMAGE_PROCESSING_WIDTH_TOO_SMALLKey = "AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL";
	json_object_set_member(pJsonObject, aD_IMAGE_PROCESSING_WIDTH_TOO_SMALLKey, node);
	if (isprimitive("int")) {
		int obj = getADVIDEODOWNLOADCONTENTREADERROR();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_VIDEO_DOWNLOAD_CONTENT_READ_ERRORKey = "AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR";
	json_object_set_member(pJsonObject, aD_VIDEO_DOWNLOAD_CONTENT_READ_ERRORKey, node);
	if (isprimitive("int")) {
		int obj = getADVIDEODOWNLOADDNSLOOKUPERROR();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERRORKey = "AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR";
	json_object_set_member(pJsonObject, aD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERRORKey, node);
	if (isprimitive("int")) {
		int obj = getADVIDEODOWNLOADFILENOTACCESSIBLE();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLEKey = "AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE";
	json_object_set_member(pJsonObject, aD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLEKey, node);
	if (isprimitive("int")) {
		int obj = getADVIDEODOWNLOADFILENOTFOUND();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_VIDEO_DOWNLOAD_FILE_NOT_FOUNDKey = "AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND";
	json_object_set_member(pJsonObject, aD_VIDEO_DOWNLOAD_FILE_NOT_FOUNDKey, node);
	if (isprimitive("int")) {
		int obj = getADVIDEODOWNLOADHTTPSTATUS400();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_VIDEO_DOWNLOAD_HTTP_STATUS_400Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_400";
	json_object_set_member(pJsonObject, aD_VIDEO_DOWNLOAD_HTTP_STATUS_400Key, node);
	if (isprimitive("int")) {
		int obj = getADVIDEODOWNLOADHTTPSTATUS403();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_VIDEO_DOWNLOAD_HTTP_STATUS_403Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_403";
	json_object_set_member(pJsonObject, aD_VIDEO_DOWNLOAD_HTTP_STATUS_403Key, node);
	if (isprimitive("int")) {
		int obj = getADVIDEODOWNLOADHTTPSTATUS404();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_VIDEO_DOWNLOAD_HTTP_STATUS_404Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_404";
	json_object_set_member(pJsonObject, aD_VIDEO_DOWNLOAD_HTTP_STATUS_404Key, node);
	if (isprimitive("int")) {
		int obj = getADVIDEODOWNLOADHTTPSTATUS405();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_VIDEO_DOWNLOAD_HTTP_STATUS_405Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_405";
	json_object_set_member(pJsonObject, aD_VIDEO_DOWNLOAD_HTTP_STATUS_405Key, node);
	if (isprimitive("int")) {
		int obj = getADVIDEODOWNLOADHTTPSTATUS410();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_VIDEO_DOWNLOAD_HTTP_STATUS_410Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_410";
	json_object_set_member(pJsonObject, aD_VIDEO_DOWNLOAD_HTTP_STATUS_410Key, node);
	if (isprimitive("int")) {
		int obj = getADVIDEODOWNLOADHTTPSTATUS429();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_VIDEO_DOWNLOAD_HTTP_STATUS_429Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_429";
	json_object_set_member(pJsonObject, aD_VIDEO_DOWNLOAD_HTTP_STATUS_429Key, node);
	if (isprimitive("int")) {
		int obj = getADVIDEODOWNLOADHTTPSTATUS500();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_VIDEO_DOWNLOAD_HTTP_STATUS_500Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_500";
	json_object_set_member(pJsonObject, aD_VIDEO_DOWNLOAD_HTTP_STATUS_500Key, node);
	if (isprimitive("int")) {
		int obj = getADVIDEODOWNLOADHTTPSTATUS502();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_VIDEO_DOWNLOAD_HTTP_STATUS_502Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_502";
	json_object_set_member(pJsonObject, aD_VIDEO_DOWNLOAD_HTTP_STATUS_502Key, node);
	if (isprimitive("int")) {
		int obj = getADVIDEODOWNLOADHTTPSTATUS503();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_VIDEO_DOWNLOAD_HTTP_STATUS_503Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_503";
	json_object_set_member(pJsonObject, aD_VIDEO_DOWNLOAD_HTTP_STATUS_503Key, node);
	if (isprimitive("int")) {
		int obj = getADVIDEODOWNLOADHTTPSTATUS504();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_VIDEO_DOWNLOAD_HTTP_STATUS_504Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_504";
	json_object_set_member(pJsonObject, aD_VIDEO_DOWNLOAD_HTTP_STATUS_504Key, node);
	if (isprimitive("int")) {
		int obj = getADVIDEODOWNLOADHTTPSTATUS507();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_VIDEO_DOWNLOAD_HTTP_STATUS_507Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_507";
	json_object_set_member(pJsonObject, aD_VIDEO_DOWNLOAD_HTTP_STATUS_507Key, node);
	if (isprimitive("int")) {
		int obj = getADVIDEODOWNLOADHTTPSTATUS508();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_VIDEO_DOWNLOAD_HTTP_STATUS_508Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_508";
	json_object_set_member(pJsonObject, aD_VIDEO_DOWNLOAD_HTTP_STATUS_508Key, node);
	if (isprimitive("int")) {
		int obj = getADVIDEODOWNLOADHTTPSTATUS520();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_VIDEO_DOWNLOAD_HTTP_STATUS_520Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_520";
	json_object_set_member(pJsonObject, aD_VIDEO_DOWNLOAD_HTTP_STATUS_520Key, node);
	if (isprimitive("int")) {
		int obj = getADVIDEODOWNLOADHTTPSTATUS521();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_VIDEO_DOWNLOAD_HTTP_STATUS_521Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_521";
	json_object_set_member(pJsonObject, aD_VIDEO_DOWNLOAD_HTTP_STATUS_521Key, node);
	if (isprimitive("int")) {
		int obj = getADVIDEODOWNLOADHTTPSTATUS522();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_VIDEO_DOWNLOAD_HTTP_STATUS_522Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_522";
	json_object_set_member(pJsonObject, aD_VIDEO_DOWNLOAD_HTTP_STATUS_522Key, node);
	if (isprimitive("int")) {
		int obj = getADVIDEODOWNLOADHTTPSTATUS525();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_VIDEO_DOWNLOAD_HTTP_STATUS_525Key = "AD_VIDEO_DOWNLOAD_HTTP_STATUS_525";
	json_object_set_member(pJsonObject, aD_VIDEO_DOWNLOAD_HTTP_STATUS_525Key, node);
	if (isprimitive("int")) {
		int obj = getADVIDEODOWNLOADINTERNALCONFIGURATIONERROR();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERRORKey = "AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR";
	json_object_set_member(pJsonObject, aD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERRORKey, node);
	if (isprimitive("int")) {
		int obj = getADVIDEODOWNLOADINTERNALERROR();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_VIDEO_DOWNLOAD_INTERNAL_ERRORKey = "AD_VIDEO_DOWNLOAD_INTERNAL_ERROR";
	json_object_set_member(pJsonObject, aD_VIDEO_DOWNLOAD_INTERNAL_ERRORKey, node);
	if (isprimitive("int")) {
		int obj = getADVIDEODOWNLOADINTERNALFAILEDTODOWNLOAD();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOADKey = "AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD";
	json_object_set_member(pJsonObject, aD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOADKey, node);
	if (isprimitive("int")) {
		int obj = getADVIDEODOWNLOADINTERNALMALFORMEDURL();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URLKey = "AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL";
	json_object_set_member(pJsonObject, aD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URLKey, node);
	if (isprimitive("int")) {
		int obj = getADVIDEODOWNLOADINTERNALRATELIMITED();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITEDKey = "AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED";
	json_object_set_member(pJsonObject, aD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITEDKey, node);
	if (isprimitive("int")) {
		int obj = getADVIDEODOWNLOADINTERNALREQUESTEXPIRED();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIREDKey = "AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED";
	json_object_set_member(pJsonObject, aD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIREDKey, node);
	if (isprimitive("int")) {
		int obj = getADVIDEODOWNLOADINVALIDFILE();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_VIDEO_DOWNLOAD_INVALID_FILEKey = "AD_VIDEO_DOWNLOAD_INVALID_FILE";
	json_object_set_member(pJsonObject, aD_VIDEO_DOWNLOAD_INVALID_FILEKey, node);
	if (isprimitive("int")) {
		int obj = getADVIDEODOWNLOADSITEERROR();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_VIDEO_DOWNLOAD_SITE_ERRORKey = "AD_VIDEO_DOWNLOAD_SITE_ERROR";
	json_object_set_member(pJsonObject, aD_VIDEO_DOWNLOAD_SITE_ERRORKey, node);
	if (isprimitive("int")) {
		int obj = getADVIDEODOWNLOADSITETIMEOUT();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_VIDEO_DOWNLOAD_SITE_TIMEOUTKey = "AD_VIDEO_DOWNLOAD_SITE_TIMEOUT";
	json_object_set_member(pJsonObject, aD_VIDEO_DOWNLOAD_SITE_TIMEOUTKey, node);
	if (isprimitive("int")) {
		int obj = getADVIDEODOWNLOADSSLERROR();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_VIDEO_DOWNLOAD_SSL_ERRORKey = "AD_VIDEO_DOWNLOAD_SSL_ERROR";
	json_object_set_member(pJsonObject, aD_VIDEO_DOWNLOAD_SSL_ERRORKey, node);
	if (isprimitive("int")) {
		int obj = getADVIDEODOWNLOADSSLHANDSHAKEERROR();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERRORKey = "AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR";
	json_object_set_member(pJsonObject, aD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERRORKey, node);
	if (isprimitive("int")) {
		int obj = getADVIDEOLENGTHTOOSHORT();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_VIDEO_LENGTH_TOO_SHORTKey = "AD_VIDEO_LENGTH_TOO_SHORT";
	json_object_set_member(pJsonObject, aD_VIDEO_LENGTH_TOO_SHORTKey, node);
	if (isprimitive("int")) {
		int obj = getADVIDEOPROCESSINGEMPTYFILE();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_VIDEO_PROCESSING_EMPTY_FILEKey = "AD_VIDEO_PROCESSING_EMPTY_FILE";
	json_object_set_member(pJsonObject, aD_VIDEO_PROCESSING_EMPTY_FILEKey, node);
	if (isprimitive("int")) {
		int obj = getADVIDEOPROCESSINGHEIGHTTOOSMALL();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_VIDEO_PROCESSING_HEIGHT_TOO_SMALLKey = "AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL";
	json_object_set_member(pJsonObject, aD_VIDEO_PROCESSING_HEIGHT_TOO_SMALLKey, node);
	if (isprimitive("int")) {
		int obj = getADVIDEOPROCESSINGTOOMANYPIXELS();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_VIDEO_PROCESSING_TOO_MANY_PIXELSKey = "AD_VIDEO_PROCESSING_TOO_MANY_PIXELS";
	json_object_set_member(pJsonObject, aD_VIDEO_PROCESSING_TOO_MANY_PIXELSKey, node);
	if (isprimitive("int")) {
		int obj = getADVIDEOPROCESSINGTYPEMISMATCH();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_VIDEO_PROCESSING_TYPE_MISMATCHKey = "AD_VIDEO_PROCESSING_TYPE_MISMATCH";
	json_object_set_member(pJsonObject, aD_VIDEO_PROCESSING_TYPE_MISMATCHKey, node);
	if (isprimitive("int")) {
		int obj = getADVIDEOPROCESSINGWIDTHTOOSMALL();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aD_VIDEO_PROCESSING_WIDTH_TOO_SMALLKey = "AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL";
	json_object_set_member(pJsonObject, aD_VIDEO_PROCESSING_WIDTH_TOO_SMALLKey, node);
	if (isprimitive("int")) {
		int obj = getADDITIONALIMAGEFILENOTACCESSIBLE();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aDDITIONAL_IMAGE_FILE_NOT_ACCESSIBLEKey = "ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE";
	json_object_set_member(pJsonObject, aDDITIONAL_IMAGE_FILE_NOT_ACCESSIBLEKey, node);
	if (isprimitive("int")) {
		int obj = getADDITIONALIMAGEFILENOTFOUND();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aDDITIONAL_IMAGE_FILE_NOT_FOUNDKey = "ADDITIONAL_IMAGE_FILE_NOT_FOUND";
	json_object_set_member(pJsonObject, aDDITIONAL_IMAGE_FILE_NOT_FOUNDKey, node);
	if (isprimitive("int")) {
		int obj = getADDITIONALIMAGEINVALIDFILE();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aDDITIONAL_IMAGE_INVALID_FILEKey = "ADDITIONAL_IMAGE_INVALID_FILE";
	json_object_set_member(pJsonObject, aDDITIONAL_IMAGE_INVALID_FILEKey, node);
	if (isprimitive("int")) {
		int obj = getADDITIONALIMAGELEVELINTERNALERROR();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aDDITIONAL_IMAGE_LEVEL_INTERNAL_ERRORKey = "ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR";
	json_object_set_member(pJsonObject, aDDITIONAL_IMAGE_LEVEL_INTERNAL_ERRORKey, node);
	if (isprimitive("int")) {
		int obj = getADDITIONALIMAGEMALFORMEDURL();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aDDITIONAL_IMAGE_MALFORMED_URLKey = "ADDITIONAL_IMAGE_MALFORMED_URL";
	json_object_set_member(pJsonObject, aDDITIONAL_IMAGE_MALFORMED_URLKey, node);
	if (isprimitive("int")) {
		int obj = getFETCHGOOGLESHEETPUBLICCANEDIT();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *fETCH_GOOGLE_SHEET_PUBLIC_CAN_EDITKey = "FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT";
	json_object_set_member(pJsonObject, fETCH_GOOGLE_SHEET_PUBLIC_CAN_EDITKey, node);
	if (isprimitive("int")) {
		int obj = getHOTELPRICEHEADERISPRESENT();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *hOTEL_PRICE_HEADER_IS_PRESENTKey = "HOTEL_PRICE_HEADER_IS_PRESENT";
	json_object_set_member(pJsonObject, hOTEL_PRICE_HEADER_IS_PRESENTKey, node);
	if (isprimitive("int")) {
		int obj = getVIDEODOWNLOADVIDEOTOOSHORT();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *vIDEO_DOWNLOAD_VIDEO_TOO_SHORTKey = "VIDEO_DOWNLOAD_VIDEO_TOO_SHORT";
	json_object_set_member(pJsonObject, vIDEO_DOWNLOAD_VIDEO_TOO_SHORTKey, node);
	if (isprimitive("int")) {
		int obj = getVIDEOFILENOTACCESSIBLE();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *vIDEO_FILE_NOT_ACCESSIBLEKey = "VIDEO_FILE_NOT_ACCESSIBLE";
	json_object_set_member(pJsonObject, vIDEO_FILE_NOT_ACCESSIBLEKey, node);
	if (isprimitive("int")) {
		int obj = getVIDEOFILENOTFOUND();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *vIDEO_FILE_NOT_FOUNDKey = "VIDEO_FILE_NOT_FOUND";
	json_object_set_member(pJsonObject, vIDEO_FILE_NOT_FOUNDKey, node);
	if (isprimitive("int")) {
		int obj = getVIDEOINVALIDFILE();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *vIDEO_INVALID_FILEKey = "VIDEO_INVALID_FILE";
	json_object_set_member(pJsonObject, vIDEO_INVALID_FILEKey, node);
	if (isprimitive("int")) {
		int obj = getVIDEOLEVELINTERNALERROR();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *vIDEO_LEVEL_INTERNAL_ERRORKey = "VIDEO_LEVEL_INTERNAL_ERROR";
	json_object_set_member(pJsonObject, vIDEO_LEVEL_INTERNAL_ERRORKey, node);
	if (isprimitive("int")) {
		int obj = getVIDEOMALFORMEDURL();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *vIDEO_MALFORMED_URLKey = "VIDEO_MALFORMED_URL";
	json_object_set_member(pJsonObject, vIDEO_MALFORMED_URLKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
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


