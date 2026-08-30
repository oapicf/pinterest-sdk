

#include "CampaignPlanningConfidenceLevelAlertReason.h"

using namespace Tiny;

CampaignPlanningConfidenceLevelAlertReason::CampaignPlanningConfidenceLevelAlertReason()
{
}

CampaignPlanningConfidenceLevelAlertReason::CampaignPlanningConfidenceLevelAlertReason(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignPlanningConfidenceLevelAlertReason::~CampaignPlanningConfidenceLevelAlertReason()
{

}

void
CampaignPlanningConfidenceLevelAlertReason::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CampaignPlanningConfidenceLevelAlertReason::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



