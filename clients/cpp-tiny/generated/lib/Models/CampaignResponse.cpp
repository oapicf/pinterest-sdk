

#include "CampaignResponse.h"

using namespace Tiny;

CampaignResponse::CampaignResponse()
{
	id = std::string();
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
	bid_options = CampaignBidOptions();
	created_time = int(0);
	is_campaign_budget_optimization = bool(false);
	is_performance_plus = bool(false);
	objective_type = ObjectiveType();
	summary_status = CampaignSummaryStatus();
	type = std::string();
	updated_time = int(0);
}

CampaignResponse::CampaignResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignResponse::~CampaignResponse()
{

}

void
CampaignResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

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

    const char *is_campaign_budget_optimizationKey = "is_campaign_budget_optimization";

    if(object.has_key(is_campaign_budget_optimizationKey))
    {
        bourne::json value = object[is_campaign_budget_optimizationKey];



        jsonToValue(&is_campaign_budget_optimization, value, "bool");


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
CampaignResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






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






	object["bid_options"] = getBidOptions().toJson();





    object["created_time"] = getCreatedTime();






    object["is_campaign_budget_optimization"] = isIsCampaignBudgetOptimization();






    object["is_performance_plus"] = isIsPerformancePlus();







	object["objective_type"] = getObjectiveType().toJson();






	object["summary_status"] = getSummaryStatus().toJson();





    object["type"] = getType();






    object["updated_time"] = getUpdatedTime();



    return object;

}

std::string
CampaignResponse::getId()
{
	return id;
}

void
CampaignResponse::setId(std::string  id)
{
	this->id = id;
}

std::string
CampaignResponse::getAdAccountId()
{
	return ad_account_id;
}

void
CampaignResponse::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

int
CampaignResponse::getDailySpendCap()
{
	return daily_spend_cap;
}

void
CampaignResponse::setDailySpendCap(int  daily_spend_cap)
{
	this->daily_spend_cap = daily_spend_cap;
}

int
CampaignResponse::getEndTime()
{
	return end_time;
}

void
CampaignResponse::setEndTime(int  end_time)
{
	this->end_time = end_time;
}

bool
CampaignResponse::isIsAutomatedCampaign()
{
	return is_automated_campaign;
}

void
CampaignResponse::setIsAutomatedCampaign(bool  is_automated_campaign)
{
	this->is_automated_campaign = is_automated_campaign;
}

bool
CampaignResponse::isIsFlexibleDailyBudgets()
{
	return is_flexible_daily_budgets;
}

void
CampaignResponse::setIsFlexibleDailyBudgets(bool  is_flexible_daily_budgets)
{
	this->is_flexible_daily_budgets = is_flexible_daily_budgets;
}

int
CampaignResponse::getLifetimeSpendCap()
{
	return lifetime_spend_cap;
}

void
CampaignResponse::setLifetimeSpendCap(int  lifetime_spend_cap)
{
	this->lifetime_spend_cap = lifetime_spend_cap;
}

std::string
CampaignResponse::getName()
{
	return name;
}

void
CampaignResponse::setName(std::string  name)
{
	this->name = name;
}

std::string
CampaignResponse::getOrderLineId()
{
	return order_line_id;
}

void
CampaignResponse::setOrderLineId(std::string  order_line_id)
{
	this->order_line_id = order_line_id;
}

int
CampaignResponse::getStartTime()
{
	return start_time;
}

void
CampaignResponse::setStartTime(int  start_time)
{
	this->start_time = start_time;
}

EntityStatus
CampaignResponse::getStatus()
{
	return status;
}

void
CampaignResponse::setStatus(EntityStatus  status)
{
	this->status = status;
}

TrackingUrls
CampaignResponse::getTrackingUrls()
{
	return tracking_urls;
}

void
CampaignResponse::setTrackingUrls(TrackingUrls  tracking_urls)
{
	this->tracking_urls = tracking_urls;
}

CampaignBidOptions
CampaignResponse::getBidOptions()
{
	return bid_options;
}

void
CampaignResponse::setBidOptions(CampaignBidOptions  bid_options)
{
	this->bid_options = bid_options;
}

int
CampaignResponse::getCreatedTime()
{
	return created_time;
}

void
CampaignResponse::setCreatedTime(int  created_time)
{
	this->created_time = created_time;
}

bool
CampaignResponse::isIsCampaignBudgetOptimization()
{
	return is_campaign_budget_optimization;
}

void
CampaignResponse::setIsCampaignBudgetOptimization(bool  is_campaign_budget_optimization)
{
	this->is_campaign_budget_optimization = is_campaign_budget_optimization;
}

bool
CampaignResponse::isIsPerformancePlus()
{
	return is_performance_plus;
}

void
CampaignResponse::setIsPerformancePlus(bool  is_performance_plus)
{
	this->is_performance_plus = is_performance_plus;
}

ObjectiveType
CampaignResponse::getObjectiveType()
{
	return objective_type;
}

void
CampaignResponse::setObjectiveType(ObjectiveType  objective_type)
{
	this->objective_type = objective_type;
}

CampaignSummaryStatus
CampaignResponse::getSummaryStatus()
{
	return summary_status;
}

void
CampaignResponse::setSummaryStatus(CampaignSummaryStatus  summary_status)
{
	this->summary_status = summary_status;
}

std::string
CampaignResponse::getType()
{
	return type;
}

void
CampaignResponse::setType(std::string  type)
{
	this->type = type;
}

int
CampaignResponse::getUpdatedTime()
{
	return updated_time;
}

void
CampaignResponse::setUpdatedTime(int  updated_time)
{
	this->updated_time = updated_time;
}



