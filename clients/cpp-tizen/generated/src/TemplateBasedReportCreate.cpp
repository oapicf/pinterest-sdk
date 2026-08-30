#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TemplateBasedReportCreate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TemplateBasedReportCreate::TemplateBasedReportCreate()
{
	//__init();
}

TemplateBasedReportCreate::~TemplateBasedReportCreate()
{
	//__cleanup();
}

void
TemplateBasedReportCreate::__init()
{
	//message = std::string();
	//report_status = new BulkReportingJobStatus();
	//token = std::string();
}

void
TemplateBasedReportCreate::__cleanup()
{
	//if(message != NULL) {
	//
	//delete message;
	//message = NULL;
	//}
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
	//
}

void
TemplateBasedReportCreate::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *messageKey = "message";
	node = json_object_get_member(pJsonObject, messageKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&message, node, "std::string", "");
		} else {
			
		}
	}
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
}

TemplateBasedReportCreate::TemplateBasedReportCreate(char* json)
{
	this->fromJson(json);
}

char*
TemplateBasedReportCreate::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getMessage();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *messageKey = "message";
	json_object_set_member(pJsonObject, messageKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
TemplateBasedReportCreate::getMessage()
{
	return message;
}

void
TemplateBasedReportCreate::setMessage(std::string  message)
{
	this->message = message;
}

BulkReportingJobStatus
TemplateBasedReportCreate::getReportStatus()
{
	return report_status;
}

void
TemplateBasedReportCreate::setReportStatus(BulkReportingJobStatus  report_status)
{
	this->report_status = report_status;
}

std::string
TemplateBasedReportCreate::getToken()
{
	return token;
}

void
TemplateBasedReportCreate::setToken(std::string  token)
{
	this->token = token;
}


