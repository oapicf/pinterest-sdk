
#include "AdGroupAudienceSizingRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_AdGroupAudienceSizingRequest_auto_targeting_enabled_is_assigned_from_json()
{




    bourne::json input =
    {
        "auto_targeting_enabled", true
    };

    AdGroupAudienceSizingRequest obj(input.dump());

    TEST_ASSERT(true == obj.isAutoTargetingEnabled());




}








void test_AdGroupAudienceSizingRequest_auto_targeting_enabled_is_converted_to_json()
{


    bourne::json input =
    {
        "auto_targeting_enabled", true
    };

    AdGroupAudienceSizingRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["auto_targeting_enabled"] == output["auto_targeting_enabled"]);


}







