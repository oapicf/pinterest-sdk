

#include "Interest.h"

using namespace Tiny;

Interest::Interest()
{
	canonical_url = std::string();
	id = std::string();
	key = std::string();
	name = std::string();
}

Interest::Interest(std::string jsonString)
{
	this->fromJson(jsonString);
}

Interest::~Interest()
{

}

void
Interest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *canonical_urlKey = "canonical_url";

    if(object.has_key(canonical_urlKey))
    {
        bourne::json value = object[canonical_urlKey];



        jsonToValue(&canonical_url, value, "std::string");


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


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


}

bourne::json
Interest::toJson()
{
    bourne::json object = bourne::json::object();





    object["canonical_url"] = getCanonicalUrl();






    object["id"] = getId();






    object["key"] = getKey();






    object["name"] = getName();



    return object;

}

std::string
Interest::getCanonicalUrl()
{
	return canonical_url;
}

void
Interest::setCanonicalUrl(std::string canonical_url)
{
	this->canonical_url = canonical_url;
}

std::string
Interest::getId()
{
	return id;
}

void
Interest::setId(std::string id)
{
	this->id = id;
}

std::string
Interest::getKey()
{
	return key;
}

void
Interest::setKey(std::string key)
{
	this->key = key;
}

std::string
Interest::getName()
{
	return name;
}

void
Interest::setName(std::string name)
{
	this->name = name;
}



