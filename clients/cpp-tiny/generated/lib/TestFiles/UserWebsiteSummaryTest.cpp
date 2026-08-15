
#include "UserWebsiteSummary.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_UserWebsiteSummary_status_is_assigned_from_json()
{


    bourne::json input =
    {
        "status", "hello"
    };

    UserWebsiteSummary obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getStatus().c_str());






}


void test_UserWebsiteSummary_verified_at_is_assigned_from_json()
{


    bourne::json input =
    {
        "verified_at", "hello"
    };

    UserWebsiteSummary obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getVerifiedAt().c_str());






}


void test_UserWebsiteSummary_website_is_assigned_from_json()
{


    bourne::json input =
    {
        "website", "hello"
    };

    UserWebsiteSummary obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getWebsite().c_str());






}



void test_UserWebsiteSummary_status_is_converted_to_json()
{

    bourne::json input =
    {
        "status", "hello"
    };

    UserWebsiteSummary obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["status"] == output["status"]);



}


void test_UserWebsiteSummary_verified_at_is_converted_to_json()
{

    bourne::json input =
    {
        "verified_at", "hello"
    };

    UserWebsiteSummary obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["verified_at"] == output["verified_at"]);



}


void test_UserWebsiteSummary_website_is_converted_to_json()
{

    bourne::json input =
    {
        "website", "hello"
    };

    UserWebsiteSummary obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["website"] == output["website"]);



}


