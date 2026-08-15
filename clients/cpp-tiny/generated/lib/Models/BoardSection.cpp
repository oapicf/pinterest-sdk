

#include "BoardSection.h"

using namespace Tiny;

BoardSection::BoardSection()
{
	id = std::string();
	name = std::string();
}

BoardSection::BoardSection(std::string jsonString)
{
	this->fromJson(jsonString);
}

BoardSection::~BoardSection()
{

}

void
BoardSection::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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
BoardSection::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();



    return object;

}

std::string
BoardSection::getId()
{
	return id;
}

void
BoardSection::setId(std::string  id)
{
	this->id = id;
}

std::string
BoardSection::getName()
{
	return name;
}

void
BoardSection::setName(std::string  name)
{
	this->name = name;
}



