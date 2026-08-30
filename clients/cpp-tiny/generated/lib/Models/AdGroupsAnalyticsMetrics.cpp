

#include "AdGroupsAnalyticsMetrics.h"

using namespace Tiny;

AdGroupsAnalyticsMetrics::AdGroupsAnalyticsMetrics()
{
	aD_GROUP_ID = std::string();
	dATE = std::string();
}

AdGroupsAnalyticsMetrics::AdGroupsAnalyticsMetrics(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdGroupsAnalyticsMetrics::~AdGroupsAnalyticsMetrics()
{

}

void
AdGroupsAnalyticsMetrics::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *aD_GROUP_IDKey = "AD_GROUP_ID";

    if(object.has_key(aD_GROUP_IDKey))
    {
        bourne::json value = object[aD_GROUP_IDKey];



        jsonToValue(&aD_GROUP_ID, value, "std::string");


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
AdGroupsAnalyticsMetrics::toJson()
{
    bourne::json object = bourne::json::object();





    object["aD_GROUP_ID"] = getADGROUPID();







	object["dATE"] = getDATE().toJson();


    return object;

}

std::string
AdGroupsAnalyticsMetrics::getADGROUPID()
{
	return aD_GROUP_ID;
}

void
AdGroupsAnalyticsMetrics::setADGROUPID(std::string aD_GROUP_ID)
{
	this->aD_GROUP_ID = aD_GROUP_ID;
}

Date
AdGroupsAnalyticsMetrics::getDATE()
{
	return dATE;
}

void
AdGroupsAnalyticsMetrics::setDATE(Date dATE)
{
	this->dATE = dATE;
}



