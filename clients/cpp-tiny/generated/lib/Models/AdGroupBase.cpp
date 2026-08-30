

#include "AdGroupBase.h"

using namespace Tiny;

AdGroupBase::AdGroupBase()
{
	ad_account_id = std::string();
	bid_in_micro_currency = int(0);
	bid_strategy_type = BidStrategyType();
	billable_event = ActionType();
	budget_in_micro_currency = int(0);
	campaign_id = std::string();
	conversion_learning_mode_type = null;
	created_time = int(0);
	customer_segment_id = null;
	dca_assets = null;
	end_time = int(0);
	ext_features = AdgroupTrackingFeatures();
	feed_profile_id = std::string();
	id = std::string();
	is_creative_optimization = bool(false);
	is_local_inventory = bool(false);
	lifetime_frequency_cap = int(0);
	local_inventory_radius_in_miles = float(0);
	name = std::string();
	optimization_goal_metadata = null;
	performance_plus_campaign_settings = null;
	placement_group = null;
	placement_traffic_type = null;
	promotion_application_level = null;
	promotion_id = std::string();
	promotion_ids = std::list<std::string>();
	start_time = int(0);
	status = null;
	summary_status = null;
	targeting_spec = TargetingSpecOptimal();
	targeting_template_ids = std::list<std::string>();
	tracking_urls = AdGroupTrackingURLs();
	type = std::string();
	updated_time = int(0);
}

