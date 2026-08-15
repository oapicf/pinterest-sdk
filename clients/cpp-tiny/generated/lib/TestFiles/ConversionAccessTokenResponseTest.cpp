
#include "ConversionAccessTokenResponse.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ConversionAccessTokenResponse_access_token_is_assigned_from_json()
{


    bourne::json input =
    {
        "access_token", "hello"
    };

    ConversionAccessTokenResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAccessToken().c_str());






}


void test_ConversionAccessTokenResponse_token_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "token_type", "hello"
    };

    ConversionAccessTokenResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getTokenType().c_str());






}



void test_ConversionAccessTokenResponse_access_token_is_converted_to_json()
{

    bourne::json input =
    {
        "access_token", "hello"
    };

    ConversionAccessTokenResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["access_token"] == output["access_token"]);



}


void test_ConversionAccessTokenResponse_token_type_is_converted_to_json()
{

    bourne::json input =
    {
        "token_type", "hello"
    };

    ConversionAccessTokenResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["token_type"] == output["token_type"]);



}


