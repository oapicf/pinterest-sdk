
#include "OauthAccessTokenRequestCode.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_OauthAccessTokenRequestCode_code_is_assigned_from_json()
{


    bourne::json input =
    {
        "code", "hello"
    };

    OauthAccessTokenRequestCode obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCode().c_str());






}


void test_OauthAccessTokenRequestCode_redirect_uri_is_assigned_from_json()
{


    bourne::json input =
    {
        "redirect_uri", "hello"
    };

    OauthAccessTokenRequestCode obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRedirectUri().c_str());






}


void test_OauthAccessTokenRequestCode_grant_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "grant_type", "hello"
    };

    OauthAccessTokenRequestCode obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getGrantType().c_str());






}



void test_OauthAccessTokenRequestCode_code_is_converted_to_json()
{

    bourne::json input =
    {
        "code", "hello"
    };

    OauthAccessTokenRequestCode obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["code"] == output["code"]);



}


void test_OauthAccessTokenRequestCode_redirect_uri_is_converted_to_json()
{

    bourne::json input =
    {
        "redirect_uri", "hello"
    };

    OauthAccessTokenRequestCode obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["redirect_uri"] == output["redirect_uri"]);



}


void test_OauthAccessTokenRequestCode_grant_type_is_converted_to_json()
{

    bourne::json input =
    {
        "grant_type", "hello"
    };

    OauthAccessTokenRequestCode obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["grant_type"] == output["grant_type"]);



}


