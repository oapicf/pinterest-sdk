

#include "CatalogsRetailListProductsByCatalogBasedFilterRequest.h"

using namespace Tiny;

CatalogsRetailListProductsByCatalogBasedFilterRequest::CatalogsRetailListProductsByCatalogBasedFilterRequest()
{
	catalog_id = null;
	catalog_type = std::string();
	country = Country();
	filters = CatalogsProductGroupFilters();
	locale = CatalogsLocale();
}

CatalogsRetailListProductsByCatalogBasedFilterRequest::CatalogsRetailListProductsByCatalogBasedFilterRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsRetailListProductsByCatalogBasedFilterRequest::~CatalogsRetailListProductsByCatalogBasedFilterRequest()
{

}

void
CatalogsRetailListProductsByCatalogBasedFilterRequest::fromJson(std::string jsonObj)
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

    const char *countryKey = "country";

    if(object.has_key(countryKey))
    {
        bourne::json value = object[countryKey];




        Country* obj = &country;
		obj->fromJson(value.dump());

    }

    const char *filtersKey = "filters";

    if(object.has_key(filtersKey))
    {
        bourne::json value = object[filtersKey];




        CatalogsProductGroupFilters* obj = &filters;
		obj->fromJson(value.dump());

    }

    const char *localeKey = "locale";

    if(object.has_key(localeKey))
    {
        bourne::json value = object[localeKey];




        CatalogsLocale* obj = &locale;
		obj->fromJson(value.dump());

    }


}

bourne::json
CatalogsRetailListProductsByCatalogBasedFilterRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_id"] = getCatalogId();






    object["catalog_type"] = getCatalogType();







	object["country"] = getCountry().toJson();






	object["filters"] = getFilters().toJson();






	object["locale"] = getLocale().toJson();


    return object;

}

std::string
CatalogsRetailListProductsByCatalogBasedFilterRequest::getCatalogId()
{
	return catalog_id;
}

void
CatalogsRetailListProductsByCatalogBasedFilterRequest::setCatalogId(std::string catalog_id)
{
	this->catalog_id = catalog_id;
}

std::string
CatalogsRetailListProductsByCatalogBasedFilterRequest::getCatalogType()
{
	return catalog_type;
}

void
CatalogsRetailListProductsByCatalogBasedFilterRequest::setCatalogType(std::string catalog_type)
{
	this->catalog_type = catalog_type;
}

Country
CatalogsRetailListProductsByCatalogBasedFilterRequest::getCountry()
{
	return country;
}

void
CatalogsRetailListProductsByCatalogBasedFilterRequest::setCountry(Country country)
{
	this->country = country;
}

CatalogsProductGroupFilters
CatalogsRetailListProductsByCatalogBasedFilterRequest::getFilters()
{
	return filters;
}

void
CatalogsRetailListProductsByCatalogBasedFilterRequest::setFilters(CatalogsProductGroupFilters filters)
{
	this->filters = filters;
}

CatalogsLocale
CatalogsRetailListProductsByCatalogBasedFilterRequest::getLocale()
{
	return locale;
}

void
CatalogsRetailListProductsByCatalogBasedFilterRequest::setLocale(CatalogsLocale locale)
{
	this->locale = locale;
}



