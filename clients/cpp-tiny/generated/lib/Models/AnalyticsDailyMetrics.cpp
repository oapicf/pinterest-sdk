

#include "AnalyticsDailyMetrics.h"

using namespace Tiny;

AnalyticsDailyMetrics::AnalyticsDailyMetrics()
{
	data_status = DataStatus();
	date = std::string();
	metrics = null<long>();
}

AnalyticsDailyMetrics::AnalyticsDailyMetrics(std::string jsonString)
{
	this->fromJson(jsonString);
}

AnalyticsDailyMetrics::~AnalyticsDailyMetrics()
{

}

void
AnalyticsDailyMetrics::fromJson(std::string jsonObj)
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
AnalyticsDailyMetrics::toJson()
{
    bourne::json object = bourne::json::object();






	object["data_status"] = getDataStatus().toJson();





    object["date"] = getDate();






    return object;

}

DataStatus
AnalyticsDailyMetrics::getDataStatus()
{
	return data_status;
}

void
AnalyticsDailyMetrics::setDataStatus(DataStatus data_status)
{
	this->data_status = data_status;
}

std::string
AnalyticsDailyMetrics::getDate()
{
	return date;
}

void
AnalyticsDailyMetrics::setDate(std::string date)
{
	this->date = date;
}

std::map<std::string, long>
AnalyticsDailyMetrics::getMetrics()
{
	return metrics;
}

void
AnalyticsDailyMetrics::setMetrics(std::map<std::string, long> metrics)
{
	this->metrics = metrics;
}



