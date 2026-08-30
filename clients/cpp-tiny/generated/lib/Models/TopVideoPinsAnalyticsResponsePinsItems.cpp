

#include "TopVideoPinsAnalyticsResponsePinsItems.h"

using namespace Tiny;

TopVideoPinsAnalyticsResponsePinsItems::TopVideoPinsAnalyticsResponsePinsItems()
{
	data_status = null<DataStatus>();
	metrics = null<long>();
	pin_id = std::string();
}

TopVideoPinsAnalyticsResponsePinsItems::TopVideoPinsAnalyticsResponsePinsItems(std::string jsonString)
{
	this->fromJson(jsonString);
}

TopVideoPinsAnalyticsResponsePinsItems::~TopVideoPinsAnalyticsResponsePinsItems()
{

}

void
TopVideoPinsAnalyticsResponsePinsItems::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *data_statusKey = "data_status";

    if(object.has_key(data_statusKey))
    {
        bourne::json value = object[data_statusKey];


    }

    const char *metricsKey = "metrics";

    if(object.has_key(metricsKey))
    {
        bourne::json value = object[metricsKey];


    }

    const char *pin_idKey = "pin_id";

    if(object.has_key(pin_idKey))
    {
        bourne::json value = object[pin_idKey];



        jsonToValue(&pin_id, value, "std::string");


    }


}

bourne::json
TopVideoPinsAnalyticsResponsePinsItems::toJson()
{
    bourne::json object = bourne::json::object();











    object["pin_id"] = getPinId();



    return object;

}

std::map<std::string, DataStatus>
TopVideoPinsAnalyticsResponsePinsItems::getDataStatus()
{
	return data_status;
}

void
TopVideoPinsAnalyticsResponsePinsItems::setDataStatus(std::map<std::string, DataStatus> data_status)
{
	this->data_status = data_status;
}

std::map<std::string, long>
TopVideoPinsAnalyticsResponsePinsItems::getMetrics()
{
	return metrics;
}

void
TopVideoPinsAnalyticsResponsePinsItems::setMetrics(std::map<std::string, long> metrics)
{
	this->metrics = metrics;
}

std::string
TopVideoPinsAnalyticsResponsePinsItems::getPinId()
{
	return pin_id;
}

void
TopVideoPinsAnalyticsResponsePinsItems::setPinId(std::string pin_id)
{
	this->pin_id = pin_id;
}



