
#include "IntegrationLogsInvalidLogResponse_rejected_logs_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_IntegrationLogsInvalidLogResponse_rejected_logs_inner_field_is_assigned_from_json()
{


    bourne::json input =
    {
        "field", "hello"
    };

    IntegrationLogsInvalidLogResponse_rejected_logs_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getField().c_str());






}


void test_IntegrationLogsInvalidLogResponse_rejected_logs_inner_log_index_is_assigned_from_json()
{
    bourne::json input =
    {
        "log_index", 1
    };

    IntegrationLogsInvalidLogResponse_rejected_logs_inner obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getLogIndex());








}


void test_IntegrationLogsInvalidLogResponse_rejected_logs_inner_reason_is_assigned_from_json()
{


    bourne::json input =
    {
        "reason", "hello"
    };

    IntegrationLogsInvalidLogResponse_rejected_logs_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getReason().c_str());






}


void test_IntegrationLogsInvalidLogResponse_rejected_logs_inner_value_is_assigned_from_json()
{


    bourne::json input =
    {
        "value", "hello"
    };

    IntegrationLogsInvalidLogResponse_rejected_logs_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getValue().c_str());






}



void test_IntegrationLogsInvalidLogResponse_rejected_logs_inner_field_is_converted_to_json()
{

    bourne::json input =
    {
        "field", "hello"
    };

    IntegrationLogsInvalidLogResponse_rejected_logs_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["field"] == output["field"]);



}


void test_IntegrationLogsInvalidLogResponse_rejected_logs_inner_log_index_is_converted_to_json()
{
    bourne::json input =
    {
        "log_index", 1
    };

    IntegrationLogsInvalidLogResponse_rejected_logs_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["log_index"] == output["log_index"]);




}


void test_IntegrationLogsInvalidLogResponse_rejected_logs_inner_reason_is_converted_to_json()
{

    bourne::json input =
    {
        "reason", "hello"
    };

    IntegrationLogsInvalidLogResponse_rejected_logs_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["reason"] == output["reason"]);



}


void test_IntegrationLogsInvalidLogResponse_rejected_logs_inner_value_is_converted_to_json()
{

    bourne::json input =
    {
        "value", "hello"
    };

    IntegrationLogsInvalidLogResponse_rejected_logs_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["value"] == output["value"]);



}


