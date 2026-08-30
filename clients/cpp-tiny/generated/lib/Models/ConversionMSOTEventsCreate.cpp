

#include "ConversionMSOTEventsCreate.h"

using namespace Tiny;

ConversionMSOTEventsCreate::ConversionMSOTEventsCreate()
{
	action_timestamps = std::list<long>();
	ad_group_id = null;
	attribution_model = null;
	attribution_scope = null;
	attribution_score = float(0);
	campaign_id = null;
	click_window = std::string();
	currency = null;
	event_id = std::string();
	event_name = null;
	event_timestamp = long(0);
	total_event_touchpoints = int(0);
	total_events = int(0);
	total_events_fractional = float(0);
	value = float(0);
	view_window = std::string();
}

ConversionMSOTEventsCreate::ConversionMSOTEventsCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionMSOTEventsCreate::~ConversionMSOTEventsCreate()
{

}

void
ConversionMSOTEventsCreate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *action_timestampsKey = "action_timestamps";

    if(object.has_key(action_timestampsKey))
    {
        bourne::json value = object[action_timestampsKey];


        std::list<long> action_timestamps_list;
        long element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "long");


            action_timestamps_list.push_back(element);
        }
        action_timestamps = action_timestamps_list;


    }

    const char *ad_group_idKey = "ad_group_id";

    if(object.has_key(ad_group_idKey))
    {
        bourne::json value = object[ad_group_idKey];



        jsonToValue(&ad_group_id, value, "std::string");


    }

    const char *attribution_modelKey = "attribution_model";

    if(object.has_key(attribution_modelKey))
    {
        bourne::json value = object[attribution_modelKey];




        AttributionModel* obj = &attribution_model;
		obj->fromJson(value.dump());

    }

    const char *attribution_scopeKey = "attribution_scope";

    if(object.has_key(attribution_scopeKey))
    {
        bourne::json value = object[attribution_scopeKey];




        AttributionScope* obj = &attribution_scope;
		obj->fromJson(value.dump());

    }

    const char *attribution_scoreKey = "attribution_score";

    if(object.has_key(attribution_scoreKey))
    {
        bourne::json value = object[attribution_scoreKey];



        jsonToValue(&attribution_score, value, "double");


    }

    const char *campaign_idKey = "campaign_id";

    if(object.has_key(campaign_idKey))
    {
        bourne::json value = object[campaign_idKey];



        jsonToValue(&campaign_id, value, "std::string");


    }

    const char *click_windowKey = "click_window";

    if(object.has_key(click_windowKey))
    {
        bourne::json value = object[click_windowKey];



        jsonToValue(&click_window, value, "std::string");


    }

    const char *currencyKey = "currency";

    if(object.has_key(currencyKey))
    {
        bourne::json value = object[currencyKey];




        Currency* obj = &currency;
		obj->fromJson(value.dump());

    }

    const char *event_idKey = "event_id";

    if(object.has_key(event_idKey))
    {
        bourne::json value = object[event_idKey];



        jsonToValue(&event_id, value, "std::string");


    }

    const char *event_nameKey = "event_name";

    if(object.has_key(event_nameKey))
    {
        bourne::json value = object[event_nameKey];




        MsotEventName* obj = &event_name;
		obj->fromJson(value.dump());

    }

    const char *event_timestampKey = "event_timestamp";

    if(object.has_key(event_timestampKey))
    {
        bourne::json value = object[event_timestampKey];



        jsonToValue(&event_timestamp, value, "long");


    }

    const char *total_event_touchpointsKey = "total_event_touchpoints";

    if(object.has_key(total_event_touchpointsKey))
    {
        bourne::json value = object[total_event_touchpointsKey];



        jsonToValue(&total_event_touchpoints, value, "int");


    }

    const char *total_eventsKey = "total_events";

    if(object.has_key(total_eventsKey))
    {
        bourne::json value = object[total_eventsKey];



        jsonToValue(&total_events, value, "int");


    }

    const char *total_events_fractionalKey = "total_events_fractional";

    if(object.has_key(total_events_fractionalKey))
    {
        bourne::json value = object[total_events_fractionalKey];



        jsonToValue(&total_events_fractional, value, "double");


    }

    const char *valueKey = "value";

    if(object.has_key(valueKey))
    {
        bourne::json value = object[valueKey];



        jsonToValue(&value, value, "double");


    }

    const char *view_windowKey = "view_window";

    if(object.has_key(view_windowKey))
    {
        bourne::json value = object[view_windowKey];



        jsonToValue(&view_window, value, "std::string");


    }


}

