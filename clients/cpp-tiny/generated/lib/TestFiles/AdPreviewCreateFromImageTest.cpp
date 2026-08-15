
#include "AdPreviewCreateFromImage.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_AdPreviewCreateFromImage_image_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "image_url", "hello"
    };

    AdPreviewCreateFromImage obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getImageUrl().c_str());






}


void test_AdPreviewCreateFromImage_title_is_assigned_from_json()
{


    bourne::json input =
    {
        "title", "hello"
    };

    AdPreviewCreateFromImage obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getTitle().c_str());






}



void test_AdPreviewCreateFromImage_image_url_is_converted_to_json()
{

    bourne::json input =
    {
        "image_url", "hello"
    };

    AdPreviewCreateFromImage obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["image_url"] == output["image_url"]);



}


void test_AdPreviewCreateFromImage_title_is_converted_to_json()
{

    bourne::json input =
    {
        "title", "hello"
    };

    AdPreviewCreateFromImage obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["title"] == output["title"]);



}


