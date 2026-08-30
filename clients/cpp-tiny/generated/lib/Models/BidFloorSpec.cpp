

#include "BidFloorSpec.h"

using namespace Tiny;

BidFloorSpec::BidFloorSpec()
{
	billable_event = null;
	countries = std::list<Country>();
	creative_type = null;
	currency = null;
	objective_type = null;
	optimization_goal_metadata = null;
}

BidFloorSpec::BidFloorSpec(std::string jsonString)
{
	this->fromJson(jsonString);
}

BidFloorSpec::~BidFloorSpec()
{

}

void
BidFloorSpec::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *billable_eventKey = "billable_event";

    if(object.has_key(billable_eventKey))
    {
        bourne::json value = object[billable_eventKey];




        ActionType* obj = &billable_event;
		obj->fromJson(value.dump());

    }

    const char *countriesKey = "countries";

    if(object.has_key(countriesKey))
    {
        bourne::json value = object[countriesKey];


        std::list<Country> countries_list;
        Country element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            countries_list.push_back(element);
        }
        countries = countries_list;


    }

    const char *creative_typeKey = "creative_type";

    if(object.has_key(creative_typeKey))
    {
        bourne::json value = object[creative_typeKey];




        CreativeType* obj = &creative_type;
		obj->fromJson(value.dump());

    }

    const char *currencyKey = "currency";

    if(object.has_key(currencyKey))
    {
        bourne::json value = object[currencyKey];




        Currency* obj = &currency;
		obj->fromJson(value.dump());

    }

    const char *objective_typeKey = "objective_type";

    if(object.has_key(objective_typeKey))
    {
        bourne::json value = object[objective_typeKey];




        BidFloorObjectiveType* obj = &objective_type;
		obj->fromJson(value.dump());

    }

    const char *optimization_goal_metadataKey = "optimization_goal_metadata";

    if(object.has_key(optimization_goal_metadataKey))
    {
        bourne::json value = object[optimization_goal_metadataKey];




        OptimizationGoalMetadata* obj = &optimization_goal_metadata;
		obj->fromJson(value.dump());

    }


}

bourne::json
BidFloorSpec::toJson()
{
    bourne::json object = bourne::json::object();






	object["billable_event"] = getBillableEvent().toJson();




    std::list<Country> countries_list = getCountries();
    bourne::json countries_arr = bourne::json::array();

    for(auto& var : countries_list)
    {
        Country obj = var;
        countries_arr.append(obj.toJson());
    }
    object["countries"] = countries_arr;








	object["creative_type"] = getCreativeType().toJson();






	object["currency"] = getCurrency().toJson();






	object["objective_type"] = getObjectiveType().toJson();






	object["optimization_goal_metadata"] = getOptimizationGoalMetadata().toJson();


    return object;

}

ActionType
BidFloorSpec::getBillableEvent()
{
	return billable_event;
}

void
BidFloorSpec::setBillableEvent(ActionType billable_event)
{
	this->billable_event = billable_event;
}

std::list<Country>
BidFloorSpec::getCountries()
{
	return countries;
}

void
BidFloorSpec::setCountries(std::list<Country> countries)
{
	this->countries = countries;
}

CreativeType
BidFloorSpec::getCreativeType()
{
	return creative_type;
}

void
BidFloorSpec::setCreativeType(CreativeType creative_type)
{
	this->creative_type = creative_type;
}

Currency
BidFloorSpec::getCurrency()
{
	return currency;
}

void
BidFloorSpec::setCurrency(Currency currency)
{
	this->currency = currency;
}

BidFloorObjectiveType
BidFloorSpec::getObjectiveType()
{
	return objective_type;
}

void
BidFloorSpec::setObjectiveType(BidFloorObjectiveType objective_type)
{
	this->objective_type = objective_type;
}

OptimizationGoalMetadata
BidFloorSpec::getOptimizationGoalMetadata()
{
	return optimization_goal_metadata;
}

void
BidFloorSpec::setOptimizationGoalMetadata(OptimizationGoalMetadata optimization_goal_metadata)
{
	this->optimization_goal_metadata = optimization_goal_metadata;
}



