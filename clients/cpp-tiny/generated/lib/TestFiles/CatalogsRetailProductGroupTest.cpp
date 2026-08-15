
#include "CatalogsRetailProductGroup.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CatalogsRetailProductGroup_catalog_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "catalog_id", "hello"
    };

    CatalogsRetailProductGroup obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCatalogId().c_str());






}


void test_CatalogsRetailProductGroup_catalog_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "catalog_type", "hello"
    };

    CatalogsRetailProductGroup obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCatalogType().c_str());






}


void test_CatalogsRetailProductGroup_country_is_assigned_from_json()
{


    bourne::json input =
    {
        "country", "hello"
    };

    CatalogsRetailProductGroup obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCountry().c_str());






}


void test_CatalogsRetailProductGroup_created_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "created_at", 1
    };

    CatalogsRetailProductGroup obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCreatedAt());








}


void test_CatalogsRetailProductGroup_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "description", "hello"
    };

    CatalogsRetailProductGroup obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}


void test_CatalogsRetailProductGroup_feed_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "feed_id", "hello"
    };

    CatalogsRetailProductGroup obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFeedId().c_str());






}



void test_CatalogsRetailProductGroup_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    CatalogsRetailProductGroup obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_CatalogsRetailProductGroup_is_featured_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_featured", true
    };

    CatalogsRetailProductGroup obj(input.dump());

    TEST_ASSERT(true == obj.isIsFeatured());




}


void test_CatalogsRetailProductGroup_locale_is_assigned_from_json()
{


    bourne::json input =
    {
        "locale", "hello"
    };

    CatalogsRetailProductGroup obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLocale().c_str());






}


void test_CatalogsRetailProductGroup_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    CatalogsRetailProductGroup obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}




void test_CatalogsRetailProductGroup_updated_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "updated_at", 1
    };

    CatalogsRetailProductGroup obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getUpdatedAt());








}



void test_CatalogsRetailProductGroup_catalog_id_is_converted_to_json()
{

    bourne::json input =
    {
        "catalog_id", "hello"
    };

    CatalogsRetailProductGroup obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["catalog_id"] == output["catalog_id"]);



}


void test_CatalogsRetailProductGroup_catalog_type_is_converted_to_json()
{

    bourne::json input =
    {
        "catalog_type", "hello"
    };

    CatalogsRetailProductGroup obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["catalog_type"] == output["catalog_type"]);



}


void test_CatalogsRetailProductGroup_country_is_converted_to_json()
{

    bourne::json input =
    {
        "country", "hello"
    };

    CatalogsRetailProductGroup obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["country"] == output["country"]);



}


void test_CatalogsRetailProductGroup_created_at_is_converted_to_json()
{
    bourne::json input =
    {
        "created_at", 1
    };

    CatalogsRetailProductGroup obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["created_at"] == output["created_at"]);




}


void test_CatalogsRetailProductGroup_description_is_converted_to_json()
{

    bourne::json input =
    {
        "description", "hello"
    };

    CatalogsRetailProductGroup obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}


void test_CatalogsRetailProductGroup_feed_id_is_converted_to_json()
{

    bourne::json input =
    {
        "feed_id", "hello"
    };

    CatalogsRetailProductGroup obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["feed_id"] == output["feed_id"]);



}



void test_CatalogsRetailProductGroup_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    CatalogsRetailProductGroup obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_CatalogsRetailProductGroup_is_featured_is_converted_to_json()
{


    bourne::json input =
    {
        "is_featured", true
    };

    CatalogsRetailProductGroup obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_featured"] == output["is_featured"]);


}


void test_CatalogsRetailProductGroup_locale_is_converted_to_json()
{

    bourne::json input =
    {
        "locale", "hello"
    };

    CatalogsRetailProductGroup obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["locale"] == output["locale"]);



}


void test_CatalogsRetailProductGroup_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    CatalogsRetailProductGroup obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}




void test_CatalogsRetailProductGroup_updated_at_is_converted_to_json()
{
    bourne::json input =
    {
        "updated_at", 1
    };

    CatalogsRetailProductGroup obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["updated_at"] == output["updated_at"]);




}


