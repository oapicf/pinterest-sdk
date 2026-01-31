#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "NotificationResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

NotificationResponse::NotificationResponse()
{
	//__init();
}

NotificationResponse::~NotificationResponse()
{
	//__cleanup();
}

void
NotificationResponse::__init()
{
	//success = bool(false);
	//received_at = int(0);
	//error_msg = std::string();
}

void
NotificationResponse::__cleanup()
{
	//if(success != NULL) {
	//
	//delete success;
	//success = NULL;
	//}
	//if(received_at != NULL) {
	//
	//delete received_at;
	//received_at = NULL;
	//}
	//if(error_msg != NULL) {
	//
	//delete error_msg;
	//error_msg = NULL;
	//}
	//
}

void
NotificationResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *successKey = "success";
	node = json_object_get_member(pJsonObject, successKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&success, node, "bool", "");
		} else {
			
		}
	}
	const gchar *received_atKey = "received_at";
	node = json_object_get_member(pJsonObject, received_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&received_at, node, "int", "");
		} else {
			
		}
	}
	const gchar *error_msgKey = "error_msg";
	node = json_object_get_member(pJsonObject, error_msgKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&error_msg, node, "std::string", "");
		} else {
			
		}
	}
}

NotificationResponse::NotificationResponse(char* json)
{
	this->fromJson(json);
}

char*
NotificationResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("bool")) {
		bool obj = getSuccess();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *successKey = "success";
	json_object_set_member(pJsonObject, successKey, node);
	if (isprimitive("int")) {
		int obj = getReceivedAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *received_atKey = "received_at";
	json_object_set_member(pJsonObject, received_atKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getErrorMsg();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *error_msgKey = "error_msg";
	json_object_set_member(pJsonObject, error_msgKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

bool
NotificationResponse::getSuccess()
{
	return success;
}

void
NotificationResponse::setSuccess(bool  success)
{
	this->success = success;
}

int
NotificationResponse::getReceivedAt()
{
	return received_at;
}

void
NotificationResponse::setReceivedAt(int  received_at)
{
	this->received_at = received_at;
}

std::string
NotificationResponse::getErrorMsg()
{
	return error_msg;
}

void
NotificationResponse::setErrorMsg(std::string  error_msg)
{
	this->error_msg = error_msg;
}


