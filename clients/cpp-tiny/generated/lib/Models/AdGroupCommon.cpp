

#include "AdGroupCommon.h"

using namespace Tiny;

AdGroupCommon::AdGroupCommon()
{
	auto_targeting_enabled = bool(false);
	bid_in_micro_currency = int(0);
	bid_strategy_type = std::string();
	billable_event = ActionType();
	budget_in_micro_currency = int(0);
	budget_type = std::string();
	campaign_id = std::string();
	end_time = int(0);
	is_creative_optimization = bool(false);
	lifetime_frequency_cap = int(0);
	name = std::string();
	optimization_goal_metadata = null;
	pacing_delivery_type = std::string();
	placement_group = std::string();
	promotion_application_level = std::string();
	promotion_id = std::string();
	start_time = int(0);
	status = std::string();
	targeting_spec = TargetingSpec();
	targeting_template_ids = std::list<std::string>();
	tracking_urls = null;
}

AdGroupCommon::AdGroupCommon(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdGroupCommon::~AdGroupCommon()
{

}

void
AdGroupCommon::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *auto_targeting_enabledKey = "auto_targeting_enabled";

    if(object.has_key(auto_targeting_enabledKey))
    {
        bourne::json value = object[auto_targeting_enabledKey];



        jsonToValue(&auto_targeting_enabled, value, "bool");


    }

    const char *bid_in_micro_currencyKey = "bid_in_micro_currency";

    if(object.has_key(bid_in_micro_currencyKey))
    {
        bourne::json value = object[bid_in_micro_currencyKey];



        jsonToValue(&bid_in_micro_currency, value, "int");


    }

    const char *bid_strategy_typeKey = "bid_strategy_type";

    if(object.has_key(bid_strategy_typeKey))
    {
        bourne::json value = object[bid_strategy_typeKey];



        jsonToValue(&bid_strategy_type, value, "std::string");


    }

    const char *billable_eventKey = "billable_event";

    if(object.has_key(billable_eventKey))
    {
        bourne::json value = object[billable_eventKey];




        ActionType* obj = &billable_event;
		obj->fromJson(value.dump());

    }

    const char *budget_in_micro_currencyKey = "budget_in_micro_currency";

    if(object.has_key(budget_in_micro_currencyKey))
    {
        bourne::json value = object[budget_in_micro_currencyKey];



        jsonToValue(&budget_in_micro_currency, value, "int");


    }

    const char *budget_typeKey = "budget_type";

    if(object.has_key(budget_typeKey))
    {
        bourne::json value = object[budget_typeKey];




        BudgetType* obj = &budget_type;
		obj->fromJson(value.dump());

    }

    const char *campaign_idKey = "campaign_id";

    if(object.has_key(campaign_idKey))
    {
        bourne::json value = object[campaign_idKey];



        jsonToValue(&campaign_id, value, "std::string");


    }

    const char *end_timeKey = "end_time";

    if(object.has_key(end_timeKey))
    {
        bourne::json value = object[end_timeKey];



        jsonToValue(&end_time, value, "int");


    }

    const char *is_creative_optimizationKey = "is_creative_optimization";

    if(object.has_key(is_creative_optimizationKey))
    {
        bourne::json value = object[is_creative_optimizationKey];



        jsonToValue(&is_creative_optimization, value, "bool");


    }

    const char *lifetime_frequency_capKey = "lifetime_frequency_cap";

    if(object.has_key(lifetime_frequency_capKey))
    {
        bourne::json value = object[lifetime_frequency_capKey];



        jsonToValue(&lifetime_frequency_cap, value, "int");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *optimization_goal_metadataKey = "optimization_goal_metadata";

    if(object.has_key(optimization_goal_metadataKey))
    {
        bourne::json value = object[optimization_goal_metadataKey];




        OptimizationGoalMetadata* obj = &optimization_goal_metadata;
		obj->fromJson(value.dump());

    }

    const char *pacing_delivery_typeKey = "pacing_delivery_type";

    if(object.has_key(pacing_delivery_typeKey))
    {
        bourne::json value = object[pacing_delivery_typeKey];




        PacingDeliveryType* obj = &pacing_delivery_type;
		obj->fromJson(value.dump());

    }

    const char *placement_groupKey = "placement_group";

    if(object.has_key(placement_groupKey))
    {
        bourne::json value = object[placement_groupKey];




        PlacementGroupType* obj = &placement_group;
		obj->fromJson(value.dump());

    }

    const char *promotion_application_levelKey = "promotion_application_level";

    if(object.has_key(promotion_application_levelKey))
    {
        bourne::json value = object[promotion_application_levelKey];



        jsonToValue(&promotion_application_level, value, "std::string");


    }

    const char *promotion_idKey = "promotion_id";

    if(object.has_key(promotion_idKey))
    {
        bourne::json value = object[promotion_idKey];



        jsonToValue(&promotion_id, value, "std::string");


    }

    const char *start_timeKey = "start_time";

    if(object.has_key(start_timeKey))
    {
        bourne::json value = object[start_timeKey];



        jsonToValue(&start_time, value, "int");


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        EntityStatus* obj = &status;
		obj->fromJson(value.dump());

    }

    const char *targeting_specKey = "targeting_spec";

    if(object.has_key(targeting_specKey))
    {
        bourne::json value = object[targeting_specKey];




        TargetingSpec* obj = &targeting_spec;
		obj->fromJson(value.dump());

    }

    const char *targeting_template_idsKey = "targeting_template_ids";

    if(object.has_key(targeting_template_idsKey))
    {
        bourne::json value = object[targeting_template_idsKey];


        std::list<std::string> targeting_template_ids_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            targeting_template_ids_list.push_back(element);
        }
        targeting_template_ids = targeting_template_ids_list;


    }

    const char *tracking_urlsKey = "tracking_urls";

    if(object.has_key(tracking_urlsKey))
    {
        bourne::json value = object[tracking_urlsKey];




        TrackingUrls* obj = &tracking_urls;
		obj->fromJson(value.dump());

    }


}

