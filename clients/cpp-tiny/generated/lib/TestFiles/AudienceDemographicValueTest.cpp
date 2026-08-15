
#include "AudienceDemographicValue.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_AudienceDemographicValue_key_is_assigned_from_json()
{


    bourne::json input =
    {
        "key", "hello"
    };

    AudienceDemographicValue obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getKey().c_str());






}


void test_AudienceDemographicValue_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    AudienceDemographicValue obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_AudienceDemographicValue_ratio_is_assigned_from_json()
{








}



void test_AudienceDemographicValue_key_is_converted_to_json()
{

    bourne::json input =
    {
        "key", "hello"
    };

    AudienceDemographicValue obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["key"] == output["key"]);



}


void test_AudienceDemographicValue_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    AudienceDemographicValue obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_AudienceDemographicValue_ratio_is_converted_to_json()
{




}


