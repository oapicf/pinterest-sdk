
#include "PinAnalyticsMetricsResponse_daily_metrics_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_PinAnalyticsMetricsResponse_daily_metrics_inner_date_is_assigned_from_json()
{


    bourne::json input =
    {
        "date", "hello"
    };

    PinAnalyticsMetricsResponse_daily_metrics_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDate().c_str());






}


void test_PinAnalyticsMetricsResponse_daily_metrics_inner_metrics_is_assigned_from_json()
{








}




void test_PinAnalyticsMetricsResponse_daily_metrics_inner_date_is_converted_to_json()
{

    bourne::json input =
    {
        "date", "hello"
    };

    PinAnalyticsMetricsResponse_daily_metrics_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["date"] == output["date"]);



}


void test_PinAnalyticsMetricsResponse_daily_metrics_inner_metrics_is_converted_to_json()
{




}


