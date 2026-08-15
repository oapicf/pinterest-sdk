

#include "AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics.h"

using namespace Tiny;

AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics::AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics()
{
	custom_event_metrics_type = std::string();
	custom_event_name = std::string();
}

AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics::AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics::~AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics()
{

}

void
AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *custom_event_metrics_typeKey = "custom_event_metrics_type";

    if(object.has_key(custom_event_metrics_typeKey))
    {
        bourne::json value = object[custom_event_metrics_typeKey];



        jsonToValue(&custom_event_metrics_type, value, "std::string");


    }

    const char *custom_event_nameKey = "custom_event_name";

    if(object.has_key(custom_event_nameKey))
    {
        bourne::json value = object[custom_event_nameKey];



        jsonToValue(&custom_event_name, value, "std::string");


    }


}

bourne::json
AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics::toJson()
{
    bourne::json object = bourne::json::object();





    object["custom_event_metrics_type"] = getCustomEventMetricsType();






    object["custom_event_name"] = getCustomEventName();



    return object;

}

std::string
AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics::getCustomEventMetricsType()
{
	return custom_event_metrics_type;
}

void
AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics::setCustomEventMetricsType(std::string  custom_event_metrics_type)
{
	this->custom_event_metrics_type = custom_event_metrics_type;
}

std::string
AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics::getCustomEventName()
{
	return custom_event_name;
}

void
AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics::setCustomEventName(std::string  custom_event_name)
{
	this->custom_event_name = custom_event_name;
}



