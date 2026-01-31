#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsAvailableFilterValues.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsAvailableFilterValues::CatalogsAvailableFilterValues()
{
	//__init();
}

CatalogsAvailableFilterValues::~CatalogsAvailableFilterValues()
{
	//__cleanup();
}

void
CatalogsAvailableFilterValues::__init()
{
	//catalog_type = std::string();
	//filter_values = new Catalogs_creative_assets_filter_values_map();
}

void
CatalogsAvailableFilterValues::__cleanup()
{
	//if(catalog_type != NULL) {
	//
	//delete catalog_type;
	//catalog_type = NULL;
	//}
	//if(filter_values != NULL) {
	//
	//delete filter_values;
	//filter_values = NULL;
	//}
	//
}

void
CatalogsAvailableFilterValues::fromJson(char* jsonStr)
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
	const gchar *filter_valuesKey = "filter_values";
	node = json_object_get_member(pJsonObject, filter_valuesKey);
	if (node !=NULL) {
	

		if (isprimitive("Catalogs_creative_assets_filter_values_map")) {
			jsonToValue(&filter_values, node, "Catalogs_creative_assets_filter_values_map", "Catalogs_creative_assets_filter_values_map");
		} else {
			
			Catalogs_creative_assets_filter_values_map* obj = static_cast<Catalogs_creative_assets_filter_values_map*> (&filter_values);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CatalogsAvailableFilterValues::CatalogsAvailableFilterValues(char* json)
{
	this->fromJson(json);
}

char*
CatalogsAvailableFilterValues::toJson()
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
	if (isprimitive("Catalogs_creative_assets_filter_values_map")) {
		Catalogs_creative_assets_filter_values_map obj = getFilterValues();
		node = converttoJson(&obj, "Catalogs_creative_assets_filter_values_map", "");
	}
	else {
		
		Catalogs_creative_assets_filter_values_map obj = static_cast<Catalogs_creative_assets_filter_values_map> (getFilterValues());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *filter_valuesKey = "filter_values";
	json_object_set_member(pJsonObject, filter_valuesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CatalogsAvailableFilterValues::getCatalogType()
{
	return catalog_type;
}

void
CatalogsAvailableFilterValues::setCatalogType(std::string  catalog_type)
{
	this->catalog_type = catalog_type;
}

Catalogs_creative_assets_filter_values_map
CatalogsAvailableFilterValues::getFilterValues()
{
	return filter_values;
}

void
CatalogsAvailableFilterValues::setFilterValues(Catalogs_creative_assets_filter_values_map  filter_values)
{
	this->filter_values = filter_values;
}


