
#include "CreateMMMReportResponseData.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CreateMMMReportResponseData_message_is_assigned_from_json()
{


    bourne::json input =
    {
        "message", "hello"
    };

    CreateMMMReportResponseData obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMessage().c_str());






}



void test_CreateMMMReportResponseData_status_is_assigned_from_json()
{


    bourne::json input =
    {
        "status", "hello"
    };

    CreateMMMReportResponseData obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getStatus().c_str());






}


void test_CreateMMMReportResponseData_token_is_assigned_from_json()
{


    bourne::json input =
    {
        "token", "hello"
    };

    CreateMMMReportResponseData obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getToken().c_str());






}



void test_CreateMMMReportResponseData_message_is_converted_to_json()
{

    bourne::json input =
    {
        "message", "hello"
    };

    CreateMMMReportResponseData obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["message"] == output["message"]);



}



void test_CreateMMMReportResponseData_status_is_converted_to_json()
{

    bourne::json input =
    {
        "status", "hello"
    };

    CreateMMMReportResponseData obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["status"] == output["status"]);



}


void test_CreateMMMReportResponseData_token_is_converted_to_json()
{

    bourne::json input =
    {
        "token", "hello"
    };

    CreateMMMReportResponseData obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["token"] == output["token"]);



}


