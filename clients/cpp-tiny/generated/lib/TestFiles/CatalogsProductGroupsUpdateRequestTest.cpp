
#include "Catalogs_product_groups_update_request.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_Catalogs_product_groups_update_request_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "description", "hello"
    };

    Catalogs_product_groups_update_request obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}



void test_Catalogs_product_groups_update_request_is_featured_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_featured", true
    };

    Catalogs_product_groups_update_request obj(input.dump());

    TEST_ASSERT(true == obj.isIsFeatured());




}


void test_Catalogs_product_groups_update_request_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    Catalogs_product_groups_update_request obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_Catalogs_product_groups_update_request_catalog_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "catalog_type", "hello"
    };

    Catalogs_product_groups_update_request obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCatalogType().c_str());






}





void test_Catalogs_product_groups_update_request_description_is_converted_to_json()
{

    bourne::json input =
    {
        "description", "hello"
    };

    Catalogs_product_groups_update_request obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}



void test_Catalogs_product_groups_update_request_is_featured_is_converted_to_json()
{


    bourne::json input =
    {
        "is_featured", true
    };

    Catalogs_product_groups_update_request obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_featured"] == output["is_featured"]);


}


void test_Catalogs_product_groups_update_request_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    Catalogs_product_groups_update_request obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_Catalogs_product_groups_update_request_catalog_type_is_converted_to_json()
{

    bourne::json input =
    {
        "catalog_type", "hello"
    };

    Catalogs_product_groups_update_request obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["catalog_type"] == output["catalog_type"]);



}




