
#include "TargetingTemplateUpdateRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_TargetingTemplateUpdateRequest_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    TargetingTemplateUpdateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_TargetingTemplateUpdateRequest_operation_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "operation_type", "hello"
    };

    TargetingTemplateUpdateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOperationType().c_str());






}




void test_TargetingTemplateUpdateRequest_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    TargetingTemplateUpdateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_TargetingTemplateUpdateRequest_operation_type_is_converted_to_json()
{

    bourne::json input =
    {
        "operation_type", "hello"
    };

    TargetingTemplateUpdateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["operation_type"] == output["operation_type"]);



}



