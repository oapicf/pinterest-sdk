
#include "CatalogsRetailFeed.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CatalogsRetailFeed_created_at_is_assigned_from_json()
{








}


void test_CatalogsRetailFeed_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    CatalogsRetailFeed obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_CatalogsRetailFeed_updated_at_is_assigned_from_json()
{








}







void test_CatalogsRetailFeed_default_locale_is_assigned_from_json()
{


    bourne::json input =
    {
        "default_locale", "hello"
    };

    CatalogsRetailFeed obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDefaultLocale().c_str());






}



void test_CatalogsRetailFeed_location_is_assigned_from_json()
{


    bourne::json input =
    {
        "location", "hello"
    };

    CatalogsRetailFeed obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLocation().c_str());






}


void test_CatalogsRetailFeed_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    CatalogsRetailFeed obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}





void test_CatalogsRetailFeed_created_at_is_converted_to_json()
{




}


void test_CatalogsRetailFeed_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    CatalogsRetailFeed obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_CatalogsRetailFeed_updated_at_is_converted_to_json()
{




}







void test_CatalogsRetailFeed_default_locale_is_converted_to_json()
{

    bourne::json input =
    {
        "default_locale", "hello"
    };

    CatalogsRetailFeed obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["default_locale"] == output["default_locale"]);



}



void test_CatalogsRetailFeed_location_is_converted_to_json()
{

    bourne::json input =
    {
        "location", "hello"
    };

    CatalogsRetailFeed obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["location"] == output["location"]);



}


void test_CatalogsRetailFeed_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    CatalogsRetailFeed obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}




