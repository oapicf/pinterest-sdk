
#include "CatalogsFeedsCreateRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"









void test_CatalogsFeedsCreateRequest_location_is_assigned_from_json()
{


    bourne::json input =
    {
        "location", "hello"
    };

    CatalogsFeedsCreateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLocation().c_str());






}


void test_CatalogsFeedsCreateRequest_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    CatalogsFeedsCreateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}











void test_CatalogsFeedsCreateRequest_location_is_converted_to_json()
{

    bourne::json input =
    {
        "location", "hello"
    };

    CatalogsFeedsCreateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["location"] == output["location"]);



}


void test_CatalogsFeedsCreateRequest_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    CatalogsFeedsCreateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}




