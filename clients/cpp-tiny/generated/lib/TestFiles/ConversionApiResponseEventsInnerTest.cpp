
#include "ConversionApiResponse_events_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ConversionApiResponse_events_inner_error_message_is_assigned_from_json()
{


    bourne::json input =
    {
        "error_message", "hello"
    };

    ConversionApiResponse_events_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getErrorMessage().c_str());






}


void test_ConversionApiResponse_events_inner_status_is_assigned_from_json()
{


    bourne::json input =
    {
        "status", "hello"
    };

    ConversionApiResponse_events_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getStatus().c_str());






}


void test_ConversionApiResponse_events_inner_warning_message_is_assigned_from_json()
{


    bourne::json input =
    {
        "warning_message", "hello"
    };

    ConversionApiResponse_events_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getWarningMessage().c_str());






}



void test_ConversionApiResponse_events_inner_error_message_is_converted_to_json()
{

    bourne::json input =
    {
        "error_message", "hello"
    };

    ConversionApiResponse_events_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["error_message"] == output["error_message"]);



}


void test_ConversionApiResponse_events_inner_status_is_converted_to_json()
{

    bourne::json input =
    {
        "status", "hello"
    };

    ConversionApiResponse_events_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["status"] == output["status"]);



}


void test_ConversionApiResponse_events_inner_warning_message_is_converted_to_json()
{

    bourne::json input =
    {
        "warning_message", "hello"
    };

    ConversionApiResponse_events_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["warning_message"] == output["warning_message"]);



}


