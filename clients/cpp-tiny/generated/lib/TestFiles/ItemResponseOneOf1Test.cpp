
#include "ItemResponse_oneOf_1.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"





void test_ItemResponse_oneOf_1_item_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "item_id", "hello"
    };

    ItemResponse_oneOf_1 obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getItemId().c_str());






}


void test_ItemResponse_oneOf_1_hotel_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "hotel_id", "hello"
    };

    ItemResponse_oneOf_1 obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getHotelId().c_str());






}


void test_ItemResponse_oneOf_1_creative_assets_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "creative_assets_id", "hello"
    };

    ItemResponse_oneOf_1 obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCreativeAssetsId().c_str());






}





void test_ItemResponse_oneOf_1_item_id_is_converted_to_json()
{

    bourne::json input =
    {
        "item_id", "hello"
    };

    ItemResponse_oneOf_1 obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["item_id"] == output["item_id"]);



}


void test_ItemResponse_oneOf_1_hotel_id_is_converted_to_json()
{

    bourne::json input =
    {
        "hotel_id", "hello"
    };

    ItemResponse_oneOf_1 obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["hotel_id"] == output["hotel_id"]);



}


void test_ItemResponse_oneOf_1_creative_assets_id_is_converted_to_json()
{

    bourne::json input =
    {
        "creative_assets_id", "hello"
    };

    ItemResponse_oneOf_1 obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["creative_assets_id"] == output["creative_assets_id"]);



}


