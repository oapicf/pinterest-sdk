
#include "UpdateMemberResult.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_UpdateMemberResult_business_role_is_assigned_from_json()
{


    bourne::json input =
    {
        "business_role", "hello"
    };

    UpdateMemberResult obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBusinessRole().c_str());






}


void test_UpdateMemberResult_member_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "member_id", "hello"
    };

    UpdateMemberResult obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMemberId().c_str());






}



void test_UpdateMemberResult_business_role_is_converted_to_json()
{

    bourne::json input =
    {
        "business_role", "hello"
    };

    UpdateMemberResult obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["business_role"] == output["business_role"]);



}


void test_UpdateMemberResult_member_id_is_converted_to_json()
{

    bourne::json input =
    {
        "member_id", "hello"
    };

    UpdateMemberResult obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["member_id"] == output["member_id"]);



}


