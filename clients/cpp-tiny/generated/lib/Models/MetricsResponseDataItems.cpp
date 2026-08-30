

#include "MetricsResponseDataItems.h"

using namespace Tiny;

MetricsResponseDataItems::MetricsResponseDataItems()
{
	metrics = null;
	targeting_type = std::string();
	targeting_value = std::string();
}

MetricsResponseDataItems::MetricsResponseDataItems(std::string jsonString)
{
	this->fromJson(jsonString);
}

MetricsResponseDataItems::~MetricsResponseDataItems()
{

}

void
MetricsResponseDataItems::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *metricsKey = "metrics";

    if(object.has_key(metricsKey))
    {
        bourne::json value = object[metricsKey];




        Object* obj = &metrics;
		obj->fromJson(value.dump());

    }

    const char *targeting_typeKey = "targeting_type";

    if(object.has_key(targeting_typeKey))
    {
        bourne::json value = object[targeting_typeKey];



        jsonToValue(&targeting_type, value, "std::string");


    }

    const char *targeting_valueKey = "targeting_value";

    if(object.has_key(targeting_valueKey))
    {
        bourne::json value = object[targeting_valueKey];



        jsonToValue(&targeting_value, value, "std::string");


    }


}

bourne::json
MetricsResponseDataItems::toJson()
{
    bourne::json object = bourne::json::object();






	object["metrics"] = getMetrics().toJson();





    object["targeting_type"] = getTargetingType();






    object["targeting_value"] = getTargetingValue();



    return object;

}

Object
MetricsResponseDataItems::getMetrics()
{
	return metrics;
}

void
MetricsResponseDataItems::setMetrics(Object metrics)
{
	this->metrics = metrics;
}

std::string
MetricsResponseDataItems::getTargetingType()
{
	return targeting_type;
}

void
MetricsResponseDataItems::setTargetingType(std::string targeting_type)
{
	this->targeting_type = targeting_type;
}

std::string
MetricsResponseDataItems::getTargetingValue()
{
	return targeting_value;
}

void
MetricsResponseDataItems::setTargetingValue(std::string targeting_value)
{
	this->targeting_value = targeting_value;
}



