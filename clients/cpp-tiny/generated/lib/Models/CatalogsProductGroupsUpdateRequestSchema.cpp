

#include "CatalogsProductGroupsUpdateRequestSchema.h"

using namespace Tiny;

CatalogsProductGroupsUpdateRequestSchema::CatalogsProductGroupsUpdateRequestSchema()
{
	description = std::string();
	filters = CatalogsCreativeAssetsProductGroupFilters();
	is_featured = bool(false);
	name = std::string();
	catalog_type = std::string();
	country = Country();
	locale = CatalogsLocale();
}

CatalogsProductGroupsUpdateRequestSchema::CatalogsProductGroupsUpdateRequestSchema(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsProductGroupsUpdateRequestSchema::~CatalogsProductGroupsUpdateRequestSchema()
{

}

void
CatalogsProductGroupsUpdateRequestSchema::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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

    const char *is_featuredKey = "is_featured";

    if(object.has_key(is_featuredKey))
    {
        bourne::json value = object[is_featuredKey];



        jsonToValue(&is_featured, value, "bool");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


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

    const char *localeKey = "locale";

    if(object.has_key(localeKey))
    {
        bourne::json value = object[localeKey];




        CatalogsLocale* obj = &locale;
		obj->fromJson(value.dump());

    }


}

bourne::json
CatalogsProductGroupsUpdateRequestSchema::toJson()
{
    bourne::json object = bourne::json::object();





    object["description"] = getDescription();







	object["filters"] = getFilters().toJson();





    object["is_featured"] = isIsFeatured();






    object["name"] = getName();






    object["catalog_type"] = getCatalogType();







	object["country"] = getCountry().toJson();






	object["locale"] = getLocale().toJson();


    return object;

}

std::string
CatalogsProductGroupsUpdateRequestSchema::getDescription()
{
	return description;
}

void
CatalogsProductGroupsUpdateRequestSchema::setDescription(std::string description)
{
	this->description = description;
}

CatalogsCreativeAssetsProductGroupFilters
CatalogsProductGroupsUpdateRequestSchema::getFilters()
{
	return filters;
}

void
CatalogsProductGroupsUpdateRequestSchema::setFilters(CatalogsCreativeAssetsProductGroupFilters filters)
{
	this->filters = filters;
}

bool
CatalogsProductGroupsUpdateRequestSchema::isIsFeatured()
{
	return is_featured;
}

void
CatalogsProductGroupsUpdateRequestSchema::setIsFeatured(bool is_featured)
{
	this->is_featured = is_featured;
}

std::string
CatalogsProductGroupsUpdateRequestSchema::getName()
{
	return name;
}

void
CatalogsProductGroupsUpdateRequestSchema::setName(std::string name)
{
	this->name = name;
}

std::string
CatalogsProductGroupsUpdateRequestSchema::getCatalogType()
{
	return catalog_type;
}

void
CatalogsProductGroupsUpdateRequestSchema::setCatalogType(std::string catalog_type)
{
	this->catalog_type = catalog_type;
}

Country
CatalogsProductGroupsUpdateRequestSchema::getCountry()
{
	return country;
}

void
CatalogsProductGroupsUpdateRequestSchema::setCountry(Country country)
{
	this->country = country;
}

CatalogsLocale
CatalogsProductGroupsUpdateRequestSchema::getLocale()
{
	return locale;
}

void
CatalogsProductGroupsUpdateRequestSchema::setLocale(CatalogsLocale locale)
{
	this->locale = locale;
}



