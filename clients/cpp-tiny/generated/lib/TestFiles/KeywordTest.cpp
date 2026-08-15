
#include "Keyword.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_Keyword_bid_is_assigned_from_json()
{
    bourne::json input =
    {
        "bid", 1
    };

    Keyword obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getBid());








}



void test_Keyword_value_is_assigned_from_json()
{


    bourne::json input =
    {
        "value", "hello"
    };

    Keyword obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getValue().c_str());






}


void test_Keyword_archived_is_assigned_from_json()
{




    bourne::json input =
    {
        "archived", true
    };

    Keyword obj(input.dump());

    TEST_ASSERT(true == obj.isArchived());




}


void test_Keyword_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    Keyword obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_Keyword_parent_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "parent_id", "hello"
    };

    Keyword obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getParentId().c_str());






}


void test_Keyword_parent_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "parent_type", "hello"
    };

    Keyword obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getParentType().c_str());






}


void test_Keyword_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    Keyword obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}



void test_Keyword_bid_is_converted_to_json()
{
    bourne::json input =
    {
        "bid", 1
    };

    Keyword obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["bid"] == output["bid"]);




}



void test_Keyword_value_is_converted_to_json()
{

    bourne::json input =
    {
        "value", "hello"
    };

    Keyword obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["value"] == output["value"]);



}


void test_Keyword_archived_is_converted_to_json()
{


    bourne::json input =
    {
        "archived", true
    };

    Keyword obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["archived"] == output["archived"]);


}


void test_Keyword_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    Keyword obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_Keyword_parent_id_is_converted_to_json()
{

    bourne::json input =
    {
        "parent_id", "hello"
    };

    Keyword obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["parent_id"] == output["parent_id"]);



}


void test_Keyword_parent_type_is_converted_to_json()
{

    bourne::json input =
    {
        "parent_type", "hello"
    };

    Keyword obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["parent_type"] == output["parent_type"]);



}


void test_Keyword_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    Keyword obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}


