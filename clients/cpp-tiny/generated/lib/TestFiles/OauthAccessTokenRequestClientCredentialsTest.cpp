
#include "OauthAccessTokenRequestClientCredentials.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_OauthAccessTokenRequestClientCredentials_scope_is_assigned_from_json()
{


    bourne::json input =
    {
        "scope", "hello"
    };

    OauthAccessTokenRequestClientCredentials obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getScope().c_str());






}


void test_OauthAccessTokenRequestClientCredentials_grant_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "grant_type", "hello"
    };

    OauthAccessTokenRequestClientCredentials obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getGrantType().c_str());






}



void test_OauthAccessTokenRequestClientCredentials_scope_is_converted_to_json()
{

    bourne::json input =
    {
        "scope", "hello"
    };

    OauthAccessTokenRequestClientCredentials obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["scope"] == output["scope"]);



}


void test_OauthAccessTokenRequestClientCredentials_grant_type_is_converted_to_json()
{

    bourne::json input =
    {
        "grant_type", "hello"
    };

    OauthAccessTokenRequestClientCredentials obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["grant_type"] == output["grant_type"]);



}


