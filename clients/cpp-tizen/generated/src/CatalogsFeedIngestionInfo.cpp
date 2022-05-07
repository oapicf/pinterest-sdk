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
	//in_stock = int(0);
	//out_of_stock = int(0);
	//preorder = int(0);
}

void
CatalogsFeedIngestionInfo::__cleanup()
{
	//if(in_stock != NULL) {
	//
	//delete in_stock;
	//in_stock = NULL;
	//}
	//if(out_of_stock != NULL) {
	//
	//delete out_of_stock;
	//out_of_stock = NULL;
	//}
	//if(preorder != NULL) {
	//
	//delete preorder;
	//preorder = NULL;
	//}
	//
}

void
CatalogsFeedIngestionInfo::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *in_stockKey = "in_stock";
	node = json_object_get_member(pJsonObject, in_stockKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&in_stock, node, "int", "");
		} else {
			
		}
	}
	const gchar *out_of_stockKey = "out_of_stock";
	node = json_object_get_member(pJsonObject, out_of_stockKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&out_of_stock, node, "int", "");
		} else {
			
		}
	}
	const gchar *preorderKey = "preorder";
	node = json_object_get_member(pJsonObject, preorderKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&preorder, node, "int", "");
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
		int obj = getInStock();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *in_stockKey = "in_stock";
	json_object_set_member(pJsonObject, in_stockKey, node);
	if (isprimitive("int")) {
		int obj = getOutOfStock();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *out_of_stockKey = "out_of_stock";
	json_object_set_member(pJsonObject, out_of_stockKey, node);
	if (isprimitive("int")) {
		int obj = getPreorder();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *preorderKey = "preorder";
	json_object_set_member(pJsonObject, preorderKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
CatalogsFeedIngestionInfo::getInStock()
{
	return in_stock;
}

void
CatalogsFeedIngestionInfo::setInStock(int  in_stock)
{
	this->in_stock = in_stock;
}

int
CatalogsFeedIngestionInfo::getOutOfStock()
{
	return out_of_stock;
}

void
CatalogsFeedIngestionInfo::setOutOfStock(int  out_of_stock)
{
	this->out_of_stock = out_of_stock;
}

int
CatalogsFeedIngestionInfo::getPreorder()
{
	return preorder;
}

void
CatalogsFeedIngestionInfo::setPreorder(int  preorder)
{
	this->preorder = preorder;
}