bourne::json
AdGroupCommon::toJson()
{
    bourne::json object = bourne::json::object();





    object["auto_targeting_enabled"] = isAutoTargetingEnabled();






    object["bid_in_micro_currency"] = getBidInMicroCurrency();






    object["bid_strategy_type"] = getBidStrategyType();







	object["billable_event"] = getBillableEvent().toJson();





    object["budget_in_micro_currency"] = getBudgetInMicroCurrency();







	object["budget_type"] = getBudgetType().toJson();





    object["campaign_id"] = getCampaignId();






    object["end_time"] = getEndTime();






    object["is_creative_optimization"] = isIsCreativeOptimization();






    object["lifetime_frequency_cap"] = getLifetimeFrequencyCap();






    object["name"] = getName();







	object["optimization_goal_metadata"] = getOptimizationGoalMetadata().toJson();






	object["pacing_delivery_type"] = getPacingDeliveryType().toJson();






	object["placement_group"] = getPlacementGroup().toJson();





    object["promotion_application_level"] = getPromotionApplicationLevel();






    object["promotion_id"] = getPromotionId();






    object["start_time"] = getStartTime();







	object["status"] = getStatus().toJson();






	object["targeting_spec"] = getTargetingSpec().toJson();




    std::list<std::string> targeting_template_ids_list = getTargetingTemplateIds();
    bourne::json targeting_template_ids_arr = bourne::json::array();

    for(auto& var : targeting_template_ids_list)
    {
        targeting_template_ids_arr.append(var);
    }
    object["targeting_template_ids"] = targeting_template_ids_arr;










	object["tracking_urls"] = getTrackingUrls().toJson();


    return object;

}

bool
AdGroupCommon::isAutoTargetingEnabled()
{
	return auto_targeting_enabled;
}

void
AdGroupCommon::setAutoTargetingEnabled(bool  auto_targeting_enabled)
{
	this->auto_targeting_enabled = auto_targeting_enabled;
}

int
AdGroupCommon::getBidInMicroCurrency()
{
	return bid_in_micro_currency;
}

void
AdGroupCommon::setBidInMicroCurrency(int  bid_in_micro_currency)
{
	this->bid_in_micro_currency = bid_in_micro_currency;
}

std::string
AdGroupCommon::getBidStrategyType()
{
	return bid_strategy_type;
}

void
AdGroupCommon::setBidStrategyType(std::string  bid_strategy_type)
{
	this->bid_strategy_type = bid_strategy_type;
}

