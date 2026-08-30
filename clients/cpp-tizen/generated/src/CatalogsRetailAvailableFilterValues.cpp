#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsRetailAvailableFilterValues.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsRetailAvailableFilterValues::CatalogsRetailAvailableFilterValues()
{
	//__init();
}

CatalogsRetailAvailableFilterValues::~CatalogsRetailAvailableFilterValues()
{
	//__cleanup();
}

void
CatalogsRetailAvailableFilterValues::__init()
{
	//catalog_type = std::string();
	//filter_values = new CatalogsRetailFilterValuesMap();
}

void
CatalogsRetailAvailableFilterValues::__cleanup()
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
CatalogsRetailAvailableFilterValues::fromJson(char* jsonStr)
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
	

		if (isprimitive("CatalogsRetailFilterValuesMap")) {
			jsonToValue(&filter_values, node, "CatalogsRetailFilterValuesMap", "CatalogsRetailFilterValuesMap");
		} else {
			
			CatalogsRetailFilterValuesMap* obj = static_cast<CatalogsRetailFilterValuesMap*> (&filter_values);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CatalogsRetailAvailableFilterValues::CatalogsRetailAvailableFilterValues(char* json)
{
	this->fromJson(json);
}

char*
CatalogsRetailAvailableFilterValues::toJson()
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
	if (isprimitive("CatalogsRetailFilterValuesMap")) {
		CatalogsRetailFilterValuesMap obj = getFilterValues();
		node = converttoJson(&obj, "CatalogsRetailFilterValuesMap", "");
	}
	else {
		
		CatalogsRetailFilterValuesMap obj = static_cast<CatalogsRetailFilterValuesMap> (getFilterValues());
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
CatalogsRetailAvailableFilterValues::getCatalogType()
{
	return catalog_type;
}

void
CatalogsRetailAvailableFilterValues::setCatalogType(std::string  catalog_type)
{
	this->catalog_type = catalog_type;
}

CatalogsRetailFilterValuesMap
CatalogsRetailAvailableFilterValues::getFilterValues()
{
	return filter_values;
}

void
CatalogsRetailAvailableFilterValues::setFilterValues(CatalogsRetailFilterValuesMap  filter_values)
{
	this->filter_values = filter_values;
}


