

#include "CampaignCreateRequest.h"

using namespace Tiny;

CampaignCreateRequest::CampaignCreateRequest()
{
	ad_account_id = std::string();
	daily_spend_cap = int(0);
	end_time = int(0);
	is_automated_campaign = bool(false);
	is_flexible_daily_budgets = bool(false);
	lifetime_spend_cap = int(0);
	name = std::string();
	order_line_id = std::string();
	start_time = int(0);
	status = std::string();
	tracking_urls = null;
	default_ad_group_budget_in_micro_currency = int(0);
	is_campaign_budget_optimization = bool(false);
	bid_options = CampaignBidOptionsCreate();
	is_performance_plus = bool(false);
	objective_type = ObjectiveType();
}

CampaignCreateRequest::CampaignCreateRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignCreateRequest::~CampaignCreateRequest()
{

}

void
CampaignCreateRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ad_account_idKey = "ad_account_id";

    if(object.has_key(ad_account_idKey))
    {
        bourne::json value = object[ad_account_idKey];



        jsonToValue(&ad_account_id, value, "std::string");


    }

    const char *daily_spend_capKey = "daily_spend_cap";

    if(object.has_key(daily_spend_capKey))
    {
        bourne::json value = object[daily_spend_capKey];



        jsonToValue(&daily_spend_cap, value, "int");


    }

    const char *end_timeKey = "end_time";

    if(object.has_key(end_timeKey))
    {
        bourne::json value = object[end_timeKey];



        jsonToValue(&end_time, value, "int");


    }

    const char *is_automated_campaignKey = "is_automated_campaign";

    if(object.has_key(is_automated_campaignKey))
    {
        bourne::json value = object[is_automated_campaignKey];



        jsonToValue(&is_automated_campaign, value, "bool");


    }

    const char *is_flexible_daily_budgetsKey = "is_flexible_daily_budgets";

    if(object.has_key(is_flexible_daily_budgetsKey))
    {
        bourne::json value = object[is_flexible_daily_budgetsKey];



        jsonToValue(&is_flexible_daily_budgets, value, "bool");


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

    const char *order_line_idKey = "order_line_id";

    if(object.has_key(order_line_idKey))
    {
        bourne::json value = object[order_line_idKey];



        jsonToValue(&order_line_id, value, "std::string");


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

    const char *default_ad_group_budget_in_micro_currencyKey = "default_ad_group_budget_in_micro_currency";

    if(object.has_key(default_ad_group_budget_in_micro_currencyKey))
    {
        bourne::json value = object[default_ad_group_budget_in_micro_currencyKey];



        jsonToValue(&default_ad_group_budget_in_micro_currency, value, "int");


    }

    const char *is_campaign_budget_optimizationKey = "is_campaign_budget_optimization";

    if(object.has_key(is_campaign_budget_optimizationKey))
    {
        bourne::json value = object[is_campaign_budget_optimizationKey];



        jsonToValue(&is_campaign_budget_optimization, value, "bool");


    }

    const char *bid_optionsKey = "bid_options";

    if(object.has_key(bid_optionsKey))
    {
        bourne::json value = object[bid_optionsKey];




        CampaignBidOptionsCreate* obj = &bid_options;
		obj->fromJson(value.dump());

    }

    const char *is_performance_plusKey = "is_performance_plus";

    if(object.has_key(is_performance_plusKey))
    {
        bourne::json value = object[is_performance_plusKey];



        jsonToValue(&is_performance_plus, value, "bool");


    }

    const char *objective_typeKey = "objective_type";

    if(object.has_key(objective_typeKey))
    {
        bourne::json value = object[objective_typeKey];




        ObjectiveType* obj = &objective_type;
		obj->fromJson(value.dump());

    }


}

bourne::json
CampaignCreateRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["ad_account_id"] = getAdAccountId();






    object["daily_spend_cap"] = getDailySpendCap();






    object["end_time"] = getEndTime();






    object["is_automated_campaign"] = isIsAutomatedCampaign();






    object["is_flexible_daily_budgets"] = isIsFlexibleDailyBudgets();






    object["lifetime_spend_cap"] = getLifetimeSpendCap();






    object["name"] = getName();






    object["order_line_id"] = getOrderLineId();






    object["start_time"] = getStartTime();







	object["status"] = getStatus().toJson();






	object["tracking_urls"] = getTrackingUrls().toJson();





    object["default_ad_group_budget_in_micro_currency"] = getDefaultAdGroupBudgetInMicroCurrency();






    object["is_campaign_budget_optimization"] = isIsCampaignBudgetOptimization();







	object["bid_options"] = getBidOptions().toJson();





    object["is_performance_plus"] = isIsPerformancePlus();







	object["objective_type"] = getObjectiveType().toJson();


    return object;

}

