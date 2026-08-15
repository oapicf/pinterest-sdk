

#include "GetBusinessAssetsResponse_catalog_info.h"

using namespace Tiny;

GetBusinessAssetsResponse_catalog_info::GetBusinessAssetsResponse_catalog_info()
{
	catalog_type = std::string();
	id = std::string();
	name = std::string();
}

GetBusinessAssetsResponse_catalog_info::GetBusinessAssetsResponse_catalog_info(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetBusinessAssetsResponse_catalog_info::~GetBusinessAssetsResponse_catalog_info()
{

}

void
GetBusinessAssetsResponse_catalog_info::fromJson(std::string jsonObj)
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
GetBusinessAssetsResponse_catalog_info::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_type"] = getCatalogType();






    object["id"] = getId();






    object["name"] = getName();



    return object;

}

std::string
GetBusinessAssetsResponse_catalog_info::getCatalogType()
{
	return catalog_type;
}

void
GetBusinessAssetsResponse_catalog_info::setCatalogType(std::string  catalog_type)
{
	this->catalog_type = catalog_type;
}

std::string
GetBusinessAssetsResponse_catalog_info::getId()
{
	return id;
}

void
GetBusinessAssetsResponse_catalog_info::setId(std::string  id)
{
	this->id = id;
}

std::string
GetBusinessAssetsResponse_catalog_info::getName()
{
	return name;
}

void
GetBusinessAssetsResponse_catalog_info::setName(std::string  name)
{
	this->name = name;
}



