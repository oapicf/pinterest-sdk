

#include "AdsAnalyticsCampaignTargetingType.h"

using namespace Tiny;

AdsAnalyticsCampaignTargetingType::AdsAnalyticsCampaignTargetingType()
{
}

AdsAnalyticsCampaignTargetingType::AdsAnalyticsCampaignTargetingType(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdsAnalyticsCampaignTargetingType::~AdsAnalyticsCampaignTargetingType()
{

}

void
AdsAnalyticsCampaignTargetingType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AdsAnalyticsCampaignTargetingType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



