
#include "CatalogsRetailProductGroupProductCounts.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CatalogsRetailProductGroupProductCounts_catalog_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "catalog_type", "hello"
    };

    CatalogsRetailProductGroupProductCounts obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCatalogType().c_str());






}


void test_CatalogsRetailProductGroupProductCounts_in_stock_is_assigned_from_json()
{








}


void test_CatalogsRetailProductGroupProductCounts_out_of_stock_is_assigned_from_json()
{








}


void test_CatalogsRetailProductGroupProductCounts_preorder_is_assigned_from_json()
{








}


void test_CatalogsRetailProductGroupProductCounts_total_is_assigned_from_json()
{








}


void test_CatalogsRetailProductGroupProductCounts_videos_is_assigned_from_json()
{








}



void test_CatalogsRetailProductGroupProductCounts_catalog_type_is_converted_to_json()
{

    bourne::json input =
    {
        "catalog_type", "hello"
    };

    CatalogsRetailProductGroupProductCounts obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["catalog_type"] == output["catalog_type"]);



}


void test_CatalogsRetailProductGroupProductCounts_in_stock_is_converted_to_json()
{




}


void test_CatalogsRetailProductGroupProductCounts_out_of_stock_is_converted_to_json()
{




}


void test_CatalogsRetailProductGroupProductCounts_preorder_is_converted_to_json()
{




}


void test_CatalogsRetailProductGroupProductCounts_total_is_converted_to_json()
{




}


void test_CatalogsRetailProductGroupProductCounts_videos_is_converted_to_json()
{




}


