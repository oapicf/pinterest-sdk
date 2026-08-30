#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsItemsBatchRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsItemsBatchRequest::CatalogsItemsBatchRequest()
{
	//__init();
}

CatalogsItemsBatchRequest::~CatalogsItemsBatchRequest()
{
	//__cleanup();
}

void
CatalogsItemsBatchRequest::__init()
{
	//country = new Country();
	//new std::list()std::list> items;
	//language = std::string();
	//operation = std::string();
}

void
CatalogsItemsBatchRequest::__cleanup()
{
	//if(country != NULL) {
	//
	//delete country;
	//country = NULL;
	//}
	//if(items != NULL) {
	//items.RemoveAll(true);
	//delete items;
	//items = NULL;
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
	//
}

void
CatalogsItemsBatchRequest::fromJson(char* jsonStr)
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
	const gchar *itemsKey = "items";
	node = json_object_get_member(pJsonObject, itemsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ItemDeleteBatchRecord> new_list;
			ItemDeleteBatchRecord inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ItemDeleteBatchRecord")) {
					jsonToValue(&inst, temp_json, "ItemDeleteBatchRecord", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			items = new_list;
		}
		
	}
	const gchar *languageKey = "language";
	node = json_object_get_member(pJsonObject, languageKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&language, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *operationKey = "operation";
	node = json_object_get_member(pJsonObject, operationKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&operation, node, "std::string", "");
		} else {
			
		}
	}
}

CatalogsItemsBatchRequest::CatalogsItemsBatchRequest(char* json)
{
	this->fromJson(json);
}

char*
CatalogsItemsBatchRequest::toJson()
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
	if (isprimitive("ItemDeleteBatchRecord")) {
		list<ItemDeleteBatchRecord> new_list = static_cast<list <ItemDeleteBatchRecord> > (getItems());
		node = converttoJson(&new_list, "ItemDeleteBatchRecord", "array");
	} else {
		node = json_node_alloc();
		list<ItemDeleteBatchRecord> new_list = static_cast<list <ItemDeleteBatchRecord> > (getItems());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ItemDeleteBatchRecord>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ItemDeleteBatchRecord obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *itemsKey = "items";
	json_object_set_member(pJsonObject, itemsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLanguage();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *languageKey = "language";
	json_object_set_member(pJsonObject, languageKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOperation();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *operationKey = "operation";
	json_object_set_member(pJsonObject, operationKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

Country
CatalogsItemsBatchRequest::getCountry()
{
	return country;
}

void
CatalogsItemsBatchRequest::setCountry(Country  country)
{
	this->country = country;
}

std::list<ItemDeleteBatchRecord>
CatalogsItemsBatchRequest::getItems()
{
	return items;
}

void
CatalogsItemsBatchRequest::setItems(std::list <ItemDeleteBatchRecord> items)
{
	this->items = items;
}

std::string
CatalogsItemsBatchRequest::getLanguage()
{
	return language;
}

void
CatalogsItemsBatchRequest::setLanguage(std::string  language)
{
	this->language = language;
}

std::string
CatalogsItemsBatchRequest::getOperation()
{
	return operation;
}

void
CatalogsItemsBatchRequest::setOperation(std::string  operation)
{
	this->operation = operation;
}


