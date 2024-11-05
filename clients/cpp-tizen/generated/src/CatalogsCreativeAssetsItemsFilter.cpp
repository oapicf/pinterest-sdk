#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsCreativeAssetsItemsFilter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsCreativeAssetsItemsFilter::CatalogsCreativeAssetsItemsFilter()
{
	//__init();
}

CatalogsCreativeAssetsItemsFilter::~CatalogsCreativeAssetsItemsFilter()
{
	//__cleanup();
}

void
CatalogsCreativeAssetsItemsFilter::__init()
{
	//catalog_type = std::string();
	//new std::list()std::list> creative_assets_ids;
	//catalog_id = std::string();
}

void
CatalogsCreativeAssetsItemsFilter::__cleanup()
{
	//if(catalog_type != NULL) {
	//
	//delete catalog_type;
	//catalog_type = NULL;
	//}
	//if(creative_assets_ids != NULL) {
	//creative_assets_ids.RemoveAll(true);
	//delete creative_assets_ids;
	//creative_assets_ids = NULL;
	//}
	//if(catalog_id != NULL) {
	//
	//delete catalog_id;
	//catalog_id = NULL;
	//}
	//
}

void
CatalogsCreativeAssetsItemsFilter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *catalog_typeKey = "catalog_type";
	node = json_object_get_member(pJsonObject, catalog_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&catalog_type, node, "std::string", "");
		} else {
			
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
	const gchar *catalog_idKey = "catalog_id";
	node = json_object_get_member(pJsonObject, catalog_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&catalog_id, node, "std::string", "");
		} else {
			
		}
	}
}

CatalogsCreativeAssetsItemsFilter::CatalogsCreativeAssetsItemsFilter(char* json)
{
	this->fromJson(json);
}

char*
CatalogsCreativeAssetsItemsFilter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getCatalogType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *catalog_typeKey = "catalog_type";
	json_object_set_member(pJsonObject, catalog_typeKey, node);
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

std::string
CatalogsCreativeAssetsItemsFilter::getCatalogType()
{
	return catalog_type;
}

void
CatalogsCreativeAssetsItemsFilter::setCatalogType(std::string  catalog_type)
{
	this->catalog_type = catalog_type;
}

std::list<std::string>
CatalogsCreativeAssetsItemsFilter::getCreativeAssetsIds()
{
	return creative_assets_ids;
}

void
CatalogsCreativeAssetsItemsFilter::setCreativeAssetsIds(std::list <std::string> creative_assets_ids)
{
	this->creative_assets_ids = creative_assets_ids;
}

std::string
CatalogsCreativeAssetsItemsFilter::getCatalogId()
{
	return catalog_id;
}

void
CatalogsCreativeAssetsItemsFilter::setCatalogId(std::string  catalog_id)
{
	this->catalog_id = catalog_id;
}


