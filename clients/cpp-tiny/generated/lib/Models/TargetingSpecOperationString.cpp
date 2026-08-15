

#include "TargetingSpecOperationString.h"

using namespace Tiny;

TargetingSpecOperationString::TargetingSpecOperationString()
{
	field = std::string();
	operation = std::string();
	value = std::string();
}

TargetingSpecOperationString::TargetingSpecOperationString(std::string jsonString)
{
	this->fromJson(jsonString);
}

TargetingSpecOperationString::~TargetingSpecOperationString()
{

}

void
TargetingSpecOperationString::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *fieldKey = "field";

    if(object.has_key(fieldKey))
    {
        bourne::json value = object[fieldKey];



        jsonToValue(&field, value, "std::string");


    }

    const char *operationKey = "operation";

    if(object.has_key(operationKey))
    {
        bourne::json value = object[operationKey];



        jsonToValue(&operation, value, "std::string");


    }

    const char *valueKey = "value";

    if(object.has_key(valueKey))
    {
        bourne::json value = object[valueKey];



        jsonToValue(&value, value, "std::string");


    }


}

bourne::json
TargetingSpecOperationString::toJson()
{
    bourne::json object = bourne::json::object();





    object["field"] = getField();






    object["operation"] = getOperation();






    object["value"] = getValue();



    return object;

}

std::string
TargetingSpecOperationString::getField()
{
	return field;
}

void
TargetingSpecOperationString::setField(std::string  field)
{
	this->field = field;
}

std::string
TargetingSpecOperationString::getOperation()
{
	return operation;
}

void
TargetingSpecOperationString::setOperation(std::string  operation)
{
	this->operation = operation;
}

std::string
TargetingSpecOperationString::getValue()
{
	return value;
}

void
TargetingSpecOperationString::setValue(std::string  value)
{
	this->value = value;
}



