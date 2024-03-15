#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdsCreditRedeemResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdsCreditRedeemResponse::AdsCreditRedeemResponse()
{
	//__init();
}

AdsCreditRedeemResponse::~AdsCreditRedeemResponse()
{
	//__cleanup();
}

void
AdsCreditRedeemResponse::__init()
{
	//success = bool(false);
	//errorCode = int(0);
	//errorMessage = std::string();
}

void
AdsCreditRedeemResponse::__cleanup()
{
	//if(success != NULL) {
	//
	//delete success;
	//success = NULL;
	//}
	//if(errorCode != NULL) {
	//
	//delete errorCode;
	//errorCode = NULL;
	//}
	//if(errorMessage != NULL) {
	//
	//delete errorMessage;
	//errorMessage = NULL;
	//}
	//
}

void
AdsCreditRedeemResponse::fromJson(char* jsonStr)
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
	const gchar *errorCodeKey = "errorCode";
	node = json_object_get_member(pJsonObject, errorCodeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&errorCode, node, "int", "");
		} else {
			
		}
	}
	const gchar *errorMessageKey = "errorMessage";
	node = json_object_get_member(pJsonObject, errorMessageKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&errorMessage, node, "std::string", "");
		} else {
			
		}
	}
}

AdsCreditRedeemResponse::AdsCreditRedeemResponse(char* json)
{
	this->fromJson(json);
}

char*
AdsCreditRedeemResponse::toJson()
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
		int obj = getErrorCode();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *errorCodeKey = "errorCode";
	json_object_set_member(pJsonObject, errorCodeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getErrorMessage();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *errorMessageKey = "errorMessage";
	json_object_set_member(pJsonObject, errorMessageKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

bool
AdsCreditRedeemResponse::getSuccess()
{
	return success;
}

void
AdsCreditRedeemResponse::setSuccess(bool  success)
{
	this->success = success;
}

int
AdsCreditRedeemResponse::getErrorCode()
{
	return errorCode;
}

void
AdsCreditRedeemResponse::setErrorCode(int  errorCode)
{
	this->errorCode = errorCode;
}

std::string
AdsCreditRedeemResponse::getErrorMessage()
{
	return errorMessage;
}

void
AdsCreditRedeemResponse::setErrorMessage(std::string  errorMessage)
{
	this->errorMessage = errorMessage;
}


