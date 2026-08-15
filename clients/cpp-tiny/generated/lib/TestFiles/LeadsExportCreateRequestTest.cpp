
#include "LeadsExportCreateRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_LeadsExportCreateRequest_ad_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "ad_id", "hello"
    };

    LeadsExportCreateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAdId().c_str());






}


void test_LeadsExportCreateRequest_end_date_is_assigned_from_json()
{


    bourne::json input =
    {
        "end_date", "hello"
    };

    LeadsExportCreateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEndDate().c_str());






}


void test_LeadsExportCreateRequest_start_date_is_assigned_from_json()
{


    bourne::json input =
    {
        "start_date", "hello"
    };

    LeadsExportCreateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getStartDate().c_str());






}



void test_LeadsExportCreateRequest_ad_id_is_converted_to_json()
{

    bourne::json input =
    {
        "ad_id", "hello"
    };

    LeadsExportCreateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["ad_id"] == output["ad_id"]);



}


void test_LeadsExportCreateRequest_end_date_is_converted_to_json()
{

    bourne::json input =
    {
        "end_date", "hello"
    };

    LeadsExportCreateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["end_date"] == output["end_date"]);



}


void test_LeadsExportCreateRequest_start_date_is_converted_to_json()
{

    bourne::json input =
    {
        "start_date", "hello"
    };

    LeadsExportCreateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["start_date"] == output["start_date"]);



}


