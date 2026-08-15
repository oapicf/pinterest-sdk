
#include "Multiple_product_groups_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_Multiple_product_groups_inner_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "description", "hello"
    };

    Multiple_product_groups_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}


void test_Multiple_product_groups_inner_feed_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "feed_id", "hello"
    };

    Multiple_product_groups_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFeedId().c_str());






}



void test_Multiple_product_groups_inner_is_featured_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_featured", true
    };

    Multiple_product_groups_inner obj(input.dump());

    TEST_ASSERT(true == obj.isIsFeatured());




}


void test_Multiple_product_groups_inner_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    Multiple_product_groups_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_Multiple_product_groups_inner_catalog_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "catalog_id", "hello"
    };

    Multiple_product_groups_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCatalogId().c_str());






}


void test_Multiple_product_groups_inner_catalog_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "catalog_type", "hello"
    };

    Multiple_product_groups_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCatalogType().c_str());






}





void test_Multiple_product_groups_inner_description_is_converted_to_json()
{

    bourne::json input =
    {
        "description", "hello"
    };

    Multiple_product_groups_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}


void test_Multiple_product_groups_inner_feed_id_is_converted_to_json()
{

    bourne::json input =
    {
        "feed_id", "hello"
    };

    Multiple_product_groups_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["feed_id"] == output["feed_id"]);



}



void test_Multiple_product_groups_inner_is_featured_is_converted_to_json()
{


    bourne::json input =
    {
        "is_featured", true
    };

    Multiple_product_groups_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_featured"] == output["is_featured"]);


}


void test_Multiple_product_groups_inner_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    Multiple_product_groups_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_Multiple_product_groups_inner_catalog_id_is_converted_to_json()
{

    bourne::json input =
    {
        "catalog_id", "hello"
    };

    Multiple_product_groups_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["catalog_id"] == output["catalog_id"]);



}


void test_Multiple_product_groups_inner_catalog_type_is_converted_to_json()
{

    bourne::json input =
    {
        "catalog_type", "hello"
    };

    Multiple_product_groups_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["catalog_type"] == output["catalog_type"]);



}




