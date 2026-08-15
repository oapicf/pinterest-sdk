
#include "CatalogsHotelFeedsCreateRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CatalogsHotelFeedsCreateRequest_catalog_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "catalog_id", "hello"
    };

    CatalogsHotelFeedsCreateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCatalogId().c_str());






}







void test_CatalogsHotelFeedsCreateRequest_location_is_assigned_from_json()
{


    bourne::json input =
    {
        "location", "hello"
    };

    CatalogsHotelFeedsCreateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLocation().c_str());






}


void test_CatalogsHotelFeedsCreateRequest_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    CatalogsHotelFeedsCreateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}





void test_CatalogsHotelFeedsCreateRequest_catalog_id_is_converted_to_json()
{

    bourne::json input =
    {
        "catalog_id", "hello"
    };

    CatalogsHotelFeedsCreateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["catalog_id"] == output["catalog_id"]);



}







void test_CatalogsHotelFeedsCreateRequest_location_is_converted_to_json()
{

    bourne::json input =
    {
        "location", "hello"
    };

    CatalogsHotelFeedsCreateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["location"] == output["location"]);



}


void test_CatalogsHotelFeedsCreateRequest_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    CatalogsHotelFeedsCreateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}




