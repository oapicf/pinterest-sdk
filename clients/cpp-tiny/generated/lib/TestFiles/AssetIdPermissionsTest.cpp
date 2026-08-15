
#include "AssetIdPermissions.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_AssetIdPermissions_asset_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "asset_id", "hello"
    };

    AssetIdPermissions obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAssetId().c_str());






}


void test_AssetIdPermissions_asset_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "asset_type", "hello"
    };

    AssetIdPermissions obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAssetType().c_str());






}





void test_AssetIdPermissions_asset_id_is_converted_to_json()
{

    bourne::json input =
    {
        "asset_id", "hello"
    };

    AssetIdPermissions obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["asset_id"] == output["asset_id"]);



}


void test_AssetIdPermissions_asset_type_is_converted_to_json()
{

    bourne::json input =
    {
        "asset_type", "hello"
    };

    AssetIdPermissions obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["asset_type"] == output["asset_type"]);



}



