
#include "ImageDetails.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ImageDetails_height_is_assigned_from_json()
{
    bourne::json input =
    {
        "height", 1
    };

    ImageDetails obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getHeight());








}


void test_ImageDetails_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "url", "hello"
    };

    ImageDetails obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUrl().c_str());






}


void test_ImageDetails_width_is_assigned_from_json()
{
    bourne::json input =
    {
        "width", 1
    };

    ImageDetails obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getWidth());








}



void test_ImageDetails_height_is_converted_to_json()
{
    bourne::json input =
    {
        "height", 1
    };

    ImageDetails obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["height"] == output["height"]);




}


void test_ImageDetails_url_is_converted_to_json()
{

    bourne::json input =
    {
        "url", "hello"
    };

    ImageDetails obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["url"] == output["url"]);



}


void test_ImageDetails_width_is_converted_to_json()
{
    bourne::json input =
    {
        "width", 1
    };

    ImageDetails obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["width"] == output["width"]);




}