std::string
CampaignCreateRequest::getAdAccountId()
{
	return ad_account_id;
}

void
CampaignCreateRequest::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

int
CampaignCreateRequest::getDailySpendCap()
{
	return daily_spend_cap;
}

void
CampaignCreateRequest::setDailySpendCap(int  daily_spend_cap)
{
	this->daily_spend_cap = daily_spend_cap;
}

int
CampaignCreateRequest::getEndTime()
{
	return end_time;
}

void
CampaignCreateRequest::setEndTime(int  end_time)
{
	this->end_time = end_time;
}

bool
CampaignCreateRequest::isIsAutomatedCampaign()
{
	return is_automated_campaign;
}

void
CampaignCreateRequest::setIsAutomatedCampaign(bool  is_automated_campaign)
{
	this->is_automated_campaign = is_automated_campaign;
}

bool
CampaignCreateRequest::isIsFlexibleDailyBudgets()
{
	return is_flexible_daily_budgets;
}

void
CampaignCreateRequest::setIsFlexibleDailyBudgets(bool  is_flexible_daily_budgets)
{
	this->is_flexible_daily_budgets = is_flexible_daily_budgets;
}

int
CampaignCreateRequest::getLifetimeSpendCap()
{
	return lifetime_spend_cap;
}

void
CampaignCreateRequest::setLifetimeSpendCap(int  lifetime_spend_cap)
{
	this->lifetime_spend_cap = lifetime_spend_cap;
}

std::string
CampaignCreateRequest::getName()
{
	return name;
}

void
CampaignCreateRequest::setName(std::string  name)
{
	this->name = name;
}

std::string
CampaignCreateRequest::getOrderLineId()
{
	return order_line_id;
}

void
CampaignCreateRequest::setOrderLineId(std::string  order_line_id)
{
	this->order_line_id = order_line_id;
}

int
CampaignCreateRequest::getStartTime()
{
	return start_time;
}

void
CampaignCreateRequest::setStartTime(int  start_time)
{
	this->start_time = start_time;
}

EntityStatus
CampaignCreateRequest::getStatus()
{
	return status;
}

void
CampaignCreateRequest::setStatus(EntityStatus  status)
{
	this->status = status;
}

TrackingUrls
CampaignCreateRequest::getTrackingUrls()
{
	return tracking_urls;
}

void
CampaignCreateRequest::setTrackingUrls(TrackingUrls  tracking_urls)
{
	this->tracking_urls = tracking_urls;
}

int
CampaignCreateRequest::getDefaultAdGroupBudgetInMicroCurrency()
{
	return default_ad_group_budget_in_micro_currency;
}

void
CampaignCreateRequest::setDefaultAdGroupBudgetInMicroCurrency(int  default_ad_group_budget_in_micro_currency)
{
	this->default_ad_group_budget_in_micro_currency = default_ad_group_budget_in_micro_currency;
}

bool
CampaignCreateRequest::isIsCampaignBudgetOptimization()
{
	return is_campaign_budget_optimization;
}

void
CampaignCreateRequest::setIsCampaignBudgetOptimization(bool  is_campaign_budget_optimization)
{
	this->is_campaign_budget_optimization = is_campaign_budget_optimization;
}

CampaignBidOptionsCreate
CampaignCreateRequest::getBidOptions()
{
	return bid_options;
}

void
CampaignCreateRequest::setBidOptions(CampaignBidOptionsCreate  bid_options)
{
	this->bid_options = bid_options;
}

bool
CampaignCreateRequest::isIsPerformancePlus()
{
	return is_performance_plus;
}

void
CampaignCreateRequest::setIsPerformancePlus(bool  is_performance_plus)
{
	this->is_performance_plus = is_performance_plus;
}

ObjectiveType
CampaignCreateRequest::getObjectiveType()
{
	return objective_type;
}

void
CampaignCreateRequest::setObjectiveType(ObjectiveType  objective_type)
{
	this->objective_type = objective_type;
}



