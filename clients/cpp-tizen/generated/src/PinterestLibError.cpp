#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Pinterest.Lib.Error.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Pinterest.Lib.Error::Pinterest.Lib.Error()
{
	//__init();
}

Pinterest.Lib.Error::~Pinterest.Lib.Error()
{
	//__cleanup();
}

void
Pinterest.Lib.Error::__init()
{
	//code = int(0);
	//message = std::string();
}

void
Pinterest.Lib.Error::__cleanup()
{
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
Pinterest.Lib.Error::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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

Pinterest.Lib.Error::Pinterest.Lib.Error(char* json)
{
	this->fromJson(json);
}

char*
Pinterest.Lib.Error::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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

int
Pinterest.Lib.Error::getCode()
{
	return code;
}

void
Pinterest.Lib.Error::setCode(int  code)
{
	this->code = code;
}

std::string
Pinterest.Lib.Error::getMessage()
{
	return message;
}

void
Pinterest.Lib.Error::setMessage(std::string  message)
{
	this->message = message;
}


