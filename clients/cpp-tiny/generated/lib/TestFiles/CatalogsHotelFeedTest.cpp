
#include "CatalogsHotelFeed.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CatalogsHotelFeed_created_at_is_assigned_from_json()
{








}


void test_CatalogsHotelFeed_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    CatalogsHotelFeed obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_CatalogsHotelFeed_updated_at_is_assigned_from_json()
{








}


void test_CatalogsHotelFeed_catalog_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "catalog_id", "hello"
    };

    CatalogsHotelFeed obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCatalogId().c_str());






}





void test_CatalogsHotelFeed_default_locale_is_assigned_from_json()
{


    bourne::json input =
    {
        "default_locale", "hello"
    };

    CatalogsHotelFeed obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDefaultLocale().c_str());






}



void test_CatalogsHotelFeed_location_is_assigned_from_json()
{


    bourne::json input =
    {
        "location", "hello"
    };

    CatalogsHotelFeed obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLocation().c_str());






}


void test_CatalogsHotelFeed_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    CatalogsHotelFeed obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}





void test_CatalogsHotelFeed_created_at_is_converted_to_json()
{




}


void test_CatalogsHotelFeed_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    CatalogsHotelFeed obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_CatalogsHotelFeed_updated_at_is_converted_to_json()
{




}


void test_CatalogsHotelFeed_catalog_id_is_converted_to_json()
{

    bourne::json input =
    {
        "catalog_id", "hello"
    };

    CatalogsHotelFeed obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["catalog_id"] == output["catalog_id"]);



}





void test_CatalogsHotelFeed_default_locale_is_converted_to_json()
{

    bourne::json input =
    {
        "default_locale", "hello"
    };

    CatalogsHotelFeed obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["default_locale"] == output["default_locale"]);



}



void test_CatalogsHotelFeed_location_is_converted_to_json()
{

    bourne::json input =
    {
        "location", "hello"
    };

    CatalogsHotelFeed obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["location"] == output["location"]);



}


void test_CatalogsHotelFeed_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    CatalogsHotelFeed obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}




