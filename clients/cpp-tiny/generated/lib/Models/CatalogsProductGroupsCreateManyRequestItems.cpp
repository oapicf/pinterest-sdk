

#include "CatalogsProductGroupsCreateManyRequestItems.h"

using namespace Tiny;

CatalogsProductGroupsCreateManyRequestItems::CatalogsProductGroupsCreateManyRequestItems()
{
	description = std::string();
	feed_id = std::string();
	filters = CatalogsCreativeAssetsProductGroupFilters();
	is_featured = bool(false);
	name = std::string();
	catalog_id = null;
	catalog_type = std::string();
	country = Country();
	locale = CatalogsLocale();
}

CatalogsProductGroupsCreateManyRequestItems::CatalogsProductGroupsCreateManyRequestItems(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsProductGroupsCreateManyRequestItems::~CatalogsProductGroupsCreateManyRequestItems()
{

}

void
CatalogsProductGroupsCreateManyRequestItems::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }

    const char *feed_idKey = "feed_id";

    if(object.has_key(feed_idKey))
    {
        bourne::json value = object[feed_idKey];



        jsonToValue(&feed_id, value, "std::string");


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

    const char *localeKey = "locale";

    if(object.has_key(localeKey))
    {
        bourne::json value = object[localeKey];




        CatalogsLocale* obj = &locale;
		obj->fromJson(value.dump());

    }


}

bourne::json
CatalogsProductGroupsCreateManyRequestItems::toJson()
{
    bourne::json object = bourne::json::object();





    object["description"] = getDescription();






    object["feed_id"] = getFeedId();







	object["filters"] = getFilters().toJson();





    object["is_featured"] = isIsFeatured();






    object["name"] = getName();






    object["catalog_id"] = getCatalogId();






    object["catalog_type"] = getCatalogType();







	object["country"] = getCountry().toJson();






	object["locale"] = getLocale().toJson();


    return object;

}

std::string
CatalogsProductGroupsCreateManyRequestItems::getDescription()
{
	return description;
}

void
CatalogsProductGroupsCreateManyRequestItems::setDescription(std::string description)
{
	this->description = description;
}

std::string
CatalogsProductGroupsCreateManyRequestItems::getFeedId()
{
	return feed_id;
}

void
CatalogsProductGroupsCreateManyRequestItems::setFeedId(std::string feed_id)
{
	this->feed_id = feed_id;
}

CatalogsCreativeAssetsProductGroupFilters
CatalogsProductGroupsCreateManyRequestItems::getFilters()
{
	return filters;
}

void
CatalogsProductGroupsCreateManyRequestItems::setFilters(CatalogsCreativeAssetsProductGroupFilters filters)
{
	this->filters = filters;
}

bool
CatalogsProductGroupsCreateManyRequestItems::isIsFeatured()
{
	return is_featured;
}

void
CatalogsProductGroupsCreateManyRequestItems::setIsFeatured(bool is_featured)
{
	this->is_featured = is_featured;
}

std::string
CatalogsProductGroupsCreateManyRequestItems::getName()
{
	return name;
}

void
CatalogsProductGroupsCreateManyRequestItems::setName(std::string name)
{
	this->name = name;
}

std::string
CatalogsProductGroupsCreateManyRequestItems::getCatalogId()
{
	return catalog_id;
}

void
CatalogsProductGroupsCreateManyRequestItems::setCatalogId(std::string catalog_id)
{
	this->catalog_id = catalog_id;
}

std::string
CatalogsProductGroupsCreateManyRequestItems::getCatalogType()
{
	return catalog_type;
}

void
CatalogsProductGroupsCreateManyRequestItems::setCatalogType(std::string catalog_type)
{
	this->catalog_type = catalog_type;
}

Country
CatalogsProductGroupsCreateManyRequestItems::getCountry()
{
	return country;
}

void
CatalogsProductGroupsCreateManyRequestItems::setCountry(Country country)
{
	this->country = country;
}

CatalogsLocale
CatalogsProductGroupsCreateManyRequestItems::getLocale()
{
	return locale;
}

void
CatalogsProductGroupsCreateManyRequestItems::setLocale(CatalogsLocale locale)
{
	this->locale = locale;
}



