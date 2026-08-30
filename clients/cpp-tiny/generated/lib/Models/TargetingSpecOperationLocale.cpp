

#include "TargetingSpecOperationLocale.h"

using namespace Tiny;

TargetingSpecOperationLocale::TargetingSpecOperationLocale()
{
	field = std::string();
	operation = TargetingSpecListOperation();
	values = std::list<std::string>();
}

TargetingSpecOperationLocale::TargetingSpecOperationLocale(std::string jsonString)
{
	this->fromJson(jsonString);
}

TargetingSpecOperationLocale::~TargetingSpecOperationLocale()
{

}

void
TargetingSpecOperationLocale::fromJson(std::string jsonObj)
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




        TargetingSpecListOperation* obj = &operation;
		obj->fromJson(value.dump());

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
TargetingSpecOperationLocale::toJson()
{
    bourne::json object = bourne::json::object();





    object["field"] = getField();







	object["operation"] = getOperation().toJson();




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
TargetingSpecOperationLocale::getField()
{
	return field;
}

void
TargetingSpecOperationLocale::setField(std::string field)
{
	this->field = field;
}

TargetingSpecListOperation
TargetingSpecOperationLocale::getOperation()
{
	return operation;
}

void
TargetingSpecOperationLocale::setOperation(TargetingSpecListOperation operation)
{
	this->operation = operation;
}

std::list<std::string>
TargetingSpecOperationLocale::getValues()
{
	return values;
}

void
TargetingSpecOperationLocale::setValues(std::list<std::string> values)
{
	this->values = values;
}



