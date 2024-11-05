#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ItemUpsertBatchRecord.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ItemUpsertBatchRecord::ItemUpsertBatchRecord()
{
	//__init();
}

ItemUpsertBatchRecord::~ItemUpsertBatchRecord()
{
	//__cleanup();
}

void
ItemUpsertBatchRecord::__init()
{
	//item_id = std::string();
	//attributes = new ItemAttributesRequest();
}

void
ItemUpsertBatchRecord::__cleanup()
{
	//if(item_id != NULL) {
	//
	//delete item_id;
	//item_id = NULL;
	//}
	//if(attributes != NULL) {
	//
	//delete attributes;
	//attributes = NULL;
	//}
	//
}

void
ItemUpsertBatchRecord::fromJson(char* jsonStr)
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
}

ItemUpsertBatchRecord::ItemUpsertBatchRecord(char* json)
{
	this->fromJson(json);
}

char*
ItemUpsertBatchRecord::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ItemUpsertBatchRecord::getItemId()
{
	return item_id;
}

void
ItemUpsertBatchRecord::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}

ItemAttributesRequest
ItemUpsertBatchRecord::getAttributes()
{
	return attributes;
}

void
ItemUpsertBatchRecord::setAttributes(ItemAttributesRequest  attributes)
{
	this->attributes = attributes;
}


