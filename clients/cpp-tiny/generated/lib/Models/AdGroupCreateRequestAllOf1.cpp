

#include "AdGroupCreateRequestAllOf1.h"

using namespace Tiny;

AdGroupCreateRequestAllOf1::AdGroupCreateRequestAllOf1()
{
	auto_targeting_enabled = bool(false);
	bid_multiplier = float(0);
	budget_type = null;
	pacing_delivery_type = null;
}

AdGroupCreateRequestAllOf1::AdGroupCreateRequestAllOf1(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdGroupCreateRequestAllOf1::~AdGroupCreateRequestAllOf1()
{

}

void
AdGroupCreateRequestAllOf1::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *auto_targeting_enabledKey = "auto_targeting_enabled";

    if(object.has_key(auto_targeting_enabledKey))
    {
        bourne::json value = object[auto_targeting_enabledKey];



        jsonToValue(&auto_targeting_enabled, value, "bool");


    }

    const char *bid_multiplierKey = "bid_multiplier";

    if(object.has_key(bid_multiplierKey))
    {
        bourne::json value = object[bid_multiplierKey];



        jsonToValue(&bid_multiplier, value, "long");


    }

    const char *budget_typeKey = "budget_type";

    if(object.has_key(budget_typeKey))
    {
        bourne::json value = object[budget_typeKey];




        BudgetType* obj = &budget_type;
		obj->fromJson(value.dump());

    }

    const char *pacing_delivery_typeKey = "pacing_delivery_type";

    if(object.has_key(pacing_delivery_typeKey))
    {
        bourne::json value = object[pacing_delivery_typeKey];




        PacingDeliveryType* obj = &pacing_delivery_type;
		obj->fromJson(value.dump());

    }


}

bourne::json
AdGroupCreateRequestAllOf1::toJson()
{
    bourne::json object = bourne::json::object();





    object["auto_targeting_enabled"] = isAutoTargetingEnabled();






    object["bid_multiplier"] = getBidMultiplier();







	object["budget_type"] = getBudgetType().toJson();






	object["pacing_delivery_type"] = getPacingDeliveryType().toJson();


    return object;

}

bool
AdGroupCreateRequestAllOf1::isAutoTargetingEnabled()
{
	return auto_targeting_enabled;
}

void
AdGroupCreateRequestAllOf1::setAutoTargetingEnabled(bool auto_targeting_enabled)
{
	this->auto_targeting_enabled = auto_targeting_enabled;
}

long
AdGroupCreateRequestAllOf1::getBidMultiplier()
{
	return bid_multiplier;
}

void
AdGroupCreateRequestAllOf1::setBidMultiplier(long bid_multiplier)
{
	this->bid_multiplier = bid_multiplier;
}

BudgetType
AdGroupCreateRequestAllOf1::getBudgetType()
{
	return budget_type;
}

void
AdGroupCreateRequestAllOf1::setBudgetType(BudgetType budget_type)
{
	this->budget_type = budget_type;
}

PacingDeliveryType
AdGroupCreateRequestAllOf1::getPacingDeliveryType()
{
	return pacing_delivery_type;
}

void
AdGroupCreateRequestAllOf1::setPacingDeliveryType(PacingDeliveryType pacing_delivery_type)
{
	this->pacing_delivery_type = pacing_delivery_type;
}



