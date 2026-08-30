

#include "CatalogsRetailProductGroupUpdateRequest.h"

using namespace Tiny;

CatalogsRetailProductGroupUpdateRequest::CatalogsRetailProductGroupUpdateRequest()
{
	catalog_type = std::string();
	country = Country();
	description = std::string();
	filters = CatalogsProductGroupFiltersRequest();
	locale = CatalogsLocale();
	name = std::string();
}

CatalogsRetailProductGroupUpdateRequest::CatalogsRetailProductGroupUpdateRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsRetailProductGroupUpdateRequest::~CatalogsRetailProductGroupUpdateRequest()
{

}

void
CatalogsRetailProductGroupUpdateRequest::fromJson(std::string jsonObj)
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




        CatalogsProductGroupFiltersRequest* obj = &filters;
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
CatalogsRetailProductGroupUpdateRequest::toJson()
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
CatalogsRetailProductGroupUpdateRequest::getCatalogType()
{
	return catalog_type;
}

void
CatalogsRetailProductGroupUpdateRequest::setCatalogType(std::string catalog_type)
{
	this->catalog_type = catalog_type;
}

Country
CatalogsRetailProductGroupUpdateRequest::getCountry()
{
	return country;
}

void
CatalogsRetailProductGroupUpdateRequest::setCountry(Country country)
{
	this->country = country;
}

std::string
CatalogsRetailProductGroupUpdateRequest::getDescription()
{
	return description;
}

void
CatalogsRetailProductGroupUpdateRequest::setDescription(std::string description)
{
	this->description = description;
}

CatalogsProductGroupFiltersRequest
CatalogsRetailProductGroupUpdateRequest::getFilters()
{
	return filters;
}

void
CatalogsRetailProductGroupUpdateRequest::setFilters(CatalogsProductGroupFiltersRequest filters)
{
	this->filters = filters;
}

CatalogsLocale
CatalogsRetailProductGroupUpdateRequest::getLocale()
{
	return locale;
}

void
CatalogsRetailProductGroupUpdateRequest::setLocale(CatalogsLocale locale)
{
	this->locale = locale;
}

std::string
CatalogsRetailProductGroupUpdateRequest::getName()
{
	return name;
}

void
CatalogsRetailProductGroupUpdateRequest::setName(std::string name)
{
	this->name = name;
}



