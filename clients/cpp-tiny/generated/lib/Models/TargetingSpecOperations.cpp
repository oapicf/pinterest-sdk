

#include "TargetingSpecOperations.h"

using namespace Tiny;

TargetingSpecOperations::TargetingSpecOperations()
{
	field = std::string();
	operation = std::string();
	values = std::list<TargetingSpecShoppingRetargeting>();
	value = std::string();
}

TargetingSpecOperations::TargetingSpecOperations(std::string jsonString)
{
	this->fromJson(jsonString);
}

TargetingSpecOperations::~TargetingSpecOperations()
{

}

void
TargetingSpecOperations::fromJson(std::string jsonObj)
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

    const char *valuesKey = "values";

    if(object.has_key(valuesKey))
    {
        bourne::json value = object[valuesKey];


        std::list<TargetingSpecShoppingRetargeting> values_list;
        TargetingSpecShoppingRetargeting element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            values_list.push_back(element);
        }
        values = values_list;


    }

    const char *valueKey = "value";

    if(object.has_key(valueKey))
    {
        bourne::json value = object[valueKey];



        jsonToValue(&value, value, "std::string");


    }


}

bourne::json
TargetingSpecOperations::toJson()
{
    bourne::json object = bourne::json::object();





    object["field"] = getField();






    object["operation"] = getOperation();





    std::list<TargetingSpecShoppingRetargeting> values_list = getValues();
    bourne::json values_arr = bourne::json::array();

    for(auto& var : values_list)
    {
        TargetingSpecShoppingRetargeting obj = var;
        values_arr.append(obj.toJson());
    }
    object["values"] = values_arr;







    object["value"] = getValue();



    return object;

}

std::string
TargetingSpecOperations::getField()
{
	return field;
}

void
TargetingSpecOperations::setField(std::string field)
{
	this->field = field;
}

std::string
TargetingSpecOperations::getOperation()
{
	return operation;
}

void
TargetingSpecOperations::setOperation(std::string operation)
{
	this->operation = operation;
}

std::list<TargetingSpecShoppingRetargeting>
TargetingSpecOperations::getValues()
{
	return values;
}

void
TargetingSpecOperations::setValues(std::list<TargetingSpecShoppingRetargeting> values)
{
	this->values = values;
}

std::string
TargetingSpecOperations::getValue()
{
	return value;
}

void
TargetingSpecOperations::setValue(std::string value)
{
	this->value = value;
}



