
#include "AdsAnalyticsCreateAsyncRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"






void test_AdsAnalyticsCreateAsyncRequest_end_date_is_assigned_from_json()
{


    bourne::json input =
    {
        "end_date", "hello"
    };

    AdsAnalyticsCreateAsyncRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEndDate().c_str());






}




void test_AdsAnalyticsCreateAsyncRequest_start_date_is_assigned_from_json()
{


    bourne::json input =
    {
        "start_date", "hello"
    };

    AdsAnalyticsCreateAsyncRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getStartDate().c_str());






}






void test_AdsAnalyticsCreateAsyncRequest_campaign_brand_label_is_assigned_from_json()
{


    bourne::json input =
    {
        "campaign_brand_label", "hello"
    };

    AdsAnalyticsCreateAsyncRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCampaignBrandLabel().c_str());






}












void test_AdsAnalyticsCreateAsyncRequest_combine_targeting_types_is_assigned_from_json()
{




    bourne::json input =
    {
        "combine_targeting_types", true
    };

    AdsAnalyticsCreateAsyncRequest obj(input.dump());

    TEST_ASSERT(true == obj.isCombineTargetingTypes());




}



void test_AdsAnalyticsCreateAsyncRequest_end_hour_is_assigned_from_json()
{
    bourne::json input =
    {
        "end_hour", 1
    };

    AdsAnalyticsCreateAsyncRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getEndHour());








}



void test_AdsAnalyticsCreateAsyncRequest_primary_sort_is_assigned_from_json()
{


    bourne::json input =
    {
        "primary_sort", "hello"
    };

    AdsAnalyticsCreateAsyncRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPrimarySort().c_str());






}




void test_AdsAnalyticsCreateAsyncRequest_start_hour_is_assigned_from_json()
{
    bourne::json input =
    {
        "start_hour", 1
    };

    AdsAnalyticsCreateAsyncRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getStartHour());








}






void test_AdsAnalyticsCreateAsyncRequest_end_date_is_converted_to_json()
{

    bourne::json input =
    {
        "end_date", "hello"
    };

    AdsAnalyticsCreateAsyncRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["end_date"] == output["end_date"]);



}




void test_AdsAnalyticsCreateAsyncRequest_start_date_is_converted_to_json()
{

    bourne::json input =
    {
        "start_date", "hello"
    };

    AdsAnalyticsCreateAsyncRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["start_date"] == output["start_date"]);



}






void test_AdsAnalyticsCreateAsyncRequest_campaign_brand_label_is_converted_to_json()
{

    bourne::json input =
    {
        "campaign_brand_label", "hello"
    };

    AdsAnalyticsCreateAsyncRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["campaign_brand_label"] == output["campaign_brand_label"]);



}












void test_AdsAnalyticsCreateAsyncRequest_combine_targeting_types_is_converted_to_json()
{


    bourne::json input =
    {
        "combine_targeting_types", true
    };

    AdsAnalyticsCreateAsyncRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["combine_targeting_types"] == output["combine_targeting_types"]);


}



void test_AdsAnalyticsCreateAsyncRequest_end_hour_is_converted_to_json()
{
    bourne::json input =
    {
        "end_hour", 1
    };

    AdsAnalyticsCreateAsyncRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["end_hour"] == output["end_hour"]);




}



void test_AdsAnalyticsCreateAsyncRequest_primary_sort_is_converted_to_json()
{

    bourne::json input =
    {
        "primary_sort", "hello"
    };

    AdsAnalyticsCreateAsyncRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["primary_sort"] == output["primary_sort"]);



}




void test_AdsAnalyticsCreateAsyncRequest_start_hour_is_converted_to_json()
{
    bourne::json input =
    {
        "start_hour", 1
    };

    AdsAnalyticsCreateAsyncRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["start_hour"] == output["start_hour"]);




}


