
#include "TemplateResponse.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_TemplateResponse_ad_account_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "ad_account_id", "hello"
    };

    TemplateResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAdAccountId().c_str());






}



void test_TemplateResponse_click_window_days_is_assigned_from_json()
{








}



void test_TemplateResponse_conversion_report_time_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "conversion_report_time_type", "hello"
    };

    TemplateResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getConversionReportTimeType().c_str());






}


void test_TemplateResponse_creation_source_is_assigned_from_json()
{


    bourne::json input =
    {
        "creation_source", "hello"
    };

    TemplateResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCreationSource().c_str());






}




void test_TemplateResponse_engagement_window_days_is_assigned_from_json()
{








}


void test_TemplateResponse_filters_json_is_assigned_from_json()
{


    bourne::json input =
    {
        "filters_json", "hello"
    };

    TemplateResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFiltersJson().c_str());






}



void test_TemplateResponse_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    TemplateResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}



void test_TemplateResponse_is_deleted_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_deleted", true
    };

    TemplateResponse obj(input.dump());

    TEST_ASSERT(true == obj.isIsDeleted());




}


void test_TemplateResponse_is_owned_by_user_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_owned_by_user", true
    };

    TemplateResponse obj(input.dump());

    TEST_ASSERT(true == obj.isIsOwnedByUser());




}


void test_TemplateResponse_is_scheduled_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_scheduled", true
    };

    TemplateResponse obj(input.dump());

    TEST_ASSERT(true == obj.isIsScheduled());




}


void test_TemplateResponse_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    TemplateResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_TemplateResponse_report_end_relative_days_in_past_is_assigned_from_json()
{








}




void test_TemplateResponse_report_start_relative_days_in_past_is_assigned_from_json()
{








}


void test_TemplateResponse_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    TemplateResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}


void test_TemplateResponse_updated_time_is_assigned_from_json()
{








}


void test_TemplateResponse_user_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "user_id", "hello"
    };

    TemplateResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUserId().c_str());






}


void test_TemplateResponse_view_window_days_is_assigned_from_json()
{








}



void test_TemplateResponse_ad_account_id_is_converted_to_json()
{

    bourne::json input =
    {
        "ad_account_id", "hello"
    };

    TemplateResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["ad_account_id"] == output["ad_account_id"]);



}



void test_TemplateResponse_click_window_days_is_converted_to_json()
{




}



void test_TemplateResponse_conversion_report_time_type_is_converted_to_json()
{

    bourne::json input =
    {
        "conversion_report_time_type", "hello"
    };

    TemplateResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["conversion_report_time_type"] == output["conversion_report_time_type"]);



}


void test_TemplateResponse_creation_source_is_converted_to_json()
{

    bourne::json input =
    {
        "creation_source", "hello"
    };

    TemplateResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["creation_source"] == output["creation_source"]);



}




void test_TemplateResponse_engagement_window_days_is_converted_to_json()
{




}


void test_TemplateResponse_filters_json_is_converted_to_json()
{

    bourne::json input =
    {
        "filters_json", "hello"
    };

    TemplateResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["filters_json"] == output["filters_json"]);



}



void test_TemplateResponse_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    TemplateResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}



void test_TemplateResponse_is_deleted_is_converted_to_json()
{


    bourne::json input =
    {
        "is_deleted", true
    };

    TemplateResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_deleted"] == output["is_deleted"]);


}


void test_TemplateResponse_is_owned_by_user_is_converted_to_json()
{


    bourne::json input =
    {
        "is_owned_by_user", true
    };

    TemplateResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_owned_by_user"] == output["is_owned_by_user"]);


}


void test_TemplateResponse_is_scheduled_is_converted_to_json()
{


    bourne::json input =
    {
        "is_scheduled", true
    };

    TemplateResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_scheduled"] == output["is_scheduled"]);


}


void test_TemplateResponse_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    TemplateResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_TemplateResponse_report_end_relative_days_in_past_is_converted_to_json()
{




}




void test_TemplateResponse_report_start_relative_days_in_past_is_converted_to_json()
{




}


void test_TemplateResponse_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    TemplateResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}


void test_TemplateResponse_updated_time_is_converted_to_json()
{




}


void test_TemplateResponse_user_id_is_converted_to_json()
{

    bourne::json input =
    {
        "user_id", "hello"
    };

    TemplateResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["user_id"] == output["user_id"]);



}


void test_TemplateResponse_view_window_days_is_converted_to_json()
{




}


