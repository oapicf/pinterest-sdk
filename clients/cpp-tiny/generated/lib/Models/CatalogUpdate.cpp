

#include "CatalogUpdate.h"

using namespace Tiny;

CatalogUpdate::CatalogUpdate()
{
	catalog_type = CatalogsType();
	name = std::string();
}

CatalogUpdate::CatalogUpdate(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogUpdate::~CatalogUpdate()
{

}

void
CatalogUpdate::fromJson(std::string jsonObj)
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
CatalogUpdate::toJson()
{
    bourne::json object = bourne::json::object();






	object["catalog_type"] = getCatalogType().toJson();





    object["name"] = getName();



    return object;

}

CatalogsType
CatalogUpdate::getCatalogType()
{
	return catalog_type;
}

void
CatalogUpdate::setCatalogType(CatalogsType catalog_type)
{
	this->catalog_type = catalog_type;
}

std::string
CatalogUpdate::getName()
{
	return name;
}

void
CatalogUpdate::setName(std::string name)
{
	this->name = name;
}



