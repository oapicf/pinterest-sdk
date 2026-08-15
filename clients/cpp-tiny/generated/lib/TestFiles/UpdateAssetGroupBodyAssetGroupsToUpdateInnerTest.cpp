
#include "UpdateAssetGroupBody_asset_groups_to_update_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_UpdateAssetGroupBody_asset_groups_to_update_inner_asset_group_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "asset_group_id", "hello"
    };

    UpdateAssetGroupBody_asset_groups_to_update_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAssetGroupId().c_str());






}





void test_UpdateAssetGroupBody_asset_groups_to_update_inner_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "description", "hello"
    };

    UpdateAssetGroupBody_asset_groups_to_update_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}


void test_UpdateAssetGroupBody_asset_groups_to_update_inner_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    UpdateAssetGroupBody_asset_groups_to_update_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}



void test_UpdateAssetGroupBody_asset_groups_to_update_inner_asset_group_id_is_converted_to_json()
{

    bourne::json input =
    {
        "asset_group_id", "hello"
    };

    UpdateAssetGroupBody_asset_groups_to_update_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["asset_group_id"] == output["asset_group_id"]);



}





void test_UpdateAssetGroupBody_asset_groups_to_update_inner_description_is_converted_to_json()
{

    bourne::json input =
    {
        "description", "hello"
    };

    UpdateAssetGroupBody_asset_groups_to_update_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}


void test_UpdateAssetGroupBody_asset_groups_to_update_inner_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    UpdateAssetGroupBody_asset_groups_to_update_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


