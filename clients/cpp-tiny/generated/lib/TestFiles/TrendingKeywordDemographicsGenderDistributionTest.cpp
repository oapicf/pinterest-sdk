
#include "TrendingKeyword_demographics_gender_distribution.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_TrendingKeyword_demographics_gender_distribution_gender_distribution_is_assigned_from_json()
{


    bourne::json input =
    {
        "gender_distribution", "hello"
    };

    TrendingKeyword_demographics_gender_distribution obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getGenderDistribution().c_str());






}



void test_TrendingKeyword_demographics_gender_distribution_gender_distribution_is_converted_to_json()
{

    bourne::json input =
    {
        "gender_distribution", "hello"
    };

    TrendingKeyword_demographics_gender_distribution obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["gender_distribution"] == output["gender_distribution"]);



}


