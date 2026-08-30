

#include "CampaignPlanningConversionAttributionWindowDays.h"

using namespace Tiny;

CampaignPlanningConversionAttributionWindowDays::CampaignPlanningConversionAttributionWindowDays()
{
}

CampaignPlanningConversionAttributionWindowDays::CampaignPlanningConversionAttributionWindowDays(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignPlanningConversionAttributionWindowDays::~CampaignPlanningConversionAttributionWindowDays()
{

}

void
CampaignPlanningConversionAttributionWindowDays::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CampaignPlanningConversionAttributionWindowDays::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



