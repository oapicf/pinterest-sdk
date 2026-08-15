
#include "SSIOAccountAddress.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_SSIOAccountAddress_address_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "address_id", "hello"
    };

    SSIOAccountAddress obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAddressId().c_str());






}


void test_SSIOAccountAddress_display_is_assigned_from_json()
{


    bourne::json input =
    {
        "display", "hello"
    };

    SSIOAccountAddress obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDisplay().c_str());






}


void test_SSIOAccountAddress_order_legal_entity_is_assigned_from_json()
{


    bourne::json input =
    {
        "order_legal_entity", "hello"
    };

    SSIOAccountAddress obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOrderLegalEntity().c_str());






}


void test_SSIOAccountAddress_purpose_is_assigned_from_json()
{


    bourne::json input =
    {
        "purpose", "hello"
    };

    SSIOAccountAddress obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPurpose().c_str());






}



void test_SSIOAccountAddress_address_id_is_converted_to_json()
{

    bourne::json input =
    {
        "address_id", "hello"
    };

    SSIOAccountAddress obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["address_id"] == output["address_id"]);



}


void test_SSIOAccountAddress_display_is_converted_to_json()
{

    bourne::json input =
    {
        "display", "hello"
    };

    SSIOAccountAddress obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["display"] == output["display"]);



}


void test_SSIOAccountAddress_order_legal_entity_is_converted_to_json()
{

    bourne::json input =
    {
        "order_legal_entity", "hello"
    };

    SSIOAccountAddress obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["order_legal_entity"] == output["order_legal_entity"]);



}


void test_SSIOAccountAddress_purpose_is_converted_to_json()
{

    bourne::json input =
    {
        "purpose", "hello"
    };

    SSIOAccountAddress obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["purpose"] == output["purpose"]);



}


