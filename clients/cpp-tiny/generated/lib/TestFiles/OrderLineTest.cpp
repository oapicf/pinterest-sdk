
#include "OrderLine.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_OrderLine_ad_account_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "ad_account_id", "hello"
    };

    OrderLine obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAdAccountId().c_str());






}


void test_OrderLine_budget_is_assigned_from_json()
{








}


void test_OrderLine_end_time_is_assigned_from_json()
{








}


void test_OrderLine_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    OrderLine obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_OrderLine_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    OrderLine obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_OrderLine_paid_budget_is_assigned_from_json()
{








}



void test_OrderLine_purchase_order_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "purchase_order_id", "hello"
    };

    OrderLine obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPurchaseOrderId().c_str());






}


void test_OrderLine_start_time_is_assigned_from_json()
{








}



void test_OrderLine_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    OrderLine obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}




void test_OrderLine_ad_account_id_is_converted_to_json()
{

    bourne::json input =
    {
        "ad_account_id", "hello"
    };

    OrderLine obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["ad_account_id"] == output["ad_account_id"]);



}


void test_OrderLine_budget_is_converted_to_json()
{




}


void test_OrderLine_end_time_is_converted_to_json()
{




}


void test_OrderLine_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    OrderLine obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_OrderLine_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    OrderLine obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_OrderLine_paid_budget_is_converted_to_json()
{




}



void test_OrderLine_purchase_order_id_is_converted_to_json()
{

    bourne::json input =
    {
        "purchase_order_id", "hello"
    };

    OrderLine obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["purchase_order_id"] == output["purchase_order_id"]);



}


void test_OrderLine_start_time_is_converted_to_json()
{




}



void test_OrderLine_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    OrderLine obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}



