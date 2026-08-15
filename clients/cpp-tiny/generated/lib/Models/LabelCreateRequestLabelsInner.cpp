

#include "LabelCreateRequest_labels_inner.h"

using namespace Tiny;

LabelCreateRequest_labels_inner::LabelCreateRequest_labels_inner()
{
	label_type = LabelType();
	value = std::string();
}

LabelCreateRequest_labels_inner::LabelCreateRequest_labels_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

LabelCreateRequest_labels_inner::~LabelCreateRequest_labels_inner()
{

}

void
LabelCreateRequest_labels_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *label_typeKey = "label_type";

    if(object.has_key(label_typeKey))
    {
        bourne::json value = object[label_typeKey];




        LabelType* obj = &label_type;
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
LabelCreateRequest_labels_inner::toJson()
{
    bourne::json object = bourne::json::object();






	object["label_type"] = getLabelType().toJson();





    object["value"] = getValue();



    return object;

}

LabelType
LabelCreateRequest_labels_inner::getLabelType()
{
	return label_type;
}

void
LabelCreateRequest_labels_inner::setLabelType(LabelType  label_type)
{
	this->label_type = label_type;
}

std::string
LabelCreateRequest_labels_inner::getValue()
{
	return value;
}

void
LabelCreateRequest_labels_inner::setValue(std::string  value)
{
	this->value = value;
}



