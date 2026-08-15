
#include "FollowUserRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_FollowUserRequest_auto_follow_is_assigned_from_json()
{




    bourne::json input =
    {
        "auto_follow", true
    };

    FollowUserRequest obj(input.dump());

    TEST_ASSERT(true == obj.isAutoFollow());




}



void test_FollowUserRequest_auto_follow_is_converted_to_json()
{


    bourne::json input =
    {
        "auto_follow", true
    };

    FollowUserRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["auto_follow"] == output["auto_follow"]);


}


