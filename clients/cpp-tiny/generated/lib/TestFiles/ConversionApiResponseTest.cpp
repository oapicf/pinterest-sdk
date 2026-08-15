
#include "ConversionApiResponse.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_ConversionApiResponse_num_events_processed_is_assigned_from_json()
{
    bourne::json input =
    {
        "num_events_processed", 1
    };

    ConversionApiResponse obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getNumEventsProcessed());








}


void test_ConversionApiResponse_num_events_received_is_assigned_from_json()
{
    bourne::json input =
    {
        "num_events_received", 1
    };

    ConversionApiResponse obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getNumEventsReceived());








}




void test_ConversionApiResponse_num_events_processed_is_converted_to_json()
{
    bourne::json input =
    {
        "num_events_processed", 1
    };

    ConversionApiResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["num_events_processed"] == output["num_events_processed"]);




}


void test_ConversionApiResponse_num_events_received_is_converted_to_json()
{
    bourne::json input =
    {
        "num_events_received", 1
    };

    ConversionApiResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["num_events_received"] == output["num_events_received"]);




}


