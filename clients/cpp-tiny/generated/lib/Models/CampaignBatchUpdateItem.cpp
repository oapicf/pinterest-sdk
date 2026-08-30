

#include "CampaignBatchUpdateItem.h"

using namespace Tiny;

CampaignBatchUpdateItem::CampaignBatchUpdateItem()
{
	ad_account_id = std::string();
	app_id = std::string();
	app_platform = null;
	bid_options = null;
	daily_spend_cap = int(0);
	default_ad_group_budget_in_micro_currency = int(0);
	end_time = int(0);
	id = std::string();
	intended_promotion_type = IntendedPromotionType();
	is_automated_campaign = bool(false);
	is_campaign_budget_optimization = bool(false);
	is_flexible_daily_budgets = bool(false);
	is_ltv_optimized = bool(false);
	is_performance_plus = bool(false);
	is_top_of_search = bool(false);
	lifetime_spend_cap = int(0);
	name = std::string();
	objective_type = ConversionObjectiveType();
	order_line_id = std::string();
	performance_plus_campaign_settings = null;
	start_time = int(0);
	status = EntityStatus();
	tracking_urls = null;
}

CampaignBatchUpdateItem::CampaignBatchUpdateItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignBatchUpdateItem::~CampaignBatchUpdateItem()
{

}

