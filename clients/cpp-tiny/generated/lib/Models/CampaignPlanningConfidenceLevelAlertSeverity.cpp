

#include "CampaignPlanningConfidenceLevelAlertSeverity.h"

using namespace Tiny;

CampaignPlanningConfidenceLevelAlertSeverity::CampaignPlanningConfidenceLevelAlertSeverity()
{
}

CampaignPlanningConfidenceLevelAlertSeverity::CampaignPlanningConfidenceLevelAlertSeverity(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignPlanningConfidenceLevelAlertSeverity::~CampaignPlanningConfidenceLevelAlertSeverity()
{

}

void
CampaignPlanningConfidenceLevelAlertSeverity::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CampaignPlanningConfidenceLevelAlertSeverity::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



