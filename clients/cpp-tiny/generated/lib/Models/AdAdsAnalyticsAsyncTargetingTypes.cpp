

#include "AdAdsAnalyticsAsyncTargetingTypes.h"

using namespace Tiny;

AdAdsAnalyticsAsyncTargetingTypes::AdAdsAnalyticsAsyncTargetingTypes()
{
}

AdAdsAnalyticsAsyncTargetingTypes::AdAdsAnalyticsAsyncTargetingTypes(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdAdsAnalyticsAsyncTargetingTypes::~AdAdsAnalyticsAsyncTargetingTypes()
{

}

void
AdAdsAnalyticsAsyncTargetingTypes::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AdAdsAnalyticsAsyncTargetingTypes::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



