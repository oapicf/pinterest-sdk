#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsFeedIngestionErrors.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsFeedIngestionErrors::CatalogsFeedIngestionErrors()
{
	//__init();
}

CatalogsFeedIngestionErrors::~CatalogsFeedIngestionErrors()
{
	//__cleanup();
}

void
CatalogsFeedIngestionErrors::__init()
{
	//lINE_LEVEL_INTERNAL_ERROR = int(0);
	//lARGE_PRODUCT_COUNT_DECREASE = int(0);
	//aCCOUNT_FLAGGED = int(0);
	//iMAGE_LEVEL_INTERNAL_ERROR = int(0);
	//iMAGE_FILE_NOT_ACCESSIBLE = int(0);
	//iMAGE_MALFORMED_URL = int(0);
	//iMAGE_FILE_NOT_FOUND = int(0);
	//iMAGE_INVALID_FILE = int(0);
}

void
CatalogsFeedIngestionErrors::__cleanup()
{
	//if(lINE_LEVEL_INTERNAL_ERROR != NULL) {
	//
	//delete lINE_LEVEL_INTERNAL_ERROR;
	//lINE_LEVEL_INTERNAL_ERROR = NULL;
	//}
	//if(lARGE_PRODUCT_COUNT_DECREASE != NULL) {
	//
	//delete lARGE_PRODUCT_COUNT_DECREASE;
	//lARGE_PRODUCT_COUNT_DECREASE = NULL;
	//}
	//if(aCCOUNT_FLAGGED != NULL) {
	//
	//delete aCCOUNT_FLAGGED;
	//aCCOUNT_FLAGGED = NULL;
	//}
	//if(iMAGE_LEVEL_INTERNAL_ERROR != NULL) {
	//
	//delete iMAGE_LEVEL_INTERNAL_ERROR;
	//iMAGE_LEVEL_INTERNAL_ERROR = NULL;
	//}
	//if(iMAGE_FILE_NOT_ACCESSIBLE != NULL) {
	//
	//delete iMAGE_FILE_NOT_ACCESSIBLE;
	//iMAGE_FILE_NOT_ACCESSIBLE = NULL;
	//}
	//if(iMAGE_MALFORMED_URL != NULL) {
	//
	//delete iMAGE_MALFORMED_URL;
	//iMAGE_MALFORMED_URL = NULL;
	//}
	//if(iMAGE_FILE_NOT_FOUND != NULL) {
	//
	//delete iMAGE_FILE_NOT_FOUND;
	//iMAGE_FILE_NOT_FOUND = NULL;
	//}
	//if(iMAGE_INVALID_FILE != NULL) {
	//
	//delete iMAGE_INVALID_FILE;
	//iMAGE_INVALID_FILE = NULL;
	//}
	//
}

void
CatalogsFeedIngestionErrors::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *lINE_LEVEL_INTERNAL_ERRORKey = "LINE_LEVEL_INTERNAL_ERROR";
	node = json_object_get_member(pJsonObject, lINE_LEVEL_INTERNAL_ERRORKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&lINE_LEVEL_INTERNAL_ERROR, node, "int", "");
		} else {
			
		}
	}
	const gchar *lARGE_PRODUCT_COUNT_DECREASEKey = "LARGE_PRODUCT_COUNT_DECREASE";
	node = json_object_get_member(pJsonObject, lARGE_PRODUCT_COUNT_DECREASEKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&lARGE_PRODUCT_COUNT_DECREASE, node, "int", "");
		} else {
			
		}
	}
	const gchar *aCCOUNT_FLAGGEDKey = "ACCOUNT_FLAGGED";
	node = json_object_get_member(pJsonObject, aCCOUNT_FLAGGEDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aCCOUNT_FLAGGED, node, "int", "");
		} else {
			
		}
	}
	const gchar *iMAGE_LEVEL_INTERNAL_ERRORKey = "IMAGE_LEVEL_INTERNAL_ERROR";
	node = json_object_get_member(pJsonObject, iMAGE_LEVEL_INTERNAL_ERRORKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&iMAGE_LEVEL_INTERNAL_ERROR, node, "int", "");
		} else {
			
		}
	}
	const gchar *iMAGE_FILE_NOT_ACCESSIBLEKey = "IMAGE_FILE_NOT_ACCESSIBLE";
	node = json_object_get_member(pJsonObject, iMAGE_FILE_NOT_ACCESSIBLEKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&iMAGE_FILE_NOT_ACCESSIBLE, node, "int", "");
		} else {
			
		}
	}
	const gchar *iMAGE_MALFORMED_URLKey = "IMAGE_MALFORMED_URL";
	node = json_object_get_member(pJsonObject, iMAGE_MALFORMED_URLKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&iMAGE_MALFORMED_URL, node, "int", "");
		} else {
			
		}
	}
	const gchar *iMAGE_FILE_NOT_FOUNDKey = "IMAGE_FILE_NOT_FOUND";
	node = json_object_get_member(pJsonObject, iMAGE_FILE_NOT_FOUNDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&iMAGE_FILE_NOT_FOUND, node, "int", "");
		} else {
			
		}
	}
	const gchar *iMAGE_INVALID_FILEKey = "IMAGE_INVALID_FILE";
	node = json_object_get_member(pJsonObject, iMAGE_INVALID_FILEKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&iMAGE_INVALID_FILE, node, "int", "");
		} else {
			
		}
	}
}

CatalogsFeedIngestionErrors::CatalogsFeedIngestionErrors(char* json)
{
	this->fromJson(json);
}

