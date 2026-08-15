

#include "CatalogsHotelProductGroupCreateRequest.h"

using namespace Tiny;

CatalogsHotelProductGroupCreateRequest::CatalogsHotelProductGroupCreateRequest()
{
	catalog_id = std::string();
	catalog_type = std::string();
	description = std::string();
	filters = CatalogsHotelProductGroupFilters();
	name = std::string();
}

CatalogsHotelProductGroupCreateRequest::CatalogsHotelProductGroupCreateRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsHotelProductGroupCreateRequest::~CatalogsHotelProductGroupCreateRequest()
{

}

void
CatalogsHotelProductGroupCreateRequest::fromJson(std::string jsonObj)
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




        CatalogsHotelProductGroupFilters* obj = &filters;
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
CatalogsHotelProductGroupCreateRequest::toJson()
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
CatalogsHotelProductGroupCreateRequest::getCatalogId()
{
	return catalog_id;
}

void
CatalogsHotelProductGroupCreateRequest::setCatalogId(std::string  catalog_id)
{
	this->catalog_id = catalog_id;
}

std::string
CatalogsHotelProductGroupCreateRequest::getCatalogType()
{
	return catalog_type;
}

void
CatalogsHotelProductGroupCreateRequest::setCatalogType(std::string  catalog_type)
{
	this->catalog_type = catalog_type;
}

std::string
CatalogsHotelProductGroupCreateRequest::getDescription()
{
	return description;
}

void
CatalogsHotelProductGroupCreateRequest::setDescription(std::string  description)
{
	this->description = description;
}

CatalogsHotelProductGroupFilters
CatalogsHotelProductGroupCreateRequest::getFilters()
{
	return filters;
}

void
CatalogsHotelProductGroupCreateRequest::setFilters(CatalogsHotelProductGroupFilters  filters)
{
	this->filters = filters;
}

std::string
CatalogsHotelProductGroupCreateRequest::getName()
{
	return name;
}

void
CatalogsHotelProductGroupCreateRequest::setName(std::string  name)
{
	this->name = name;
}



