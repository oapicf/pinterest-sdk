

#include "AdsAnalyticsAdGroupTargetingType.h"

using namespace Tiny;

AdsAnalyticsAdGroupTargetingType::AdsAnalyticsAdGroupTargetingType()
{
}

AdsAnalyticsAdGroupTargetingType::AdsAnalyticsAdGroupTargetingType(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdsAnalyticsAdGroupTargetingType::~AdsAnalyticsAdGroupTargetingType()
{

}

void
AdsAnalyticsAdGroupTargetingType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AdsAnalyticsAdGroupTargetingType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



