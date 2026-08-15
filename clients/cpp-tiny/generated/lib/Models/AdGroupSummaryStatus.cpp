

#include "AdGroupSummaryStatus.h"

using namespace Tiny;

AdGroupSummaryStatus::AdGroupSummaryStatus()
{
}

AdGroupSummaryStatus::AdGroupSummaryStatus(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdGroupSummaryStatus::~AdGroupSummaryStatus()
{

}

void
AdGroupSummaryStatus::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AdGroupSummaryStatus::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



