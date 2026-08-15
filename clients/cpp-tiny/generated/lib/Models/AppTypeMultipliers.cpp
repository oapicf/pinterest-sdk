

#include "AppTypeMultipliers.h"

using namespace Tiny;

AppTypeMultipliers::AppTypeMultipliers()
{
	aPP_TYPE = std::string();
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



        jsonToValue(&aPP_TYPE, value, "std::string");


    }


}

bourne::json
AppTypeMultipliers::toJson()
{
    bourne::json object = bourne::json::object();





    object["aPP_TYPE"] = getAPPTYPE();



    return object;

}

std::string
AppTypeMultipliers::getAPPTYPE()
{
	return aPP_TYPE;
}

void
AppTypeMultipliers::setAPPTYPE(std::string  aPP_TYPE)
{
	this->aPP_TYPE = aPP_TYPE;
}



