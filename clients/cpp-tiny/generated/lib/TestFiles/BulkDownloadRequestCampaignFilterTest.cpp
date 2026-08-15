
#include "BulkDownloadRequest_campaign_filter.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_BulkDownloadRequest_campaign_filter_end_time_is_assigned_from_json()
{


    bourne::json input =
    {
        "end_time", "hello"
    };

    BulkDownloadRequest_campaign_filter obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEndTime().c_str());






}


void test_BulkDownloadRequest_campaign_filter_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    BulkDownloadRequest_campaign_filter obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}



void test_BulkDownloadRequest_campaign_filter_start_time_is_assigned_from_json()
{


    bourne::json input =
    {
        "start_time", "hello"
    };

    BulkDownloadRequest_campaign_filter obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getStartTime().c_str());






}




void test_BulkDownloadRequest_campaign_filter_end_time_is_converted_to_json()
{

    bourne::json input =
    {
        "end_time", "hello"
    };

    BulkDownloadRequest_campaign_filter obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["end_time"] == output["end_time"]);



}


void test_BulkDownloadRequest_campaign_filter_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    BulkDownloadRequest_campaign_filter obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}



void test_BulkDownloadRequest_campaign_filter_start_time_is_converted_to_json()
{

    bourne::json input =
    {
        "start_time", "hello"
    };

    BulkDownloadRequest_campaign_filter obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["start_time"] == output["start_time"]);



}


