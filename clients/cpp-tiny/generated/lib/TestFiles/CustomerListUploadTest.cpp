
#include "CustomerListUpload.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CustomerListUpload_ad_account_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "ad_account_id", "hello"
    };

    CustomerListUpload obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAdAccountId().c_str());






}


void test_CustomerListUpload_creation_time_is_assigned_from_json()
{
    bourne::json input =
    {
        "creation_time", 1
    };

    CustomerListUpload obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCreationTime());








}


void test_CustomerListUpload_customer_list_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "customer_list_id", "hello"
    };

    CustomerListUpload obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCustomerListId().c_str());






}



void test_CustomerListUpload_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    CustomerListUpload obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}




void test_CustomerListUpload_state_is_assigned_from_json()
{


    bourne::json input =
    {
        "state", "hello"
    };

    CustomerListUpload obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getState().c_str());






}


void test_CustomerListUpload_updated_time_is_assigned_from_json()
{
    bourne::json input =
    {
        "updated_time", 1
    };

    CustomerListUpload obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getUpdatedTime());








}



void test_CustomerListUpload_ad_account_id_is_converted_to_json()
{

    bourne::json input =
    {
        "ad_account_id", "hello"
    };

    CustomerListUpload obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["ad_account_id"] == output["ad_account_id"]);



}


void test_CustomerListUpload_creation_time_is_converted_to_json()
{
    bourne::json input =
    {
        "creation_time", 1
    };

    CustomerListUpload obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["creation_time"] == output["creation_time"]);




}


void test_CustomerListUpload_customer_list_id_is_converted_to_json()
{

    bourne::json input =
    {
        "customer_list_id", "hello"
    };

    CustomerListUpload obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["customer_list_id"] == output["customer_list_id"]);



}



void test_CustomerListUpload_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    CustomerListUpload obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}




void test_CustomerListUpload_state_is_converted_to_json()
{

    bourne::json input =
    {
        "state", "hello"
    };

    CustomerListUpload obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["state"] == output["state"]);



}


void test_CustomerListUpload_updated_time_is_converted_to_json()
{
    bourne::json input =
    {
        "updated_time", 1
    };

    CustomerListUpload obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["updated_time"] == output["updated_time"]);




}


