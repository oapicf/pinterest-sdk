

#include "PinAnalyticsMetricsResponse_daily_metrics_inner.h"

using namespace Tiny;

PinAnalyticsMetricsResponse_daily_metrics_inner::PinAnalyticsMetricsResponse_daily_metrics_inner()
{
	data_status = DataStatus();
	date = std::string();
	metrics = null<long>();
}

PinAnalyticsMetricsResponse_daily_metrics_inner::PinAnalyticsMetricsResponse_daily_metrics_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

PinAnalyticsMetricsResponse_daily_metrics_inner::~PinAnalyticsMetricsResponse_daily_metrics_inner()
{

}

void
PinAnalyticsMetricsResponse_daily_metrics_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *data_statusKey = "data_status";

    if(object.has_key(data_statusKey))
    {
        bourne::json value = object[data_statusKey];




        DataStatus* obj = &data_status;
		obj->fromJson(value.dump());

    }

    const char *dateKey = "date";

    if(object.has_key(dateKey))
    {
        bourne::json value = object[dateKey];



        jsonToValue(&date, value, "std::string");


    }

    const char *metricsKey = "metrics";

    if(object.has_key(metricsKey))
    {
        bourne::json value = object[metricsKey];


    }


}

bourne::json
PinAnalyticsMetricsResponse_daily_metrics_inner::toJson()
{
    bourne::json object = bourne::json::object();






	object["data_status"] = getDataStatus().toJson();





    object["date"] = getDate();






    return object;

}

DataStatus
PinAnalyticsMetricsResponse_daily_metrics_inner::getDataStatus()
{
	return data_status;
}

void
PinAnalyticsMetricsResponse_daily_metrics_inner::setDataStatus(DataStatus  data_status)
{
	this->data_status = data_status;
}

std::string
PinAnalyticsMetricsResponse_daily_metrics_inner::getDate()
{
	return date;
}

void
PinAnalyticsMetricsResponse_daily_metrics_inner::setDate(std::string  date)
{
	this->date = date;
}

Map<string, string>
PinAnalyticsMetricsResponse_daily_metrics_inner::getMetrics()
{
	return metrics;
}

void
PinAnalyticsMetricsResponse_daily_metrics_inner::setMetrics(Map <string, string> metrics)
{
	this->metrics = metrics;
}



