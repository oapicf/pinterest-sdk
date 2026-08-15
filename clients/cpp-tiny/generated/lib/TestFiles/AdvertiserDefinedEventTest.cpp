
#include "AdvertiserDefinedEvent.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_AdvertiserDefinedEvent_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    AdvertiserDefinedEvent obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_AdvertiserDefinedEvent_mapped_conversion_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "mapped_conversion_type", "hello"
    };

    AdvertiserDefinedEvent obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMappedConversionType().c_str());






}



void test_AdvertiserDefinedEvent_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    AdvertiserDefinedEvent obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_AdvertiserDefinedEvent_mapped_conversion_type_is_converted_to_json()
{

    bourne::json input =
    {
        "mapped_conversion_type", "hello"
    };

    AdvertiserDefinedEvent obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["mapped_conversion_type"] == output["mapped_conversion_type"]);



}


