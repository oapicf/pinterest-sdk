

#include "BulkCampaignDeliveryEstimatesItem.h"

using namespace Tiny;

BulkCampaignDeliveryEstimatesItem::BulkCampaignDeliveryEstimatesItem()
{
	adgroup_audience_sizes = std::list<CampaignPlanningAdGroupAudienceSize>();
	conversion_rate = float(0);
	conversion_rates = std::list<CampaignPlanningConversionRate>();
	curves = std::list<CampaignPlanningCurveEstimate>();
	derived_metrics = CampaignDeliveryEstimatesDerivedMetrics();
	errors = std::list<CampaignPlanningResponseError>();
	estimate_id = std::string();
	max_potential_spend = int(0);
}

BulkCampaignDeliveryEstimatesItem::BulkCampaignDeliveryEstimatesItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

BulkCampaignDeliveryEstimatesItem::~BulkCampaignDeliveryEstimatesItem()
{

}

void
BulkCampaignDeliveryEstimatesItem::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *adgroup_audience_sizesKey = "adgroup_audience_sizes";

    if(object.has_key(adgroup_audience_sizesKey))
    {
        bourne::json value = object[adgroup_audience_sizesKey];


        std::list<CampaignPlanningAdGroupAudienceSize> adgroup_audience_sizes_list;
        CampaignPlanningAdGroupAudienceSize element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            adgroup_audience_sizes_list.push_back(element);
        }
        adgroup_audience_sizes = adgroup_audience_sizes_list;


    }

    const char *conversion_rateKey = "conversion_rate";

    if(object.has_key(conversion_rateKey))
    {
        bourne::json value = object[conversion_rateKey];



        jsonToValue(&conversion_rate, value, "float");


    }

    const char *conversion_ratesKey = "conversion_rates";

    if(object.has_key(conversion_ratesKey))
    {
        bourne::json value = object[conversion_ratesKey];


        std::list<CampaignPlanningConversionRate> conversion_rates_list;
        CampaignPlanningConversionRate element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            conversion_rates_list.push_back(element);
        }
        conversion_rates = conversion_rates_list;


    }

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

    const char *errorsKey = "errors";

    if(object.has_key(errorsKey))
    {
        bourne::json value = object[errorsKey];


        std::list<CampaignPlanningResponseError> errors_list;
        CampaignPlanningResponseError element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            errors_list.push_back(element);
        }
        errors = errors_list;


    }

    const char *estimate_idKey = "estimate_id";

    if(object.has_key(estimate_idKey))
    {
        bourne::json value = object[estimate_idKey];



        jsonToValue(&estimate_id, value, "std::string");


    }

    const char *max_potential_spendKey = "max_potential_spend";

    if(object.has_key(max_potential_spendKey))
    {
        bourne::json value = object[max_potential_spendKey];



        jsonToValue(&max_potential_spend, value, "int");


    }


}

bourne::json
BulkCampaignDeliveryEstimatesItem::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<CampaignPlanningAdGroupAudienceSize> adgroup_audience_sizes_list = getAdgroupAudienceSizes();
    bourne::json adgroup_audience_sizes_arr = bourne::json::array();

    for(auto& var : adgroup_audience_sizes_list)
    {
        CampaignPlanningAdGroupAudienceSize obj = var;
        adgroup_audience_sizes_arr.append(obj.toJson());
    }
    object["adgroup_audience_sizes"] = adgroup_audience_sizes_arr;







    object["conversion_rate"] = getConversionRate();





    std::list<CampaignPlanningConversionRate> conversion_rates_list = getConversionRates();
    bourne::json conversion_rates_arr = bourne::json::array();

    for(auto& var : conversion_rates_list)
    {
        CampaignPlanningConversionRate obj = var;
        conversion_rates_arr.append(obj.toJson());
    }
    object["conversion_rates"] = conversion_rates_arr;






    std::list<CampaignPlanningCurveEstimate> curves_list = getCurves();
    bourne::json curves_arr = bourne::json::array();

    for(auto& var : curves_list)
    {
        CampaignPlanningCurveEstimate obj = var;
        curves_arr.append(obj.toJson());
    }
    object["curves"] = curves_arr;








	object["derived_metrics"] = getDerivedMetrics().toJson();




    std::list<CampaignPlanningResponseError> errors_list = getErrors();
    bourne::json errors_arr = bourne::json::array();

    for(auto& var : errors_list)
    {
        CampaignPlanningResponseError obj = var;
        errors_arr.append(obj.toJson());
    }
    object["errors"] = errors_arr;







    object["estimate_id"] = getEstimateId();






    object["max_potential_spend"] = getMaxPotentialSpend();



    return object;

}

std::list<CampaignPlanningAdGroupAudienceSize>
BulkCampaignDeliveryEstimatesItem::getAdgroupAudienceSizes()
{
	return adgroup_audience_sizes;
}

void
BulkCampaignDeliveryEstimatesItem::setAdgroupAudienceSizes(std::list<CampaignPlanningAdGroupAudienceSize> adgroup_audience_sizes)
{
	this->adgroup_audience_sizes = adgroup_audience_sizes;
}

float
BulkCampaignDeliveryEstimatesItem::getConversionRate()
{
	return conversion_rate;
}

void
BulkCampaignDeliveryEstimatesItem::setConversionRate(float conversion_rate)
{
	this->conversion_rate = conversion_rate;
}

std::list<CampaignPlanningConversionRate>
BulkCampaignDeliveryEstimatesItem::getConversionRates()
{
	return conversion_rates;
}

void
BulkCampaignDeliveryEstimatesItem::setConversionRates(std::list<CampaignPlanningConversionRate> conversion_rates)
{
	this->conversion_rates = conversion_rates;
}

std::list<CampaignPlanningCurveEstimate>
BulkCampaignDeliveryEstimatesItem::getCurves()
{
	return curves;
}

void
BulkCampaignDeliveryEstimatesItem::setCurves(std::list<CampaignPlanningCurveEstimate> curves)
{
	this->curves = curves;
}

CampaignDeliveryEstimatesDerivedMetrics
BulkCampaignDeliveryEstimatesItem::getDerivedMetrics()
{
	return derived_metrics;
}

void
BulkCampaignDeliveryEstimatesItem::setDerivedMetrics(CampaignDeliveryEstimatesDerivedMetrics derived_metrics)
{
	this->derived_metrics = derived_metrics;
}

std::list<CampaignPlanningResponseError>
BulkCampaignDeliveryEstimatesItem::getErrors()
{
	return errors;
}

void
BulkCampaignDeliveryEstimatesItem::setErrors(std::list<CampaignPlanningResponseError> errors)
{
	this->errors = errors;
}

std::string
BulkCampaignDeliveryEstimatesItem::getEstimateId()
{
	return estimate_id;
}

void
BulkCampaignDeliveryEstimatesItem::setEstimateId(std::string estimate_id)
{
	this->estimate_id = estimate_id;
}

int
BulkCampaignDeliveryEstimatesItem::getMaxPotentialSpend()
{
	return max_potential_spend;
}

void
BulkCampaignDeliveryEstimatesItem::setMaxPotentialSpend(int max_potential_spend)
{
	this->max_potential_spend = max_potential_spend;
}



