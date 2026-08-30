#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsRetailBatchRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsRetailBatchRequest::CatalogsRetailBatchRequest()
{
	//__init();
}

CatalogsRetailBatchRequest::~CatalogsRetailBatchRequest()
{
	//__cleanup();
}

void
CatalogsRetailBatchRequest::__init()
{
	//catalog_id = null;
	//catalog_type = std::string();
	//country = new Country();
	//new std::list()std::list> items;
	//language = std::string();
}

void
CatalogsRetailBatchRequest::__cleanup()
{
	//if(catalog_id != NULL) {
	//
	//delete catalog_id;
	//catalog_id = NULL;
	//}
	//if(catalog_type != NULL) {
	//
	//delete catalog_type;
	//catalog_type = NULL;
	//}
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
	//
}

void
CatalogsRetailBatchRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *catalog_idKey = "catalog_id";
	node = json_object_get_member(pJsonObject, catalog_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&catalog_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *catalog_typeKey = "catalog_type";
	node = json_object_get_member(pJsonObject, catalog_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&catalog_type, node, "std::string", "");
		} else {
			
		}
	}
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
			list<CatalogsRetailBatchRequestItemsItems> new_list;
			CatalogsRetailBatchRequestItemsItems inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CatalogsRetailBatchRequestItemsItems")) {
					jsonToValue(&inst, temp_json, "CatalogsRetailBatchRequestItemsItems", "");
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
}

CatalogsRetailBatchRequest::CatalogsRetailBatchRequest(char* json)
{
	this->fromJson(json);
}

char*
CatalogsRetailBatchRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getCatalogId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *catalog_idKey = "catalog_id";
	json_object_set_member(pJsonObject, catalog_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCatalogType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *catalog_typeKey = "catalog_type";
	json_object_set_member(pJsonObject, catalog_typeKey, node);
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
	if (isprimitive("CatalogsRetailBatchRequestItemsItems")) {
		list<CatalogsRetailBatchRequestItemsItems> new_list = static_cast<list <CatalogsRetailBatchRequestItemsItems> > (getItems());
		node = converttoJson(&new_list, "CatalogsRetailBatchRequestItemsItems", "array");
	} else {
		node = json_node_alloc();
		list<CatalogsRetailBatchRequestItemsItems> new_list = static_cast<list <CatalogsRetailBatchRequestItemsItems> > (getItems());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CatalogsRetailBatchRequestItemsItems>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CatalogsRetailBatchRequestItemsItems obj = *it;
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CatalogsRetailBatchRequest::getCatalogId()
{
	return catalog_id;
}

void
CatalogsRetailBatchRequest::setCatalogId(std::string  catalog_id)
{
	this->catalog_id = catalog_id;
}

std::string
CatalogsRetailBatchRequest::getCatalogType()
{
	return catalog_type;
}

void
CatalogsRetailBatchRequest::setCatalogType(std::string  catalog_type)
{
	this->catalog_type = catalog_type;
}

Country
CatalogsRetailBatchRequest::getCountry()
{
	return country;
}

void
CatalogsRetailBatchRequest::setCountry(Country  country)
{
	this->country = country;
}

std::list<CatalogsRetailBatchRequestItemsItems>
CatalogsRetailBatchRequest::getItems()
{
	return items;
}

void
CatalogsRetailBatchRequest::setItems(std::list <CatalogsRetailBatchRequestItemsItems> items)
{
	this->items = items;
}

std::string
CatalogsRetailBatchRequest::getLanguage()
{
	return language;
}

void
CatalogsRetailBatchRequest::setLanguage(std::string  language)
{
	this->language = language;
}


