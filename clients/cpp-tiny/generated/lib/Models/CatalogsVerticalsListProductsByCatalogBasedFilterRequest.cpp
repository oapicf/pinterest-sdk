

#include "CatalogsVerticalsListProductsByCatalogBasedFilterRequest.h"

using namespace Tiny;

CatalogsVerticalsListProductsByCatalogBasedFilterRequest::CatalogsVerticalsListProductsByCatalogBasedFilterRequest()
{
	catalog_id = std::string();
	catalog_type = std::string();
	country = Country();
	filters = CatalogsCreativeAssetsProductGroupFilters();
	locale = CatalogsLocale();
}

CatalogsVerticalsListProductsByCatalogBasedFilterRequest::CatalogsVerticalsListProductsByCatalogBasedFilterRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsVerticalsListProductsByCatalogBasedFilterRequest::~CatalogsVerticalsListProductsByCatalogBasedFilterRequest()
{

}

void
CatalogsVerticalsListProductsByCatalogBasedFilterRequest::fromJson(std::string jsonObj)
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




        CatalogsCreativeAssetsProductGroupFilters* obj = &filters;
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
CatalogsVerticalsListProductsByCatalogBasedFilterRequest::toJson()
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
CatalogsVerticalsListProductsByCatalogBasedFilterRequest::getCatalogId()
{
	return catalog_id;
}

void
CatalogsVerticalsListProductsByCatalogBasedFilterRequest::setCatalogId(std::string  catalog_id)
{
	this->catalog_id = catalog_id;
}

std::string
CatalogsVerticalsListProductsByCatalogBasedFilterRequest::getCatalogType()
{
	return catalog_type;
}

void
CatalogsVerticalsListProductsByCatalogBasedFilterRequest::setCatalogType(std::string  catalog_type)
{
	this->catalog_type = catalog_type;
}

Country
CatalogsVerticalsListProductsByCatalogBasedFilterRequest::getCountry()
{
	return country;
}

void
CatalogsVerticalsListProductsByCatalogBasedFilterRequest::setCountry(Country  country)
{
	this->country = country;
}

CatalogsCreativeAssetsProductGroupFilters
CatalogsVerticalsListProductsByCatalogBasedFilterRequest::getFilters()
{
	return filters;
}

void
CatalogsVerticalsListProductsByCatalogBasedFilterRequest::setFilters(CatalogsCreativeAssetsProductGroupFilters  filters)
{
	this->filters = filters;
}

CatalogsLocale
CatalogsVerticalsListProductsByCatalogBasedFilterRequest::getLocale()
{
	return locale;
}

void
CatalogsVerticalsListProductsByCatalogBasedFilterRequest::setLocale(CatalogsLocale  locale)
{
	this->locale = locale;
}



