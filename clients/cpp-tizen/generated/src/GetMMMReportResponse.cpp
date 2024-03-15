#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetMMMReportResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetMMMReportResponse::GetMMMReportResponse()
{
	//__init();
}

GetMMMReportResponse::~GetMMMReportResponse()
{
	//__cleanup();
}

void
GetMMMReportResponse::__init()
{
	//code = double(0);
	//data = new GetMMMReportResponseData();
	//message = std::string();
	//status = std::string();
}

void
GetMMMReportResponse::__cleanup()
{
	//if(code != NULL) {
	//
	//delete code;
	//code = NULL;
	//}
	//if(data != NULL) {
	//
	//delete data;
	//data = NULL;
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
GetMMMReportResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *codeKey = "code";
	node = json_object_get_member(pJsonObject, codeKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&code, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&code);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *dataKey = "data";
	node = json_object_get_member(pJsonObject, dataKey);
	if (node !=NULL) {
	

		if (isprimitive("GetMMMReportResponseData")) {
			jsonToValue(&data, node, "GetMMMReportResponseData", "GetMMMReportResponseData");
		} else {
			
			GetMMMReportResponseData* obj = static_cast<GetMMMReportResponseData*> (&data);
			obj->fromJson(json_to_string(node, false));
			
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

GetMMMReportResponse::GetMMMReportResponse(char* json)
{
	this->fromJson(json);
}

char*
GetMMMReportResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getCode();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getCode());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *codeKey = "code";
	json_object_set_member(pJsonObject, codeKey, node);
	if (isprimitive("GetMMMReportResponseData")) {
		GetMMMReportResponseData obj = getData();
		node = converttoJson(&obj, "GetMMMReportResponseData", "");
	}
	else {
		
		GetMMMReportResponseData obj = static_cast<GetMMMReportResponseData> (getData());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *dataKey = "data";
	json_object_set_member(pJsonObject, dataKey, node);
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

long long
GetMMMReportResponse::getCode()
{
	return code;
}

void
GetMMMReportResponse::setCode(long long  code)
{
	this->code = code;
}

GetMMMReportResponseData
GetMMMReportResponse::getData()
{
	return data;
}

void
GetMMMReportResponse::setData(GetMMMReportResponseData  data)
{
	this->data = data;
}

std::string
GetMMMReportResponse::getMessage()
{
	return message;
}

void
GetMMMReportResponse::setMessage(std::string  message)
{
	this->message = message;
}

std::string
GetMMMReportResponse::getStatus()
{
	return status;
}

void
GetMMMReportResponse::setStatus(std::string  status)
{
	this->status = status;
}


