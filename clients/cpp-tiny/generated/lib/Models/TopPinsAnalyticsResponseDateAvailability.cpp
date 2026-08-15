

#include "TopPinsAnalyticsResponse_date_availability.h"

using namespace Tiny;

TopPinsAnalyticsResponse_date_availability::TopPinsAnalyticsResponse_date_availability()
{
	is_realtime = bool(false);
	latest_available_timestamp = float(0);
}

TopPinsAnalyticsResponse_date_availability::TopPinsAnalyticsResponse_date_availability(std::string jsonString)
{
	this->fromJson(jsonString);
}

TopPinsAnalyticsResponse_date_availability::~TopPinsAnalyticsResponse_date_availability()
{

}

void
TopPinsAnalyticsResponse_date_availability::fromJson(std::string jsonObj)
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
TopPinsAnalyticsResponse_date_availability::toJson()
{
    bourne::json object = bourne::json::object();





    object["is_realtime"] = isIsRealtime();






    object["latest_available_timestamp"] = getLatestAvailableTimestamp();



    return object;

}

bool
TopPinsAnalyticsResponse_date_availability::isIsRealtime()
{
	return is_realtime;
}

void
TopPinsAnalyticsResponse_date_availability::setIsRealtime(bool  is_realtime)
{
	this->is_realtime = is_realtime;
}

long
TopPinsAnalyticsResponse_date_availability::getLatestAvailableTimestamp()
{
	return latest_available_timestamp;
}

void
TopPinsAnalyticsResponse_date_availability::setLatestAvailableTimestamp(long  latest_available_timestamp)
{
	this->latest_available_timestamp = latest_available_timestamp;
}



