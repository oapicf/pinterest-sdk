

#include "LabelUpdateItem.h"

using namespace Tiny;

LabelUpdateItem::LabelUpdateItem()
{
	id = null;
	status = LabelStatus();
	value = std::string();
}

LabelUpdateItem::LabelUpdateItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

LabelUpdateItem::~LabelUpdateItem()
{

}

void
LabelUpdateItem::fromJson(std::string jsonObj)
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
LabelUpdateItem::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();







	object["status"] = getStatus().toJson();





    object["value"] = getValue();



    return object;

}

std::string
LabelUpdateItem::getId()
{
	return id;
}

void
LabelUpdateItem::setId(std::string id)
{
	this->id = id;
}

LabelStatus
LabelUpdateItem::getStatus()
{
	return status;
}

void
LabelUpdateItem::setStatus(LabelStatus status)
{
	this->status = status;
}

std::string
LabelUpdateItem::getValue()
{
	return value;
}

void
LabelUpdateItem::setValue(std::string value)
{
	this->value = value;
}



