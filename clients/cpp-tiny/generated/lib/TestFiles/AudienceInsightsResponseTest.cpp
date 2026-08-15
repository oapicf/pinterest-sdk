
#include "AudienceInsightsResponse.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_AudienceInsightsResponse_date_is_assigned_from_json()
{


    bourne::json input =
    {
        "date", "hello"
    };

    AudienceInsightsResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDate().c_str());






}



void test_AudienceInsightsResponse_size_is_assigned_from_json()
{
    bourne::json input =
    {
        "size", 1
    };

    AudienceInsightsResponse obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getSize());








}


void test_AudienceInsightsResponse_size_is_upper_bound_is_assigned_from_json()
{




    bourne::json input =
    {
        "size_is_upper_bound", true
    };

    AudienceInsightsResponse obj(input.dump());

    TEST_ASSERT(true == obj.isSizeIsUpperBound());




}





void test_AudienceInsightsResponse_date_is_converted_to_json()
{

    bourne::json input =
    {
        "date", "hello"
    };

    AudienceInsightsResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["date"] == output["date"]);



}



void test_AudienceInsightsResponse_size_is_converted_to_json()
{
    bourne::json input =
    {
        "size", 1
    };

    AudienceInsightsResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["size"] == output["size"]);




}


void test_AudienceInsightsResponse_size_is_upper_bound_is_converted_to_json()
{


    bourne::json input =
    {
        "size_is_upper_bound", true
    };

    AudienceInsightsResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["size_is_upper_bound"] == output["size_is_upper_bound"]);


}



