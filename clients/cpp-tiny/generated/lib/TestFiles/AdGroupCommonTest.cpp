
#include "AdGroupCommon.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_AdGroupCommon_auto_targeting_enabled_is_assigned_from_json()
{




    bourne::json input =
    {
        "auto_targeting_enabled", true
    };

    AdGroupCommon obj(input.dump());

    TEST_ASSERT(true == obj.isAutoTargetingEnabled());




}


void test_AdGroupCommon_bid_in_micro_currency_is_assigned_from_json()
{
    bourne::json input =
    {
        "bid_in_micro_currency", 1
    };

    AdGroupCommon obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getBidInMicroCurrency());








}


void test_AdGroupCommon_bid_strategy_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "bid_strategy_type", "hello"
    };

    AdGroupCommon obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBidStrategyType().c_str());






}



void test_AdGroupCommon_budget_in_micro_currency_is_assigned_from_json()
{
    bourne::json input =
    {
        "budget_in_micro_currency", 1
    };

    AdGroupCommon obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getBudgetInMicroCurrency());








}



void test_AdGroupCommon_campaign_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "campaign_id", "hello"
    };

    AdGroupCommon obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCampaignId().c_str());






}


void test_AdGroupCommon_end_time_is_assigned_from_json()
{
    bourne::json input =
    {
        "end_time", 1
    };

    AdGroupCommon obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getEndTime());








}


void test_AdGroupCommon_is_creative_optimization_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_creative_optimization", true
    };

    AdGroupCommon obj(input.dump());

    TEST_ASSERT(true == obj.isIsCreativeOptimization());




}


void test_AdGroupCommon_lifetime_frequency_cap_is_assigned_from_json()
{
    bourne::json input =
    {
        "lifetime_frequency_cap", 1
    };

    AdGroupCommon obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getLifetimeFrequencyCap());








}


void test_AdGroupCommon_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    AdGroupCommon obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}





void test_AdGroupCommon_promotion_application_level_is_assigned_from_json()
{


    bourne::json input =
    {
        "promotion_application_level", "hello"
    };

    AdGroupCommon obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPromotionApplicationLevel().c_str());






}


void test_AdGroupCommon_promotion_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "promotion_id", "hello"
    };

    AdGroupCommon obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPromotionId().c_str());






}


void test_AdGroupCommon_start_time_is_assigned_from_json()
{
    bourne::json input =
    {
        "start_time", 1
    };

    AdGroupCommon obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getStartTime());








}







void test_AdGroupCommon_auto_targeting_enabled_is_converted_to_json()
{


    bourne::json input =
    {
        "auto_targeting_enabled", true
    };

    AdGroupCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["auto_targeting_enabled"] == output["auto_targeting_enabled"]);


}


void test_AdGroupCommon_bid_in_micro_currency_is_converted_to_json()
{
    bourne::json input =
    {
        "bid_in_micro_currency", 1
    };

    AdGroupCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["bid_in_micro_currency"] == output["bid_in_micro_currency"]);




}


void test_AdGroupCommon_bid_strategy_type_is_converted_to_json()
{

    bourne::json input =
    {
        "bid_strategy_type", "hello"
    };

    AdGroupCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["bid_strategy_type"] == output["bid_strategy_type"]);



}



void test_AdGroupCommon_budget_in_micro_currency_is_converted_to_json()
{
    bourne::json input =
    {
        "budget_in_micro_currency", 1
    };

    AdGroupCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["budget_in_micro_currency"] == output["budget_in_micro_currency"]);




}



void test_AdGroupCommon_campaign_id_is_converted_to_json()
{

    bourne::json input =
    {
        "campaign_id", "hello"
    };

    AdGroupCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["campaign_id"] == output["campaign_id"]);



}


void test_AdGroupCommon_end_time_is_converted_to_json()
{
    bourne::json input =
    {
        "end_time", 1
    };

    AdGroupCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["end_time"] == output["end_time"]);




}


void test_AdGroupCommon_is_creative_optimization_is_converted_to_json()
{


    bourne::json input =
    {
        "is_creative_optimization", true
    };

    AdGroupCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_creative_optimization"] == output["is_creative_optimization"]);


}


void test_AdGroupCommon_lifetime_frequency_cap_is_converted_to_json()
{
    bourne::json input =
    {
        "lifetime_frequency_cap", 1
    };

    AdGroupCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["lifetime_frequency_cap"] == output["lifetime_frequency_cap"]);




}


void test_AdGroupCommon_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    AdGroupCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}





void test_AdGroupCommon_promotion_application_level_is_converted_to_json()
{

    bourne::json input =
    {
        "promotion_application_level", "hello"
    };

    AdGroupCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["promotion_application_level"] == output["promotion_application_level"]);



}


void test_AdGroupCommon_promotion_id_is_converted_to_json()
{

    bourne::json input =
    {
        "promotion_id", "hello"
    };

    AdGroupCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["promotion_id"] == output["promotion_id"]);



}


void test_AdGroupCommon_start_time_is_converted_to_json()
{
    bourne::json input =
    {
        "start_time", 1
    };

    AdGroupCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["start_time"] == output["start_time"]);




}






