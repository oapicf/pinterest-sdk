

#include "ErrorDetail.h"

using namespace Tiny;

ErrorDetail::ErrorDetail()
{
	count = int(0);
	error_code = int(0);
	message = std::string();
}

ErrorDetail::ErrorDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

ErrorDetail::~ErrorDetail()
{

}

void
ErrorDetail::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *countKey = "count";

    if(object.has_key(countKey))
    {
        bourne::json value = object[countKey];



        jsonToValue(&count, value, "int");


    }

    const char *error_codeKey = "error_code";

    if(object.has_key(error_codeKey))
    {
        bourne::json value = object[error_codeKey];



        jsonToValue(&error_code, value, "int");


    }

    const char *messageKey = "message";

    if(object.has_key(messageKey))
    {
        bourne::json value = object[messageKey];



        jsonToValue(&message, value, "std::string");


    }


}

bourne::json
ErrorDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["count"] = getCount();






    object["error_code"] = getErrorCode();






    object["message"] = getMessage();



    return object;

}

int
ErrorDetail::getCount()
{
	return count;
}

void
ErrorDetail::setCount(int  count)
{
	this->count = count;
}

int
ErrorDetail::getErrorCode()
{
	return error_code;
}

void
ErrorDetail::setErrorCode(int  error_code)
{
	this->error_code = error_code;
}

std::string
ErrorDetail::getMessage()
{
	return message;
}

void
ErrorDetail::setMessage(std::string  message)
{
	this->message = message;
}



