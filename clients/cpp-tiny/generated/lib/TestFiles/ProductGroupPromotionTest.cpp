
#include "ProductGroupPromotion.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ProductGroupPromotion_ad_group_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "ad_group_id", "hello"
    };

    ProductGroupPromotion obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAdGroupId().c_str());






}


void test_ProductGroupPromotion_bid_in_micro_currency_is_assigned_from_json()
{
    bourne::json input =
    {
        "bid_in_micro_currency", 1
    };

    ProductGroupPromotion obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getBidInMicroCurrency());








}


void test_ProductGroupPromotion_catalog_product_group_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "catalog_product_group_id", "hello"
    };

    ProductGroupPromotion obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCatalogProductGroupId().c_str());






}


void test_ProductGroupPromotion_catalog_product_group_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "catalog_product_group_name", "hello"
    };

    ProductGroupPromotion obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCatalogProductGroupName().c_str());






}


void test_ProductGroupPromotion_collections_header_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "collections_header_type", "hello"
    };

    ProductGroupPromotion obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCollectionsHeaderType().c_str());






}


void test_ProductGroupPromotion_collections_hero_destination_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "collections_hero_destination_url", "hello"
    };

    ProductGroupPromotion obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCollectionsHeroDestinationUrl().c_str());






}


void test_ProductGroupPromotion_collections_hero_pin_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "collections_hero_pin_id", "hello"
    };

    ProductGroupPromotion obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCollectionsHeroPinId().c_str());






}



void test_ProductGroupPromotion_customizable_cta_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "customizable_cta_type", "hello"
    };

    ProductGroupPromotion obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCustomizableCtaType().c_str());






}


void test_ProductGroupPromotion_definition_is_assigned_from_json()
{


    bourne::json input =
    {
        "definition", "hello"
    };

    ProductGroupPromotion obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDefinition().c_str());






}



void test_ProductGroupPromotion_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    ProductGroupPromotion obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_ProductGroupPromotion_included_is_assigned_from_json()
{




    bourne::json input =
    {
        "included", true
    };

    ProductGroupPromotion obj(input.dump());

    TEST_ASSERT(true == obj.isIncluded());




}


void test_ProductGroupPromotion_is_generate_background_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_generate_background", true
    };

    ProductGroupPromotion obj(input.dump());

    TEST_ASSERT(true == obj.isIsGenerateBackground());




}


void test_ProductGroupPromotion_is_mdl_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_mdl", true
    };

    ProductGroupPromotion obj(input.dump());

    TEST_ASSERT(true == obj.isIsMdl());




}


void test_ProductGroupPromotion_parent_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "parent_id", "hello"
    };

    ProductGroupPromotion obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getParentId().c_str());






}


void test_ProductGroupPromotion_preferred_media_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "preferred_media_type", "hello"
    };

    ProductGroupPromotion obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPreferredMediaType().c_str());






}


void test_ProductGroupPromotion_relative_definition_is_assigned_from_json()
{


    bourne::json input =
    {
        "relative_definition", "hello"
    };

    ProductGroupPromotion obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRelativeDefinition().c_str());






}


void test_ProductGroupPromotion_selected_image_tag_is_assigned_from_json()
{


    bourne::json input =
    {
        "selected_image_tag", "hello"
    };

    ProductGroupPromotion obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSelectedImageTag().c_str());






}


void test_ProductGroupPromotion_selected_video_tag_is_assigned_from_json()
{


    bourne::json input =
    {
        "selected_video_tag", "hello"
    };

    ProductGroupPromotion obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSelectedVideoTag().c_str());






}


void test_ProductGroupPromotion_slideshow_collections_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "slideshow_collections_description", "hello"
    };

    ProductGroupPromotion obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSlideshowCollectionsDescription().c_str());






}


void test_ProductGroupPromotion_slideshow_collections_title_is_assigned_from_json()
{


    bourne::json input =
    {
        "slideshow_collections_title", "hello"
    };

    ProductGroupPromotion obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSlideshowCollectionsTitle().c_str());






}



void test_ProductGroupPromotion_tracking_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "tracking_url", "hello"
    };

    ProductGroupPromotion obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getTrackingUrl().c_str());






}



void test_ProductGroupPromotion_ad_group_id_is_converted_to_json()
{

    bourne::json input =
    {
        "ad_group_id", "hello"
    };

    ProductGroupPromotion obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["ad_group_id"] == output["ad_group_id"]);



}


void test_ProductGroupPromotion_bid_in_micro_currency_is_converted_to_json()
{
    bourne::json input =
    {
        "bid_in_micro_currency", 1
    };

    ProductGroupPromotion obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["bid_in_micro_currency"] == output["bid_in_micro_currency"]);




}


