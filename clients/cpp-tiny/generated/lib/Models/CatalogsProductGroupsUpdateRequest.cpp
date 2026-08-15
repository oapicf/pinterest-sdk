

#include "Catalogs_product_groups_update_request.h"

using namespace Tiny;

Catalogs_product_groups_update_request::Catalogs_product_groups_update_request()
{
	description = std::string();
	filters = CatalogsCreativeAssetsProductGroupFilters();
	is_featured = bool(false);
	name = std::string();
	catalog_type = std::string();
	country = Country();
	locale = CatalogsLocale();
}

Catalogs_product_groups_update_request::Catalogs_product_groups_update_request(std::string jsonString)
{
	this->fromJson(jsonString);
}

Catalogs_product_groups_update_request::~Catalogs_product_groups_update_request()
{

}

void
Catalogs_product_groups_update_request::fromJson(std::string jsonObj)
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
Catalogs_product_groups_update_request::toJson()
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
Catalogs_product_groups_update_request::getDescription()
{
	return description;
}

void
Catalogs_product_groups_update_request::setDescription(std::string  description)
{
	this->description = description;
}

CatalogsCreativeAssetsProductGroupFilters
Catalogs_product_groups_update_request::getFilters()
{
	return filters;
}

void
Catalogs_product_groups_update_request::setFilters(CatalogsCreativeAssetsProductGroupFilters  filters)
{
	this->filters = filters;
}

bool
Catalogs_product_groups_update_request::isIsFeatured()
{
	return is_featured;
}

void
Catalogs_product_groups_update_request::setIsFeatured(bool  is_featured)
{
	this->is_featured = is_featured;
}

std::string
Catalogs_product_groups_update_request::getName()
{
	return name;
}

void
Catalogs_product_groups_update_request::setName(std::string  name)
{
	this->name = name;
}

std::string
Catalogs_product_groups_update_request::getCatalogType()
{
	return catalog_type;
}

void
Catalogs_product_groups_update_request::setCatalogType(std::string  catalog_type)
{
	this->catalog_type = catalog_type;
}

Country
Catalogs_product_groups_update_request::getCountry()
{
	return country;
}

void
Catalogs_product_groups_update_request::setCountry(Country  country)
{
	this->country = country;
}

CatalogsLocale
Catalogs_product_groups_update_request::getLocale()
{
	return locale;
}

void
Catalogs_product_groups_update_request::setLocale(CatalogsLocale  locale)
{
	this->locale = locale;
}



