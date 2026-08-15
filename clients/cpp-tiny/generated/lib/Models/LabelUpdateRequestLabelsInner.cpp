

#include "LabelUpdateRequest_labels_inner.h"

using namespace Tiny;

LabelUpdateRequest_labels_inner::LabelUpdateRequest_labels_inner()
{
	id = std::string();
	status = LabelStatus();
	value = std::string();
}

LabelUpdateRequest_labels_inner::LabelUpdateRequest_labels_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

LabelUpdateRequest_labels_inner::~LabelUpdateRequest_labels_inner()
{

}

void
LabelUpdateRequest_labels_inner::fromJson(std::string jsonObj)
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




        LabelStatus* obj = &status;
		obj->fromJson(value.dump());

    }

    const char *valueKey = "value";

    if(object.has_key(valueKey))
    {
        bourne::json value = object[valueKey];



        jsonToValue(&value, value, "std::string");


    }


}

bourne::json
LabelUpdateRequest_labels_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();







	object["status"] = getStatus().toJson();





    object["value"] = getValue();



    return object;

}

std::string
LabelUpdateRequest_labels_inner::getId()
{
	return id;
}

void
LabelUpdateRequest_labels_inner::setId(std::string  id)
{
	this->id = id;
}

LabelStatus
LabelUpdateRequest_labels_inner::getStatus()
{
	return status;
}

void
LabelUpdateRequest_labels_inner::setStatus(LabelStatus  status)
{
	this->status = status;
}

std::string
LabelUpdateRequest_labels_inner::getValue()
{
	return value;
}

void
LabelUpdateRequest_labels_inner::setValue(std::string  value)
{
	this->value = value;
}



