
#include "IntegrationLogClientError.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_IntegrationLogClientError_cause_is_assigned_from_json()
{


    bourne::json input =
    {
        "cause", "hello"
    };

    IntegrationLogClientError obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCause().c_str());






}


void test_IntegrationLogClientError_column_number_is_assigned_from_json()
{
    bourne::json input =
    {
        "column_number", 1
    };

    IntegrationLogClientError obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getColumnNumber());








}


void test_IntegrationLogClientError_file_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "file_name", "hello"
    };

    IntegrationLogClientError obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFileName().c_str());






}


void test_IntegrationLogClientError_line_number_is_assigned_from_json()
{
    bourne::json input =
    {
        "line_number", 1
    };

    IntegrationLogClientError obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getLineNumber());








}


void test_IntegrationLogClientError_message_is_assigned_from_json()
{


    bourne::json input =
    {
        "message", "hello"
    };

    IntegrationLogClientError obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMessage().c_str());






}


void test_IntegrationLogClientError_message_detail_is_assigned_from_json()
{


    bourne::json input =
    {
        "message_detail", "hello"
    };

    IntegrationLogClientError obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMessageDetail().c_str());






}


void test_IntegrationLogClientError_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    IntegrationLogClientError obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_IntegrationLogClientError_number_is_assigned_from_json()
{
    bourne::json input =
    {
        "number", 1
    };

    IntegrationLogClientError obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getNumber());








}


void test_IntegrationLogClientError_stack_trace_is_assigned_from_json()
{


    bourne::json input =
    {
        "stack_trace", "hello"
    };

    IntegrationLogClientError obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getStackTrace().c_str());






}



void test_IntegrationLogClientError_cause_is_converted_to_json()
{

    bourne::json input =
    {
        "cause", "hello"
    };

    IntegrationLogClientError obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["cause"] == output["cause"]);



}


void test_IntegrationLogClientError_column_number_is_converted_to_json()
{
    bourne::json input =
    {
        "column_number", 1
    };

    IntegrationLogClientError obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["column_number"] == output["column_number"]);




}


void test_IntegrationLogClientError_file_name_is_converted_to_json()
{

    bourne::json input =
    {
        "file_name", "hello"
    };

    IntegrationLogClientError obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["file_name"] == output["file_name"]);



}


void test_IntegrationLogClientError_line_number_is_converted_to_json()
{
    bourne::json input =
    {
        "line_number", 1
    };

    IntegrationLogClientError obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["line_number"] == output["line_number"]);




}


void test_IntegrationLogClientError_message_is_converted_to_json()
{

    bourne::json input =
    {
        "message", "hello"
    };

    IntegrationLogClientError obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["message"] == output["message"]);



}


void test_IntegrationLogClientError_message_detail_is_converted_to_json()
{

    bourne::json input =
    {
        "message_detail", "hello"
    };

    IntegrationLogClientError obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["message_detail"] == output["message_detail"]);



}


void test_IntegrationLogClientError_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    IntegrationLogClientError obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_IntegrationLogClientError_number_is_converted_to_json()
{
    bourne::json input =
    {
        "number", 1
    };

    IntegrationLogClientError obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["number"] == output["number"]);




}


void test_IntegrationLogClientError_stack_trace_is_converted_to_json()
{

    bourne::json input =
    {
        "stack_trace", "hello"
    };

    IntegrationLogClientError obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["stack_trace"] == output["stack_trace"]);



}


