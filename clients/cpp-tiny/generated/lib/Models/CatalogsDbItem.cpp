

#include "CatalogsDbItem.h"

using namespace Tiny;

CatalogsDbItem::CatalogsDbItem()
{
	created_at = std::string();
	id = std::string();
	updated_at = std::string();
}

CatalogsDbItem::CatalogsDbItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsDbItem::~CatalogsDbItem()
{

}

void
CatalogsDbItem::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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

    const char *updated_atKey = "updated_at";

    if(object.has_key(updated_atKey))
    {
        bourne::json value = object[updated_atKey];



        jsonToValue(&updated_at, value, "std::string");


    }


}

bourne::json
CatalogsDbItem::toJson()
{
    bourne::json object = bourne::json::object();





    object["created_at"] = getCreatedAt();






    object["id"] = getId();






    object["updated_at"] = getUpdatedAt();



    return object;

}

std::string
CatalogsDbItem::getCreatedAt()
{
	return created_at;
}

void
CatalogsDbItem::setCreatedAt(std::string  created_at)
{
	this->created_at = created_at;
}

std::string
CatalogsDbItem::getId()
{
	return id;
}

void
CatalogsDbItem::setId(std::string  id)
{
	this->id = id;
}

std::string
CatalogsDbItem::getUpdatedAt()
{
	return updated_at;
}

void
CatalogsDbItem::setUpdatedAt(std::string  updated_at)
{
	this->updated_at = updated_at;
}



