
#include "ConversionProductReportRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"








void test_ConversionProductReportRequest_conversion_product_attribution_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "conversion_product_attribution_type", "hello"
    };

    ConversionProductReportRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getConversionProductAttributionType().c_str());






}


void test_ConversionProductReportRequest_conversion_product_breakdown_is_assigned_from_json()
{


    bourne::json input =
    {
        "conversion_product_breakdown", "hello"
    };

    ConversionProductReportRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getConversionProductBreakdown().c_str());






}



void test_ConversionProductReportRequest_end_date_is_assigned_from_json()
{


    bourne::json input =
    {
        "end_date", "hello"
    };

    ConversionProductReportRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEndDate().c_str());






}


void test_ConversionProductReportRequest_granularity_is_assigned_from_json()
{


    bourne::json input =
    {
        "granularity", "hello"
    };

    ConversionProductReportRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getGranularity().c_str());






}


void test_ConversionProductReportRequest_level_is_assigned_from_json()
{


    bourne::json input =
    {
        "level", "hello"
    };

    ConversionProductReportRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLevel().c_str());






}



void test_ConversionProductReportRequest_report_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "report_name", "hello"
    };

    ConversionProductReportRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getReportName().c_str());






}


void test_ConversionProductReportRequest_start_date_is_assigned_from_json()
{


    bourne::json input =
    {
        "start_date", "hello"
    };

    ConversionProductReportRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getStartDate().c_str());






}









void test_ConversionProductReportRequest_conversion_product_attribution_type_is_converted_to_json()
{

    bourne::json input =
    {
        "conversion_product_attribution_type", "hello"
    };

    ConversionProductReportRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["conversion_product_attribution_type"] == output["conversion_product_attribution_type"]);



}


void test_ConversionProductReportRequest_conversion_product_breakdown_is_converted_to_json()
{

    bourne::json input =
    {
        "conversion_product_breakdown", "hello"
    };

    ConversionProductReportRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["conversion_product_breakdown"] == output["conversion_product_breakdown"]);



}



void test_ConversionProductReportRequest_end_date_is_converted_to_json()
{

    bourne::json input =
    {
        "end_date", "hello"
    };

    ConversionProductReportRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["end_date"] == output["end_date"]);



}


void test_ConversionProductReportRequest_granularity_is_converted_to_json()
{

    bourne::json input =
    {
        "granularity", "hello"
    };

    ConversionProductReportRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["granularity"] == output["granularity"]);



}


void test_ConversionProductReportRequest_level_is_converted_to_json()
{

    bourne::json input =
    {
        "level", "hello"
    };

    ConversionProductReportRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["level"] == output["level"]);



}



void test_ConversionProductReportRequest_report_name_is_converted_to_json()
{

    bourne::json input =
    {
        "report_name", "hello"
    };

    ConversionProductReportRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["report_name"] == output["report_name"]);



}


void test_ConversionProductReportRequest_start_date_is_converted_to_json()
{

    bourne::json input =
    {
        "start_date", "hello"
    };

    ConversionProductReportRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["start_date"] == output["start_date"]);



}



