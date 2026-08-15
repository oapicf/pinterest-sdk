
#include "TrendingProductCategory.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_TrendingProductCategory_pct_change_mom_is_assigned_from_json()
{
    bourne::json input =
    {
        "pct_change_mom", 1
    };

    TrendingProductCategory obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPctChangeMom());








}


void test_TrendingProductCategory_percent_relative_volume_is_assigned_from_json()
{
    bourne::json input =
    {
        "percent_relative_volume", 1
    };

    TrendingProductCategory obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPercentRelativeVolume());








}


void test_TrendingProductCategory_product_category_is_assigned_from_json()
{


    bourne::json input =
    {
        "product_category", "hello"
    };

    TrendingProductCategory obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getProductCategory().c_str());






}





void test_TrendingProductCategory_pct_change_mom_is_converted_to_json()
{
    bourne::json input =
    {
        "pct_change_mom", 1
    };

    TrendingProductCategory obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["pct_change_mom"] == output["pct_change_mom"]);




}


void test_TrendingProductCategory_percent_relative_volume_is_converted_to_json()
{
    bourne::json input =
    {
        "percent_relative_volume", 1
    };

    TrendingProductCategory obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["percent_relative_volume"] == output["percent_relative_volume"]);




}


void test_TrendingProductCategory_product_category_is_converted_to_json()
{

    bourne::json input =
    {
        "product_category", "hello"
    };

    TrendingProductCategory obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["product_category"] == output["product_category"]);



}



