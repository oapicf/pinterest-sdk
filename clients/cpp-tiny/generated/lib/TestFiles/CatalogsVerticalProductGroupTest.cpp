
#include "CatalogsVerticalProductGroup.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CatalogsVerticalProductGroup_catalog_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "catalog_id", "hello"
    };

    CatalogsVerticalProductGroup obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCatalogId().c_str());






}


void test_CatalogsVerticalProductGroup_catalog_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "catalog_type", "hello"
    };

    CatalogsVerticalProductGroup obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCatalogType().c_str());






}


void test_CatalogsVerticalProductGroup_country_is_assigned_from_json()
{


    bourne::json input =
    {
        "country", "hello"
    };

    CatalogsVerticalProductGroup obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCountry().c_str());






}


void test_CatalogsVerticalProductGroup_created_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "created_at", 1
    };

    CatalogsVerticalProductGroup obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCreatedAt());








}


void test_CatalogsVerticalProductGroup_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "description", "hello"
    };

    CatalogsVerticalProductGroup obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}


void test_CatalogsVerticalProductGroup_feed_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "feed_id", "hello"
    };

    CatalogsVerticalProductGroup obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFeedId().c_str());






}



void test_CatalogsVerticalProductGroup_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    CatalogsVerticalProductGroup obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_CatalogsVerticalProductGroup_is_featured_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_featured", true
    };

    CatalogsVerticalProductGroup obj(input.dump());

    TEST_ASSERT(true == obj.isIsFeatured());




}


void test_CatalogsVerticalProductGroup_locale_is_assigned_from_json()
{


    bourne::json input =
    {
        "locale", "hello"
    };

    CatalogsVerticalProductGroup obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLocale().c_str());






}


void test_CatalogsVerticalProductGroup_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    CatalogsVerticalProductGroup obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}




void test_CatalogsVerticalProductGroup_updated_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "updated_at", 1
    };

    CatalogsVerticalProductGroup obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getUpdatedAt());








}



void test_CatalogsVerticalProductGroup_catalog_id_is_converted_to_json()
{

    bourne::json input =
    {
        "catalog_id", "hello"
    };

    CatalogsVerticalProductGroup obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["catalog_id"] == output["catalog_id"]);



}


void test_CatalogsVerticalProductGroup_catalog_type_is_converted_to_json()
{

    bourne::json input =
    {
        "catalog_type", "hello"
    };

    CatalogsVerticalProductGroup obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["catalog_type"] == output["catalog_type"]);



}


void test_CatalogsVerticalProductGroup_country_is_converted_to_json()
{

    bourne::json input =
    {
        "country", "hello"
    };

    CatalogsVerticalProductGroup obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["country"] == output["country"]);



}


void test_CatalogsVerticalProductGroup_created_at_is_converted_to_json()
{
    bourne::json input =
    {
        "created_at", 1
    };

    CatalogsVerticalProductGroup obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["created_at"] == output["created_at"]);




}


void test_CatalogsVerticalProductGroup_description_is_converted_to_json()
{

    bourne::json input =
    {
        "description", "hello"
    };

    CatalogsVerticalProductGroup obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}


void test_CatalogsVerticalProductGroup_feed_id_is_converted_to_json()
{

    bourne::json input =
    {
        "feed_id", "hello"
    };

    CatalogsVerticalProductGroup obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["feed_id"] == output["feed_id"]);



}



void test_CatalogsVerticalProductGroup_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    CatalogsVerticalProductGroup obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_CatalogsVerticalProductGroup_is_featured_is_converted_to_json()
{


    bourne::json input =
    {
        "is_featured", true
    };

    CatalogsVerticalProductGroup obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_featured"] == output["is_featured"]);


}


void test_CatalogsVerticalProductGroup_locale_is_converted_to_json()
{

    bourne::json input =
    {
        "locale", "hello"
    };

    CatalogsVerticalProductGroup obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["locale"] == output["locale"]);



}


void test_CatalogsVerticalProductGroup_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    CatalogsVerticalProductGroup obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}




void test_CatalogsVerticalProductGroup_updated_at_is_converted_to_json()
{
    bourne::json input =
    {
        "updated_at", 1
    };

    CatalogsVerticalProductGroup obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["updated_at"] == output["updated_at"]);




}


