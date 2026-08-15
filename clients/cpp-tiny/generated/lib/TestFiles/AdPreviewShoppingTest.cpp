
#include "AdPreviewShopping.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_AdPreviewShopping_catalog_product_group_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "catalog_product_group_id", "hello"
    };

    AdPreviewShopping obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCatalogProductGroupId().c_str());






}


void test_AdPreviewShopping_creative_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "creative_type", "hello"
    };

    AdPreviewShopping obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCreativeType().c_str());






}



void test_AdPreviewShopping_hero_image_title_is_assigned_from_json()
{


    bourne::json input =
    {
        "hero_image_title", "hello"
    };

    AdPreviewShopping obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getHeroImageTitle().c_str());






}


void test_AdPreviewShopping_hero_image_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "hero_image_url", "hello"
    };

    AdPreviewShopping obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getHeroImageUrl().c_str());






}


void test_AdPreviewShopping_hero_pin_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "hero_pin_id", "hello"
    };

    AdPreviewShopping obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getHeroPinId().c_str());






}


void test_AdPreviewShopping_image_tag_is_assigned_from_json()
{


    bourne::json input =
    {
        "image_tag", "hello"
    };

    AdPreviewShopping obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getImageTag().c_str());






}


void test_AdPreviewShopping_item_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "item_id", "hello"
    };

    AdPreviewShopping obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getItemId().c_str());






}


void test_AdPreviewShopping_preferred_media_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "preferred_media_type", "hello"
    };

    AdPreviewShopping obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPreferredMediaType().c_str());






}


void test_AdPreviewShopping_video_tag_is_assigned_from_json()
{


    bourne::json input =
    {
        "video_tag", "hello"
    };

    AdPreviewShopping obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getVideoTag().c_str());






}



void test_AdPreviewShopping_catalog_product_group_id_is_converted_to_json()
{

    bourne::json input =
    {
        "catalog_product_group_id", "hello"
    };

    AdPreviewShopping obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["catalog_product_group_id"] == output["catalog_product_group_id"]);



}


void test_AdPreviewShopping_creative_type_is_converted_to_json()
{

    bourne::json input =
    {
        "creative_type", "hello"
    };

    AdPreviewShopping obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["creative_type"] == output["creative_type"]);



}



void test_AdPreviewShopping_hero_image_title_is_converted_to_json()
{

    bourne::json input =
    {
        "hero_image_title", "hello"
    };

    AdPreviewShopping obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["hero_image_title"] == output["hero_image_title"]);



}


void test_AdPreviewShopping_hero_image_url_is_converted_to_json()
{

    bourne::json input =
    {
        "hero_image_url", "hello"
    };

    AdPreviewShopping obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["hero_image_url"] == output["hero_image_url"]);



}


void test_AdPreviewShopping_hero_pin_id_is_converted_to_json()
{

    bourne::json input =
    {
        "hero_pin_id", "hello"
    };

    AdPreviewShopping obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["hero_pin_id"] == output["hero_pin_id"]);



}


void test_AdPreviewShopping_image_tag_is_converted_to_json()
{

    bourne::json input =
    {
        "image_tag", "hello"
    };

    AdPreviewShopping obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["image_tag"] == output["image_tag"]);



}


void test_AdPreviewShopping_item_id_is_converted_to_json()
{

    bourne::json input =
    {
        "item_id", "hello"
    };

    AdPreviewShopping obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["item_id"] == output["item_id"]);



}


void test_AdPreviewShopping_preferred_media_type_is_converted_to_json()
{

    bourne::json input =
    {
        "preferred_media_type", "hello"
    };

    AdPreviewShopping obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["preferred_media_type"] == output["preferred_media_type"]);



}


void test_AdPreviewShopping_video_tag_is_converted_to_json()
{

    bourne::json input =
    {
        "video_tag", "hello"
    };

    AdPreviewShopping obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["video_tag"] == output["video_tag"]);



}


