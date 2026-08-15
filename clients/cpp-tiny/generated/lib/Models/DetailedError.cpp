

#include "DetailedError.h"

using namespace Tiny;

DetailedError::DetailedError()
{
	code = int(0);
	details = null;
	message = std::string();
}

DetailedError::DetailedError(std::string jsonString)
{
	this->fromJson(jsonString);
}

DetailedError::~DetailedError()
{

}

void
DetailedError::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *codeKey = "code";

    if(object.has_key(codeKey))
    {
        bourne::json value = object[codeKey];



        jsonToValue(&code, value, "int");


    }

    const char *detailsKey = "details";

    if(object.has_key(detailsKey))
    {
        bourne::json value = object[detailsKey];




        Object* obj = &details;
		obj->fromJson(value.dump());

    }

    const char *messageKey = "message";

    if(object.has_key(messageKey))
    {
        bourne::json value = object[messageKey];



        jsonToValue(&message, value, "std::string");


    }


}

bourne::json
DetailedError::toJson()
{
    bourne::json object = bourne::json::object();





    object["code"] = getCode();







	object["details"] = getDetails().toJson();





    object["message"] = getMessage();



    return object;

}

int
DetailedError::getCode()
{
	return code;
}

void
DetailedError::setCode(int  code)
{
	this->code = code;
}

Object
DetailedError::getDetails()
{
	return details;
}

void
DetailedError::setDetails(Object  details)
{
	this->details = details;
}

std::string
DetailedError::getMessage()
{
	return message;
}

void
DetailedError::setMessage(std::string  message)
{
	this->message = message;
}



