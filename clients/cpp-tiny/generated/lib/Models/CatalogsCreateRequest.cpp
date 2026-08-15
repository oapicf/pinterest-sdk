

#include "CatalogsCreateRequest.h"

using namespace Tiny;

CatalogsCreateRequest::CatalogsCreateRequest()
{
	catalog_type = CatalogsType();
	name = std::string();
}

CatalogsCreateRequest::CatalogsCreateRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsCreateRequest::~CatalogsCreateRequest()
{

}

void
CatalogsCreateRequest::fromJson(std::string jsonObj)
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
CatalogsCreateRequest::toJson()
{
    bourne::json object = bourne::json::object();






	object["catalog_type"] = getCatalogType().toJson();





    object["name"] = getName();



    return object;

}

CatalogsType
CatalogsCreateRequest::getCatalogType()
{
	return catalog_type;
}

void
CatalogsCreateRequest::setCatalogType(CatalogsType  catalog_type)
{
	this->catalog_type = catalog_type;
}

std::string
CatalogsCreateRequest::getName()
{
	return name;
}

void
CatalogsCreateRequest::setName(std::string  name)
{
	this->name = name;
}



