
#include "CatalogsReportStats.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CatalogsReportStats_report_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "report_type", "hello"
    };

    CatalogsReportStats obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getReportType().c_str());






}


void test_CatalogsReportStats_catalog_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "catalog_id", "hello"
    };

    CatalogsReportStats obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCatalogId().c_str());






}


void test_CatalogsReportStats_code_is_assigned_from_json()
{
    bourne::json input =
    {
        "code", 1
    };

    CatalogsReportStats obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCode());








}


void test_CatalogsReportStats_code_label_is_assigned_from_json()
{


    bourne::json input =
    {
        "code_label", "hello"
    };

    CatalogsReportStats obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCodeLabel().c_str());






}


void test_CatalogsReportStats_message_is_assigned_from_json()
{


    bourne::json input =
    {
        "message", "hello"
    };

    CatalogsReportStats obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMessage().c_str());






}


void test_CatalogsReportStats_occurrences_is_assigned_from_json()
{
    bourne::json input =
    {
        "occurrences", 1
    };

    CatalogsReportStats obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getOccurrences());








}


void test_CatalogsReportStats_severity_is_assigned_from_json()
{


    bourne::json input =
    {
        "severity", "hello"
    };

    CatalogsReportStats obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSeverity().c_str());






}


void test_CatalogsReportStats_ineligible_for_ads_is_assigned_from_json()
{




    bourne::json input =
    {
        "ineligible_for_ads", true
    };

    CatalogsReportStats obj(input.dump());

    TEST_ASSERT(true == obj.isIneligibleForAds());




}


void test_CatalogsReportStats_ineligible_for_organic_is_assigned_from_json()
{




    bourne::json input =
    {
        "ineligible_for_organic", true
    };

    CatalogsReportStats obj(input.dump());

    TEST_ASSERT(true == obj.isIneligibleForOrganic());




}



void test_CatalogsReportStats_report_type_is_converted_to_json()
{

    bourne::json input =
    {
        "report_type", "hello"
    };

    CatalogsReportStats obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["report_type"] == output["report_type"]);



}


void test_CatalogsReportStats_catalog_id_is_converted_to_json()
{

    bourne::json input =
    {
        "catalog_id", "hello"
    };

    CatalogsReportStats obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["catalog_id"] == output["catalog_id"]);



}


void test_CatalogsReportStats_code_is_converted_to_json()
{
    bourne::json input =
    {
        "code", 1
    };

    CatalogsReportStats obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["code"] == output["code"]);




}


void test_CatalogsReportStats_code_label_is_converted_to_json()
{

    bourne::json input =
    {
        "code_label", "hello"
    };

    CatalogsReportStats obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["code_label"] == output["code_label"]);



}


void test_CatalogsReportStats_message_is_converted_to_json()
{

    bourne::json input =
    {
        "message", "hello"
    };

    CatalogsReportStats obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["message"] == output["message"]);



}


void test_CatalogsReportStats_occurrences_is_converted_to_json()
{
    bourne::json input =
    {
        "occurrences", 1
    };

    CatalogsReportStats obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["occurrences"] == output["occurrences"]);




}


void test_CatalogsReportStats_severity_is_converted_to_json()
{

    bourne::json input =
    {
        "severity", "hello"
    };

    CatalogsReportStats obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["severity"] == output["severity"]);



}


void test_CatalogsReportStats_ineligible_for_ads_is_converted_to_json()
{


    bourne::json input =
    {
        "ineligible_for_ads", true
    };

    CatalogsReportStats obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["ineligible_for_ads"] == output["ineligible_for_ads"]);


}


void test_CatalogsReportStats_ineligible_for_organic_is_converted_to_json()
{


    bourne::json input =
    {
        "ineligible_for_organic", true
    };

    CatalogsReportStats obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["ineligible_for_organic"] == output["ineligible_for_organic"]);


}


