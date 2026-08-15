
#include "AdAccountCreate.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"





void test_AdAccountCreate_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    AdAccountCreate obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_AdAccountCreate_owner_user_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "owner_user_id", "hello"
    };

    AdAccountCreate obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOwnerUserId().c_str());






}





void test_AdAccountCreate_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    AdAccountCreate obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_AdAccountCreate_owner_user_id_is_converted_to_json()
{

    bourne::json input =
    {
        "owner_user_id", "hello"
    };

    AdAccountCreate obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["owner_user_id"] == output["owner_user_id"]);



}


