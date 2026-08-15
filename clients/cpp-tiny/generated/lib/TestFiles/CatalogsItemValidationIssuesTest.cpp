
#include "CatalogsItemValidationIssues.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_CatalogsItemValidationIssues_item_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "item_id", "hello"
    };

    CatalogsItemValidationIssues obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getItemId().c_str());






}


void test_CatalogsItemValidationIssues_item_number_is_assigned_from_json()
{
    bourne::json input =
    {
        "item_number", 1
    };

    CatalogsItemValidationIssues obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getItemNumber());








}





void test_CatalogsItemValidationIssues_item_id_is_converted_to_json()
{

    bourne::json input =
    {
        "item_id", "hello"
    };

    CatalogsItemValidationIssues obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["item_id"] == output["item_id"]);



}


void test_CatalogsItemValidationIssues_item_number_is_converted_to_json()
{
    bourne::json input =
    {
        "item_number", 1
    };

    CatalogsItemValidationIssues obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["item_number"] == output["item_number"]);




}



