
#include "BookClosedResponse.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_BookClosedResponse_conversion_metrics_ready_is_assigned_from_json()
{




    bourne::json input =
    {
        "conversion_metrics_ready", true
    };

    BookClosedResponse obj(input.dump());

    TEST_ASSERT(true == obj.isConversionMetricsReady());




}


void test_BookClosedResponse_non_conversion_metrics_ready_is_assigned_from_json()
{




    bourne::json input =
    {
        "non_conversion_metrics_ready", true
    };

    BookClosedResponse obj(input.dump());

    TEST_ASSERT(true == obj.isNonConversionMetricsReady());




}



void test_BookClosedResponse_conversion_metrics_ready_is_converted_to_json()
{


    bourne::json input =
    {
        "conversion_metrics_ready", true
    };

    BookClosedResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["conversion_metrics_ready"] == output["conversion_metrics_ready"]);


}


void test_BookClosedResponse_non_conversion_metrics_ready_is_converted_to_json()
{


    bourne::json input =
    {
        "non_conversion_metrics_ready", true
    };

    BookClosedResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["non_conversion_metrics_ready"] == output["non_conversion_metrics_ready"]);


}


