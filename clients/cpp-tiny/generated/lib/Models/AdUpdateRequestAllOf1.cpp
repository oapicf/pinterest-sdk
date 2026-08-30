

#include "AdUpdateRequestAllOf1.h"

using namespace Tiny;

AdUpdateRequestAllOf1::AdUpdateRequestAllOf1()
{
	id = std::string();
	pin_id = std::string();
}

AdUpdateRequestAllOf1::AdUpdateRequestAllOf1(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdUpdateRequestAllOf1::~AdUpdateRequestAllOf1()
{

}

void
AdUpdateRequestAllOf1::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *pin_idKey = "pin_id";

    if(object.has_key(pin_idKey))
    {
        bourne::json value = object[pin_idKey];



        jsonToValue(&pin_id, value, "std::string");


    }


}

bourne::json
AdUpdateRequestAllOf1::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["pin_id"] = getPinId();



    return object;

}

std::string
AdUpdateRequestAllOf1::getId()
{
	return id;
}

void
AdUpdateRequestAllOf1::setId(std::string id)
{
	this->id = id;
}

std::string
AdUpdateRequestAllOf1::getPinId()
{
	return pin_id;
}

void
AdUpdateRequestAllOf1::setPinId(std::string pin_id)
{
	this->pin_id = pin_id;
}



