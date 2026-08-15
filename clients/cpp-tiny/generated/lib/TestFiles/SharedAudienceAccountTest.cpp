
#include "SharedAudienceAccount.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_SharedAudienceAccount_account_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "account_id", "hello"
    };

    SharedAudienceAccount obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAccountId().c_str());






}


void test_SharedAudienceAccount_account_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "account_name", "hello"
    };

    SharedAudienceAccount obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAccountName().c_str());






}


void test_SharedAudienceAccount_account_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "account_type", "hello"
    };

    SharedAudienceAccount obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAccountType().c_str());






}


void test_SharedAudienceAccount_shared_on_timestamp_is_assigned_from_json()
{
    bourne::json input =
    {
        "shared_on_timestamp", 1
    };

    SharedAudienceAccount obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getSharedOnTimestamp());








}



void test_SharedAudienceAccount_account_id_is_converted_to_json()
{

    bourne::json input =
    {
        "account_id", "hello"
    };

    SharedAudienceAccount obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["account_id"] == output["account_id"]);



}


void test_SharedAudienceAccount_account_name_is_converted_to_json()
{

    bourne::json input =
    {
        "account_name", "hello"
    };

    SharedAudienceAccount obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["account_name"] == output["account_name"]);



}


void test_SharedAudienceAccount_account_type_is_converted_to_json()
{

    bourne::json input =
    {
        "account_type", "hello"
    };

    SharedAudienceAccount obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["account_type"] == output["account_type"]);



}


void test_SharedAudienceAccount_shared_on_timestamp_is_converted_to_json()
{
    bourne::json input =
    {
        "shared_on_timestamp", 1
    };

    SharedAudienceAccount obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["shared_on_timestamp"] == output["shared_on_timestamp"]);




}


