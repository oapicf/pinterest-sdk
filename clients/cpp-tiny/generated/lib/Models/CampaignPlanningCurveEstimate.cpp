

#include "CampaignPlanningCurveEstimate.h"

using namespace Tiny;

CampaignPlanningCurveEstimate::CampaignPlanningCurveEstimate()
{
	estimation_type = null;
	points = std::list<CampaignPlanningPointEstimate>();
}

CampaignPlanningCurveEstimate::CampaignPlanningCurveEstimate(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignPlanningCurveEstimate::~CampaignPlanningCurveEstimate()
{

}

void
CampaignPlanningCurveEstimate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *estimation_typeKey = "estimation_type";

    if(object.has_key(estimation_typeKey))
    {
        bourne::json value = object[estimation_typeKey];




        CampaignPlanningEstimationType* obj = &estimation_type;
		obj->fromJson(value.dump());

    }

    const char *pointsKey = "points";

    if(object.has_key(pointsKey))
    {
        bourne::json value = object[pointsKey];


        std::list<CampaignPlanningPointEstimate> points_list;
        CampaignPlanningPointEstimate element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            points_list.push_back(element);
        }
        points = points_list;


    }


}

bourne::json
CampaignPlanningCurveEstimate::toJson()
{
    bourne::json object = bourne::json::object();






	object["estimation_type"] = getEstimationType().toJson();




    std::list<CampaignPlanningPointEstimate> points_list = getPoints();
    bourne::json points_arr = bourne::json::array();

    for(auto& var : points_list)
    {
        CampaignPlanningPointEstimate obj = var;
        points_arr.append(obj.toJson());
    }
    object["points"] = points_arr;




    return object;

}

CampaignPlanningEstimationType
CampaignPlanningCurveEstimate::getEstimationType()
{
	return estimation_type;
}

void
CampaignPlanningCurveEstimate::setEstimationType(CampaignPlanningEstimationType estimation_type)
{
	this->estimation_type = estimation_type;
}

std::list<CampaignPlanningPointEstimate>
CampaignPlanningCurveEstimate::getPoints()
{
	return points;
}

void
CampaignPlanningCurveEstimate::setPoints(std::list<CampaignPlanningPointEstimate> points)
{
	this->points = points;
}