char*
CatalogsFeedIngestionErrors::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getLINELEVELINTERNALERROR();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *lINE_LEVEL_INTERNAL_ERRORKey = "LINE_LEVEL_INTERNAL_ERROR";
	json_object_set_member(pJsonObject, lINE_LEVEL_INTERNAL_ERRORKey, node);
	if (isprimitive("int")) {
		int obj = getLARGEPRODUCTCOUNTDECREASE();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *lARGE_PRODUCT_COUNT_DECREASEKey = "LARGE_PRODUCT_COUNT_DECREASE";
	json_object_set_member(pJsonObject, lARGE_PRODUCT_COUNT_DECREASEKey, node);
	if (isprimitive("int")) {
		int obj = getACCOUNTFLAGGED();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aCCOUNT_FLAGGEDKey = "ACCOUNT_FLAGGED";
	json_object_set_member(pJsonObject, aCCOUNT_FLAGGEDKey, node);
	if (isprimitive("int")) {
		int obj = getIMAGELEVELINTERNALERROR();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *iMAGE_LEVEL_INTERNAL_ERRORKey = "IMAGE_LEVEL_INTERNAL_ERROR";
	json_object_set_member(pJsonObject, iMAGE_LEVEL_INTERNAL_ERRORKey, node);
	if (isprimitive("int")) {
		int obj = getIMAGEFILENOTACCESSIBLE();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *iMAGE_FILE_NOT_ACCESSIBLEKey = "IMAGE_FILE_NOT_ACCESSIBLE";
	json_object_set_member(pJsonObject, iMAGE_FILE_NOT_ACCESSIBLEKey, node);
	if (isprimitive("int")) {
		int obj = getIMAGEMALFORMEDURL();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *iMAGE_MALFORMED_URLKey = "IMAGE_MALFORMED_URL";
	json_object_set_member(pJsonObject, iMAGE_MALFORMED_URLKey, node);
	if (isprimitive("int")) {
		int obj = getIMAGEFILENOTFOUND();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *iMAGE_FILE_NOT_FOUNDKey = "IMAGE_FILE_NOT_FOUND";
	json_object_set_member(pJsonObject, iMAGE_FILE_NOT_FOUNDKey, node);
	if (isprimitive("int")) {
		int obj = getIMAGEINVALIDFILE();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *iMAGE_INVALID_FILEKey = "IMAGE_INVALID_FILE";
	json_object_set_member(pJsonObject, iMAGE_INVALID_FILEKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
CatalogsFeedIngestionErrors::getLINELEVELINTERNALERROR()
{
	return lINE_LEVEL_INTERNAL_ERROR;
}

void
CatalogsFeedIngestionErrors::setLINELEVELINTERNALERROR(int  lINE_LEVEL_INTERNAL_ERROR)
{
	this->lINE_LEVEL_INTERNAL_ERROR = lINE_LEVEL_INTERNAL_ERROR;
}

int
CatalogsFeedIngestionErrors::getLARGEPRODUCTCOUNTDECREASE()
{
	return lARGE_PRODUCT_COUNT_DECREASE;
}

void
CatalogsFeedIngestionErrors::setLARGEPRODUCTCOUNTDECREASE(int  lARGE_PRODUCT_COUNT_DECREASE)
{
	this->lARGE_PRODUCT_COUNT_DECREASE = lARGE_PRODUCT_COUNT_DECREASE;
}

int
CatalogsFeedIngestionErrors::getACCOUNTFLAGGED()
{
	return aCCOUNT_FLAGGED;
}

void
CatalogsFeedIngestionErrors::setACCOUNTFLAGGED(int  aCCOUNT_FLAGGED)
{
	this->aCCOUNT_FLAGGED = aCCOUNT_FLAGGED;
}

int
CatalogsFeedIngestionErrors::getIMAGELEVELINTERNALERROR()
{
	return iMAGE_LEVEL_INTERNAL_ERROR;
}

void
CatalogsFeedIngestionErrors::setIMAGELEVELINTERNALERROR(int  iMAGE_LEVEL_INTERNAL_ERROR)
{
	this->iMAGE_LEVEL_INTERNAL_ERROR = iMAGE_LEVEL_INTERNAL_ERROR;
}

int
CatalogsFeedIngestionErrors::getIMAGEFILENOTACCESSIBLE()
{
	return iMAGE_FILE_NOT_ACCESSIBLE;
}

void
CatalogsFeedIngestionErrors::setIMAGEFILENOTACCESSIBLE(int  iMAGE_FILE_NOT_ACCESSIBLE)
{
	this->iMAGE_FILE_NOT_ACCESSIBLE = iMAGE_FILE_NOT_ACCESSIBLE;
}

int
CatalogsFeedIngestionErrors::getIMAGEMALFORMEDURL()
{
	return iMAGE_MALFORMED_URL;
}

void
CatalogsFeedIngestionErrors::setIMAGEMALFORMEDURL(int  iMAGE_MALFORMED_URL)
{
	this->iMAGE_MALFORMED_URL = iMAGE_MALFORMED_URL;
}

int
CatalogsFeedIngestionErrors::getIMAGEFILENOTFOUND()
{
	return iMAGE_FILE_NOT_FOUND;
}

void
CatalogsFeedIngestionErrors::setIMAGEFILENOTFOUND(int  iMAGE_FILE_NOT_FOUND)
{
	this->iMAGE_FILE_NOT_FOUND = iMAGE_FILE_NOT_FOUND;
}

int
CatalogsFeedIngestionErrors::getIMAGEINVALIDFILE()
{
	return iMAGE_INVALID_FILE;
}

void
CatalogsFeedIngestionErrors::setIMAGEINVALIDFILE(int  iMAGE_INVALID_FILE)
{
	this->iMAGE_INVALID_FILE = iMAGE_INVALID_FILE;
}


