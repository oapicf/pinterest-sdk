
#include "EventData.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_EventData_lead_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "lead_type", "hello"
    };

    EventData obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLeadType().c_str());






}



void test_EventData_order_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "order_id", "hello"
    };

    EventData obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOrderId().c_str());






}


void test_EventData_order_quantity_is_assigned_from_json()
{
    bourne::json input =
    {
        "order_quantity", 1
    };

    EventData obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getOrderQuantity());








}


void test_EventData_page_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "page_name", "hello"
    };

    EventData obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPageName().c_str());






}


void test_EventData_promo_code_is_assigned_from_json()
{


    bourne::json input =
    {
        "promo_code", "hello"
    };

    EventData obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPromoCode().c_str());






}


void test_EventData_property_is_assigned_from_json()
{


    bourne::json input =
    {
        "property", "hello"
    };

    EventData obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getProperty().c_str());






}


void test_EventData_search_query_is_assigned_from_json()
{


    bourne::json input =
    {
        "search_query", "hello"
    };

    EventData obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSearchQuery().c_str());






}


void test_EventData_value_is_assigned_from_json()
{


    bourne::json input =
    {
        "value", "hello"
    };

    EventData obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getValue().c_str());






}


void test_EventData_video_title_is_assigned_from_json()
{


    bourne::json input =
    {
        "video_title", "hello"
    };

    EventData obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getVideoTitle().c_str());






}




void test_EventData_lead_type_is_converted_to_json()
{

    bourne::json input =
    {
        "lead_type", "hello"
    };

    EventData obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["lead_type"] == output["lead_type"]);



}



void test_EventData_order_id_is_converted_to_json()
{

    bourne::json input =
    {
        "order_id", "hello"
    };

    EventData obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["order_id"] == output["order_id"]);



}


void test_EventData_order_quantity_is_converted_to_json()
{
    bourne::json input =
    {
        "order_quantity", 1
    };

    EventData obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["order_quantity"] == output["order_quantity"]);




}


void test_EventData_page_name_is_converted_to_json()
{

    bourne::json input =
    {
        "page_name", "hello"
    };

    EventData obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["page_name"] == output["page_name"]);



}


void test_EventData_promo_code_is_converted_to_json()
{

    bourne::json input =
    {
        "promo_code", "hello"
    };

    EventData obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["promo_code"] == output["promo_code"]);



}


void test_EventData_property_is_converted_to_json()
{

    bourne::json input =
    {
        "property", "hello"
    };

    EventData obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["property"] == output["property"]);



}


void test_EventData_search_query_is_converted_to_json()
{

    bourne::json input =
    {
        "search_query", "hello"
    };

    EventData obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["search_query"] == output["search_query"]);



}


void test_EventData_value_is_converted_to_json()
{

    bourne::json input =
    {
        "value", "hello"
    };

    EventData obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["value"] == output["value"]);



}


void test_EventData_video_title_is_converted_to_json()
{

    bourne::json input =
    {
        "video_title", "hello"
    };

    EventData obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["video_title"] == output["video_title"]);



}


