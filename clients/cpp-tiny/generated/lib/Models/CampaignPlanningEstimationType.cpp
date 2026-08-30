

#include "CampaignPlanningEstimationType.h"

using namespace Tiny;

CampaignPlanningEstimationType::CampaignPlanningEstimationType()
{
}

CampaignPlanningEstimationType::CampaignPlanningEstimationType(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignPlanningEstimationType::~CampaignPlanningEstimationType()
{

}

void
CampaignPlanningEstimationType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CampaignPlanningEstimationType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



