
#include "MembersToDeleteBody_members_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_MembersToDeleteBody_members_inner_member_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "member_id", "hello"
    };

    MembersToDeleteBody_members_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMemberId().c_str());






}




void test_MembersToDeleteBody_members_inner_member_id_is_converted_to_json()
{

    bourne::json input =
    {
        "member_id", "hello"
    };

    MembersToDeleteBody_members_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["member_id"] == output["member_id"]);



}


