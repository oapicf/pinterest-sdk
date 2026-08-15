
#include "CatalogsReportFeedIngestionFilter.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CatalogsReportFeedIngestionFilter_feed_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "feed_id", "hello"
    };

    CatalogsReportFeedIngestionFilter obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFeedId().c_str());






}


void test_CatalogsReportFeedIngestionFilter_processing_result_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "processing_result_id", "hello"
    };

    CatalogsReportFeedIngestionFilter obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getProcessingResultId().c_str());






}


void test_CatalogsReportFeedIngestionFilter_report_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "report_type", "hello"
    };

    CatalogsReportFeedIngestionFilter obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getReportType().c_str());






}



void test_CatalogsReportFeedIngestionFilter_feed_id_is_converted_to_json()
{

    bourne::json input =
    {
        "feed_id", "hello"
    };

    CatalogsReportFeedIngestionFilter obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["feed_id"] == output["feed_id"]);



}


void test_CatalogsReportFeedIngestionFilter_processing_result_id_is_converted_to_json()
{

    bourne::json input =
    {
        "processing_result_id", "hello"
    };

    CatalogsReportFeedIngestionFilter obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["processing_result_id"] == output["processing_result_id"]);



}


void test_CatalogsReportFeedIngestionFilter_report_type_is_converted_to_json()
{

    bourne::json input =
    {
        "report_type", "hello"
    };

    CatalogsReportFeedIngestionFilter obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["report_type"] == output["report_type"]);



}


