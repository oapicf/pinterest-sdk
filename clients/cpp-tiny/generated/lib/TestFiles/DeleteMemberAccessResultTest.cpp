
#include "DeleteMemberAccessResult.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_DeleteMemberAccessResult_asset_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "asset_id", "hello"
    };

    DeleteMemberAccessResult obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAssetId().c_str());






}


void test_DeleteMemberAccessResult_member_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "member_id", "hello"
    };

    DeleteMemberAccessResult obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMemberId().c_str());






}



void test_DeleteMemberAccessResult_asset_id_is_converted_to_json()
{

    bourne::json input =
    {
        "asset_id", "hello"
    };

    DeleteMemberAccessResult obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["asset_id"] == output["asset_id"]);



}


void test_DeleteMemberAccessResult_member_id_is_converted_to_json()
{

    bourne::json input =
    {
        "member_id", "hello"
    };

    DeleteMemberAccessResult obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["member_id"] == output["member_id"]);



}


