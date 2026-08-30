

#include "PinAnalyticsMetricsResponse.h"

using namespace Tiny;

PinAnalyticsMetricsResponse::PinAnalyticsMetricsResponse()
{
	daily_metrics = std::list<PinAnalyticsDailyMetrics>();
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


        std::list<PinAnalyticsDailyMetrics> daily_metrics_list;
        PinAnalyticsDailyMetrics element;
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




    std::list<PinAnalyticsDailyMetrics> daily_metrics_list = getDailyMetrics();
    bourne::json daily_metrics_arr = bourne::json::array();

    for(auto& var : daily_metrics_list)
    {
        PinAnalyticsDailyMetrics obj = var;
        daily_metrics_arr.append(obj.toJson());
    }
    object["daily_metrics"] = daily_metrics_arr;










    return object;

}

std::list<PinAnalyticsDailyMetrics>
PinAnalyticsMetricsResponse::getDailyMetrics()
{
	return daily_metrics;
}

void
PinAnalyticsMetricsResponse::setDailyMetrics(std::list<PinAnalyticsDailyMetrics> daily_metrics)
{
	this->daily_metrics = daily_metrics;
}

std::map<std::string, int>
PinAnalyticsMetricsResponse::getLifetimeMetrics()
{
	return lifetime_metrics;
}

void
PinAnalyticsMetricsResponse::setLifetimeMetrics(std::map<std::string, int> lifetime_metrics)
{
	this->lifetime_metrics = lifetime_metrics;
}

std::map<std::string, long>
PinAnalyticsMetricsResponse::getSummaryMetrics()
{
	return summary_metrics;
}

void
PinAnalyticsMetricsResponse::setSummaryMetrics(std::map<std::string, long> summary_metrics)
{
	this->summary_metrics = summary_metrics;
}



