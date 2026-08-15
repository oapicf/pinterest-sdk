
#include "QuizPinResult.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_QuizPinResult_android_deep_link_is_assigned_from_json()
{


    bourne::json input =
    {
        "android_deep_link", "hello"
    };

    QuizPinResult obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAndroidDeepLink().c_str());






}


void test_QuizPinResult_destination_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "destination_url", "hello"
    };

    QuizPinResult obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDestinationUrl().c_str());






}


void test_QuizPinResult_ios_deep_link_is_assigned_from_json()
{


    bourne::json input =
    {
        "ios_deep_link", "hello"
    };

    QuizPinResult obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getIosDeepLink().c_str());






}


void test_QuizPinResult_organic_pin_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "organic_pin_id", "hello"
    };

    QuizPinResult obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOrganicPinId().c_str());






}


void test_QuizPinResult_result_id_is_assigned_from_json()
{








}



void test_QuizPinResult_android_deep_link_is_converted_to_json()
{

    bourne::json input =
    {
        "android_deep_link", "hello"
    };

    QuizPinResult obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["android_deep_link"] == output["android_deep_link"]);



}


void test_QuizPinResult_destination_url_is_converted_to_json()
{

    bourne::json input =
    {
        "destination_url", "hello"
    };

    QuizPinResult obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["destination_url"] == output["destination_url"]);



}


void test_QuizPinResult_ios_deep_link_is_converted_to_json()
{

    bourne::json input =
    {
        "ios_deep_link", "hello"
    };

    QuizPinResult obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["ios_deep_link"] == output["ios_deep_link"]);



}


void test_QuizPinResult_organic_pin_id_is_converted_to_json()
{

    bourne::json input =
    {
        "organic_pin_id", "hello"
    };

    QuizPinResult obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["organic_pin_id"] == output["organic_pin_id"]);



}


void test_QuizPinResult_result_id_is_converted_to_json()
{




}


