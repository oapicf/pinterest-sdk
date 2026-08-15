
#include "AppTypeMultipliers.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_AppTypeMultipliers_aPP_TYPE_is_assigned_from_json()
{


    bourne::json input =
    {
        "aPP_TYPE", "hello"
    };

    AppTypeMultipliers obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAPPTYPE().c_str());






}



void test_AppTypeMultipliers_aPP_TYPE_is_converted_to_json()
{

    bourne::json input =
    {
        "aPP_TYPE", "hello"
    };

    AppTypeMultipliers obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aPP_TYPE"] == output["aPP_TYPE"]);



}


