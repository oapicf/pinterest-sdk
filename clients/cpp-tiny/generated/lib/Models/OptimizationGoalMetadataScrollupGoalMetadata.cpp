

#include "OptimizationGoalMetadata_scrollup_goal_metadata.h"

using namespace Tiny;

OptimizationGoalMetadata_scrollup_goal_metadata::OptimizationGoalMetadata_scrollup_goal_metadata()
{
	scrollup_goal_value_in_micro_currency = std::string();
}

OptimizationGoalMetadata_scrollup_goal_metadata::OptimizationGoalMetadata_scrollup_goal_metadata(std::string jsonString)
{
	this->fromJson(jsonString);
}

OptimizationGoalMetadata_scrollup_goal_metadata::~OptimizationGoalMetadata_scrollup_goal_metadata()
{

}

void
OptimizationGoalMetadata_scrollup_goal_metadata::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *scrollup_goal_value_in_micro_currencyKey = "scrollup_goal_value_in_micro_currency";

    if(object.has_key(scrollup_goal_value_in_micro_currencyKey))
    {
        bourne::json value = object[scrollup_goal_value_in_micro_currencyKey];



        jsonToValue(&scrollup_goal_value_in_micro_currency, value, "std::string");


    }


}

bourne::json
OptimizationGoalMetadata_scrollup_goal_metadata::toJson()
{
    bourne::json object = bourne::json::object();





    object["scrollup_goal_value_in_micro_currency"] = getScrollupGoalValueInMicroCurrency();



    return object;

}

std::string
OptimizationGoalMetadata_scrollup_goal_metadata::getScrollupGoalValueInMicroCurrency()
{
	return scrollup_goal_value_in_micro_currency;
}

void
OptimizationGoalMetadata_scrollup_goal_metadata::setScrollupGoalValueInMicroCurrency(std::string  scrollup_goal_value_in_micro_currency)
{
	this->scrollup_goal_value_in_micro_currency = scrollup_goal_value_in_micro_currency;
}



