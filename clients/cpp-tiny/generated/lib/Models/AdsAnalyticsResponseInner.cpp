

#include "AdsAnalyticsResponse_inner.h"

using namespace Tiny;

AdsAnalyticsResponse_inner::AdsAnalyticsResponse_inner()
{
	aD_ID = std::string();
	dATE = std::string();
}

AdsAnalyticsResponse_inner::AdsAnalyticsResponse_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdsAnalyticsResponse_inner::~AdsAnalyticsResponse_inner()
{

}

void
AdsAnalyticsResponse_inner::fromJson(std::string jsonObj)
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
AdsAnalyticsResponse_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["aD_ID"] = getADID();







	object["dATE"] = getDATE().toJson();


    return object;

}

std::string
AdsAnalyticsResponse_inner::getADID()
{
	return aD_ID;
}

void
AdsAnalyticsResponse_inner::setADID(std::string  aD_ID)
{
	this->aD_ID = aD_ID;
}

Date
AdsAnalyticsResponse_inner::getDATE()
{
	return dATE;
}

void
AdsAnalyticsResponse_inner::setDATE(Date  dATE)
{
	this->dATE = dATE;
}



