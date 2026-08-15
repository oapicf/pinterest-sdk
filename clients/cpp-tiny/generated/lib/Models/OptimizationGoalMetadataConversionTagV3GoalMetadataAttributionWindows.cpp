

#include "OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows.h"

using namespace Tiny;

OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows::OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows()
{
	click_window_days = int(0);
	engagement_window_days = int(0);
	view_window_days = int(0);
}

OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows::OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows(std::string jsonString)
{
	this->fromJson(jsonString);
}

OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows::~OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows()
{

}

void
OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *click_window_daysKey = "click_window_days";

    if(object.has_key(click_window_daysKey))
    {
        bourne::json value = object[click_window_daysKey];



        jsonToValue(&click_window_days, value, "int");


    }

    const char *engagement_window_daysKey = "engagement_window_days";

    if(object.has_key(engagement_window_daysKey))
    {
        bourne::json value = object[engagement_window_daysKey];



        jsonToValue(&engagement_window_days, value, "int");


    }

    const char *view_window_daysKey = "view_window_days";

    if(object.has_key(view_window_daysKey))
    {
        bourne::json value = object[view_window_daysKey];



        jsonToValue(&view_window_days, value, "int");


    }


}

bourne::json
OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows::toJson()
{
    bourne::json object = bourne::json::object();





    object["click_window_days"] = getClickWindowDays();






    object["engagement_window_days"] = getEngagementWindowDays();






    object["view_window_days"] = getViewWindowDays();



    return object;

}

int
OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows::getClickWindowDays()
{
	return click_window_days;
}

void
OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows::setClickWindowDays(int  click_window_days)
{
	this->click_window_days = click_window_days;
}

int
OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows::getEngagementWindowDays()
{
	return engagement_window_days;
}

void
OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows::setEngagementWindowDays(int  engagement_window_days)
{
	this->engagement_window_days = engagement_window_days;
}

int
OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows::getViewWindowDays()
{
	return view_window_days;
}

void
OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows::setViewWindowDays(int  view_window_days)
{
	this->view_window_days = view_window_days;
}



