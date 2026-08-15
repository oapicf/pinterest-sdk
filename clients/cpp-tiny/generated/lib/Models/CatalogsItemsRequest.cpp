

#include "CatalogsItemsRequest.h"

using namespace Tiny;

CatalogsItemsRequest::CatalogsItemsRequest()
{
	country = Country();
	filters = CatalogsItemsPostFilters();
	language = std::string();
}

CatalogsItemsRequest::CatalogsItemsRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsItemsRequest::~CatalogsItemsRequest()
{

}

void
CatalogsItemsRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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




        CatalogsItemsPostFilters* obj = &filters;
		obj->fromJson(value.dump());

    }

    const char *languageKey = "language";

    if(object.has_key(languageKey))
    {
        bourne::json value = object[languageKey];



        jsonToValue(&language, value, "std::string");


    }


}

bourne::json
CatalogsItemsRequest::toJson()
{
    bourne::json object = bourne::json::object();






	object["country"] = getCountry().toJson();






	object["filters"] = getFilters().toJson();





    object["language"] = getLanguage();



    return object;

}

Country
CatalogsItemsRequest::getCountry()
{
	return country;
}

void
CatalogsItemsRequest::setCountry(Country  country)
{
	this->country = country;
}

CatalogsItemsPostFilters
CatalogsItemsRequest::getFilters()
{
	return filters;
}

void
CatalogsItemsRequest::setFilters(CatalogsItemsPostFilters  filters)
{
	this->filters = filters;
}

std::string
CatalogsItemsRequest::getLanguage()
{
	return language;
}

void
CatalogsItemsRequest::setLanguage(std::string  language)
{
	this->language = language;
}



