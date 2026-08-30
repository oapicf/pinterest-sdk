

#include "CampaignPlanningAdGroupAudienceSize.h"

using namespace Tiny;

CampaignPlanningAdGroupAudienceSize::CampaignPlanningAdGroupAudienceSize()
{
	count_lower = int(0);
	count_upper = int(0);
}

CampaignPlanningAdGroupAudienceSize::CampaignPlanningAdGroupAudienceSize(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignPlanningAdGroupAudienceSize::~CampaignPlanningAdGroupAudienceSize()
{

}

void
CampaignPlanningAdGroupAudienceSize::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *count_lowerKey = "count_lower";

    if(object.has_key(count_lowerKey))
    {
        bourne::json value = object[count_lowerKey];



        jsonToValue(&count_lower, value, "int");


    }

    const char *count_upperKey = "count_upper";

    if(object.has_key(count_upperKey))
    {
        bourne::json value = object[count_upperKey];



        jsonToValue(&count_upper, value, "int");


    }


}

bourne::json
CampaignPlanningAdGroupAudienceSize::toJson()
{
    bourne::json object = bourne::json::object();





    object["count_lower"] = getCountLower();






    object["count_upper"] = getCountUpper();



    return object;

}

int
CampaignPlanningAdGroupAudienceSize::getCountLower()
{
	return count_lower;
}

void
CampaignPlanningAdGroupAudienceSize::setCountLower(int count_lower)
{
	this->count_lower = count_lower;
}

int
CampaignPlanningAdGroupAudienceSize::getCountUpper()
{
	return count_upper;
}

void
CampaignPlanningAdGroupAudienceSize::setCountUpper(int count_upper)
{
	this->count_upper = count_upper;
}



