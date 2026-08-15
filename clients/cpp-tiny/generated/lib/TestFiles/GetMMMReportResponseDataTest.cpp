
#include "GetMMMReportResponseData.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_GetMMMReportResponseData_report_status_is_assigned_from_json()
{


    bourne::json input =
    {
        "report_status", "hello"
    };

    GetMMMReportResponseData obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getReportStatus().c_str());






}


void test_GetMMMReportResponseData_size_is_assigned_from_json()
{








}


void test_GetMMMReportResponseData_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "url", "hello"
    };

    GetMMMReportResponseData obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUrl().c_str());






}



void test_GetMMMReportResponseData_report_status_is_converted_to_json()
{

    bourne::json input =
    {
        "report_status", "hello"
    };

    GetMMMReportResponseData obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["report_status"] == output["report_status"]);



}


void test_GetMMMReportResponseData_size_is_converted_to_json()
{




}


void test_GetMMMReportResponseData_url_is_converted_to_json()
{

    bourne::json input =
    {
        "url", "hello"
    };

    GetMMMReportResponseData obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["url"] == output["url"]);



}


