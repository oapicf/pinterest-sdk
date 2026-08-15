

#include "CampaignCommon.h"

using namespace Tiny;

CampaignCommon::CampaignCommon()
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
}

CampaignCommon::CampaignCommon(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignCommon::~CampaignCommon()
{

}

void
CampaignCommon::fromJson(std::string jsonObj)
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


}

bourne::json
CampaignCommon::toJson()
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


    return object;

}

std::string
CampaignCommon::getAdAccountId()
{
	return ad_account_id;
}

void
CampaignCommon::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

int
CampaignCommon::getDailySpendCap()
{
	return daily_spend_cap;
}

void
CampaignCommon::setDailySpendCap(int  daily_spend_cap)
{
	this->daily_spend_cap = daily_spend_cap;
}

int
CampaignCommon::getEndTime()
{
	return end_time;
}

void
CampaignCommon::setEndTime(int  end_time)
{
	this->end_time = end_time;
}

bool
CampaignCommon::isIsAutomatedCampaign()
{
	return is_automated_campaign;
}

void
CampaignCommon::setIsAutomatedCampaign(bool  is_automated_campaign)
{
	this->is_automated_campaign = is_automated_campaign;
}

bool
CampaignCommon::isIsFlexibleDailyBudgets()
{
	return is_flexible_daily_budgets;
}

void
CampaignCommon::setIsFlexibleDailyBudgets(bool  is_flexible_daily_budgets)
{
	this->is_flexible_daily_budgets = is_flexible_daily_budgets;
}

int
CampaignCommon::getLifetimeSpendCap()
{
	return lifetime_spend_cap;
}

void
CampaignCommon::setLifetimeSpendCap(int  lifetime_spend_cap)
{
	this->lifetime_spend_cap = lifetime_spend_cap;
}

std::string
CampaignCommon::getName()
{
	return name;
}

void
CampaignCommon::setName(std::string  name)
{
	this->name = name;
}

std::string
CampaignCommon::getOrderLineId()
{
	return order_line_id;
}

void
CampaignCommon::setOrderLineId(std::string  order_line_id)
{
	this->order_line_id = order_line_id;
}

int
CampaignCommon::getStartTime()
{
	return start_time;
}

void
CampaignCommon::setStartTime(int  start_time)
{
	this->start_time = start_time;
}

EntityStatus
CampaignCommon::getStatus()
{
	return status;
}

void
CampaignCommon::setStatus(EntityStatus  status)
{
	this->status = status;
}

TrackingUrls
CampaignCommon::getTrackingUrls()
{
	return tracking_urls;
}

void
CampaignCommon::setTrackingUrls(TrackingUrls  tracking_urls)
{
	this->tracking_urls = tracking_urls;
}



