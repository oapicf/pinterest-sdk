

#include "AdGroupResponse.h"

using namespace Tiny;

AdGroupResponse::AdGroupResponse()
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
	ad_account_id = std::string();
	bid_multiplier = float(0);
	conversion_learning_mode_type = std::string();
	created_time = int(0);
	dca_assets = null;
	feed_profile_id = std::string();
	id = std::string();
	summary_status = std::string();
	type = std::string();
	updated_time = int(0);
}

AdGroupResponse::AdGroupResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdGroupResponse::~AdGroupResponse()
{

}

void
AdGroupResponse::fromJson(std::string jsonObj)
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

    const char *ad_account_idKey = "ad_account_id";

    if(object.has_key(ad_account_idKey))
    {
        bourne::json value = object[ad_account_idKey];



        jsonToValue(&ad_account_id, value, "std::string");


    }

    const char *bid_multiplierKey = "bid_multiplier";

    if(object.has_key(bid_multiplierKey))
    {
        bourne::json value = object[bid_multiplierKey];



        jsonToValue(&bid_multiplier, value, "long");


    }

    const char *conversion_learning_mode_typeKey = "conversion_learning_mode_type";

    if(object.has_key(conversion_learning_mode_typeKey))
    {
        bourne::json value = object[conversion_learning_mode_typeKey];



        jsonToValue(&conversion_learning_mode_type, value, "std::string");


    }

    const char *created_timeKey = "created_time";

    if(object.has_key(created_timeKey))
    {
        bourne::json value = object[created_timeKey];



        jsonToValue(&created_time, value, "int");


    }

    const char *dca_assetsKey = "dca_assets";

    if(object.has_key(dca_assetsKey))
    {
        bourne::json value = object[dca_assetsKey];




        AnyType* obj = &dca_assets;
		obj->fromJson(value.dump());

    }

    const char *feed_profile_idKey = "feed_profile_id";

    if(object.has_key(feed_profile_idKey))
    {
        bourne::json value = object[feed_profile_idKey];



        jsonToValue(&feed_profile_id, value, "std::string");


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *summary_statusKey = "summary_status";

    if(object.has_key(summary_statusKey))
    {
        bourne::json value = object[summary_statusKey];




        AdGroupSummaryStatus* obj = &summary_status;
		obj->fromJson(value.dump());

    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *updated_timeKey = "updated_time";

    if(object.has_key(updated_timeKey))
    {
        bourne::json value = object[updated_timeKey];



        jsonToValue(&updated_time, value, "int");


    }


}

bourne::json
AdGroupResponse::toJson()
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





    object["ad_account_id"] = getAdAccountId();






    object["bid_multiplier"] = getBidMultiplier();






    object["conversion_learning_mode_type"] = getConversionLearningModeType();






    object["created_time"] = getCreatedTime();







	object["dca_assets"] = getDcaAssets().toJson();





    object["feed_profile_id"] = getFeedProfileId();






    object["id"] = getId();







	object["summary_status"] = getSummaryStatus().toJson();





    object["type"] = getType();






    object["updated_time"] = getUpdatedTime();



    return object;

}

bool
AdGroupResponse::isAutoTargetingEnabled()
{
	return auto_targeting_enabled;
}

void
AdGroupResponse::setAutoTargetingEnabled(bool  auto_targeting_enabled)
{
	this->auto_targeting_enabled = auto_targeting_enabled;
}

int
AdGroupResponse::getBidInMicroCurrency()
{
	return bid_in_micro_currency;
}

void
AdGroupResponse::setBidInMicroCurrency(int  bid_in_micro_currency)
{
	this->bid_in_micro_currency = bid_in_micro_currency;
}

std::string
AdGroupResponse::getBidStrategyType()
{
	return bid_strategy_type;
}

void
AdGroupResponse::setBidStrategyType(std::string  bid_strategy_type)
{
	this->bid_strategy_type = bid_strategy_type;
}

ActionType
AdGroupResponse::getBillableEvent()
{
	return billable_event;
}

void
AdGroupResponse::setBillableEvent(ActionType  billable_event)
{
	this->billable_event = billable_event;
}

int
AdGroupResponse::getBudgetInMicroCurrency()
{
	return budget_in_micro_currency;
}

void
AdGroupResponse::setBudgetInMicroCurrency(int  budget_in_micro_currency)
{
	this->budget_in_micro_currency = budget_in_micro_currency;
}

BudgetType
AdGroupResponse::getBudgetType()
{
	return budget_type;
}

void
AdGroupResponse::setBudgetType(BudgetType  budget_type)
{
	this->budget_type = budget_type;
}

std::string
AdGroupResponse::getCampaignId()
{
	return campaign_id;
}

void
AdGroupResponse::setCampaignId(std::string  campaign_id)
{
	this->campaign_id = campaign_id;
}

int
AdGroupResponse::getEndTime()
{
	return end_time;
}

void
AdGroupResponse::setEndTime(int  end_time)
{
	this->end_time = end_time;
}

bool
AdGroupResponse::isIsCreativeOptimization()
{
	return is_creative_optimization;
}

