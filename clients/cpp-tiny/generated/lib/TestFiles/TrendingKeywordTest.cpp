
#include "TrendingKeyword.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_TrendingKeyword_has_prediction_is_assigned_from_json()
{




    bourne::json input =
    {
        "has_prediction", true
    };

    TrendingKeyword obj(input.dump());

    TEST_ASSERT(true == obj.isHasPrediction());




}


void test_TrendingKeyword_keyword_is_assigned_from_json()
{


    bourne::json input =
    {
        "keyword", "hello"
    };

    TrendingKeyword obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getKeyword().c_str());






}


void test_TrendingKeyword_pct_growth_mom_is_assigned_from_json()
{
    bourne::json input =
    {
        "pct_growth_mom", 1
    };

    TrendingKeyword obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPctGrowthMom());








}


void test_TrendingKeyword_pct_growth_wow_is_assigned_from_json()
{
    bourne::json input =
    {
        "pct_growth_wow", 1
    };

    TrendingKeyword obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPctGrowthWow());








}


void test_TrendingKeyword_pct_growth_yoy_is_assigned_from_json()
{
    bourne::json input =
    {
        "pct_growth_yoy", 1
    };

    TrendingKeyword obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPctGrowthYoy());








}






void test_TrendingKeyword_has_prediction_is_converted_to_json()
{


    bourne::json input =
    {
        "has_prediction", true
    };

    TrendingKeyword obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["has_prediction"] == output["has_prediction"]);


}


void test_TrendingKeyword_keyword_is_converted_to_json()
{

    bourne::json input =
    {
        "keyword", "hello"
    };

    TrendingKeyword obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["keyword"] == output["keyword"]);



}


void test_TrendingKeyword_pct_growth_mom_is_converted_to_json()
{
    bourne::json input =
    {
        "pct_growth_mom", 1
    };

    TrendingKeyword obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["pct_growth_mom"] == output["pct_growth_mom"]);




}


void test_TrendingKeyword_pct_growth_wow_is_converted_to_json()
{
    bourne::json input =
    {
        "pct_growth_wow", 1
    };

    TrendingKeyword obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["pct_growth_wow"] == output["pct_growth_wow"]);




}


void test_TrendingKeyword_pct_growth_yoy_is_converted_to_json()
{
    bourne::json input =
    {
        "pct_growth_yoy", 1
    };

    TrendingKeyword obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["pct_growth_yoy"] == output["pct_growth_yoy"]);




}




