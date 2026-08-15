
#include "BusinessAccessUserSummary.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_BusinessAccessUserSummary_email_is_assigned_from_json()
{


    bourne::json input =
    {
        "email", "hello"
    };

    BusinessAccessUserSummary obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEmail().c_str());






}


void test_BusinessAccessUserSummary_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    BusinessAccessUserSummary obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_BusinessAccessUserSummary_username_is_assigned_from_json()
{


    bourne::json input =
    {
        "username", "hello"
    };

    BusinessAccessUserSummary obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUsername().c_str());






}



void test_BusinessAccessUserSummary_email_is_converted_to_json()
{

    bourne::json input =
    {
        "email", "hello"
    };

    BusinessAccessUserSummary obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["email"] == output["email"]);



}


void test_BusinessAccessUserSummary_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    BusinessAccessUserSummary obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_BusinessAccessUserSummary_username_is_converted_to_json()
{

    bourne::json input =
    {
        "username", "hello"
    };

    BusinessAccessUserSummary obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["username"] == output["username"]);



}


