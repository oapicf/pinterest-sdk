

#include "ConversionApiResponseEventsItems.h"

using namespace Tiny;

ConversionApiResponseEventsItems::ConversionApiResponseEventsItems()
{
	error_message = std::string();
	status = null;
	warning_message = std::string();
}

ConversionApiResponseEventsItems::ConversionApiResponseEventsItems(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionApiResponseEventsItems::~ConversionApiResponseEventsItems()
{

}

void
ConversionApiResponseEventsItems::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *error_messageKey = "error_message";

    if(object.has_key(error_messageKey))
    {
        bourne::json value = object[error_messageKey];



        jsonToValue(&error_message, value, "std::string");


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        EventProcessingStatus* obj = &status;
		obj->fromJson(value.dump());

    }

    const char *warning_messageKey = "warning_message";

    if(object.has_key(warning_messageKey))
    {
        bourne::json value = object[warning_messageKey];



        jsonToValue(&warning_message, value, "std::string");


    }


}

bourne::json
ConversionApiResponseEventsItems::toJson()
{
    bourne::json object = bourne::json::object();





    object["error_message"] = getErrorMessage();







	object["status"] = getStatus().toJson();





    object["warning_message"] = getWarningMessage();



    return object;

}

std::string
ConversionApiResponseEventsItems::getErrorMessage()
{
	return error_message;
}

void
ConversionApiResponseEventsItems::setErrorMessage(std::string error_message)
{
	this->error_message = error_message;
}

EventProcessingStatus
ConversionApiResponseEventsItems::getStatus()
{
	return status;
}

void
ConversionApiResponseEventsItems::setStatus(EventProcessingStatus status)
{
	this->status = status;
}

std::string
ConversionApiResponseEventsItems::getWarningMessage()
{
	return warning_message;
}

void
ConversionApiResponseEventsItems::setWarningMessage(std::string warning_message)
{
	this->warning_message = warning_message;
}



