

#include "CampaignPlanningConversionAttribution.h"

using namespace Tiny;

CampaignPlanningConversionAttribution::CampaignPlanningConversionAttribution()
{
	click_window_days = null;
	engagement_window_days = null;
	view_window_days = null;
}

CampaignPlanningConversionAttribution::CampaignPlanningConversionAttribution(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignPlanningConversionAttribution::~CampaignPlanningConversionAttribution()
{

}

void
CampaignPlanningConversionAttribution::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *click_window_daysKey = "click_window_days";

    if(object.has_key(click_window_daysKey))
    {
        bourne::json value = object[click_window_daysKey];




        CampaignPlanningConversionAttributionWindowDays* obj = &click_window_days;
		obj->fromJson(value.dump());

    }

    const char *engagement_window_daysKey = "engagement_window_days";

    if(object.has_key(engagement_window_daysKey))
    {
        bourne::json value = object[engagement_window_daysKey];




        CampaignPlanningConversionAttributionWindowDays* obj = &engagement_window_days;
		obj->fromJson(value.dump());

    }

    const char *view_window_daysKey = "view_window_days";

    if(object.has_key(view_window_daysKey))
    {
        bourne::json value = object[view_window_daysKey];




        CampaignPlanningConversionAttributionWindowDays* obj = &view_window_days;
		obj->fromJson(value.dump());

    }


}

bourne::json
CampaignPlanningConversionAttribution::toJson()
{
    bourne::json object = bourne::json::object();






	object["click_window_days"] = getClickWindowDays().toJson();






	object["engagement_window_days"] = getEngagementWindowDays().toJson();






	object["view_window_days"] = getViewWindowDays().toJson();


    return object;

}

CampaignPlanningConversionAttributionWindowDays
CampaignPlanningConversionAttribution::getClickWindowDays()
{
	return click_window_days;
}

void
CampaignPlanningConversionAttribution::setClickWindowDays(CampaignPlanningConversionAttributionWindowDays click_window_days)
{
	this->click_window_days = click_window_days;
}

CampaignPlanningConversionAttributionWindowDays
CampaignPlanningConversionAttribution::getEngagementWindowDays()
{
	return engagement_window_days;
}

void
CampaignPlanningConversionAttribution::setEngagementWindowDays(CampaignPlanningConversionAttributionWindowDays engagement_window_days)
{
	this->engagement_window_days = engagement_window_days;
}

CampaignPlanningConversionAttributionWindowDays
CampaignPlanningConversionAttribution::getViewWindowDays()
{
	return view_window_days;
}

void
CampaignPlanningConversionAttribution::setViewWindowDays(CampaignPlanningConversionAttributionWindowDays view_window_days)
{
	this->view_window_days = view_window_days;
}



