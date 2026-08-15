
#include "CatalogsReportDistributionStats.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CatalogsReportDistributionStats_catalog_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "catalog_id", "hello"
    };

    CatalogsReportDistributionStats obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCatalogId().c_str());






}


void test_CatalogsReportDistributionStats_code_is_assigned_from_json()
{
    bourne::json input =
    {
        "code", 1
    };

    CatalogsReportDistributionStats obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCode());








}


void test_CatalogsReportDistributionStats_code_label_is_assigned_from_json()
{


    bourne::json input =
    {
        "code_label", "hello"
    };

    CatalogsReportDistributionStats obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCodeLabel().c_str());






}


void test_CatalogsReportDistributionStats_ineligible_for_ads_is_assigned_from_json()
{




    bourne::json input =
    {
        "ineligible_for_ads", true
    };

    CatalogsReportDistributionStats obj(input.dump());

    TEST_ASSERT(true == obj.isIneligibleForAds());




}


void test_CatalogsReportDistributionStats_ineligible_for_organic_is_assigned_from_json()
{




    bourne::json input =
    {
        "ineligible_for_organic", true
    };

    CatalogsReportDistributionStats obj(input.dump());

    TEST_ASSERT(true == obj.isIneligibleForOrganic());




}


void test_CatalogsReportDistributionStats_message_is_assigned_from_json()
{


    bourne::json input =
    {
        "message", "hello"
    };

    CatalogsReportDistributionStats obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMessage().c_str());






}


void test_CatalogsReportDistributionStats_occurrences_is_assigned_from_json()
{
    bourne::json input =
    {
        "occurrences", 1
    };

    CatalogsReportDistributionStats obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getOccurrences());








}


void test_CatalogsReportDistributionStats_report_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "report_type", "hello"
    };

    CatalogsReportDistributionStats obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getReportType().c_str());






}



void test_CatalogsReportDistributionStats_catalog_id_is_converted_to_json()
{

    bourne::json input =
    {
        "catalog_id", "hello"
    };

    CatalogsReportDistributionStats obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["catalog_id"] == output["catalog_id"]);



}


void test_CatalogsReportDistributionStats_code_is_converted_to_json()
{
    bourne::json input =
    {
        "code", 1
    };

    CatalogsReportDistributionStats obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["code"] == output["code"]);




}


void test_CatalogsReportDistributionStats_code_label_is_converted_to_json()
{

    bourne::json input =
    {
        "code_label", "hello"
    };

    CatalogsReportDistributionStats obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["code_label"] == output["code_label"]);



}


void test_CatalogsReportDistributionStats_ineligible_for_ads_is_converted_to_json()
{


    bourne::json input =
    {
        "ineligible_for_ads", true
    };

    CatalogsReportDistributionStats obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["ineligible_for_ads"] == output["ineligible_for_ads"]);


}


void test_CatalogsReportDistributionStats_ineligible_for_organic_is_converted_to_json()
{


    bourne::json input =
    {
        "ineligible_for_organic", true
    };

    CatalogsReportDistributionStats obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["ineligible_for_organic"] == output["ineligible_for_organic"]);


}


void test_CatalogsReportDistributionStats_message_is_converted_to_json()
{

    bourne::json input =
    {
        "message", "hello"
    };

    CatalogsReportDistributionStats obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["message"] == output["message"]);



}


void test_CatalogsReportDistributionStats_occurrences_is_converted_to_json()
{
    bourne::json input =
    {
        "occurrences", 1
    };

    CatalogsReportDistributionStats obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["occurrences"] == output["occurrences"]);




}


void test_CatalogsReportDistributionStats_report_type_is_converted_to_json()
{

    bourne::json input =
    {
        "report_type", "hello"
    };

    CatalogsReportDistributionStats obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["report_type"] == output["report_type"]);



}


