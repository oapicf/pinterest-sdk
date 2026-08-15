
#include "TargetingTemplateAudienceSizing_reach_estimate.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_TargetingTemplateAudienceSizing_reach_estimate_estimate_is_assigned_from_json()
{






    bourne::json input =
    {
        "estimate", 1
    };

    TargetingTemplateAudienceSizing_reach_estimate obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getEstimate());


}


void test_TargetingTemplateAudienceSizing_reach_estimate_lower_bound_is_assigned_from_json()
{






    bourne::json input =
    {
        "lower_bound", 1
    };

    TargetingTemplateAudienceSizing_reach_estimate obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getLowerBound());


}


void test_TargetingTemplateAudienceSizing_reach_estimate_upper_bound_is_assigned_from_json()
{






    bourne::json input =
    {
        "upper_bound", 1
    };

    TargetingTemplateAudienceSizing_reach_estimate obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getUpperBound());


}



void test_TargetingTemplateAudienceSizing_reach_estimate_estimate_is_converted_to_json()
{



    bourne::json input =
    {
        "estimate", 1
    };

    TargetingTemplateAudienceSizing_reach_estimate obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["estimate"] == output["estimate"]);

}


void test_TargetingTemplateAudienceSizing_reach_estimate_lower_bound_is_converted_to_json()
{



    bourne::json input =
    {
        "lower_bound", 1
    };

    TargetingTemplateAudienceSizing_reach_estimate obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["lower_bound"] == output["lower_bound"]);

}


void test_TargetingTemplateAudienceSizing_reach_estimate_upper_bound_is_converted_to_json()
{



    bourne::json input =
    {
        "upper_bound", 1
    };

    TargetingTemplateAudienceSizing_reach_estimate obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["upper_bound"] == output["upper_bound"]);

}


