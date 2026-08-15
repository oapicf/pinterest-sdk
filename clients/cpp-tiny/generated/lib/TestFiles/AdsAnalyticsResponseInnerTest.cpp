
#include "AdsAnalyticsResponse_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_AdsAnalyticsResponse_inner_aD_ID_is_assigned_from_json()
{


    bourne::json input =
    {
        "aD_ID", "hello"
    };

    AdsAnalyticsResponse_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getADID().c_str());






}




void test_AdsAnalyticsResponse_inner_aD_ID_is_converted_to_json()
{

    bourne::json input =
    {
        "aD_ID", "hello"
    };

    AdsAnalyticsResponse_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aD_ID"] == output["aD_ID"]);



}



