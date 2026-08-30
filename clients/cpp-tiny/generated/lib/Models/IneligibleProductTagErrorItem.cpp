

#include "IneligibleProductTagErrorItem.h"

using namespace Tiny;

IneligibleProductTagErrorItem::IneligibleProductTagErrorItem()
{
	error_message = null;
	pin_id = std::string();
}

IneligibleProductTagErrorItem::IneligibleProductTagErrorItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

IneligibleProductTagErrorItem::~IneligibleProductTagErrorItem()
{

}

void
IneligibleProductTagErrorItem::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *error_messageKey = "error_message";

    if(object.has_key(error_messageKey))
    {
        bourne::json value = object[error_messageKey];




        IneligibleProductTagReason* obj = &error_message;
		obj->fromJson(value.dump());

    }

    const char *pin_idKey = "pin_id";

    if(object.has_key(pin_idKey))
    {
        bourne::json value = object[pin_idKey];



        jsonToValue(&pin_id, value, "std::string");


    }


}

bourne::json
IneligibleProductTagErrorItem::toJson()
{
    bourne::json object = bourne::json::object();






	object["error_message"] = getErrorMessage().toJson();





    object["pin_id"] = getPinId();



    return object;

}

IneligibleProductTagReason
IneligibleProductTagErrorItem::getErrorMessage()
{
	return error_message;
}

void
IneligibleProductTagErrorItem::setErrorMessage(IneligibleProductTagReason error_message)
{
	this->error_message = error_message;
}

std::string
IneligibleProductTagErrorItem::getPinId()
{
	return pin_id;
}

void
IneligibleProductTagErrorItem::setPinId(std::string pin_id)
{
	this->pin_id = pin_id;
}



