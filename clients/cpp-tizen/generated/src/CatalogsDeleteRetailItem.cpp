#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsDeleteRetailItem.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsDeleteRetailItem::CatalogsDeleteRetailItem()
{
	//__init();
}

CatalogsDeleteRetailItem::~CatalogsDeleteRetailItem()
{
	//__cleanup();
}

void
CatalogsDeleteRetailItem::__init()
{
	//item_id = std::string();
	//operation = std::string();
}

void
CatalogsDeleteRetailItem::__cleanup()
{
	//if(item_id != NULL) {
	//
	//delete item_id;
	//item_id = NULL;
	//}
	//if(operation != NULL) {
	//
	//delete operation;
	//operation = NULL;
	//}
	//
}

void
CatalogsDeleteRetailItem::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *item_idKey = "item_id";
	node = json_object_get_member(pJsonObject, item_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&item_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *operationKey = "operation";
	node = json_object_get_member(pJsonObject, operationKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&operation, node, "std::string", "");
		} else {
			
		}
	}
}

CatalogsDeleteRetailItem::CatalogsDeleteRetailItem(char* json)
{
	this->fromJson(json);
}

char*
CatalogsDeleteRetailItem::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getItemId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *item_idKey = "item_id";
	json_object_set_member(pJsonObject, item_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOperation();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *operationKey = "operation";
	json_object_set_member(pJsonObject, operationKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CatalogsDeleteRetailItem::getItemId()
{
	return item_id;
}

void
CatalogsDeleteRetailItem::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}

std::string
CatalogsDeleteRetailItem::getOperation()
{
	return operation;
}

void
CatalogsDeleteRetailItem::setOperation(std::string  operation)
{
	this->operation = operation;
}


