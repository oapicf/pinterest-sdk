
#include "CatalogsItemValidationDetails.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_CatalogsItemValidationDetails_provided_value_is_assigned_from_json()
{


    bourne::json input =
    {
        "provided_value", "hello"
    };

    CatalogsItemValidationDetails obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getProvidedValue().c_str());






}




void test_CatalogsItemValidationDetails_provided_value_is_converted_to_json()
{

    bourne::json input =
    {
        "provided_value", "hello"
    };

    CatalogsItemValidationDetails obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["provided_value"] == output["provided_value"]);



}


