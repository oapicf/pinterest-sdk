
#include "SSIOInsertionOrderStatusResponse.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_SSIOInsertionOrderStatusResponse_creation_time_is_assigned_from_json()
{


    bourne::json input =
    {
        "creation_time", "hello"
    };

    SSIOInsertionOrderStatusResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCreationTime().c_str());






}


void test_SSIOInsertionOrderStatusResponse_pin_order_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "pin_order_id", "hello"
    };

    SSIOInsertionOrderStatusResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPinOrderId().c_str());






}


void test_SSIOInsertionOrderStatusResponse_status_is_assigned_from_json()
{


    bourne::json input =
    {
        "status", "hello"
    };

    SSIOInsertionOrderStatusResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getStatus().c_str());






}



void test_SSIOInsertionOrderStatusResponse_creation_time_is_converted_to_json()
{

    bourne::json input =
    {
        "creation_time", "hello"
    };

    SSIOInsertionOrderStatusResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["creation_time"] == output["creation_time"]);



}


void test_SSIOInsertionOrderStatusResponse_pin_order_id_is_converted_to_json()
{

    bourne::json input =
    {
        "pin_order_id", "hello"
    };

    SSIOInsertionOrderStatusResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["pin_order_id"] == output["pin_order_id"]);



}


void test_SSIOInsertionOrderStatusResponse_status_is_converted_to_json()
{

    bourne::json input =
    {
        "status", "hello"
    };

    SSIOInsertionOrderStatusResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["status"] == output["status"]);



}


