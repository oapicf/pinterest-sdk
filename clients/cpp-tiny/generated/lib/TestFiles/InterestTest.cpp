
#include "Interest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_Interest_canonical_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "canonical_url", "hello"
    };

    Interest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCanonicalUrl().c_str());






}


void test_Interest_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    Interest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_Interest_key_is_assigned_from_json()
{


    bourne::json input =
    {
        "key", "hello"
    };

    Interest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getKey().c_str());






}


void test_Interest_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    Interest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}



void test_Interest_canonical_url_is_converted_to_json()
{

    bourne::json input =
    {
        "canonical_url", "hello"
    };

    Interest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["canonical_url"] == output["canonical_url"]);



}


void test_Interest_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    Interest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_Interest_key_is_converted_to_json()
{

    bourne::json input =
    {
        "key", "hello"
    };

    Interest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["key"] == output["key"]);



}


void test_Interest_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    Interest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


