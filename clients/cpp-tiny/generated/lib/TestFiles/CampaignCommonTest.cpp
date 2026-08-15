
#include "CampaignCommon.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CampaignCommon_ad_account_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "ad_account_id", "hello"
    };

    CampaignCommon obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAdAccountId().c_str());






}


void test_CampaignCommon_daily_spend_cap_is_assigned_from_json()
{
    bourne::json input =
    {
        "daily_spend_cap", 1
    };

    CampaignCommon obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getDailySpendCap());








}


void test_CampaignCommon_end_time_is_assigned_from_json()
{
    bourne::json input =
    {
        "end_time", 1
    };

    CampaignCommon obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getEndTime());








}


void test_CampaignCommon_is_automated_campaign_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_automated_campaign", true
    };

    CampaignCommon obj(input.dump());

    TEST_ASSERT(true == obj.isIsAutomatedCampaign());




}


void test_CampaignCommon_is_flexible_daily_budgets_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_flexible_daily_budgets", true
    };

    CampaignCommon obj(input.dump());

    TEST_ASSERT(true == obj.isIsFlexibleDailyBudgets());




}


void test_CampaignCommon_lifetime_spend_cap_is_assigned_from_json()
{
    bourne::json input =
    {
        "lifetime_spend_cap", 1
    };

    CampaignCommon obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getLifetimeSpendCap());








}


void test_CampaignCommon_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    CampaignCommon obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_CampaignCommon_order_line_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "order_line_id", "hello"
    };

    CampaignCommon obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOrderLineId().c_str());






}


void test_CampaignCommon_start_time_is_assigned_from_json()
{
    bourne::json input =
    {
        "start_time", 1
    };

    CampaignCommon obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getStartTime());








}





void test_CampaignCommon_ad_account_id_is_converted_to_json()
{

    bourne::json input =
    {
        "ad_account_id", "hello"
    };

    CampaignCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["ad_account_id"] == output["ad_account_id"]);



}


void test_CampaignCommon_daily_spend_cap_is_converted_to_json()
{
    bourne::json input =
    {
        "daily_spend_cap", 1
    };

    CampaignCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["daily_spend_cap"] == output["daily_spend_cap"]);




}


void test_CampaignCommon_end_time_is_converted_to_json()
{
    bourne::json input =
    {
        "end_time", 1
    };

    CampaignCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["end_time"] == output["end_time"]);




}


void test_CampaignCommon_is_automated_campaign_is_converted_to_json()
{


    bourne::json input =
    {
        "is_automated_campaign", true
    };

    CampaignCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_automated_campaign"] == output["is_automated_campaign"]);


}


void test_CampaignCommon_is_flexible_daily_budgets_is_converted_to_json()
{


    bourne::json input =
    {
        "is_flexible_daily_budgets", true
    };

    CampaignCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_flexible_daily_budgets"] == output["is_flexible_daily_budgets"]);


}


void test_CampaignCommon_lifetime_spend_cap_is_converted_to_json()
{
    bourne::json input =
    {
        "lifetime_spend_cap", 1
    };

    CampaignCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["lifetime_spend_cap"] == output["lifetime_spend_cap"]);




}


void test_CampaignCommon_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    CampaignCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_CampaignCommon_order_line_id_is_converted_to_json()
{

    bourne::json input =
    {
        "order_line_id", "hello"
    };

    CampaignCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["order_line_id"] == output["order_line_id"]);



}


void test_CampaignCommon_start_time_is_converted_to_json()
{
    bourne::json input =
    {
        "start_time", 1
    };

    CampaignCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["start_time"] == output["start_time"]);




}