void
AdGroupResponse::setIsCreativeOptimization(bool  is_creative_optimization)
{
	this->is_creative_optimization = is_creative_optimization;
}

int
AdGroupResponse::getLifetimeFrequencyCap()
{
	return lifetime_frequency_cap;
}

void
AdGroupResponse::setLifetimeFrequencyCap(int  lifetime_frequency_cap)
{
	this->lifetime_frequency_cap = lifetime_frequency_cap;
}

std::string
AdGroupResponse::getName()
{
	return name;
}

void
AdGroupResponse::setName(std::string  name)
{
	this->name = name;
}

OptimizationGoalMetadata
AdGroupResponse::getOptimizationGoalMetadata()
{
	return optimization_goal_metadata;
}

void
AdGroupResponse::setOptimizationGoalMetadata(OptimizationGoalMetadata  optimization_goal_metadata)
{
	this->optimization_goal_metadata = optimization_goal_metadata;
}

PacingDeliveryType
AdGroupResponse::getPacingDeliveryType()
{
	return pacing_delivery_type;
}

void
AdGroupResponse::setPacingDeliveryType(PacingDeliveryType  pacing_delivery_type)
{
	this->pacing_delivery_type = pacing_delivery_type;
}

PlacementGroupType
AdGroupResponse::getPlacementGroup()
{
	return placement_group;
}

void
AdGroupResponse::setPlacementGroup(PlacementGroupType  placement_group)
{
	this->placement_group = placement_group;
}

std::string
AdGroupResponse::getPromotionApplicationLevel()
{
	return promotion_application_level;
}

void
AdGroupResponse::setPromotionApplicationLevel(std::string  promotion_application_level)
{
	this->promotion_application_level = promotion_application_level;
}

std::string
AdGroupResponse::getPromotionId()
{
	return promotion_id;
}

void
AdGroupResponse::setPromotionId(std::string  promotion_id)
{
	this->promotion_id = promotion_id;
}

int
AdGroupResponse::getStartTime()
{
	return start_time;
}

void
AdGroupResponse::setStartTime(int  start_time)
{
	this->start_time = start_time;
}

EntityStatus
AdGroupResponse::getStatus()
{
	return status;
}

void
AdGroupResponse::setStatus(EntityStatus  status)
{
	this->status = status;
}

TargetingSpec
AdGroupResponse::getTargetingSpec()
{
	return targeting_spec;
}

void
AdGroupResponse::setTargetingSpec(TargetingSpec  targeting_spec)
{
	this->targeting_spec = targeting_spec;
}

std::list<std::string>
AdGroupResponse::getTargetingTemplateIds()
{
	return targeting_template_ids;
}

void
AdGroupResponse::setTargetingTemplateIds(std::list <std::string> targeting_template_ids)
{
	this->targeting_template_ids = targeting_template_ids;
}

TrackingUrls
AdGroupResponse::getTrackingUrls()
{
	return tracking_urls;
}

void
AdGroupResponse::setTrackingUrls(TrackingUrls  tracking_urls)
{
	this->tracking_urls = tracking_urls;
}

std::string
AdGroupResponse::getAdAccountId()
{
	return ad_account_id;
}

void
AdGroupResponse::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

long
AdGroupResponse::getBidMultiplier()
{
	return bid_multiplier;
}

void
AdGroupResponse::setBidMultiplier(long  bid_multiplier)
{
	this->bid_multiplier = bid_multiplier;
}

std::string
AdGroupResponse::getConversionLearningModeType()
{
	return conversion_learning_mode_type;
}

void
AdGroupResponse::setConversionLearningModeType(std::string  conversion_learning_mode_type)
{
	this->conversion_learning_mode_type = conversion_learning_mode_type;
}

int
AdGroupResponse::getCreatedTime()
{
	return created_time;
}

void
AdGroupResponse::setCreatedTime(int  created_time)
{
	this->created_time = created_time;
}

AnyType
AdGroupResponse::getDcaAssets()
{
	return dca_assets;
}

void
AdGroupResponse::setDcaAssets(AnyType  dca_assets)
{
	this->dca_assets = dca_assets;
}

std::string
AdGroupResponse::getFeedProfileId()
{
	return feed_profile_id;
}

void
AdGroupResponse::setFeedProfileId(std::string  feed_profile_id)
{
	this->feed_profile_id = feed_profile_id;
}

std::string
AdGroupResponse::getId()
{
	return id;
}

void
AdGroupResponse::setId(std::string  id)
{
	this->id = id;
}

AdGroupSummaryStatus
AdGroupResponse::getSummaryStatus()
{
	return summary_status;
}

void
AdGroupResponse::setSummaryStatus(AdGroupSummaryStatus  summary_status)
{
	this->summary_status = summary_status;
}

std::string
AdGroupResponse::getType()
{
	return type;
}

void
AdGroupResponse::setType(std::string  type)
{
	this->type = type;
}

int
AdGroupResponse::getUpdatedTime()
{
	return updated_time;
}

void
AdGroupResponse::setUpdatedTime(int  updated_time)
{
	this->updated_time = updated_time;
}



