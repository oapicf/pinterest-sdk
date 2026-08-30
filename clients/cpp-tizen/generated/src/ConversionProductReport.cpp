#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ConversionProductReport.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ConversionProductReport::ConversionProductReport()
{
	//__init();
}

ConversionProductReport::~ConversionProductReport()
{
	//__cleanup();
}

void
ConversionProductReport::__init()
{
	//message = std::string();
	//report_status = null;
	//size = double(0);
	//token = std::string();
	//url = std::string();
}

void
ConversionProductReport::__cleanup()
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
	//if(size != NULL) {
	//
	//delete size;
	//size = NULL;
	//}
	//if(token != NULL) {
	//
	//delete token;
	//token = NULL;
	//}
	//if(url != NULL) {
	//
	//delete url;
	//url = NULL;
	//}
	//
}

void
ConversionProductReport::fromJson(char* jsonStr)
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
	const gchar *sizeKey = "size";
	node = json_object_get_member(pJsonObject, sizeKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&size, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&size);
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
	const gchar *urlKey = "url";
	node = json_object_get_member(pJsonObject, urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&url, node, "std::string", "");
		} else {
			
		}
	}
}

ConversionProductReport::ConversionProductReport(char* json)
{
	this->fromJson(json);
}

char*
ConversionProductReport::toJson()
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
	if (isprimitive("long long")) {
		long long obj = getSize();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getSize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *sizeKey = "size";
	json_object_set_member(pJsonObject, sizeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getToken();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *tokenKey = "token";
	json_object_set_member(pJsonObject, tokenKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *urlKey = "url";
	json_object_set_member(pJsonObject, urlKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ConversionProductReport::getMessage()
{
	return message;
}

void
ConversionProductReport::setMessage(std::string  message)
{
	this->message = message;
}

BulkReportingJobStatus
ConversionProductReport::getReportStatus()
{
	return report_status;
}

void
ConversionProductReport::setReportStatus(BulkReportingJobStatus  report_status)
{
	this->report_status = report_status;
}

long long
ConversionProductReport::getSize()
{
	return size;
}

void
ConversionProductReport::setSize(long long  size)
{
	this->size = size;
}

std::string
ConversionProductReport::getToken()
{
	return token;
}

void
ConversionProductReport::setToken(std::string  token)
{
	this->token = token;
}

std::string
ConversionProductReport::getUrl()
{
	return url;
}

void
ConversionProductReport::setUrl(std::string  url)
{
	this->url = url;
}


