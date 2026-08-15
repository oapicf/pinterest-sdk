
#include "PinMediaWithVideo.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PinMediaWithVideo_cover_image_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "cover_image_url", "hello"
    };

    PinMediaWithVideo obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCoverImageUrl().c_str());






}


void test_PinMediaWithVideo_duration_is_assigned_from_json()
{








}


void test_PinMediaWithVideo_height_is_assigned_from_json()
{
    bourne::json input =
    {
        "height", 1
    };

    PinMediaWithVideo obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getHeight());








}



void test_PinMediaWithVideo_media_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "media_type", "hello"
    };

    PinMediaWithVideo obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMediaType().c_str());






}


void test_PinMediaWithVideo_video_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "video_url", "hello"
    };

    PinMediaWithVideo obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getVideoUrl().c_str());






}


void test_PinMediaWithVideo_width_is_assigned_from_json()
{
    bourne::json input =
    {
        "width", 1
    };

    PinMediaWithVideo obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getWidth());








}



void test_PinMediaWithVideo_cover_image_url_is_converted_to_json()
{

    bourne::json input =
    {
        "cover_image_url", "hello"
    };

    PinMediaWithVideo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["cover_image_url"] == output["cover_image_url"]);



}


void test_PinMediaWithVideo_duration_is_converted_to_json()
{




}


void test_PinMediaWithVideo_height_is_converted_to_json()
{
    bourne::json input =
    {
        "height", 1
    };

    PinMediaWithVideo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["height"] == output["height"]);




}



void test_PinMediaWithVideo_media_type_is_converted_to_json()
{

    bourne::json input =
    {
        "media_type", "hello"
    };

    PinMediaWithVideo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["media_type"] == output["media_type"]);



}


void test_PinMediaWithVideo_video_url_is_converted_to_json()
{

    bourne::json input =
    {
        "video_url", "hello"
    };

    PinMediaWithVideo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["video_url"] == output["video_url"]);



}


void test_PinMediaWithVideo_width_is_converted_to_json()
{
    bourne::json input =
    {
        "width", 1
    };

    PinMediaWithVideo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["width"] == output["width"]);




}


