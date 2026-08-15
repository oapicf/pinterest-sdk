

#include "AdsAnalyticsTargetingType.h"

using namespace Tiny;

AdsAnalyticsTargetingType::AdsAnalyticsTargetingType()
{
}

AdsAnalyticsTargetingType::AdsAnalyticsTargetingType(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdsAnalyticsTargetingType::~AdsAnalyticsTargetingType()
{

}

void
AdsAnalyticsTargetingType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AdsAnalyticsTargetingType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



