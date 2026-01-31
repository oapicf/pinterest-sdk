#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsCreateRetailItem.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsCreateRetailItem::CatalogsCreateRetailItem()
{
	//__init();
}

CatalogsCreateRetailItem::~CatalogsCreateRetailItem()
{
	//__cleanup();
}

void
CatalogsCreateRetailItem::__init()
{
	//attributes = new ItemAttributesRequest();
	//item_id = std::string();
	//operation = std::string();
}

void
CatalogsCreateRetailItem::__cleanup()
{
	//if(attributes != NULL) {
	//
	//delete attributes;
	//attributes = NULL;
	//}
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
CatalogsCreateRetailItem::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *attributesKey = "attributes";
	node = json_object_get_member(pJsonObject, attributesKey);
	if (node !=NULL) {
	

		if (isprimitive("ItemAttributesRequest")) {
			jsonToValue(&attributes, node, "ItemAttributesRequest", "ItemAttributesRequest");
		} else {
			
			ItemAttributesRequest* obj = static_cast<ItemAttributesRequest*> (&attributes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
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

CatalogsCreateRetailItem::CatalogsCreateRetailItem(char* json)
{
	this->fromJson(json);
}

char*
CatalogsCreateRetailItem::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ItemAttributesRequest")) {
		ItemAttributesRequest obj = getAttributes();
		node = converttoJson(&obj, "ItemAttributesRequest", "");
	}
	else {
		
		ItemAttributesRequest obj = static_cast<ItemAttributesRequest> (getAttributes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *attributesKey = "attributes";
	json_object_set_member(pJsonObject, attributesKey, node);
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

ItemAttributesRequest
CatalogsCreateRetailItem::getAttributes()
{
	return attributes;
}

void
CatalogsCreateRetailItem::setAttributes(ItemAttributesRequest  attributes)
{
	this->attributes = attributes;
}

std::string
CatalogsCreateRetailItem::getItemId()
{
	return item_id;
}

void
CatalogsCreateRetailItem::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}

std::string
CatalogsCreateRetailItem::getOperation()
{
	return operation;
}

void
CatalogsCreateRetailItem::setOperation(std::string  operation)
{
	this->operation = operation;
}


