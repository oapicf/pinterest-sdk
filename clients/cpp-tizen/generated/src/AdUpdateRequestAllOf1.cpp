#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdUpdateRequestAllOf1.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdUpdateRequestAllOf1::AdUpdateRequestAllOf1()
{
	//__init();
}

AdUpdateRequestAllOf1::~AdUpdateRequestAllOf1()
{
	//__cleanup();
}

void
AdUpdateRequestAllOf1::__init()
{
	//id = std::string();
	//pin_id = std::string();
}

void
AdUpdateRequestAllOf1::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(pin_id != NULL) {
	//
	//delete pin_id;
	//pin_id = NULL;
	//}
	//
}

void
AdUpdateRequestAllOf1::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *pin_idKey = "pin_id";
	node = json_object_get_member(pJsonObject, pin_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&pin_id, node, "std::string", "");
		} else {
			
		}
	}
}

AdUpdateRequestAllOf1::AdUpdateRequestAllOf1(char* json)
{
	this->fromJson(json);
}

char*
AdUpdateRequestAllOf1::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
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
AdUpdateRequestAllOf1::getId()
{
	return id;
}

void
AdUpdateRequestAllOf1::setId(std::string  id)
{
	this->id = id;
}

std::string
AdUpdateRequestAllOf1::getPinId()
{
	return pin_id;
}

void
AdUpdateRequestAllOf1::setPinId(std::string  pin_id)
{
	this->pin_id = pin_id;
}


