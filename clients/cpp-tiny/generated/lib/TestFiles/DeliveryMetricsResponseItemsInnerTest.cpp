
#include "DeliveryMetricsResponse_items_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_DeliveryMetricsResponse_items_inner_category_is_assigned_from_json()
{


    bourne::json input =
    {
        "category", "hello"
    };

    DeliveryMetricsResponse_items_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCategory().c_str());






}


void test_DeliveryMetricsResponse_items_inner_definition_is_assigned_from_json()
{


    bourne::json input =
    {
        "definition", "hello"
    };

    DeliveryMetricsResponse_items_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDefinition().c_str());






}


void test_DeliveryMetricsResponse_items_inner_display_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "display_name", "hello"
    };

    DeliveryMetricsResponse_items_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDisplayName().c_str());






}


void test_DeliveryMetricsResponse_items_inner_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    DeliveryMetricsResponse_items_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}



void test_DeliveryMetricsResponse_items_inner_category_is_converted_to_json()
{

    bourne::json input =
    {
        "category", "hello"
    };

    DeliveryMetricsResponse_items_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["category"] == output["category"]);



}


void test_DeliveryMetricsResponse_items_inner_definition_is_converted_to_json()
{

    bourne::json input =
    {
        "definition", "hello"
    };

    DeliveryMetricsResponse_items_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["definition"] == output["definition"]);



}


void test_DeliveryMetricsResponse_items_inner_display_name_is_converted_to_json()
{

    bourne::json input =
    {
        "display_name", "hello"
    };

    DeliveryMetricsResponse_items_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["display_name"] == output["display_name"]);



}


void test_DeliveryMetricsResponse_items_inner_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    DeliveryMetricsResponse_items_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


