

#include "CatalogsCreativeAssetsProductGroupUpdateRequest.h"

using namespace Tiny;

CatalogsCreativeAssetsProductGroupUpdateRequest::CatalogsCreativeAssetsProductGroupUpdateRequest()
{
	catalog_type = std::string();
	description = std::string();
	filters = CatalogsCreativeAssetsProductGroupFilters();
	name = std::string();
}

CatalogsCreativeAssetsProductGroupUpdateRequest::CatalogsCreativeAssetsProductGroupUpdateRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsCreativeAssetsProductGroupUpdateRequest::~CatalogsCreativeAssetsProductGroupUpdateRequest()
{

}

void
CatalogsCreativeAssetsProductGroupUpdateRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *catalog_typeKey = "catalog_type";

    if(object.has_key(catalog_typeKey))
    {
        bourne::json value = object[catalog_typeKey];



        jsonToValue(&catalog_type, value, "std::string");


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




        CatalogsCreativeAssetsProductGroupFilters* obj = &filters;
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
CatalogsCreativeAssetsProductGroupUpdateRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_type"] = getCatalogType();






    object["description"] = getDescription();







	object["filters"] = getFilters().toJson();





    object["name"] = getName();



    return object;

}

std::string
CatalogsCreativeAssetsProductGroupUpdateRequest::getCatalogType()
{
	return catalog_type;
}

void
CatalogsCreativeAssetsProductGroupUpdateRequest::setCatalogType(std::string  catalog_type)
{
	this->catalog_type = catalog_type;
}

std::string
CatalogsCreativeAssetsProductGroupUpdateRequest::getDescription()
{
	return description;
}

void
CatalogsCreativeAssetsProductGroupUpdateRequest::setDescription(std::string  description)
{
	this->description = description;
}

CatalogsCreativeAssetsProductGroupFilters
CatalogsCreativeAssetsProductGroupUpdateRequest::getFilters()
{
	return filters;
}

void
CatalogsCreativeAssetsProductGroupUpdateRequest::setFilters(CatalogsCreativeAssetsProductGroupFilters  filters)
{
	this->filters = filters;
}

std::string
CatalogsCreativeAssetsProductGroupUpdateRequest::getName()
{
	return name;
}

void
CatalogsCreativeAssetsProductGroupUpdateRequest::setName(std::string  name)
{
	this->name = name;
}



