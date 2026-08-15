

#include "CatalogsListProductsByFilterRequest.h"

using namespace Tiny;

CatalogsListProductsByFilterRequest::CatalogsListProductsByFilterRequest()
{
	feed_id = std::string();
	filters = CatalogsCreativeAssetsProductGroupFilters();
	catalog_id = std::string();
	catalog_type = std::string();
	country = Country();
	locale = CatalogsLocale();
}

CatalogsListProductsByFilterRequest::CatalogsListProductsByFilterRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsListProductsByFilterRequest::~CatalogsListProductsByFilterRequest()
{

}

void
CatalogsListProductsByFilterRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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
CatalogsListProductsByFilterRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["feed_id"] = getFeedId();







	object["filters"] = getFilters().toJson();





    object["catalog_id"] = getCatalogId();






    object["catalog_type"] = getCatalogType();







	object["country"] = getCountry().toJson();






	object["locale"] = getLocale().toJson();


    return object;

}

std::string
CatalogsListProductsByFilterRequest::getFeedId()
{
	return feed_id;
}

void
CatalogsListProductsByFilterRequest::setFeedId(std::string  feed_id)
{
	this->feed_id = feed_id;
}

CatalogsCreativeAssetsProductGroupFilters
CatalogsListProductsByFilterRequest::getFilters()
{
	return filters;
}

void
CatalogsListProductsByFilterRequest::setFilters(CatalogsCreativeAssetsProductGroupFilters  filters)
{
	this->filters = filters;
}

std::string
CatalogsListProductsByFilterRequest::getCatalogId()
{
	return catalog_id;
}

void
CatalogsListProductsByFilterRequest::setCatalogId(std::string  catalog_id)
{
	this->catalog_id = catalog_id;
}

std::string
CatalogsListProductsByFilterRequest::getCatalogType()
{
	return catalog_type;
}

void
CatalogsListProductsByFilterRequest::setCatalogType(std::string  catalog_type)
{
	this->catalog_type = catalog_type;
}

Country
CatalogsListProductsByFilterRequest::getCountry()
{
	return country;
}

void
CatalogsListProductsByFilterRequest::setCountry(Country  country)
{
	this->country = country;
}

CatalogsLocale
CatalogsListProductsByFilterRequest::getLocale()
{
	return locale;
}

void
CatalogsListProductsByFilterRequest::setLocale(CatalogsLocale  locale)
{
	this->locale = locale;
}



