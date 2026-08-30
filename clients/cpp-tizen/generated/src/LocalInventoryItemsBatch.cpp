#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LocalInventoryItemsBatch.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LocalInventoryItemsBatch::LocalInventoryItemsBatch()
{
	//__init();
}

LocalInventoryItemsBatch::~LocalInventoryItemsBatch()
{
	//__cleanup();
}

void
LocalInventoryItemsBatch::__init()
{
	//batch_id = std::string();
	//completed_time = null;
	//created_time = null;
	//new std::list()std::list> operation_results;
	//status = null;
}

void
LocalInventoryItemsBatch::__cleanup()
{
	//if(batch_id != NULL) {
	//
	//delete batch_id;
	//batch_id = NULL;
	//}
	//if(completed_time != NULL) {
	//
	//delete completed_time;
	//completed_time = NULL;
	//}
	//if(created_time != NULL) {
	//
	//delete created_time;
	//created_time = NULL;
	//}
	//if(operation_results != NULL) {
	//operation_results.RemoveAll(true);
	//delete operation_results;
	//operation_results = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//
}

void
LocalInventoryItemsBatch::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *batch_idKey = "batch_id";
	node = json_object_get_member(pJsonObject, batch_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&batch_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *completed_timeKey = "completed_time";
	node = json_object_get_member(pJsonObject, completed_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&completed_time, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *created_timeKey = "created_time";
	node = json_object_get_member(pJsonObject, created_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&created_time, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *operation_resultsKey = "operation_results";
	node = json_object_get_member(pJsonObject, operation_resultsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<SupplementalOperationResult> new_list;
			SupplementalOperationResult inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("SupplementalOperationResult")) {
					jsonToValue(&inst, temp_json, "SupplementalOperationResult", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			operation_results = new_list;
		}
		
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("SupplementalItemBatchOperationStatus")) {
			jsonToValue(&status, node, "SupplementalItemBatchOperationStatus", "SupplementalItemBatchOperationStatus");
		} else {
			
			SupplementalItemBatchOperationStatus* obj = static_cast<SupplementalItemBatchOperationStatus*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

LocalInventoryItemsBatch::LocalInventoryItemsBatch(char* json)
{
	this->fromJson(json);
}

char*
LocalInventoryItemsBatch::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getBatchId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *batch_idKey = "batch_id";
	json_object_set_member(pJsonObject, batch_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCompletedTime();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *completed_timeKey = "completed_time";
	json_object_set_member(pJsonObject, completed_timeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCreatedTime();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *created_timeKey = "created_time";
	json_object_set_member(pJsonObject, created_timeKey, node);
	if (isprimitive("SupplementalOperationResult")) {
		list<SupplementalOperationResult> new_list = static_cast<list <SupplementalOperationResult> > (getOperationResults());
		node = converttoJson(&new_list, "SupplementalOperationResult", "array");
	} else {
		node = json_node_alloc();
		list<SupplementalOperationResult> new_list = static_cast<list <SupplementalOperationResult> > (getOperationResults());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<SupplementalOperationResult>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			SupplementalOperationResult obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *operation_resultsKey = "operation_results";
	json_object_set_member(pJsonObject, operation_resultsKey, node);
	if (isprimitive("SupplementalItemBatchOperationStatus")) {
		SupplementalItemBatchOperationStatus obj = getStatus();
		node = converttoJson(&obj, "SupplementalItemBatchOperationStatus", "");
	}
	else {
		
		SupplementalItemBatchOperationStatus obj = static_cast<SupplementalItemBatchOperationStatus> (getStatus());
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

std::string
LocalInventoryItemsBatch::getBatchId()
{
	return batch_id;
}

void
LocalInventoryItemsBatch::setBatchId(std::string  batch_id)
{
	this->batch_id = batch_id;
}

std::string
LocalInventoryItemsBatch::getCompletedTime()
{
	return completed_time;
}

void
LocalInventoryItemsBatch::setCompletedTime(std::string  completed_time)
{
	this->completed_time = completed_time;
}

std::string
LocalInventoryItemsBatch::getCreatedTime()
{
	return created_time;
}

void
LocalInventoryItemsBatch::setCreatedTime(std::string  created_time)
{
	this->created_time = created_time;
}

std::list<SupplementalOperationResult>
LocalInventoryItemsBatch::getOperationResults()
{
	return operation_results;
}

void
LocalInventoryItemsBatch::setOperationResults(std::list <SupplementalOperationResult> operation_results)
{
	this->operation_results = operation_results;
}

SupplementalItemBatchOperationStatus
LocalInventoryItemsBatch::getStatus()
{
	return status;
}

void
LocalInventoryItemsBatch::setStatus(SupplementalItemBatchOperationStatus  status)
{
	this->status = status;
}


