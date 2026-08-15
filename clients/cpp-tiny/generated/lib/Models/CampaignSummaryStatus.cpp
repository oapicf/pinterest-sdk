

#include "CampaignSummaryStatus.h"

using namespace Tiny;

CampaignSummaryStatus::CampaignSummaryStatus()
{
}

CampaignSummaryStatus::CampaignSummaryStatus(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignSummaryStatus::~CampaignSummaryStatus()
{

}

void
CampaignSummaryStatus::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CampaignSummaryStatus::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