ActionType
AdGroupCommon::getBillableEvent()
{
	return billable_event;
}

void
AdGroupCommon::setBillableEvent(ActionType  billable_event)
{
	this->billable_event = billable_event;
}

int
AdGroupCommon::getBudgetInMicroCurrency()
{
	return budget_in_micro_currency;
}

void
AdGroupCommon::setBudgetInMicroCurrency(int  budget_in_micro_currency)
{
	this->budget_in_micro_currency = budget_in_micro_currency;
}

BudgetType
AdGroupCommon::getBudgetType()
{
	return budget_type;
}

void
AdGroupCommon::setBudgetType(BudgetType  budget_type)
{
	this->budget_type = budget_type;
}

std::string
AdGroupCommon::getCampaignId()
{
	return campaign_id;
}

void
AdGroupCommon::setCampaignId(std::string  campaign_id)
{
	this->campaign_id = campaign_id;
}

int
AdGroupCommon::getEndTime()
{
	return end_time;
}

void
AdGroupCommon::setEndTime(int  end_time)
{
	this->end_time = end_time;
}

bool
AdGroupCommon::isIsCreativeOptimization()
{
	return is_creative_optimization;
}

void
AdGroupCommon::setIsCreativeOptimization(bool  is_creative_optimization)
{
	this->is_creative_optimization = is_creative_optimization;
}

int
AdGroupCommon::getLifetimeFrequencyCap()
{
	return lifetime_frequency_cap;
}

void
AdGroupCommon::setLifetimeFrequencyCap(int  lifetime_frequency_cap)
{
	this->lifetime_frequency_cap = lifetime_frequency_cap;
}

std::string
AdGroupCommon::getName()
{
	return name;
}

void
AdGroupCommon::setName(std::string  name)
{
	this->name = name;
}

OptimizationGoalMetadata
AdGroupCommon::getOptimizationGoalMetadata()
{
	return optimization_goal_metadata;
}

void
AdGroupCommon::setOptimizationGoalMetadata(OptimizationGoalMetadata  optimization_goal_metadata)
{
	this->optimization_goal_metadata = optimization_goal_metadata;
}

PacingDeliveryType
AdGroupCommon::getPacingDeliveryType()
{
	return pacing_delivery_type;
}

void
AdGroupCommon::setPacingDeliveryType(PacingDeliveryType  pacing_delivery_type)
{
	this->pacing_delivery_type = pacing_delivery_type;
}

PlacementGroupType
AdGroupCommon::getPlacementGroup()
{
	return placement_group;
}

void
AdGroupCommon::setPlacementGroup(PlacementGroupType  placement_group)
{
	this->placement_group = placement_group;
}

std::string
AdGroupCommon::getPromotionApplicationLevel()
{
	return promotion_application_level;
}

void
AdGroupCommon::setPromotionApplicationLevel(std::string  promotion_application_level)
{
	this->promotion_application_level = promotion_application_level;
}

std::string
AdGroupCommon::getPromotionId()
{
	return promotion_id;
}

void
AdGroupCommon::setPromotionId(std::string  promotion_id)
{
	this->promotion_id = promotion_id;
}

int
AdGroupCommon::getStartTime()
{
	return start_time;
}

void
AdGroupCommon::setStartTime(int  start_time)
{
	this->start_time = start_time;
}

EntityStatus
AdGroupCommon::getStatus()
{
	return status;
}

void
AdGroupCommon::setStatus(EntityStatus  status)
{
	this->status = status;
}

TargetingSpec
AdGroupCommon::getTargetingSpec()
{
	return targeting_spec;
}

void
AdGroupCommon::setTargetingSpec(TargetingSpec  targeting_spec)
{
	this->targeting_spec = targeting_spec;
}

std::list<std::string>
AdGroupCommon::getTargetingTemplateIds()
{
	return targeting_template_ids;
}

void
AdGroupCommon::setTargetingTemplateIds(std::list <std::string> targeting_template_ids)
{
	this->targeting_template_ids = targeting_template_ids;
}

TrackingUrls
AdGroupCommon::getTrackingUrls()
{
	return tracking_urls;
}

void
AdGroupCommon::setTrackingUrls(TrackingUrls  tracking_urls)
{
	this->tracking_urls = tracking_urls;
}



