
#include "CatalogsProductGroupPricingCriteria.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CatalogsProductGroupPricingCriteria_inclusion_is_assigned_from_json()
{




    bourne::json input =
    {
        "inclusion", true
    };

    CatalogsProductGroupPricingCriteria obj(input.dump());

    TEST_ASSERT(true == obj.isInclusion());




}


void test_CatalogsProductGroupPricingCriteria_negated_is_assigned_from_json()
{




    bourne::json input =
    {
        "negated", true
    };

    CatalogsProductGroupPricingCriteria obj(input.dump());

    TEST_ASSERT(true == obj.isNegated());




}


void test_CatalogsProductGroupPricingCriteria_values_is_assigned_from_json()
{








}



void test_CatalogsProductGroupPricingCriteria_inclusion_is_converted_to_json()
{


    bourne::json input =
    {
        "inclusion", true
    };

    CatalogsProductGroupPricingCriteria obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["inclusion"] == output["inclusion"]);


}


void test_CatalogsProductGroupPricingCriteria_negated_is_converted_to_json()
{


    bourne::json input =
    {
        "negated", true
    };

    CatalogsProductGroupPricingCriteria obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["negated"] == output["negated"]);


}


void test_CatalogsProductGroupPricingCriteria_values_is_converted_to_json()
{




}


