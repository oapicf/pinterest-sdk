
#include "ConversionTagCommon.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ConversionTagCommon_code_snippet_is_assigned_from_json()
{


    bourne::json input =
    {
        "code_snippet", "hello"
    };

    ConversionTagCommon obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCodeSnippet().c_str());






}




void test_ConversionTagCommon_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    ConversionTagCommon obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_ConversionTagCommon_last_fired_time_ms_is_assigned_from_json()
{








}


void test_ConversionTagCommon_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    ConversionTagCommon obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_ConversionTagCommon_version_is_assigned_from_json()
{


    bourne::json input =
    {
        "version", "hello"
    };

    ConversionTagCommon obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getVersion().c_str());






}



void test_ConversionTagCommon_code_snippet_is_converted_to_json()
{

    bourne::json input =
    {
        "code_snippet", "hello"
    };

    ConversionTagCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["code_snippet"] == output["code_snippet"]);



}




void test_ConversionTagCommon_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    ConversionTagCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_ConversionTagCommon_last_fired_time_ms_is_converted_to_json()
{




}


void test_ConversionTagCommon_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    ConversionTagCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_ConversionTagCommon_version_is_converted_to_json()
{

    bourne::json input =
    {
        "version", "hello"
    };

    ConversionTagCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["version"] == output["version"]);



}


