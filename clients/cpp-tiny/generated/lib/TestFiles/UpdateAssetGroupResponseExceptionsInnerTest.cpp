
#include "UpdateAssetGroupResponse_exceptions_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_UpdateAssetGroupResponse_exceptions_inner_asset_group_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "asset_group_id", "hello"
    };

    UpdateAssetGroupResponse_exceptions_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAssetGroupId().c_str());






}


void test_UpdateAssetGroupResponse_exceptions_inner_code_is_assigned_from_json()
{
    bourne::json input =
    {
        "code", 1
    };

    UpdateAssetGroupResponse_exceptions_inner obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCode());








}


void test_UpdateAssetGroupResponse_exceptions_inner_message_is_assigned_from_json()
{


    bourne::json input =
    {
        "message", "hello"
    };

    UpdateAssetGroupResponse_exceptions_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMessage().c_str());






}



void test_UpdateAssetGroupResponse_exceptions_inner_asset_group_id_is_converted_to_json()
{

    bourne::json input =
    {
        "asset_group_id", "hello"
    };

    UpdateAssetGroupResponse_exceptions_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["asset_group_id"] == output["asset_group_id"]);



}


void test_UpdateAssetGroupResponse_exceptions_inner_code_is_converted_to_json()
{
    bourne::json input =
    {
        "code", 1
    };

    UpdateAssetGroupResponse_exceptions_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["code"] == output["code"]);




}


void test_UpdateAssetGroupResponse_exceptions_inner_message_is_converted_to_json()
{

    bourne::json input =
    {
        "message", "hello"
    };

    UpdateAssetGroupResponse_exceptions_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["message"] == output["message"]);



}


