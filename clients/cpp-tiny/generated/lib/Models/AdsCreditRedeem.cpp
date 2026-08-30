

#include "AdsCreditRedeem.h"

using namespace Tiny;

AdsCreditRedeem::AdsCreditRedeem()
{
	errorCode = int(0);
	errorMessage = std::string();
	success = bool(false);
}

AdsCreditRedeem::AdsCreditRedeem(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdsCreditRedeem::~AdsCreditRedeem()
{

}

void
AdsCreditRedeem::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *errorCodeKey = "errorCode";

    if(object.has_key(errorCodeKey))
    {
        bourne::json value = object[errorCodeKey];



        jsonToValue(&errorCode, value, "int");


    }

    const char *errorMessageKey = "errorMessage";

    if(object.has_key(errorMessageKey))
    {
        bourne::json value = object[errorMessageKey];



        jsonToValue(&errorMessage, value, "std::string");


    }

    const char *successKey = "success";

    if(object.has_key(successKey))
    {
        bourne::json value = object[successKey];



        jsonToValue(&success, value, "bool");


    }


}

bourne::json
AdsCreditRedeem::toJson()
{
    bourne::json object = bourne::json::object();





    object["errorCode"] = getErrorCode();






    object["errorMessage"] = getErrorMessage();






    object["success"] = isSuccess();



    return object;

}

int
AdsCreditRedeem::getErrorCode()
{
	return errorCode;
}

void
AdsCreditRedeem::setErrorCode(int errorCode)
{
	this->errorCode = errorCode;
}

std::string
AdsCreditRedeem::getErrorMessage()
{
	return errorMessage;
}

void
AdsCreditRedeem::setErrorMessage(std::string errorMessage)
{
	this->errorMessage = errorMessage;
}

bool
AdsCreditRedeem::isSuccess()
{
	return success;
}

void
AdsCreditRedeem::setSuccess(bool success)
{
	this->success = success;
}



