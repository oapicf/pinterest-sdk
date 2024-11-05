#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsItemsPostFilters.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsItemsPostFilters::CatalogsItemsPostFilters()
{
	//__init();
}

CatalogsItemsPostFilters::~CatalogsItemsPostFilters()
{
	//__cleanup();
}

void
CatalogsItemsPostFilters::__init()
{
	//catalog_type = new CatalogsType();
	//new std::list()std::list> item_ids;
	//catalog_id = std::string();
	//new std::list()std::list> hotel_ids;
	//new std::list()std::list> creative_assets_ids;
}

void
CatalogsItemsPostFilters::__cleanup()
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
	//if(creative_assets_ids != NULL) {
	//creative_assets_ids.RemoveAll(true);
	//delete creative_assets_ids;
	//creative_assets_ids = NULL;
	//}
	//
}

void
CatalogsItemsPostFilters::fromJson(char* jsonStr)
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
	const gchar *creative_assets_idsKey = "creative_assets_ids";
	node = json_object_get_member(pJsonObject, creative_assets_idsKey);
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
			creative_assets_ids = new_list;
		}
		
	}
}

CatalogsItemsPostFilters::CatalogsItemsPostFilters(char* json)
{
	this->fromJson(json);
}

char*
CatalogsItemsPostFilters::toJson()
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
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getCreativeAssetsIds());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getCreativeAssetsIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *creative_assets_idsKey = "creative_assets_ids";
	json_object_set_member(pJsonObject, creative_assets_idsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsType
CatalogsItemsPostFilters::getCatalogType()
{
	return catalog_type;
}

void
CatalogsItemsPostFilters::setCatalogType(CatalogsType  catalog_type)
{
	this->catalog_type = catalog_type;
}

std::list<std::string>
CatalogsItemsPostFilters::getItemIds()
{
	return item_ids;
}

void
CatalogsItemsPostFilters::setItemIds(std::list <std::string> item_ids)
{
	this->item_ids = item_ids;
}

std::string
CatalogsItemsPostFilters::getCatalogId()
{
	return catalog_id;
}

void
CatalogsItemsPostFilters::setCatalogId(std::string  catalog_id)
{
	this->catalog_id = catalog_id;
}

std::list<std::string>
CatalogsItemsPostFilters::getHotelIds()
{
	return hotel_ids;
}

void
CatalogsItemsPostFilters::setHotelIds(std::list <std::string> hotel_ids)
{
	this->hotel_ids = hotel_ids;
}

std::list<std::string>
CatalogsItemsPostFilters::getCreativeAssetsIds()
{
	return creative_assets_ids;
}

void
CatalogsItemsPostFilters::setCreativeAssetsIds(std::list <std::string> creative_assets_ids)
{
	this->creative_assets_ids = creative_assets_ids;
}


