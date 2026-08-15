
#include "CatalogsFeedProcessingSchedule.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CatalogsFeedProcessingSchedule_time_is_assigned_from_json()
{


    bourne::json input =
    {
        "time", "hello"
    };

    CatalogsFeedProcessingSchedule obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getTime().c_str());






}


void test_CatalogsFeedProcessingSchedule_timezone_is_assigned_from_json()
{


    bourne::json input =
    {
        "timezone", "hello"
    };

    CatalogsFeedProcessingSchedule obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getTimezone().c_str());






}



void test_CatalogsFeedProcessingSchedule_time_is_converted_to_json()
{

    bourne::json input =
    {
        "time", "hello"
    };

    CatalogsFeedProcessingSchedule obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["time"] == output["time"]);



}


void test_CatalogsFeedProcessingSchedule_timezone_is_converted_to_json()
{

    bourne::json input =
    {
        "timezone", "hello"
    };

    CatalogsFeedProcessingSchedule obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["timezone"] == output["timezone"]);



}


