

#include "CampaignPlanningConversionEvent.h"

using namespace Tiny;

CampaignPlanningConversionEvent::CampaignPlanningConversionEvent()
{
}

CampaignPlanningConversionEvent::CampaignPlanningConversionEvent(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignPlanningConversionEvent::~CampaignPlanningConversionEvent()
{

}

void
CampaignPlanningConversionEvent::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CampaignPlanningConversionEvent::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



