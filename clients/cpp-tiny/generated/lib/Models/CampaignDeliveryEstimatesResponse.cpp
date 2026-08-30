

#include "CampaignDeliveryEstimatesResponse.h"

using namespace Tiny;

CampaignDeliveryEstimatesResponse::CampaignDeliveryEstimatesResponse()
{
	curves = std::list<CampaignPlanningCurveEstimate>();
	derived_metrics = CampaignDeliveryEstimatesDerivedMetrics();
	max_potential_spend = int(0);
}

CampaignDeliveryEstimatesResponse::CampaignDeliveryEstimatesResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignDeliveryEstimatesResponse::~CampaignDeliveryEstimatesResponse()
{

}

void
CampaignDeliveryEstimatesResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *curvesKey = "curves";

    if(object.has_key(curvesKey))
    {
        bourne::json value = object[curvesKey];


        std::list<CampaignPlanningCurveEstimate> curves_list;
        CampaignPlanningCurveEstimate element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            curves_list.push_back(element);
        }
        curves = curves_list;


    }

    const char *derived_metricsKey = "derived_metrics";

    if(object.has_key(derived_metricsKey))
    {
        bourne::json value = object[derived_metricsKey];




        CampaignDeliveryEstimatesDerivedMetrics* obj = &derived_metrics;
		obj->fromJson(value.dump());

    }

    const char *max_potential_spendKey = "max_potential_spend";

    if(object.has_key(max_potential_spendKey))
    {
        bourne::json value = object[max_potential_spendKey];



        jsonToValue(&max_potential_spend, value, "int");


    }


}

bourne::json
CampaignDeliveryEstimatesResponse::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<CampaignPlanningCurveEstimate> curves_list = getCurves();
    bourne::json curves_arr = bourne::json::array();

    for(auto& var : curves_list)
    {
        CampaignPlanningCurveEstimate obj = var;
        curves_arr.append(obj.toJson());
    }
    object["curves"] = curves_arr;








	object["derived_metrics"] = getDerivedMetrics().toJson();





    object["max_potential_spend"] = getMaxPotentialSpend();



    return object;

}

std::list<CampaignPlanningCurveEstimate>
CampaignDeliveryEstimatesResponse::getCurves()
{
	return curves;
}

void
CampaignDeliveryEstimatesResponse::setCurves(std::list<CampaignPlanningCurveEstimate> curves)
{
	this->curves = curves;
}

CampaignDeliveryEstimatesDerivedMetrics
CampaignDeliveryEstimatesResponse::getDerivedMetrics()
{
	return derived_metrics;
}

void
CampaignDeliveryEstimatesResponse::setDerivedMetrics(CampaignDeliveryEstimatesDerivedMetrics derived_metrics)
{
	this->derived_metrics = derived_metrics;
}

int
CampaignDeliveryEstimatesResponse::getMaxPotentialSpend()
{
	return max_potential_spend;
}

void
CampaignDeliveryEstimatesResponse::setMaxPotentialSpend(int max_potential_spend)
{
	this->max_potential_spend = max_potential_spend;
}



