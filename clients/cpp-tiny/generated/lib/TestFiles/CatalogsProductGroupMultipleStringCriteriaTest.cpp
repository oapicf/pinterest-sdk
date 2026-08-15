
#include "CatalogsProductGroupMultipleStringCriteria.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CatalogsProductGroupMultipleStringCriteria_negated_is_assigned_from_json()
{




    bourne::json input =
    {
        "negated", true
    };

    CatalogsProductGroupMultipleStringCriteria obj(input.dump());

    TEST_ASSERT(true == obj.isNegated());




}




void test_CatalogsProductGroupMultipleStringCriteria_negated_is_converted_to_json()
{


    bourne::json input =
    {
        "negated", true
    };

    CatalogsProductGroupMultipleStringCriteria obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["negated"] == output["negated"]);


}



