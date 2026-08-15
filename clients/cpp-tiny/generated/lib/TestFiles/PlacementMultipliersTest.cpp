
#include "PlacementMultipliers.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PlacementMultipliers_pLACEMENT_is_assigned_from_json()
{


    bourne::json input =
    {
        "pLACEMENT", "hello"
    };

    PlacementMultipliers obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPLACEMENT().c_str());






}



void test_PlacementMultipliers_pLACEMENT_is_converted_to_json()
{

    bourne::json input =
    {
        "pLACEMENT", "hello"
    };

    PlacementMultipliers obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["pLACEMENT"] == output["pLACEMENT"]);



}


