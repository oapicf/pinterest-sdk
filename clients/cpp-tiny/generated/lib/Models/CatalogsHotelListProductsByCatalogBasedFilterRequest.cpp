

#include "CatalogsHotelListProductsByCatalogBasedFilterRequest.h"

using namespace Tiny;

CatalogsHotelListProductsByCatalogBasedFilterRequest::CatalogsHotelListProductsByCatalogBasedFilterRequest()
{
	catalog_id = null;
	catalog_type = std::string();
	filters = CatalogsHotelProductGroupFilters();
}

CatalogsHotelListProductsByCatalogBasedFilterRequest::CatalogsHotelListProductsByCatalogBasedFilterRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsHotelListProductsByCatalogBasedFilterRequest::~CatalogsHotelListProductsByCatalogBasedFilterRequest()
{

}

void
CatalogsHotelListProductsByCatalogBasedFilterRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *catalog_idKey = "catalog_id";

    if(object.has_key(catalog_idKey))
    {
        bourne::json value = object[catalog_idKey];



        jsonToValue(&catalog_id, value, "std::string");


    }

    const char *catalog_typeKey = "catalog_type";

    if(object.has_key(catalog_typeKey))
    {
        bourne::json value = object[catalog_typeKey];



        jsonToValue(&catalog_type, value, "std::string");


    }

    const char *filtersKey = "filters";

    if(object.has_key(filtersKey))
    {
        bourne::json value = object[filtersKey];




        CatalogsHotelProductGroupFilters* obj = &filters;
		obj->fromJson(value.dump());

    }


}

bourne::json
CatalogsHotelListProductsByCatalogBasedFilterRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_id"] = getCatalogId();






    object["catalog_type"] = getCatalogType();







	object["filters"] = getFilters().toJson();


    return object;

}

std::string
CatalogsHotelListProductsByCatalogBasedFilterRequest::getCatalogId()
{
	return catalog_id;
}

void
CatalogsHotelListProductsByCatalogBasedFilterRequest::setCatalogId(std::string catalog_id)
{
	this->catalog_id = catalog_id;
}

std::string
CatalogsHotelListProductsByCatalogBasedFilterRequest::getCatalogType()
{
	return catalog_type;
}

void
CatalogsHotelListProductsByCatalogBasedFilterRequest::setCatalogType(std::string catalog_type)
{
	this->catalog_type = catalog_type;
}

CatalogsHotelProductGroupFilters
CatalogsHotelListProductsByCatalogBasedFilterRequest::getFilters()
{
	return filters;
}

void
CatalogsHotelListProductsByCatalogBasedFilterRequest::setFilters(CatalogsHotelProductGroupFilters filters)
{
	this->filters = filters;
}



