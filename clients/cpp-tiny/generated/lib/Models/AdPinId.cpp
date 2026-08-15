

#include "AdPinId.h"

using namespace Tiny;

AdPinId::AdPinId()
{
	pin_id = std::string();
}

AdPinId::AdPinId(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdPinId::~AdPinId()
{

}

void
AdPinId::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pin_idKey = "pin_id";

    if(object.has_key(pin_idKey))
    {
        bourne::json value = object[pin_idKey];



        jsonToValue(&pin_id, value, "std::string");


    }


}

bourne::json
AdPinId::toJson()
{
    bourne::json object = bourne::json::object();





    object["pin_id"] = getPinId();



    return object;

}

std::string
AdPinId::getPinId()
{
	return pin_id;
}

void
AdPinId::setPinId(std::string  pin_id)
{
	this->pin_id = pin_id;
}



