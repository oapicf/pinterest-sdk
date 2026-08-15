
#include "UserWebsiteVerifyRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_UserWebsiteVerifyRequest_verification_method_is_assigned_from_json()
{


    bourne::json input =
    {
        "verification_method", "hello"
    };

    UserWebsiteVerifyRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getVerificationMethod().c_str());






}


void test_UserWebsiteVerifyRequest_website_is_assigned_from_json()
{


    bourne::json input =
    {
        "website", "hello"
    };

    UserWebsiteVerifyRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getWebsite().c_str());






}



void test_UserWebsiteVerifyRequest_verification_method_is_converted_to_json()
{

    bourne::json input =
    {
        "verification_method", "hello"
    };

    UserWebsiteVerifyRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["verification_method"] == output["verification_method"]);



}


void test_UserWebsiteVerifyRequest_website_is_converted_to_json()
{

    bourne::json input =
    {
        "website", "hello"
    };

    UserWebsiteVerifyRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["website"] == output["website"]);



}


