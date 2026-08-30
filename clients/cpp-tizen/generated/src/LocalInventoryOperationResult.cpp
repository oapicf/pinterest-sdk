#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LocalInventoryOperationResult.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LocalInventoryOperationResult::LocalInventoryOperationResult()
{
	//__init();
}

LocalInventoryOperationResult::~LocalInventoryOperationResult()
{
	//__cleanup();
}

void
LocalInventoryOperationResult::__init()
{
	//new std::list()std::list> errors;
	//item_id = std::string();
	//status = null;
	//store_code = std::string();
	//supplemental_type = std::string();
	//new std::list()std::list> warnings;
}

void
LocalInventoryOperationResult::__cleanup()
{
	//if(errors != NULL) {
	//errors.RemoveAll(true);
	//delete errors;
	//errors = NULL;
	//}
	//if(item_id != NULL) {
	//
	//delete item_id;
	//item_id = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(store_code != NULL) {
	//
	//delete store_code;
	//store_code = NULL;
	//}
	//if(supplemental_type != NULL) {
	//
	//delete supplemental_type;
	//supplemental_type = NULL;
	//}
	//if(warnings != NULL) {
	//warnings.RemoveAll(true);
	//delete warnings;
	//warnings = NULL;
	//}
	//
}

void
LocalInventoryOperationResult::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *errorsKey = "errors";
	node = json_object_get_member(pJsonObject, errorsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<SupplementalItemValidationEvent> new_list;
			SupplementalItemValidationEvent inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("SupplementalItemValidationEvent")) {
					jsonToValue(&inst, temp_json, "SupplementalItemValidationEvent", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			errors = new_list;
		}
		
	}
	const gchar *item_idKey = "item_id";
	node = json_object_get_member(pJsonObject, item_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&item_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("SupplementalItemProcessingStatus")) {
			jsonToValue(&status, node, "SupplementalItemProcessingStatus", "SupplementalItemProcessingStatus");
		} else {
			
			SupplementalItemProcessingStatus* obj = static_cast<SupplementalItemProcessingStatus*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *store_codeKey = "store_code";
	node = json_object_get_member(pJsonObject, store_codeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&store_code, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *supplemental_typeKey = "supplemental_type";
	node = json_object_get_member(pJsonObject, supplemental_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&supplemental_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *warningsKey = "warnings";
	node = json_object_get_member(pJsonObject, warningsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<SupplementalItemValidationEvent> new_list;
			SupplementalItemValidationEvent inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("SupplementalItemValidationEvent")) {
					jsonToValue(&inst, temp_json, "SupplementalItemValidationEvent", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			warnings = new_list;
		}
		
	}
}

LocalInventoryOperationResult::LocalInventoryOperationResult(char* json)
{
	this->fromJson(json);
}

char*
LocalInventoryOperationResult::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("SupplementalItemValidationEvent")) {
		list<SupplementalItemValidationEvent> new_list = static_cast<list <SupplementalItemValidationEvent> > (getErrors());
		node = converttoJson(&new_list, "SupplementalItemValidationEvent", "array");
	} else {
		node = json_node_alloc();
		list<SupplementalItemValidationEvent> new_list = static_cast<list <SupplementalItemValidationEvent> > (getErrors());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<SupplementalItemValidationEvent>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			SupplementalItemValidationEvent obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *errorsKey = "errors";
	json_object_set_member(pJsonObject, errorsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getItemId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *item_idKey = "item_id";
	json_object_set_member(pJsonObject, item_idKey, node);
	if (isprimitive("SupplementalItemProcessingStatus")) {
		SupplementalItemProcessingStatus obj = getStatus();
		node = converttoJson(&obj, "SupplementalItemProcessingStatus", "");
	}
	else {
		
		SupplementalItemProcessingStatus obj = static_cast<SupplementalItemProcessingStatus> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStoreCode();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *store_codeKey = "store_code";
	json_object_set_member(pJsonObject, store_codeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSupplementalType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *supplemental_typeKey = "supplemental_type";
	json_object_set_member(pJsonObject, supplemental_typeKey, node);
	if (isprimitive("SupplementalItemValidationEvent")) {
		list<SupplementalItemValidationEvent> new_list = static_cast<list <SupplementalItemValidationEvent> > (getWarnings());
		node = converttoJson(&new_list, "SupplementalItemValidationEvent", "array");
	} else {
		node = json_node_alloc();
		list<SupplementalItemValidationEvent> new_list = static_cast<list <SupplementalItemValidationEvent> > (getWarnings());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<SupplementalItemValidationEvent>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			SupplementalItemValidationEvent obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *warningsKey = "warnings";
	json_object_set_member(pJsonObject, warningsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<SupplementalItemValidationEvent>
LocalInventoryOperationResult::getErrors()
{
	return errors;
}

void
LocalInventoryOperationResult::setErrors(std::list <SupplementalItemValidationEvent> errors)
{
	this->errors = errors;
}

std::string
LocalInventoryOperationResult::getItemId()
{
	return item_id;
}

void
LocalInventoryOperationResult::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}

SupplementalItemProcessingStatus
LocalInventoryOperationResult::getStatus()
{
	return status;
}

void
LocalInventoryOperationResult::setStatus(SupplementalItemProcessingStatus  status)
{
	this->status = status;
}

std::string
LocalInventoryOperationResult::getStoreCode()
{
	return store_code;
}

void
LocalInventoryOperationResult::setStoreCode(std::string  store_code)
{
	this->store_code = store_code;
}

std::string
LocalInventoryOperationResult::getSupplementalType()
{
	return supplemental_type;
}

void
LocalInventoryOperationResult::setSupplementalType(std::string  supplemental_type)
{
	this->supplemental_type = supplemental_type;
}

std::list<SupplementalItemValidationEvent>
LocalInventoryOperationResult::getWarnings()
{
	return warnings;
}

void
LocalInventoryOperationResult::setWarnings(std::list <SupplementalItemValidationEvent> warnings)
{
	this->warnings = warnings;
}


