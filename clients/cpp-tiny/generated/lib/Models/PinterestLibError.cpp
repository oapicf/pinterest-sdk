

#include "Pinterest.Lib.Error.h"

using namespace Tiny;

Pinterest.Lib.Error::Pinterest.Lib.Error()
{
	code = int(0);
	message = std::string();
}

Pinterest.Lib.Error::Pinterest.Lib.Error(std::string jsonString)
{
	this->fromJson(jsonString);
}

Pinterest.Lib.Error::~Pinterest.Lib.Error()
{

}

void
Pinterest.Lib.Error::fromJson(std::string jsonObj)
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
Pinterest.Lib.Error::toJson()
{
    bourne::json object = bourne::json::object();





    object["code"] = getCode();






    object["message"] = getMessage();



    return object;

}

int
Pinterest.Lib.Error::getCode()
{
	return code;
}

void
Pinterest.Lib.Error::setCode(int code)
{
	this->code = code;
}

std::string
Pinterest.Lib.Error::getMessage()
{
	return message;
}

void
Pinterest.Lib.Error::setMessage(std::string message)
{
	this->message = message;
}



