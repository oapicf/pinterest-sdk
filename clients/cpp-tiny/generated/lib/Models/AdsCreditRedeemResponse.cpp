

#include "AdsCreditRedeemResponse.h"

using namespace Tiny;

AdsCreditRedeemResponse::AdsCreditRedeemResponse()
{
	errorCode = int(0);
	errorMessage = std::string();
	success = bool(false);
}

AdsCreditRedeemResponse::AdsCreditRedeemResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdsCreditRedeemResponse::~AdsCreditRedeemResponse()
{

}

void
AdsCreditRedeemResponse::fromJson(std::string jsonObj)
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
AdsCreditRedeemResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["errorCode"] = getErrorCode();






    object["errorMessage"] = getErrorMessage();






    object["success"] = isSuccess();



    return object;

}

int
AdsCreditRedeemResponse::getErrorCode()
{
	return errorCode;
}

void
AdsCreditRedeemResponse::setErrorCode(int  errorCode)
{
	this->errorCode = errorCode;
}

std::string
AdsCreditRedeemResponse::getErrorMessage()
{
	return errorMessage;
}

void
AdsCreditRedeemResponse::setErrorMessage(std::string  errorMessage)
{
	this->errorMessage = errorMessage;
}

bool
AdsCreditRedeemResponse::isSuccess()
{
	return success;
}

void
AdsCreditRedeemResponse::setSuccess(bool  success)
{
	this->success = success;
}



