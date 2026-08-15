
#include "AdAccount.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_AdAccount_created_time_is_assigned_from_json()
{
    bourne::json input =
    {
        "created_time", 1
    };

    AdAccount obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCreatedTime());








}



void test_AdAccount_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    AdAccount obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_AdAccount_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    AdAccount obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}




void test_AdAccount_updated_time_is_assigned_from_json()
{
    bourne::json input =
    {
        "updated_time", 1
    };

    AdAccount obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getUpdatedTime());








}




void test_AdAccount_created_time_is_converted_to_json()
{
    bourne::json input =
    {
        "created_time", 1
    };

    AdAccount obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["created_time"] == output["created_time"]);




}



void test_AdAccount_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    AdAccount obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_AdAccount_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    AdAccount obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}




void test_AdAccount_updated_time_is_converted_to_json()
{
    bourne::json input =
    {
        "updated_time", 1
    };

    AdAccount obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["updated_time"] == output["updated_time"]);




}


