

#include "BusinessAccessError.h"

using namespace Tiny;

BusinessAccessError::BusinessAccessError()
{
	code = int(0);
	message = std::string();
}

BusinessAccessError::BusinessAccessError(std::string jsonString)
{
	this->fromJson(jsonString);
}

BusinessAccessError::~BusinessAccessError()
{

}

void
BusinessAccessError::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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
BusinessAccessError::toJson()
{
    bourne::json object = bourne::json::object();





    object["code"] = getCode();






    object["message"] = getMessage();



    return object;

}

int
BusinessAccessError::getCode()
{
	return code;
}

void
BusinessAccessError::setCode(int  code)
{
	this->code = code;
}

std::string
BusinessAccessError::getMessage()
{
	return message;
}

void
BusinessAccessError::setMessage(std::string  message)
{
	this->message = message;
}



