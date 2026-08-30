

#include "BoardSectionUpdateWithRequiredBody.h"

using namespace Tiny;

BoardSectionUpdateWithRequiredBody::BoardSectionUpdateWithRequiredBody()
{
	id = std::string();
	name = std::string();
}

BoardSectionUpdateWithRequiredBody::BoardSectionUpdateWithRequiredBody(std::string jsonString)
{
	this->fromJson(jsonString);
}

BoardSectionUpdateWithRequiredBody::~BoardSectionUpdateWithRequiredBody()
{

}

void
BoardSectionUpdateWithRequiredBody::fromJson(std::string jsonObj)
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
BoardSectionUpdateWithRequiredBody::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();



    return object;

}

std::string
BoardSectionUpdateWithRequiredBody::getId()
{
	return id;
}

void
BoardSectionUpdateWithRequiredBody::setId(std::string id)
{
	this->id = id;
}

std::string
BoardSectionUpdateWithRequiredBody::getName()
{
	return name;
}

void
BoardSectionUpdateWithRequiredBody::setName(std::string name)
{
	this->name = name;
}



