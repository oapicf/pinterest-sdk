
#include "AdPinAnalytics.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_AdPinAnalytics_pIN_ID_is_assigned_from_json()
{


    bourne::json input =
    {
        "pIN_ID", "hello"
    };

    AdPinAnalytics obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPINID().c_str());






}




void test_AdPinAnalytics_pIN_ID_is_converted_to_json()
{

    bourne::json input =
    {
        "pIN_ID", "hello"
    };

    AdPinAnalytics obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["pIN_ID"] == output["pIN_ID"]);



}


