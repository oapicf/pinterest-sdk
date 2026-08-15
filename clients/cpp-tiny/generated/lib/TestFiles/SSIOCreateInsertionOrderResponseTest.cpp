
#include "SSIOCreateInsertionOrderResponse.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_SSIOCreateInsertionOrderResponse_pin_order_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "pin_order_id", "hello"
    };

    SSIOCreateInsertionOrderResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPinOrderId().c_str());






}



void test_SSIOCreateInsertionOrderResponse_pin_order_id_is_converted_to_json()
{

    bourne::json input =
    {
        "pin_order_id", "hello"
    };

    SSIOCreateInsertionOrderResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["pin_order_id"] == output["pin_order_id"]);



}


