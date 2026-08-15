

#include "AdsAnalyticsAdTargetingType.h"

using namespace Tiny;

AdsAnalyticsAdTargetingType::AdsAnalyticsAdTargetingType()
{
}

AdsAnalyticsAdTargetingType::AdsAnalyticsAdTargetingType(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdsAnalyticsAdTargetingType::~AdsAnalyticsAdTargetingType()
{

}

void
AdsAnalyticsAdTargetingType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AdsAnalyticsAdTargetingType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



