#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsFeedIngestionInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsFeedIngestionInfo::CatalogsFeedIngestionInfo()
{
	//__init();
}

CatalogsFeedIngestionInfo::~CatalogsFeedIngestionInfo()
{
	//__cleanup();
}

void
CatalogsFeedIngestionInfo::__init()
{
	//iN_STOCK = int(0);
	//oUT_OF_STOCK = int(0);
	//pREORDER = int(0);
}

void
CatalogsFeedIngestionInfo::__cleanup()
{
	//if(iN_STOCK != NULL) {
	//
	//delete iN_STOCK;
	//iN_STOCK = NULL;
	//}
	//if(oUT_OF_STOCK != NULL) {
	//
	//delete oUT_OF_STOCK;
	//oUT_OF_STOCK = NULL;
	//}
	//if(pREORDER != NULL) {
	//
	//delete pREORDER;
	//pREORDER = NULL;
	//}
	//
}

void
CatalogsFeedIngestionInfo::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *iN_STOCKKey = "IN_STOCK";
	node = json_object_get_member(pJsonObject, iN_STOCKKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&iN_STOCK, node, "int", "");
		} else {
			
		}
	}
	const gchar *oUT_OF_STOCKKey = "OUT_OF_STOCK";
	node = json_object_get_member(pJsonObject, oUT_OF_STOCKKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&oUT_OF_STOCK, node, "int", "");
		} else {
			
		}
	}
	const gchar *pREORDERKey = "PREORDER";
	node = json_object_get_member(pJsonObject, pREORDERKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&pREORDER, node, "int", "");
		} else {
			
		}
	}
}

CatalogsFeedIngestionInfo::CatalogsFeedIngestionInfo(char* json)
{
	this->fromJson(json);
}

char*
CatalogsFeedIngestionInfo::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getINSTOCK();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *iN_STOCKKey = "IN_STOCK";
	json_object_set_member(pJsonObject, iN_STOCKKey, node);
	if (isprimitive("int")) {
		int obj = getOUTOFSTOCK();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *oUT_OF_STOCKKey = "OUT_OF_STOCK";
	json_object_set_member(pJsonObject, oUT_OF_STOCKKey, node);
	if (isprimitive("int")) {
		int obj = getPREORDER();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *pREORDERKey = "PREORDER";
	json_object_set_member(pJsonObject, pREORDERKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
CatalogsFeedIngestionInfo::getINSTOCK()
{
	return iN_STOCK;
}

void
CatalogsFeedIngestionInfo::setINSTOCK(int  iN_STOCK)
{
	this->iN_STOCK = iN_STOCK;
}

int
CatalogsFeedIngestionInfo::getOUTOFSTOCK()
{
	return oUT_OF_STOCK;
}

void
CatalogsFeedIngestionInfo::setOUTOFSTOCK(int  oUT_OF_STOCK)
{
	this->oUT_OF_STOCK = oUT_OF_STOCK;
}

int
CatalogsFeedIngestionInfo::getPREORDER()
{
	return pREORDER;
}

void
CatalogsFeedIngestionInfo::setPREORDER(int  pREORDER)
{
	this->pREORDER = pREORDER;
}


