
#include "AudienceDefinition.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_AudienceDefinition_date_is_assigned_from_json()
{


    bourne::json input =
    {
        "date", "hello"
    };

    AudienceDefinition obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDate().c_str());






}


void test_AudienceDefinition_scope_is_assigned_from_json()
{


    bourne::json input =
    {
        "scope", "hello"
    };

    AudienceDefinition obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getScope().c_str());






}


void test_AudienceDefinition_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    AudienceDefinition obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}



void test_AudienceDefinition_date_is_converted_to_json()
{

    bourne::json input =
    {
        "date", "hello"
    };

    AudienceDefinition obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["date"] == output["date"]);



}


void test_AudienceDefinition_scope_is_converted_to_json()
{

    bourne::json input =
    {
        "scope", "hello"
    };

    AudienceDefinition obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["scope"] == output["scope"]);



}


void test_AudienceDefinition_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    AudienceDefinition obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}


