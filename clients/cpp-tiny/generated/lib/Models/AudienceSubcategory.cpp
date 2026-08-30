

#include "AudienceSubcategory.h"

using namespace Tiny;

AudienceSubcategory::AudienceSubcategory()
{
	id = std::string();
	index = float(0);
	key = std::string();
	name = std::string();
	ratio = float(0);
}

AudienceSubcategory::AudienceSubcategory(std::string jsonString)
{
	this->fromJson(jsonString);
}

AudienceSubcategory::~AudienceSubcategory()
{

}

void
AudienceSubcategory::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *indexKey = "index";

    if(object.has_key(indexKey))
    {
        bourne::json value = object[indexKey];



        jsonToValue(&index, value, "long");


    }

    const char *keyKey = "key";

    if(object.has_key(keyKey))
    {
        bourne::json value = object[keyKey];



        jsonToValue(&key, value, "std::string");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *ratioKey = "ratio";

    if(object.has_key(ratioKey))
    {
        bourne::json value = object[ratioKey];



        jsonToValue(&ratio, value, "long");


    }


}

bourne::json
AudienceSubcategory::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["index"] = getIndex();






    object["key"] = getKey();






    object["name"] = getName();






    object["ratio"] = getRatio();



    return object;

}

std::string
AudienceSubcategory::getId()
{
	return id;
}

void
AudienceSubcategory::setId(std::string id)
{
	this->id = id;
}

long
AudienceSubcategory::getIndex()
{
	return index;
}

void
AudienceSubcategory::setIndex(long index)
{
	this->index = index;
}

std::string
AudienceSubcategory::getKey()
{
	return key;
}

void
AudienceSubcategory::setKey(std::string key)
{
	this->key = key;
}

std::string
AudienceSubcategory::getName()
{
	return name;
}

void
AudienceSubcategory::setName(std::string name)
{
	this->name = name;
}

long
AudienceSubcategory::getRatio()
{
	return ratio;
}

void
AudienceSubcategory::setRatio(long ratio)
{
	this->ratio = ratio;
}



