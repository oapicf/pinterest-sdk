#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BulkJobData.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BulkJobData::BulkJobData()
{
	//__init();
}

BulkJobData::~BulkJobData()
{
	//__cleanup();
}

void
BulkJobData::__init()
{
	//result_url = std::string();
	//status = new BulkRequestStatus();
	//workload_id = int(0);
}

void
BulkJobData::__cleanup()
{
	//if(result_url != NULL) {
	//
	//delete result_url;
	//result_url = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(workload_id != NULL) {
	//
	//delete workload_id;
	//workload_id = NULL;
	//}
	//
}

void
BulkJobData::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *result_urlKey = "result_url";
	node = json_object_get_member(pJsonObject, result_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&result_url, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("BulkRequestStatus")) {
			jsonToValue(&status, node, "BulkRequestStatus", "BulkRequestStatus");
		} else {
			
			BulkRequestStatus* obj = static_cast<BulkRequestStatus*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *workload_idKey = "workload_id";
	node = json_object_get_member(pJsonObject, workload_idKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&workload_id, node, "int", "");
		} else {
			
		}
	}
}

BulkJobData::BulkJobData(char* json)
{
	this->fromJson(json);
}

char*
BulkJobData::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getResultUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *result_urlKey = "result_url";
	json_object_set_member(pJsonObject, result_urlKey, node);
	if (isprimitive("BulkRequestStatus")) {
		BulkRequestStatus obj = getStatus();
		node = converttoJson(&obj, "BulkRequestStatus", "");
	}
	else {
		
		BulkRequestStatus obj = static_cast<BulkRequestStatus> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("int")) {
		int obj = getWorkloadId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *workload_idKey = "workload_id";
	json_object_set_member(pJsonObject, workload_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
BulkJobData::getResultUrl()
{
	return result_url;
}

void
BulkJobData::setResultUrl(std::string  result_url)
{
	this->result_url = result_url;
}

BulkRequestStatus
BulkJobData::getStatus()
{
	return status;
}

void
BulkJobData::setStatus(BulkRequestStatus  status)
{
	this->status = status;
}

int
BulkJobData::getWorkloadId()
{
	return workload_id;
}

void
BulkJobData::setWorkloadId(int  workload_id)
{
	this->workload_id = workload_id;
}


