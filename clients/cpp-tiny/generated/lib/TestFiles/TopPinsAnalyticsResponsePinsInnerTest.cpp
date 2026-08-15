
#include "TopPinsAnalyticsResponse_pins_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_TopPinsAnalyticsResponse_pins_inner_metrics_is_assigned_from_json()
{








}


void test_TopPinsAnalyticsResponse_pins_inner_pin_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "pin_id", "hello"
    };

    TopPinsAnalyticsResponse_pins_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPinId().c_str());






}




void test_TopPinsAnalyticsResponse_pins_inner_metrics_is_converted_to_json()
{




}


void test_TopPinsAnalyticsResponse_pins_inner_pin_id_is_converted_to_json()
{

    bourne::json input =
    {
        "pin_id", "hello"
    };

    TopPinsAnalyticsResponse_pins_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["pin_id"] == output["pin_id"]);



}


