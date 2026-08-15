
#include "AdCommon.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_AdCommon_ad_group_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "ad_group_id", "hello"
    };

    AdCommon obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAdGroupId().c_str());






}


void test_AdCommon_android_deep_link_is_assigned_from_json()
{


    bourne::json input =
    {
        "android_deep_link", "hello"
    };

    AdCommon obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAndroidDeepLink().c_str());






}





void test_AdCommon_click_tracking_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "click_tracking_url", "hello"
    };

    AdCommon obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getClickTrackingUrl().c_str());






}




void test_AdCommon_destination_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "destination_url", "hello"
    };

    AdCommon obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDestinationUrl().c_str());






}



void test_AdCommon_disclosure_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "disclosure_url", "hello"
    };

    AdCommon obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDisclosureUrl().c_str());






}



void test_AdCommon_ios_deep_link_is_assigned_from_json()
{


    bourne::json input =
    {
        "ios_deep_link", "hello"
    };

    AdCommon obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getIosDeepLink().c_str());






}


void test_AdCommon_is_pin_deleted_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_pin_deleted", true
    };

    AdCommon obj(input.dump());

    TEST_ASSERT(true == obj.isIsPinDeleted());




}


void test_AdCommon_is_removable_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_removable", true
    };

    AdCommon obj(input.dump());

    TEST_ASSERT(true == obj.isIsRemovable());




}


void test_AdCommon_lead_form_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "lead_form_id", "hello"
    };

    AdCommon obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLeadFormId().c_str());






}


void test_AdCommon_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    AdCommon obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}





void test_AdCommon_view_tracking_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "view_tracking_url", "hello"
    };

    AdCommon obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getViewTrackingUrl().c_str());






}



void test_AdCommon_ad_group_id_is_converted_to_json()
{

    bourne::json input =
    {
        "ad_group_id", "hello"
    };

    AdCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["ad_group_id"] == output["ad_group_id"]);



}


void test_AdCommon_android_deep_link_is_converted_to_json()
{

    bourne::json input =
    {
        "android_deep_link", "hello"
    };

    AdCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["android_deep_link"] == output["android_deep_link"]);



}





void test_AdCommon_click_tracking_url_is_converted_to_json()
{

    bourne::json input =
    {
        "click_tracking_url", "hello"
    };

    AdCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["click_tracking_url"] == output["click_tracking_url"]);



}




void test_AdCommon_destination_url_is_converted_to_json()
{

    bourne::json input =
    {
        "destination_url", "hello"
    };

    AdCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["destination_url"] == output["destination_url"]);



}



void test_AdCommon_disclosure_url_is_converted_to_json()
{

    bourne::json input =
    {
        "disclosure_url", "hello"
    };

    AdCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["disclosure_url"] == output["disclosure_url"]);



}



void test_AdCommon_ios_deep_link_is_converted_to_json()
{

    bourne::json input =
    {
        "ios_deep_link", "hello"
    };

    AdCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["ios_deep_link"] == output["ios_deep_link"]);



}


void test_AdCommon_is_pin_deleted_is_converted_to_json()
{


    bourne::json input =
    {
        "is_pin_deleted", true
    };

    AdCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_pin_deleted"] == output["is_pin_deleted"]);


}


void test_AdCommon_is_removable_is_converted_to_json()
{


    bourne::json input =
    {
        "is_removable", true
    };

    AdCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_removable"] == output["is_removable"]);


}


void test_AdCommon_lead_form_id_is_converted_to_json()
{

    bourne::json input =
    {
        "lead_form_id", "hello"
    };

    AdCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["lead_form_id"] == output["lead_form_id"]);



}


void test_AdCommon_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    AdCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}





void test_AdCommon_view_tracking_url_is_converted_to_json()
{

    bourne::json input =
    {
        "view_tracking_url", "hello"
    };

    AdCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["view_tracking_url"] == output["view_tracking_url"]);



}


