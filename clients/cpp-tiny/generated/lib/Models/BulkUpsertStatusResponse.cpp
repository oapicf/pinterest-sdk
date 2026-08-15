

#include "BulkUpsertStatusResponse.h"

using namespace Tiny;

BulkUpsertStatusResponse::BulkUpsertStatusResponse()
{
	result_url = std::string();
	status = BulkUpsertStatus();
}

BulkUpsertStatusResponse::BulkUpsertStatusResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

BulkUpsertStatusResponse::~BulkUpsertStatusResponse()
{

}

void
BulkUpsertStatusResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *result_urlKey = "result_url";

    if(object.has_key(result_urlKey))
    {
        bourne::json value = object[result_urlKey];



        jsonToValue(&result_url, value, "std::string");


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        BulkUpsertStatus* obj = &status;
		obj->fromJson(value.dump());

    }


}

bourne::json
BulkUpsertStatusResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["result_url"] = getResultUrl();







	object["status"] = getStatus().toJson();


    return object;

}

std::string
BulkUpsertStatusResponse::getResultUrl()
{
	return result_url;
}

void
BulkUpsertStatusResponse::setResultUrl(std::string  result_url)
{
	this->result_url = result_url;
}

BulkUpsertStatus
BulkUpsertStatusResponse::getStatus()
{
	return status;
}

void
BulkUpsertStatusResponse::setStatus(BulkUpsertStatus  status)
{
	this->status = status;
}



