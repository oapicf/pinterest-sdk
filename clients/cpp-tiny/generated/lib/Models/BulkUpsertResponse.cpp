

#include "BulkUpsertResponse.h"

using namespace Tiny;

BulkUpsertResponse::BulkUpsertResponse()
{
	request_id = std::string();
}

BulkUpsertResponse::BulkUpsertResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

BulkUpsertResponse::~BulkUpsertResponse()
{

}

void
BulkUpsertResponse::fromJson(std::string jsonObj)
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
BulkUpsertResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["request_id"] = getRequestId();



    return object;

}

std::string
BulkUpsertResponse::getRequestId()
{
	return request_id;
}

void
BulkUpsertResponse::setRequestId(std::string request_id)
{
	this->request_id = request_id;
}



