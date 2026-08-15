
#include "AudienceRule.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_AudienceRule_ad_account_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "ad_account_id", "hello"
    };

    AudienceRule obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAdAccountId().c_str());






}




void test_AudienceRule_country_is_assigned_from_json()
{


    bourne::json input =
    {
        "country", "hello"
    };

    AudienceRule obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCountry().c_str());






}


void test_AudienceRule_customer_list_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "customer_list_id", "hello"
    };

    AudienceRule obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCustomerListId().c_str());






}



void test_AudienceRule_engagement_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "engagement_type", "hello"
    };

    AudienceRule obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEngagementType().c_str());






}


void test_AudienceRule_engager_type_is_assigned_from_json()
{
    bourne::json input =
    {
        "engager_type", 1
    };

    AudienceRule obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getEngagerType());








}


void test_AudienceRule_event_is_assigned_from_json()
{


    bourne::json input =
    {
        "event", "hello"
    };

    AudienceRule obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEvent().c_str());






}






void test_AudienceRule_percentage_is_assigned_from_json()
{
    bourne::json input =
    {
        "percentage", 1
    };

    AudienceRule obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPercentage());








}



void test_AudienceRule_prefill_is_assigned_from_json()
{




    bourne::json input =
    {
        "prefill", true
    };

    AudienceRule obj(input.dump());

    TEST_ASSERT(true == obj.isPrefill());




}


void test_AudienceRule_retention_days_is_assigned_from_json()
{
    bourne::json input =
    {
        "retention_days", 1
    };

    AudienceRule obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getRetentionDays());








}




void test_AudienceRule_visitor_source_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "visitor_source_id", "hello"
    };

    AudienceRule obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getVisitorSourceId().c_str());






}



void test_AudienceRule_ad_account_id_is_converted_to_json()
{

    bourne::json input =
    {
        "ad_account_id", "hello"
    };

    AudienceRule obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["ad_account_id"] == output["ad_account_id"]);



}




void test_AudienceRule_country_is_converted_to_json()
{

    bourne::json input =
    {
        "country", "hello"
    };

    AudienceRule obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["country"] == output["country"]);



}


void test_AudienceRule_customer_list_id_is_converted_to_json()
{

    bourne::json input =
    {
        "customer_list_id", "hello"
    };

    AudienceRule obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["customer_list_id"] == output["customer_list_id"]);



}



void test_AudienceRule_engagement_type_is_converted_to_json()
{

    bourne::json input =
    {
        "engagement_type", "hello"
    };

    AudienceRule obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["engagement_type"] == output["engagement_type"]);



}


void test_AudienceRule_engager_type_is_converted_to_json()
{
    bourne::json input =
    {
        "engager_type", 1
    };

    AudienceRule obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["engager_type"] == output["engager_type"]);




}


void test_AudienceRule_event_is_converted_to_json()
{

    bourne::json input =
    {
        "event", "hello"
    };

    AudienceRule obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["event"] == output["event"]);



}






void test_AudienceRule_percentage_is_converted_to_json()
{
    bourne::json input =
    {
        "percentage", 1
    };

    AudienceRule obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["percentage"] == output["percentage"]);




}



void test_AudienceRule_prefill_is_converted_to_json()
{


    bourne::json input =
    {
        "prefill", true
    };

    AudienceRule obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["prefill"] == output["prefill"]);


}


void test_AudienceRule_retention_days_is_converted_to_json()
{
    bourne::json input =
    {
        "retention_days", 1
    };

    AudienceRule obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["retention_days"] == output["retention_days"]);




}




void test_AudienceRule_visitor_source_id_is_converted_to_json()
{

    bourne::json input =
    {
        "visitor_source_id", "hello"
    };

    AudienceRule obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["visitor_source_id"] == output["visitor_source_id"]);



}


