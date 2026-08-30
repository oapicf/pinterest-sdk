

#include "CatalogBinding.h"

using namespace Tiny;

CatalogBinding::CatalogBinding()
{
	catalog_type = std::string();
	id = std::string();
	name = std::string();
}

CatalogBinding::CatalogBinding(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogBinding::~CatalogBinding()
{

}

void
CatalogBinding::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *catalog_typeKey = "catalog_type";

    if(object.has_key(catalog_typeKey))
    {
        bourne::json value = object[catalog_typeKey];



        jsonToValue(&catalog_type, value, "std::string");


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


}

bourne::json
CatalogBinding::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_type"] = getCatalogType();






    object["id"] = getId();






    object["name"] = getName();



    return object;

}

std::string
CatalogBinding::getCatalogType()
{
	return catalog_type;
}

void
CatalogBinding::setCatalogType(std::string catalog_type)
{
	this->catalog_type = catalog_type;
}

std::string
CatalogBinding::getId()
{
	return id;
}

void
CatalogBinding::setId(std::string id)
{
	this->id = id;
}

std::string
CatalogBinding::getName()
{
	return name;
}

void
CatalogBinding::setName(std::string name)
{
	this->name = name;
}



