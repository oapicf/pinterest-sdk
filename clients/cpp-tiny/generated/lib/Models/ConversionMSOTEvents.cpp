

#include "ConversionMSOTEvents.h"

using namespace Tiny;

ConversionMSOTEvents::ConversionMSOTEvents()
{
	action_timestamps = std::list<long>();
	ad_group_id = std::string();
	attribution_model = std::string();
	attribution_scope = std::string();
	attribution_score = float(0);
	campaign_id = std::string();
	currency = null;
	event_id = std::string();
	event_name = std::string();
	event_timestamp = long(0);
	total_event_touchpoints = int(0);
	total_events = int(0);
	value = float(0);
}

ConversionMSOTEvents::ConversionMSOTEvents(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionMSOTEvents::~ConversionMSOTEvents()
{

}

void
ConversionMSOTEvents::fromJson(std::string jsonObj)
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



        jsonToValue(&attribution_model, value, "std::string");


    }

    const char *attribution_scopeKey = "attribution_scope";

    if(object.has_key(attribution_scopeKey))
    {
        bourne::json value = object[attribution_scopeKey];



        jsonToValue(&attribution_scope, value, "std::string");


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



        jsonToValue(&event_name, value, "std::string");


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

    const char *valueKey = "value";

    if(object.has_key(valueKey))
    {
        bourne::json value = object[valueKey];



        jsonToValue(&value, value, "double");


    }


}

bourne::json
ConversionMSOTEvents::toJson()
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






    object["attribution_model"] = getAttributionModel();






    object["attribution_scope"] = getAttributionScope();






    object["attribution_score"] = getAttributionScore();






    object["campaign_id"] = getCampaignId();







	object["currency"] = getCurrency().toJson();





    object["event_id"] = getEventId();






    object["event_name"] = getEventName();






    object["event_timestamp"] = getEventTimestamp();






    object["total_event_touchpoints"] = getTotalEventTouchpoints();






    object["total_events"] = getTotalEvents();






    object["value"] = getValue();



    return object;

}

std::list<long>
ConversionMSOTEvents::getActionTimestamps()
{
	return action_timestamps;
}

void
ConversionMSOTEvents::setActionTimestamps(std::list <long> action_timestamps)
{
	this->action_timestamps = action_timestamps;
}

std::string
ConversionMSOTEvents::getAdGroupId()
{
	return ad_group_id;
}

void
ConversionMSOTEvents::setAdGroupId(std::string  ad_group_id)
{
	this->ad_group_id = ad_group_id;
}

std::string
ConversionMSOTEvents::getAttributionModel()
{
	return attribution_model;
}

void
ConversionMSOTEvents::setAttributionModel(std::string  attribution_model)
{
	this->attribution_model = attribution_model;
}

std::string
ConversionMSOTEvents::getAttributionScope()
{
	return attribution_scope;
}

void
ConversionMSOTEvents::setAttributionScope(std::string  attribution_scope)
{
	this->attribution_scope = attribution_scope;
}

double
ConversionMSOTEvents::getAttributionScore()
{
	return attribution_score;
}

void
ConversionMSOTEvents::setAttributionScore(double  attribution_score)
{
	this->attribution_score = attribution_score;
}

std::string
ConversionMSOTEvents::getCampaignId()
{
	return campaign_id;
}

void
ConversionMSOTEvents::setCampaignId(std::string  campaign_id)
{
	this->campaign_id = campaign_id;
}

Currency
ConversionMSOTEvents::getCurrency()
{
	return currency;
}

void
ConversionMSOTEvents::setCurrency(Currency  currency)
{
	this->currency = currency;
}

std::string
ConversionMSOTEvents::getEventId()
{
	return event_id;
}

void
ConversionMSOTEvents::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
ConversionMSOTEvents::getEventName()
{
	return event_name;
}

void
ConversionMSOTEvents::setEventName(std::string  event_name)
{
	this->event_name = event_name;
}

long
ConversionMSOTEvents::getEventTimestamp()
{
	return event_timestamp;
}

void
ConversionMSOTEvents::setEventTimestamp(long  event_timestamp)
{
	this->event_timestamp = event_timestamp;
}

int
ConversionMSOTEvents::getTotalEventTouchpoints()
{
	return total_event_touchpoints;
}

void
ConversionMSOTEvents::setTotalEventTouchpoints(int  total_event_touchpoints)
{
	this->total_event_touchpoints = total_event_touchpoints;
}

int
ConversionMSOTEvents::getTotalEvents()
{
	return total_events;
}

void
ConversionMSOTEvents::setTotalEvents(int  total_events)
{
	this->total_events = total_events;
}

double
ConversionMSOTEvents::getValue()
{
	return value;
}

void
ConversionMSOTEvents::setValue(double  value)
{
	this->value = value;
}



