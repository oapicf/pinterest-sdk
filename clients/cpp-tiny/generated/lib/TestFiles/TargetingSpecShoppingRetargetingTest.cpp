
#include "TargetingSpecShoppingRetargeting.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_TargetingSpecShoppingRetargeting_exclusion_window_is_assigned_from_json()
{
    bourne::json input =
    {
        "exclusion_window", 1
    };

    TargetingSpecShoppingRetargeting obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getExclusionWindow());








}


void test_TargetingSpecShoppingRetargeting_lookback_window_is_assigned_from_json()
{
    bourne::json input =
    {
        "lookback_window", 1
    };

    TargetingSpecShoppingRetargeting obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getLookbackWindow());








}




void test_TargetingSpecShoppingRetargeting_exclusion_window_is_converted_to_json()
{
    bourne::json input =
    {
        "exclusion_window", 1
    };

    TargetingSpecShoppingRetargeting obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["exclusion_window"] == output["exclusion_window"]);




}


void test_TargetingSpecShoppingRetargeting_lookback_window_is_converted_to_json()
{
    bourne::json input =
    {
        "lookback_window", 1
    };

    TargetingSpecShoppingRetargeting obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["lookback_window"] == output["lookback_window"]);




}



