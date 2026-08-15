
#include "SharedAudienceCommon.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_SharedAudienceCommon_audience_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "audience_id", "hello"
    };

    SharedAudienceCommon obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAudienceId().c_str());






}




void test_SharedAudienceCommon_audience_id_is_converted_to_json()
{

    bourne::json input =
    {
        "audience_id", "hello"
    };

    SharedAudienceCommon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["audience_id"] == output["audience_id"]);



}



