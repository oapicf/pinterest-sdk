#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LocalInventoryDeleteOperation.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LocalInventoryDeleteOperation::LocalInventoryDeleteOperation()
{
	//__init();
}

LocalInventoryDeleteOperation::~LocalInventoryDeleteOperation()
{
	//__cleanup();
}

void
LocalInventoryDeleteOperation::__init()
{
	//item_id = std::string();
	//operation = std::string();
	//store_code = std::string();
}

void
LocalInventoryDeleteOperation::__cleanup()
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
	//if(store_code != NULL) {
	//
	//delete store_code;
	//store_code = NULL;
	//}
	//
}

void
LocalInventoryDeleteOperation::fromJson(char* jsonStr)
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
	const gchar *store_codeKey = "store_code";
	node = json_object_get_member(pJsonObject, store_codeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&store_code, node, "std::string", "");
		} else {
			
		}
	}
}

LocalInventoryDeleteOperation::LocalInventoryDeleteOperation(char* json)
{
	this->fromJson(json);
}

char*
LocalInventoryDeleteOperation::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getStoreCode();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *store_codeKey = "store_code";
	json_object_set_member(pJsonObject, store_codeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
LocalInventoryDeleteOperation::getItemId()
{
	return item_id;
}

void
LocalInventoryDeleteOperation::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}

std::string
LocalInventoryDeleteOperation::getOperation()
{
	return operation;
}

void
LocalInventoryDeleteOperation::setOperation(std::string  operation)
{
	this->operation = operation;
}

std::string
LocalInventoryDeleteOperation::getStoreCode()
{
	return store_code;
}

void
LocalInventoryDeleteOperation::setStoreCode(std::string  store_code)
{
	this->store_code = store_code;
}


