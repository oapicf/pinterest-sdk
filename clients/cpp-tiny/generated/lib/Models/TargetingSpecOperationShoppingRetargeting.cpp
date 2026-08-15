

#include "TargetingSpecOperationShoppingRetargeting.h"

using namespace Tiny;

TargetingSpecOperationShoppingRetargeting::TargetingSpecOperationShoppingRetargeting()
{
	field = std::string();
	operation = std::string();
	values = std::list<TargetingSpecShoppingRetargeting>();
}

TargetingSpecOperationShoppingRetargeting::TargetingSpecOperationShoppingRetargeting(std::string jsonString)
{
	this->fromJson(jsonString);
}

TargetingSpecOperationShoppingRetargeting::~TargetingSpecOperationShoppingRetargeting()
{

}

void
TargetingSpecOperationShoppingRetargeting::fromJson(std::string jsonObj)
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


}

bourne::json
TargetingSpecOperationShoppingRetargeting::toJson()
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




    return object;

}

std::string
TargetingSpecOperationShoppingRetargeting::getField()
{
	return field;
}

void
TargetingSpecOperationShoppingRetargeting::setField(std::string  field)
{
	this->field = field;
}

std::string
TargetingSpecOperationShoppingRetargeting::getOperation()
{
	return operation;
}

void
TargetingSpecOperationShoppingRetargeting::setOperation(std::string  operation)
{
	this->operation = operation;
}

std::list<TargetingSpecShoppingRetargeting>
TargetingSpecOperationShoppingRetargeting::getValues()
{
	return values;
}

void
TargetingSpecOperationShoppingRetargeting::setValues(std::list <TargetingSpecShoppingRetargeting> values)
{
	this->values = values;
}



