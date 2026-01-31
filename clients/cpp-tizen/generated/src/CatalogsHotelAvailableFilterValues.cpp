#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsHotelAvailableFilterValues.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsHotelAvailableFilterValues::CatalogsHotelAvailableFilterValues()
{
	//__init();
}

CatalogsHotelAvailableFilterValues::~CatalogsHotelAvailableFilterValues()
{
	//__cleanup();
}

void
CatalogsHotelAvailableFilterValues::__init()
{
	//catalog_type = std::string();
	//filter_values = new Catalogs_hotel_filter_values_map();
}

void
CatalogsHotelAvailableFilterValues::__cleanup()
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
CatalogsHotelAvailableFilterValues::fromJson(char* jsonStr)
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
	

		if (isprimitive("Catalogs_hotel_filter_values_map")) {
			jsonToValue(&filter_values, node, "Catalogs_hotel_filter_values_map", "Catalogs_hotel_filter_values_map");
		} else {
			
			Catalogs_hotel_filter_values_map* obj = static_cast<Catalogs_hotel_filter_values_map*> (&filter_values);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CatalogsHotelAvailableFilterValues::CatalogsHotelAvailableFilterValues(char* json)
{
	this->fromJson(json);
}

char*
CatalogsHotelAvailableFilterValues::toJson()
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
	if (isprimitive("Catalogs_hotel_filter_values_map")) {
		Catalogs_hotel_filter_values_map obj = getFilterValues();
		node = converttoJson(&obj, "Catalogs_hotel_filter_values_map", "");
	}
	else {
		
		Catalogs_hotel_filter_values_map obj = static_cast<Catalogs_hotel_filter_values_map> (getFilterValues());
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
CatalogsHotelAvailableFilterValues::getCatalogType()
{
	return catalog_type;
}

void
CatalogsHotelAvailableFilterValues::setCatalogType(std::string  catalog_type)
{
	this->catalog_type = catalog_type;
}

Catalogs_hotel_filter_values_map
CatalogsHotelAvailableFilterValues::getFilterValues()
{
	return filter_values;
}

void
CatalogsHotelAvailableFilterValues::setFilterValues(Catalogs_hotel_filter_values_map  filter_values)
{
	this->filter_values = filter_values;
}


