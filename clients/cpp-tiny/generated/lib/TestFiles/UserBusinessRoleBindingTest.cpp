
#include "UserBusinessRoleBinding.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"







void test_UserBusinessRoleBinding_created_time_is_assigned_from_json()
{
    bourne::json input =
    {
        "created_time", 1
    };

    UserBusinessRoleBinding obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCreatedTime());








}


void test_UserBusinessRoleBinding_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    UserBusinessRoleBinding obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_UserBusinessRoleBinding_is_shared_partner_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_shared_partner", true
    };

    UserBusinessRoleBinding obj(input.dump());

    TEST_ASSERT(true == obj.isIsSharedPartner());




}








void test_UserBusinessRoleBinding_created_time_is_converted_to_json()
{
    bourne::json input =
    {
        "created_time", 1
    };

    UserBusinessRoleBinding obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["created_time"] == output["created_time"]);




}


void test_UserBusinessRoleBinding_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    UserBusinessRoleBinding obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_UserBusinessRoleBinding_is_shared_partner_is_converted_to_json()
{


    bourne::json input =
    {
        "is_shared_partner", true
    };

    UserBusinessRoleBinding obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_shared_partner"] == output["is_shared_partner"]);


}



