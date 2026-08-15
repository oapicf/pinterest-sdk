

#include "OptimizationGoalMetadata_conversion_tag_v3_goal_metadata.h"

using namespace Tiny;

OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::OptimizationGoalMetadata_conversion_tag_v3_goal_metadata()
{
	attribution_windows = OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows();
	conversion_event = std::string();
	conversion_tag_id = std::string();
	cpa_goal_value_in_micro_currency = std::string();
	is_roas_optimized = bool(false);
	learning_mode_type = std::string();
	reporting_event = std::string();
}

OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::OptimizationGoalMetadata_conversion_tag_v3_goal_metadata(std::string jsonString)
{
	this->fromJson(jsonString);
}

OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::~OptimizationGoalMetadata_conversion_tag_v3_goal_metadata()
{

}

void
OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *attribution_windowsKey = "attribution_windows";

    if(object.has_key(attribution_windowsKey))
    {
        bourne::json value = object[attribution_windowsKey];




        OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows* obj = &attribution_windows;
		obj->fromJson(value.dump());

    }

    const char *conversion_eventKey = "conversion_event";

    if(object.has_key(conversion_eventKey))
    {
        bourne::json value = object[conversion_eventKey];



        jsonToValue(&conversion_event, value, "std::string");


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

    const char *learning_mode_typeKey = "learning_mode_type";

    if(object.has_key(learning_mode_typeKey))
    {
        bourne::json value = object[learning_mode_typeKey];



        jsonToValue(&learning_mode_type, value, "std::string");


    }

    const char *reporting_eventKey = "reporting_event";

    if(object.has_key(reporting_eventKey))
    {
        bourne::json value = object[reporting_eventKey];



        jsonToValue(&reporting_event, value, "std::string");


    }


}

bourne::json
OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::toJson()
{
    bourne::json object = bourne::json::object();






	object["attribution_windows"] = getAttributionWindows().toJson();





    object["conversion_event"] = getConversionEvent();






    object["conversion_tag_id"] = getConversionTagId();






    object["cpa_goal_value_in_micro_currency"] = getCpaGoalValueInMicroCurrency();






    object["is_roas_optimized"] = isIsRoasOptimized();






    object["learning_mode_type"] = getLearningModeType();






    object["reporting_event"] = getReportingEvent();



    return object;

}

OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows
OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::getAttributionWindows()
{
	return attribution_windows;
}

void
OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::setAttributionWindows(OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows  attribution_windows)
{
	this->attribution_windows = attribution_windows;
}

std::string
OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::getConversionEvent()
{
	return conversion_event;
}

void
OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::setConversionEvent(std::string  conversion_event)
{
	this->conversion_event = conversion_event;
}

std::string
OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::getConversionTagId()
{
	return conversion_tag_id;
}

void
OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::setConversionTagId(std::string  conversion_tag_id)
{
	this->conversion_tag_id = conversion_tag_id;
}

std::string
OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::getCpaGoalValueInMicroCurrency()
{
	return cpa_goal_value_in_micro_currency;
}

void
OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::setCpaGoalValueInMicroCurrency(std::string  cpa_goal_value_in_micro_currency)
{
	this->cpa_goal_value_in_micro_currency = cpa_goal_value_in_micro_currency;
}

bool
OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::isIsRoasOptimized()
{
	return is_roas_optimized;
}

void
OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::setIsRoasOptimized(bool  is_roas_optimized)
{
	this->is_roas_optimized = is_roas_optimized;
}

std::string
OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::getLearningModeType()
{
	return learning_mode_type;
}

void
OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::setLearningModeType(std::string  learning_mode_type)
{
	this->learning_mode_type = learning_mode_type;
}

std::string
OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::getReportingEvent()
{
	return reporting_event;
}

void
OptimizationGoalMetadata_conversion_tag_v3_goal_metadata::setReportingEvent(std::string  reporting_event)
{
	this->reporting_event = reporting_event;
}



