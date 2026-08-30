

#include "AdsAnalytics.h"

using namespace Tiny;

AdsAnalytics::AdsAnalytics()
{
	aD_ID = std::string();
	dATE = std::string();
}

AdsAnalytics::AdsAnalytics(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdsAnalytics::~AdsAnalytics()
{

}

void
AdsAnalytics::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *aD_IDKey = "AD_ID";

    if(object.has_key(aD_IDKey))
    {
        bourne::json value = object[aD_IDKey];



        jsonToValue(&aD_ID, value, "std::string");


    }

    const char *dATEKey = "DATE";

    if(object.has_key(dATEKey))
    {
        bourne::json value = object[dATEKey];




        Date* obj = &dATE;
		obj->fromJson(value.dump());

    }


}

bourne::json
AdsAnalytics::toJson()
{
    bourne::json object = bourne::json::object();





    object["aD_ID"] = getADID();







	object["dATE"] = getDATE().toJson();


    return object;

}

std::string
AdsAnalytics::getADID()
{
	return aD_ID;
}

void
AdsAnalytics::setADID(std::string aD_ID)
{
	this->aD_ID = aD_ID;
}

Date
AdsAnalytics::getDATE()
{
	return dATE;
}

void
AdsAnalytics::setDATE(Date dATE)
{
	this->dATE = dATE;
}



