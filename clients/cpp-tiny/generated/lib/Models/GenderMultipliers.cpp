

#include "GenderMultipliers.h"

using namespace Tiny;

GenderMultipliers::GenderMultipliers()
{
	gENDER = null;
}

GenderMultipliers::GenderMultipliers(std::string jsonString)
{
	this->fromJson(jsonString);
}

GenderMultipliers::~GenderMultipliers()
{

}

void
GenderMultipliers::fromJson(std::string jsonObj)
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
GenderMultipliers::toJson()
{
    bourne::json object = bourne::json::object();






	object["gENDER"] = getGENDER().toJson();


    return object;

}

TargetingSpecGender
GenderMultipliers::getGENDER()
{
	return gENDER;
}

void
GenderMultipliers::setGENDER(TargetingSpecGender gENDER)
{
	this->gENDER = gENDER;
}



