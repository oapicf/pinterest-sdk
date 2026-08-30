

#include "CampaignPlanningResponseErrorCode.h"

using namespace Tiny;

CampaignPlanningResponseErrorCode::CampaignPlanningResponseErrorCode()
{
}

CampaignPlanningResponseErrorCode::CampaignPlanningResponseErrorCode(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignPlanningResponseErrorCode::~CampaignPlanningResponseErrorCode()
{

}

void
CampaignPlanningResponseErrorCode::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CampaignPlanningResponseErrorCode::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



