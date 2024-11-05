#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreativeAssetsProcessingRecord.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreativeAssetsProcessingRecord::CreativeAssetsProcessingRecord()
{
	//__init();
}

CreativeAssetsProcessingRecord::~CreativeAssetsProcessingRecord()
{
	//__cleanup();
}

void
CreativeAssetsProcessingRecord::__init()
{
	//creative_assets_id = std::string();
	//new std::list()std::list> errors;
	//new std::list()std::list> warnings;
	//status = new ItemProcessingStatus();
}

void
CreativeAssetsProcessingRecord::__cleanup()
{
	//if(creative_assets_id != NULL) {
	//
	//delete creative_assets_id;
	//creative_assets_id = NULL;
	//}
	//if(errors != NULL) {
	//errors.RemoveAll(true);
	//delete errors;
	//errors = NULL;
	//}
	//if(warnings != NULL) {
	//warnings.RemoveAll(true);
	//delete warnings;
	//warnings = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//
}

void
CreativeAssetsProcessingRecord::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *creative_assets_idKey = "creative_assets_id";
	node = json_object_get_member(pJsonObject, creative_assets_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&creative_assets_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *errorsKey = "errors";
	node = json_object_get_member(pJsonObject, errorsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ItemValidationEvent> new_list;
			ItemValidationEvent inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ItemValidationEvent")) {
					jsonToValue(&inst, temp_json, "ItemValidationEvent", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			errors = new_list;
		}
		
	}
	const gchar *warningsKey = "warnings";
	node = json_object_get_member(pJsonObject, warningsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ItemValidationEvent> new_list;
			ItemValidationEvent inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ItemValidationEvent")) {
					jsonToValue(&inst, temp_json, "ItemValidationEvent", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			warnings = new_list;
		}
		
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("ItemProcessingStatus")) {
			jsonToValue(&status, node, "ItemProcessingStatus", "ItemProcessingStatus");
		} else {
			
			ItemProcessingStatus* obj = static_cast<ItemProcessingStatus*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CreativeAssetsProcessingRecord::CreativeAssetsProcessingRecord(char* json)
{
	this->fromJson(json);
}

char*
CreativeAssetsProcessingRecord::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getCreativeAssetsId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *creative_assets_idKey = "creative_assets_id";
	json_object_set_member(pJsonObject, creative_assets_idKey, node);
	if (isprimitive("ItemValidationEvent")) {
		list<ItemValidationEvent> new_list = static_cast<list <ItemValidationEvent> > (getErrors());
		node = converttoJson(&new_list, "ItemValidationEvent", "array");
	} else {
		node = json_node_alloc();
		list<ItemValidationEvent> new_list = static_cast<list <ItemValidationEvent> > (getErrors());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ItemValidationEvent>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ItemValidationEvent obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *errorsKey = "errors";
	json_object_set_member(pJsonObject, errorsKey, node);
	if (isprimitive("ItemValidationEvent")) {
		list<ItemValidationEvent> new_list = static_cast<list <ItemValidationEvent> > (getWarnings());
		node = converttoJson(&new_list, "ItemValidationEvent", "array");
	} else {
		node = json_node_alloc();
		list<ItemValidationEvent> new_list = static_cast<list <ItemValidationEvent> > (getWarnings());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ItemValidationEvent>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ItemValidationEvent obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *warningsKey = "warnings";
	json_object_set_member(pJsonObject, warningsKey, node);
	if (isprimitive("ItemProcessingStatus")) {
		ItemProcessingStatus obj = getStatus();
		node = converttoJson(&obj, "ItemProcessingStatus", "");
	}
	else {
		
		ItemProcessingStatus obj = static_cast<ItemProcessingStatus> (getStatus());
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
CreativeAssetsProcessingRecord::getCreativeAssetsId()
{
	return creative_assets_id;
}

void
CreativeAssetsProcessingRecord::setCreativeAssetsId(std::string  creative_assets_id)
{
	this->creative_assets_id = creative_assets_id;
}

std::list<ItemValidationEvent>
CreativeAssetsProcessingRecord::getErrors()
{
	return errors;
}

void
CreativeAssetsProcessingRecord::setErrors(std::list <ItemValidationEvent> errors)
{
	this->errors = errors;
}

std::list<ItemValidationEvent>
CreativeAssetsProcessingRecord::getWarnings()
{
	return warnings;
}

void
CreativeAssetsProcessingRecord::setWarnings(std::list <ItemValidationEvent> warnings)
{
	this->warnings = warnings;
}

ItemProcessingStatus
CreativeAssetsProcessingRecord::getStatus()
{
	return status;
}

void
CreativeAssetsProcessingRecord::setStatus(ItemProcessingStatus  status)
{
	this->status = status;
}


