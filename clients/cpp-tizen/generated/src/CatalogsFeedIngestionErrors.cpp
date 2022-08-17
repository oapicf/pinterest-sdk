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
	//iMAGE_DOWNLOAD_ERROR = int(0);
	//lINE_LEVEL_INTERNAL_ERROR = int(0);
	//lARGE_PRODUCT_COUNT_DECREASE = int(0);
}

void
CatalogsFeedIngestionErrors::__cleanup()
{
	//if(iMAGE_DOWNLOAD_ERROR != NULL) {
	//
	//delete iMAGE_DOWNLOAD_ERROR;
	//iMAGE_DOWNLOAD_ERROR = NULL;
	//}
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
	//
}

void
CatalogsFeedIngestionErrors::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *iMAGE_DOWNLOAD_ERRORKey = "IMAGE_DOWNLOAD_ERROR";
	node = json_object_get_member(pJsonObject, iMAGE_DOWNLOAD_ERRORKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&iMAGE_DOWNLOAD_ERROR, node, "int", "");
		} else {
			
		}
	}
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
		int obj = getIMAGEDOWNLOADERROR();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *iMAGE_DOWNLOAD_ERRORKey = "IMAGE_DOWNLOAD_ERROR";
	json_object_set_member(pJsonObject, iMAGE_DOWNLOAD_ERRORKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
CatalogsFeedIngestionErrors::getIMAGEDOWNLOADERROR()
{
	return iMAGE_DOWNLOAD_ERROR;
}

void
CatalogsFeedIngestionErrors::setIMAGEDOWNLOADERROR(int  iMAGE_DOWNLOAD_ERROR)
{
	this->iMAGE_DOWNLOAD_ERROR = iMAGE_DOWNLOAD_ERROR;
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


