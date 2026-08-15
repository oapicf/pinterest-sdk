

#include "SSIOAccountPMPName.h"

using namespace Tiny;

SSIOAccountPMPName::SSIOAccountPMPName()
{
	id = std::string();
	name = std::string();
}

SSIOAccountPMPName::SSIOAccountPMPName(std::string jsonString)
{
	this->fromJson(jsonString);
}

SSIOAccountPMPName::~SSIOAccountPMPName()
{

}

void
SSIOAccountPMPName::fromJson(std::string jsonObj)
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
SSIOAccountPMPName::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();



    return object;

}

std::string
SSIOAccountPMPName::getId()
{
	return id;
}

void
SSIOAccountPMPName::setId(std::string  id)
{
	this->id = id;
}

std::string
SSIOAccountPMPName::getName()
{
	return name;
}

void
SSIOAccountPMPName::setName(std::string  name)
{
	this->name = name;
}



