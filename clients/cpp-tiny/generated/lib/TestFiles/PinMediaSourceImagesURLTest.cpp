
#include "PinMediaSourceImagesURL.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PinMediaSourceImagesURL_index_is_assigned_from_json()
{
    bourne::json input =
    {
        "index", 1
    };

    PinMediaSourceImagesURL obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getIndex());








}



void test_PinMediaSourceImagesURL_source_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "source_type", "hello"
    };

    PinMediaSourceImagesURL obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSourceType().c_str());






}



void test_PinMediaSourceImagesURL_index_is_converted_to_json()
{
    bourne::json input =
    {
        "index", 1
    };

    PinMediaSourceImagesURL obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["index"] == output["index"]);




}



void test_PinMediaSourceImagesURL_source_type_is_converted_to_json()
{

    bourne::json input =
    {
        "source_type", "hello"
    };

    PinMediaSourceImagesURL obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["source_type"] == output["source_type"]);



}