AdGroupBase::AdGroupBase(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdGroupBase::~AdGroupBase()
{

}

void
AdGroupBase::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ad_account_idKey = "ad_account_id";

    if(object.has_key(ad_account_idKey))
    {
        bourne::json value = object[ad_account_idKey];



        jsonToValue(&ad_account_id, value, "std::string");


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

    const char *campaign_idKey = "campaign_id";

    if(object.has_key(campaign_idKey))
    {
        bourne::json value = object[campaign_idKey];



        jsonToValue(&campaign_id, value, "std::string");


    }

    const char *conversion_learning_mode_typeKey = "conversion_learning_mode_type";

    if(object.has_key(conversion_learning_mode_typeKey))
    {
        bourne::json value = object[conversion_learning_mode_typeKey];




        ConversionLearningModeType* obj = &conversion_learning_mode_type;
		obj->fromJson(value.dump());

    }

    const char *created_timeKey = "created_time";

    if(object.has_key(created_timeKey))
    {
        bourne::json value = object[created_timeKey];



        jsonToValue(&created_time, value, "int");


    }

    const char *customer_segment_idKey = "customer_segment_id";

    if(object.has_key(customer_segment_idKey))
    {
        bourne::json value = object[customer_segment_idKey];



        jsonToValue(&customer_segment_id, value, "std::string");


    }

    const char *dca_assetsKey = "dca_assets";

    if(object.has_key(dca_assetsKey))
    {
        bourne::json value = object[dca_assetsKey];




        AnyType* obj = &dca_assets;
		obj->fromJson(value.dump());

    }

    const char *end_timeKey = "end_time";

    if(object.has_key(end_timeKey))
    {
        bourne::json value = object[end_timeKey];



        jsonToValue(&end_time, value, "int");


    }

    const char *ext_featuresKey = "ext_features";

    if(object.has_key(ext_featuresKey))
    {
        bourne::json value = object[ext_featuresKey];




        AdgroupTrackingFeatures* obj = &ext_features;
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

    const char *is_creative_optimizationKey = "is_creative_optimization";

    if(object.has_key(is_creative_optimizationKey))
    {
        bourne::json value = object[is_creative_optimizationKey];



        jsonToValue(&is_creative_optimization, value, "bool");


    }

    const char *is_local_inventoryKey = "is_local_inventory";

    if(object.has_key(is_local_inventoryKey))
    {
        bourne::json value = object[is_local_inventoryKey];



        jsonToValue(&is_local_inventory, value, "bool");


    }

    const char *lifetime_frequency_capKey = "lifetime_frequency_cap";

    if(object.has_key(lifetime_frequency_capKey))
    {
        bourne::json value = object[lifetime_frequency_capKey];



        jsonToValue(&lifetime_frequency_cap, value, "int");


    }

    const char *local_inventory_radius_in_milesKey = "local_inventory_radius_in_miles";

    if(object.has_key(local_inventory_radius_in_milesKey))
    {
        bourne::json value = object[local_inventory_radius_in_milesKey];



        jsonToValue(&local_inventory_radius_in_miles, value, "long");


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




        NullableOptimizationGoalMetadata* obj = &optimization_goal_metadata;
		obj->fromJson(value.dump());

    }

    const char *performance_plus_campaign_settingsKey = "performance_plus_campaign_settings";

    if(object.has_key(performance_plus_campaign_settingsKey))
    {
        bourne::json value = object[performance_plus_campaign_settingsKey];




        PerformancePlusCampaignSettings* obj = &performance_plus_campaign_settings;
		obj->fromJson(value.dump());

    }

    const char *placement_groupKey = "placement_group";

    if(object.has_key(placement_groupKey))
    {
        bourne::json value = object[placement_groupKey];




        PlacementGroupType* obj = &placement_group;
		obj->fromJson(value.dump());

    }

    const char *placement_traffic_typeKey = "placement_traffic_type";

    if(object.has_key(placement_traffic_typeKey))
    {
        bourne::json value = object[placement_traffic_typeKey];




        PlacementTrafficType* obj = &placement_traffic_type;
		obj->fromJson(value.dump());

    }

    const char *promotion_application_levelKey = "promotion_application_level";

    if(object.has_key(promotion_application_levelKey))
    {
        bourne::json value = object[promotion_application_levelKey];




        PromotionApplicationLevel* obj = &promotion_application_level;
		obj->fromJson(value.dump());

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

    const char *summary_statusKey = "summary_status";

    if(object.has_key(summary_statusKey))
    {
        bourne::json value = object[summary_statusKey];




        SummaryStatus* obj = &summary_status;
		obj->fromJson(value.dump());

    }

    const char *targeting_specKey = "targeting_spec";

    if(object.has_key(targeting_specKey))
    {
        bourne::json value = object[targeting_specKey];




        TargetingSpecOptimal* obj = &targeting_spec;
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




        AdGroupTrackingURLs* obj = &tracking_urls;
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
AdGroupBase::toJson()
{
    bourne::json object = bourne::json::object();





    object["ad_account_id"] = getAdAccountId();






    object["bid_in_micro_currency"] = getBidInMicroCurrency();







	object["bid_strategy_type"] = getBidStrategyType().toJson();






	object["billable_event"] = getBillableEvent().toJson();





    object["budget_in_micro_currency"] = getBudgetInMicroCurrency();






    object["campaign_id"] = getCampaignId();







	object["conversion_learning_mode_type"] = getConversionLearningModeType().toJson();





    object["created_time"] = getCreatedTime();






    object["customer_segment_id"] = getCustomerSegmentId();







	object["dca_assets"] = getDcaAssets().toJson();





    object["end_time"] = getEndTime();







	object["ext_features"] = getExtFeatures().toJson();





    object["feed_profile_id"] = getFeedProfileId();






    object["id"] = getId();






    object["is_creative_optimization"] = isIsCreativeOptimization();






    object["is_local_inventory"] = isIsLocalInventory();






    object["lifetime_frequency_cap"] = getLifetimeFrequencyCap();






    object["local_inventory_radius_in_miles"] = getLocalInventoryRadiusInMiles();






    object["name"] = getName();







	object["optimization_goal_metadata"] = getOptimizationGoalMetadata().toJson();






	object["performance_plus_campaign_settings"] = getPerformancePlusCampaignSettings().toJson();






	object["placement_group"] = getPlacementGroup().toJson();






	object["placement_traffic_type"] = getPlacementTrafficType().toJson();






	object["promotion_application_level"] = getPromotionApplicationLevel().toJson();





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






	object["summary_status"] = getSummaryStatus().toJson();






	object["targeting_spec"] = getTargetingSpec().toJson();




    std::list<std::string> targeting_template_ids_list = getTargetingTemplateIds();
    bourne::json targeting_template_ids_arr = bourne::json::array();

    for(auto& var : targeting_template_ids_list)
    {
        targeting_template_ids_arr.append(var);
    }
    object["targeting_template_ids"] = targeting_template_ids_arr;










	object["tracking_urls"] = getTrackingUrls().toJson();





    object["type"] = getType();






    object["updated_time"] = getUpdatedTime();



    return object;

}

std::string
AdGroupBase::getAdAccountId()
{
	return ad_account_id;
}

void
AdGroupBase::setAdAccountId(std::string ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

int
AdGroupBase::getBidInMicroCurrency()
{
	return bid_in_micro_currency;
}

void
AdGroupBase::setBidInMicroCurrency(int bid_in_micro_currency)
{
	this->bid_in_micro_currency = bid_in_micro_currency;
}

BidStrategyType
AdGroupBase::getBidStrategyType()
{
	return bid_strategy_type;
}

void
AdGroupBase::setBidStrategyType(BidStrategyType bid_strategy_type)
{
	this->bid_strategy_type = bid_strategy_type;
}

ActionType
AdGroupBase::getBillableEvent()
{
	return billable_event;
}

void
AdGroupBase::setBillableEvent(ActionType billable_event)
{
	this->billable_event = billable_event;
}

int
AdGroupBase::getBudgetInMicroCurrency()
{
	return budget_in_micro_currency;
}

void
AdGroupBase::setBudgetInMicroCurrency(int budget_in_micro_currency)
{
	this->budget_in_micro_currency = budget_in_micro_currency;
}

std::string
AdGroupBase::getCampaignId()
{
	return campaign_id;
}

void
AdGroupBase::setCampaignId(std::string campaign_id)
{
	this->campaign_id = campaign_id;
}

ConversionLearningModeType
AdGroupBase::getConversionLearningModeType()
{
	return conversion_learning_mode_type;
}

void
AdGroupBase::setConversionLearningModeType(ConversionLearningModeType conversion_learning_mode_type)
{
	this->conversion_learning_mode_type = conversion_learning_mode_type;
}

int
AdGroupBase::getCreatedTime()
{
	return created_time;
}

void
AdGroupBase::setCreatedTime(int created_time)
{
	this->created_time = created_time;
}

std::string
AdGroupBase::getCustomerSegmentId()
{
	return customer_segment_id;
}

void
AdGroupBase::setCustomerSegmentId(std::string customer_segment_id)
{
	this->customer_segment_id = customer_segment_id;
}

AnyType
AdGroupBase::getDcaAssets()
{
	return dca_assets;
}

void
AdGroupBase::setDcaAssets(AnyType dca_assets)
{
	this->dca_assets = dca_assets;
}

int
AdGroupBase::getEndTime()
{
	return end_time;
}

void
AdGroupBase::setEndTime(int end_time)
{
	this->end_time = end_time;
}

AdgroupTrackingFeatures
AdGroupBase::getExtFeatures()
{
	return ext_features;
}

void
AdGroupBase::setExtFeatures(AdgroupTrackingFeatures ext_features)
{
	this->ext_features = ext_features;
}

std::string
AdGroupBase::getFeedProfileId()
{
	return feed_profile_id;
}

void
AdGroupBase::setFeedProfileId(std::string feed_profile_id)
{
	this->feed_profile_id = feed_profile_id;
}

std::string
AdGroupBase::getId()
{
	return id;
}

void
AdGroupBase::setId(std::string id)
{
	this->id = id;
}

bool
AdGroupBase::isIsCreativeOptimization()
{
	return is_creative_optimization;
}

void
AdGroupBase::setIsCreativeOptimization(bool is_creative_optimization)
{
	this->is_creative_optimization = is_creative_optimization;
}

bool
AdGroupBase::isIsLocalInventory()
{
	return is_local_inventory;
}

void
AdGroupBase::setIsLocalInventory(bool is_local_inventory)
{
	this->is_local_inventory = is_local_inventory;
}

int
AdGroupBase::getLifetimeFrequencyCap()
{
	return lifetime_frequency_cap;
}

void
AdGroupBase::setLifetimeFrequencyCap(int lifetime_frequency_cap)
{
	this->lifetime_frequency_cap = lifetime_frequency_cap;
}

long
AdGroupBase::getLocalInventoryRadiusInMiles()
{
	return local_inventory_radius_in_miles;
}

void
AdGroupBase::setLocalInventoryRadiusInMiles(long local_inventory_radius_in_miles)
{
	this->local_inventory_radius_in_miles = local_inventory_radius_in_miles;
}

std::string
AdGroupBase::getName()
{
	return name;
}

void
AdGroupBase::setName(std::string name)
{
	this->name = name;
}

NullableOptimizationGoalMetadata
AdGroupBase::getOptimizationGoalMetadata()
{
	return optimization_goal_metadata;
}

void
AdGroupBase::setOptimizationGoalMetadata(NullableOptimizationGoalMetadata optimization_goal_metadata)
{
	this->optimization_goal_metadata = optimization_goal_metadata;
}

PerformancePlusCampaignSettings
AdGroupBase::getPerformancePlusCampaignSettings()
{
	return performance_plus_campaign_settings;
}

void
AdGroupBase::setPerformancePlusCampaignSettings(PerformancePlusCampaignSettings performance_plus_campaign_settings)
{
	this->performance_plus_campaign_settings = performance_plus_campaign_settings;
}

PlacementGroupType
AdGroupBase::getPlacementGroup()
{
	return placement_group;
}

void
AdGroupBase::setPlacementGroup(PlacementGroupType placement_group)
{
	this->placement_group = placement_group;
}

PlacementTrafficType
AdGroupBase::getPlacementTrafficType()
{
	return placement_traffic_type;
}

void
AdGroupBase::setPlacementTrafficType(PlacementTrafficType placement_traffic_type)
{
	this->placement_traffic_type = placement_traffic_type;
}

PromotionApplicationLevel
AdGroupBase::getPromotionApplicationLevel()
{
	return promotion_application_level;
}

void
AdGroupBase::setPromotionApplicationLevel(PromotionApplicationLevel promotion_application_level)
{
	this->promotion_application_level = promotion_application_level;
}

std::string
AdGroupBase::getPromotionId()
{
	return promotion_id;
}

void
AdGroupBase::setPromotionId(std::string promotion_id)
{
	this->promotion_id = promotion_id;
}

std::list<std::string>
AdGroupBase::getPromotionIds()
{
	return promotion_ids;
}

void
AdGroupBase::setPromotionIds(std::list<std::string> promotion_ids)
{
	this->promotion_ids = promotion_ids;
}

int
AdGroupBase::getStartTime()
{
	return start_time;
}

void
AdGroupBase::setStartTime(int start_time)
{
	this->start_time = start_time;
}

EntityStatus
AdGroupBase::getStatus()
{
	return status;
}

void
AdGroupBase::setStatus(EntityStatus status)
{
	this->status = status;
}

SummaryStatus
AdGroupBase::getSummaryStatus()
{
	return summary_status;
}

void
AdGroupBase::setSummaryStatus(SummaryStatus summary_status)
{
	this->summary_status = summary_status;
}

TargetingSpecOptimal
AdGroupBase::getTargetingSpec()
{
	return targeting_spec;
}

void
AdGroupBase::setTargetingSpec(TargetingSpecOptimal targeting_spec)
{
	this->targeting_spec = targeting_spec;
}

std::list<std::string>
AdGroupBase::getTargetingTemplateIds()
{
	return targeting_template_ids;
}

void
AdGroupBase::setTargetingTemplateIds(std::list<std::string> targeting_template_ids)
{
	this->targeting_template_ids = targeting_template_ids;
}

AdGroupTrackingURLs
AdGroupBase::getTrackingUrls()
{
	return tracking_urls;
}

void
AdGroupBase::setTrackingUrls(AdGroupTrackingURLs tracking_urls)
{
	this->tracking_urls = tracking_urls;
}

std::string
AdGroupBase::getType()
{
	return type;
}

void
AdGroupBase::setType(std::string type)
{
	this->type = type;
}

int
AdGroupBase::getUpdatedTime()
{
	return updated_time;
}

void
AdGroupBase::setUpdatedTime(int updated_time)
{
	this->updated_time = updated_time;
}



