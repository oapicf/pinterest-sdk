

#include "TargetingSpecOperationMinMaxAge.h"

using namespace Tiny;

TargetingSpecOperationMinMaxAge::TargetingSpecOperationMinMaxAge()
{
	field = std::string();
	operation = std::string();
	value = std::string();
}

TargetingSpecOperationMinMaxAge::TargetingSpecOperationMinMaxAge(std::string jsonString)
{
	this->fromJson(jsonString);
}

TargetingSpecOperationMinMaxAge::~TargetingSpecOperationMinMaxAge()
{

}

void
TargetingSpecOperationMinMaxAge::fromJson(std::string jsonObj)
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
TargetingSpecOperationMinMaxAge::toJson()
{
    bourne::json object = bourne::json::object();





    object["field"] = getField();






    object["operation"] = getOperation();






    object["value"] = getValue();



    return object;

}

std::string
TargetingSpecOperationMinMaxAge::getField()
{
	return field;
}

void
TargetingSpecOperationMinMaxAge::setField(std::string  field)
{
	this->field = field;
}

std::string
TargetingSpecOperationMinMaxAge::getOperation()
{
	return operation;
}

void
TargetingSpecOperationMinMaxAge::setOperation(std::string  operation)
{
	this->operation = operation;
}

std::string
TargetingSpecOperationMinMaxAge::getValue()
{
	return value;
}

void
TargetingSpecOperationMinMaxAge::setValue(std::string  value)
{
	this->value = value;
}



