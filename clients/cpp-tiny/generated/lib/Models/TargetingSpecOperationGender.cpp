

#include "TargetingSpecOperationGender.h"

using namespace Tiny;

TargetingSpecOperationGender::TargetingSpecOperationGender()
{
	field = std::string();
	operation = std::string();
	values = std::list<TargetingSpecGender>();
}

TargetingSpecOperationGender::TargetingSpecOperationGender(std::string jsonString)
{
	this->fromJson(jsonString);
}

TargetingSpecOperationGender::~TargetingSpecOperationGender()
{

}

void
TargetingSpecOperationGender::fromJson(std::string jsonObj)
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


        std::list<TargetingSpecGender> values_list;
        TargetingSpecGender element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            values_list.push_back(element);
        }
        values = values_list;


    }


}

bourne::json
TargetingSpecOperationGender::toJson()
{
    bourne::json object = bourne::json::object();





    object["field"] = getField();






    object["operation"] = getOperation();





    std::list<TargetingSpecGender> values_list = getValues();
    bourne::json values_arr = bourne::json::array();

    for(auto& var : values_list)
    {
        TargetingSpecGender obj = var;
        values_arr.append(obj.toJson());
    }
    object["values"] = values_arr;




    return object;

}

std::string
TargetingSpecOperationGender::getField()
{
	return field;
}

void
TargetingSpecOperationGender::setField(std::string  field)
{
	this->field = field;
}

std::string
TargetingSpecOperationGender::getOperation()
{
	return operation;
}

void
TargetingSpecOperationGender::setOperation(std::string  operation)
{
	this->operation = operation;
}

std::list<TargetingSpecGender>
TargetingSpecOperationGender::getValues()
{
	return values;
}

void
TargetingSpecOperationGender::setValues(std::list <TargetingSpecGender> values)
{
	this->values = values;
}



