#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Integrations_logs_post_400_response.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Integrations_logs_post_400_response::Integrations_logs_post_400_response()
{
	//__init();
}

Integrations_logs_post_400_response::~Integrations_logs_post_400_response()
{
	//__cleanup();
}

void
Integrations_logs_post_400_response::__init()
{
	//code = int(0);
	//message = std::string();
	//details = null;
}

void
Integrations_logs_post_400_response::__cleanup()
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
	//if(details != NULL) {
	//
	//delete details;
	//details = NULL;
	//}
	//
}

void
Integrations_logs_post_400_response::fromJson(char* jsonStr)
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
	const gchar *detailsKey = "details";
	node = json_object_get_member(pJsonObject, detailsKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&details, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&details);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

Integrations_logs_post_400_response::Integrations_logs_post_400_response(char* json)
{
	this->fromJson(json);
}

char*
Integrations_logs_post_400_response::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getDetails();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getDetails());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *detailsKey = "details";
	json_object_set_member(pJsonObject, detailsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
Integrations_logs_post_400_response::getCode()
{
	return code;
}

void
Integrations_logs_post_400_response::setCode(int  code)
{
	this->code = code;
}

std::string
Integrations_logs_post_400_response::getMessage()
{
	return message;
}

void
Integrations_logs_post_400_response::setMessage(std::string  message)
{
	this->message = message;
}

std::string
Integrations_logs_post_400_response::getDetails()
{
	return details;
}

void
Integrations_logs_post_400_response::setDetails(std::string  details)
{
	this->details = details;
}


