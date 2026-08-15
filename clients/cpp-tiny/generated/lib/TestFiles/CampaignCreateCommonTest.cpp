
#include "CampaignCreateCommon.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CampaignCreateCommon_ad_account_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "ad_account_id", "hello"
    };

    CampaignCreateCommon obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAdAccountId().c_str());






}


void test_CampaignCreateCommon_daily_spend_cap_is_assigned_from_json()
{
    bourne::json input =
    {
        "daily_spend_cap", 1
    };

    CampaignCreateCommon obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getDailySpendCap());








}


void test_CampaignCreateCommon_end_time_is_assigned_from_json()
{
    bourne::json input =
    {
        "end_time", 1
    };

    CampaignCreateCommon obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getEndTime());








}


void test_CampaignCreateCommon_is_automated_campaign_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_automated_campaign", true
    };

    CampaignCreateCommon obj(input.dump());

    TEST_ASSERT(true == obj.isIsAutomatedCampaign());




}


void test_CampaignCreateCommon_is_flexible_daily_budgets_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_flexible_daily_budgets", true
    };

    CampaignCreateCommon obj(input.dump());

    TEST_ASSERT(true == obj.isIsFlexibleDailyBudgets());




}


void test_CampaignCreateCommon_lifetime_spend_cap_is_assigned_from_json()
{
    bourne::json input =
    {
        "lifetime_spend_cap", 1
    };

    CampaignCreateCommon obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getLifetimeSpendCap());








}


void test_CampaignCreateCommon_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    CampaignCreateCommon obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_CampaignCreateCommon_order_line_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "order_line_id", "hello"
    };

    CampaignCreateCommon obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOrderLineId().c_str());






}


void test_CampaignCreateCommon_start_time_is_assigned_from_json()
{
    bourne::json input =
    {
        "start_time", 1
    };

    CampaignCreateCommon obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getStartTime());








}




void test_CampaignCreateCommon_default_ad_group_budget_in_micro_currency_is_assigned_from_json()
{
    bourne::json input =
    {
        "default_ad_group_budget_in_micro_currency", 1
    };

    CampaignCreateCommon obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getDefaultAdGroupBudgetInMicroCurrency());








}


void test_CampaignCreateCommon_is_campaign_budget_optimization_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_campaign_budget_optimization", true
    };

    CampaignCreateCommon obj(input.dump());

    TEST_ASSERT(true == obj.isIsCampaignBudgetOptimization());




}



void test_CampaignCreateCommon_ad_account_id_is_converted_to_json()
{

    bourne::json input =
    {
        "ad_account_id", "hello"
    };

    CampaignCreateCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["ad_account_id"] == output["ad_account_id"]);



}


void test_CampaignCreateCommon_daily_spend_cap_is_converted_to_json()
{
    bourne::json input =
    {
        "daily_spend_cap", 1
    };

    CampaignCreateCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["daily_spend_cap"] == output["daily_spend_cap"]);




}


void test_CampaignCreateCommon_end_time_is_converted_to_json()
{
    bourne::json input =
    {
        "end_time", 1
    };

    CampaignCreateCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["end_time"] == output["end_time"]);




}


void test_CampaignCreateCommon_is_automated_campaign_is_converted_to_json()
{


    bourne::json input =
    {
        "is_automated_campaign", true
    };

    CampaignCreateCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_automated_campaign"] == output["is_automated_campaign"]);


}


void test_CampaignCreateCommon_is_flexible_daily_budgets_is_converted_to_json()
{


    bourne::json input =
    {
        "is_flexible_daily_budgets", true
    };

    CampaignCreateCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_flexible_daily_budgets"] == output["is_flexible_daily_budgets"]);


}


void test_CampaignCreateCommon_lifetime_spend_cap_is_converted_to_json()
{
    bourne::json input =
    {
        "lifetime_spend_cap", 1
    };

    CampaignCreateCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["lifetime_spend_cap"] == output["lifetime_spend_cap"]);




}


void test_CampaignCreateCommon_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    CampaignCreateCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_CampaignCreateCommon_order_line_id_is_converted_to_json()
{

    bourne::json input =
    {
        "order_line_id", "hello"
    };

    CampaignCreateCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["order_line_id"] == output["order_line_id"]);



}


void test_CampaignCreateCommon_start_time_is_converted_to_json()
{
    bourne::json input =
    {
        "start_time", 1
    };

    CampaignCreateCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["start_time"] == output["start_time"]);




}




void test_CampaignCreateCommon_default_ad_group_budget_in_micro_currency_is_converted_to_json()
{
    bourne::json input =
    {
        "default_ad_group_budget_in_micro_currency", 1
    };

    CampaignCreateCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["default_ad_group_budget_in_micro_currency"] == output["default_ad_group_budget_in_micro_currency"]);




}


void test_CampaignCreateCommon_is_campaign_budget_optimization_is_converted_to_json()
{


    bourne::json input =
    {
        "is_campaign_budget_optimization", true
    };

    CampaignCreateCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_campaign_budget_optimization"] == output["is_campaign_budget_optimization"]);


}


