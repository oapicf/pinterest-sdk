
#include "PinMediaSourceImageURL.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PinMediaSourceImageURL_is_standard_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_standard", true
    };

    PinMediaSourceImageURL obj(input.dump());

    TEST_ASSERT(true == obj.isIsStandard());




}


void test_PinMediaSourceImageURL_source_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "source_type", "hello"
    };

    PinMediaSourceImageURL obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSourceType().c_str());






}


void test_PinMediaSourceImageURL_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "url", "hello"
    };

    PinMediaSourceImageURL obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUrl().c_str());






}



void test_PinMediaSourceImageURL_is_standard_is_converted_to_json()
{


    bourne::json input =
    {
        "is_standard", true
    };

    PinMediaSourceImageURL obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_standard"] == output["is_standard"]);


}


void test_PinMediaSourceImageURL_source_type_is_converted_to_json()
{

    bourne::json input =
    {
        "source_type", "hello"
    };

    PinMediaSourceImageURL obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["source_type"] == output["source_type"]);



}


void test_PinMediaSourceImageURL_url_is_converted_to_json()
{

    bourne::json input =
    {
        "url", "hello"
    };

    PinMediaSourceImageURL obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["url"] == output["url"]);



}


