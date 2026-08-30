

#include "Exception.h"

using namespace Tiny;

Exception::Exception()
{
	code = int(0);
	message = std::string();
}

Exception::Exception(std::string jsonString)
{
	this->fromJson(jsonString);
}

Exception::~Exception()
{

}

void
Exception::fromJson(std::string jsonObj)
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
Exception::toJson()
{
    bourne::json object = bourne::json::object();





    object["code"] = getCode();






    object["message"] = getMessage();



    return object;

}

int
Exception::getCode()
{
	return code;
}

void
Exception::setCode(int code)
{
	this->code = code;
}

std::string
Exception::getMessage()
{
	return message;
}

void
Exception::setMessage(std::string message)
{
	this->message = message;
}



