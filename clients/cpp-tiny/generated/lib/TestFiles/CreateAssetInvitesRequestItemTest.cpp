
#include "CreateAssetInvitesRequestItem.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_CreateAssetInvitesRequestItem_invite_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "invite_id", "hello"
    };

    CreateAssetInvitesRequestItem obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getInviteId().c_str());






}





void test_CreateAssetInvitesRequestItem_invite_id_is_converted_to_json()
{

    bourne::json input =
    {
        "invite_id", "hello"
    };

    CreateAssetInvitesRequestItem obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["invite_id"] == output["invite_id"]);



}



