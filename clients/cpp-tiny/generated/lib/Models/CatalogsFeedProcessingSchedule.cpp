

#include "CatalogsFeedProcessingSchedule.h"

using namespace Tiny;

CatalogsFeedProcessingSchedule::CatalogsFeedProcessingSchedule()
{
	time = std::string();
	timezone = std::string();
}

CatalogsFeedProcessingSchedule::CatalogsFeedProcessingSchedule(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsFeedProcessingSchedule::~CatalogsFeedProcessingSchedule()
{

}

void
CatalogsFeedProcessingSchedule::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *timeKey = "time";

    if(object.has_key(timeKey))
    {
        bourne::json value = object[timeKey];



        jsonToValue(&time, value, "std::string");


    }

    const char *timezoneKey = "timezone";

    if(object.has_key(timezoneKey))
    {
        bourne::json value = object[timezoneKey];



        jsonToValue(&timezone, value, "std::string");


    }


}

bourne::json
CatalogsFeedProcessingSchedule::toJson()
{
    bourne::json object = bourne::json::object();





    object["time"] = getTime();






    object["timezone"] = getTimezone();



    return object;

}

std::string
CatalogsFeedProcessingSchedule::getTime()
{
	return time;
}

void
CatalogsFeedProcessingSchedule::setTime(std::string  time)
{
	this->time = time;
}

std::string
CatalogsFeedProcessingSchedule::getTimezone()
{
	return timezone;
}

void
CatalogsFeedProcessingSchedule::setTimezone(std::string  timezone)
{
	this->timezone = timezone;
}



