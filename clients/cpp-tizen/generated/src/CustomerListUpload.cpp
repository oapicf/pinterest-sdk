#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CustomerListUpload.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CustomerListUpload::CustomerListUpload()
{
	//__init();
}

CustomerListUpload::~CustomerListUpload()
{
	//__cleanup();
}

void
CustomerListUpload::__init()
{
	//ad_account_id = std::string();
	//creation_time = int(0);
	//customer_list_id = std::string();
	//new std::list()std::list> error_counts;
	//id = std::string();
	//operation = new UserListOperationType();
	//record_counts = new RecordCounts();
	//state = std::string();
	//updated_time = int(0);
}

void
CustomerListUpload::__cleanup()
{
	//if(ad_account_id != NULL) {
	//
	//delete ad_account_id;
	//ad_account_id = NULL;
	//}
	//if(creation_time != NULL) {
	//
	//delete creation_time;
	//creation_time = NULL;
	//}
	//if(customer_list_id != NULL) {
	//
	//delete customer_list_id;
	//customer_list_id = NULL;
	//}
	//if(error_counts != NULL) {
	//error_counts.RemoveAll(true);
	//delete error_counts;
	//error_counts = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(operation != NULL) {
	//
	//delete operation;
	//operation = NULL;
	//}
	//if(record_counts != NULL) {
	//
	//delete record_counts;
	//record_counts = NULL;
	//}
	//if(state != NULL) {
	//
	//delete state;
	//state = NULL;
	//}
	//if(updated_time != NULL) {
	//
	//delete updated_time;
	//updated_time = NULL;
	//}
	//
}

void
CustomerListUpload::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *ad_account_idKey = "ad_account_id";
	node = json_object_get_member(pJsonObject, ad_account_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&ad_account_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *creation_timeKey = "creation_time";
	node = json_object_get_member(pJsonObject, creation_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&creation_time, node, "int", "");
		} else {
			
		}
	}
	const gchar *customer_list_idKey = "customer_list_id";
	node = json_object_get_member(pJsonObject, customer_list_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&customer_list_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *error_countsKey = "error_counts";
	node = json_object_get_member(pJsonObject, error_countsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ErrorDetail> new_list;
			ErrorDetail inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ErrorDetail")) {
					jsonToValue(&inst, temp_json, "ErrorDetail", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			error_counts = new_list;
		}
		
	}
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *operationKey = "operation";
	node = json_object_get_member(pJsonObject, operationKey);
	if (node !=NULL) {
	

		if (isprimitive("UserListOperationType")) {
			jsonToValue(&operation, node, "UserListOperationType", "UserListOperationType");
		} else {
			
			UserListOperationType* obj = static_cast<UserListOperationType*> (&operation);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *record_countsKey = "record_counts";
	node = json_object_get_member(pJsonObject, record_countsKey);
	if (node !=NULL) {
	

		if (isprimitive("RecordCounts")) {
			jsonToValue(&record_counts, node, "RecordCounts", "RecordCounts");
		} else {
			
			RecordCounts* obj = static_cast<RecordCounts*> (&record_counts);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *stateKey = "state";
	node = json_object_get_member(pJsonObject, stateKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&state, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *updated_timeKey = "updated_time";
	node = json_object_get_member(pJsonObject, updated_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&updated_time, node, "int", "");
		} else {
			
		}
	}
}

CustomerListUpload::CustomerListUpload(char* json)
{
	this->fromJson(json);
}

char*
CustomerListUpload::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAdAccountId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *ad_account_idKey = "ad_account_id";
	json_object_set_member(pJsonObject, ad_account_idKey, node);
	if (isprimitive("int")) {
		int obj = getCreationTime();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *creation_timeKey = "creation_time";
	json_object_set_member(pJsonObject, creation_timeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCustomerListId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *customer_list_idKey = "customer_list_id";
	json_object_set_member(pJsonObject, customer_list_idKey, node);
	if (isprimitive("ErrorDetail")) {
		list<ErrorDetail> new_list = static_cast<list <ErrorDetail> > (getErrorCounts());
		node = converttoJson(&new_list, "ErrorDetail", "array");
	} else {
		node = json_node_alloc();
		list<ErrorDetail> new_list = static_cast<list <ErrorDetail> > (getErrorCounts());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ErrorDetail>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ErrorDetail obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *error_countsKey = "error_counts";
	json_object_set_member(pJsonObject, error_countsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("UserListOperationType")) {
		UserListOperationType obj = getOperation();
		node = converttoJson(&obj, "UserListOperationType", "");
	}
	else {
		
		UserListOperationType obj = static_cast<UserListOperationType> (getOperation());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *operationKey = "operation";
	json_object_set_member(pJsonObject, operationKey, node);
	if (isprimitive("RecordCounts")) {
		RecordCounts obj = getRecordCounts();
		node = converttoJson(&obj, "RecordCounts", "");
	}
	else {
		
		RecordCounts obj = static_cast<RecordCounts> (getRecordCounts());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *record_countsKey = "record_counts";
	json_object_set_member(pJsonObject, record_countsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getState();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *stateKey = "state";
	json_object_set_member(pJsonObject, stateKey, node);
	if (isprimitive("int")) {
		int obj = getUpdatedTime();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *updated_timeKey = "updated_time";
	json_object_set_member(pJsonObject, updated_timeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CustomerListUpload::getAdAccountId()
{
	return ad_account_id;
}

void
CustomerListUpload::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

int
CustomerListUpload::getCreationTime()
{
	return creation_time;
}

void
CustomerListUpload::setCreationTime(int  creation_time)
{
	this->creation_time = creation_time;
}

std::string
CustomerListUpload::getCustomerListId()
{
	return customer_list_id;
}

void
CustomerListUpload::setCustomerListId(std::string  customer_list_id)
{
	this->customer_list_id = customer_list_id;
}

std::list<ErrorDetail>
CustomerListUpload::getErrorCounts()
{
	return error_counts;
}

void
CustomerListUpload::setErrorCounts(std::list <ErrorDetail> error_counts)
{
	this->error_counts = error_counts;
}

std::string
CustomerListUpload::getId()
{
	return id;
}

void
CustomerListUpload::setId(std::string  id)
{
	this->id = id;
}

UserListOperationType
CustomerListUpload::getOperation()
{
	return operation;
}

void
CustomerListUpload::setOperation(UserListOperationType  operation)
{
	this->operation = operation;
}

RecordCounts
CustomerListUpload::getRecordCounts()
{
	return record_counts;
}

void
CustomerListUpload::setRecordCounts(RecordCounts  record_counts)
{
	this->record_counts = record_counts;
}

std::string
CustomerListUpload::getState()
{
	return state;
}

void
CustomerListUpload::setState(std::string  state)
{
	this->state = state;
}

int
CustomerListUpload::getUpdatedTime()
{
	return updated_time;
}

void
CustomerListUpload::setUpdatedTime(int  updated_time)
{
	this->updated_time = updated_time;
}


