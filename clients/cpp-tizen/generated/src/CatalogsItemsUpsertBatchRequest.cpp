#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsItemsUpsertBatchRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsItemsUpsertBatchRequest::CatalogsItemsUpsertBatchRequest()
{
	//__init();
}

CatalogsItemsUpsertBatchRequest::~CatalogsItemsUpsertBatchRequest()
{
	//__cleanup();
}

void
CatalogsItemsUpsertBatchRequest::__init()
{
	//country = new Country();
	//language = new CatalogsItemsRequest_language();
	//operation = new BatchOperation();
	//new std::list()std::list> items;
}

void
CatalogsItemsUpsertBatchRequest::__cleanup()
{
	//if(country != NULL) {
	//
	//delete country;
	//country = NULL;
	//}
	//if(language != NULL) {
	//
	//delete language;
	//language = NULL;
	//}
	//if(operation != NULL) {
	//
	//delete operation;
	//operation = NULL;
	//}
	//if(items != NULL) {
	//items.RemoveAll(true);
	//delete items;
	//items = NULL;
	//}
	//
}

void
CatalogsItemsUpsertBatchRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *countryKey = "country";
	node = json_object_get_member(pJsonObject, countryKey);
	if (node !=NULL) {
	

		if (isprimitive("Country")) {
			jsonToValue(&country, node, "Country", "Country");
		} else {
			
			Country* obj = static_cast<Country*> (&country);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *languageKey = "language";
	node = json_object_get_member(pJsonObject, languageKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsItemsRequest_language")) {
			jsonToValue(&language, node, "CatalogsItemsRequest_language", "CatalogsItemsRequest_language");
		} else {
			
			CatalogsItemsRequest_language* obj = static_cast<CatalogsItemsRequest_language*> (&language);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *operationKey = "operation";
	node = json_object_get_member(pJsonObject, operationKey);
	if (node !=NULL) {
	

		if (isprimitive("BatchOperation")) {
			jsonToValue(&operation, node, "BatchOperation", "BatchOperation");
		} else {
			
			BatchOperation* obj = static_cast<BatchOperation*> (&operation);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *itemsKey = "items";
	node = json_object_get_member(pJsonObject, itemsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ItemUpsertBatchRecord> new_list;
			ItemUpsertBatchRecord inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ItemUpsertBatchRecord")) {
					jsonToValue(&inst, temp_json, "ItemUpsertBatchRecord", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			items = new_list;
		}
		
	}
}

CatalogsItemsUpsertBatchRequest::CatalogsItemsUpsertBatchRequest(char* json)
{
	this->fromJson(json);
}

char*
CatalogsItemsUpsertBatchRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("Country")) {
		Country obj = getCountry();
		node = converttoJson(&obj, "Country", "");
	}
	else {
		
		Country obj = static_cast<Country> (getCountry());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *countryKey = "country";
	json_object_set_member(pJsonObject, countryKey, node);
	if (isprimitive("CatalogsItemsRequest_language")) {
		CatalogsItemsRequest_language obj = getLanguage();
		node = converttoJson(&obj, "CatalogsItemsRequest_language", "");
	}
	else {
		
		CatalogsItemsRequest_language obj = static_cast<CatalogsItemsRequest_language> (getLanguage());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *languageKey = "language";
	json_object_set_member(pJsonObject, languageKey, node);
	if (isprimitive("BatchOperation")) {
		BatchOperation obj = getOperation();
		node = converttoJson(&obj, "BatchOperation", "");
	}
	else {
		
		BatchOperation obj = static_cast<BatchOperation> (getOperation());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *operationKey = "operation";
	json_object_set_member(pJsonObject, operationKey, node);
	if (isprimitive("ItemUpsertBatchRecord")) {
		list<ItemUpsertBatchRecord> new_list = static_cast<list <ItemUpsertBatchRecord> > (getItems());
		node = converttoJson(&new_list, "ItemUpsertBatchRecord", "array");
	} else {
		node = json_node_alloc();
		list<ItemUpsertBatchRecord> new_list = static_cast<list <ItemUpsertBatchRecord> > (getItems());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ItemUpsertBatchRecord>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ItemUpsertBatchRecord obj = *it;
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

Country
CatalogsItemsUpsertBatchRequest::getCountry()
{
	return country;
}

void
CatalogsItemsUpsertBatchRequest::setCountry(Country  country)
{
	this->country = country;
}

CatalogsItemsRequest_language
CatalogsItemsUpsertBatchRequest::getLanguage()
{
	return language;
}

void
CatalogsItemsUpsertBatchRequest::setLanguage(CatalogsItemsRequest_language  language)
{
	this->language = language;
}

BatchOperation
CatalogsItemsUpsertBatchRequest::getOperation()
{
	return operation;
}

void
CatalogsItemsUpsertBatchRequest::setOperation(BatchOperation  operation)
{
	this->operation = operation;
}

std::list<ItemUpsertBatchRecord>
CatalogsItemsUpsertBatchRequest::getItems()
{
	return items;
}

void
CatalogsItemsUpsertBatchRequest::setItems(std::list <ItemUpsertBatchRecord> items)
{
	this->items = items;
}


