
#include "CatalogsProductGroupFilterOperatorTypeCriteria.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CatalogsProductGroupFilterOperatorTypeCriteria_filter_operator_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "filter_operator_type", "hello"
    };

    CatalogsProductGroupFilterOperatorTypeCriteria obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFilterOperatorType().c_str());






}


void test_CatalogsProductGroupFilterOperatorTypeCriteria_negated_is_assigned_from_json()
{




    bourne::json input =
    {
        "negated", true
    };

    CatalogsProductGroupFilterOperatorTypeCriteria obj(input.dump());

    TEST_ASSERT(true == obj.isNegated());




}




void test_CatalogsProductGroupFilterOperatorTypeCriteria_filter_operator_type_is_converted_to_json()
{

    bourne::json input =
    {
        "filter_operator_type", "hello"
    };

    CatalogsProductGroupFilterOperatorTypeCriteria obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["filter_operator_type"] == output["filter_operator_type"]);



}


void test_CatalogsProductGroupFilterOperatorTypeCriteria_negated_is_converted_to_json()
{


    bourne::json input =
    {
        "negated", true
    };

    CatalogsProductGroupFilterOperatorTypeCriteria obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["negated"] == output["negated"]);


}



