

#include "LabelCreateItem.h"

using namespace Tiny;

LabelCreateItem::LabelCreateItem()
{
	label_type = LabelType();
	value = std::string();
}

LabelCreateItem::LabelCreateItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

LabelCreateItem::~LabelCreateItem()
{

}

void
LabelCreateItem::fromJson(std::string jsonObj)
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
LabelCreateItem::toJson()
{
    bourne::json object = bourne::json::object();






	object["label_type"] = getLabelType().toJson();





    object["value"] = getValue();



    return object;

}

LabelType
LabelCreateItem::getLabelType()
{
	return label_type;
}

void
LabelCreateItem::setLabelType(LabelType label_type)
{
	this->label_type = label_type;
}

std::string
LabelCreateItem::getValue()
{
	return value;
}

void
LabelCreateItem::setValue(std::string value)
{
	this->value = value;
}



