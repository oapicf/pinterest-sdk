
#include "CatalogsProductGroupUpdateRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CatalogsProductGroupUpdateRequest_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "description", "hello"
    };

    CatalogsProductGroupUpdateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}



void test_CatalogsProductGroupUpdateRequest_is_featured_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_featured", true
    };

    CatalogsProductGroupUpdateRequest obj(input.dump());

    TEST_ASSERT(true == obj.isIsFeatured());




}


void test_CatalogsProductGroupUpdateRequest_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    CatalogsProductGroupUpdateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}



void test_CatalogsProductGroupUpdateRequest_description_is_converted_to_json()
{

    bourne::json input =
    {
        "description", "hello"
    };

    CatalogsProductGroupUpdateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}



void test_CatalogsProductGroupUpdateRequest_is_featured_is_converted_to_json()
{


    bourne::json input =
    {
        "is_featured", true
    };

    CatalogsProductGroupUpdateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_featured"] == output["is_featured"]);


}


void test_CatalogsProductGroupUpdateRequest_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    CatalogsProductGroupUpdateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


