

#include "AdsAnalyticsAccountTargetingType.h"

using namespace Tiny;

AdsAnalyticsAccountTargetingType::AdsAnalyticsAccountTargetingType()
{
}

AdsAnalyticsAccountTargetingType::AdsAnalyticsAccountTargetingType(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdsAnalyticsAccountTargetingType::~AdsAnalyticsAccountTargetingType()
{

}

void
AdsAnalyticsAccountTargetingType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AdsAnalyticsAccountTargetingType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



