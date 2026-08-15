
#include "VideoMetadataWithItemType.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_VideoMetadataWithItemType_cover_image_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "cover_image_url", "hello"
    };

    VideoMetadataWithItemType obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCoverImageUrl().c_str());






}


void test_VideoMetadataWithItemType_duration_is_assigned_from_json()
{








}


void test_VideoMetadataWithItemType_height_is_assigned_from_json()
{
    bourne::json input =
    {
        "height", 1
    };

    VideoMetadataWithItemType obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getHeight());








}


void test_VideoMetadataWithItemType_item_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "item_type", "hello"
    };

    VideoMetadataWithItemType obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getItemType().c_str());






}


void test_VideoMetadataWithItemType_video_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "video_url", "hello"
    };

    VideoMetadataWithItemType obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getVideoUrl().c_str());






}


void test_VideoMetadataWithItemType_width_is_assigned_from_json()
{
    bourne::json input =
    {
        "width", 1
    };

    VideoMetadataWithItemType obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getWidth());








}



void test_VideoMetadataWithItemType_cover_image_url_is_converted_to_json()
{

    bourne::json input =
    {
        "cover_image_url", "hello"
    };

    VideoMetadataWithItemType obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["cover_image_url"] == output["cover_image_url"]);



}


void test_VideoMetadataWithItemType_duration_is_converted_to_json()
{




}


void test_VideoMetadataWithItemType_height_is_converted_to_json()
{
    bourne::json input =
    {
        "height", 1
    };

    VideoMetadataWithItemType obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["height"] == output["height"]);




}


void test_VideoMetadataWithItemType_item_type_is_converted_to_json()
{

    bourne::json input =
    {
        "item_type", "hello"
    };

    VideoMetadataWithItemType obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["item_type"] == output["item_type"]);



}


void test_VideoMetadataWithItemType_video_url_is_converted_to_json()
{

    bourne::json input =
    {
        "video_url", "hello"
    };

    VideoMetadataWithItemType obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["video_url"] == output["video_url"]);



}


void test_VideoMetadataWithItemType_width_is_converted_to_json()
{
    bourne::json input =
    {
        "width", 1
    };

    VideoMetadataWithItemType obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["width"] == output["width"]);




}


