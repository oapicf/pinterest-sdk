

#include "TopVideoPinsAnalyticsResponseDateAvailability.h"

using namespace Tiny;

TopVideoPinsAnalyticsResponseDateAvailability::TopVideoPinsAnalyticsResponseDateAvailability()
{
	is_realtime = bool(false);
	latest_available_timestamp = float(0);
}

TopVideoPinsAnalyticsResponseDateAvailability::TopVideoPinsAnalyticsResponseDateAvailability(std::string jsonString)
{
	this->fromJson(jsonString);
}

TopVideoPinsAnalyticsResponseDateAvailability::~TopVideoPinsAnalyticsResponseDateAvailability()
{

}

void
TopVideoPinsAnalyticsResponseDateAvailability::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *is_realtimeKey = "is_realtime";

    if(object.has_key(is_realtimeKey))
    {
        bourne::json value = object[is_realtimeKey];



        jsonToValue(&is_realtime, value, "bool");


    }

    const char *latest_available_timestampKey = "latest_available_timestamp";

    if(object.has_key(latest_available_timestampKey))
    {
        bourne::json value = object[latest_available_timestampKey];



        jsonToValue(&latest_available_timestamp, value, "long");


    }


}

bourne::json
TopVideoPinsAnalyticsResponseDateAvailability::toJson()
{
    bourne::json object = bourne::json::object();





    object["is_realtime"] = isIsRealtime();






    object["latest_available_timestamp"] = getLatestAvailableTimestamp();



    return object;

}

bool
TopVideoPinsAnalyticsResponseDateAvailability::isIsRealtime()
{
	return is_realtime;
}

void
TopVideoPinsAnalyticsResponseDateAvailability::setIsRealtime(bool is_realtime)
{
	this->is_realtime = is_realtime;
}

long
TopVideoPinsAnalyticsResponseDateAvailability::getLatestAvailableTimestamp()
{
	return latest_available_timestamp;
}

void
TopVideoPinsAnalyticsResponseDateAvailability::setLatestAvailableTimestamp(long latest_available_timestamp)
{
	this->latest_available_timestamp = latest_available_timestamp;
}



