

#include "CampaignObjectiveType.h"

using namespace Tiny;

CampaignObjectiveType::CampaignObjectiveType()
{
}

CampaignObjectiveType::CampaignObjectiveType(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignObjectiveType::~CampaignObjectiveType()
{

}

void
CampaignObjectiveType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CampaignObjectiveType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



