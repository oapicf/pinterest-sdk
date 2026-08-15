
#include "AdvancedAuctionOperationError.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_AdvancedAuctionOperationError_code_is_assigned_from_json()
{
    bourne::json input =
    {
        "code", 1
    };

    AdvancedAuctionOperationError obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCode());








}


void test_AdvancedAuctionOperationError_message_is_assigned_from_json()
{


    bourne::json input =
    {
        "message", "hello"
    };

    AdvancedAuctionOperationError obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMessage().c_str());






}



void test_AdvancedAuctionOperationError_code_is_converted_to_json()
{
    bourne::json input =
    {
        "code", 1
    };

    AdvancedAuctionOperationError obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["code"] == output["code"]);




}


void test_AdvancedAuctionOperationError_message_is_converted_to_json()
{

    bourne::json input =
    {
        "message", "hello"
    };

    AdvancedAuctionOperationError obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["message"] == output["message"]);



}


