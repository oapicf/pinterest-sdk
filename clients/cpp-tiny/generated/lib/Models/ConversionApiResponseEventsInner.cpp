

#include "ConversionApiResponse_events_inner.h"

using namespace Tiny;

ConversionApiResponse_events_inner::ConversionApiResponse_events_inner()
{
	error_message = std::string();
	status = std::string();
	warning_message = std::string();
}

ConversionApiResponse_events_inner::ConversionApiResponse_events_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionApiResponse_events_inner::~ConversionApiResponse_events_inner()
{

}

void
ConversionApiResponse_events_inner::fromJson(std::string jsonObj)
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



        jsonToValue(&status, value, "std::string");


    }

    const char *warning_messageKey = "warning_message";

    if(object.has_key(warning_messageKey))
    {
        bourne::json value = object[warning_messageKey];



        jsonToValue(&warning_message, value, "std::string");


    }


}

bourne::json
ConversionApiResponse_events_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["error_message"] = getErrorMessage();






    object["status"] = getStatus();






    object["warning_message"] = getWarningMessage();



    return object;

}

std::string
ConversionApiResponse_events_inner::getErrorMessage()
{
	return error_message;
}

void
ConversionApiResponse_events_inner::setErrorMessage(std::string  error_message)
{
	this->error_message = error_message;
}

std::string
ConversionApiResponse_events_inner::getStatus()
{
	return status;
}

void
ConversionApiResponse_events_inner::setStatus(std::string  status)
{
	this->status = status;
}

std::string
ConversionApiResponse_events_inner::getWarningMessage()
{
	return warning_message;
}

void
ConversionApiResponse_events_inner::setWarningMessage(std::string  warning_message)
{
	this->warning_message = warning_message;
}



