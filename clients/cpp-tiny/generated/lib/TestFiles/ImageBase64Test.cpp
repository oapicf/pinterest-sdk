
#include "Image_Base64.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_Image_Base64_content_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "content_type", "hello"
    };

    Image_Base64 obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getContentType().c_str());






}


void test_Image_Base64_data_is_assigned_from_json()
{


    bourne::json input =
    {
        "data", "hello"
    };

    Image_Base64 obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getData().c_str());






}



void test_Image_Base64_content_type_is_converted_to_json()
{

    bourne::json input =
    {
        "content_type", "hello"
    };

    Image_Base64 obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["content_type"] == output["content_type"]);



}


void test_Image_Base64_data_is_converted_to_json()
{

    bourne::json input =
    {
        "data", "hello"
    };

    Image_Base64 obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["data"] == output["data"]);



}


