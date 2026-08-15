
#include "OptimizationGoalMetadata_scrollup_goal_metadata.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_OptimizationGoalMetadata_scrollup_goal_metadata_scrollup_goal_value_in_micro_currency_is_assigned_from_json()
{


    bourne::json input =
    {
        "scrollup_goal_value_in_micro_currency", "hello"
    };

    OptimizationGoalMetadata_scrollup_goal_metadata obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getScrollupGoalValueInMicroCurrency().c_str());






}



void test_OptimizationGoalMetadata_scrollup_goal_metadata_scrollup_goal_value_in_micro_currency_is_converted_to_json()
{

    bourne::json input =
    {
        "scrollup_goal_value_in_micro_currency", "hello"
    };

    OptimizationGoalMetadata_scrollup_goal_metadata obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["scrollup_goal_value_in_micro_currency"] == output["scrollup_goal_value_in_micro_currency"]);



}


