#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateMMMReportResponseData.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateMMMReportResponseData::CreateMMMReportResponseData()
{
	//__init();
}

CreateMMMReportResponseData::~CreateMMMReportResponseData()
{
	//__cleanup();
}

void
CreateMMMReportResponseData::__init()
{
	//report_status = std::string();
	//token = std::string();
	//message = std::string();
	//status = std::string();
}

void
CreateMMMReportResponseData::__cleanup()
{
	//if(report_status != NULL) {
	//
	//delete report_status;
	//report_status = NULL;
	//}
	//if(token != NULL) {
	//
	//delete token;
	//token = NULL;
	//}
	//if(message != NULL) {
	//
	//delete message;
	//message = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//
}

void
CreateMMMReportResponseData::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *report_statusKey = "report_status";
	node = json_object_get_member(pJsonObject, report_statusKey);
	if (node !=NULL) {
	

		if (isprimitive("BulkReportingJobStatus")) {
			jsonToValue(&report_status, node, "BulkReportingJobStatus", "BulkReportingJobStatus");
		} else {
			
			BulkReportingJobStatus* obj = static_cast<BulkReportingJobStatus*> (&report_status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *tokenKey = "token";
	node = json_object_get_member(pJsonObject, tokenKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&token, node, "std::string", "");
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
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&status, node, "std::string", "");
		} else {
			
		}
	}
}

CreateMMMReportResponseData::CreateMMMReportResponseData(char* json)
{
	this->fromJson(json);
}

char*
CreateMMMReportResponseData::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("BulkReportingJobStatus")) {
		BulkReportingJobStatus obj = getReportStatus();
		node = converttoJson(&obj, "BulkReportingJobStatus", "");
	}
	else {
		
		BulkReportingJobStatus obj = static_cast<BulkReportingJobStatus> (getReportStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *report_statusKey = "report_status";
	json_object_set_member(pJsonObject, report_statusKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getToken();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *tokenKey = "token";
	json_object_set_member(pJsonObject, tokenKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMessage();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *messageKey = "message";
	json_object_set_member(pJsonObject, messageKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStatus();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
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

BulkReportingJobStatus
CreateMMMReportResponseData::getReportStatus()
{
	return report_status;
}

void
CreateMMMReportResponseData::setReportStatus(BulkReportingJobStatus  report_status)
{
	this->report_status = report_status;
}

std::string
CreateMMMReportResponseData::getToken()
{
	return token;
}

void
CreateMMMReportResponseData::setToken(std::string  token)
{
	this->token = token;
}

std::string
CreateMMMReportResponseData::getMessage()
{
	return message;
}

void
CreateMMMReportResponseData::setMessage(std::string  message)
{
	this->message = message;
}

std::string
CreateMMMReportResponseData::getStatus()
{
	return status;
}

void
CreateMMMReportResponseData::setStatus(std::string  status)
{
	this->status = status;
}


