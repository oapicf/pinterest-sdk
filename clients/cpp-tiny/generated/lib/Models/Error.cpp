

#include "Error.h"

using namespace Tiny;

Error::Error()
{
	code = int(0);
	message = std::string();
}

Error::Error(std::string jsonString)
{
	this->fromJson(jsonString);
}

Error::~Error()
{

}

void
Error::fromJson(std::string jsonObj)
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
Error::toJson()
{
    bourne::json object = bourne::json::object();





    object["code"] = getCode();






    object["message"] = getMessage();



    return object;

}

int
Error::getCode()
{
	return code;
}

void
Error::setCode(int  code)
{
	this->code = code;
}

std::string
Error::getMessage()
{
	return message;
}

void
Error::setMessage(std::string  message)
{
	this->message = message;
}



