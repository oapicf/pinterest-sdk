
#include "CatalogsCreativeAssetsProductGroup.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CatalogsCreativeAssetsProductGroup_catalog_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "catalog_id", "hello"
    };

    CatalogsCreativeAssetsProductGroup obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCatalogId().c_str());






}


void test_CatalogsCreativeAssetsProductGroup_catalog_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "catalog_type", "hello"
    };

    CatalogsCreativeAssetsProductGroup obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCatalogType().c_str());






}


void test_CatalogsCreativeAssetsProductGroup_created_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "created_at", 1
    };

    CatalogsCreativeAssetsProductGroup obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCreatedAt());








}


void test_CatalogsCreativeAssetsProductGroup_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "description", "hello"
    };

    CatalogsCreativeAssetsProductGroup obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}



void test_CatalogsCreativeAssetsProductGroup_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    CatalogsCreativeAssetsProductGroup obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_CatalogsCreativeAssetsProductGroup_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    CatalogsCreativeAssetsProductGroup obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_CatalogsCreativeAssetsProductGroup_updated_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "updated_at", 1
    };

    CatalogsCreativeAssetsProductGroup obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getUpdatedAt());








}



void test_CatalogsCreativeAssetsProductGroup_catalog_id_is_converted_to_json()
{

    bourne::json input =
    {
        "catalog_id", "hello"
    };

    CatalogsCreativeAssetsProductGroup obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["catalog_id"] == output["catalog_id"]);



}


void test_CatalogsCreativeAssetsProductGroup_catalog_type_is_converted_to_json()
{

    bourne::json input =
    {
        "catalog_type", "hello"
    };

    CatalogsCreativeAssetsProductGroup obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["catalog_type"] == output["catalog_type"]);



}


void test_CatalogsCreativeAssetsProductGroup_created_at_is_converted_to_json()
{
    bourne::json input =
    {
        "created_at", 1
    };

    CatalogsCreativeAssetsProductGroup obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["created_at"] == output["created_at"]);




}


void test_CatalogsCreativeAssetsProductGroup_description_is_converted_to_json()
{

    bourne::json input =
    {
        "description", "hello"
    };

    CatalogsCreativeAssetsProductGroup obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}



void test_CatalogsCreativeAssetsProductGroup_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    CatalogsCreativeAssetsProductGroup obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_CatalogsCreativeAssetsProductGroup_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    CatalogsCreativeAssetsProductGroup obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_CatalogsCreativeAssetsProductGroup_updated_at_is_converted_to_json()
{
    bourne::json input =
    {
        "updated_at", 1
    };

    CatalogsCreativeAssetsProductGroup obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["updated_at"] == output["updated_at"]);




}


