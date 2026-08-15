

#include "BulkDownloadResponse.h"

using namespace Tiny;

BulkDownloadResponse::BulkDownloadResponse()
{
	request_id = std::string();
}

BulkDownloadResponse::BulkDownloadResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

BulkDownloadResponse::~BulkDownloadResponse()
{

}

void
BulkDownloadResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *request_idKey = "request_id";

    if(object.has_key(request_idKey))
    {
        bourne::json value = object[request_idKey];



        jsonToValue(&request_id, value, "std::string");


    }


}

bourne::json
BulkDownloadResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["request_id"] = getRequestId();



    return object;

}

std::string
BulkDownloadResponse::getRequestId()
{
	return request_id;
}

void
BulkDownloadResponse::setRequestId(std::string  request_id)
{
	this->request_id = request_id;
}



