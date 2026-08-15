
#include "SharedAudience.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_SharedAudience_audience_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "audience_id", "hello"
    };

    SharedAudience obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAudienceId().c_str());






}





void test_SharedAudience_audience_id_is_converted_to_json()
{

    bourne::json input =
    {
        "audience_id", "hello"
    };

    SharedAudience obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["audience_id"] == output["audience_id"]);



}




