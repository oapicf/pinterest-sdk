
#include "AudienceSubcategory.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_AudienceSubcategory_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    AudienceSubcategory obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_AudienceSubcategory_index_is_assigned_from_json()
{








}


void test_AudienceSubcategory_key_is_assigned_from_json()
{


    bourne::json input =
    {
        "key", "hello"
    };

    AudienceSubcategory obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getKey().c_str());






}


void test_AudienceSubcategory_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    AudienceSubcategory obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_AudienceSubcategory_ratio_is_assigned_from_json()
{








}



void test_AudienceSubcategory_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    AudienceSubcategory obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_AudienceSubcategory_index_is_converted_to_json()
{




}


void test_AudienceSubcategory_key_is_converted_to_json()
{

    bourne::json input =
    {
        "key", "hello"
    };

    AudienceSubcategory obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["key"] == output["key"]);



}


void test_AudienceSubcategory_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    AudienceSubcategory obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_AudienceSubcategory_ratio_is_converted_to_json()
{




}


