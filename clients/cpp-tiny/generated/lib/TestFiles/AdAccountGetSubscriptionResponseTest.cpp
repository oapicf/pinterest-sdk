
#include "AdAccountGetSubscriptionResponse.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_AdAccountGetSubscriptionResponse_lead_form_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "lead_form_id", "hello"
    };

    AdAccountGetSubscriptionResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLeadFormId().c_str());






}


void test_AdAccountGetSubscriptionResponse_webhook_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "webhook_url", "hello"
    };

    AdAccountGetSubscriptionResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getWebhookUrl().c_str());






}


void test_AdAccountGetSubscriptionResponse_ad_account_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "ad_account_id", "hello"
    };

    AdAccountGetSubscriptionResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAdAccountId().c_str());






}


void test_AdAccountGetSubscriptionResponse_api_version_is_assigned_from_json()
{


    bourne::json input =
    {
        "api_version", "hello"
    };

    AdAccountGetSubscriptionResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getApiVersion().c_str());






}


void test_AdAccountGetSubscriptionResponse_created_time_is_assigned_from_json()
{
    bourne::json input =
    {
        "created_time", 1
    };

    AdAccountGetSubscriptionResponse obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCreatedTime());








}


void test_AdAccountGetSubscriptionResponse_cryptographic_algorithm_is_assigned_from_json()
{


    bourne::json input =
    {
        "cryptographic_algorithm", "hello"
    };

    AdAccountGetSubscriptionResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCryptographicAlgorithm().c_str());






}


void test_AdAccountGetSubscriptionResponse_cryptographic_key_is_assigned_from_json()
{


    bourne::json input =
    {
        "cryptographic_key", "hello"
    };

    AdAccountGetSubscriptionResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCryptographicKey().c_str());






}


void test_AdAccountGetSubscriptionResponse_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    AdAccountGetSubscriptionResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_AdAccountGetSubscriptionResponse_user_account_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "user_account_id", "hello"
    };

    AdAccountGetSubscriptionResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUserAccountId().c_str());






}



void test_AdAccountGetSubscriptionResponse_lead_form_id_is_converted_to_json()
{

    bourne::json input =
    {
        "lead_form_id", "hello"
    };

    AdAccountGetSubscriptionResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["lead_form_id"] == output["lead_form_id"]);



}


void test_AdAccountGetSubscriptionResponse_webhook_url_is_converted_to_json()
{

    bourne::json input =
    {
        "webhook_url", "hello"
    };

    AdAccountGetSubscriptionResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["webhook_url"] == output["webhook_url"]);



}


void test_AdAccountGetSubscriptionResponse_ad_account_id_is_converted_to_json()
{

    bourne::json input =
    {
        "ad_account_id", "hello"
    };

    AdAccountGetSubscriptionResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["ad_account_id"] == output["ad_account_id"]);



}


void test_AdAccountGetSubscriptionResponse_api_version_is_converted_to_json()
{

    bourne::json input =
    {
        "api_version", "hello"
    };

    AdAccountGetSubscriptionResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["api_version"] == output["api_version"]);



}


void test_AdAccountGetSubscriptionResponse_created_time_is_converted_to_json()
{
    bourne::json input =
    {
        "created_time", 1
    };

    AdAccountGetSubscriptionResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["created_time"] == output["created_time"]);




}


void test_AdAccountGetSubscriptionResponse_cryptographic_algorithm_is_converted_to_json()
{

    bourne::json input =
    {
        "cryptographic_algorithm", "hello"
    };

    AdAccountGetSubscriptionResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["cryptographic_algorithm"] == output["cryptographic_algorithm"]);



}


void test_AdAccountGetSubscriptionResponse_cryptographic_key_is_converted_to_json()
{

    bourne::json input =
    {
        "cryptographic_key", "hello"
    };

    AdAccountGetSubscriptionResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["cryptographic_key"] == output["cryptographic_key"]);



}


void test_AdAccountGetSubscriptionResponse_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    AdAccountGetSubscriptionResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_AdAccountGetSubscriptionResponse_user_account_id_is_converted_to_json()
{

    bourne::json input =
    {
        "user_account_id", "hello"
    };

    AdAccountGetSubscriptionResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["user_account_id"] == output["user_account_id"]);



}


