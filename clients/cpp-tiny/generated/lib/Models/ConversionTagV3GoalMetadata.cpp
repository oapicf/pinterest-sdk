

#include "ConversionTagV3GoalMetadata.h"

using namespace Tiny;

ConversionTagV3GoalMetadata::ConversionTagV3GoalMetadata()
{
	attribution_windows = AttributionWindows();
	conversion_event = ConversionEvent();
	conversion_tag_id = std::string();
	cpa_goal_value_in_micro_currency = std::string();
	is_roas_optimized = bool(false);
	reporting_event = std::string();
}

ConversionTagV3GoalMetadata::ConversionTagV3GoalMetadata(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionTagV3GoalMetadata::~ConversionTagV3GoalMetadata()
{

}

void
ConversionTagV3GoalMetadata::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *attribution_windowsKey = "attribution_windows";

    if(object.has_key(attribution_windowsKey))
    {
        bourne::json value = object[attribution_windowsKey];




        AttributionWindows* obj = &attribution_windows;
		obj->fromJson(value.dump());

    }

    const char *conversion_eventKey = "conversion_event";

    if(object.has_key(conversion_eventKey))
    {
        bourne::json value = object[conversion_eventKey];




        ConversionEvent* obj = &conversion_event;
		obj->fromJson(value.dump());

    }

    const char *conversion_tag_idKey = "conversion_tag_id";

    if(object.has_key(conversion_tag_idKey))
    {
        bourne::json value = object[conversion_tag_idKey];



        jsonToValue(&conversion_tag_id, value, "std::string");


    }

    const char *cpa_goal_value_in_micro_currencyKey = "cpa_goal_value_in_micro_currency";

    if(object.has_key(cpa_goal_value_in_micro_currencyKey))
    {
        bourne::json value = object[cpa_goal_value_in_micro_currencyKey];



        jsonToValue(&cpa_goal_value_in_micro_currency, value, "std::string");


    }

    const char *is_roas_optimizedKey = "is_roas_optimized";

    if(object.has_key(is_roas_optimizedKey))
    {
        bourne::json value = object[is_roas_optimizedKey];



        jsonToValue(&is_roas_optimized, value, "bool");


    }

    const char *reporting_eventKey = "reporting_event";

    if(object.has_key(reporting_eventKey))
    {
        bourne::json value = object[reporting_eventKey];



        jsonToValue(&reporting_event, value, "std::string");


    }


}

bourne::json
ConversionTagV3GoalMetadata::toJson()
{
    bourne::json object = bourne::json::object();






	object["attribution_windows"] = getAttributionWindows().toJson();






	object["conversion_event"] = getConversionEvent().toJson();





    object["conversion_tag_id"] = getConversionTagId();






    object["cpa_goal_value_in_micro_currency"] = getCpaGoalValueInMicroCurrency();






    object["is_roas_optimized"] = isIsRoasOptimized();






    object["reporting_event"] = getReportingEvent();



    return object;

}

AttributionWindows
ConversionTagV3GoalMetadata::getAttributionWindows()
{
	return attribution_windows;
}

void
ConversionTagV3GoalMetadata::setAttributionWindows(AttributionWindows attribution_windows)
{
	this->attribution_windows = attribution_windows;
}

ConversionEvent
ConversionTagV3GoalMetadata::getConversionEvent()
{
	return conversion_event;
}

void
ConversionTagV3GoalMetadata::setConversionEvent(ConversionEvent conversion_event)
{
	this->conversion_event = conversion_event;
}

std::string
ConversionTagV3GoalMetadata::getConversionTagId()
{
	return conversion_tag_id;
}

void
ConversionTagV3GoalMetadata::setConversionTagId(std::string conversion_tag_id)
{
	this->conversion_tag_id = conversion_tag_id;
}

std::string
ConversionTagV3GoalMetadata::getCpaGoalValueInMicroCurrency()
{
	return cpa_goal_value_in_micro_currency;
}

void
ConversionTagV3GoalMetadata::setCpaGoalValueInMicroCurrency(std::string cpa_goal_value_in_micro_currency)
{
	this->cpa_goal_value_in_micro_currency = cpa_goal_value_in_micro_currency;
}

bool
ConversionTagV3GoalMetadata::isIsRoasOptimized()
{
	return is_roas_optimized;
}

void
ConversionTagV3GoalMetadata::setIsRoasOptimized(bool is_roas_optimized)
{
	this->is_roas_optimized = is_roas_optimized;
}

std::string
ConversionTagV3GoalMetadata::getReportingEvent()
{
	return reporting_event;
}

void
ConversionTagV3GoalMetadata::setReportingEvent(std::string reporting_event)
{
	this->reporting_event = reporting_event;
}



