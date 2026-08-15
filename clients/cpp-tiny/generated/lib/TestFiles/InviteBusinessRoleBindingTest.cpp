
#include "InviteBusinessRoleBinding.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_InviteBusinessRoleBinding_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    InviteBusinessRoleBinding obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}



void test_InviteBusinessRoleBinding_is_received_invite_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_received_invite", true
    };

    InviteBusinessRoleBinding obj(input.dump());

    TEST_ASSERT(true == obj.isIsReceivedInvite());




}



void test_InviteBusinessRoleBinding_created_by_business_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "created_by_business_id", "hello"
    };

    InviteBusinessRoleBinding obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCreatedByBusinessId().c_str());






}


void test_InviteBusinessRoleBinding_created_by_user_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "created_by_user_id", "hello"
    };

    InviteBusinessRoleBinding obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCreatedByUserId().c_str());






}



void test_InviteBusinessRoleBinding_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    InviteBusinessRoleBinding obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}



void test_InviteBusinessRoleBinding_is_received_invite_is_converted_to_json()
{


    bourne::json input =
    {
        "is_received_invite", true
    };

    InviteBusinessRoleBinding obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_received_invite"] == output["is_received_invite"]);


}



void test_InviteBusinessRoleBinding_created_by_business_id_is_converted_to_json()
{

    bourne::json input =
    {
        "created_by_business_id", "hello"
    };

    InviteBusinessRoleBinding obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["created_by_business_id"] == output["created_by_business_id"]);



}


void test_InviteBusinessRoleBinding_created_by_user_id_is_converted_to_json()
{

    bourne::json input =
    {
        "created_by_user_id", "hello"
    };

    InviteBusinessRoleBinding obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["created_by_user_id"] == output["created_by_user_id"]);



}


