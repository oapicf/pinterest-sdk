

#include "CatalogsAvailableFilterValues.h"

using namespace Tiny;

CatalogsAvailableFilterValues::CatalogsAvailableFilterValues()
{
	catalog_type = std::string();
	filter_values = CatalogsCreativeAssetsFilterValuesMap();
}

CatalogsAvailableFilterValues::CatalogsAvailableFilterValues(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsAvailableFilterValues::~CatalogsAvailableFilterValues()
{

}

void
CatalogsAvailableFilterValues::fromJson(std::string jsonObj)
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




        CatalogsCreativeAssetsFilterValuesMap* obj = &filter_values;
		obj->fromJson(value.dump());

    }


}

bourne::json
CatalogsAvailableFilterValues::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_type"] = getCatalogType();







	object["filter_values"] = getFilterValues().toJson();


    return object;

}

std::string
CatalogsAvailableFilterValues::getCatalogType()
{
	return catalog_type;
}

void
CatalogsAvailableFilterValues::setCatalogType(std::string catalog_type)
{
	this->catalog_type = catalog_type;
}

CatalogsCreativeAssetsFilterValuesMap
CatalogsAvailableFilterValues::getFilterValues()
{
	return filter_values;
}

void
CatalogsAvailableFilterValues::setFilterValues(CatalogsCreativeAssetsFilterValuesMap filter_values)
{
	this->filter_values = filter_values;
}



