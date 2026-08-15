
#include "Audience.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_Audience_ad_account_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "ad_account_id", "hello"
    };

    Audience obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAdAccountId().c_str());






}


void test_Audience_audience_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "audience_type", "hello"
    };

    Audience obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAudienceType().c_str());






}


void test_Audience_created_by_company_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "created_by_company_name", "hello"
    };

    Audience obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCreatedByCompanyName().c_str());






}


void test_Audience_created_timestamp_is_assigned_from_json()
{
    bourne::json input =
    {
        "created_timestamp", 1
    };

    Audience obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCreatedTimestamp());








}


void test_Audience_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "description", "hello"
    };

    Audience obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}


void test_Audience_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    Audience obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_Audience_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    Audience obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}



void test_Audience_size_is_assigned_from_json()
{
    bourne::json input =
    {
        "size", 1
    };

    Audience obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getSize());








}


void test_Audience_status_is_assigned_from_json()
{


    bourne::json input =
    {
        "status", "hello"
    };

    Audience obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getStatus().c_str());






}


void test_Audience_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    Audience obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}


void test_Audience_updated_timestamp_is_assigned_from_json()
{
    bourne::json input =
    {
        "updated_timestamp", 1
    };

    Audience obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getUpdatedTimestamp());








}



void test_Audience_ad_account_id_is_converted_to_json()
{

    bourne::json input =
    {
        "ad_account_id", "hello"
    };

    Audience obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["ad_account_id"] == output["ad_account_id"]);



}


void test_Audience_audience_type_is_converted_to_json()
{

    bourne::json input =
    {
        "audience_type", "hello"
    };

    Audience obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["audience_type"] == output["audience_type"]);



}


void test_Audience_created_by_company_name_is_converted_to_json()
{

    bourne::json input =
    {
        "created_by_company_name", "hello"
    };

    Audience obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["created_by_company_name"] == output["created_by_company_name"]);



}


void test_Audience_created_timestamp_is_converted_to_json()
{
    bourne::json input =
    {
        "created_timestamp", 1
    };

    Audience obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["created_timestamp"] == output["created_timestamp"]);




}


void test_Audience_description_is_converted_to_json()
{

    bourne::json input =
    {
        "description", "hello"
    };

    Audience obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}


void test_Audience_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    Audience obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_Audience_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    Audience obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}



void test_Audience_size_is_converted_to_json()
{
    bourne::json input =
    {
        "size", 1
    };

    Audience obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["size"] == output["size"]);




}


void test_Audience_status_is_converted_to_json()
{

    bourne::json input =
    {
        "status", "hello"
    };

    Audience obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["status"] == output["status"]);



}


void test_Audience_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    Audience obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}


void test_Audience_updated_timestamp_is_converted_to_json()
{
    bourne::json input =
    {
        "updated_timestamp", 1
    };

    Audience obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["updated_timestamp"] == output["updated_timestamp"]);




}


