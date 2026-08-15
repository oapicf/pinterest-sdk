
#include "TargetingSpecOperationGender.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_TargetingSpecOperationGender_field_is_assigned_from_json()
{


    bourne::json input =
    {
        "field", "hello"
    };

    TargetingSpecOperationGender obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getField().c_str());






}


void test_TargetingSpecOperationGender_operation_is_assigned_from_json()
{


    bourne::json input =
    {
        "operation", "hello"
    };

    TargetingSpecOperationGender obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOperation().c_str());






}




void test_TargetingSpecOperationGender_field_is_converted_to_json()
{

    bourne::json input =
    {
        "field", "hello"
    };

    TargetingSpecOperationGender obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["field"] == output["field"]);



}


void test_TargetingSpecOperationGender_operation_is_converted_to_json()
{

    bourne::json input =
    {
        "operation", "hello"
    };

    TargetingSpecOperationGender obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["operation"] == output["operation"]);



}



