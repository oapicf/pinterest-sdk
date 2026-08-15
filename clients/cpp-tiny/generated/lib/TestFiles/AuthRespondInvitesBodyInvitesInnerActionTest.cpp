
#include "AuthRespondInvitesBody_invites_inner_action.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_AuthRespondInvitesBody_invites_inner_action_accept_invite_is_assigned_from_json()
{




    bourne::json input =
    {
        "accept_invite", true
    };

    AuthRespondInvitesBody_invites_inner_action obj(input.dump());

    TEST_ASSERT(true == obj.isAcceptInvite());




}




void test_AuthRespondInvitesBody_invites_inner_action_accept_invite_is_converted_to_json()
{


    bourne::json input =
    {
        "accept_invite", true
    };

    AuthRespondInvitesBody_invites_inner_action obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["accept_invite"] == output["accept_invite"]);


}



