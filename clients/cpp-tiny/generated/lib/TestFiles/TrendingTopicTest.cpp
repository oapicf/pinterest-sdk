
#include "TrendingTopic.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_TrendingTopic_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "description", "hello"
    };

    TrendingTopic obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}


void test_TrendingTopic_percent_growth_mom_is_assigned_from_json()
{
    bourne::json input =
    {
        "percent_growth_mom", 1
    };

    TrendingTopic obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPercentGrowthMom());








}





void test_TrendingTopic_time_series_is_assigned_from_json()
{








}


void test_TrendingTopic_title_is_assigned_from_json()
{


    bourne::json input =
    {
        "title", "hello"
    };

    TrendingTopic obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getTitle().c_str());






}



void test_TrendingTopic_description_is_converted_to_json()
{

    bourne::json input =
    {
        "description", "hello"
    };

    TrendingTopic obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}


void test_TrendingTopic_percent_growth_mom_is_converted_to_json()
{
    bourne::json input =
    {
        "percent_growth_mom", 1
    };

    TrendingTopic obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["percent_growth_mom"] == output["percent_growth_mom"]);




}





void test_TrendingTopic_time_series_is_converted_to_json()
{




}


void test_TrendingTopic_title_is_converted_to_json()
{

    bourne::json input =
    {
        "title", "hello"
    };

    TrendingTopic obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["title"] == output["title"]);



}


