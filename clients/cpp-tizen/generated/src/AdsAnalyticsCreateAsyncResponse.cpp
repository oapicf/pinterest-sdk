#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdsAnalyticsCreateAsyncResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdsAnalyticsCreateAsyncResponse::AdsAnalyticsCreateAsyncResponse()
{
	//__init();
}

AdsAnalyticsCreateAsyncResponse::~AdsAnalyticsCreateAsyncResponse()
{
	//__cleanup();
}

void
AdsAnalyticsCreateAsyncResponse::__init()
{
	//report_status = std::string();
	//token = std::string();
	//message = std::string();
}

void
AdsAnalyticsCreateAsyncResponse::__cleanup()
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
	//
}

void
AdsAnalyticsCreateAsyncResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *report_statusKey = "report_status";
	node = json_object_get_member(pJsonObject, report_statusKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&report_status, node, "std::string", "");
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
	const gchar *messageKey = "message";
	node = json_object_get_member(pJsonObject, messageKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&message, node, "std::string", "");
		} else {
			
		}
	}
}

AdsAnalyticsCreateAsyncResponse::AdsAnalyticsCreateAsyncResponse(char* json)
{
	this->fromJson(json);
}

char*
AdsAnalyticsCreateAsyncResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getReportStatus();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AdsAnalyticsCreateAsyncResponse::getReportStatus()
{
	return report_status;
}

void
AdsAnalyticsCreateAsyncResponse::setReportStatus(std::string  report_status)
{
	this->report_status = report_status;
}

std::string
AdsAnalyticsCreateAsyncResponse::getToken()
{
	return token;
}

void
AdsAnalyticsCreateAsyncResponse::setToken(std::string  token)
{
	this->token = token;
}

std::string
AdsAnalyticsCreateAsyncResponse::getMessage()
{
	return message;
}

void
AdsAnalyticsCreateAsyncResponse::setMessage(std::string  message)
{
	this->message = message;
}


