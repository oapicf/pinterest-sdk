

#include "AttributionWindows.h"

using namespace Tiny;

AttributionWindows::AttributionWindows()
{
	click_window_days = int(0);
	engagement_window_days = int(0);
	view_window_days = int(0);
}

AttributionWindows::AttributionWindows(std::string jsonString)
{
	this->fromJson(jsonString);
}

AttributionWindows::~AttributionWindows()
{

}

void
AttributionWindows::fromJson(std::string jsonObj)
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
AttributionWindows::toJson()
{
    bourne::json object = bourne::json::object();





    object["click_window_days"] = getClickWindowDays();






    object["engagement_window_days"] = getEngagementWindowDays();






    object["view_window_days"] = getViewWindowDays();



    return object;

}

int
AttributionWindows::getClickWindowDays()
{
	return click_window_days;
}

void
AttributionWindows::setClickWindowDays(int click_window_days)
{
	this->click_window_days = click_window_days;
}

int
AttributionWindows::getEngagementWindowDays()
{
	return engagement_window_days;
}

void
AttributionWindows::setEngagementWindowDays(int engagement_window_days)
{
	this->engagement_window_days = engagement_window_days;
}

int
AttributionWindows::getViewWindowDays()
{
	return view_window_days;
}

void
AttributionWindows::setViewWindowDays(int view_window_days)
{
	this->view_window_days = view_window_days;
}



