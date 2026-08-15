
#include "AdsCreditRedeemResponse.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_AdsCreditRedeemResponse_errorCode_is_assigned_from_json()
{
    bourne::json input =
    {
        "errorCode", 1
    };

    AdsCreditRedeemResponse obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getErrorCode());








}


void test_AdsCreditRedeemResponse_errorMessage_is_assigned_from_json()
{


    bourne::json input =
    {
        "errorMessage", "hello"
    };

    AdsCreditRedeemResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getErrorMessage().c_str());






}


void test_AdsCreditRedeemResponse_success_is_assigned_from_json()
{




    bourne::json input =
    {
        "success", true
    };

    AdsCreditRedeemResponse obj(input.dump());

    TEST_ASSERT(true == obj.isSuccess());




}



void test_AdsCreditRedeemResponse_errorCode_is_converted_to_json()
{
    bourne::json input =
    {
        "errorCode", 1
    };

    AdsCreditRedeemResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["errorCode"] == output["errorCode"]);




}


void test_AdsCreditRedeemResponse_errorMessage_is_converted_to_json()
{

    bourne::json input =
    {
        "errorMessage", "hello"
    };

    AdsCreditRedeemResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["errorMessage"] == output["errorMessage"]);



}


void test_AdsCreditRedeemResponse_success_is_converted_to_json()
{


    bourne::json input =
    {
        "success", true
    };

    AdsCreditRedeemResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["success"] == output["success"]);


}


