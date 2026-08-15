
#include "Label.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_Label_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    Label obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}



void test_Label_parent_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "parent_id", "hello"
    };

    Label obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getParentId().c_str());






}


void test_Label_parent_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "parent_type", "hello"
    };

    Label obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getParentType().c_str());






}



void test_Label_value_is_assigned_from_json()
{


    bourne::json input =
    {
        "value", "hello"
    };

    Label obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getValue().c_str());






}



void test_Label_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    Label obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}



void test_Label_parent_id_is_converted_to_json()
{

    bourne::json input =
    {
        "parent_id", "hello"
    };

    Label obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["parent_id"] == output["parent_id"]);



}


void test_Label_parent_type_is_converted_to_json()
{

    bourne::json input =
    {
        "parent_type", "hello"
    };

    Label obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["parent_type"] == output["parent_type"]);



}



void test_Label_value_is_converted_to_json()
{

    bourne::json input =
    {
        "value", "hello"
    };

    Label obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["value"] == output["value"]);



}


