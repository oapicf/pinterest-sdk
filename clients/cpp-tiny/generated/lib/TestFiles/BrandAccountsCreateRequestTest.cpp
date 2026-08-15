
#include "Brand_accounts_create_request.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_Brand_accounts_create_request_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    Brand_accounts_create_request obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_Brand_accounts_create_request_username_is_assigned_from_json()
{


    bourne::json input =
    {
        "username", "hello"
    };

    Brand_accounts_create_request obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUsername().c_str());






}



void test_Brand_accounts_create_request_about_is_assigned_from_json()
{


    bourne::json input =
    {
        "about", "hello"
    };

    Brand_accounts_create_request obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAbout().c_str());






}


void test_Brand_accounts_create_request_website_is_assigned_from_json()
{


    bourne::json input =
    {
        "website", "hello"
    };

    Brand_accounts_create_request obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getWebsite().c_str());






}




void test_Brand_accounts_create_request_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    Brand_accounts_create_request obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_Brand_accounts_create_request_username_is_converted_to_json()
{

    bourne::json input =
    {
        "username", "hello"
    };

    Brand_accounts_create_request obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["username"] == output["username"]);



}



void test_Brand_accounts_create_request_about_is_converted_to_json()
{

    bourne::json input =
    {
        "about", "hello"
    };

    Brand_accounts_create_request obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["about"] == output["about"]);



}


void test_Brand_accounts_create_request_website_is_converted_to_json()
{

    bourne::json input =
    {
        "website", "hello"
    };

    Brand_accounts_create_request obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["website"] == output["website"]);



}



