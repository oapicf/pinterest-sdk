
#include "IntegrationLog.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_IntegrationLog_advertiser_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "advertiser_id", "hello"
    };

    IntegrationLog obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAdvertiserId().c_str());






}


void test_IntegrationLog_app_version_number_is_assigned_from_json()
{


    bourne::json input =
    {
        "app_version_number", "hello"
    };

    IntegrationLog obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAppVersionNumber().c_str());






}


void test_IntegrationLog_client_timestamp_is_assigned_from_json()
{
    bourne::json input =
    {
        "client_timestamp", 1
    };

    IntegrationLog obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getClientTimestamp());








}



void test_IntegrationLog_event_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "event_type", "hello"
    };

    IntegrationLog obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEventType().c_str());






}


void test_IntegrationLog_external_business_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "external_business_id", "hello"
    };

    IntegrationLog obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getExternalBusinessId().c_str());






}


void test_IntegrationLog_feed_profile_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "feed_profile_id", "hello"
    };

    IntegrationLog obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFeedProfileId().c_str());






}


void test_IntegrationLog_log_level_is_assigned_from_json()
{


    bourne::json input =
    {
        "log_level", "hello"
    };

    IntegrationLog obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLogLevel().c_str());






}


void test_IntegrationLog_merchant_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "merchant_id", "hello"
    };

    IntegrationLog obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMerchantId().c_str());






}


void test_IntegrationLog_message_is_assigned_from_json()
{


    bourne::json input =
    {
        "message", "hello"
    };

    IntegrationLog obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMessage().c_str());






}


void test_IntegrationLog_platform_version_number_is_assigned_from_json()
{


    bourne::json input =
    {
        "platform_version_number", "hello"
    };

    IntegrationLog obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPlatformVersionNumber().c_str());






}



void test_IntegrationLog_tag_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "tag_id", "hello"
    };

    IntegrationLog obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getTagId().c_str());






}



void test_IntegrationLog_advertiser_id_is_converted_to_json()
{

    bourne::json input =
    {
        "advertiser_id", "hello"
    };

    IntegrationLog obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["advertiser_id"] == output["advertiser_id"]);



}


void test_IntegrationLog_app_version_number_is_converted_to_json()
{

    bourne::json input =
    {
        "app_version_number", "hello"
    };

    IntegrationLog obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["app_version_number"] == output["app_version_number"]);



}


void test_IntegrationLog_client_timestamp_is_converted_to_json()
{
    bourne::json input =
    {
        "client_timestamp", 1
    };

    IntegrationLog obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["client_timestamp"] == output["client_timestamp"]);




}



void test_IntegrationLog_event_type_is_converted_to_json()
{

    bourne::json input =
    {
        "event_type", "hello"
    };

    IntegrationLog obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["event_type"] == output["event_type"]);



}


void test_IntegrationLog_external_business_id_is_converted_to_json()
{

    bourne::json input =
    {
        "external_business_id", "hello"
    };

    IntegrationLog obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["external_business_id"] == output["external_business_id"]);



}


void test_IntegrationLog_feed_profile_id_is_converted_to_json()
{

    bourne::json input =
    {
        "feed_profile_id", "hello"
    };

    IntegrationLog obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["feed_profile_id"] == output["feed_profile_id"]);



}


void test_IntegrationLog_log_level_is_converted_to_json()
{

    bourne::json input =
    {
        "log_level", "hello"
    };

    IntegrationLog obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["log_level"] == output["log_level"]);



}


void test_IntegrationLog_merchant_id_is_converted_to_json()
{

    bourne::json input =
    {
        "merchant_id", "hello"
    };

    IntegrationLog obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["merchant_id"] == output["merchant_id"]);



}


void test_IntegrationLog_message_is_converted_to_json()
{

    bourne::json input =
    {
        "message", "hello"
    };

    IntegrationLog obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["message"] == output["message"]);



}


void test_IntegrationLog_platform_version_number_is_converted_to_json()
{

    bourne::json input =
    {
        "platform_version_number", "hello"
    };

    IntegrationLog obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["platform_version_number"] == output["platform_version_number"]);



}



void test_IntegrationLog_tag_id_is_converted_to_json()
{

    bourne::json input =
    {
        "tag_id", "hello"
    };

    IntegrationLog obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["tag_id"] == output["tag_id"]);



}


