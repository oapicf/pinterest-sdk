

#include "AdGroupsAnalyticsResponse_inner.h"

using namespace Tiny;

AdGroupsAnalyticsResponse_inner::AdGroupsAnalyticsResponse_inner()
{
	aD_GROUP_ID = std::string();
	dATE = std::string();
}

AdGroupsAnalyticsResponse_inner::AdGroupsAnalyticsResponse_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdGroupsAnalyticsResponse_inner::~AdGroupsAnalyticsResponse_inner()
{

}

void
AdGroupsAnalyticsResponse_inner::fromJson(std::string jsonObj)
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
AdGroupsAnalyticsResponse_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["aD_GROUP_ID"] = getADGROUPID();







	object["dATE"] = getDATE().toJson();


    return object;

}

std::string
AdGroupsAnalyticsResponse_inner::getADGROUPID()
{
	return aD_GROUP_ID;
}

void
AdGroupsAnalyticsResponse_inner::setADGROUPID(std::string  aD_GROUP_ID)
{
	this->aD_GROUP_ID = aD_GROUP_ID;
}

Date
AdGroupsAnalyticsResponse_inner::getDATE()
{
	return dATE;
}

void
AdGroupsAnalyticsResponse_inner::setDATE(Date  dATE)
{
	this->dATE = dATE;
}



