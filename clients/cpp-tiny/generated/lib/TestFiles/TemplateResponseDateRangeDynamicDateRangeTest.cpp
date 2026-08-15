
#include "TemplateResponse_date_range_dynamic_date_range.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_TemplateResponse_date_range_dynamic_date_range_range_is_assigned_from_json()
{


    bourne::json input =
    {
        "range", "hello"
    };

    TemplateResponse_date_range_dynamic_date_range obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRange().c_str());






}


void test_TemplateResponse_date_range_dynamic_date_range_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    TemplateResponse_date_range_dynamic_date_range obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}



void test_TemplateResponse_date_range_dynamic_date_range_range_is_converted_to_json()
{

    bourne::json input =
    {
        "range", "hello"
    };

    TemplateResponse_date_range_dynamic_date_range obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["range"] == output["range"]);



}


void test_TemplateResponse_date_range_dynamic_date_range_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    TemplateResponse_date_range_dynamic_date_range obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}


