
#include "OauthAccessTokenRequestRefresh.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_OauthAccessTokenRequestRefresh_refresh_token_is_assigned_from_json()
{


    bourne::json input =
    {
        "refresh_token", "hello"
    };

    OauthAccessTokenRequestRefresh obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRefreshToken().c_str());






}


void test_OauthAccessTokenRequestRefresh_scope_is_assigned_from_json()
{


    bourne::json input =
    {
        "scope", "hello"
    };

    OauthAccessTokenRequestRefresh obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getScope().c_str());






}


void test_OauthAccessTokenRequestRefresh_grant_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "grant_type", "hello"
    };

    OauthAccessTokenRequestRefresh obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getGrantType().c_str());






}



void test_OauthAccessTokenRequestRefresh_refresh_token_is_converted_to_json()
{

    bourne::json input =
    {
        "refresh_token", "hello"
    };

    OauthAccessTokenRequestRefresh obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["refresh_token"] == output["refresh_token"]);



}


void test_OauthAccessTokenRequestRefresh_scope_is_converted_to_json()
{

    bourne::json input =
    {
        "scope", "hello"
    };

    OauthAccessTokenRequestRefresh obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["scope"] == output["scope"]);



}


void test_OauthAccessTokenRequestRefresh_grant_type_is_converted_to_json()
{

    bourne::json input =
    {
        "grant_type", "hello"
    };

    OauthAccessTokenRequestRefresh obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["grant_type"] == output["grant_type"]);



}


