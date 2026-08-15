

#include "CatalogsRetailAvailableFilterValues.h"

using namespace Tiny;

CatalogsRetailAvailableFilterValues::CatalogsRetailAvailableFilterValues()
{
	catalog_type = std::string();
	filter_values = Catalogs_retail_filter_values_map();
}

CatalogsRetailAvailableFilterValues::CatalogsRetailAvailableFilterValues(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsRetailAvailableFilterValues::~CatalogsRetailAvailableFilterValues()
{

}

void
CatalogsRetailAvailableFilterValues::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *catalog_typeKey = "catalog_type";

    if(object.has_key(catalog_typeKey))
    {
        bourne::json value = object[catalog_typeKey];



        jsonToValue(&catalog_type, value, "std::string");


    }

    const char *filter_valuesKey = "filter_values";

    if(object.has_key(filter_valuesKey))
    {
        bourne::json value = object[filter_valuesKey];




        Catalogs_retail_filter_values_map* obj = &filter_values;
		obj->fromJson(value.dump());

    }


}

bourne::json
CatalogsRetailAvailableFilterValues::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_type"] = getCatalogType();







	object["filter_values"] = getFilterValues().toJson();


    return object;

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

Catalogs_retail_filter_values_map
CatalogsRetailAvailableFilterValues::getFilterValues()
{
	return filter_values;
}

void
CatalogsRetailAvailableFilterValues::setFilterValues(Catalogs_retail_filter_values_map  filter_values)
{
	this->filter_values = filter_values;
}



