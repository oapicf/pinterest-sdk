

#include "ScheduleBidOptions_gender_multipliers.h"

using namespace Tiny;

ScheduleBidOptions_gender_multipliers::ScheduleBidOptions_gender_multipliers()
{
	gENDER = TargetingSpecGender();
}

ScheduleBidOptions_gender_multipliers::ScheduleBidOptions_gender_multipliers(std::string jsonString)
{
	this->fromJson(jsonString);
}

ScheduleBidOptions_gender_multipliers::~ScheduleBidOptions_gender_multipliers()
{

}

void
ScheduleBidOptions_gender_multipliers::fromJson(std::string jsonObj)
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
ScheduleBidOptions_gender_multipliers::toJson()
{
    bourne::json object = bourne::json::object();






	object["gENDER"] = getGENDER().toJson();


    return object;

}

TargetingSpecGender
ScheduleBidOptions_gender_multipliers::getGENDER()
{
	return gENDER;
}

void
ScheduleBidOptions_gender_multipliers::setGENDER(TargetingSpecGender gENDER)
{
	this->gENDER = gENDER;
}



