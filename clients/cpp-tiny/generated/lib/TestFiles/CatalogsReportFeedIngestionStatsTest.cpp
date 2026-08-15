
#include "CatalogsReportFeedIngestionStats.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CatalogsReportFeedIngestionStats_catalog_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "catalog_id", "hello"
    };

    CatalogsReportFeedIngestionStats obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCatalogId().c_str());






}


void test_CatalogsReportFeedIngestionStats_code_is_assigned_from_json()
{
    bourne::json input =
    {
        "code", 1
    };

    CatalogsReportFeedIngestionStats obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCode());








}


void test_CatalogsReportFeedIngestionStats_code_label_is_assigned_from_json()
{


    bourne::json input =
    {
        "code_label", "hello"
    };

    CatalogsReportFeedIngestionStats obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCodeLabel().c_str());






}


void test_CatalogsReportFeedIngestionStats_message_is_assigned_from_json()
{


    bourne::json input =
    {
        "message", "hello"
    };

    CatalogsReportFeedIngestionStats obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMessage().c_str());






}


void test_CatalogsReportFeedIngestionStats_occurrences_is_assigned_from_json()
{
    bourne::json input =
    {
        "occurrences", 1
    };

    CatalogsReportFeedIngestionStats obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getOccurrences());








}


void test_CatalogsReportFeedIngestionStats_report_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "report_type", "hello"
    };

    CatalogsReportFeedIngestionStats obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getReportType().c_str());






}


void test_CatalogsReportFeedIngestionStats_severity_is_assigned_from_json()
{


    bourne::json input =
    {
        "severity", "hello"
    };

    CatalogsReportFeedIngestionStats obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSeverity().c_str());






}



void test_CatalogsReportFeedIngestionStats_catalog_id_is_converted_to_json()
{

    bourne::json input =
    {
        "catalog_id", "hello"
    };

    CatalogsReportFeedIngestionStats obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["catalog_id"] == output["catalog_id"]);



}


void test_CatalogsReportFeedIngestionStats_code_is_converted_to_json()
{
    bourne::json input =
    {
        "code", 1
    };

    CatalogsReportFeedIngestionStats obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["code"] == output["code"]);




}


void test_CatalogsReportFeedIngestionStats_code_label_is_converted_to_json()
{

    bourne::json input =
    {
        "code_label", "hello"
    };

    CatalogsReportFeedIngestionStats obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["code_label"] == output["code_label"]);



}


void test_CatalogsReportFeedIngestionStats_message_is_converted_to_json()
{

    bourne::json input =
    {
        "message", "hello"
    };

    CatalogsReportFeedIngestionStats obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["message"] == output["message"]);



}


void test_CatalogsReportFeedIngestionStats_occurrences_is_converted_to_json()
{
    bourne::json input =
    {
        "occurrences", 1
    };

    CatalogsReportFeedIngestionStats obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["occurrences"] == output["occurrences"]);




}


void test_CatalogsReportFeedIngestionStats_report_type_is_converted_to_json()
{

    bourne::json input =
    {
        "report_type", "hello"
    };

    CatalogsReportFeedIngestionStats obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["report_type"] == output["report_type"]);



}


void test_CatalogsReportFeedIngestionStats_severity_is_converted_to_json()
{

    bourne::json input =
    {
        "severity", "hello"
    };

    CatalogsReportFeedIngestionStats obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["severity"] == output["severity"]);



}


