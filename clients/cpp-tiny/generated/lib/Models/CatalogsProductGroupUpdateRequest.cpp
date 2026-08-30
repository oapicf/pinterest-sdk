

#include "CatalogsProductGroupUpdateRequest.h"

using namespace Tiny;

CatalogsProductGroupUpdateRequest::CatalogsProductGroupUpdateRequest()
{
	description = std::string();
	filters = CatalogsProductGroupFiltersRequest();
	is_featured = bool(false);
	name = std::string();
}

CatalogsProductGroupUpdateRequest::CatalogsProductGroupUpdateRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsProductGroupUpdateRequest::~CatalogsProductGroupUpdateRequest()
{

}

void
CatalogsProductGroupUpdateRequest::fromJson(std::string jsonObj)
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
CatalogsProductGroupUpdateRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["description"] = getDescription();







	object["filters"] = getFilters().toJson();





    object["is_featured"] = isIsFeatured();






    object["name"] = getName();



    return object;

}

std::string
CatalogsProductGroupUpdateRequest::getDescription()
{
	return description;
}

void
CatalogsProductGroupUpdateRequest::setDescription(std::string description)
{
	this->description = description;
}

CatalogsProductGroupFiltersRequest
CatalogsProductGroupUpdateRequest::getFilters()
{
	return filters;
}

void
CatalogsProductGroupUpdateRequest::setFilters(CatalogsProductGroupFiltersRequest filters)
{
	this->filters = filters;
}

bool
CatalogsProductGroupUpdateRequest::isIsFeatured()
{
	return is_featured;
}

void
CatalogsProductGroupUpdateRequest::setIsFeatured(bool is_featured)
{
	this->is_featured = is_featured;
}

std::string
CatalogsProductGroupUpdateRequest::getName()
{
	return name;
}

void
CatalogsProductGroupUpdateRequest::setName(std::string name)
{
	this->name = name;
}



