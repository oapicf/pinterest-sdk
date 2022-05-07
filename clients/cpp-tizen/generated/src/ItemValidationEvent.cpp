#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ItemValidationEvent.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ItemValidationEvent::ItemValidationEvent()
{
	//__init();
}

ItemValidationEvent::~ItemValidationEvent()
{
	//__cleanup();
}

void
ItemValidationEvent::__init()
{
	//attribute = std::string();
	//code = int(0);
	//message = std::string();
}

void
ItemValidationEvent::__cleanup()
{
	//if(attribute != NULL) {
	//
	//delete attribute;
	//attribute = NULL;
	//}
	//if(code != NULL) {
	//
	//delete code;
	//code = NULL;
	//}
	//if(message != NULL) {
	//
	//delete message;
	//message = NULL;
	//}
	//
}

void
ItemValidationEvent::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *attributeKey = "attribute";
	node = json_object_get_member(pJsonObject, attributeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&attribute, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *codeKey = "code";
	node = json_object_get_member(pJsonObject, codeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&code, node, "int", "");
		} else {
			
		}
	}
	const gchar *messageKey = "message";
	node = json_object_get_member(pJsonObject, messageKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&message, node, "std::string", "");
		} else {
			
		}
	}
}

ItemValidationEvent::ItemValidationEvent(char* json)
{
	this->fromJson(json);
}

char*
ItemValidationEvent::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAttribute();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *attributeKey = "attribute";
	json_object_set_member(pJsonObject, attributeKey, node);
	if (isprimitive("int")) {
		int obj = getCode();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *codeKey = "code";
	json_object_set_member(pJsonObject, codeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMessage();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *messageKey = "message";
	json_object_set_member(pJsonObject, messageKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ItemValidationEvent::getAttribute()
{
	return attribute;
}

void
ItemValidationEvent::setAttribute(std::string  attribute)
{
	this->attribute = attribute;
}

int
ItemValidationEvent::getCode()
{
	return code;
}

void
ItemValidationEvent::setCode(int  code)
{
	this->code = code;
}

std::string
ItemValidationEvent::getMessage()
{
	return message;
}

void
ItemValidationEvent::setMessage(std::string  message)
{
	this->message = message;
}


