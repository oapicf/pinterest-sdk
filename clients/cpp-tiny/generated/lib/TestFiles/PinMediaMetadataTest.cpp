
#include "PinMediaMetadata.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PinMediaMetadata_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "description", "hello"
    };

    PinMediaMetadata obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}



void test_PinMediaMetadata_item_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "item_type", "hello"
    };

    PinMediaMetadata obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getItemType().c_str());






}


void test_PinMediaMetadata_link_is_assigned_from_json()
{


    bourne::json input =
    {
        "link", "hello"
    };

    PinMediaMetadata obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLink().c_str());






}


void test_PinMediaMetadata_title_is_assigned_from_json()
{


    bourne::json input =
    {
        "title", "hello"
    };

    PinMediaMetadata obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getTitle().c_str());






}


void test_PinMediaMetadata_cover_image_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "cover_image_url", "hello"
    };

    PinMediaMetadata obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCoverImageUrl().c_str());






}


void test_PinMediaMetadata_duration_is_assigned_from_json()
{








}


void test_PinMediaMetadata_height_is_assigned_from_json()
{
    bourne::json input =
    {
        "height", 1
    };

    PinMediaMetadata obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getHeight());








}


void test_PinMediaMetadata_video_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "video_url", "hello"
    };

    PinMediaMetadata obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getVideoUrl().c_str());






}


void test_PinMediaMetadata_width_is_assigned_from_json()
{
    bourne::json input =
    {
        "width", 1
    };

    PinMediaMetadata obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getWidth());








}



void test_PinMediaMetadata_description_is_converted_to_json()
{

    bourne::json input =
    {
        "description", "hello"
    };

    PinMediaMetadata obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}



void test_PinMediaMetadata_item_type_is_converted_to_json()
{

    bourne::json input =
    {
        "item_type", "hello"
    };

    PinMediaMetadata obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["item_type"] == output["item_type"]);



}


void test_PinMediaMetadata_link_is_converted_to_json()
{

    bourne::json input =
    {
        "link", "hello"
    };

    PinMediaMetadata obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["link"] == output["link"]);



}


void test_PinMediaMetadata_title_is_converted_to_json()
{

    bourne::json input =
    {
        "title", "hello"
    };

    PinMediaMetadata obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["title"] == output["title"]);



}


void test_PinMediaMetadata_cover_image_url_is_converted_to_json()
{

    bourne::json input =
    {
        "cover_image_url", "hello"
    };

    PinMediaMetadata obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["cover_image_url"] == output["cover_image_url"]);



}


void test_PinMediaMetadata_duration_is_converted_to_json()
{




}


void test_PinMediaMetadata_height_is_converted_to_json()
{
    bourne::json input =
    {
        "height", 1
    };

    PinMediaMetadata obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["height"] == output["height"]);




}


void test_PinMediaMetadata_video_url_is_converted_to_json()
{

    bourne::json input =
    {
        "video_url", "hello"
    };

    PinMediaMetadata obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["video_url"] == output["video_url"]);



}


void test_PinMediaMetadata_width_is_converted_to_json()
{
    bourne::json input =
    {
        "width", 1
    };

    PinMediaMetadata obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["width"] == output["width"]);




}


