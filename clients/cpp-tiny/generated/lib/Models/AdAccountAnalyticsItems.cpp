

#include "AdAccountAnalyticsItems.h"

using namespace Tiny;

AdAccountAnalyticsItems::AdAccountAnalyticsItems()
{
	aD_ACCOUNT_ID = std::string();
	dATE = std::string();
}

AdAccountAnalyticsItems::AdAccountAnalyticsItems(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdAccountAnalyticsItems::~AdAccountAnalyticsItems()
{

}

void
AdAccountAnalyticsItems::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *aD_ACCOUNT_IDKey = "AD_ACCOUNT_ID";

    if(object.has_key(aD_ACCOUNT_IDKey))
    {
        bourne::json value = object[aD_ACCOUNT_IDKey];



        jsonToValue(&aD_ACCOUNT_ID, value, "std::string");


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
AdAccountAnalyticsItems::toJson()
{
    bourne::json object = bourne::json::object();





    object["aD_ACCOUNT_ID"] = getADACCOUNTID();







	object["dATE"] = getDATE().toJson();


    return object;

}

std::string
AdAccountAnalyticsItems::getADACCOUNTID()
{
	return aD_ACCOUNT_ID;
}

void
AdAccountAnalyticsItems::setADACCOUNTID(std::string aD_ACCOUNT_ID)
{
	this->aD_ACCOUNT_ID = aD_ACCOUNT_ID;
}

Date
AdAccountAnalyticsItems::getDATE()
{
	return dATE;
}

void
AdAccountAnalyticsItems::setDATE(Date dATE)
{
	this->dATE = dATE;
}



