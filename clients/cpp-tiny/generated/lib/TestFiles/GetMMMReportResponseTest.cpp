
#include "GetMMMReportResponse.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_GetMMMReportResponse_code_is_assigned_from_json()
{








}



void test_GetMMMReportResponse_message_is_assigned_from_json()
{


    bourne::json input =
    {
        "message", "hello"
    };

    GetMMMReportResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMessage().c_str());






}


void test_GetMMMReportResponse_status_is_assigned_from_json()
{


    bourne::json input =
    {
        "status", "hello"
    };

    GetMMMReportResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getStatus().c_str());






}



void test_GetMMMReportResponse_code_is_converted_to_json()
{




}



void test_GetMMMReportResponse_message_is_converted_to_json()
{

    bourne::json input =
    {
        "message", "hello"
    };

    GetMMMReportResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["message"] == output["message"]);



}


void test_GetMMMReportResponse_status_is_converted_to_json()
{

    bourne::json input =
    {
        "status", "hello"
    };

    GetMMMReportResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["status"] == output["status"]);



}


