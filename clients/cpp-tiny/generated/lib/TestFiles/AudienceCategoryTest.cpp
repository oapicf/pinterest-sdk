
#include "AudienceCategory.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_AudienceCategory_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    AudienceCategory obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_AudienceCategory_index_is_assigned_from_json()
{








}


void test_AudienceCategory_key_is_assigned_from_json()
{


    bourne::json input =
    {
        "key", "hello"
    };

    AudienceCategory obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getKey().c_str());






}


void test_AudienceCategory_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    AudienceCategory obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_AudienceCategory_ratio_is_assigned_from_json()
{








}




void test_AudienceCategory_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    AudienceCategory obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_AudienceCategory_index_is_converted_to_json()
{




}


void test_AudienceCategory_key_is_converted_to_json()
{

    bourne::json input =
    {
        "key", "hello"
    };

    AudienceCategory obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["key"] == output["key"]);



}


void test_AudienceCategory_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    AudienceCategory obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_AudienceCategory_ratio_is_converted_to_json()
{




}



