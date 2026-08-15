

#include "CatalogsProductGroupCreateRequest.h"

using namespace Tiny;

CatalogsProductGroupCreateRequest::CatalogsProductGroupCreateRequest()
{
	description = std::string();
	feed_id = std::string();
	filters = CatalogsProductGroupFiltersRequest();
	is_featured = bool(false);
	name = std::string();
}

CatalogsProductGroupCreateRequest::CatalogsProductGroupCreateRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsProductGroupCreateRequest::~CatalogsProductGroupCreateRequest()
{

}

void
CatalogsProductGroupCreateRequest::fromJson(std::string jsonObj)
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




        CatalogsProductGroupFiltersRequest* obj = &filters;
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


}

bourne::json
CatalogsProductGroupCreateRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["description"] = getDescription();






    object["feed_id"] = getFeedId();







	object["filters"] = getFilters().toJson();





    object["is_featured"] = isIsFeatured();






    object["name"] = getName();



    return object;

}

std::string
CatalogsProductGroupCreateRequest::getDescription()
{
	return description;
}

void
CatalogsProductGroupCreateRequest::setDescription(std::string  description)
{
	this->description = description;
}

std::string
CatalogsProductGroupCreateRequest::getFeedId()
{
	return feed_id;
}

void
CatalogsProductGroupCreateRequest::setFeedId(std::string  feed_id)
{
	this->feed_id = feed_id;
}

CatalogsProductGroupFiltersRequest
CatalogsProductGroupCreateRequest::getFilters()
{
	return filters;
}

void
CatalogsProductGroupCreateRequest::setFilters(CatalogsProductGroupFiltersRequest  filters)
{
	this->filters = filters;
}

bool
CatalogsProductGroupCreateRequest::isIsFeatured()
{
	return is_featured;
}

void
CatalogsProductGroupCreateRequest::setIsFeatured(bool  is_featured)
{
	this->is_featured = is_featured;
}

std::string
CatalogsProductGroupCreateRequest::getName()
{
	return name;
}

void
CatalogsProductGroupCreateRequest::setName(std::string  name)
{
	this->name = name;
}



