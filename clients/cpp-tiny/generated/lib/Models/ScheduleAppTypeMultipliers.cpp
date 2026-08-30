

#include "ScheduleAppTypeMultipliers.h"

using namespace Tiny;

ScheduleAppTypeMultipliers::ScheduleAppTypeMultipliers()
{
	aPP_TYPE = TargetingSpecAppType();
}

ScheduleAppTypeMultipliers::ScheduleAppTypeMultipliers(std::string jsonString)
{
	this->fromJson(jsonString);
}

ScheduleAppTypeMultipliers::~ScheduleAppTypeMultipliers()
{

}

void
ScheduleAppTypeMultipliers::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *aPP_TYPEKey = "APP_TYPE";

    if(object.has_key(aPP_TYPEKey))
    {
        bourne::json value = object[aPP_TYPEKey];




        TargetingSpecAppType* obj = &aPP_TYPE;
		obj->fromJson(value.dump());

    }


}

bourne::json
ScheduleAppTypeMultipliers::toJson()
{
    bourne::json object = bourne::json::object();






	object["aPP_TYPE"] = getAPPTYPE().toJson();


    return object;

}

TargetingSpecAppType
ScheduleAppTypeMultipliers::getAPPTYPE()
{
	return aPP_TYPE;
}

void
ScheduleAppTypeMultipliers::setAPPTYPE(TargetingSpecAppType aPP_TYPE)
{
	this->aPP_TYPE = aPP_TYPE;
}



