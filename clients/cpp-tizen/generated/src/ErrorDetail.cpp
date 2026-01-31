#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ErrorDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ErrorDetail::ErrorDetail()
{
	//__init();
}

ErrorDetail::~ErrorDetail()
{
	//__cleanup();
}

void
ErrorDetail::__init()
{
	//count = int(0);
	//error_code = int(0);
	//message = std::string();
}

void
ErrorDetail::__cleanup()
{
	//if(count != NULL) {
	//
	//delete count;
	//count = NULL;
	//}
	//if(error_code != NULL) {
	//
	//delete error_code;
	//error_code = NULL;
	//}
	//if(message != NULL) {
	//
	//delete message;
	//message = NULL;
	//}
	//
}

void
ErrorDetail::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *countKey = "count";
	node = json_object_get_member(pJsonObject, countKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&count, node, "int", "");
		} else {
			
		}
	}
	const gchar *error_codeKey = "error_code";
	node = json_object_get_member(pJsonObject, error_codeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&error_code, node, "int", "");
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

ErrorDetail::ErrorDetail(char* json)
{
	this->fromJson(json);
}

char*
ErrorDetail::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getCount();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *countKey = "count";
	json_object_set_member(pJsonObject, countKey, node);
	if (isprimitive("int")) {
		int obj = getErrorCode();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *error_codeKey = "error_code";
	json_object_set_member(pJsonObject, error_codeKey, node);
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
ErrorDetail::getCount()
{
	return count;
}

void
ErrorDetail::setCount(int  count)
{
	this->count = count;
}

int
ErrorDetail::getErrorCode()
{
	return error_code;
}

void
ErrorDetail::setErrorCode(int  error_code)
{
	this->error_code = error_code;
}

std::string
ErrorDetail::getMessage()
{
	return message;
}

void
ErrorDetail::setMessage(std::string  message)
{
	this->message = message;
}


