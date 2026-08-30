

#include "CampaignPlanningExperimentBudgetRecommendation.h"

using namespace Tiny;

CampaignPlanningExperimentBudgetRecommendation::CampaignPlanningExperimentBudgetRecommendation()
{
	budget_recommendation = int(0);
	lifetime_days_recommendation = int(0);
	point_estimations = std::list<CampaignPlanningBudgetRecommendationPoint>();
	version_id = std::string();
}

CampaignPlanningExperimentBudgetRecommendation::CampaignPlanningExperimentBudgetRecommendation(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignPlanningExperimentBudgetRecommendation::~CampaignPlanningExperimentBudgetRecommendation()
{

}

void
CampaignPlanningExperimentBudgetRecommendation::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *budget_recommendationKey = "budget_recommendation";

    if(object.has_key(budget_recommendationKey))
    {
        bourne::json value = object[budget_recommendationKey];



        jsonToValue(&budget_recommendation, value, "int");


    }

    const char *lifetime_days_recommendationKey = "lifetime_days_recommendation";

    if(object.has_key(lifetime_days_recommendationKey))
    {
        bourne::json value = object[lifetime_days_recommendationKey];



        jsonToValue(&lifetime_days_recommendation, value, "int");


    }

    const char *point_estimationsKey = "point_estimations";

    if(object.has_key(point_estimationsKey))
    {
        bourne::json value = object[point_estimationsKey];


        std::list<CampaignPlanningBudgetRecommendationPoint> point_estimations_list;
        CampaignPlanningBudgetRecommendationPoint element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            point_estimations_list.push_back(element);
        }
        point_estimations = point_estimations_list;


    }

    const char *version_idKey = "version_id";

    if(object.has_key(version_idKey))
    {
        bourne::json value = object[version_idKey];



        jsonToValue(&version_id, value, "std::string");


    }


}

bourne::json
CampaignPlanningExperimentBudgetRecommendation::toJson()
{
    bourne::json object = bourne::json::object();





    object["budget_recommendation"] = getBudgetRecommendation();






    object["lifetime_days_recommendation"] = getLifetimeDaysRecommendation();





    std::list<CampaignPlanningBudgetRecommendationPoint> point_estimations_list = getPointEstimations();
    bourne::json point_estimations_arr = bourne::json::array();

    for(auto& var : point_estimations_list)
    {
        CampaignPlanningBudgetRecommendationPoint obj = var;
        point_estimations_arr.append(obj.toJson());
    }
    object["point_estimations"] = point_estimations_arr;







    object["version_id"] = getVersionId();



    return object;

}

int
CampaignPlanningExperimentBudgetRecommendation::getBudgetRecommendation()
{
	return budget_recommendation;
}

void
CampaignPlanningExperimentBudgetRecommendation::setBudgetRecommendation(int budget_recommendation)
{
	this->budget_recommendation = budget_recommendation;
}

int
CampaignPlanningExperimentBudgetRecommendation::getLifetimeDaysRecommendation()
{
	return lifetime_days_recommendation;
}

void
CampaignPlanningExperimentBudgetRecommendation::setLifetimeDaysRecommendation(int lifetime_days_recommendation)
{
	this->lifetime_days_recommendation = lifetime_days_recommendation;
}

std::list<CampaignPlanningBudgetRecommendationPoint>
CampaignPlanningExperimentBudgetRecommendation::getPointEstimations()
{
	return point_estimations;
}

void
CampaignPlanningExperimentBudgetRecommendation::setPointEstimations(std::list<CampaignPlanningBudgetRecommendationPoint> point_estimations)
{
	this->point_estimations = point_estimations;
}

std::string
CampaignPlanningExperimentBudgetRecommendation::getVersionId()
{
	return version_id;
}

void
CampaignPlanningExperimentBudgetRecommendation::setVersionId(std::string version_id)
{
	this->version_id = version_id;
}



