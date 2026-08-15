
#include "CatalogsProductGroupUint32Criteria.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CatalogsProductGroupUint32Criteria_negated_is_assigned_from_json()
{




    bourne::json input =
    {
        "negated", true
    };

    CatalogsProductGroupUint32Criteria obj(input.dump());

    TEST_ASSERT(true == obj.isNegated());




}


void test_CatalogsProductGroupUint32Criteria_r_operator_is_assigned_from_json()
{


    bourne::json input =
    {
        "r_operator", "hello"
    };

    CatalogsProductGroupUint32Criteria obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getROperator().c_str());






}


void test_CatalogsProductGroupUint32Criteria_value_is_assigned_from_json()
{
    bourne::json input =
    {
        "value", 1
    };

    CatalogsProductGroupUint32Criteria obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getValue());








}



void test_CatalogsProductGroupUint32Criteria_negated_is_converted_to_json()
{


    bourne::json input =
    {
        "negated", true
    };

    CatalogsProductGroupUint32Criteria obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["negated"] == output["negated"]);


}


void test_CatalogsProductGroupUint32Criteria_r_operator_is_converted_to_json()
{

    bourne::json input =
    {
        "r_operator", "hello"
    };

    CatalogsProductGroupUint32Criteria obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["r_operator"] == output["r_operator"]);



}


void test_CatalogsProductGroupUint32Criteria_value_is_converted_to_json()
{
    bourne::json input =
    {
        "value", 1
    };

    CatalogsProductGroupUint32Criteria obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["value"] == output["value"]);




}


