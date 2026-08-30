

#include "CustomConversionEventMetrics.h"

using namespace Tiny;

CustomConversionEventMetrics::CustomConversionEventMetrics()
{
	custom_event_metrics_type = AdeColumnType();
	custom_event_name = std::string();
}

CustomConversionEventMetrics::CustomConversionEventMetrics(std::string jsonString)
{
	this->fromJson(jsonString);
}

CustomConversionEventMetrics::~CustomConversionEventMetrics()
{

}

void
CustomConversionEventMetrics::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *custom_event_metrics_typeKey = "custom_event_metrics_type";

    if(object.has_key(custom_event_metrics_typeKey))
    {
        bourne::json value = object[custom_event_metrics_typeKey];




        AdeColumnType* obj = &custom_event_metrics_type;
		obj->fromJson(value.dump());

    }

    const char *custom_event_nameKey = "custom_event_name";

    if(object.has_key(custom_event_nameKey))
    {
        bourne::json value = object[custom_event_nameKey];



        jsonToValue(&custom_event_name, value, "std::string");


    }


}

bourne::json
CustomConversionEventMetrics::toJson()
{
    bourne::json object = bourne::json::object();






	object["custom_event_metrics_type"] = getCustomEventMetricsType().toJson();





    object["custom_event_name"] = getCustomEventName();



    return object;

}

AdeColumnType
CustomConversionEventMetrics::getCustomEventMetricsType()
{
	return custom_event_metrics_type;
}

void
CustomConversionEventMetrics::setCustomEventMetricsType(AdeColumnType custom_event_metrics_type)
{
	this->custom_event_metrics_type = custom_event_metrics_type;
}

std::string
CustomConversionEventMetrics::getCustomEventName()
{
	return custom_event_name;
}

void
CustomConversionEventMetrics::setCustomEventName(std::string custom_event_name)
{
	this->custom_event_name = custom_event_name;
}



