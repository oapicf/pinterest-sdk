
#include "ConversionEvents_data_inner_custom_data_contents_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ConversionEvents_data_inner_custom_data_contents_inner_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    ConversionEvents_data_inner_custom_data_contents_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_ConversionEvents_data_inner_custom_data_contents_inner_item_brand_is_assigned_from_json()
{


    bourne::json input =
    {
        "item_brand", "hello"
    };

    ConversionEvents_data_inner_custom_data_contents_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getItemBrand().c_str());






}


void test_ConversionEvents_data_inner_custom_data_contents_inner_item_category_is_assigned_from_json()
{


    bourne::json input =
    {
        "item_category", "hello"
    };

    ConversionEvents_data_inner_custom_data_contents_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getItemCategory().c_str());






}


void test_ConversionEvents_data_inner_custom_data_contents_inner_item_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "item_name", "hello"
    };

    ConversionEvents_data_inner_custom_data_contents_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getItemName().c_str());






}


void test_ConversionEvents_data_inner_custom_data_contents_inner_item_price_is_assigned_from_json()
{


    bourne::json input =
    {
        "item_price", "hello"
    };

    ConversionEvents_data_inner_custom_data_contents_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getItemPrice().c_str());






}


void test_ConversionEvents_data_inner_custom_data_contents_inner_quantity_is_assigned_from_json()
{






    bourne::json input =
    {
        "quantity", 1
    };

    ConversionEvents_data_inner_custom_data_contents_inner obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getQuantity());


}



void test_ConversionEvents_data_inner_custom_data_contents_inner_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    ConversionEvents_data_inner_custom_data_contents_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_ConversionEvents_data_inner_custom_data_contents_inner_item_brand_is_converted_to_json()
{

    bourne::json input =
    {
        "item_brand", "hello"
    };

    ConversionEvents_data_inner_custom_data_contents_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["item_brand"] == output["item_brand"]);



}


void test_ConversionEvents_data_inner_custom_data_contents_inner_item_category_is_converted_to_json()
{

    bourne::json input =
    {
        "item_category", "hello"
    };

    ConversionEvents_data_inner_custom_data_contents_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["item_category"] == output["item_category"]);



}


void test_ConversionEvents_data_inner_custom_data_contents_inner_item_name_is_converted_to_json()
{

    bourne::json input =
    {
        "item_name", "hello"
    };

    ConversionEvents_data_inner_custom_data_contents_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["item_name"] == output["item_name"]);



}


void test_ConversionEvents_data_inner_custom_data_contents_inner_item_price_is_converted_to_json()
{

    bourne::json input =
    {
        "item_price", "hello"
    };

    ConversionEvents_data_inner_custom_data_contents_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["item_price"] == output["item_price"]);



}


void test_ConversionEvents_data_inner_custom_data_contents_inner_quantity_is_converted_to_json()
{



    bourne::json input =
    {
        "quantity", 1
    };

    ConversionEvents_data_inner_custom_data_contents_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["quantity"] == output["quantity"]);

}


