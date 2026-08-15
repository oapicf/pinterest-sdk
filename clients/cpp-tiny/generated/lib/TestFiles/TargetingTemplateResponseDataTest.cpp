
#include "TargetingTemplateResponseData.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_TargetingTemplateResponseData_auto_targeting_enabled_is_assigned_from_json()
{




    bourne::json input =
    {
        "auto_targeting_enabled", true
    };

    TargetingTemplateResponseData obj(input.dump());

    TEST_ASSERT(true == obj.isAutoTargetingEnabled());




}



void test_TargetingTemplateResponseData_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    TargetingTemplateResponseData obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}





void test_TargetingTemplateResponseData_ad_account_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "ad_account_id", "hello"
    };

    TargetingTemplateResponseData obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAdAccountId().c_str());






}


void test_TargetingTemplateResponseData_created_time_is_assigned_from_json()
{
    bourne::json input =
    {
        "created_time", 1
    };

    TargetingTemplateResponseData obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCreatedTime());








}


void test_TargetingTemplateResponseData_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    TargetingTemplateResponseData obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}



void test_TargetingTemplateResponseData_status_is_assigned_from_json()
{


    bourne::json input =
    {
        "status", "hello"
    };

    TargetingTemplateResponseData obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getStatus().c_str());






}


void test_TargetingTemplateResponseData_updated_time_is_assigned_from_json()
{
    bourne::json input =
    {
        "updated_time", 1
    };

    TargetingTemplateResponseData obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getUpdatedTime());








}



void test_TargetingTemplateResponseData_auto_targeting_enabled_is_converted_to_json()
{


    bourne::json input =
    {
        "auto_targeting_enabled", true
    };

    TargetingTemplateResponseData obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["auto_targeting_enabled"] == output["auto_targeting_enabled"]);


}



void test_TargetingTemplateResponseData_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    TargetingTemplateResponseData obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}





void test_TargetingTemplateResponseData_ad_account_id_is_converted_to_json()
{

    bourne::json input =
    {
        "ad_account_id", "hello"
    };

    TargetingTemplateResponseData obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["ad_account_id"] == output["ad_account_id"]);



}


void test_TargetingTemplateResponseData_created_time_is_converted_to_json()
{
    bourne::json input =
    {
        "created_time", 1
    };

    TargetingTemplateResponseData obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["created_time"] == output["created_time"]);




}


void test_TargetingTemplateResponseData_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    TargetingTemplateResponseData obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}



void test_TargetingTemplateResponseData_status_is_converted_to_json()
{

    bourne::json input =
    {
        "status", "hello"
    };

    TargetingTemplateResponseData obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["status"] == output["status"]);



}


void test_TargetingTemplateResponseData_updated_time_is_converted_to_json()
{
    bourne::json input =
    {
        "updated_time", 1
    };

    TargetingTemplateResponseData obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["updated_time"] == output["updated_time"]);




}


