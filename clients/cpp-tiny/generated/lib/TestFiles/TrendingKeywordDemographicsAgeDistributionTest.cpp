
#include "TrendingKeyword_demographics_age_distribution.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_TrendingKeyword_demographics_age_distribution_age_distribution_is_assigned_from_json()
{


    bourne::json input =
    {
        "age_distribution", "hello"
    };

    TrendingKeyword_demographics_age_distribution obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAgeDistribution().c_str());






}



void test_TrendingKeyword_demographics_age_distribution_age_distribution_is_converted_to_json()
{

    bourne::json input =
    {
        "age_distribution", "hello"
    };

    TrendingKeyword_demographics_age_distribution obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["age_distribution"] == output["age_distribution"]);



}


