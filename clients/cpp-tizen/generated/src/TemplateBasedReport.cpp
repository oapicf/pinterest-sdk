#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TemplateBasedReport.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TemplateBasedReport::TemplateBasedReport()
{
	//__init();
}

TemplateBasedReport::~TemplateBasedReport()
{
	//__cleanup();
}

void
TemplateBasedReport::__init()
{
	//message = std::string();
	//report_status = new BulkReportingJobStatus();
	//template_id = std::string();
	//token = std::string();
}

void
TemplateBasedReport::__cleanup()
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
	//if(template_id != NULL) {
	//
	//delete template_id;
	//template_id = NULL;
	//}
	//if(token != NULL) {
	//
	//delete token;
	//token = NULL;
	//}
	//
}

void
TemplateBasedReport::fromJson(char* jsonStr)
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
	const gchar *template_idKey = "template_id";
	node = json_object_get_member(pJsonObject, template_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&template_id, node, "std::string", "");
		} else {
			
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

TemplateBasedReport::TemplateBasedReport(char* json)
{
	this->fromJson(json);
}

char*
TemplateBasedReport::toJson()
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
		std::string obj = getTemplateId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *template_idKey = "template_id";
	json_object_set_member(pJsonObject, template_idKey, node);
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
TemplateBasedReport::getMessage()
{
	return message;
}

void
TemplateBasedReport::setMessage(std::string  message)
{
	this->message = message;
}

BulkReportingJobStatus
TemplateBasedReport::getReportStatus()
{
	return report_status;
}

void
TemplateBasedReport::setReportStatus(BulkReportingJobStatus  report_status)
{
	this->report_status = report_status;
}

std::string
TemplateBasedReport::getTemplateId()
{
	return template_id;
}

void
TemplateBasedReport::setTemplateId(std::string  template_id)
{
	this->template_id = template_id;
}

std::string
TemplateBasedReport::getToken()
{
	return token;
}

void
TemplateBasedReport::setToken(std::string  token)
{
	this->token = token;
}


