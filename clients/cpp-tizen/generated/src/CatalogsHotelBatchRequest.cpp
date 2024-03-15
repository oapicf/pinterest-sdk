#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsHotelBatchRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsHotelBatchRequest::CatalogsHotelBatchRequest()
{
	//__init();
}

CatalogsHotelBatchRequest::~CatalogsHotelBatchRequest()
{
	//__cleanup();
}

void
CatalogsHotelBatchRequest::__init()
{
	//catalog_type = new CatalogsType();
	//country = new Country();
	//language = new Language();
	//new std::list()std::list> items;
	//catalog_id = std::string();
}

void
CatalogsHotelBatchRequest::__cleanup()
{
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
	//if(language != NULL) {
	//
	//delete language;
	//language = NULL;
	//}
	//if(items != NULL) {
	//items.RemoveAll(true);
	//delete items;
	//items = NULL;
	//}
	//if(catalog_id != NULL) {
	//
	//delete catalog_id;
	//catalog_id = NULL;
	//}
	//
}

void
CatalogsHotelBatchRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	

		if (isprimitive("Language")) {
			jsonToValue(&language, node, "Language", "Language");
		} else {
			
			Language* obj = static_cast<Language*> (&language);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *itemsKey = "items";
	node = json_object_get_member(pJsonObject, itemsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<CatalogsHotelBatchItem> new_list;
			CatalogsHotelBatchItem inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CatalogsHotelBatchItem")) {
					jsonToValue(&inst, temp_json, "CatalogsHotelBatchItem", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			items = new_list;
		}
		
	}
	const gchar *catalog_idKey = "catalog_id";
	node = json_object_get_member(pJsonObject, catalog_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&catalog_id, node, "std::string", "");
		} else {
			
		}
	}
}

CatalogsHotelBatchRequest::CatalogsHotelBatchRequest(char* json)
{
	this->fromJson(json);
}

char*
CatalogsHotelBatchRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
	if (isprimitive("Language")) {
		Language obj = getLanguage();
		node = converttoJson(&obj, "Language", "");
	}
	else {
		
		Language obj = static_cast<Language> (getLanguage());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *languageKey = "language";
	json_object_set_member(pJsonObject, languageKey, node);
	if (isprimitive("CatalogsHotelBatchItem")) {
		list<CatalogsHotelBatchItem> new_list = static_cast<list <CatalogsHotelBatchItem> > (getItems());
		node = converttoJson(&new_list, "CatalogsHotelBatchItem", "array");
	} else {
		node = json_node_alloc();
		list<CatalogsHotelBatchItem> new_list = static_cast<list <CatalogsHotelBatchItem> > (getItems());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CatalogsHotelBatchItem>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CatalogsHotelBatchItem obj = *it;
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
		std::string obj = getCatalogId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *catalog_idKey = "catalog_id";
	json_object_set_member(pJsonObject, catalog_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsType
CatalogsHotelBatchRequest::getCatalogType()
{
	return catalog_type;
}

void
CatalogsHotelBatchRequest::setCatalogType(CatalogsType  catalog_type)
{
	this->catalog_type = catalog_type;
}

Country
CatalogsHotelBatchRequest::getCountry()
{
	return country;
}

void
CatalogsHotelBatchRequest::setCountry(Country  country)
{
	this->country = country;
}

Language
CatalogsHotelBatchRequest::getLanguage()
{
	return language;
}

void
CatalogsHotelBatchRequest::setLanguage(Language  language)
{
	this->language = language;
}

std::list<CatalogsHotelBatchItem>
CatalogsHotelBatchRequest::getItems()
{
	return items;
}

void
CatalogsHotelBatchRequest::setItems(std::list <CatalogsHotelBatchItem> items)
{
	this->items = items;
}

std::string
CatalogsHotelBatchRequest::getCatalogId()
{
	return catalog_id;
}

void
CatalogsHotelBatchRequest::setCatalogId(std::string  catalog_id)
{
	this->catalog_id = catalog_id;
}


