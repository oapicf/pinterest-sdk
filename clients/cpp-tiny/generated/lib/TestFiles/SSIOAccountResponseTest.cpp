
#include "SSIOAccountResponse.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_SSIOAccountResponse_can_edit_is_assigned_from_json()
{




    bourne::json input =
    {
        "can_edit", true
    };

    SSIOAccountResponse obj(input.dump());

    TEST_ASSERT(true == obj.isCanEdit());




}


void test_SSIOAccountResponse_currency_is_assigned_from_json()
{


    bourne::json input =
    {
        "currency", "hello"
    };

    SSIOAccountResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCurrency().c_str());






}


void test_SSIOAccountResponse_eligible_is_assigned_from_json()
{




    bourne::json input =
    {
        "eligible", true
    };

    SSIOAccountResponse obj(input.dump());

    TEST_ASSERT(true == obj.isEligible());




}


void test_SSIOAccountResponse_error_is_assigned_from_json()
{


    bourne::json input =
    {
        "error", "hello"
    };

    SSIOAccountResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getError().c_str());






}





void test_SSIOAccountResponse_can_edit_is_converted_to_json()
{


    bourne::json input =
    {
        "can_edit", true
    };

    SSIOAccountResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["can_edit"] == output["can_edit"]);


}


void test_SSIOAccountResponse_currency_is_converted_to_json()
{

    bourne::json input =
    {
        "currency", "hello"
    };

    SSIOAccountResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["currency"] == output["currency"]);



}


void test_SSIOAccountResponse_eligible_is_converted_to_json()
{


    bourne::json input =
    {
        "eligible", true
    };

    SSIOAccountResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["eligible"] == output["eligible"]);


}


void test_SSIOAccountResponse_error_is_converted_to_json()
{

    bourne::json input =
    {
        "error", "hello"
    };

    SSIOAccountResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["error"] == output["error"]);



}



