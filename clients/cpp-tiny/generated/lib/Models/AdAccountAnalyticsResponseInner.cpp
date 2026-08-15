

#include "AdAccountAnalyticsResponse_inner.h"

using namespace Tiny;

AdAccountAnalyticsResponse_inner::AdAccountAnalyticsResponse_inner()
{
	aD_ACCOUNT_ID = std::string();
	dATE = std::string();
}

AdAccountAnalyticsResponse_inner::AdAccountAnalyticsResponse_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdAccountAnalyticsResponse_inner::~AdAccountAnalyticsResponse_inner()
{

}

void
AdAccountAnalyticsResponse_inner::fromJson(std::string jsonObj)
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
AdAccountAnalyticsResponse_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["aD_ACCOUNT_ID"] = getADACCOUNTID();







	object["dATE"] = getDATE().toJson();


    return object;

}

std::string
AdAccountAnalyticsResponse_inner::getADACCOUNTID()
{
	return aD_ACCOUNT_ID;
}

void
AdAccountAnalyticsResponse_inner::setADACCOUNTID(std::string  aD_ACCOUNT_ID)
{
	this->aD_ACCOUNT_ID = aD_ACCOUNT_ID;
}

Date
AdAccountAnalyticsResponse_inner::getDATE()
{
	return dATE;
}

void
AdAccountAnalyticsResponse_inner::setDATE(Date  dATE)
{
	this->dATE = dATE;
}



