
#include "AdResponse.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_AdResponse_ad_group_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "ad_group_id", "hello"
    };

    AdResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAdGroupId().c_str());






}


void test_AdResponse_android_deep_link_is_assigned_from_json()
{


    bourne::json input =
    {
        "android_deep_link", "hello"
    };

    AdResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAndroidDeepLink().c_str());






}





void test_AdResponse_click_tracking_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "click_tracking_url", "hello"
    };

    AdResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getClickTrackingUrl().c_str());






}




void test_AdResponse_destination_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "destination_url", "hello"
    };

    AdResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDestinationUrl().c_str());






}



void test_AdResponse_disclosure_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "disclosure_url", "hello"
    };

    AdResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDisclosureUrl().c_str());






}



void test_AdResponse_ios_deep_link_is_assigned_from_json()
{


    bourne::json input =
    {
        "ios_deep_link", "hello"
    };

    AdResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getIosDeepLink().c_str());






}


void test_AdResponse_is_pin_deleted_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_pin_deleted", true
    };

    AdResponse obj(input.dump());

    TEST_ASSERT(true == obj.isIsPinDeleted());




}


void test_AdResponse_is_removable_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_removable", true
    };

    AdResponse obj(input.dump());

    TEST_ASSERT(true == obj.isIsRemovable());




}


void test_AdResponse_lead_form_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "lead_form_id", "hello"
    };

    AdResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLeadFormId().c_str());






}


void test_AdResponse_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    AdResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}





void test_AdResponse_view_tracking_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "view_tracking_url", "hello"
    };

    AdResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getViewTrackingUrl().c_str());






}


void test_AdResponse_pin_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "pin_id", "hello"
    };

    AdResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPinId().c_str());






}


void test_AdResponse_ad_account_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "ad_account_id", "hello"
    };

    AdResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAdAccountId().c_str());






}


void test_AdResponse_campaign_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "campaign_id", "hello"
    };

    AdResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCampaignId().c_str());






}


void test_AdResponse_collection_items_destination_url_template_is_assigned_from_json()
{


    bourne::json input =
    {
        "collection_items_destination_url_template", "hello"
    };

    AdResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCollectionItemsDestinationUrlTemplate().c_str());






}


void test_AdResponse_created_time_is_assigned_from_json()
{
    bourne::json input =
    {
        "created_time", 1
    };

    AdResponse obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCreatedTime());








}


void test_AdResponse_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    AdResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}




void test_AdResponse_review_status_is_assigned_from_json()
{


    bourne::json input =
    {
        "review_status", "hello"
    };

    AdResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getReviewStatus().c_str());






}



void test_AdResponse_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    AdResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}


void test_AdResponse_updated_time_is_assigned_from_json()
{
    bourne::json input =
    {
        "updated_time", 1
    };

    AdResponse obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getUpdatedTime());








}



void test_AdResponse_ad_group_id_is_converted_to_json()
{

    bourne::json input =
    {
        "ad_group_id", "hello"
    };

    AdResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["ad_group_id"] == output["ad_group_id"]);



}


void test_AdResponse_android_deep_link_is_converted_to_json()
{

    bourne::json input =
    {
        "android_deep_link", "hello"
    };

    AdResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["android_deep_link"] == output["android_deep_link"]);



}





void test_AdResponse_click_tracking_url_is_converted_to_json()
{

    bourne::json input =
    {
        "click_tracking_url", "hello"
    };

    AdResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["click_tracking_url"] == output["click_tracking_url"]);



}




void test_AdResponse_destination_url_is_converted_to_json()
{

    bourne::json input =
    {
        "destination_url", "hello"
    };

    AdResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["destination_url"] == output["destination_url"]);



}



void test_AdResponse_disclosure_url_is_converted_to_json()
{

    bourne::json input =
    {
        "disclosure_url", "hello"
    };

    AdResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["disclosure_url"] == output["disclosure_url"]);



}



void test_AdResponse_ios_deep_link_is_converted_to_json()
{

    bourne::json input =
    {
        "ios_deep_link", "hello"
    };

    AdResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["ios_deep_link"] == output["ios_deep_link"]);



}


void test_AdResponse_is_pin_deleted_is_converted_to_json()
{


    bourne::json input =
    {
        "is_pin_deleted", true
    };

    AdResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_pin_deleted"] == output["is_pin_deleted"]);


}


void test_AdResponse_is_removable_is_converted_to_json()
{


    bourne::json input =
    {
        "is_removable", true
    };

    AdResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_removable"] == output["is_removable"]);


}


void test_AdResponse_lead_form_id_is_converted_to_json()
{

    bourne::json input =
    {
        "lead_form_id", "hello"
    };

    AdResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["lead_form_id"] == output["lead_form_id"]);



}


void test_AdResponse_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    AdResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}





void test_AdResponse_view_tracking_url_is_converted_to_json()
{

    bourne::json input =
    {
        "view_tracking_url", "hello"
    };

    AdResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["view_tracking_url"] == output["view_tracking_url"]);



}


void test_AdResponse_pin_id_is_converted_to_json()
{

    bourne::json input =
    {
        "pin_id", "hello"
    };

    AdResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["pin_id"] == output["pin_id"]);



}


void test_AdResponse_ad_account_id_is_converted_to_json()
{

    bourne::json input =
    {
        "ad_account_id", "hello"
    };

    AdResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["ad_account_id"] == output["ad_account_id"]);



}


void test_AdResponse_campaign_id_is_converted_to_json()
{

    bourne::json input =
    {
        "campaign_id", "hello"
    };

    AdResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["campaign_id"] == output["campaign_id"]);



}


void test_AdResponse_collection_items_destination_url_template_is_converted_to_json()
{

    bourne::json input =
    {
        "collection_items_destination_url_template", "hello"
    };

    AdResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["collection_items_destination_url_template"] == output["collection_items_destination_url_template"]);



}


void test_AdResponse_created_time_is_converted_to_json()
{
    bourne::json input =
    {
        "created_time", 1
    };

    AdResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["created_time"] == output["created_time"]);




}


void test_AdResponse_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    AdResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}




void test_AdResponse_review_status_is_converted_to_json()
{

    bourne::json input =
    {
        "review_status", "hello"
    };

    AdResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["review_status"] == output["review_status"]);



}



void test_AdResponse_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    AdResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}


void test_AdResponse_updated_time_is_converted_to_json()
{
    bourne::json input =
    {
        "updated_time", 1
    };

    AdResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["updated_time"] == output["updated_time"]);




}


