

#include "SupplementalItemValidationEvent.h"

using namespace Tiny;

SupplementalItemValidationEvent::SupplementalItemValidationEvent()
{
	attribute = std::string();
	code = int(0);
	message = std::string();
}

SupplementalItemValidationEvent::SupplementalItemValidationEvent(std::string jsonString)
{
	this->fromJson(jsonString);
}

SupplementalItemValidationEvent::~SupplementalItemValidationEvent()
{

}

void
SupplementalItemValidationEvent::fromJson(std::string jsonObj)
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
SupplementalItemValidationEvent::toJson()
{
    bourne::json object = bourne::json::object();





    object["attribute"] = getAttribute();






    object["code"] = getCode();






    object["message"] = getMessage();



    return object;

}

std::string
SupplementalItemValidationEvent::getAttribute()
{
	return attribute;
}

void
SupplementalItemValidationEvent::setAttribute(std::string attribute)
{
	this->attribute = attribute;
}

int
SupplementalItemValidationEvent::getCode()
{
	return code;
}

void
SupplementalItemValidationEvent::setCode(int code)
{
	this->code = code;
}

std::string
SupplementalItemValidationEvent::getMessage()
{
	return message;
}

void
SupplementalItemValidationEvent::setMessage(std::string message)
{
	this->message = message;
}



