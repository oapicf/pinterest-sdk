

#include "ScheduleAgeBucketMultipliers.h"

using namespace Tiny;

ScheduleAgeBucketMultipliers::ScheduleAgeBucketMultipliers()
{
	aGE_BUCKET = std::string();
}

ScheduleAgeBucketMultipliers::ScheduleAgeBucketMultipliers(std::string jsonString)
{
	this->fromJson(jsonString);
}

ScheduleAgeBucketMultipliers::~ScheduleAgeBucketMultipliers()
{

}

void
ScheduleAgeBucketMultipliers::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *aGE_BUCKETKey = "AGE_BUCKET";

    if(object.has_key(aGE_BUCKETKey))
    {
        bourne::json value = object[aGE_BUCKETKey];



        jsonToValue(&aGE_BUCKET, value, "std::string");


    }


}

bourne::json
ScheduleAgeBucketMultipliers::toJson()
{
    bourne::json object = bourne::json::object();





    object["aGE_BUCKET"] = getAGEBUCKET();



    return object;

}

std::string
ScheduleAgeBucketMultipliers::getAGEBUCKET()
{
	return aGE_BUCKET;
}

void
ScheduleAgeBucketMultipliers::setAGEBUCKET(std::string aGE_BUCKET)
{
	this->aGE_BUCKET = aGE_BUCKET;
}



