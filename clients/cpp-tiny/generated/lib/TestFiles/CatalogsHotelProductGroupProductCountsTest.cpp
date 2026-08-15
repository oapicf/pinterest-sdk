
#include "CatalogsHotelProductGroupProductCounts.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CatalogsHotelProductGroupProductCounts_catalog_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "catalog_type", "hello"
    };

    CatalogsHotelProductGroupProductCounts obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCatalogType().c_str());






}


void test_CatalogsHotelProductGroupProductCounts_total_is_assigned_from_json()
{








}



void test_CatalogsHotelProductGroupProductCounts_catalog_type_is_converted_to_json()
{

    bourne::json input =
    {
        "catalog_type", "hello"
    };

    CatalogsHotelProductGroupProductCounts obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["catalog_type"] == output["catalog_type"]);



}


void test_CatalogsHotelProductGroupProductCounts_total_is_converted_to_json()
{




}


