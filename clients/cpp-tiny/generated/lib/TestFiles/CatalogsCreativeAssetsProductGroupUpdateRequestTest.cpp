
#include "CatalogsCreativeAssetsProductGroupUpdateRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CatalogsCreativeAssetsProductGroupUpdateRequest_catalog_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "catalog_type", "hello"
    };

    CatalogsCreativeAssetsProductGroupUpdateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCatalogType().c_str());






}


void test_CatalogsCreativeAssetsProductGroupUpdateRequest_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "description", "hello"
    };

    CatalogsCreativeAssetsProductGroupUpdateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}



void test_CatalogsCreativeAssetsProductGroupUpdateRequest_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    CatalogsCreativeAssetsProductGroupUpdateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}



void test_CatalogsCreativeAssetsProductGroupUpdateRequest_catalog_type_is_converted_to_json()
{

    bourne::json input =
    {
        "catalog_type", "hello"
    };

    CatalogsCreativeAssetsProductGroupUpdateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["catalog_type"] == output["catalog_type"]);



}


void test_CatalogsCreativeAssetsProductGroupUpdateRequest_description_is_converted_to_json()
{

    bourne::json input =
    {
        "description", "hello"
    };

    CatalogsCreativeAssetsProductGroupUpdateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}



void test_CatalogsCreativeAssetsProductGroupUpdateRequest_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    CatalogsCreativeAssetsProductGroupUpdateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


