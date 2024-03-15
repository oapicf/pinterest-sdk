#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdPinId.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdPinId::AdPinId()
{
	//__init();
}

AdPinId::~AdPinId()
{
	//__cleanup();
}

void
AdPinId::__init()
{
	//pin_id = std::string();
}

void
AdPinId::__cleanup()
{
	//if(pin_id != NULL) {
	//
	//delete pin_id;
	//pin_id = NULL;
	//}
	//
}

void
AdPinId::fromJson(char* jsonStr)
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

AdPinId::AdPinId(char* json)
{
	this->fromJson(json);
}

char*
AdPinId::toJson()
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
AdPinId::getPinId()
{
	return pin_id;
}

void
AdPinId::setPinId(std::string  pin_id)
{
	this->pin_id = pin_id;
}


