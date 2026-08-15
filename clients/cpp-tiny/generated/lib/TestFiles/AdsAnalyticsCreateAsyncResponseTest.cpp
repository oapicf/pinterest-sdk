
#include "AdsAnalyticsCreateAsyncResponse.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_AdsAnalyticsCreateAsyncResponse_message_is_assigned_from_json()
{


    bourne::json input =
    {
        "message", "hello"
    };

    AdsAnalyticsCreateAsyncResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMessage().c_str());






}



void test_AdsAnalyticsCreateAsyncResponse_token_is_assigned_from_json()
{


    bourne::json input =
    {
        "token", "hello"
    };

    AdsAnalyticsCreateAsyncResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getToken().c_str());






}



void test_AdsAnalyticsCreateAsyncResponse_message_is_converted_to_json()
{

    bourne::json input =
    {
        "message", "hello"
    };

    AdsAnalyticsCreateAsyncResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["message"] == output["message"]);



}



void test_AdsAnalyticsCreateAsyncResponse_token_is_converted_to_json()
{

    bourne::json input =
    {
        "token", "hello"
    };

    AdsAnalyticsCreateAsyncResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["token"] == output["token"]);



}


