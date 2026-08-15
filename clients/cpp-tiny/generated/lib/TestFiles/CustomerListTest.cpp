
#include "CustomerList.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CustomerList_ad_account_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "ad_account_id", "hello"
    };

    CustomerList obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAdAccountId().c_str());






}


void test_CustomerList_created_time_is_assigned_from_json()
{








}



void test_CustomerList_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    CustomerList obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_CustomerList_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    CustomerList obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_CustomerList_num_batches_is_assigned_from_json()
{








}


void test_CustomerList_num_removed_user_records_is_assigned_from_json()
{








}


void test_CustomerList_num_uploaded_user_records_is_assigned_from_json()
{








}


void test_CustomerList_status_is_assigned_from_json()
{


    bourne::json input =
    {
        "status", "hello"
    };

    CustomerList obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getStatus().c_str());






}


void test_CustomerList_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    CustomerList obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}


void test_CustomerList_updated_time_is_assigned_from_json()
{








}



void test_CustomerList_ad_account_id_is_converted_to_json()
{

    bourne::json input =
    {
        "ad_account_id", "hello"
    };

    CustomerList obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["ad_account_id"] == output["ad_account_id"]);



}


void test_CustomerList_created_time_is_converted_to_json()
{




}



void test_CustomerList_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    CustomerList obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_CustomerList_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    CustomerList obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_CustomerList_num_batches_is_converted_to_json()
{




}


void test_CustomerList_num_removed_user_records_is_converted_to_json()
{




}


void test_CustomerList_num_uploaded_user_records_is_converted_to_json()
{




}


void test_CustomerList_status_is_converted_to_json()
{

    bourne::json input =
    {
        "status", "hello"
    };

    CustomerList obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["status"] == output["status"]);



}


void test_CustomerList_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    CustomerList obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}


void test_CustomerList_updated_time_is_converted_to_json()
{




}


