
#include "CatalogsCreateCreativeAssetsItem.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_CatalogsCreateCreativeAssetsItem_creative_assets_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "creative_assets_id", "hello"
    };

    CatalogsCreateCreativeAssetsItem obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCreativeAssetsId().c_str());






}


void test_CatalogsCreateCreativeAssetsItem_operation_is_assigned_from_json()
{


    bourne::json input =
    {
        "operation", "hello"
    };

    CatalogsCreateCreativeAssetsItem obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOperation().c_str());






}




void test_CatalogsCreateCreativeAssetsItem_creative_assets_id_is_converted_to_json()
{

    bourne::json input =
    {
        "creative_assets_id", "hello"
    };

    CatalogsCreateCreativeAssetsItem obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["creative_assets_id"] == output["creative_assets_id"]);



}


void test_CatalogsCreateCreativeAssetsItem_operation_is_converted_to_json()
{

    bourne::json input =
    {
        "operation", "hello"
    };

    CatalogsCreateCreativeAssetsItem obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["operation"] == output["operation"]);



}


