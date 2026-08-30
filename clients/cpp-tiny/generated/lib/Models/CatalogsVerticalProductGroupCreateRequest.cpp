

#include "CatalogsVerticalProductGroupCreateRequest.h"

using namespace Tiny;

CatalogsVerticalProductGroupCreateRequest::CatalogsVerticalProductGroupCreateRequest()
{
	catalog_id = null;
	catalog_type = std::string();
	country = Country();
	description = std::string();
	filters = CatalogsCreativeAssetsProductGroupFilters();
	locale = CatalogsLocale();
	name = std::string();
}

CatalogsVerticalProductGroupCreateRequest::CatalogsVerticalProductGroupCreateRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsVerticalProductGroupCreateRequest::~CatalogsVerticalProductGroupCreateRequest()
{

}

void
CatalogsVerticalProductGroupCreateRequest::fromJson(std::string jsonObj)
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

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


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

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }


}

bourne::json
CatalogsVerticalProductGroupCreateRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_id"] = getCatalogId();






    object["catalog_type"] = getCatalogType();







	object["country"] = getCountry().toJson();





    object["description"] = getDescription();







	object["filters"] = getFilters().toJson();






	object["locale"] = getLocale().toJson();





    object["name"] = getName();



    return object;

}

std::string
CatalogsVerticalProductGroupCreateRequest::getCatalogId()
{
	return catalog_id;
}

void
CatalogsVerticalProductGroupCreateRequest::setCatalogId(std::string catalog_id)
{
	this->catalog_id = catalog_id;
}

std::string
CatalogsVerticalProductGroupCreateRequest::getCatalogType()
{
	return catalog_type;
}

void
CatalogsVerticalProductGroupCreateRequest::setCatalogType(std::string catalog_type)
{
	this->catalog_type = catalog_type;
}

Country
CatalogsVerticalProductGroupCreateRequest::getCountry()
{
	return country;
}

void
CatalogsVerticalProductGroupCreateRequest::setCountry(Country country)
{
	this->country = country;
}

std::string
CatalogsVerticalProductGroupCreateRequest::getDescription()
{
	return description;
}

void
CatalogsVerticalProductGroupCreateRequest::setDescription(std::string description)
{
	this->description = description;
}

CatalogsCreativeAssetsProductGroupFilters
CatalogsVerticalProductGroupCreateRequest::getFilters()
{
	return filters;
}

void
CatalogsVerticalProductGroupCreateRequest::setFilters(CatalogsCreativeAssetsProductGroupFilters filters)
{
	this->filters = filters;
}

CatalogsLocale
CatalogsVerticalProductGroupCreateRequest::getLocale()
{
	return locale;
}

void
CatalogsVerticalProductGroupCreateRequest::setLocale(CatalogsLocale locale)
{
	this->locale = locale;
}

std::string
CatalogsVerticalProductGroupCreateRequest::getName()
{
	return name;
}

void
CatalogsVerticalProductGroupCreateRequest::setName(std::string name)
{
	this->name = name;
}



