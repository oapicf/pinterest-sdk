
#include "AssetGroupBinding.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_AssetGroupBinding_asset_group_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "asset_group_description", "hello"
    };

    AssetGroupBinding obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAssetGroupDescription().c_str());






}


void test_AssetGroupBinding_asset_group_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "asset_group_name", "hello"
    };

    AssetGroupBinding obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAssetGroupName().c_str());






}





void test_AssetGroupBinding_created_time_is_assigned_from_json()
{
    bourne::json input =
    {
        "created_time", 1
    };

    AssetGroupBinding obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCreatedTime());








}


void test_AssetGroupBinding_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    AssetGroupBinding obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}




void test_AssetGroupBinding_updated_time_is_assigned_from_json()
{
    bourne::json input =
    {
        "updated_time", 1
    };

    AssetGroupBinding obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getUpdatedTime());








}




void test_AssetGroupBinding_asset_group_description_is_converted_to_json()
{

    bourne::json input =
    {
        "asset_group_description", "hello"
    };

    AssetGroupBinding obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["asset_group_description"] == output["asset_group_description"]);



}


void test_AssetGroupBinding_asset_group_name_is_converted_to_json()
{

    bourne::json input =
    {
        "asset_group_name", "hello"
    };

    AssetGroupBinding obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["asset_group_name"] == output["asset_group_name"]);



}





void test_AssetGroupBinding_created_time_is_converted_to_json()
{
    bourne::json input =
    {
        "created_time", 1
    };

    AssetGroupBinding obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["created_time"] == output["created_time"]);




}


void test_AssetGroupBinding_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    AssetGroupBinding obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}




void test_AssetGroupBinding_updated_time_is_converted_to_json()
{
    bourne::json input =
    {
        "updated_time", 1
    };

    AssetGroupBinding obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["updated_time"] == output["updated_time"]);




}


