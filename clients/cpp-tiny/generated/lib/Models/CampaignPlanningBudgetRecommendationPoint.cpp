

#include "CampaignPlanningBudgetRecommendationPoint.h"

using namespace Tiny;

CampaignPlanningBudgetRecommendationPoint::CampaignPlanningBudgetRecommendationPoint()
{
	estimation_type = null;
	point_estimate = null;
}

CampaignPlanningBudgetRecommendationPoint::CampaignPlanningBudgetRecommendationPoint(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignPlanningBudgetRecommendationPoint::~CampaignPlanningBudgetRecommendationPoint()
{

}

void
CampaignPlanningBudgetRecommendationPoint::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *estimation_typeKey = "estimation_type";

    if(object.has_key(estimation_typeKey))
    {
        bourne::json value = object[estimation_typeKey];




        CampaignPlanningEstimationType* obj = &estimation_type;
		obj->fromJson(value.dump());

    }

    const char *point_estimateKey = "point_estimate";

    if(object.has_key(point_estimateKey))
    {
        bourne::json value = object[point_estimateKey];




        CampaignPlanningPointEstimate* obj = &point_estimate;
		obj->fromJson(value.dump());

    }


}

bourne::json
CampaignPlanningBudgetRecommendationPoint::toJson()
{
    bourne::json object = bourne::json::object();






	object["estimation_type"] = getEstimationType().toJson();






	object["point_estimate"] = getPointEstimate().toJson();


    return object;

}

CampaignPlanningEstimationType
CampaignPlanningBudgetRecommendationPoint::getEstimationType()
{
	return estimation_type;
}

void
CampaignPlanningBudgetRecommendationPoint::setEstimationType(CampaignPlanningEstimationType estimation_type)
{
	this->estimation_type = estimation_type;
}

CampaignPlanningPointEstimate
CampaignPlanningBudgetRecommendationPoint::getPointEstimate()
{
	return point_estimate;
}

void
CampaignPlanningBudgetRecommendationPoint::setPointEstimate(CampaignPlanningPointEstimate point_estimate)
{
	this->point_estimate = point_estimate;
}



