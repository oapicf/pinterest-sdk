

#include "PinAnalyticsMetricsResponse.h"

using namespace Tiny;

PinAnalyticsMetricsResponse::PinAnalyticsMetricsResponse()
{
	daily_metrics = std::list<PinAnalyticsMetricsResponse_daily_metrics_inner>();
	lifetime_metrics = null<int>();
	summary_metrics = null<long>();
}

PinAnalyticsMetricsResponse::PinAnalyticsMetricsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

PinAnalyticsMetricsResponse::~PinAnalyticsMetricsResponse()
{

}

void
PinAnalyticsMetricsResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *daily_metricsKey = "daily_metrics";

    if(object.has_key(daily_metricsKey))
    {
        bourne::json value = object[daily_metricsKey];


        std::list<PinAnalyticsMetricsResponse_daily_metrics_inner> daily_metrics_list;
        PinAnalyticsMetricsResponse_daily_metrics_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            daily_metrics_list.push_back(element);
        }
        daily_metrics = daily_metrics_list;


    }

    const char *lifetime_metricsKey = "lifetime_metrics";

    if(object.has_key(lifetime_metricsKey))
    {
        bourne::json value = object[lifetime_metricsKey];


    }

    const char *summary_metricsKey = "summary_metrics";

    if(object.has_key(summary_metricsKey))
    {
        bourne::json value = object[summary_metricsKey];


    }


}

bourne::json
PinAnalyticsMetricsResponse::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<PinAnalyticsMetricsResponse_daily_metrics_inner> daily_metrics_list = getDailyMetrics();
    bourne::json daily_metrics_arr = bourne::json::array();

    for(auto& var : daily_metrics_list)
    {
        PinAnalyticsMetricsResponse_daily_metrics_inner obj = var;
        daily_metrics_arr.append(obj.toJson());
    }
    object["daily_metrics"] = daily_metrics_arr;










    return object;

}

std::list<PinAnalyticsMetricsResponse_daily_metrics_inner>
PinAnalyticsMetricsResponse::getDailyMetrics()
{
	return daily_metrics;
}

void
PinAnalyticsMetricsResponse::setDailyMetrics(std::list <PinAnalyticsMetricsResponse_daily_metrics_inner> daily_metrics)
{
	this->daily_metrics = daily_metrics;
}

Map<string, string>
PinAnalyticsMetricsResponse::getLifetimeMetrics()
{
	return lifetime_metrics;
}

void
PinAnalyticsMetricsResponse::setLifetimeMetrics(Map <string, string> lifetime_metrics)
{
	this->lifetime_metrics = lifetime_metrics;
}

Map<string, string>
PinAnalyticsMetricsResponse::getSummaryMetrics()
{
	return summary_metrics;
}

void
PinAnalyticsMetricsResponse::setSummaryMetrics(Map <string, string> summary_metrics)
{
	this->summary_metrics = summary_metrics;
}



