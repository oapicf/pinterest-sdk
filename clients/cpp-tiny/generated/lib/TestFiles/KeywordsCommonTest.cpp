
#include "KeywordsCommon.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_KeywordsCommon_bid_is_assigned_from_json()
{
    bourne::json input =
    {
        "bid", 1
    };

    KeywordsCommon obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getBid());








}



void test_KeywordsCommon_value_is_assigned_from_json()
{


    bourne::json input =
    {
        "value", "hello"
    };

    KeywordsCommon obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getValue().c_str());






}



void test_KeywordsCommon_bid_is_converted_to_json()
{
    bourne::json input =
    {
        "bid", 1
    };

    KeywordsCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["bid"] == output["bid"]);




}



void test_KeywordsCommon_value_is_converted_to_json()
{

    bourne::json input =
    {
        "value", "hello"
    };

    KeywordsCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["value"] == output["value"]);



}


