
#include "AdGroupResponse.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_AdGroupResponse_auto_targeting_enabled_is_assigned_from_json()
{




    bourne::json input =
    {
        "auto_targeting_enabled", true
    };

    AdGroupResponse obj(input.dump());

    TEST_ASSERT(true == obj.isAutoTargetingEnabled());




}


void test_AdGroupResponse_bid_in_micro_currency_is_assigned_from_json()
{
    bourne::json input =
    {
        "bid_in_micro_currency", 1
    };

    AdGroupResponse obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getBidInMicroCurrency());








}


void test_AdGroupResponse_bid_strategy_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "bid_strategy_type", "hello"
    };

    AdGroupResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBidStrategyType().c_str());






}



void test_AdGroupResponse_budget_in_micro_currency_is_assigned_from_json()
{
    bourne::json input =
    {
        "budget_in_micro_currency", 1
    };

    AdGroupResponse obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getBudgetInMicroCurrency());








}



void test_AdGroupResponse_campaign_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "campaign_id", "hello"
    };

    AdGroupResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCampaignId().c_str());






}


void test_AdGroupResponse_end_time_is_assigned_from_json()
{
    bourne::json input =
    {
        "end_time", 1
    };

    AdGroupResponse obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getEndTime());








}


void test_AdGroupResponse_is_creative_optimization_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_creative_optimization", true
    };

    AdGroupResponse obj(input.dump());

    TEST_ASSERT(true == obj.isIsCreativeOptimization());




}


void test_AdGroupResponse_lifetime_frequency_cap_is_assigned_from_json()
{
    bourne::json input =
    {
        "lifetime_frequency_cap", 1
    };

    AdGroupResponse obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getLifetimeFrequencyCap());








}


void test_AdGroupResponse_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    AdGroupResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}





void test_AdGroupResponse_promotion_application_level_is_assigned_from_json()
{


    bourne::json input =
    {
        "promotion_application_level", "hello"
    };

    AdGroupResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPromotionApplicationLevel().c_str());






}


void test_AdGroupResponse_promotion_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "promotion_id", "hello"
    };

    AdGroupResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPromotionId().c_str());






}


void test_AdGroupResponse_start_time_is_assigned_from_json()
{
    bourne::json input =
    {
        "start_time", 1
    };

    AdGroupResponse obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getStartTime());








}






void test_AdGroupResponse_ad_account_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "ad_account_id", "hello"
    };

    AdGroupResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAdAccountId().c_str());






}


void test_AdGroupResponse_bid_multiplier_is_assigned_from_json()
{








}


void test_AdGroupResponse_conversion_learning_mode_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "conversion_learning_mode_type", "hello"
    };

    AdGroupResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getConversionLearningModeType().c_str());






}


void test_AdGroupResponse_created_time_is_assigned_from_json()
{
    bourne::json input =
    {
        "created_time", 1
    };

    AdGroupResponse obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCreatedTime());








}



void test_AdGroupResponse_feed_profile_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "feed_profile_id", "hello"
    };

    AdGroupResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFeedProfileId().c_str());






}


void test_AdGroupResponse_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    AdGroupResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}



void test_AdGroupResponse_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    AdGroupResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}


void test_AdGroupResponse_updated_time_is_assigned_from_json()
{
    bourne::json input =
    {
        "updated_time", 1
    };

    AdGroupResponse obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getUpdatedTime());








}



void test_AdGroupResponse_auto_targeting_enabled_is_converted_to_json()
{


    bourne::json input =
    {
        "auto_targeting_enabled", true
    };

    AdGroupResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["auto_targeting_enabled"] == output["auto_targeting_enabled"]);


}


void test_AdGroupResponse_bid_in_micro_currency_is_converted_to_json()
{
    bourne::json input =
    {
        "bid_in_micro_currency", 1
    };

    AdGroupResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["bid_in_micro_currency"] == output["bid_in_micro_currency"]);




}


void test_AdGroupResponse_bid_strategy_type_is_converted_to_json()
{

    bourne::json input =
    {
        "bid_strategy_type", "hello"
    };

    AdGroupResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["bid_strategy_type"] == output["bid_strategy_type"]);



}



void test_AdGroupResponse_budget_in_micro_currency_is_converted_to_json()
{
    bourne::json input =
    {
        "budget_in_micro_currency", 1
    };

    AdGroupResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["budget_in_micro_currency"] == output["budget_in_micro_currency"]);




}



void test_AdGroupResponse_campaign_id_is_converted_to_json()
{

    bourne::json input =
    {
        "campaign_id", "hello"
    };

    AdGroupResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["campaign_id"] == output["campaign_id"]);



}


void test_AdGroupResponse_end_time_is_converted_to_json()
{
    bourne::json input =
    {
        "end_time", 1
    };

    AdGroupResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["end_time"] == output["end_time"]);




}


void test_AdGroupResponse_is_creative_optimization_is_converted_to_json()
{


    bourne::json input =
    {
        "is_creative_optimization", true
    };

    AdGroupResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_creative_optimization"] == output["is_creative_optimization"]);


}


void test_AdGroupResponse_lifetime_frequency_cap_is_converted_to_json()
{
    bourne::json input =
    {
        "lifetime_frequency_cap", 1
    };

    AdGroupResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["lifetime_frequency_cap"] == output["lifetime_frequency_cap"]);




}


void test_AdGroupResponse_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    AdGroupResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}





void test_AdGroupResponse_promotion_application_level_is_converted_to_json()
{

    bourne::json input =
    {
        "promotion_application_level", "hello"
    };

    AdGroupResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["promotion_application_level"] == output["promotion_application_level"]);



}


void test_AdGroupResponse_promotion_id_is_converted_to_json()
{

    bourne::json input =
    {
        "promotion_id", "hello"
    };

    AdGroupResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["promotion_id"] == output["promotion_id"]);



}


void test_AdGroupResponse_start_time_is_converted_to_json()
{
    bourne::json input =
    {
        "start_time", 1
    };

    AdGroupResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["start_time"] == output["start_time"]);




}






void test_AdGroupResponse_ad_account_id_is_converted_to_json()
{

    bourne::json input =
    {
        "ad_account_id", "hello"
    };

    AdGroupResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["ad_account_id"] == output["ad_account_id"]);



}


void test_AdGroupResponse_bid_multiplier_is_converted_to_json()
{




}


void test_AdGroupResponse_conversion_learning_mode_type_is_converted_to_json()
{

    bourne::json input =
    {
        "conversion_learning_mode_type", "hello"
    };

    AdGroupResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["conversion_learning_mode_type"] == output["conversion_learning_mode_type"]);



}


void test_AdGroupResponse_created_time_is_converted_to_json()
{
    bourne::json input =
    {
        "created_time", 1
    };

    AdGroupResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["created_time"] == output["created_time"]);




}



void test_AdGroupResponse_feed_profile_id_is_converted_to_json()
{

    bourne::json input =
    {
        "feed_profile_id", "hello"
    };

    AdGroupResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["feed_profile_id"] == output["feed_profile_id"]);



}


void test_AdGroupResponse_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    AdGroupResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}



void test_AdGroupResponse_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    AdGroupResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}


void test_AdGroupResponse_updated_time_is_converted_to_json()
{
    bourne::json input =
    {
        "updated_time", 1
    };

    AdGroupResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["updated_time"] == output["updated_time"]);




}


