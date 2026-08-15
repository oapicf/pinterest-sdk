
#include "AmazonConnectRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_AmazonConnectRequest_amazon_storefront_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "amazon_storefront_id", "hello"
    };

    AmazonConnectRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAmazonStorefrontId().c_str());






}


void test_AmazonConnectRequest_amazon_storefront_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "amazon_storefront_name", "hello"
    };

    AmazonConnectRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAmazonStorefrontName().c_str());






}


void test_AmazonConnectRequest_amazon_storefront_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "amazon_storefront_url", "hello"
    };

    AmazonConnectRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAmazonStorefrontUrl().c_str());






}


void test_AmazonConnectRequest_amazon_user_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "amazon_user_id", "hello"
    };

    AmazonConnectRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAmazonUserId().c_str());






}


void test_AmazonConnectRequest_is_amazon_account_linked_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_amazon_account_linked", true
    };

    AmazonConnectRequest obj(input.dump());

    TEST_ASSERT(true == obj.isIsAmazonAccountLinked());




}


void test_AmazonConnectRequest_one_time_passcode_is_assigned_from_json()
{


    bourne::json input =
    {
        "one_time_passcode", "hello"
    };

    AmazonConnectRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOneTimePasscode().c_str());






}


void test_AmazonConnectRequest_pinterest_user_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "pinterest_user_id", "hello"
    };

    AmazonConnectRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPinterestUserId().c_str());






}



void test_AmazonConnectRequest_amazon_storefront_id_is_converted_to_json()
{

    bourne::json input =
    {
        "amazon_storefront_id", "hello"
    };

    AmazonConnectRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["amazon_storefront_id"] == output["amazon_storefront_id"]);



}


void test_AmazonConnectRequest_amazon_storefront_name_is_converted_to_json()
{

    bourne::json input =
    {
        "amazon_storefront_name", "hello"
    };

    AmazonConnectRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["amazon_storefront_name"] == output["amazon_storefront_name"]);



}


void test_AmazonConnectRequest_amazon_storefront_url_is_converted_to_json()
{

    bourne::json input =
    {
        "amazon_storefront_url", "hello"
    };

    AmazonConnectRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["amazon_storefront_url"] == output["amazon_storefront_url"]);



}


void test_AmazonConnectRequest_amazon_user_id_is_converted_to_json()
{

    bourne::json input =
    {
        "amazon_user_id", "hello"
    };

    AmazonConnectRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["amazon_user_id"] == output["amazon_user_id"]);



}


void test_AmazonConnectRequest_is_amazon_account_linked_is_converted_to_json()
{


    bourne::json input =
    {
        "is_amazon_account_linked", true
    };

    AmazonConnectRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_amazon_account_linked"] == output["is_amazon_account_linked"]);


}


void test_AmazonConnectRequest_one_time_passcode_is_converted_to_json()
{

    bourne::json input =
    {
        "one_time_passcode", "hello"
    };

    AmazonConnectRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["one_time_passcode"] == output["one_time_passcode"]);



}


void test_AmazonConnectRequest_pinterest_user_id_is_converted_to_json()
{

    bourne::json input =
    {
        "pinterest_user_id", "hello"
    };

    AmazonConnectRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["pinterest_user_id"] == output["pinterest_user_id"]);



}


