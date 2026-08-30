

#include "AdGroupUpdateRequest.h"

using namespace Tiny;

AdGroupUpdateRequest::AdGroupUpdateRequest()
{
	bid_multiplier = float(0);
	id = std::string();
	targeting_spec_operations = std::list<TargetingSpecOperations>();
	auto_targeting_enabled = bool(false);
	bid_in_micro_currency = int(0);
	bid_strategy_type = BidStrategyType();
	billable_event = ActionType();
	budget_in_micro_currency = int(0);
	budget_type = BudgetType();
	campaign_id = std::string();
	end_time = int(0);
	is_creative_optimization = bool(false);
	lifetime_frequency_cap = int(0);
	name = std::string();
	optimization_goal_metadata = null;
	pacing_delivery_type = PacingDeliveryType();
	placement_group = null;
	promotion_application_level = std::string();
	promotion_id = std::string();
	promotion_ids = std::list<std::string>();
	start_time = int(0);
	status = null;
	targeting_spec = TargetingSpec();
	targeting_template_ids = std::list<std::string>();
	tracking_urls = null;
}

AdGroupUpdateRequest::AdGroupUpdateRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdGroupUpdateRequest::~AdGroupUpdateRequest()
{

}

void
AdGroupUpdateRequest::fromJson(std::string jsonObj)
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




        BidStrategyType* obj = &bid_strategy_type;
		obj->fromJson(value.dump());

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




        Object* obj = &optimization_goal_metadata;
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

    const char *promotion_idsKey = "promotion_ids";

    if(object.has_key(promotion_idsKey))
    {
        bourne::json value = object[promotion_idsKey];


        std::list<std::string> promotion_ids_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            promotion_ids_list.push_back(element);
        }
        promotion_ids = promotion_ids_list;


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




        Object* obj = &tracking_urls;
		obj->fromJson(value.dump());

    }


}

bourne::json
AdGroupUpdateRequest::toJson()
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







    object["auto_targeting_enabled"] = isAutoTargetingEnabled();






    object["bid_in_micro_currency"] = getBidInMicroCurrency();







	object["bid_strategy_type"] = getBidStrategyType().toJson();






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





    std::list<std::string> promotion_ids_list = getPromotionIds();
    bourne::json promotion_ids_arr = bourne::json::array();

    for(auto& var : promotion_ids_list)
    {
        promotion_ids_arr.append(var);
    }
    object["promotion_ids"] = promotion_ids_arr;









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

long
AdGroupUpdateRequest::getBidMultiplier()
{
	return bid_multiplier;
}

void
AdGroupUpdateRequest::setBidMultiplier(long bid_multiplier)
{
	this->bid_multiplier = bid_multiplier;
}

std::string
AdGroupUpdateRequest::getId()
{
	return id;
}

void
AdGroupUpdateRequest::setId(std::string id)
{
	this->id = id;
}

std::list<TargetingSpecOperations>
AdGroupUpdateRequest::getTargetingSpecOperations()
{
	return targeting_spec_operations;
}

void
AdGroupUpdateRequest::setTargetingSpecOperations(std::list<TargetingSpecOperations> targeting_spec_operations)
{
	this->targeting_spec_operations = targeting_spec_operations;
}

bool
AdGroupUpdateRequest::isAutoTargetingEnabled()
{
	return auto_targeting_enabled;
}

void
AdGroupUpdateRequest::setAutoTargetingEnabled(bool auto_targeting_enabled)
{
	this->auto_targeting_enabled = auto_targeting_enabled;
}

int
AdGroupUpdateRequest::getBidInMicroCurrency()
{
	return bid_in_micro_currency;
}

void
AdGroupUpdateRequest::setBidInMicroCurrency(int bid_in_micro_currency)
{
	this->bid_in_micro_currency = bid_in_micro_currency;
}

BidStrategyType
AdGroupUpdateRequest::getBidStrategyType()
{
	return bid_strategy_type;
}

void
AdGroupUpdateRequest::setBidStrategyType(BidStrategyType bid_strategy_type)
{
	this->bid_strategy_type = bid_strategy_type;
}

ActionType
AdGroupUpdateRequest::getBillableEvent()
{
	return billable_event;
}

void
AdGroupUpdateRequest::setBillableEvent(ActionType billable_event)
{
	this->billable_event = billable_event;
}

int
AdGroupUpdateRequest::getBudgetInMicroCurrency()
{
	return budget_in_micro_currency;
}

