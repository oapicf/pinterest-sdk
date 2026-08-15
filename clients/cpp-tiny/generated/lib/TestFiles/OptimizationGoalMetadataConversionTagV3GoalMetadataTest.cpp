
#include "OptimizationGoalMetadata_conversion_tag_v3_goal_metadata.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_conversion_event_is_assigned_from_json()
{


    bourne::json input =
    {
        "conversion_event", "hello"
    };

    OptimizationGoalMetadata_conversion_tag_v3_goal_metadata obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getConversionEvent().c_str());






}


void test_OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_conversion_tag_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "conversion_tag_id", "hello"
    };

    OptimizationGoalMetadata_conversion_tag_v3_goal_metadata obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getConversionTagId().c_str());






}


void test_OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_cpa_goal_value_in_micro_currency_is_assigned_from_json()
{


    bourne::json input =
    {
        "cpa_goal_value_in_micro_currency", "hello"
    };

    OptimizationGoalMetadata_conversion_tag_v3_goal_metadata obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCpaGoalValueInMicroCurrency().c_str());






}


void test_OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_is_roas_optimized_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_roas_optimized", true
    };

    OptimizationGoalMetadata_conversion_tag_v3_goal_metadata obj(input.dump());

    TEST_ASSERT(true == obj.isIsRoasOptimized());




}


void test_OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_learning_mode_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "learning_mode_type", "hello"
    };

    OptimizationGoalMetadata_conversion_tag_v3_goal_metadata obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLearningModeType().c_str());






}


void test_OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_reporting_event_is_assigned_from_json()
{


    bourne::json input =
    {
        "reporting_event", "hello"
    };

    OptimizationGoalMetadata_conversion_tag_v3_goal_metadata obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getReportingEvent().c_str());






}




void test_OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_conversion_event_is_converted_to_json()
{

    bourne::json input =
    {
        "conversion_event", "hello"
    };

    OptimizationGoalMetadata_conversion_tag_v3_goal_metadata obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["conversion_event"] == output["conversion_event"]);



}


void test_OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_conversion_tag_id_is_converted_to_json()
{

    bourne::json input =
    {
        "conversion_tag_id", "hello"
    };

    OptimizationGoalMetadata_conversion_tag_v3_goal_metadata obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["conversion_tag_id"] == output["conversion_tag_id"]);



}


void test_OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_cpa_goal_value_in_micro_currency_is_converted_to_json()
{

    bourne::json input =
    {
        "cpa_goal_value_in_micro_currency", "hello"
    };

    OptimizationGoalMetadata_conversion_tag_v3_goal_metadata obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["cpa_goal_value_in_micro_currency"] == output["cpa_goal_value_in_micro_currency"]);



}


void test_OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_is_roas_optimized_is_converted_to_json()
{


    bourne::json input =
    {
        "is_roas_optimized", true
    };

    OptimizationGoalMetadata_conversion_tag_v3_goal_metadata obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_roas_optimized"] == output["is_roas_optimized"]);


}


void test_OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_learning_mode_type_is_converted_to_json()
{

    bourne::json input =
    {
        "learning_mode_type", "hello"
    };

    OptimizationGoalMetadata_conversion_tag_v3_goal_metadata obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["learning_mode_type"] == output["learning_mode_type"]);



}


void test_OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_reporting_event_is_converted_to_json()
{

    bourne::json input =
    {
        "reporting_event", "hello"
    };

    OptimizationGoalMetadata_conversion_tag_v3_goal_metadata obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["reporting_event"] == output["reporting_event"]);



}


