

#include "TargetingSpecOperationAppType.h"

using namespace Tiny;

TargetingSpecOperationAppType::TargetingSpecOperationAppType()
{
	field = std::string();
	operation = std::string();
	values = std::list<TargetingSpecAppType>();
}

TargetingSpecOperationAppType::TargetingSpecOperationAppType(std::string jsonString)
{
	this->fromJson(jsonString);
}

TargetingSpecOperationAppType::~TargetingSpecOperationAppType()
{

}

void
TargetingSpecOperationAppType::fromJson(std::string jsonObj)
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


        std::list<TargetingSpecAppType> values_list;
        TargetingSpecAppType element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            values_list.push_back(element);
        }
        values = values_list;


    }


}

bourne::json
TargetingSpecOperationAppType::toJson()
{
    bourne::json object = bourne::json::object();





    object["field"] = getField();






    object["operation"] = getOperation();





    std::list<TargetingSpecAppType> values_list = getValues();
    bourne::json values_arr = bourne::json::array();

    for(auto& var : values_list)
    {
        TargetingSpecAppType obj = var;
        values_arr.append(obj.toJson());
    }
    object["values"] = values_arr;




    return object;

}

std::string
TargetingSpecOperationAppType::getField()
{
	return field;
}

void
TargetingSpecOperationAppType::setField(std::string  field)
{
	this->field = field;
}

std::string
TargetingSpecOperationAppType::getOperation()
{
	return operation;
}

void
TargetingSpecOperationAppType::setOperation(std::string  operation)
{
	this->operation = operation;
}

std::list<TargetingSpecAppType>
TargetingSpecOperationAppType::getValues()
{
	return values;
}

void
TargetingSpecOperationAppType::setValues(std::list <TargetingSpecAppType> values)
{
	this->values = values;
}



