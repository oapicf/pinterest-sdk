

#include "CampaignPlanningBudgetRecommendation.h"

using namespace Tiny;

CampaignPlanningBudgetRecommendation::CampaignPlanningBudgetRecommendation()
{
	budget_recommendation = int(0);
	experiment_campaign_budget_recommendation = std::list<CampaignPlanningExperimentBudgetRecommendation>();
	lifetime_days_recommendation = int(0);
	point_estimations = std::list<CampaignPlanningBudgetRecommendationPoint>();
}

CampaignPlanningBudgetRecommendation::CampaignPlanningBudgetRecommendation(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignPlanningBudgetRecommendation::~CampaignPlanningBudgetRecommendation()
{

}

void
CampaignPlanningBudgetRecommendation::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *budget_recommendationKey = "budget_recommendation";

    if(object.has_key(budget_recommendationKey))
    {
        bourne::json value = object[budget_recommendationKey];



        jsonToValue(&budget_recommendation, value, "int");


    }

    const char *experiment_campaign_budget_recommendationKey = "experiment_campaign_budget_recommendation";

    if(object.has_key(experiment_campaign_budget_recommendationKey))
    {
        bourne::json value = object[experiment_campaign_budget_recommendationKey];


        std::list<CampaignPlanningExperimentBudgetRecommendation> experiment_campaign_budget_recommendation_list;
        CampaignPlanningExperimentBudgetRecommendation element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            experiment_campaign_budget_recommendation_list.push_back(element);
        }
        experiment_campaign_budget_recommendation = experiment_campaign_budget_recommendation_list;


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


}

bourne::json
CampaignPlanningBudgetRecommendation::toJson()
{
    bourne::json object = bourne::json::object();





    object["budget_recommendation"] = getBudgetRecommendation();





    std::list<CampaignPlanningExperimentBudgetRecommendation> experiment_campaign_budget_recommendation_list = getExperimentCampaignBudgetRecommendation();
    bourne::json experiment_campaign_budget_recommendation_arr = bourne::json::array();

    for(auto& var : experiment_campaign_budget_recommendation_list)
    {
        CampaignPlanningExperimentBudgetRecommendation obj = var;
        experiment_campaign_budget_recommendation_arr.append(obj.toJson());
    }
    object["experiment_campaign_budget_recommendation"] = experiment_campaign_budget_recommendation_arr;







    object["lifetime_days_recommendation"] = getLifetimeDaysRecommendation();





    std::list<CampaignPlanningBudgetRecommendationPoint> point_estimations_list = getPointEstimations();
    bourne::json point_estimations_arr = bourne::json::array();

    for(auto& var : point_estimations_list)
    {
        CampaignPlanningBudgetRecommendationPoint obj = var;
        point_estimations_arr.append(obj.toJson());
    }
    object["point_estimations"] = point_estimations_arr;




    return object;

}

int
CampaignPlanningBudgetRecommendation::getBudgetRecommendation()
{
	return budget_recommendation;
}

void
CampaignPlanningBudgetRecommendation::setBudgetRecommendation(int budget_recommendation)
{
	this->budget_recommendation = budget_recommendation;
}

std::list<CampaignPlanningExperimentBudgetRecommendation>
CampaignPlanningBudgetRecommendation::getExperimentCampaignBudgetRecommendation()
{
	return experiment_campaign_budget_recommendation;
}

void
CampaignPlanningBudgetRecommendation::setExperimentCampaignBudgetRecommendation(std::list<CampaignPlanningExperimentBudgetRecommendation> experiment_campaign_budget_recommendation)
{
	this->experiment_campaign_budget_recommendation = experiment_campaign_budget_recommendation;
}

int
CampaignPlanningBudgetRecommendation::getLifetimeDaysRecommendation()
{
	return lifetime_days_recommendation;
}

void
CampaignPlanningBudgetRecommendation::setLifetimeDaysRecommendation(int lifetime_days_recommendation)
{
	this->lifetime_days_recommendation = lifetime_days_recommendation;
}

std::list<CampaignPlanningBudgetRecommendationPoint>
CampaignPlanningBudgetRecommendation::getPointEstimations()
{
	return point_estimations;
}

void
CampaignPlanningBudgetRecommendation::setPointEstimations(std::list<CampaignPlanningBudgetRecommendationPoint> point_estimations)
{
	this->point_estimations = point_estimations;
}



