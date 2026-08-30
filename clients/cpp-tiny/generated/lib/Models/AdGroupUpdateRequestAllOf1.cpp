

#include "AdGroupUpdateRequestAllOf1.h"

using namespace Tiny;

AdGroupUpdateRequestAllOf1::AdGroupUpdateRequestAllOf1()
{
	bid_multiplier = float(0);
	id = std::string();
	targeting_spec_operations = std::list<TargetingSpecOperations>();
}

AdGroupUpdateRequestAllOf1::AdGroupUpdateRequestAllOf1(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdGroupUpdateRequestAllOf1::~AdGroupUpdateRequestAllOf1()
{

}

void
AdGroupUpdateRequestAllOf1::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *bid_multiplierKey = "bid_multiplier";

    if(object.has_key(bid_multiplierKey))
    {
        bourne::json value = object[bid_multiplierKey];



        jsonToValue(&bid_multiplier, value, "long");


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *targeting_spec_operationsKey = "targeting_spec_operations";

    if(object.has_key(targeting_spec_operationsKey))
    {
        bourne::json value = object[targeting_spec_operationsKey];


        std::list<TargetingSpecOperations> targeting_spec_operations_list;
        TargetingSpecOperations element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            targeting_spec_operations_list.push_back(element);
        }
        targeting_spec_operations = targeting_spec_operations_list;


    }


}

bourne::json
AdGroupUpdateRequestAllOf1::toJson()
{
    bourne::json object = bourne::json::object();





    object["bid_multiplier"] = getBidMultiplier();






    object["id"] = getId();





    std::list<TargetingSpecOperations> targeting_spec_operations_list = getTargetingSpecOperations();
    bourne::json targeting_spec_operations_arr = bourne::json::array();

    for(auto& var : targeting_spec_operations_list)
    {
        TargetingSpecOperations obj = var;
        targeting_spec_operations_arr.append(obj.toJson());
    }
    object["targeting_spec_operations"] = targeting_spec_operations_arr;




    return object;

}

long
AdGroupUpdateRequestAllOf1::getBidMultiplier()
{
	return bid_multiplier;
}

void
AdGroupUpdateRequestAllOf1::setBidMultiplier(long bid_multiplier)
{
	this->bid_multiplier = bid_multiplier;
}

std::string
AdGroupUpdateRequestAllOf1::getId()
{
	return id;
}

void
AdGroupUpdateRequestAllOf1::setId(std::string id)
{
	this->id = id;
}

std::list<TargetingSpecOperations>
AdGroupUpdateRequestAllOf1::getTargetingSpecOperations()
{
	return targeting_spec_operations;
}

void
AdGroupUpdateRequestAllOf1::setTargetingSpecOperations(std::list<TargetingSpecOperations> targeting_spec_operations)
{
	this->targeting_spec_operations = targeting_spec_operations;
}



