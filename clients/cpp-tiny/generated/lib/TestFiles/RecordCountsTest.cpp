
#include "RecordCounts.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_RecordCounts_invalid_is_assigned_from_json()
{
    bourne::json input =
    {
        "invalid", 1
    };

    RecordCounts obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getInvalid());








}


void test_RecordCounts_processed_is_assigned_from_json()
{
    bourne::json input =
    {
        "processed", 1
    };

    RecordCounts obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getProcessed());








}


void test_RecordCounts_valid_is_assigned_from_json()
{
    bourne::json input =
    {
        "valid", 1
    };

    RecordCounts obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getValid());








}



void test_RecordCounts_invalid_is_converted_to_json()
{
    bourne::json input =
    {
        "invalid", 1
    };

    RecordCounts obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["invalid"] == output["invalid"]);




}


void test_RecordCounts_processed_is_converted_to_json()
{
    bourne::json input =
    {
        "processed", 1
    };

    RecordCounts obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["processed"] == output["processed"]);




}


void test_RecordCounts_valid_is_converted_to_json()
{
    bourne::json input =
    {
        "valid", 1
    };

    RecordCounts obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["valid"] == output["valid"]);




}


