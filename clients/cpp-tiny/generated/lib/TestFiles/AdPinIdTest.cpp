
#include "AdPinId.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_AdPinId_pin_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "pin_id", "hello"
    };

    AdPinId obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPinId().c_str());






}



void test_AdPinId_pin_id_is_converted_to_json()
{

    bourne::json input =
    {
        "pin_id", "hello"
    };

    AdPinId obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["pin_id"] == output["pin_id"]);



}