bourne::json
ConversionMSOTEventsCreate::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<long> action_timestamps_list = getActionTimestamps();
    bourne::json action_timestamps_arr = bourne::json::array();

    for(auto& var : action_timestamps_list)
    {
        action_timestamps_arr.append(var);
    }
    object["action_timestamps"] = action_timestamps_arr;









    object["ad_group_id"] = getAdGroupId();







	object["attribution_model"] = getAttributionModel().toJson();






	object["attribution_scope"] = getAttributionScope().toJson();





    object["attribution_score"] = getAttributionScore();






    object["campaign_id"] = getCampaignId();






    object["click_window"] = getClickWindow();







	object["currency"] = getCurrency().toJson();





    object["event_id"] = getEventId();







	object["event_name"] = getEventName().toJson();





    object["event_timestamp"] = getEventTimestamp();






    object["total_event_touchpoints"] = getTotalEventTouchpoints();






    object["total_events"] = getTotalEvents();






    object["total_events_fractional"] = getTotalEventsFractional();






    object["value"] = getValue();






    object["view_window"] = getViewWindow();



    return object;

}

std::list<long>
ConversionMSOTEventsCreate::getActionTimestamps()
{
	return action_timestamps;
}

void
ConversionMSOTEventsCreate::setActionTimestamps(std::list<long> action_timestamps)
{
	this->action_timestamps = action_timestamps;
}

std::string
ConversionMSOTEventsCreate::getAdGroupId()
{
	return ad_group_id;
}

void
ConversionMSOTEventsCreate::setAdGroupId(std::string ad_group_id)
{
	this->ad_group_id = ad_group_id;
}

AttributionModel
ConversionMSOTEventsCreate::getAttributionModel()
{
	return attribution_model;
}

void
ConversionMSOTEventsCreate::setAttributionModel(AttributionModel attribution_model)
{
	this->attribution_model = attribution_model;
}

AttributionScope
ConversionMSOTEventsCreate::getAttributionScope()
{
	return attribution_scope;
}

void
ConversionMSOTEventsCreate::setAttributionScope(AttributionScope attribution_scope)
{
	this->attribution_scope = attribution_scope;
}

double
ConversionMSOTEventsCreate::getAttributionScore()
{
	return attribution_score;
}

void
ConversionMSOTEventsCreate::setAttributionScore(double attribution_score)
{
	this->attribution_score = attribution_score;
}

std::string
ConversionMSOTEventsCreate::getCampaignId()
{
	return campaign_id;
}

void
ConversionMSOTEventsCreate::setCampaignId(std::string campaign_id)
{
	this->campaign_id = campaign_id;
}

std::string
ConversionMSOTEventsCreate::getClickWindow()
{
	return click_window;
}

void
ConversionMSOTEventsCreate::setClickWindow(std::string click_window)
{
	this->click_window = click_window;
}

Currency
ConversionMSOTEventsCreate::getCurrency()
{
	return currency;
}

void
ConversionMSOTEventsCreate::setCurrency(Currency currency)
{
	this->currency = currency;
}

std::string
ConversionMSOTEventsCreate::getEventId()
{
	return event_id;
}

void
ConversionMSOTEventsCreate::setEventId(std::string event_id)
{
	this->event_id = event_id;
}

MsotEventName
ConversionMSOTEventsCreate::getEventName()
{
	return event_name;
}

void
ConversionMSOTEventsCreate::setEventName(MsotEventName event_name)
{
	this->event_name = event_name;
}

long
ConversionMSOTEventsCreate::getEventTimestamp()
{
	return event_timestamp;
}

void
ConversionMSOTEventsCreate::setEventTimestamp(long event_timestamp)
{
	this->event_timestamp = event_timestamp;
}

int
ConversionMSOTEventsCreate::getTotalEventTouchpoints()
{
	return total_event_touchpoints;
}

void
ConversionMSOTEventsCreate::setTotalEventTouchpoints(int total_event_touchpoints)
{
	this->total_event_touchpoints = total_event_touchpoints;
}

int
ConversionMSOTEventsCreate::getTotalEvents()
{
	return total_events;
}

void
ConversionMSOTEventsCreate::setTotalEvents(int total_events)
{
	this->total_events = total_events;
}

double
ConversionMSOTEventsCreate::getTotalEventsFractional()
{
	return total_events_fractional;
}

void
ConversionMSOTEventsCreate::setTotalEventsFractional(double total_events_fractional)
{
	this->total_events_fractional = total_events_fractional;
}

double
ConversionMSOTEventsCreate::getValue()
{
	return value;
}

void
ConversionMSOTEventsCreate::setValue(double value)
{
	this->value = value;
}

std::string
ConversionMSOTEventsCreate::getViewWindow()
{
	return view_window;
}

void
ConversionMSOTEventsCreate::setViewWindow(std::string view_window)
{
	this->view_window = view_window;
}



