
#include "CampaignsAnalyticsResponse_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CampaignsAnalyticsResponse_inner_cAMPAIGN_ID_is_assigned_from_json()
{


    bourne::json input =
    {
        "cAMPAIGN_ID", "hello"
    };

    CampaignsAnalyticsResponse_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCAMPAIGNID().c_str());






}




void test_CampaignsAnalyticsResponse_inner_cAMPAIGN_ID_is_converted_to_json()
{

    bourne::json input =
    {
        "cAMPAIGN_ID", "hello"
    };

    CampaignsAnalyticsResponse_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["cAMPAIGN_ID"] == output["cAMPAIGN_ID"]);



}



