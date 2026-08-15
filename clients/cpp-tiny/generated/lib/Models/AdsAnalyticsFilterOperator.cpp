

#include "AdsAnalyticsFilterOperator.h"

using namespace Tiny;

AdsAnalyticsFilterOperator::AdsAnalyticsFilterOperator()
{
}

AdsAnalyticsFilterOperator::AdsAnalyticsFilterOperator(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdsAnalyticsFilterOperator::~AdsAnalyticsFilterOperator()
{

}

void
AdsAnalyticsFilterOperator::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AdsAnalyticsFilterOperator::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



