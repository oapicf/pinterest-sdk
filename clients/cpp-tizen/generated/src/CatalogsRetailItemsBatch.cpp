#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsRetailItemsBatch.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsRetailItemsBatch::CatalogsRetailItemsBatch()
{
	//__init();
}

CatalogsRetailItemsBatch::~CatalogsRetailItemsBatch()
{
	//__cleanup();
}

void
CatalogsRetailItemsBatch::__init()
{
	//batch_id = std::string();
	//created_time = null;
	//completed_time = null;
	//status = new BatchOperationStatus();
	//catalog_type = new CatalogsType();
	//new std::list()std::list> items;
}

void
CatalogsRetailItemsBatch::__cleanup()
{
	//if(batch_id != NULL) {
	//
	//delete batch_id;
	//batch_id = NULL;
	//}
	//if(created_time != NULL) {
	//
	//delete created_time;
	//created_time = NULL;
	//}
	//if(completed_time != NULL) {
	//
	//delete completed_time;
	//completed_time = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(catalog_type != NULL) {
	//
	//delete catalog_type;
	//catalog_type = NULL;
	//}
	//if(items != NULL) {
	//items.RemoveAll(true);
	//delete items;
	//items = NULL;
	//}
	//
}

void
CatalogsRetailItemsBatch::fromJson(char* jsonStr)
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
	const gchar *created_timeKey = "created_time";
	node = json_object_get_member(pJsonObject, created_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&created_time, node, "std::string", "");
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
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("BatchOperationStatus")) {
			jsonToValue(&status, node, "BatchOperationStatus", "BatchOperationStatus");
		} else {
			
			BatchOperationStatus* obj = static_cast<BatchOperationStatus*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *catalog_typeKey = "catalog_type";
	node = json_object_get_member(pJsonObject, catalog_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsType")) {
			jsonToValue(&catalog_type, node, "CatalogsType", "CatalogsType");
		} else {
			
			CatalogsType* obj = static_cast<CatalogsType*> (&catalog_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *itemsKey = "items";
	node = json_object_get_member(pJsonObject, itemsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ItemProcessingRecord> new_list;
			ItemProcessingRecord inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ItemProcessingRecord")) {
					jsonToValue(&inst, temp_json, "ItemProcessingRecord", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			items = new_list;
		}
		
	}
}

CatalogsRetailItemsBatch::CatalogsRetailItemsBatch(char* json)
{
	this->fromJson(json);
}

char*
CatalogsRetailItemsBatch::toJson()
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
		std::string obj = getCreatedTime();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *created_timeKey = "created_time";
	json_object_set_member(pJsonObject, created_timeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCompletedTime();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *completed_timeKey = "completed_time";
	json_object_set_member(pJsonObject, completed_timeKey, node);
	if (isprimitive("BatchOperationStatus")) {
		BatchOperationStatus obj = getStatus();
		node = converttoJson(&obj, "BatchOperationStatus", "");
	}
	else {
		
		BatchOperationStatus obj = static_cast<BatchOperationStatus> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("CatalogsType")) {
		CatalogsType obj = getCatalogType();
		node = converttoJson(&obj, "CatalogsType", "");
	}
	else {
		
		CatalogsType obj = static_cast<CatalogsType> (getCatalogType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *catalog_typeKey = "catalog_type";
	json_object_set_member(pJsonObject, catalog_typeKey, node);
	if (isprimitive("ItemProcessingRecord")) {
		list<ItemProcessingRecord> new_list = static_cast<list <ItemProcessingRecord> > (getItems());
		node = converttoJson(&new_list, "ItemProcessingRecord", "array");
	} else {
		node = json_node_alloc();
		list<ItemProcessingRecord> new_list = static_cast<list <ItemProcessingRecord> > (getItems());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ItemProcessingRecord>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ItemProcessingRecord obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *itemsKey = "items";
	json_object_set_member(pJsonObject, itemsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CatalogsRetailItemsBatch::getBatchId()
{
	return batch_id;
}

void
CatalogsRetailItemsBatch::setBatchId(std::string  batch_id)
{
	this->batch_id = batch_id;
}

std::string
CatalogsRetailItemsBatch::getCreatedTime()
{
	return created_time;
}

void
CatalogsRetailItemsBatch::setCreatedTime(std::string  created_time)
{
	this->created_time = created_time;
}

std::string
CatalogsRetailItemsBatch::getCompletedTime()
{
	return completed_time;
}

void
CatalogsRetailItemsBatch::setCompletedTime(std::string  completed_time)
{
	this->completed_time = completed_time;
}

BatchOperationStatus
CatalogsRetailItemsBatch::getStatus()
{
	return status;
}

void
CatalogsRetailItemsBatch::setStatus(BatchOperationStatus  status)
{
	this->status = status;
}

CatalogsType
CatalogsRetailItemsBatch::getCatalogType()
{
	return catalog_type;
}

void
CatalogsRetailItemsBatch::setCatalogType(CatalogsType  catalog_type)
{
	this->catalog_type = catalog_type;
}

std::list<ItemProcessingRecord>
CatalogsRetailItemsBatch::getItems()
{
	return items;
}

void
CatalogsRetailItemsBatch::setItems(std::list <ItemProcessingRecord> items)
{
	this->items = items;
}


