#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsRetailItemsPostFilter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsRetailItemsPostFilter::CatalogsRetailItemsPostFilter()
{
	//__init();
}

CatalogsRetailItemsPostFilter::~CatalogsRetailItemsPostFilter()
{
	//__cleanup();
}

void
CatalogsRetailItemsPostFilter::__init()
{
	//catalog_type = std::string();
	//new std::list()std::list> item_ids;
	//catalog_id = std::string();
}

void
CatalogsRetailItemsPostFilter::__cleanup()
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
	//
}

void
CatalogsRetailItemsPostFilter::fromJson(char* jsonStr)
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
}

CatalogsRetailItemsPostFilter::CatalogsRetailItemsPostFilter(char* json)
{
	this->fromJson(json);
}

char*
CatalogsRetailItemsPostFilter::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CatalogsRetailItemsPostFilter::getCatalogType()
{
	return catalog_type;
}

void
CatalogsRetailItemsPostFilter::setCatalogType(std::string  catalog_type)
{
	this->catalog_type = catalog_type;
}

std::list<std::string>
CatalogsRetailItemsPostFilter::getItemIds()
{
	return item_ids;
}

void
CatalogsRetailItemsPostFilter::setItemIds(std::list <std::string> item_ids)
{
	this->item_ids = item_ids;
}

std::string
CatalogsRetailItemsPostFilter::getCatalogId()
{
	return catalog_id;
}

void
CatalogsRetailItemsPostFilter::setCatalogId(std::string  catalog_id)
{
	this->catalog_id = catalog_id;
}


