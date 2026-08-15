
#include "LabelUpdateRequest_labels_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_LabelUpdateRequest_labels_inner_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    LabelUpdateRequest_labels_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}



void test_LabelUpdateRequest_labels_inner_value_is_assigned_from_json()
{


    bourne::json input =
    {
        "value", "hello"
    };

    LabelUpdateRequest_labels_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getValue().c_str());






}



void test_LabelUpdateRequest_labels_inner_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    LabelUpdateRequest_labels_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}



void test_LabelUpdateRequest_labels_inner_value_is_converted_to_json()
{

    bourne::json input =
    {
        "value", "hello"
    };

    LabelUpdateRequest_labels_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["value"] == output["value"]);



}


