

#include "PinPromotionSummaryStatus.h"

using namespace Tiny;

PinPromotionSummaryStatus::PinPromotionSummaryStatus()
{
}

PinPromotionSummaryStatus::PinPromotionSummaryStatus(std::string jsonString)
{
	this->fromJson(jsonString);
}

PinPromotionSummaryStatus::~PinPromotionSummaryStatus()
{

}

void
PinPromotionSummaryStatus::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
PinPromotionSummaryStatus::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



