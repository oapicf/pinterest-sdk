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
	//aDDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR = int(0);
	//aDDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE = int(0);
	//aDDITIONAL_IMAGE_MALFORMED_URL = int(0);
	//aDDITIONAL_IMAGE_FILE_NOT_FOUND = int(0);
	//aDDITIONAL_IMAGE_INVALID_FILE = int(0);
	//hOTEL_PRICE_HEADER_IS_PRESENT = int(0);
}

void
CatalogsFeedIngestionWarnings::__cleanup()
{
	//if(aDDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR != NULL) {
	//
	//delete aDDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR;
	//aDDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR = NULL;
	//}
	//if(aDDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE != NULL) {
	//
	//delete aDDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE;
	//aDDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE = NULL;
	//}
	//if(aDDITIONAL_IMAGE_MALFORMED_URL != NULL) {
	//
	//delete aDDITIONAL_IMAGE_MALFORMED_URL;
	//aDDITIONAL_IMAGE_MALFORMED_URL = NULL;
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
	//if(hOTEL_PRICE_HEADER_IS_PRESENT != NULL) {
	//
	//delete hOTEL_PRICE_HEADER_IS_PRESENT;
	//hOTEL_PRICE_HEADER_IS_PRESENT = NULL;
	//}
	//
}

void
CatalogsFeedIngestionWarnings::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *aDDITIONAL_IMAGE_LEVEL_INTERNAL_ERRORKey = "ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR";
	node = json_object_get_member(pJsonObject, aDDITIONAL_IMAGE_LEVEL_INTERNAL_ERRORKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aDDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR, node, "int", "");
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
	const gchar *aDDITIONAL_IMAGE_MALFORMED_URLKey = "ADDITIONAL_IMAGE_MALFORMED_URL";
	node = json_object_get_member(pJsonObject, aDDITIONAL_IMAGE_MALFORMED_URLKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aDDITIONAL_IMAGE_MALFORMED_URL, node, "int", "");
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
	const gchar *hOTEL_PRICE_HEADER_IS_PRESENTKey = "HOTEL_PRICE_HEADER_IS_PRESENT";
	node = json_object_get_member(pJsonObject, hOTEL_PRICE_HEADER_IS_PRESENTKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&hOTEL_PRICE_HEADER_IS_PRESENT, node, "int", "");
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
		int obj = getADDITIONALIMAGELEVELINTERNALERROR();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aDDITIONAL_IMAGE_LEVEL_INTERNAL_ERRORKey = "ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR";
	json_object_set_member(pJsonObject, aDDITIONAL_IMAGE_LEVEL_INTERNAL_ERRORKey, node);
	if (isprimitive("int")) {
		int obj = getADDITIONALIMAGEFILENOTACCESSIBLE();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aDDITIONAL_IMAGE_FILE_NOT_ACCESSIBLEKey = "ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE";
	json_object_set_member(pJsonObject, aDDITIONAL_IMAGE_FILE_NOT_ACCESSIBLEKey, node);
	if (isprimitive("int")) {
		int obj = getADDITIONALIMAGEMALFORMEDURL();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aDDITIONAL_IMAGE_MALFORMED_URLKey = "ADDITIONAL_IMAGE_MALFORMED_URL";
	json_object_set_member(pJsonObject, aDDITIONAL_IMAGE_MALFORMED_URLKey, node);
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
		int obj = getHOTELPRICEHEADERISPRESENT();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *hOTEL_PRICE_HEADER_IS_PRESENTKey = "HOTEL_PRICE_HEADER_IS_PRESENT";
	json_object_set_member(pJsonObject, hOTEL_PRICE_HEADER_IS_PRESENTKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
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
CatalogsFeedIngestionWarnings::getHOTELPRICEHEADERISPRESENT()
{
	return hOTEL_PRICE_HEADER_IS_PRESENT;
}

void
CatalogsFeedIngestionWarnings::setHOTELPRICEHEADERISPRESENT(int  hOTEL_PRICE_HEADER_IS_PRESENT)
{
	this->hOTEL_PRICE_HEADER_IS_PRESENT = hOTEL_PRICE_HEADER_IS_PRESENT;
}


