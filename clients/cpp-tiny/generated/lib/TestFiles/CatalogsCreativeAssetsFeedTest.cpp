
#include "CatalogsCreativeAssetsFeed.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CatalogsCreativeAssetsFeed_created_at_is_assigned_from_json()
{








}


void test_CatalogsCreativeAssetsFeed_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    CatalogsCreativeAssetsFeed obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_CatalogsCreativeAssetsFeed_updated_at_is_assigned_from_json()
{








}


void test_CatalogsCreativeAssetsFeed_catalog_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "catalog_id", "hello"
    };

    CatalogsCreativeAssetsFeed obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCatalogId().c_str());






}






void test_CatalogsCreativeAssetsFeed_default_locale_is_assigned_from_json()
{


    bourne::json input =
    {
        "default_locale", "hello"
    };

    CatalogsCreativeAssetsFeed obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDefaultLocale().c_str());






}



void test_CatalogsCreativeAssetsFeed_location_is_assigned_from_json()
{


    bourne::json input =
    {
        "location", "hello"
    };

    CatalogsCreativeAssetsFeed obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLocation().c_str());






}


void test_CatalogsCreativeAssetsFeed_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    CatalogsCreativeAssetsFeed obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}





void test_CatalogsCreativeAssetsFeed_created_at_is_converted_to_json()
{




}


void test_CatalogsCreativeAssetsFeed_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    CatalogsCreativeAssetsFeed obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_CatalogsCreativeAssetsFeed_updated_at_is_converted_to_json()
{




}


void test_CatalogsCreativeAssetsFeed_catalog_id_is_converted_to_json()
{

    bourne::json input =
    {
        "catalog_id", "hello"
    };

    CatalogsCreativeAssetsFeed obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["catalog_id"] == output["catalog_id"]);



}






void test_CatalogsCreativeAssetsFeed_default_locale_is_converted_to_json()
{

    bourne::json input =
    {
        "default_locale", "hello"
    };

    CatalogsCreativeAssetsFeed obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["default_locale"] == output["default_locale"]);



}



void test_CatalogsCreativeAssetsFeed_location_is_converted_to_json()
{

    bourne::json input =
    {
        "location", "hello"
    };

    CatalogsCreativeAssetsFeed obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["location"] == output["location"]);



}


void test_CatalogsCreativeAssetsFeed_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    CatalogsCreativeAssetsFeed obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}




