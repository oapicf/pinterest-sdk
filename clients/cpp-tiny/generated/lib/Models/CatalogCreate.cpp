

#include "CatalogCreate.h"

using namespace Tiny;

CatalogCreate::CatalogCreate()
{
	catalog_type = CatalogsType();
	name = std::string();
}

CatalogCreate::CatalogCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogCreate::~CatalogCreate()
{

}

void
CatalogCreate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *catalog_typeKey = "catalog_type";

    if(object.has_key(catalog_typeKey))
    {
        bourne::json value = object[catalog_typeKey];




        CatalogsType* obj = &catalog_type;
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
CatalogCreate::toJson()
{
    bourne::json object = bourne::json::object();






	object["catalog_type"] = getCatalogType().toJson();





    object["name"] = getName();



    return object;

}

CatalogsType
CatalogCreate::getCatalogType()
{
	return catalog_type;
}

void
CatalogCreate::setCatalogType(CatalogsType catalog_type)
{
	this->catalog_type = catalog_type;
}

std::string
CatalogCreate::getName()
{
	return name;
}

void
CatalogCreate::setName(std::string name)
{
	this->name = name;
}



