
#include "AdAccountCreateSubscriptionResponse.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_AdAccountCreateSubscriptionResponse_ad_account_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "ad_account_id", "hello"
    };

    AdAccountCreateSubscriptionResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAdAccountId().c_str());






}


void test_AdAccountCreateSubscriptionResponse_api_version_is_assigned_from_json()
{


    bourne::json input =
    {
        "api_version", "hello"
    };

    AdAccountCreateSubscriptionResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getApiVersion().c_str());






}


void test_AdAccountCreateSubscriptionResponse_created_time_is_assigned_from_json()
{
    bourne::json input =
    {
        "created_time", 1
    };

    AdAccountCreateSubscriptionResponse obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCreatedTime());








}


void test_AdAccountCreateSubscriptionResponse_cryptographic_algorithm_is_assigned_from_json()
{


    bourne::json input =
    {
        "cryptographic_algorithm", "hello"
    };

    AdAccountCreateSubscriptionResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCryptographicAlgorithm().c_str());






}


void test_AdAccountCreateSubscriptionResponse_cryptographic_key_is_assigned_from_json()
{


    bourne::json input =
    {
        "cryptographic_key", "hello"
    };

    AdAccountCreateSubscriptionResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCryptographicKey().c_str());






}


void test_AdAccountCreateSubscriptionResponse_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    AdAccountCreateSubscriptionResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_AdAccountCreateSubscriptionResponse_lead_form_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "lead_form_id", "hello"
    };

    AdAccountCreateSubscriptionResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLeadFormId().c_str());






}


void test_AdAccountCreateSubscriptionResponse_user_account_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "user_account_id", "hello"
    };

    AdAccountCreateSubscriptionResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUserAccountId().c_str());






}


void test_AdAccountCreateSubscriptionResponse_webhook_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "webhook_url", "hello"
    };

    AdAccountCreateSubscriptionResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getWebhookUrl().c_str());






}



void test_AdAccountCreateSubscriptionResponse_ad_account_id_is_converted_to_json()
{

    bourne::json input =
    {
        "ad_account_id", "hello"
    };

    AdAccountCreateSubscriptionResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["ad_account_id"] == output["ad_account_id"]);



}


void test_AdAccountCreateSubscriptionResponse_api_version_is_converted_to_json()
{

    bourne::json input =
    {
        "api_version", "hello"
    };

    AdAccountCreateSubscriptionResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["api_version"] == output["api_version"]);



}


void test_AdAccountCreateSubscriptionResponse_created_time_is_converted_to_json()
{
    bourne::json input =
    {
        "created_time", 1
    };

    AdAccountCreateSubscriptionResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["created_time"] == output["created_time"]);




}


void test_AdAccountCreateSubscriptionResponse_cryptographic_algorithm_is_converted_to_json()
{

    bourne::json input =
    {
        "cryptographic_algorithm", "hello"
    };

    AdAccountCreateSubscriptionResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["cryptographic_algorithm"] == output["cryptographic_algorithm"]);



}


void test_AdAccountCreateSubscriptionResponse_cryptographic_key_is_converted_to_json()
{

    bourne::json input =
    {
        "cryptographic_key", "hello"
    };

    AdAccountCreateSubscriptionResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["cryptographic_key"] == output["cryptographic_key"]);



}


void test_AdAccountCreateSubscriptionResponse_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    AdAccountCreateSubscriptionResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_AdAccountCreateSubscriptionResponse_lead_form_id_is_converted_to_json()
{

    bourne::json input =
    {
        "lead_form_id", "hello"
    };

    AdAccountCreateSubscriptionResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["lead_form_id"] == output["lead_form_id"]);



}


void test_AdAccountCreateSubscriptionResponse_user_account_id_is_converted_to_json()
{

    bourne::json input =
    {
        "user_account_id", "hello"
    };

    AdAccountCreateSubscriptionResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["user_account_id"] == output["user_account_id"]);



}


void test_AdAccountCreateSubscriptionResponse_webhook_url_is_converted_to_json()
{

    bourne::json input =
    {
        "webhook_url", "hello"
    };

    AdAccountCreateSubscriptionResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["webhook_url"] == output["webhook_url"]);



}


