#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ProductTagItem.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ProductTagItem::ProductTagItem()
{
	//__init();
}

ProductTagItem::~ProductTagItem()
{
	//__cleanup();
}

void
ProductTagItem::__init()
{
	//pin_id = std::string();
}

void
ProductTagItem::__cleanup()
{
	//if(pin_id != NULL) {
	//
	//delete pin_id;
	//pin_id = NULL;
	//}
	//
}

void
ProductTagItem::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *pin_idKey = "pin_id";
	node = json_object_get_member(pJsonObject, pin_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&pin_id, node, "std::string", "");
		} else {
			
		}
	}
}

ProductTagItem::ProductTagItem(char* json)
{
	this->fromJson(json);
}

char*
ProductTagItem::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getPinId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *pin_idKey = "pin_id";
	json_object_set_member(pJsonObject, pin_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ProductTagItem::getPinId()
{
	return pin_id;
}

void
ProductTagItem::setPinId(std::string  pin_id)
{
	this->pin_id = pin_id;
}


