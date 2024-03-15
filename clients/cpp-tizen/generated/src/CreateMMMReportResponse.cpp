#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateMMMReportResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateMMMReportResponse::CreateMMMReportResponse()
{
	//__init();
}

CreateMMMReportResponse::~CreateMMMReportResponse()
{
	//__cleanup();
}

void
CreateMMMReportResponse::__init()
{
	//code = double(0);
	//data = new CreateMMMReportResponseData();
}

void
CreateMMMReportResponse::__cleanup()
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
	//
}

void
CreateMMMReportResponse::fromJson(char* jsonStr)
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
	

		if (isprimitive("CreateMMMReportResponseData")) {
			jsonToValue(&data, node, "CreateMMMReportResponseData", "CreateMMMReportResponseData");
		} else {
			
			CreateMMMReportResponseData* obj = static_cast<CreateMMMReportResponseData*> (&data);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CreateMMMReportResponse::CreateMMMReportResponse(char* json)
{
	this->fromJson(json);
}

char*
CreateMMMReportResponse::toJson()
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
	if (isprimitive("CreateMMMReportResponseData")) {
		CreateMMMReportResponseData obj = getData();
		node = converttoJson(&obj, "CreateMMMReportResponseData", "");
	}
	else {
		
		CreateMMMReportResponseData obj = static_cast<CreateMMMReportResponseData> (getData());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *dataKey = "data";
	json_object_set_member(pJsonObject, dataKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
CreateMMMReportResponse::getCode()
{
	return code;
}

void
CreateMMMReportResponse::setCode(long long  code)
{
	this->code = code;
}

CreateMMMReportResponseData
CreateMMMReportResponse::getData()
{
	return data;
}

void
CreateMMMReportResponse::setData(CreateMMMReportResponseData  data)
{
	this->data = data;
}


