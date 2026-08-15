
#include "AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics_custom_event_metrics_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "custom_event_metrics_type", "hello"
    };

    AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCustomEventMetricsType().c_str());






}


void test_AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics_custom_event_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "custom_event_name", "hello"
    };

    AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCustomEventName().c_str());






}



void test_AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics_custom_event_metrics_type_is_converted_to_json()
{

    bourne::json input =
    {
        "custom_event_metrics_type", "hello"
    };

    AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["custom_event_metrics_type"] == output["custom_event_metrics_type"]);



}


void test_AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics_custom_event_name_is_converted_to_json()
{

    bourne::json input =
    {
        "custom_event_name", "hello"
    };

    AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["custom_event_name"] == output["custom_event_name"]);



}


