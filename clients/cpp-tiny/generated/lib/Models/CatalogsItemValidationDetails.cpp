

#include "CatalogsItemValidationDetails.h"

using namespace Tiny;

CatalogsItemValidationDetails::CatalogsItemValidationDetails()
{
	attribute_name = NullableCatalogsItemFieldType();
	provided_value = std::string();
}

CatalogsItemValidationDetails::CatalogsItemValidationDetails(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsItemValidationDetails::~CatalogsItemValidationDetails()
{

}

void
CatalogsItemValidationDetails::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *attribute_nameKey = "attribute_name";

    if(object.has_key(attribute_nameKey))
    {
        bourne::json value = object[attribute_nameKey];




        NullableCatalogsItemFieldType* obj = &attribute_name;
		obj->fromJson(value.dump());

    }

    const char *provided_valueKey = "provided_value";

    if(object.has_key(provided_valueKey))
    {
        bourne::json value = object[provided_valueKey];



        jsonToValue(&provided_value, value, "std::string");


    }


}

bourne::json
CatalogsItemValidationDetails::toJson()
{
    bourne::json object = bourne::json::object();






	object["attribute_name"] = getAttributeName().toJson();





    object["provided_value"] = getProvidedValue();



    return object;

}

NullableCatalogsItemFieldType
CatalogsItemValidationDetails::getAttributeName()
{
	return attribute_name;
}

void
CatalogsItemValidationDetails::setAttributeName(NullableCatalogsItemFieldType  attribute_name)
{
	this->attribute_name = attribute_name;
}

std::string
CatalogsItemValidationDetails::getProvidedValue()
{
	return provided_value;
}

void
CatalogsItemValidationDetails::setProvidedValue(std::string  provided_value)
{
	this->provided_value = provided_value;
}



