
#include "CatalogsUpdatableHotelAttributes.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_CatalogsUpdatableHotelAttributes_base_price_is_assigned_from_json()
{


    bourne::json input =
    {
        "base_price", "hello"
    };

    CatalogsUpdatableHotelAttributes obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBasePrice().c_str());






}


void test_CatalogsUpdatableHotelAttributes_brand_is_assigned_from_json()
{


    bourne::json input =
    {
        "brand", "hello"
    };

    CatalogsUpdatableHotelAttributes obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBrand().c_str());






}


void test_CatalogsUpdatableHotelAttributes_category_is_assigned_from_json()
{


    bourne::json input =
    {
        "category", "hello"
    };

    CatalogsUpdatableHotelAttributes obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCategory().c_str());






}


void test_CatalogsUpdatableHotelAttributes_custom_label_0_is_assigned_from_json()
{


    bourne::json input =
    {
        "custom_label_0", "hello"
    };

    CatalogsUpdatableHotelAttributes obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCustomLabel0().c_str());






}


void test_CatalogsUpdatableHotelAttributes_custom_label_1_is_assigned_from_json()
{


    bourne::json input =
    {
        "custom_label_1", "hello"
    };

    CatalogsUpdatableHotelAttributes obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCustomLabel1().c_str());






}


void test_CatalogsUpdatableHotelAttributes_custom_label_2_is_assigned_from_json()
{


    bourne::json input =
    {
        "custom_label_2", "hello"
    };

    CatalogsUpdatableHotelAttributes obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCustomLabel2().c_str());






}


void test_CatalogsUpdatableHotelAttributes_custom_label_3_is_assigned_from_json()
{


    bourne::json input =
    {
        "custom_label_3", "hello"
    };

    CatalogsUpdatableHotelAttributes obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCustomLabel3().c_str());






}


void test_CatalogsUpdatableHotelAttributes_custom_label_4_is_assigned_from_json()
{


    bourne::json input =
    {
        "custom_label_4", "hello"
    };

    CatalogsUpdatableHotelAttributes obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCustomLabel4().c_str());






}


void test_CatalogsUpdatableHotelAttributes_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "description", "hello"
    };

    CatalogsUpdatableHotelAttributes obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}



void test_CatalogsUpdatableHotelAttributes_latitude_is_assigned_from_json()
{








}


void test_CatalogsUpdatableHotelAttributes_link_is_assigned_from_json()
{


    bourne::json input =
    {
        "link", "hello"
    };

    CatalogsUpdatableHotelAttributes obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLink().c_str());






}


void test_CatalogsUpdatableHotelAttributes_longitude_is_assigned_from_json()
{








}


void test_CatalogsUpdatableHotelAttributes_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    CatalogsUpdatableHotelAttributes obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}



void test_CatalogsUpdatableHotelAttributes_sale_price_is_assigned_from_json()
{


    bourne::json input =
    {
        "sale_price", "hello"
    };

    CatalogsUpdatableHotelAttributes obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSalePrice().c_str());






}




void test_CatalogsUpdatableHotelAttributes_base_price_is_converted_to_json()
{

    bourne::json input =
    {
        "base_price", "hello"
    };

    CatalogsUpdatableHotelAttributes obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["base_price"] == output["base_price"]);



}


void test_CatalogsUpdatableHotelAttributes_brand_is_converted_to_json()
{

    bourne::json input =
    {
        "brand", "hello"
    };

    CatalogsUpdatableHotelAttributes obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["brand"] == output["brand"]);



}


void test_CatalogsUpdatableHotelAttributes_category_is_converted_to_json()
{

    bourne::json input =
    {
        "category", "hello"
    };

    CatalogsUpdatableHotelAttributes obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["category"] == output["category"]);



}


void test_CatalogsUpdatableHotelAttributes_custom_label_0_is_converted_to_json()
{

    bourne::json input =
    {
        "custom_label_0", "hello"
    };

    CatalogsUpdatableHotelAttributes obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["custom_label_0"] == output["custom_label_0"]);



}


void test_CatalogsUpdatableHotelAttributes_custom_label_1_is_converted_to_json()
{

    bourne::json input =
    {
        "custom_label_1", "hello"
    };

    CatalogsUpdatableHotelAttributes obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["custom_label_1"] == output["custom_label_1"]);



}


void test_CatalogsUpdatableHotelAttributes_custom_label_2_is_converted_to_json()
{

    bourne::json input =
    {
        "custom_label_2", "hello"
    };

    CatalogsUpdatableHotelAttributes obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["custom_label_2"] == output["custom_label_2"]);



}


void test_CatalogsUpdatableHotelAttributes_custom_label_3_is_converted_to_json()
{

    bourne::json input =
    {
        "custom_label_3", "hello"
    };

    CatalogsUpdatableHotelAttributes obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["custom_label_3"] == output["custom_label_3"]);



}


void test_CatalogsUpdatableHotelAttributes_custom_label_4_is_converted_to_json()
{

    bourne::json input =
    {
        "custom_label_4", "hello"
    };

    CatalogsUpdatableHotelAttributes obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["custom_label_4"] == output["custom_label_4"]);



}


void test_CatalogsUpdatableHotelAttributes_description_is_converted_to_json()
{

    bourne::json input =
    {
        "description", "hello"
    };

    CatalogsUpdatableHotelAttributes obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}



void test_CatalogsUpdatableHotelAttributes_latitude_is_converted_to_json()
{




}


void test_CatalogsUpdatableHotelAttributes_link_is_converted_to_json()
{

    bourne::json input =
    {
        "link", "hello"
    };

    CatalogsUpdatableHotelAttributes obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["link"] == output["link"]);



}


void test_CatalogsUpdatableHotelAttributes_longitude_is_converted_to_json()
{




}


void test_CatalogsUpdatableHotelAttributes_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    CatalogsUpdatableHotelAttributes obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}



void test_CatalogsUpdatableHotelAttributes_sale_price_is_converted_to_json()
{

    bourne::json input =
    {
        "sale_price", "hello"
    };

    CatalogsUpdatableHotelAttributes obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["sale_price"] == output["sale_price"]);



}


