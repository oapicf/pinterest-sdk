

#include "AdPreviewCreateFromPin.h"

using namespace Tiny;

AdPreviewCreateFromPin::AdPreviewCreateFromPin()
{
	pin_id = std::string();
}

AdPreviewCreateFromPin::AdPreviewCreateFromPin(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdPreviewCreateFromPin::~AdPreviewCreateFromPin()
{

}

void
AdPreviewCreateFromPin::fromJson(std::string jsonObj)
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
AdPreviewCreateFromPin::toJson()
{
    bourne::json object = bourne::json::object();





    object["pin_id"] = getPinId();



    return object;

}

std::string
AdPreviewCreateFromPin::getPinId()
{
	return pin_id;
}

void
AdPreviewCreateFromPin::setPinId(std::string  pin_id)
{
	this->pin_id = pin_id;
}



