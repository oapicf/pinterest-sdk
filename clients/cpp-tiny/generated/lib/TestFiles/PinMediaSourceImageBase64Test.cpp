
#include "PinMediaSourceImageBase64.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_PinMediaSourceImageBase64_data_is_assigned_from_json()
{


    bourne::json input =
    {
        "data", "hello"
    };

    PinMediaSourceImageBase64 obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getData().c_str());






}


void test_PinMediaSourceImageBase64_is_standard_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_standard", true
    };

    PinMediaSourceImageBase64 obj(input.dump());

    TEST_ASSERT(true == obj.isIsStandard());




}


void test_PinMediaSourceImageBase64_source_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "source_type", "hello"
    };

    PinMediaSourceImageBase64 obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSourceType().c_str());






}




void test_PinMediaSourceImageBase64_data_is_converted_to_json()
{

    bourne::json input =
    {
        "data", "hello"
    };

    PinMediaSourceImageBase64 obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["data"] == output["data"]);



}


void test_PinMediaSourceImageBase64_is_standard_is_converted_to_json()
{


    bourne::json input =
    {
        "is_standard", true
    };

    PinMediaSourceImageBase64 obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_standard"] == output["is_standard"]);


}


void test_PinMediaSourceImageBase64_source_type_is_converted_to_json()
{

    bourne::json input =
    {
        "source_type", "hello"
    };

    PinMediaSourceImageBase64 obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["source_type"] == output["source_type"]);



}


