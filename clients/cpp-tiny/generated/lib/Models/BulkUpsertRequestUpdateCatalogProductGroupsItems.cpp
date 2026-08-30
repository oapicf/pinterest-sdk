

#include "BulkUpsertRequestUpdateCatalogProductGroupsItems.h"

using namespace Tiny;

BulkUpsertRequestUpdateCatalogProductGroupsItems::BulkUpsertRequestUpdateCatalogProductGroupsItems()
{
	description = std::string();
	filters = CatalogsCreativeAssetsProductGroupFilters();
	is_featured = bool(false);
	name = std::string();
	catalog_type = std::string();
	country = Country();
	locale = CatalogsLocale();
}

BulkUpsertRequestUpdateCatalogProductGroupsItems::BulkUpsertRequestUpdateCatalogProductGroupsItems(std::string jsonString)
{
	this->fromJson(jsonString);
}

BulkUpsertRequestUpdateCatalogProductGroupsItems::~BulkUpsertRequestUpdateCatalogProductGroupsItems()
{

}

void
BulkUpsertRequestUpdateCatalogProductGroupsItems::fromJson(std::string jsonObj)
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
BulkUpsertRequestUpdateCatalogProductGroupsItems::toJson()
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
BulkUpsertRequestUpdateCatalogProductGroupsItems::getDescription()
{
	return description;
}

void
BulkUpsertRequestUpdateCatalogProductGroupsItems::setDescription(std::string description)
{
	this->description = description;
}

CatalogsCreativeAssetsProductGroupFilters
BulkUpsertRequestUpdateCatalogProductGroupsItems::getFilters()
{
	return filters;
}

void
BulkUpsertRequestUpdateCatalogProductGroupsItems::setFilters(CatalogsCreativeAssetsProductGroupFilters filters)
{
	this->filters = filters;
}

bool
BulkUpsertRequestUpdateCatalogProductGroupsItems::isIsFeatured()
{
	return is_featured;
}

void
BulkUpsertRequestUpdateCatalogProductGroupsItems::setIsFeatured(bool is_featured)
{
	this->is_featured = is_featured;
}

std::string
BulkUpsertRequestUpdateCatalogProductGroupsItems::getName()
{
	return name;
}

void
BulkUpsertRequestUpdateCatalogProductGroupsItems::setName(std::string name)
{
	this->name = name;
}

std::string
BulkUpsertRequestUpdateCatalogProductGroupsItems::getCatalogType()
{
	return catalog_type;
}

void
BulkUpsertRequestUpdateCatalogProductGroupsItems::setCatalogType(std::string catalog_type)
{
	this->catalog_type = catalog_type;
}

Country
BulkUpsertRequestUpdateCatalogProductGroupsItems::getCountry()
{
	return country;
}

void
BulkUpsertRequestUpdateCatalogProductGroupsItems::setCountry(Country country)
{
	this->country = country;
}

CatalogsLocale
BulkUpsertRequestUpdateCatalogProductGroupsItems::getLocale()
{
	return locale;
}

void
BulkUpsertRequestUpdateCatalogProductGroupsItems::setLocale(CatalogsLocale locale)
{
	this->locale = locale;
}



