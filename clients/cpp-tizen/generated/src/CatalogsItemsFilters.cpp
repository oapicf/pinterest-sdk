#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsItemsFilters.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsItemsFilters::CatalogsItemsFilters()
{
	//__init();
}

CatalogsItemsFilters::~CatalogsItemsFilters()
{
	//__cleanup();
}

void
CatalogsItemsFilters::__init()
{
	//catalog_type = new CatalogsType();
	//new std::list()std::list> item_ids;
	//catalog_id = std::string();
	//new std::list()std::list> hotel_ids;
}

void
CatalogsItemsFilters::__cleanup()
{
	//if(catalog_type != NULL) {
	//
	//delete catalog_type;
	//catalog_type = NULL;
	//}
	//if(item_ids != NULL) {
	//item_ids.RemoveAll(true);
	//delete item_ids;
	//item_ids = NULL;
	//}
	//if(catalog_id != NULL) {
	//
	//delete catalog_id;
	//catalog_id = NULL;
	//}
	//if(hotel_ids != NULL) {
	//hotel_ids.RemoveAll(true);
	//delete hotel_ids;
	//hotel_ids = NULL;
	//}
	//
}

void
CatalogsItemsFilters::fromJson(char* jsonStr)
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
	const gchar *item_idsKey = "item_ids";
	node = json_object_get_member(pJsonObject, item_idsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			item_ids = new_list;
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
	const gchar *hotel_idsKey = "hotel_ids";
	node = json_object_get_member(pJsonObject, hotel_idsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			hotel_ids = new_list;
		}
		
	}
}

CatalogsItemsFilters::CatalogsItemsFilters(char* json)
{
	this->fromJson(json);
}

char*
CatalogsItemsFilters::toJson()
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
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getItemIds());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getItemIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *item_idsKey = "item_ids";
	json_object_set_member(pJsonObject, item_idsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCatalogId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *catalog_idKey = "catalog_id";
	json_object_set_member(pJsonObject, catalog_idKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getHotelIds());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getHotelIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *hotel_idsKey = "hotel_ids";
	json_object_set_member(pJsonObject, hotel_idsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsType
CatalogsItemsFilters::getCatalogType()
{
	return catalog_type;
}

void
CatalogsItemsFilters::setCatalogType(CatalogsType  catalog_type)
{
	this->catalog_type = catalog_type;
}

std::list<std::string>
CatalogsItemsFilters::getItemIds()
{
	return item_ids;
}

void
CatalogsItemsFilters::setItemIds(std::list <std::string> item_ids)
{
	this->item_ids = item_ids;
}

std::string
CatalogsItemsFilters::getCatalogId()
{
	return catalog_id;
}

void
CatalogsItemsFilters::setCatalogId(std::string  catalog_id)
{
	this->catalog_id = catalog_id;
}

std::list<std::string>
CatalogsItemsFilters::getHotelIds()
{
	return hotel_ids;
}

void
CatalogsItemsFilters::setHotelIds(std::list <std::string> hotel_ids)
{
	this->hotel_ids = hotel_ids;
}


