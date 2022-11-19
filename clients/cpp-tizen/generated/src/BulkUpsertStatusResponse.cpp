#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BulkUpsertStatusResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BulkUpsertStatusResponse::BulkUpsertStatusResponse()
{
	//__init();
}

BulkUpsertStatusResponse::~BulkUpsertStatusResponse()
{
	//__cleanup();
}

void
BulkUpsertStatusResponse::__init()
{
	//status = new BulkUpsertStatus();
	//result_url = std::string();
}

void
BulkUpsertStatusResponse::__cleanup()
{
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(result_url != NULL) {
	//
	//delete result_url;
	//result_url = NULL;
	//}
	//
}

void
BulkUpsertStatusResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("BulkUpsertStatus")) {
			jsonToValue(&status, node, "BulkUpsertStatus", "BulkUpsertStatus");
		} else {
			
			BulkUpsertStatus* obj = static_cast<BulkUpsertStatus*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *result_urlKey = "result_url";
	node = json_object_get_member(pJsonObject, result_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&result_url, node, "std::string", "");
		} else {
			
		}
	}
}

BulkUpsertStatusResponse::BulkUpsertStatusResponse(char* json)
{
	this->fromJson(json);
}

char*
BulkUpsertStatusResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("BulkUpsertStatus")) {
		BulkUpsertStatus obj = getStatus();
		node = converttoJson(&obj, "BulkUpsertStatus", "");
	}
	else {
		
		BulkUpsertStatus obj = static_cast<BulkUpsertStatus> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getResultUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *result_urlKey = "result_url";
	json_object_set_member(pJsonObject, result_urlKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

BulkUpsertStatus
BulkUpsertStatusResponse::getStatus()
{
	return status;
}

void
BulkUpsertStatusResponse::setStatus(BulkUpsertStatus  status)
{
	this->status = status;
}

std::string
BulkUpsertStatusResponse::getResultUrl()
{
	return result_url;
}

void
BulkUpsertStatusResponse::setResultUrl(std::string  result_url)
{
	this->result_url = result_url;
}


