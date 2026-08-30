

#include "CatalogsProductGroupUpdateManyRequestItemsOneOfItems0.h"

using namespace Tiny;

CatalogsProductGroupUpdateManyRequestItemsOneOfItems0::CatalogsProductGroupUpdateManyRequestItemsOneOfItems0()
{
	description = std::string();
	filters = CatalogsProductGroupFiltersRequest();
	is_featured = bool(false);
	name = std::string();
	id = std::string();
}

CatalogsProductGroupUpdateManyRequestItemsOneOfItems0::CatalogsProductGroupUpdateManyRequestItemsOneOfItems0(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsProductGroupUpdateManyRequestItemsOneOfItems0::~CatalogsProductGroupUpdateManyRequestItemsOneOfItems0()
{

}

void
CatalogsProductGroupUpdateManyRequestItemsOneOfItems0::fromJson(std::string jsonObj)
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

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }


}

bourne::json
CatalogsProductGroupUpdateManyRequestItemsOneOfItems0::toJson()
{
    bourne::json object = bourne::json::object();





    object["description"] = getDescription();







	object["filters"] = getFilters().toJson();





    object["is_featured"] = isIsFeatured();






    object["name"] = getName();






    object["id"] = getId();



    return object;

}

std::string
CatalogsProductGroupUpdateManyRequestItemsOneOfItems0::getDescription()
{
	return description;
}

void
CatalogsProductGroupUpdateManyRequestItemsOneOfItems0::setDescription(std::string description)
{
	this->description = description;
}

CatalogsProductGroupFiltersRequest
CatalogsProductGroupUpdateManyRequestItemsOneOfItems0::getFilters()
{
	return filters;
}

void
CatalogsProductGroupUpdateManyRequestItemsOneOfItems0::setFilters(CatalogsProductGroupFiltersRequest filters)
{
	this->filters = filters;
}

bool
CatalogsProductGroupUpdateManyRequestItemsOneOfItems0::isIsFeatured()
{
	return is_featured;
}

void
CatalogsProductGroupUpdateManyRequestItemsOneOfItems0::setIsFeatured(bool is_featured)
{
	this->is_featured = is_featured;
}

std::string
CatalogsProductGroupUpdateManyRequestItemsOneOfItems0::getName()
{
	return name;
}

void
CatalogsProductGroupUpdateManyRequestItemsOneOfItems0::setName(std::string name)
{
	this->name = name;
}

std::string
CatalogsProductGroupUpdateManyRequestItemsOneOfItems0::getId()
{
	return id;
}

void
CatalogsProductGroupUpdateManyRequestItemsOneOfItems0::setId(std::string id)
{
	this->id = id;
}



