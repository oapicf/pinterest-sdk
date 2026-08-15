
#include "TargetingSpec.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"












void test_TargetingSpec_mAXIMUM_AGE_is_assigned_from_json()
{


    bourne::json input =
    {
        "mAXIMUM_AGE", "hello"
    };

    TargetingSpec obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMAXIMUMAGE().c_str());






}


void test_TargetingSpec_mINIMUM_AGE_is_assigned_from_json()
{


    bourne::json input =
    {
        "mINIMUM_AGE", "hello"
    };

    TargetingSpec obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMINIMUMAGE().c_str());






}














void test_TargetingSpec_mAXIMUM_AGE_is_converted_to_json()
{

    bourne::json input =
    {
        "mAXIMUM_AGE", "hello"
    };

    TargetingSpec obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["mAXIMUM_AGE"] == output["mAXIMUM_AGE"]);



}


void test_TargetingSpec_mINIMUM_AGE_is_converted_to_json()
{

    bourne::json input =
    {
        "mINIMUM_AGE", "hello"
    };

    TargetingSpec obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["mINIMUM_AGE"] == output["mINIMUM_AGE"]);



}




