

#include "CatalogsCreativeAssetsProductGroupCreateRequest.h"

using namespace Tiny;

CatalogsCreativeAssetsProductGroupCreateRequest::CatalogsCreativeAssetsProductGroupCreateRequest()
{
	catalog_id = std::string();
	catalog_type = std::string();
	description = std::string();
	filters = CatalogsCreativeAssetsProductGroupFilters();
	name = std::string();
}

CatalogsCreativeAssetsProductGroupCreateRequest::CatalogsCreativeAssetsProductGroupCreateRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsCreativeAssetsProductGroupCreateRequest::~CatalogsCreativeAssetsProductGroupCreateRequest()
{

}

void
CatalogsCreativeAssetsProductGroupCreateRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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
CatalogsCreativeAssetsProductGroupCreateRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_id"] = getCatalogId();






    object["catalog_type"] = getCatalogType();






    object["description"] = getDescription();







	object["filters"] = getFilters().toJson();





    object["name"] = getName();



    return object;

}

std::string
CatalogsCreativeAssetsProductGroupCreateRequest::getCatalogId()
{
	return catalog_id;
}

void
CatalogsCreativeAssetsProductGroupCreateRequest::setCatalogId(std::string  catalog_id)
{
	this->catalog_id = catalog_id;
}

std::string
CatalogsCreativeAssetsProductGroupCreateRequest::getCatalogType()
{
	return catalog_type;
}

void
CatalogsCreativeAssetsProductGroupCreateRequest::setCatalogType(std::string  catalog_type)
{
	this->catalog_type = catalog_type;
}

std::string
CatalogsCreativeAssetsProductGroupCreateRequest::getDescription()
{
	return description;
}

void
CatalogsCreativeAssetsProductGroupCreateRequest::setDescription(std::string  description)
{
	this->description = description;
}

CatalogsCreativeAssetsProductGroupFilters
CatalogsCreativeAssetsProductGroupCreateRequest::getFilters()
{
	return filters;
}

void
CatalogsCreativeAssetsProductGroupCreateRequest::setFilters(CatalogsCreativeAssetsProductGroupFilters  filters)
{
	this->filters = filters;
}

std::string
CatalogsCreativeAssetsProductGroupCreateRequest::getName()
{
	return name;
}

void
CatalogsCreativeAssetsProductGroupCreateRequest::setName(std::string  name)
{
	this->name = name;
}



