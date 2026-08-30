

#include "Catalog.h"

using namespace Tiny;

Catalog::Catalog()
{
	catalog_type = CatalogsType();
	created_at = std::string();
	id = std::string();
	name = std::string();
	updated_at = std::string();
}

Catalog::Catalog(std::string jsonString)
{
	this->fromJson(jsonString);
}

Catalog::~Catalog()
{

}

void
Catalog::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *catalog_typeKey = "catalog_type";

    if(object.has_key(catalog_typeKey))
    {
        bourne::json value = object[catalog_typeKey];




        CatalogsType* obj = &catalog_type;
		obj->fromJson(value.dump());

    }

    const char *created_atKey = "created_at";

    if(object.has_key(created_atKey))
    {
        bourne::json value = object[created_atKey];



        jsonToValue(&created_at, value, "std::string");


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



        jsonToValue(&updated_at, value, "std::string");


    }


}

bourne::json
Catalog::toJson()
{
    bourne::json object = bourne::json::object();






	object["catalog_type"] = getCatalogType().toJson();





    object["created_at"] = getCreatedAt();






    object["id"] = getId();






    object["name"] = getName();






    object["updated_at"] = getUpdatedAt();



    return object;

}

CatalogsType
Catalog::getCatalogType()
{
	return catalog_type;
}

void
Catalog::setCatalogType(CatalogsType catalog_type)
{
	this->catalog_type = catalog_type;
}

std::string
Catalog::getCreatedAt()
{
	return created_at;
}

void
Catalog::setCreatedAt(std::string created_at)
{
	this->created_at = created_at;
}

std::string
Catalog::getId()
{
	return id;
}

void
Catalog::setId(std::string id)
{
	this->id = id;
}

std::string
Catalog::getName()
{
	return name;
}

void
Catalog::setName(std::string name)
{
	this->name = name;
}

std::string
Catalog::getUpdatedAt()
{
	return updated_at;
}

void
Catalog::setUpdatedAt(std::string updated_at)
{
	this->updated_at = updated_at;
}



