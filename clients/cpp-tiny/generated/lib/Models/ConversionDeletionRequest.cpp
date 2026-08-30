

#include "ConversionDeletionRequest.h"

using namespace Tiny;

ConversionDeletionRequest::ConversionDeletionRequest()
{
	created_time = std::string();
	processed_time = std::string();
	request_id = std::string();
	status = null;
}

ConversionDeletionRequest::ConversionDeletionRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionDeletionRequest::~ConversionDeletionRequest()
{

}

void
ConversionDeletionRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *created_timeKey = "created_time";

    if(object.has_key(created_timeKey))
    {
        bourne::json value = object[created_timeKey];




        Date* obj = &created_time;
		obj->fromJson(value.dump());

    }

    const char *processed_timeKey = "processed_time";

    if(object.has_key(processed_timeKey))
    {
        bourne::json value = object[processed_timeKey];




        Date* obj = &processed_time;
		obj->fromJson(value.dump());

    }

    const char *request_idKey = "request_id";

    if(object.has_key(request_idKey))
    {
        bourne::json value = object[request_idKey];



        jsonToValue(&request_id, value, "std::string");


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        ConversionDeletionRequestStatus* obj = &status;
		obj->fromJson(value.dump());

    }


}

bourne::json
ConversionDeletionRequest::toJson()
{
    bourne::json object = bourne::json::object();






	object["created_time"] = getCreatedTime().toJson();






	object["processed_time"] = getProcessedTime().toJson();





    object["request_id"] = getRequestId();







	object["status"] = getStatus().toJson();


    return object;

}

Date
ConversionDeletionRequest::getCreatedTime()
{
	return created_time;
}

void
ConversionDeletionRequest::setCreatedTime(Date created_time)
{
	this->created_time = created_time;
}

Date
ConversionDeletionRequest::getProcessedTime()
{
	return processed_time;
}

void
ConversionDeletionRequest::setProcessedTime(Date processed_time)
{
	this->processed_time = processed_time;
}

std::string
ConversionDeletionRequest::getRequestId()
{
	return request_id;
}

void
ConversionDeletionRequest::setRequestId(std::string request_id)
{
	this->request_id = request_id;
}

ConversionDeletionRequestStatus
ConversionDeletionRequest::getStatus()
{
	return status;
}

void
ConversionDeletionRequest::setStatus(ConversionDeletionRequestStatus status)
{
	this->status = status;
}



