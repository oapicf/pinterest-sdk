

#include "CampaignCreateResponseData.h"

using namespace Tiny;

CampaignCreateResponseData::CampaignCreateResponseData()
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
	id = std::string();
	bid_options = CampaignBidOptions();
	created_time = int(0);
	is_performance_plus = bool(false);
	objective_type = ObjectiveType();
	summary_status = CampaignSummaryStatus();
	type = std::string();
	updated_time = int(0);
}

CampaignCreateResponseData::CampaignCreateResponseData(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignCreateResponseData::~CampaignCreateResponseData()
{

}

void
CampaignCreateResponseData::fromJson(std::string jsonObj)
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

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *bid_optionsKey = "bid_options";

    if(object.has_key(bid_optionsKey))
    {
        bourne::json value = object[bid_optionsKey];




        CampaignBidOptions* obj = &bid_options;
		obj->fromJson(value.dump());

    }

    const char *created_timeKey = "created_time";

    if(object.has_key(created_timeKey))
    {
        bourne::json value = object[created_timeKey];



        jsonToValue(&created_time, value, "int");


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

    const char *summary_statusKey = "summary_status";

    if(object.has_key(summary_statusKey))
    {
        bourne::json value = object[summary_statusKey];




        CampaignSummaryStatus* obj = &summary_status;
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
CampaignCreateResponseData::toJson()
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






    object["id"] = getId();







	object["bid_options"] = getBidOptions().toJson();





    object["created_time"] = getCreatedTime();






    object["is_performance_plus"] = isIsPerformancePlus();







	object["objective_type"] = getObjectiveType().toJson();






	object["summary_status"] = getSummaryStatus().toJson();





    object["type"] = getType();






    object["updated_time"] = getUpdatedTime();



    return object;

}

std::string
CampaignCreateResponseData::getAdAccountId()
{
	return ad_account_id;
}

void
CampaignCreateResponseData::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

int
CampaignCreateResponseData::getDailySpendCap()
{
	return daily_spend_cap;
}

void
CampaignCreateResponseData::setDailySpendCap(int  daily_spend_cap)
{
	this->daily_spend_cap = daily_spend_cap;
}

int
CampaignCreateResponseData::getEndTime()
{
	return end_time;
}

void
CampaignCreateResponseData::setEndTime(int  end_time)
{
	this->end_time = end_time;
}

bool
CampaignCreateResponseData::isIsAutomatedCampaign()
{
	return is_automated_campaign;
}

void
CampaignCreateResponseData::setIsAutomatedCampaign(bool  is_automated_campaign)
{
	this->is_automated_campaign = is_automated_campaign;
}

bool
CampaignCreateResponseData::isIsFlexibleDailyBudgets()
{
	return is_flexible_daily_budgets;
}

void
CampaignCreateResponseData::setIsFlexibleDailyBudgets(bool  is_flexible_daily_budgets)
{
	this->is_flexible_daily_budgets = is_flexible_daily_budgets;
}

int
CampaignCreateResponseData::getLifetimeSpendCap()
{
	return lifetime_spend_cap;
}

void
CampaignCreateResponseData::setLifetimeSpendCap(int  lifetime_spend_cap)
{
	this->lifetime_spend_cap = lifetime_spend_cap;
}

std::string
CampaignCreateResponseData::getName()
{
	return name;
}

void
CampaignCreateResponseData::setName(std::string  name)
{
	this->name = name;
}

std::string
CampaignCreateResponseData::getOrderLineId()
{
	return order_line_id;
}

void
CampaignCreateResponseData::setOrderLineId(std::string  order_line_id)
{
	this->order_line_id = order_line_id;
}

int
CampaignCreateResponseData::getStartTime()
{
	return start_time;
}

void
CampaignCreateResponseData::setStartTime(int  start_time)
{
	this->start_time = start_time;
}

EntityStatus
CampaignCreateResponseData::getStatus()
{
	return status;
}

void
CampaignCreateResponseData::setStatus(EntityStatus  status)
{
	this->status = status;
}

TrackingUrls
CampaignCreateResponseData::getTrackingUrls()
{
	return tracking_urls;
}

void
CampaignCreateResponseData::setTrackingUrls(TrackingUrls  tracking_urls)
{
	this->tracking_urls = tracking_urls;
}

int
CampaignCreateResponseData::getDefaultAdGroupBudgetInMicroCurrency()
{
	return default_ad_group_budget_in_micro_currency;
}

void
CampaignCreateResponseData::setDefaultAdGroupBudgetInMicroCurrency(int  default_ad_group_budget_in_micro_currency)
{
	this->default_ad_group_budget_in_micro_currency = default_ad_group_budget_in_micro_currency;
}

bool
CampaignCreateResponseData::isIsCampaignBudgetOptimization()
{
	return is_campaign_budget_optimization;
}

void
CampaignCreateResponseData::setIsCampaignBudgetOptimization(bool  is_campaign_budget_optimization)
{
	this->is_campaign_budget_optimization = is_campaign_budget_optimization;
}

std::string
CampaignCreateResponseData::getId()
{
	return id;
}

void
CampaignCreateResponseData::setId(std::string  id)
{
	this->id = id;
}

CampaignBidOptions
CampaignCreateResponseData::getBidOptions()
{
	return bid_options;
}

void
CampaignCreateResponseData::setBidOptions(CampaignBidOptions  bid_options)
{
	this->bid_options = bid_options;
}

int
CampaignCreateResponseData::getCreatedTime()
{
	return created_time;
}

void
CampaignCreateResponseData::setCreatedTime(int  created_time)
{
	this->created_time = created_time;
}

bool
CampaignCreateResponseData::isIsPerformancePlus()
{
	return is_performance_plus;
}

void
CampaignCreateResponseData::setIsPerformancePlus(bool  is_performance_plus)
{
	this->is_performance_plus = is_performance_plus;
}

ObjectiveType
CampaignCreateResponseData::getObjectiveType()
{
	return objective_type;
}

void
CampaignCreateResponseData::setObjectiveType(ObjectiveType  objective_type)
{
	this->objective_type = objective_type;
}

CampaignSummaryStatus
CampaignCreateResponseData::getSummaryStatus()
{
	return summary_status;
}

void
CampaignCreateResponseData::setSummaryStatus(CampaignSummaryStatus  summary_status)
{
	this->summary_status = summary_status;
}

std::string
CampaignCreateResponseData::getType()
{
	return type;
}

void
CampaignCreateResponseData::setType(std::string  type)
{
	this->type = type;
}

int
CampaignCreateResponseData::getUpdatedTime()
{
	return updated_time;
}

void
CampaignCreateResponseData::setUpdatedTime(int  updated_time)
{
	this->updated_time = updated_time;
}