void
AdGroupUpdateRequest::setBudgetInMicroCurrency(int budget_in_micro_currency)
{
	this->budget_in_micro_currency = budget_in_micro_currency;
}

BudgetType
AdGroupUpdateRequest::getBudgetType()
{
	return budget_type;
}

void
AdGroupUpdateRequest::setBudgetType(BudgetType budget_type)
{
	this->budget_type = budget_type;
}

std::string
AdGroupUpdateRequest::getCampaignId()
{
	return campaign_id;
}

void
AdGroupUpdateRequest::setCampaignId(std::string campaign_id)
{
	this->campaign_id = campaign_id;
}

int
AdGroupUpdateRequest::getEndTime()
{
	return end_time;
}

void
AdGroupUpdateRequest::setEndTime(int end_time)
{
	this->end_time = end_time;
}

bool
AdGroupUpdateRequest::isIsCreativeOptimization()
{
	return is_creative_optimization;
}

void
AdGroupUpdateRequest::setIsCreativeOptimization(bool is_creative_optimization)
{
	this->is_creative_optimization = is_creative_optimization;
}

int
AdGroupUpdateRequest::getLifetimeFrequencyCap()
{
	return lifetime_frequency_cap;
}

void
AdGroupUpdateRequest::setLifetimeFrequencyCap(int lifetime_frequency_cap)
{
	this->lifetime_frequency_cap = lifetime_frequency_cap;
}

std::string
AdGroupUpdateRequest::getName()
{
	return name;
}

void
AdGroupUpdateRequest::setName(std::string name)
{
	this->name = name;
}

Object
AdGroupUpdateRequest::getOptimizationGoalMetadata()
{
	return optimization_goal_metadata;
}

void
AdGroupUpdateRequest::setOptimizationGoalMetadata(Object optimization_goal_metadata)
{
	this->optimization_goal_metadata = optimization_goal_metadata;
}

PacingDeliveryType
AdGroupUpdateRequest::getPacingDeliveryType()
{
	return pacing_delivery_type;
}

void
AdGroupUpdateRequest::setPacingDeliveryType(PacingDeliveryType pacing_delivery_type)
{
	this->pacing_delivery_type = pacing_delivery_type;
}

PlacementGroupType
AdGroupUpdateRequest::getPlacementGroup()
{
	return placement_group;
}

void
AdGroupUpdateRequest::setPlacementGroup(PlacementGroupType placement_group)
{
	this->placement_group = placement_group;
}

std::string
AdGroupUpdateRequest::getPromotionApplicationLevel()
{
	return promotion_application_level;
}

void
AdGroupUpdateRequest::setPromotionApplicationLevel(std::string promotion_application_level)
{
	this->promotion_application_level = promotion_application_level;
}

std::string
AdGroupUpdateRequest::getPromotionId()
{
	return promotion_id;
}

void
AdGroupUpdateRequest::setPromotionId(std::string promotion_id)
{
	this->promotion_id = promotion_id;
}

std::list<std::string>
AdGroupUpdateRequest::getPromotionIds()
{
	return promotion_ids;
}

void
AdGroupUpdateRequest::setPromotionIds(std::list<std::string> promotion_ids)
{
	this->promotion_ids = promotion_ids;
}

int
AdGroupUpdateRequest::getStartTime()
{
	return start_time;
}

void
AdGroupUpdateRequest::setStartTime(int start_time)
{
	this->start_time = start_time;
}

EntityStatus
AdGroupUpdateRequest::getStatus()
{
	return status;
}

void
AdGroupUpdateRequest::setStatus(EntityStatus status)
{
	this->status = status;
}

TargetingSpec
AdGroupUpdateRequest::getTargetingSpec()
{
	return targeting_spec;
}

void
AdGroupUpdateRequest::setTargetingSpec(TargetingSpec targeting_spec)
{
	this->targeting_spec = targeting_spec;
}

std::list<std::string>
AdGroupUpdateRequest::getTargetingTemplateIds()
{
	return targeting_template_ids;
}

void
AdGroupUpdateRequest::setTargetingTemplateIds(std::list<std::string> targeting_template_ids)
{
	this->targeting_template_ids = targeting_template_ids;
}

Object
AdGroupUpdateRequest::getTrackingUrls()
{
	return tracking_urls;
}

void
AdGroupUpdateRequest::setTrackingUrls(Object tracking_urls)
{
	this->tracking_urls = tracking_urls;
}



