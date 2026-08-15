
#include "OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows_click_window_days_is_assigned_from_json()
{
    bourne::json input =
    {
        "click_window_days", 1
    };

    OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getClickWindowDays());








}


void test_OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows_engagement_window_days_is_assigned_from_json()
{
    bourne::json input =
    {
        "engagement_window_days", 1
    };

    OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getEngagementWindowDays());








}


void test_OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows_view_window_days_is_assigned_from_json()
{
    bourne::json input =
    {
        "view_window_days", 1
    };

    OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getViewWindowDays());








}



void test_OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows_click_window_days_is_converted_to_json()
{
    bourne::json input =
    {
        "click_window_days", 1
    };

    OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["click_window_days"] == output["click_window_days"]);




}


void test_OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows_engagement_window_days_is_converted_to_json()
{
    bourne::json input =
    {
        "engagement_window_days", 1
    };

    OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["engagement_window_days"] == output["engagement_window_days"]);




}


void test_OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows_view_window_days_is_converted_to_json()
{
    bourne::json input =
    {
        "view_window_days", 1
    };

    OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["view_window_days"] == output["view_window_days"]);




}


