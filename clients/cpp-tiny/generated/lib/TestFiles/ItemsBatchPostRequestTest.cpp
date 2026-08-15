
#include "Items_batch_post_request.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_Items_batch_post_request_catalog_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "catalog_id", "hello"
    };

    Items_batch_post_request obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCatalogId().c_str());






}


void test_Items_batch_post_request_catalog_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "catalog_type", "hello"
    };

    Items_batch_post_request obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCatalogType().c_str());






}




void test_Items_batch_post_request_language_is_assigned_from_json()
{


    bourne::json input =
    {
        "language", "hello"
    };

    Items_batch_post_request obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLanguage().c_str());






}




void test_Items_batch_post_request_catalog_id_is_converted_to_json()
{

    bourne::json input =
    {
        "catalog_id", "hello"
    };

    Items_batch_post_request obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["catalog_id"] == output["catalog_id"]);



}


void test_Items_batch_post_request_catalog_type_is_converted_to_json()
{

    bourne::json input =
    {
        "catalog_type", "hello"
    };

    Items_batch_post_request obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["catalog_type"] == output["catalog_type"]);



}




void test_Items_batch_post_request_language_is_converted_to_json()
{

    bourne::json input =
    {
        "language", "hello"
    };

    Items_batch_post_request obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["language"] == output["language"]);



}



