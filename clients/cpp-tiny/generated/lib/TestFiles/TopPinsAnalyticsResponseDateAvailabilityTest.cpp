
#include "TopPinsAnalyticsResponse_date_availability.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_TopPinsAnalyticsResponse_date_availability_is_realtime_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_realtime", true
    };

    TopPinsAnalyticsResponse_date_availability obj(input.dump());

    TEST_ASSERT(true == obj.isIsRealtime());




}


void test_TopPinsAnalyticsResponse_date_availability_latest_available_timestamp_is_assigned_from_json()
{








}



void test_TopPinsAnalyticsResponse_date_availability_is_realtime_is_converted_to_json()
{


    bourne::json input =
    {
        "is_realtime", true
    };

    TopPinsAnalyticsResponse_date_availability obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_realtime"] == output["is_realtime"]);


}


void test_TopPinsAnalyticsResponse_date_availability_latest_available_timestamp_is_converted_to_json()
{




}


