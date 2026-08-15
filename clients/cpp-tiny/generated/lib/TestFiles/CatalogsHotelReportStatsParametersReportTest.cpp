
#include "CatalogsHotelReportStatsParameters_report.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CatalogsHotelReportStatsParameters_report_report_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "report_type", "hello"
    };

    CatalogsHotelReportStatsParameters_report obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getReportType().c_str());






}


void test_CatalogsHotelReportStatsParameters_report_feed_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "feed_id", "hello"
    };

    CatalogsHotelReportStatsParameters_report obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFeedId().c_str());






}


void test_CatalogsHotelReportStatsParameters_report_processing_result_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "processing_result_id", "hello"
    };

    CatalogsHotelReportStatsParameters_report obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getProcessingResultId().c_str());






}


void test_CatalogsHotelReportStatsParameters_report_catalog_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "catalog_id", "hello"
    };

    CatalogsHotelReportStatsParameters_report obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCatalogId().c_str());






}



void test_CatalogsHotelReportStatsParameters_report_report_type_is_converted_to_json()
{

    bourne::json input =
    {
        "report_type", "hello"
    };

    CatalogsHotelReportStatsParameters_report obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["report_type"] == output["report_type"]);



}


void test_CatalogsHotelReportStatsParameters_report_feed_id_is_converted_to_json()
{

    bourne::json input =
    {
        "feed_id", "hello"
    };

    CatalogsHotelReportStatsParameters_report obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["feed_id"] == output["feed_id"]);



}


void test_CatalogsHotelReportStatsParameters_report_processing_result_id_is_converted_to_json()
{

    bourne::json input =
    {
        "processing_result_id", "hello"
    };

    CatalogsHotelReportStatsParameters_report obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["processing_result_id"] == output["processing_result_id"]);



}


void test_CatalogsHotelReportStatsParameters_report_catalog_id_is_converted_to_json()
{

    bourne::json input =
    {
        "catalog_id", "hello"
    };

    CatalogsHotelReportStatsParameters_report obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["catalog_id"] == output["catalog_id"]);



}


