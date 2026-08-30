

#include "CatalogsHotelAvailableFilterValues.h"

using namespace Tiny;

CatalogsHotelAvailableFilterValues::CatalogsHotelAvailableFilterValues()
{
	catalog_type = std::string();
	filter_values = CatalogsHotelFilterValuesMap();
}

CatalogsHotelAvailableFilterValues::CatalogsHotelAvailableFilterValues(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsHotelAvailableFilterValues::~CatalogsHotelAvailableFilterValues()
{

}

void
CatalogsHotelAvailableFilterValues::fromJson(std::string jsonObj)
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




        CatalogsHotelFilterValuesMap* obj = &filter_values;
		obj->fromJson(value.dump());

    }


}

bourne::json
CatalogsHotelAvailableFilterValues::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_type"] = getCatalogType();







	object["filter_values"] = getFilterValues().toJson();


    return object;

}

std::string
CatalogsHotelAvailableFilterValues::getCatalogType()
{
	return catalog_type;
}

void
CatalogsHotelAvailableFilterValues::setCatalogType(std::string catalog_type)
{
	this->catalog_type = catalog_type;
}

CatalogsHotelFilterValuesMap
CatalogsHotelAvailableFilterValues::getFilterValues()
{
	return filter_values;
}

void
CatalogsHotelAvailableFilterValues::setFilterValues(CatalogsHotelFilterValuesMap filter_values)
{
	this->filter_values = filter_values;
}



