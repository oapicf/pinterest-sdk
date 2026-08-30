#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ConversionApiResponseEventsItems.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ConversionApiResponseEventsItems::ConversionApiResponseEventsItems()
{
	//__init();
}

ConversionApiResponseEventsItems::~ConversionApiResponseEventsItems()
{
	//__cleanup();
}

void
ConversionApiResponseEventsItems::__init()
{
	//error_message = std::string();
	//status = null;
	//warning_message = std::string();
}

void
ConversionApiResponseEventsItems::__cleanup()
{
	//if(error_message != NULL) {
	//
	//delete error_message;
	//error_message = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(warning_message != NULL) {
	//
	//delete warning_message;
	//warning_message = NULL;
	//}
	//
}

void
ConversionApiResponseEventsItems::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *error_messageKey = "error_message";
	node = json_object_get_member(pJsonObject, error_messageKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&error_message, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("EventProcessingStatus")) {
			jsonToValue(&status, node, "EventProcessingStatus", "EventProcessingStatus");
		} else {
			
			EventProcessingStatus* obj = static_cast<EventProcessingStatus*> (&status);
			obj->fromJson(json_to_string(node, false));
			
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

ConversionApiResponseEventsItems::ConversionApiResponseEventsItems(char* json)
{
	this->fromJson(json);
}

char*
ConversionApiResponseEventsItems::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getErrorMessage();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *error_messageKey = "error_message";
	json_object_set_member(pJsonObject, error_messageKey, node);
	if (isprimitive("EventProcessingStatus")) {
		EventProcessingStatus obj = getStatus();
		node = converttoJson(&obj, "EventProcessingStatus", "");
	}
	else {
		
		EventProcessingStatus obj = static_cast<EventProcessingStatus> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
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
ConversionApiResponseEventsItems::getErrorMessage()
{
	return error_message;
}

void
ConversionApiResponseEventsItems::setErrorMessage(std::string  error_message)
{
	this->error_message = error_message;
}

EventProcessingStatus
ConversionApiResponseEventsItems::getStatus()
{
	return status;
}

void
ConversionApiResponseEventsItems::setStatus(EventProcessingStatus  status)
{
	this->status = status;
}

std::string
ConversionApiResponseEventsItems::getWarningMessage()
{
	return warning_message;
}

void
ConversionApiResponseEventsItems::setWarningMessage(std::string  warning_message)
{
	this->warning_message = warning_message;
}


