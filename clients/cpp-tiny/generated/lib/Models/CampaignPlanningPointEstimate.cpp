

#include "CampaignPlanningPointEstimate.h"

using namespace Tiny;

CampaignPlanningPointEstimate::CampaignPlanningPointEstimate()
{
	budget = int(0);
	double_y = float(0);
	max_y = int(0);
	min_y = int(0);
	y = int(0);
}

CampaignPlanningPointEstimate::CampaignPlanningPointEstimate(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignPlanningPointEstimate::~CampaignPlanningPointEstimate()
{

}

void
CampaignPlanningPointEstimate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *budgetKey = "budget";

    if(object.has_key(budgetKey))
    {
        bourne::json value = object[budgetKey];



        jsonToValue(&budget, value, "int");


    }

    const char *double_yKey = "double_y";

    if(object.has_key(double_yKey))
    {
        bourne::json value = object[double_yKey];



        jsonToValue(&double_y, value, "double");


    }

    const char *max_yKey = "max_y";

    if(object.has_key(max_yKey))
    {
        bourne::json value = object[max_yKey];



        jsonToValue(&max_y, value, "int");


    }

    const char *min_yKey = "min_y";

    if(object.has_key(min_yKey))
    {
        bourne::json value = object[min_yKey];



        jsonToValue(&min_y, value, "int");


    }

    const char *yKey = "y";

    if(object.has_key(yKey))
    {
        bourne::json value = object[yKey];



        jsonToValue(&y, value, "int");


    }


}

bourne::json
CampaignPlanningPointEstimate::toJson()
{
    bourne::json object = bourne::json::object();





    object["budget"] = getBudget();






    object["double_y"] = getDoubleY();






    object["max_y"] = getMaxY();






    object["min_y"] = getMinY();






    object["y"] = getY();



    return object;

}

int
CampaignPlanningPointEstimate::getBudget()
{
	return budget;
}

void
CampaignPlanningPointEstimate::setBudget(int budget)
{
	this->budget = budget;
}

double
CampaignPlanningPointEstimate::getDoubleY()
{
	return double_y;
}

void
CampaignPlanningPointEstimate::setDoubleY(double double_y)
{
	this->double_y = double_y;
}

int
CampaignPlanningPointEstimate::getMaxY()
{
	return max_y;
}

void
CampaignPlanningPointEstimate::setMaxY(int max_y)
{
	this->max_y = max_y;
}

int
CampaignPlanningPointEstimate::getMinY()
{
	return min_y;
}

void
CampaignPlanningPointEstimate::setMinY(int min_y)
{
	this->min_y = min_y;
}

int
CampaignPlanningPointEstimate::getY()
{
	return y;
}

void
CampaignPlanningPointEstimate::setY(int y)
{
	this->y = y;
}



