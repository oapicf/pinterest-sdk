
#include "IntegrationLogClientRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_IntegrationLogClientRequest_host_is_assigned_from_json()
{


    bourne::json input =
    {
        "host", "hello"
    };

    IntegrationLogClientRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getHost().c_str());






}


void test_IntegrationLogClientRequest_method_is_assigned_from_json()
{


    bourne::json input =
    {
        "method", "hello"
    };

    IntegrationLogClientRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMethod().c_str());






}


void test_IntegrationLogClientRequest_path_is_assigned_from_json()
{


    bourne::json input =
    {
        "path", "hello"
    };

    IntegrationLogClientRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPath().c_str());






}


void test_IntegrationLogClientRequest_request_headers_is_assigned_from_json()
{








}


void test_IntegrationLogClientRequest_response_headers_is_assigned_from_json()
{








}


void test_IntegrationLogClientRequest_response_status_code_is_assigned_from_json()
{
    bourne::json input =
    {
        "response_status_code", 1
    };

    IntegrationLogClientRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getResponseStatusCode());








}



void test_IntegrationLogClientRequest_host_is_converted_to_json()
{

    bourne::json input =
    {
        "host", "hello"
    };

    IntegrationLogClientRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["host"] == output["host"]);



}


void test_IntegrationLogClientRequest_method_is_converted_to_json()
{

    bourne::json input =
    {
        "method", "hello"
    };

    IntegrationLogClientRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["method"] == output["method"]);



}


void test_IntegrationLogClientRequest_path_is_converted_to_json()
{

    bourne::json input =
    {
        "path", "hello"
    };

    IntegrationLogClientRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["path"] == output["path"]);



}


void test_IntegrationLogClientRequest_request_headers_is_converted_to_json()
{




}


void test_IntegrationLogClientRequest_response_headers_is_converted_to_json()
{




}


void test_IntegrationLogClientRequest_response_status_code_is_converted_to_json()
{
    bourne::json input =
    {
        "response_status_code", 1
    };

    IntegrationLogClientRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["response_status_code"] == output["response_status_code"]);




}


