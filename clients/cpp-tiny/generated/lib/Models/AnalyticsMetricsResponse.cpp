

#include "AnalyticsMetricsResponse.h"

using namespace Tiny;

AnalyticsMetricsResponse::AnalyticsMetricsResponse()
{
	daily_metrics = std::list<AnalyticsDailyMetrics>();
	summary_metrics = null<long>();
}

AnalyticsMetricsResponse::AnalyticsMetricsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

AnalyticsMetricsResponse::~AnalyticsMetricsResponse()
{

}

void
AnalyticsMetricsResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *daily_metricsKey = "daily_metrics";

    if(object.has_key(daily_metricsKey))
    {
        bourne::json value = object[daily_metricsKey];


        std::list<AnalyticsDailyMetrics> daily_metrics_list;
        AnalyticsDailyMetrics element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            daily_metrics_list.push_back(element);
        }
        daily_metrics = daily_metrics_list;


    }

    const char *summary_metricsKey = "summary_metrics";

    if(object.has_key(summary_metricsKey))
    {
        bourne::json value = object[summary_metricsKey];


    }


}

bourne::json
AnalyticsMetricsResponse::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<AnalyticsDailyMetrics> daily_metrics_list = getDailyMetrics();
    bourne::json daily_metrics_arr = bourne::json::array();

    for(auto& var : daily_metrics_list)
    {
        AnalyticsDailyMetrics obj = var;
        daily_metrics_arr.append(obj.toJson());
    }
    object["daily_metrics"] = daily_metrics_arr;







    return object;

}

std::list<AnalyticsDailyMetrics>
AnalyticsMetricsResponse::getDailyMetrics()
{
	return daily_metrics;
}

void
AnalyticsMetricsResponse::setDailyMetrics(std::list<AnalyticsDailyMetrics> daily_metrics)
{
	this->daily_metrics = daily_metrics;
}

std::map<std::string, long>
AnalyticsMetricsResponse::getSummaryMetrics()
{
	return summary_metrics;
}

void
AnalyticsMetricsResponse::setSummaryMetrics(std::map<std::string, long> summary_metrics)
{
	this->summary_metrics = summary_metrics;
}



