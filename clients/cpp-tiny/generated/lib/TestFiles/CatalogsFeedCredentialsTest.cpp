
#include "CatalogsFeedCredentials.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CatalogsFeedCredentials_password_is_assigned_from_json()
{


    bourne::json input =
    {
        "password", "hello"
    };

    CatalogsFeedCredentials obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPassword().c_str());






}


void test_CatalogsFeedCredentials_username_is_assigned_from_json()
{


    bourne::json input =
    {
        "username", "hello"
    };

    CatalogsFeedCredentials obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUsername().c_str());






}



void test_CatalogsFeedCredentials_password_is_converted_to_json()
{

    bourne::json input =
    {
        "password", "hello"
    };

    CatalogsFeedCredentials obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["password"] == output["password"]);



}


void test_CatalogsFeedCredentials_username_is_converted_to_json()
{

    bourne::json input =
    {
        "username", "hello"
    };

    CatalogsFeedCredentials obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["username"] == output["username"]);



}


