

#include "ItemValidationEvent.h"

using namespace Tiny;

ItemValidationEvent::ItemValidationEvent()
{
	attribute = std::string();
	code = int(0);
	message = std::string();
}

ItemValidationEvent::ItemValidationEvent(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemValidationEvent::~ItemValidationEvent()
{

}

void
ItemValidationEvent::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *attributeKey = "attribute";

    if(object.has_key(attributeKey))
    {
        bourne::json value = object[attributeKey];



        jsonToValue(&attribute, value, "std::string");


    }

    const char *codeKey = "code";

    if(object.has_key(codeKey))
    {
        bourne::json value = object[codeKey];



        jsonToValue(&code, value, "int");


    }

    const char *messageKey = "message";

    if(object.has_key(messageKey))
    {
        bourne::json value = object[messageKey];



        jsonToValue(&message, value, "std::string");


    }


}

bourne::json
ItemValidationEvent::toJson()
{
    bourne::json object = bourne::json::object();





    object["attribute"] = getAttribute();






    object["code"] = getCode();






    object["message"] = getMessage();



    return object;

}

std::string
ItemValidationEvent::getAttribute()
{
	return attribute;
}

void
ItemValidationEvent::setAttribute(std::string attribute)
{
	this->attribute = attribute;
}

int
ItemValidationEvent::getCode()
{
	return code;
}

void
ItemValidationEvent::setCode(int code)
{
	this->code = code;
}

std::string
ItemValidationEvent::getMessage()
{
	return message;
}

void
ItemValidationEvent::setMessage(std::string message)
{
	this->message = message;
}



