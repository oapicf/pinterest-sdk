

#include "ScheduleGenderMultipliers.h"

using namespace Tiny;

ScheduleGenderMultipliers::ScheduleGenderMultipliers()
{
	gENDER = TargetingSpecGender();
}

ScheduleGenderMultipliers::ScheduleGenderMultipliers(std::string jsonString)
{
	this->fromJson(jsonString);
}

ScheduleGenderMultipliers::~ScheduleGenderMultipliers()
{

}

void
ScheduleGenderMultipliers::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *gENDERKey = "GENDER";

    if(object.has_key(gENDERKey))
    {
        bourne::json value = object[gENDERKey];




        TargetingSpecGender* obj = &gENDER;
		obj->fromJson(value.dump());

    }


}

bourne::json
ScheduleGenderMultipliers::toJson()
{
    bourne::json object = bourne::json::object();






	object["gENDER"] = getGENDER().toJson();


    return object;

}

TargetingSpecGender
ScheduleGenderMultipliers::getGENDER()
{
	return gENDER;
}

void
ScheduleGenderMultipliers::setGENDER(TargetingSpecGender gENDER)
{
	this->gENDER = gENDER;
}



