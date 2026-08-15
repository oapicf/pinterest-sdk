

#include "TargetingSpecOperationList.h"

using namespace Tiny;

TargetingSpecOperationList::TargetingSpecOperationList()
{
	field = std::string();
	operation = std::string();
	values = std::list<std::string>();
}

TargetingSpecOperationList::TargetingSpecOperationList(std::string jsonString)
{
	this->fromJson(jsonString);
}

TargetingSpecOperationList::~TargetingSpecOperationList()
{

}

void
TargetingSpecOperationList::fromJson(std::string jsonObj)
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


        std::list<std::string> values_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            values_list.push_back(element);
        }
        values = values_list;


    }


}

bourne::json
TargetingSpecOperationList::toJson()
{
    bourne::json object = bourne::json::object();





    object["field"] = getField();






    object["operation"] = getOperation();





    std::list<std::string> values_list = getValues();
    bourne::json values_arr = bourne::json::array();

    for(auto& var : values_list)
    {
        values_arr.append(var);
    }
    object["values"] = values_arr;






    return object;

}

std::string
TargetingSpecOperationList::getField()
{
	return field;
}

void
TargetingSpecOperationList::setField(std::string  field)
{
	this->field = field;
}

std::string
TargetingSpecOperationList::getOperation()
{
	return operation;
}

void
TargetingSpecOperationList::setOperation(std::string  operation)
{
	this->operation = operation;
}

std::list<std::string>
TargetingSpecOperationList::getValues()
{
	return values;
}

void
TargetingSpecOperationList::setValues(std::list <std::string> values)
{
	this->values = values;
}



