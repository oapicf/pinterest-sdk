#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ConversionDeletionRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ConversionDeletionRequest::ConversionDeletionRequest()
{
	//__init();
}

ConversionDeletionRequest::~ConversionDeletionRequest()
{
	//__cleanup();
}

void
ConversionDeletionRequest::__init()
{
	//created_time = null;
	//processed_time = null;
	//request_id = std::string();
	//status = null;
}

void
ConversionDeletionRequest::__cleanup()
{
	//if(created_time != NULL) {
	//
	//delete created_time;
	//created_time = NULL;
	//}
	//if(processed_time != NULL) {
	//
	//delete processed_time;
	//processed_time = NULL;
	//}
	//if(request_id != NULL) {
	//
	//delete request_id;
	//request_id = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//
}

void
ConversionDeletionRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *created_timeKey = "created_time";
	node = json_object_get_member(pJsonObject, created_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("Date")) {
			jsonToValue(&created_time, node, "Date", "Date");
		} else {
			
		}
	}
	const gchar *processed_timeKey = "processed_time";
	node = json_object_get_member(pJsonObject, processed_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("Date")) {
			jsonToValue(&processed_time, node, "Date", "Date");
		} else {
			
		}
	}
	const gchar *request_idKey = "request_id";
	node = json_object_get_member(pJsonObject, request_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&request_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("ConversionDeletionRequestStatus")) {
			jsonToValue(&status, node, "ConversionDeletionRequestStatus", "ConversionDeletionRequestStatus");
		} else {
			
			ConversionDeletionRequestStatus* obj = static_cast<ConversionDeletionRequestStatus*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ConversionDeletionRequest::ConversionDeletionRequest(char* json)
{
	this->fromJson(json);
}

char*
ConversionDeletionRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("Date")) {
		Date obj = getCreatedTime();
		node = converttoJson(&obj, "Date", "");
	}
	else {
		
	}
	const gchar *created_timeKey = "created_time";
	json_object_set_member(pJsonObject, created_timeKey, node);
	if (isprimitive("Date")) {
		Date obj = getProcessedTime();
		node = converttoJson(&obj, "Date", "");
	}
	else {
		
	}
	const gchar *processed_timeKey = "processed_time";
	json_object_set_member(pJsonObject, processed_timeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRequestId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *request_idKey = "request_id";
	json_object_set_member(pJsonObject, request_idKey, node);
	if (isprimitive("ConversionDeletionRequestStatus")) {
		ConversionDeletionRequestStatus obj = getStatus();
		node = converttoJson(&obj, "ConversionDeletionRequestStatus", "");
	}
	else {
		
		ConversionDeletionRequestStatus obj = static_cast<ConversionDeletionRequestStatus> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

Date
ConversionDeletionRequest::getCreatedTime()
{
	return created_time;
}

void
ConversionDeletionRequest::setCreatedTime(Date  created_time)
{
	this->created_time = created_time;
}

Date
ConversionDeletionRequest::getProcessedTime()
{
	return processed_time;
}

void
ConversionDeletionRequest::setProcessedTime(Date  processed_time)
{
	this->processed_time = processed_time;
}

std::string
ConversionDeletionRequest::getRequestId()
{
	return request_id;
}

void
ConversionDeletionRequest::setRequestId(std::string  request_id)
{
	this->request_id = request_id;
}

ConversionDeletionRequestStatus
ConversionDeletionRequest::getStatus()
{
	return status;
}

void
ConversionDeletionRequest::setStatus(ConversionDeletionRequestStatus  status)
{
	this->status = status;
}


