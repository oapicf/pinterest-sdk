
#include "ItemValidationEvent.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ItemValidationEvent_attribute_is_assigned_from_json()
{


    bourne::json input =
    {
        "attribute", "hello"
    };

    ItemValidationEvent obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAttribute().c_str());






}


void test_ItemValidationEvent_code_is_assigned_from_json()
{
    bourne::json input =
    {
        "code", 1
    };

    ItemValidationEvent obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCode());








}


void test_ItemValidationEvent_message_is_assigned_from_json()
{


    bourne::json input =
    {
        "message", "hello"
    };

    ItemValidationEvent obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMessage().c_str());






}



void test_ItemValidationEvent_attribute_is_converted_to_json()
{

    bourne::json input =
    {
        "attribute", "hello"
    };

    ItemValidationEvent obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["attribute"] == output["attribute"]);



}


void test_ItemValidationEvent_code_is_converted_to_json()
{
    bourne::json input =
    {
        "code", 1
    };

    ItemValidationEvent obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["code"] == output["code"]);




}


void test_ItemValidationEvent_message_is_converted_to_json()
{

    bourne::json input =
    {
        "message", "hello"
    };

    ItemValidationEvent obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["message"] == output["message"]);



}


