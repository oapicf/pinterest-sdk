

#include "LabelErrorData.h"

using namespace Tiny;

LabelErrorData::LabelErrorData()
{
	id = null;
	label_type = NullableLabelType();
	status = NullableLabelStatus();
	value = std::string();
}

LabelErrorData::LabelErrorData(std::string jsonString)
{
	this->fromJson(jsonString);
}

LabelErrorData::~LabelErrorData()
{

}

void
LabelErrorData::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *label_typeKey = "label_type";

    if(object.has_key(label_typeKey))
    {
        bourne::json value = object[label_typeKey];




        NullableLabelType* obj = &label_type;
		obj->fromJson(value.dump());

    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        NullableLabelStatus* obj = &status;
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
LabelErrorData::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();







	object["label_type"] = getLabelType().toJson();






	object["status"] = getStatus().toJson();





    object["value"] = getValue();



    return object;

}

std::string
LabelErrorData::getId()
{
	return id;
}

void
LabelErrorData::setId(std::string id)
{
	this->id = id;
}

NullableLabelType
LabelErrorData::getLabelType()
{
	return label_type;
}

void
LabelErrorData::setLabelType(NullableLabelType label_type)
{
	this->label_type = label_type;
}

NullableLabelStatus
LabelErrorData::getStatus()
{
	return status;
}

void
LabelErrorData::setStatus(NullableLabelStatus status)
{
	this->status = status;
}

std::string
LabelErrorData::getValue()
{
	return value;
}

void
LabelErrorData::setValue(std::string value)
{
	this->value = value;
}



