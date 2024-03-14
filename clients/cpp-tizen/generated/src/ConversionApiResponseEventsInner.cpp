#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ConversionApiResponse_events_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ConversionApiResponse_events_inner::ConversionApiResponse_events_inner()
{
	//__init();
}

ConversionApiResponse_events_inner::~ConversionApiResponse_events_inner()
{
	//__cleanup();
}

void
ConversionApiResponse_events_inner::__init()
{
	//status = std::string();
	//error_message = std::string();
	//warning_message = std::string();
}

void
ConversionApiResponse_events_inner::__cleanup()
{
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(error_message != NULL) {
	//
	//delete error_message;
	//error_message = NULL;
	//}
	//if(warning_message != NULL) {
	//
	//delete warning_message;
	//warning_message = NULL;
	//}
	//
}

void
ConversionApiResponse_events_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&status, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *error_messageKey = "error_message";
	node = json_object_get_member(pJsonObject, error_messageKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&error_message, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *warning_messageKey = "warning_message";
	node = json_object_get_member(pJsonObject, warning_messageKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&warning_message, node, "std::string", "");
		} else {
			
		}
	}
}

ConversionApiResponse_events_inner::ConversionApiResponse_events_inner(char* json)
{
	this->fromJson(json);
}

char*
ConversionApiResponse_events_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getStatus();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getErrorMessage();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *error_messageKey = "error_message";
	json_object_set_member(pJsonObject, error_messageKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getWarningMessage();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *warning_messageKey = "warning_message";
	json_object_set_member(pJsonObject, warning_messageKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ConversionApiResponse_events_inner::getStatus()
{
	return status;
}

void
ConversionApiResponse_events_inner::setStatus(std::string  status)
{
	this->status = status;
}

std::string
ConversionApiResponse_events_inner::getErrorMessage()
{
	return error_message;
}

void
ConversionApiResponse_events_inner::setErrorMessage(std::string  error_message)
{
	this->error_message = error_message;
}

std::string
ConversionApiResponse_events_inner::getWarningMessage()
{
	return warning_message;
}

void
ConversionApiResponse_events_inner::setWarningMessage(std::string  warning_message)
{
	this->warning_message = warning_message;
}


