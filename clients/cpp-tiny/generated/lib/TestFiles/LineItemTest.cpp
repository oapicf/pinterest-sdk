
#include "LineItem.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_LineItem_product_brand_is_assigned_from_json()
{


    bourne::json input =
    {
        "product_brand", "hello"
    };

    LineItem obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getProductBrand().c_str());






}


void test_LineItem_product_category_is_assigned_from_json()
{


    bourne::json input =
    {
        "product_category", "hello"
    };

    LineItem obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getProductCategory().c_str());






}


void test_LineItem_product_id_is_assigned_from_json()
{
    bourne::json input =
    {
        "product_id", 1
    };

    LineItem obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getProductId());








}


void test_LineItem_product_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "product_name", "hello"
    };

    LineItem obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getProductName().c_str());






}


void test_LineItem_product_price_is_assigned_from_json()
{


    bourne::json input =
    {
        "product_price", "hello"
    };

    LineItem obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getProductPrice().c_str());






}


void test_LineItem_product_quantity_is_assigned_from_json()
{
    bourne::json input =
    {
        "product_quantity", 1
    };

    LineItem obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getProductQuantity());








}


void test_LineItem_product_variant_is_assigned_from_json()
{


    bourne::json input =
    {
        "product_variant", "hello"
    };

    LineItem obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getProductVariant().c_str());






}


void test_LineItem_product_variant_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "product_variant_id", "hello"
    };

    LineItem obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getProductVariantId().c_str());






}



void test_LineItem_product_brand_is_converted_to_json()
{

    bourne::json input =
    {
        "product_brand", "hello"
    };

    LineItem obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["product_brand"] == output["product_brand"]);



}


void test_LineItem_product_category_is_converted_to_json()
{

    bourne::json input =
    {
        "product_category", "hello"
    };

    LineItem obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["product_category"] == output["product_category"]);



}


void test_LineItem_product_id_is_converted_to_json()
{
    bourne::json input =
    {
        "product_id", 1
    };

    LineItem obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["product_id"] == output["product_id"]);




}


void test_LineItem_product_name_is_converted_to_json()
{

    bourne::json input =
    {
        "product_name", "hello"
    };

    LineItem obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["product_name"] == output["product_name"]);



}


void test_LineItem_product_price_is_converted_to_json()
{

    bourne::json input =
    {
        "product_price", "hello"
    };

    LineItem obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["product_price"] == output["product_price"]);



}


void test_LineItem_product_quantity_is_converted_to_json()
{
    bourne::json input =
    {
        "product_quantity", 1
    };

    LineItem obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["product_quantity"] == output["product_quantity"]);




}


void test_LineItem_product_variant_is_converted_to_json()
{

    bourne::json input =
    {
        "product_variant", "hello"
    };

    LineItem obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["product_variant"] == output["product_variant"]);



}


void test_LineItem_product_variant_id_is_converted_to_json()
{

    bourne::json input =
    {
        "product_variant_id", "hello"
    };

    LineItem obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["product_variant_id"] == output["product_variant_id"]);



}


