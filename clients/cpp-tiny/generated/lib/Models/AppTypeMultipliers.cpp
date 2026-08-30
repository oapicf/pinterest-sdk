

#include "AppTypeMultipliers.h"

using namespace Tiny;

AppTypeMultipliers::AppTypeMultipliers()
{
	aPP_TYPE = null;
}

AppTypeMultipliers::AppTypeMultipliers(std::string jsonString)
{
	this->fromJson(jsonString);
}

AppTypeMultipliers::~AppTypeMultipliers()
{

}

void
AppTypeMultipliers::fromJson(std::string jsonObj)
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
AppTypeMultipliers::toJson()
{
    bourne::json object = bourne::json::object();






	object["aPP_TYPE"] = getAPPTYPE().toJson();


    return object;

}

TargetingSpecAppType
AppTypeMultipliers::getAPPTYPE()
{
	return aPP_TYPE;
}

void
AppTypeMultipliers::setAPPTYPE(TargetingSpecAppType aPP_TYPE)
{
	this->aPP_TYPE = aPP_TYPE;
}



