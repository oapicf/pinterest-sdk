
#include "Catalogs_product_group_pricing_currency_criteria.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_Catalogs_product_group_pricing_currency_criteria_negated_is_assigned_from_json()
{




    bourne::json input =
    {
        "negated", true
    };

    Catalogs_product_group_pricing_currency_criteria obj(input.dump());

    TEST_ASSERT(true == obj.isNegated());




}


void test_Catalogs_product_group_pricing_currency_criteria_r_operator_is_assigned_from_json()
{


    bourne::json input =
    {
        "r_operator", "hello"
    };

    Catalogs_product_group_pricing_currency_criteria obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getROperator().c_str());






}


void test_Catalogs_product_group_pricing_currency_criteria_value_is_assigned_from_json()
{








}




void test_Catalogs_product_group_pricing_currency_criteria_negated_is_converted_to_json()
{


    bourne::json input =
    {
        "negated", true
    };

    Catalogs_product_group_pricing_currency_criteria obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["negated"] == output["negated"]);


}


void test_Catalogs_product_group_pricing_currency_criteria_r_operator_is_converted_to_json()
{

    bourne::json input =
    {
        "r_operator", "hello"
    };

    Catalogs_product_group_pricing_currency_criteria obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["r_operator"] == output["r_operator"]);



}


void test_Catalogs_product_group_pricing_currency_criteria_value_is_converted_to_json()
{




}