void
CampaignBatchUpdateItem::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ad_account_idKey = "ad_account_id";

    if(object.has_key(ad_account_idKey))
    {
        bourne::json value = object[ad_account_idKey];



        jsonToValue(&ad_account_id, value, "std::string");


    }

    const char *app_idKey = "app_id";

    if(object.has_key(app_idKey))
    {
        bourne::json value = object[app_idKey];



        jsonToValue(&app_id, value, "std::string");


    }

    const char *app_platformKey = "app_platform";

    if(object.has_key(app_platformKey))
    {
        bourne::json value = object[app_platformKey];




        MobileAppPlatform* obj = &app_platform;
		obj->fromJson(value.dump());

    }

    const char *bid_optionsKey = "bid_options";

    if(object.has_key(bid_optionsKey))
    {
        bourne::json value = object[bid_optionsKey];




        CampaignBidOptionsUpdate* obj = &bid_options;
		obj->fromJson(value.dump());

    }

    const char *daily_spend_capKey = "daily_spend_cap";

    if(object.has_key(daily_spend_capKey))
    {
        bourne::json value = object[daily_spend_capKey];



        jsonToValue(&daily_spend_cap, value, "int");


    }

    const char *default_ad_group_budget_in_micro_currencyKey = "default_ad_group_budget_in_micro_currency";

    if(object.has_key(default_ad_group_budget_in_micro_currencyKey))
    {
        bourne::json value = object[default_ad_group_budget_in_micro_currencyKey];



        jsonToValue(&default_ad_group_budget_in_micro_currency, value, "int");


    }

    const char *end_timeKey = "end_time";

    if(object.has_key(end_timeKey))
    {
        bourne::json value = object[end_timeKey];



        jsonToValue(&end_time, value, "int");


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *intended_promotion_typeKey = "intended_promotion_type";

    if(object.has_key(intended_promotion_typeKey))
    {
        bourne::json value = object[intended_promotion_typeKey];




        IntendedPromotionType* obj = &intended_promotion_type;
		obj->fromJson(value.dump());

    }

    const char *is_automated_campaignKey = "is_automated_campaign";

    if(object.has_key(is_automated_campaignKey))
    {
        bourne::json value = object[is_automated_campaignKey];



        jsonToValue(&is_automated_campaign, value, "bool");


    }

    const char *is_campaign_budget_optimizationKey = "is_campaign_budget_optimization";

    if(object.has_key(is_campaign_budget_optimizationKey))
    {
        bourne::json value = object[is_campaign_budget_optimizationKey];



        jsonToValue(&is_campaign_budget_optimization, value, "bool");


    }

    const char *is_flexible_daily_budgetsKey = "is_flexible_daily_budgets";

    if(object.has_key(is_flexible_daily_budgetsKey))
    {
        bourne::json value = object[is_flexible_daily_budgetsKey];



        jsonToValue(&is_flexible_daily_budgets, value, "bool");


    }

    const char *is_ltv_optimizedKey = "is_ltv_optimized";

    if(object.has_key(is_ltv_optimizedKey))
    {
        bourne::json value = object[is_ltv_optimizedKey];



        jsonToValue(&is_ltv_optimized, value, "bool");


    }

    const char *is_performance_plusKey = "is_performance_plus";

    if(object.has_key(is_performance_plusKey))
    {
        bourne::json value = object[is_performance_plusKey];



        jsonToValue(&is_performance_plus, value, "bool");


    }

    const char *is_top_of_searchKey = "is_top_of_search";

    if(object.has_key(is_top_of_searchKey))
    {
        bourne::json value = object[is_top_of_searchKey];



        jsonToValue(&is_top_of_search, value, "bool");


    }

    const char *lifetime_spend_capKey = "lifetime_spend_cap";

    if(object.has_key(lifetime_spend_capKey))
    {
        bourne::json value = object[lifetime_spend_capKey];



        jsonToValue(&lifetime_spend_cap, value, "int");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *objective_typeKey = "objective_type";

    if(object.has_key(objective_typeKey))
    {
        bourne::json value = object[objective_typeKey];




        ConversionObjectiveType* obj = &objective_type;
		obj->fromJson(value.dump());

    }

    const char *order_line_idKey = "order_line_id";

    if(object.has_key(order_line_idKey))
    {
        bourne::json value = object[order_line_idKey];



        jsonToValue(&order_line_id, value, "std::string");


    }

    const char *performance_plus_campaign_settingsKey = "performance_plus_campaign_settings";

    if(object.has_key(performance_plus_campaign_settingsKey))
    {
        bourne::json value = object[performance_plus_campaign_settingsKey];




        PerformancePlusCampaignSettings* obj = &performance_plus_campaign_settings;
		obj->fromJson(value.dump());

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

    const char *tracking_urlsKey = "tracking_urls";

    if(object.has_key(tracking_urlsKey))
    {
        bourne::json value = object[tracking_urlsKey];




        TrackingUrls* obj = &tracking_urls;
		obj->fromJson(value.dump());

    }


}

bourne::json
CampaignBatchUpdateItem::toJson()
{
    bourne::json object = bourne::json::object();





    object["ad_account_id"] = getAdAccountId();






    object["app_id"] = getAppId();







	object["app_platform"] = getAppPlatform().toJson();






	object["bid_options"] = getBidOptions().toJson();





    object["daily_spend_cap"] = getDailySpendCap();






    object["default_ad_group_budget_in_micro_currency"] = getDefaultAdGroupBudgetInMicroCurrency();






    object["end_time"] = getEndTime();






    object["id"] = getId();







	object["intended_promotion_type"] = getIntendedPromotionType().toJson();





    object["is_automated_campaign"] = isIsAutomatedCampaign();






    object["is_campaign_budget_optimization"] = isIsCampaignBudgetOptimization();






    object["is_flexible_daily_budgets"] = isIsFlexibleDailyBudgets();






    object["is_ltv_optimized"] = isIsLtvOptimized();






    object["is_performance_plus"] = isIsPerformancePlus();






    object["is_top_of_search"] = isIsTopOfSearch();






    object["lifetime_spend_cap"] = getLifetimeSpendCap();






    object["name"] = getName();







	object["objective_type"] = getObjectiveType().toJson();





    object["order_line_id"] = getOrderLineId();







	object["performance_plus_campaign_settings"] = getPerformancePlusCampaignSettings().toJson();





    object["start_time"] = getStartTime();







	object["status"] = getStatus().toJson();






	object["tracking_urls"] = getTrackingUrls().toJson();


    return object;

}

std::string
CampaignBatchUpdateItem::getAdAccountId()
{
	return ad_account_id;
}

void
CampaignBatchUpdateItem::setAdAccountId(std::string ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

std::string
CampaignBatchUpdateItem::getAppId()
{
	return app_id;
}

void
CampaignBatchUpdateItem::setAppId(std::string app_id)
{
	this->app_id = app_id;
}

MobileAppPlatform
CampaignBatchUpdateItem::getAppPlatform()
{
	return app_platform;
}

void
CampaignBatchUpdateItem::setAppPlatform(MobileAppPlatform app_platform)
{
	this->app_platform = app_platform;
}

CampaignBidOptionsUpdate
CampaignBatchUpdateItem::getBidOptions()
{
	return bid_options;
}

void
CampaignBatchUpdateItem::setBidOptions(CampaignBidOptionsUpdate bid_options)
{
	this->bid_options = bid_options;
}

int
CampaignBatchUpdateItem::getDailySpendCap()
{
	return daily_spend_cap;
}

void
CampaignBatchUpdateItem::setDailySpendCap(int daily_spend_cap)
{
	this->daily_spend_cap = daily_spend_cap;
}

int
CampaignBatchUpdateItem::getDefaultAdGroupBudgetInMicroCurrency()
{
	return default_ad_group_budget_in_micro_currency;
}

void
CampaignBatchUpdateItem::setDefaultAdGroupBudgetInMicroCurrency(int default_ad_group_budget_in_micro_currency)
{
	this->default_ad_group_budget_in_micro_currency = default_ad_group_budget_in_micro_currency;
}

int
CampaignBatchUpdateItem::getEndTime()
{
	return end_time;
}

void
CampaignBatchUpdateItem::setEndTime(int end_time)
{
	this->end_time = end_time;
}

std::string
CampaignBatchUpdateItem::getId()
{
	return id;
}

void
CampaignBatchUpdateItem::setId(std::string id)
{
	this->id = id;
}

IntendedPromotionType
CampaignBatchUpdateItem::getIntendedPromotionType()
{
	return intended_promotion_type;
}

void
CampaignBatchUpdateItem::setIntendedPromotionType(IntendedPromotionType intended_promotion_type)
{
	this->intended_promotion_type = intended_promotion_type;
}

bool
CampaignBatchUpdateItem::isIsAutomatedCampaign()
{
	return is_automated_campaign;
}

void
CampaignBatchUpdateItem::setIsAutomatedCampaign(bool is_automated_campaign)
{
	this->is_automated_campaign = is_automated_campaign;
}

bool
CampaignBatchUpdateItem::isIsCampaignBudgetOptimization()
{
	return is_campaign_budget_optimization;
}

void
CampaignBatchUpdateItem::setIsCampaignBudgetOptimization(bool is_campaign_budget_optimization)
{
	this->is_campaign_budget_optimization = is_campaign_budget_optimization;
}

bool
CampaignBatchUpdateItem::isIsFlexibleDailyBudgets()
{
	return is_flexible_daily_budgets;
}

void
CampaignBatchUpdateItem::setIsFlexibleDailyBudgets(bool is_flexible_daily_budgets)
{
	this->is_flexible_daily_budgets = is_flexible_daily_budgets;
}

bool
CampaignBatchUpdateItem::isIsLtvOptimized()
{
	return is_ltv_optimized;
}

void
CampaignBatchUpdateItem::setIsLtvOptimized(bool is_ltv_optimized)
{
	this->is_ltv_optimized = is_ltv_optimized;
}

bool
CampaignBatchUpdateItem::isIsPerformancePlus()
{
	return is_performance_plus;
}

void
CampaignBatchUpdateItem::setIsPerformancePlus(bool is_performance_plus)
{
	this->is_performance_plus = is_performance_plus;
}

bool
CampaignBatchUpdateItem::isIsTopOfSearch()
{
	return is_top_of_search;
}

void
CampaignBatchUpdateItem::setIsTopOfSearch(bool is_top_of_search)
{
	this->is_top_of_search = is_top_of_search;
}

int
CampaignBatchUpdateItem::getLifetimeSpendCap()
{
	return lifetime_spend_cap;
}

void
CampaignBatchUpdateItem::setLifetimeSpendCap(int lifetime_spend_cap)
{
	this->lifetime_spend_cap = lifetime_spend_cap;
}

std::string
CampaignBatchUpdateItem::getName()
{
	return name;
}

void
CampaignBatchUpdateItem::setName(std::string name)
{
	this->name = name;
}

ConversionObjectiveType
CampaignBatchUpdateItem::getObjectiveType()
{
	return objective_type;
}

void
CampaignBatchUpdateItem::setObjectiveType(ConversionObjectiveType objective_type)
{
	this->objective_type = objective_type;
}

std::string
CampaignBatchUpdateItem::getOrderLineId()
{
	return order_line_id;
}

void
CampaignBatchUpdateItem::setOrderLineId(std::string order_line_id)
{
	this->order_line_id = order_line_id;
}

PerformancePlusCampaignSettings
CampaignBatchUpdateItem::getPerformancePlusCampaignSettings()
{
	return performance_plus_campaign_settings;
}

void
CampaignBatchUpdateItem::setPerformancePlusCampaignSettings(PerformancePlusCampaignSettings performance_plus_campaign_settings)
{
	this->performance_plus_campaign_settings = performance_plus_campaign_settings;
}

int
CampaignBatchUpdateItem::getStartTime()
{
	return start_time;
}

void
CampaignBatchUpdateItem::setStartTime(int start_time)
{
	this->start_time = start_time;
}

EntityStatus
CampaignBatchUpdateItem::getStatus()
{
	return status;
}

void
CampaignBatchUpdateItem::setStatus(EntityStatus status)
{
	this->status = status;
}

TrackingUrls
CampaignBatchUpdateItem::getTrackingUrls()
{
	return tracking_urls;
}

void
CampaignBatchUpdateItem::setTrackingUrls(TrackingUrls tracking_urls)
{
	this->tracking_urls = tracking_urls;
}