void test_ProductGroupPromotion_catalog_product_group_id_is_converted_to_json()
{

    bourne::json input =
    {
        "catalog_product_group_id", "hello"
    };

    ProductGroupPromotion obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["catalog_product_group_id"] == output["catalog_product_group_id"]);



}


void test_ProductGroupPromotion_catalog_product_group_name_is_converted_to_json()
{

    bourne::json input =
    {
        "catalog_product_group_name", "hello"
    };

    ProductGroupPromotion obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["catalog_product_group_name"] == output["catalog_product_group_name"]);



}


void test_ProductGroupPromotion_collections_header_type_is_converted_to_json()
{

    bourne::json input =
    {
        "collections_header_type", "hello"
    };

    ProductGroupPromotion obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["collections_header_type"] == output["collections_header_type"]);



}


void test_ProductGroupPromotion_collections_hero_destination_url_is_converted_to_json()
{

    bourne::json input =
    {
        "collections_hero_destination_url", "hello"
    };

    ProductGroupPromotion obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["collections_hero_destination_url"] == output["collections_hero_destination_url"]);



}


void test_ProductGroupPromotion_collections_hero_pin_id_is_converted_to_json()
{

    bourne::json input =
    {
        "collections_hero_pin_id", "hello"
    };

    ProductGroupPromotion obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["collections_hero_pin_id"] == output["collections_hero_pin_id"]);



}



void test_ProductGroupPromotion_customizable_cta_type_is_converted_to_json()
{

    bourne::json input =
    {
        "customizable_cta_type", "hello"
    };

    ProductGroupPromotion obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["customizable_cta_type"] == output["customizable_cta_type"]);



}


void test_ProductGroupPromotion_definition_is_converted_to_json()
{

    bourne::json input =
    {
        "definition", "hello"
    };

    ProductGroupPromotion obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["definition"] == output["definition"]);



}



void test_ProductGroupPromotion_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    ProductGroupPromotion obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_ProductGroupPromotion_included_is_converted_to_json()
{


    bourne::json input =
    {
        "included", true
    };

    ProductGroupPromotion obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["included"] == output["included"]);


}


void test_ProductGroupPromotion_is_generate_background_is_converted_to_json()
{


    bourne::json input =
    {
        "is_generate_background", true
    };

    ProductGroupPromotion obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_generate_background"] == output["is_generate_background"]);


}


void test_ProductGroupPromotion_is_mdl_is_converted_to_json()
{


    bourne::json input =
    {
        "is_mdl", true
    };

    ProductGroupPromotion obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_mdl"] == output["is_mdl"]);


}


void test_ProductGroupPromotion_parent_id_is_converted_to_json()
{

    bourne::json input =
    {
        "parent_id", "hello"
    };

    ProductGroupPromotion obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["parent_id"] == output["parent_id"]);



}


void test_ProductGroupPromotion_preferred_media_type_is_converted_to_json()
{

    bourne::json input =
    {
        "preferred_media_type", "hello"
    };

    ProductGroupPromotion obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["preferred_media_type"] == output["preferred_media_type"]);



}


void test_ProductGroupPromotion_relative_definition_is_converted_to_json()
{

    bourne::json input =
    {
        "relative_definition", "hello"
    };

    ProductGroupPromotion obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["relative_definition"] == output["relative_definition"]);



}


void test_ProductGroupPromotion_selected_image_tag_is_converted_to_json()
{

    bourne::json input =
    {
        "selected_image_tag", "hello"
    };

    ProductGroupPromotion obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["selected_image_tag"] == output["selected_image_tag"]);



}


void test_ProductGroupPromotion_selected_video_tag_is_converted_to_json()
{

    bourne::json input =
    {
        "selected_video_tag", "hello"
    };

    ProductGroupPromotion obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["selected_video_tag"] == output["selected_video_tag"]);



}


void test_ProductGroupPromotion_slideshow_collections_description_is_converted_to_json()
{

    bourne::json input =
    {
        "slideshow_collections_description", "hello"
    };

    ProductGroupPromotion obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["slideshow_collections_description"] == output["slideshow_collections_description"]);



}


void test_ProductGroupPromotion_slideshow_collections_title_is_converted_to_json()
{

    bourne::json input =
    {
        "slideshow_collections_title", "hello"
    };

    ProductGroupPromotion obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["slideshow_collections_title"] == output["slideshow_collections_title"]);



}



void test_ProductGroupPromotion_tracking_url_is_converted_to_json()
{

    bourne::json input =
    {
        "tracking_url", "hello"
    };

    ProductGroupPromotion obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["tracking_url"] == output["tracking_url"]);



}


