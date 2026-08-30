

#include "ProductTagsError.h"

using namespace Tiny;

ProductTagsError::ProductTagsError()
{
	code = int(0);
	details = null;
	message = std::string();
}

ProductTagsError::ProductTagsError(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProductTagsError::~ProductTagsError()
{

}

void
ProductTagsError::fromJson(std::string jsonObj)
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




        IneligibleProductTagsErrorDetails* obj = &details;
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
ProductTagsError::toJson()
{
    bourne::json object = bourne::json::object();





    object["code"] = getCode();







	object["details"] = getDetails().toJson();





    object["message"] = getMessage();



    return object;

}

int
ProductTagsError::getCode()
{
	return code;
}

void
ProductTagsError::setCode(int code)
{
	this->code = code;
}

IneligibleProductTagsErrorDetails
ProductTagsError::getDetails()
{
	return details;
}

void
ProductTagsError::setDetails(IneligibleProductTagsErrorDetails details)
{
	this->details = details;
}

std::string
ProductTagsError::getMessage()
{
	return message;
}

void
ProductTagsError::setMessage(std::string message)
{
	this->message = message;
}



