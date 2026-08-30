

#include "DynamicTitlesProcessCSVCreate.h"

using namespace Tiny;

DynamicTitlesProcessCSVCreate::DynamicTitlesProcessCSVCreate()
{
	request_id = std::string();
}

DynamicTitlesProcessCSVCreate::DynamicTitlesProcessCSVCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

DynamicTitlesProcessCSVCreate::~DynamicTitlesProcessCSVCreate()
{

}

void
DynamicTitlesProcessCSVCreate::fromJson(std::string jsonObj)
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
DynamicTitlesProcessCSVCreate::toJson()
{
    bourne::json object = bourne::json::object();





    object["request_id"] = getRequestId();



    return object;

}

std::string
DynamicTitlesProcessCSVCreate::getRequestId()
{
	return request_id;
}

void
DynamicTitlesProcessCSVCreate::setRequestId(std::string request_id)
{
	this->request_id = request_id;
}



