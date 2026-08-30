

#include "CatalogsCreativeAssetsProductGroup.h"

using namespace Tiny;

CatalogsCreativeAssetsProductGroup::CatalogsCreativeAssetsProductGroup()
{
	catalog_id = null;
	catalog_type = std::string();
	created_at = int(0);
	description = std::string();
	filters = CatalogsCreativeAssetsProductGroupFilters();
	id = null;
	name = std::string();
	updated_at = int(0);
}

CatalogsCreativeAssetsProductGroup::CatalogsCreativeAssetsProductGroup(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsCreativeAssetsProductGroup::~CatalogsCreativeAssetsProductGroup()
{

}

void
CatalogsCreativeAssetsProductGroup::fromJson(std::string jsonObj)
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




        CatalogsCreativeAssetsProductGroupFilters* obj = &filters;
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

    const char *updated_atKey = "updated_at";

    if(object.has_key(updated_atKey))
    {
        bourne::json value = object[updated_atKey];



        jsonToValue(&updated_at, value, "int");


    }


}

bourne::json
CatalogsCreativeAssetsProductGroup::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_id"] = getCatalogId();






    object["catalog_type"] = getCatalogType();






    object["created_at"] = getCreatedAt();






    object["description"] = getDescription();







	object["filters"] = getFilters().toJson();





    object["id"] = getId();






    object["name"] = getName();






    object["updated_at"] = getUpdatedAt();



    return object;

}

std::string
CatalogsCreativeAssetsProductGroup::getCatalogId()
{
	return catalog_id;
}

void
CatalogsCreativeAssetsProductGroup::setCatalogId(std::string catalog_id)
{
	this->catalog_id = catalog_id;
}

std::string
CatalogsCreativeAssetsProductGroup::getCatalogType()
{
	return catalog_type;
}

void
CatalogsCreativeAssetsProductGroup::setCatalogType(std::string catalog_type)
{
	this->catalog_type = catalog_type;
}

int
CatalogsCreativeAssetsProductGroup::getCreatedAt()
{
	return created_at;
}

void
CatalogsCreativeAssetsProductGroup::setCreatedAt(int created_at)
{
	this->created_at = created_at;
}

std::string
CatalogsCreativeAssetsProductGroup::getDescription()
{
	return description;
}

void
CatalogsCreativeAssetsProductGroup::setDescription(std::string description)
{
	this->description = description;
}

CatalogsCreativeAssetsProductGroupFilters
CatalogsCreativeAssetsProductGroup::getFilters()
{
	return filters;
}

void
CatalogsCreativeAssetsProductGroup::setFilters(CatalogsCreativeAssetsProductGroupFilters filters)
{
	this->filters = filters;
}

std::string
CatalogsCreativeAssetsProductGroup::getId()
{
	return id;
}

void
CatalogsCreativeAssetsProductGroup::setId(std::string id)
{
	this->id = id;
}

std::string
CatalogsCreativeAssetsProductGroup::getName()
{
	return name;
}

void
CatalogsCreativeAssetsProductGroup::setName(std::string name)
{
	this->name = name;
}

int
CatalogsCreativeAssetsProductGroup::getUpdatedAt()
{
	return updated_at;
}

void
CatalogsCreativeAssetsProductGroup::setUpdatedAt(int updated_at)
{
	this->updated_at = updated_at;
}



