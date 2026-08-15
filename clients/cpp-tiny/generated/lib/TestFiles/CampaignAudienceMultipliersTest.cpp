
#include "CampaignAudienceMultipliers.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CampaignAudienceMultipliers_aUDIENCE_ID_is_assigned_from_json()
{


    bourne::json input =
    {
        "aUDIENCE_ID", "hello"
    };

    CampaignAudienceMultipliers obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAUDIENCEID().c_str());






}



void test_CampaignAudienceMultipliers_aUDIENCE_ID_is_converted_to_json()
{

    bourne::json input =
    {
        "aUDIENCE_ID", "hello"
    };

    CampaignAudienceMultipliers obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aUDIENCE_ID"] == output["aUDIENCE_ID"]);



}


