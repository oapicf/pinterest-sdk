

#include "BulkDownload.h"

using namespace Tiny;

BulkDownload::BulkDownload()
{
	request_id = std::string();
}

BulkDownload::BulkDownload(std::string jsonString)
{
	this->fromJson(jsonString);
}

BulkDownload::~BulkDownload()
{

}

void
BulkDownload::fromJson(std::string jsonObj)
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
BulkDownload::toJson()
{
    bourne::json object = bourne::json::object();





    object["request_id"] = getRequestId();



    return object;

}

std::string
BulkDownload::getRequestId()
{
	return request_id;
}

void
BulkDownload::setRequestId(std::string request_id)
{
	this->request_id = request_id;
}



