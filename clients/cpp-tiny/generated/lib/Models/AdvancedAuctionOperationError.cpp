

#include "AdvancedAuctionOperationError.h"

using namespace Tiny;

AdvancedAuctionOperationError::AdvancedAuctionOperationError()
{
	code = int(0);
	message = std::string();
}

AdvancedAuctionOperationError::AdvancedAuctionOperationError(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdvancedAuctionOperationError::~AdvancedAuctionOperationError()
{

}

void
AdvancedAuctionOperationError::fromJson(std::string jsonObj)
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
AdvancedAuctionOperationError::toJson()
{
    bourne::json object = bourne::json::object();





    object["code"] = getCode();






    object["message"] = getMessage();



    return object;

}

int
AdvancedAuctionOperationError::getCode()
{
	return code;
}

void
AdvancedAuctionOperationError::setCode(int  code)
{
	this->code = code;
}

std::string
AdvancedAuctionOperationError::getMessage()
{
	return message;
}

void
AdvancedAuctionOperationError::setMessage(std::string  message)
{
	this->message = message;
}



