

#include "TopPinsAnalyticsResponsePinsItems.h"

using namespace Tiny;

TopPinsAnalyticsResponsePinsItems::TopPinsAnalyticsResponsePinsItems()
{
	data_status = null<DataStatus>();
	metrics = null<long>();
	pin_id = std::string();
}

TopPinsAnalyticsResponsePinsItems::TopPinsAnalyticsResponsePinsItems(std::string jsonString)
{
	this->fromJson(jsonString);
}

TopPinsAnalyticsResponsePinsItems::~TopPinsAnalyticsResponsePinsItems()
{

}

void
TopPinsAnalyticsResponsePinsItems::fromJson(std::string jsonObj)
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
TopPinsAnalyticsResponsePinsItems::toJson()
{
    bourne::json object = bourne::json::object();











    object["pin_id"] = getPinId();



    return object;

}

std::map<std::string, DataStatus>
TopPinsAnalyticsResponsePinsItems::getDataStatus()
{
	return data_status;
}

void
TopPinsAnalyticsResponsePinsItems::setDataStatus(std::map<std::string, DataStatus> data_status)
{
	this->data_status = data_status;
}

std::map<std::string, long>
TopPinsAnalyticsResponsePinsItems::getMetrics()
{
	return metrics;
}

void
TopPinsAnalyticsResponsePinsItems::setMetrics(std::map<std::string, long> metrics)
{
	this->metrics = metrics;
}

std::string
TopPinsAnalyticsResponsePinsItems::getPinId()
{
	return pin_id;
}

void
TopPinsAnalyticsResponsePinsItems::setPinId(std::string pin_id)
{
	this->pin_id = pin_id;
}



