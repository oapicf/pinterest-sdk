

#include "Pinterest.Lib.BatchItemException.h"

using namespace Tiny;

Pinterest.Lib.BatchItemException::Pinterest.Lib.BatchItemException()
{
	code = int(0);
	message = std::string();
}

Pinterest.Lib.BatchItemException::Pinterest.Lib.BatchItemException(std::string jsonString)
{
	this->fromJson(jsonString);
}

Pinterest.Lib.BatchItemException::~Pinterest.Lib.BatchItemException()
{

}

void
Pinterest.Lib.BatchItemException::fromJson(std::string jsonObj)
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
Pinterest.Lib.BatchItemException::toJson()
{
    bourne::json object = bourne::json::object();





    object["code"] = getCode();






    object["message"] = getMessage();



    return object;

}

int
Pinterest.Lib.BatchItemException::getCode()
{
	return code;
}

void
Pinterest.Lib.BatchItemException::setCode(int code)
{
	this->code = code;
}

std::string
Pinterest.Lib.BatchItemException::getMessage()
{
	return message;
}

void
Pinterest.Lib.BatchItemException::setMessage(std::string message)
{
	this->message = message;
}



