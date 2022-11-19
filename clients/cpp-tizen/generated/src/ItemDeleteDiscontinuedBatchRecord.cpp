#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ItemDeleteDiscontinuedBatchRecord.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ItemDeleteDiscontinuedBatchRecord::ItemDeleteDiscontinuedBatchRecord()
{
	//__init();
}

ItemDeleteDiscontinuedBatchRecord::~ItemDeleteDiscontinuedBatchRecord()
{
	//__cleanup();
}

void
ItemDeleteDiscontinuedBatchRecord::__init()
{
	//item_id = std::string();
}

void
ItemDeleteDiscontinuedBatchRecord::__cleanup()
{
	//if(item_id != NULL) {
	//
	//delete item_id;
	//item_id = NULL;
	//}
	//
}

void
ItemDeleteDiscontinuedBatchRecord::fromJson(char* jsonStr)
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
}

ItemDeleteDiscontinuedBatchRecord::ItemDeleteDiscontinuedBatchRecord(char* json)
{
	this->fromJson(json);
}

char*
ItemDeleteDiscontinuedBatchRecord::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ItemDeleteDiscontinuedBatchRecord::getItemId()
{
	return item_id;
}

void
ItemDeleteDiscontinuedBatchRecord::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}


