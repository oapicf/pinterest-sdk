
#include "CreateAssetGroupBody.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CreateAssetGroupBody_asset_group_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "asset_group_description", "hello"
    };

    CreateAssetGroupBody obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAssetGroupDescription().c_str());






}


void test_CreateAssetGroupBody_asset_group_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "asset_group_name", "hello"
    };

    CreateAssetGroupBody obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAssetGroupName().c_str());






}




void test_CreateAssetGroupBody_asset_group_description_is_converted_to_json()
{

    bourne::json input =
    {
        "asset_group_description", "hello"
    };

    CreateAssetGroupBody obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["asset_group_description"] == output["asset_group_description"]);



}


void test_CreateAssetGroupBody_asset_group_name_is_converted_to_json()
{

    bourne::json input =
    {
        "asset_group_name", "hello"
    };

    CreateAssetGroupBody obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["asset_group_name"] == output["asset_group_name"]);



}



