#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Campaign_ad_preview_delete_200_response_inner_status.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Campaign_ad_preview_delete_200_response_inner_status::Campaign_ad_preview_delete_200_response_inner_status()
{
	//__init();
}

Campaign_ad_preview_delete_200_response_inner_status::~Campaign_ad_preview_delete_200_response_inner_status()
{
	//__cleanup();
}

void
Campaign_ad_preview_delete_200_response_inner_status::__init()
{
	//statusCode = double(0);
	//code = int(0);
	//message = std::string();
}

void
Campaign_ad_preview_delete_200_response_inner_status::__cleanup()
{
	//if(statusCode != NULL) {
	//
	//delete statusCode;
	//statusCode = NULL;
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
Campaign_ad_preview_delete_200_response_inner_status::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *statusCodeKey = "statusCode";
	node = json_object_get_member(pJsonObject, statusCodeKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&statusCode, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&statusCode);
			obj->fromJson(json_to_string(node, false));
			
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

Campaign_ad_preview_delete_200_response_inner_status::Campaign_ad_preview_delete_200_response_inner_status(char* json)
{
	this->fromJson(json);
}

char*
Campaign_ad_preview_delete_200_response_inner_status::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getStatusCode();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getStatusCode());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusCodeKey = "statusCode";
	json_object_set_member(pJsonObject, statusCodeKey, node);
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

long long
Campaign_ad_preview_delete_200_response_inner_status::getStatusCode()
{
	return statusCode;
}

void
Campaign_ad_preview_delete_200_response_inner_status::setStatusCode(long long  statusCode)
{
	this->statusCode = statusCode;
}

int
Campaign_ad_preview_delete_200_response_inner_status::getCode()
{
	return code;
}

void
Campaign_ad_preview_delete_200_response_inner_status::setCode(int  code)
{
	this->code = code;
}

std::string
Campaign_ad_preview_delete_200_response_inner_status::getMessage()
{
	return message;
}

void
Campaign_ad_preview_delete_200_response_inner_status::setMessage(std::string  message)
{
	this->message = message;
}


