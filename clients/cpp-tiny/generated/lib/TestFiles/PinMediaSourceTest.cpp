
#include "PinMediaSource.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_PinMediaSource_data_is_assigned_from_json()
{


    bourne::json input =
    {
        "data", "hello"
    };

    PinMediaSource obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getData().c_str());






}


void test_PinMediaSource_is_standard_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_standard", true
    };

    PinMediaSource obj(input.dump());

    TEST_ASSERT(true == obj.isIsStandard());




}


void test_PinMediaSource_source_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "source_type", "hello"
    };

    PinMediaSource obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSourceType().c_str());






}


void test_PinMediaSource_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "url", "hello"
    };

    PinMediaSource obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUrl().c_str());






}



void test_PinMediaSource_cover_image_data_is_assigned_from_json()
{


    bourne::json input =
    {
        "cover_image_data", "hello"
    };

    PinMediaSource obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCoverImageData().c_str());






}


void test_PinMediaSource_cover_image_key_frame_time_is_assigned_from_json()
{
    bourne::json input =
    {
        "cover_image_key_frame_time", 1
    };

    PinMediaSource obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCoverImageKeyFrameTime());








}


void test_PinMediaSource_cover_image_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "cover_image_url", "hello"
    };

    PinMediaSource obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCoverImageUrl().c_str());






}


void test_PinMediaSource_media_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "media_id", "hello"
    };

    PinMediaSource obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMediaId().c_str());






}


void test_PinMediaSource_index_is_assigned_from_json()
{
    bourne::json input =
    {
        "index", 1
    };

    PinMediaSource obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getIndex());








}



void test_PinMediaSource_is_affiliate_link_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_affiliate_link", true
    };

    PinMediaSource obj(input.dump());

    TEST_ASSERT(true == obj.isIsAffiliateLink());




}




void test_PinMediaSource_data_is_converted_to_json()
{

    bourne::json input =
    {
        "data", "hello"
    };

    PinMediaSource obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["data"] == output["data"]);



}


void test_PinMediaSource_is_standard_is_converted_to_json()
{


    bourne::json input =
    {
        "is_standard", true
    };

    PinMediaSource obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_standard"] == output["is_standard"]);


}


void test_PinMediaSource_source_type_is_converted_to_json()
{

    bourne::json input =
    {
        "source_type", "hello"
    };

    PinMediaSource obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["source_type"] == output["source_type"]);



}


void test_PinMediaSource_url_is_converted_to_json()
{

    bourne::json input =
    {
        "url", "hello"
    };

    PinMediaSource obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["url"] == output["url"]);



}



void test_PinMediaSource_cover_image_data_is_converted_to_json()
{

    bourne::json input =
    {
        "cover_image_data", "hello"
    };

    PinMediaSource obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["cover_image_data"] == output["cover_image_data"]);



}


void test_PinMediaSource_cover_image_key_frame_time_is_converted_to_json()
{
    bourne::json input =
    {
        "cover_image_key_frame_time", 1
    };

    PinMediaSource obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["cover_image_key_frame_time"] == output["cover_image_key_frame_time"]);




}


void test_PinMediaSource_cover_image_url_is_converted_to_json()
{

    bourne::json input =
    {
        "cover_image_url", "hello"
    };

    PinMediaSource obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["cover_image_url"] == output["cover_image_url"]);



}


void test_PinMediaSource_media_id_is_converted_to_json()
{

    bourne::json input =
    {
        "media_id", "hello"
    };

    PinMediaSource obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["media_id"] == output["media_id"]);



}


void test_PinMediaSource_index_is_converted_to_json()
{
    bourne::json input =
    {
        "index", 1
    };

    PinMediaSource obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["index"] == output["index"]);




}



void test_PinMediaSource_is_affiliate_link_is_converted_to_json()
{


    bourne::json input =
    {
        "is_affiliate_link", true
    };

    PinMediaSource obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_affiliate_link"] == output["is_affiliate_link"]);


}


