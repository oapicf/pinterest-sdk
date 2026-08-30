

#include "CatalogsHotelProductGroup.h"

using namespace Tiny;

CatalogsHotelProductGroup::CatalogsHotelProductGroup()
{
	catalog_id = null;
	catalog_type = std::string();
	created_at = int(0);
	description = std::string();
	filters = CatalogsHotelProductGroupFilters();
	id = null;
	name = std::string();
	type = CatalogsHotelProductGroupType();
	updated_at = int(0);
}

CatalogsHotelProductGroup::CatalogsHotelProductGroup(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsHotelProductGroup::~CatalogsHotelProductGroup()
{

}

void
CatalogsHotelProductGroup::fromJson(std::string jsonObj)
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

    const char *created_atKey = "created_at";

    if(object.has_key(created_atKey))
    {
        bourne::json value = object[created_atKey];



        jsonToValue(&created_at, value, "int");


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

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];




        CatalogsHotelProductGroupType* obj = &type;
		obj->fromJson(value.dump());

    }

    const char *updated_atKey = "updated_at";

    if(object.has_key(updated_atKey))
    {
        bourne::json value = object[updated_atKey];



        jsonToValue(&updated_at, value, "int");


    }


}

bourne::json
CatalogsHotelProductGroup::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_id"] = getCatalogId();






    object["catalog_type"] = getCatalogType();






    object["created_at"] = getCreatedAt();






    object["description"] = getDescription();







	object["filters"] = getFilters().toJson();





    object["id"] = getId();






    object["name"] = getName();







	object["type"] = getType().toJson();





    object["updated_at"] = getUpdatedAt();



    return object;

}

std::string
CatalogsHotelProductGroup::getCatalogId()
{
	return catalog_id;
}

void
CatalogsHotelProductGroup::setCatalogId(std::string catalog_id)
{
	this->catalog_id = catalog_id;
}

std::string
CatalogsHotelProductGroup::getCatalogType()
{
	return catalog_type;
}

void
CatalogsHotelProductGroup::setCatalogType(std::string catalog_type)
{
	this->catalog_type = catalog_type;
}

int
CatalogsHotelProductGroup::getCreatedAt()
{
	return created_at;
}

void
CatalogsHotelProductGroup::setCreatedAt(int created_at)
{
	this->created_at = created_at;
}

std::string
CatalogsHotelProductGroup::getDescription()
{
	return description;
}

void
CatalogsHotelProductGroup::setDescription(std::string description)
{
	this->description = description;
}

CatalogsHotelProductGroupFilters
CatalogsHotelProductGroup::getFilters()
{
	return filters;
}

void
CatalogsHotelProductGroup::setFilters(CatalogsHotelProductGroupFilters filters)
{
	this->filters = filters;
}

std::string
CatalogsHotelProductGroup::getId()
{
	return id;
}

void
CatalogsHotelProductGroup::setId(std::string id)
{
	this->id = id;
}

std::string
CatalogsHotelProductGroup::getName()
{
	return name;
}

void
CatalogsHotelProductGroup::setName(std::string name)
{
	this->name = name;
}

CatalogsHotelProductGroupType
CatalogsHotelProductGroup::getType()
{
	return type;
}

void
CatalogsHotelProductGroup::setType(CatalogsHotelProductGroupType type)
{
	this->type = type;
}

int
CatalogsHotelProductGroup::getUpdatedAt()
{
	return updated_at;
}

void
CatalogsHotelProductGroup::setUpdatedAt(int updated_at)
{
	this->updated_at = updated_at;
}



