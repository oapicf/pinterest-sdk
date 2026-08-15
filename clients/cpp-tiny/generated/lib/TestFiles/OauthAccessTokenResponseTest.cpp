
#include "OauthAccessTokenResponse.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_OauthAccessTokenResponse_access_token_is_assigned_from_json()
{


    bourne::json input =
    {
        "access_token", "hello"
    };

    OauthAccessTokenResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAccessToken().c_str());






}


void test_OauthAccessTokenResponse_expires_in_is_assigned_from_json()
{
    bourne::json input =
    {
        "expires_in", 1
    };

    OauthAccessTokenResponse obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getExpiresIn());








}


void test_OauthAccessTokenResponse_response_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "response_type", "hello"
    };

    OauthAccessTokenResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getResponseType().c_str());






}


void test_OauthAccessTokenResponse_scope_is_assigned_from_json()
{


    bourne::json input =
    {
        "scope", "hello"
    };

    OauthAccessTokenResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getScope().c_str());






}


void test_OauthAccessTokenResponse_token_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "token_type", "hello"
    };

    OauthAccessTokenResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getTokenType().c_str());






}



void test_OauthAccessTokenResponse_access_token_is_converted_to_json()
{

    bourne::json input =
    {
        "access_token", "hello"
    };

    OauthAccessTokenResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["access_token"] == output["access_token"]);



}


void test_OauthAccessTokenResponse_expires_in_is_converted_to_json()
{
    bourne::json input =
    {
        "expires_in", 1
    };

    OauthAccessTokenResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["expires_in"] == output["expires_in"]);




}


void test_OauthAccessTokenResponse_response_type_is_converted_to_json()
{

    bourne::json input =
    {
        "response_type", "hello"
    };

    OauthAccessTokenResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["response_type"] == output["response_type"]);



}


void test_OauthAccessTokenResponse_scope_is_converted_to_json()
{

    bourne::json input =
    {
        "scope", "hello"
    };

    OauthAccessTokenResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["scope"] == output["scope"]);



}


void test_OauthAccessTokenResponse_token_type_is_converted_to_json()
{

    bourne::json input =
    {
        "token_type", "hello"
    };

    OauthAccessTokenResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["token_type"] == output["token_type"]);



}


