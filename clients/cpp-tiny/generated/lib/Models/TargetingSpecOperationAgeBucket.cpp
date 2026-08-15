

#include "TargetingSpecOperationAgeBucket.h"

using namespace Tiny;

TargetingSpecOperationAgeBucket::TargetingSpecOperationAgeBucket()
{
	field = std::string();
	operation = std::string();
	values = std::list<TargetingSpecAgeBucket>();
}

TargetingSpecOperationAgeBucket::TargetingSpecOperationAgeBucket(std::string jsonString)
{
	this->fromJson(jsonString);
}

TargetingSpecOperationAgeBucket::~TargetingSpecOperationAgeBucket()
{

}

void
TargetingSpecOperationAgeBucket::fromJson(std::string jsonObj)
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


        std::list<TargetingSpecAgeBucket> values_list;
        TargetingSpecAgeBucket element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            values_list.push_back(element);
        }
        values = values_list;


    }


}

bourne::json
TargetingSpecOperationAgeBucket::toJson()
{
    bourne::json object = bourne::json::object();





    object["field"] = getField();






    object["operation"] = getOperation();





    std::list<TargetingSpecAgeBucket> values_list = getValues();
    bourne::json values_arr = bourne::json::array();

    for(auto& var : values_list)
    {
        TargetingSpecAgeBucket obj = var;
        values_arr.append(obj.toJson());
    }
    object["values"] = values_arr;




    return object;

}

std::string
TargetingSpecOperationAgeBucket::getField()
{
	return field;
}

void
TargetingSpecOperationAgeBucket::setField(std::string  field)
{
	this->field = field;
}

std::string
TargetingSpecOperationAgeBucket::getOperation()
{
	return operation;
}

void
TargetingSpecOperationAgeBucket::setOperation(std::string  operation)
{
	this->operation = operation;
}

std::list<TargetingSpecAgeBucket>
TargetingSpecOperationAgeBucket::getValues()
{
	return values;
}

void
TargetingSpecOperationAgeBucket::setValues(std::list <TargetingSpecAgeBucket> values)
{
	this->values = values;
}



