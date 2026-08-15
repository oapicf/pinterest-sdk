
#include "QualityComponentIssue.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_QualityComponentIssue_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    QualityComponentIssue obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_QualityComponentIssue_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    QualityComponentIssue obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_QualityComponentIssue_reason_is_assigned_from_json()
{


    bourne::json input =
    {
        "reason", "hello"
    };

    QualityComponentIssue obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getReason().c_str());






}



void test_QualityComponentIssue_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    QualityComponentIssue obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_QualityComponentIssue_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    QualityComponentIssue obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_QualityComponentIssue_reason_is_converted_to_json()
{

    bourne::json input =
    {
        "reason", "hello"
    };

    QualityComponentIssue obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["reason"] == output["reason"]);



}


