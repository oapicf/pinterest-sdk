
#include "OauthAccessTokenResponseIntegrationRefresh.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_OauthAccessTokenResponseIntegrationRefresh_refresh_token_is_assigned_from_json()
{


    bourne::json input =
    {
        "refresh_token", "hello"
    };

    OauthAccessTokenResponseIntegrationRefresh obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRefreshToken().c_str());






}


void test_OauthAccessTokenResponseIntegrationRefresh_refresh_token_expires_in_is_assigned_from_json()
{
    bourne::json input =
    {
        "refresh_token_expires_in", 1
    };

    OauthAccessTokenResponseIntegrationRefresh obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getRefreshTokenExpiresIn());








}


void test_OauthAccessTokenResponseIntegrationRefresh_access_token_is_assigned_from_json()
{


    bourne::json input =
    {
        "access_token", "hello"
    };

    OauthAccessTokenResponseIntegrationRefresh obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAccessToken().c_str());






}


void test_OauthAccessTokenResponseIntegrationRefresh_expires_in_is_assigned_from_json()
{
    bourne::json input =
    {
        "expires_in", 1
    };

    OauthAccessTokenResponseIntegrationRefresh obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getExpiresIn());








}


void test_OauthAccessTokenResponseIntegrationRefresh_response_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "response_type", "hello"
    };

    OauthAccessTokenResponseIntegrationRefresh obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getResponseType().c_str());






}


void test_OauthAccessTokenResponseIntegrationRefresh_scope_is_assigned_from_json()
{


    bourne::json input =
    {
        "scope", "hello"
    };

    OauthAccessTokenResponseIntegrationRefresh obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getScope().c_str());






}


void test_OauthAccessTokenResponseIntegrationRefresh_token_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "token_type", "hello"
    };

    OauthAccessTokenResponseIntegrationRefresh obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getTokenType().c_str());






}



void test_OauthAccessTokenResponseIntegrationRefresh_refresh_token_is_converted_to_json()
{

    bourne::json input =
    {
        "refresh_token", "hello"
    };

    OauthAccessTokenResponseIntegrationRefresh obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["refresh_token"] == output["refresh_token"]);



}


void test_OauthAccessTokenResponseIntegrationRefresh_refresh_token_expires_in_is_converted_to_json()
{
    bourne::json input =
    {
        "refresh_token_expires_in", 1
    };

    OauthAccessTokenResponseIntegrationRefresh obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["refresh_token_expires_in"] == output["refresh_token_expires_in"]);




}


void test_OauthAccessTokenResponseIntegrationRefresh_access_token_is_converted_to_json()
{

    bourne::json input =
    {
        "access_token", "hello"
    };

    OauthAccessTokenResponseIntegrationRefresh obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["access_token"] == output["access_token"]);



}


void test_OauthAccessTokenResponseIntegrationRefresh_expires_in_is_converted_to_json()
{
    bourne::json input =
    {
        "expires_in", 1
    };

    OauthAccessTokenResponseIntegrationRefresh obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["expires_in"] == output["expires_in"]);




}


void test_OauthAccessTokenResponseIntegrationRefresh_response_type_is_converted_to_json()
{

    bourne::json input =
    {
        "response_type", "hello"
    };

    OauthAccessTokenResponseIntegrationRefresh obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["response_type"] == output["response_type"]);



}


void test_OauthAccessTokenResponseIntegrationRefresh_scope_is_converted_to_json()
{

    bourne::json input =
    {
        "scope", "hello"
    };

    OauthAccessTokenResponseIntegrationRefresh obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["scope"] == output["scope"]);



}


void test_OauthAccessTokenResponseIntegrationRefresh_token_type_is_converted_to_json()
{

    bourne::json input =
    {
        "token_type", "hello"
    };

    OauthAccessTokenResponseIntegrationRefresh obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["token_type"] == output["token_type"]);



}


