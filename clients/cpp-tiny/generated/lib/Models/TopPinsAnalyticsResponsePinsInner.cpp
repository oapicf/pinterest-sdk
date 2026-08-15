

#include "TopPinsAnalyticsResponse_pins_inner.h"

using namespace Tiny;

TopPinsAnalyticsResponse_pins_inner::TopPinsAnalyticsResponse_pins_inner()
{
	data_status = null<DataStatus>();
	metrics = null<long>();
	pin_id = std::string();
}

TopPinsAnalyticsResponse_pins_inner::TopPinsAnalyticsResponse_pins_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

TopPinsAnalyticsResponse_pins_inner::~TopPinsAnalyticsResponse_pins_inner()
{

}

void
TopPinsAnalyticsResponse_pins_inner::fromJson(std::string jsonObj)
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
TopPinsAnalyticsResponse_pins_inner::toJson()
{
    bourne::json object = bourne::json::object();











    object["pin_id"] = getPinId();



    return object;

}

Map<string, string>
TopPinsAnalyticsResponse_pins_inner::getDataStatus()
{
	return data_status;
}

void
TopPinsAnalyticsResponse_pins_inner::setDataStatus(Map <string, string> data_status)
{
	this->data_status = data_status;
}

Map<string, string>
TopPinsAnalyticsResponse_pins_inner::getMetrics()
{
	return metrics;
}

void
TopPinsAnalyticsResponse_pins_inner::setMetrics(Map <string, string> metrics)
{
	this->metrics = metrics;
}

std::string
TopPinsAnalyticsResponse_pins_inner::getPinId()
{
	return pin_id;
}

void
TopPinsAnalyticsResponse_pins_inner::setPinId(std::string  pin_id)
{
	this->pin_id = pin_id;
}



