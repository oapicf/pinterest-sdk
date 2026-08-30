

#include "ScrollupGoalMetadata.h"

using namespace Tiny;

ScrollupGoalMetadata::ScrollupGoalMetadata()
{
	scrollup_goal_value_in_micro_currency = std::string();
}

ScrollupGoalMetadata::ScrollupGoalMetadata(std::string jsonString)
{
	this->fromJson(jsonString);
}

ScrollupGoalMetadata::~ScrollupGoalMetadata()
{

}

void
ScrollupGoalMetadata::fromJson(std::string jsonObj)
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
ScrollupGoalMetadata::toJson()
{
    bourne::json object = bourne::json::object();





    object["scrollup_goal_value_in_micro_currency"] = getScrollupGoalValueInMicroCurrency();



    return object;

}

std::string
ScrollupGoalMetadata::getScrollupGoalValueInMicroCurrency()
{
	return scrollup_goal_value_in_micro_currency;
}

void
ScrollupGoalMetadata::setScrollupGoalValueInMicroCurrency(std::string scrollup_goal_value_in_micro_currency)
{
	this->scrollup_goal_value_in_micro_currency = scrollup_goal_value_in_micro_currency;
}



