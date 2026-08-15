

#include "Label.h"

using namespace Tiny;

Label::Label()
{
	id = std::string();
	label_type = LabelType();
	parent_id = std::string();
	parent_type = std::string();
	status = LabelStatus();
	value = std::string();
}

Label::Label(std::string jsonString)
{
	this->fromJson(jsonString);
}

Label::~Label()
{

}

void
Label::fromJson(std::string jsonObj)
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




        LabelType* obj = &label_type;
		obj->fromJson(value.dump());

    }

    const char *parent_idKey = "parent_id";

    if(object.has_key(parent_idKey))
    {
        bourne::json value = object[parent_idKey];



        jsonToValue(&parent_id, value, "std::string");


    }

    const char *parent_typeKey = "parent_type";

    if(object.has_key(parent_typeKey))
    {
        bourne::json value = object[parent_typeKey];



        jsonToValue(&parent_type, value, "std::string");


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
Label::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();







	object["label_type"] = getLabelType().toJson();





    object["parent_id"] = getParentId();






    object["parent_type"] = getParentType();







	object["status"] = getStatus().toJson();





    object["value"] = getValue();



    return object;

}

std::string
Label::getId()
{
	return id;
}

void
Label::setId(std::string  id)
{
	this->id = id;
}

LabelType
Label::getLabelType()
{
	return label_type;
}

void
Label::setLabelType(LabelType  label_type)
{
	this->label_type = label_type;
}

std::string
Label::getParentId()
{
	return parent_id;
}

void
Label::setParentId(std::string  parent_id)
{
	this->parent_id = parent_id;
}

std::string
Label::getParentType()
{
	return parent_type;
}

void
Label::setParentType(std::string  parent_type)
{
	this->parent_type = parent_type;
}

LabelStatus
Label::getStatus()
{
	return status;
}

void
Label::setStatus(LabelStatus  status)
{
	this->status = status;
}

std::string
Label::getValue()
{
	return value;
}

void
Label::setValue(std::string  value)
{
	this->value = value;
}



