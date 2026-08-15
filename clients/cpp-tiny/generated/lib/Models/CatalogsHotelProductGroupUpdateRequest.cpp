

#include "CatalogsHotelProductGroupUpdateRequest.h"

using namespace Tiny;

CatalogsHotelProductGroupUpdateRequest::CatalogsHotelProductGroupUpdateRequest()
{
	catalog_type = std::string();
	description = std::string();
	filters = CatalogsHotelProductGroupFilters();
	name = std::string();
}

CatalogsHotelProductGroupUpdateRequest::CatalogsHotelProductGroupUpdateRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsHotelProductGroupUpdateRequest::~CatalogsHotelProductGroupUpdateRequest()
{

}

void
CatalogsHotelProductGroupUpdateRequest::fromJson(std::string jsonObj)
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
CatalogsHotelProductGroupUpdateRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_type"] = getCatalogType();






    object["description"] = getDescription();







	object["filters"] = getFilters().toJson();





    object["name"] = getName();



    return object;

}

std::string
CatalogsHotelProductGroupUpdateRequest::getCatalogType()
{
	return catalog_type;
}

void
CatalogsHotelProductGroupUpdateRequest::setCatalogType(std::string  catalog_type)
{
	this->catalog_type = catalog_type;
}

std::string
CatalogsHotelProductGroupUpdateRequest::getDescription()
{
	return description;
}

void
CatalogsHotelProductGroupUpdateRequest::setDescription(std::string  description)
{
	this->description = description;
}

CatalogsHotelProductGroupFilters
CatalogsHotelProductGroupUpdateRequest::getFilters()
{
	return filters;
}

void
CatalogsHotelProductGroupUpdateRequest::setFilters(CatalogsHotelProductGroupFilters  filters)
{
	this->filters = filters;
}

std::string
CatalogsHotelProductGroupUpdateRequest::getName()
{
	return name;
}

void
CatalogsHotelProductGroupUpdateRequest::setName(std::string  name)
{
	this->name = name;
}



