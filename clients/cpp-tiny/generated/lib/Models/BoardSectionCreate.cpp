

#include "BoardSectionCreate.h"

using namespace Tiny;

BoardSectionCreate::BoardSectionCreate()
{
	id = std::string();
	name = std::string();
}

BoardSectionCreate::BoardSectionCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

BoardSectionCreate::~BoardSectionCreate()
{

}

void
BoardSectionCreate::fromJson(std::string jsonObj)
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
BoardSectionCreate::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();



    return object;

}

std::string
BoardSectionCreate::getId()
{
	return id;
}

void
BoardSectionCreate::setId(std::string id)
{
	this->id = id;
}

std::string
BoardSectionCreate::getName()
{
	return name;
}

void
BoardSectionCreate::setName(std::string name)
{
	this->name = name;
}



