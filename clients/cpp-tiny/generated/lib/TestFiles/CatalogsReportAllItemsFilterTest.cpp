
#include "CatalogsReportAllItemsFilter.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CatalogsReportAllItemsFilter_catalog_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "catalog_id", "hello"
    };

    CatalogsReportAllItemsFilter obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCatalogId().c_str());






}


void test_CatalogsReportAllItemsFilter_report_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "report_type", "hello"
    };

    CatalogsReportAllItemsFilter obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getReportType().c_str());






}



void test_CatalogsReportAllItemsFilter_catalog_id_is_converted_to_json()
{

    bourne::json input =
    {
        "catalog_id", "hello"
    };

    CatalogsReportAllItemsFilter obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["catalog_id"] == output["catalog_id"]);



}


void test_CatalogsReportAllItemsFilter_report_type_is_converted_to_json()
{

    bourne::json input =
    {
        "report_type", "hello"
    };

    CatalogsReportAllItemsFilter obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["report_type"] == output["report_type"]);



}


