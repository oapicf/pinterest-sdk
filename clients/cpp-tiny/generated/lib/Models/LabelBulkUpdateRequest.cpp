

#include "LabelBulkUpdateRequest.h"

using namespace Tiny;

LabelBulkUpdateRequest::LabelBulkUpdateRequest()
{
	id = std::string();
	status = std::string();
	value = std::string();
}

LabelBulkUpdateRequest::LabelBulkUpdateRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

LabelBulkUpdateRequest::~LabelBulkUpdateRequest()
{

}

void
LabelBulkUpdateRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];



        jsonToValue(&status, value, "std::string");


    }

    const char *valueKey = "value";

    if(object.has_key(valueKey))
    {
        bourne::json value = object[valueKey];



        jsonToValue(&value, value, "std::string");


    }


}

bourne::json
LabelBulkUpdateRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["status"] = getStatus();






    object["value"] = getValue();



    return object;

}

std::string
LabelBulkUpdateRequest::getId()
{
	return id;
}

void
LabelBulkUpdateRequest::setId(std::string  id)
{
	this->id = id;
}

std::string
LabelBulkUpdateRequest::getStatus()
{
	return status;
}

void
LabelBulkUpdateRequest::setStatus(std::string  status)
{
	this->status = status;
}

std::string
LabelBulkUpdateRequest::getValue()
{
	return value;
}

void
LabelBulkUpdateRequest::setValue(std::string  value)
{
	this->value = value;
}



