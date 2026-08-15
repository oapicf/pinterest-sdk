
#include "InviteResponse.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_InviteResponse_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    InviteResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}



void test_InviteResponse_is_received_invite_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_received_invite", true
    };

    InviteResponse obj(input.dump());

    TEST_ASSERT(true == obj.isIsReceivedInvite());




}







void test_InviteResponse_created_time_is_assigned_from_json()
{
    bourne::json input =
    {
        "created_time", 1
    };

    InviteResponse obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCreatedTime());








}



void test_InviteResponse_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    InviteResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}



void test_InviteResponse_is_received_invite_is_converted_to_json()
{


    bourne::json input =
    {
        "is_received_invite", true
    };

    InviteResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_received_invite"] == output["is_received_invite"]);


}







void test_InviteResponse_created_time_is_converted_to_json()
{
    bourne::json input =
    {
        "created_time", 1
    };

    InviteResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["created_time"] == output["created_time"]);




}


