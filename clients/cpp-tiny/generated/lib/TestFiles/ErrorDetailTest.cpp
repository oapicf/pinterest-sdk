
#include "ErrorDetail.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ErrorDetail_count_is_assigned_from_json()
{
    bourne::json input =
    {
        "count", 1
    };

    ErrorDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCount());








}


void test_ErrorDetail_error_code_is_assigned_from_json()
{
    bourne::json input =
    {
        "error_code", 1
    };

    ErrorDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getErrorCode());








}


void test_ErrorDetail_message_is_assigned_from_json()
{


    bourne::json input =
    {
        "message", "hello"
    };

    ErrorDetail obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMessage().c_str());






}



void test_ErrorDetail_count_is_converted_to_json()
{
    bourne::json input =
    {
        "count", 1
    };

    ErrorDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["count"] == output["count"]);




}


void test_ErrorDetail_error_code_is_converted_to_json()
{
    bourne::json input =
    {
        "error_code", 1
    };

    ErrorDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["error_code"] == output["error_code"]);




}


void test_ErrorDetail_message_is_converted_to_json()
{

    bourne::json input =
    {
        "message", "hello"
    };

    ErrorDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["message"] == output["message"]);



}


