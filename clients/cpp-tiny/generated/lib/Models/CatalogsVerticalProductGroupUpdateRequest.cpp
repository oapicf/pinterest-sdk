

#include "CatalogsVerticalProductGroupUpdateRequest.h"

using namespace Tiny;

CatalogsVerticalProductGroupUpdateRequest::CatalogsVerticalProductGroupUpdateRequest()
{
	catalog_type = std::string();
	country = Country();
	description = std::string();
	filters = CatalogsCreativeAssetsProductGroupFilters();
	locale = CatalogsLocale();
	name = std::string();
}

CatalogsVerticalProductGroupUpdateRequest::CatalogsVerticalProductGroupUpdateRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsVerticalProductGroupUpdateRequest::~CatalogsVerticalProductGroupUpdateRequest()
{

}

void
CatalogsVerticalProductGroupUpdateRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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
CatalogsVerticalProductGroupUpdateRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_type"] = getCatalogType();







	object["country"] = getCountry().toJson();





    object["description"] = getDescription();







	object["filters"] = getFilters().toJson();






	object["locale"] = getLocale().toJson();





    object["name"] = getName();



    return object;

}

std::string
CatalogsVerticalProductGroupUpdateRequest::getCatalogType()
{
	return catalog_type;
}

void
CatalogsVerticalProductGroupUpdateRequest::setCatalogType(std::string catalog_type)
{
	this->catalog_type = catalog_type;
}

Country
CatalogsVerticalProductGroupUpdateRequest::getCountry()
{
	return country;
}

void
CatalogsVerticalProductGroupUpdateRequest::setCountry(Country country)
{
	this->country = country;
}

std::string
CatalogsVerticalProductGroupUpdateRequest::getDescription()
{
	return description;
}

void
CatalogsVerticalProductGroupUpdateRequest::setDescription(std::string description)
{
	this->description = description;
}

CatalogsCreativeAssetsProductGroupFilters
CatalogsVerticalProductGroupUpdateRequest::getFilters()
{
	return filters;
}

void
CatalogsVerticalProductGroupUpdateRequest::setFilters(CatalogsCreativeAssetsProductGroupFilters filters)
{
	this->filters = filters;
}

CatalogsLocale
CatalogsVerticalProductGroupUpdateRequest::getLocale()
{
	return locale;
}

void
CatalogsVerticalProductGroupUpdateRequest::setLocale(CatalogsLocale locale)
{
	this->locale = locale;
}

std::string
CatalogsVerticalProductGroupUpdateRequest::getName()
{
	return name;
}

void
CatalogsVerticalProductGroupUpdateRequest::setName(std::string name)
{
	this->name = name;
}



