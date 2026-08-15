
#include "TrendingPin.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_TrendingPin_height_is_assigned_from_json()
{
    bourne::json input =
    {
        "height", 1
    };

    TrendingPin obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getHeight());








}


void test_TrendingPin_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    TrendingPin obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_TrendingPin_src_is_assigned_from_json()
{


    bourne::json input =
    {
        "src", "hello"
    };

    TrendingPin obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSrc().c_str());






}


void test_TrendingPin_width_is_assigned_from_json()
{
    bourne::json input =
    {
        "width", 1
    };

    TrendingPin obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getWidth());








}



void test_TrendingPin_height_is_converted_to_json()
{
    bourne::json input =
    {
        "height", 1
    };

    TrendingPin obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["height"] == output["height"]);




}


void test_TrendingPin_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    TrendingPin obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_TrendingPin_src_is_converted_to_json()
{

    bourne::json input =
    {
        "src", "hello"
    };

    TrendingPin obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["src"] == output["src"]);



}


void test_TrendingPin_width_is_converted_to_json()
{
    bourne::json input =
    {
        "width", 1
    };

    TrendingPin obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["width"] == output["width"]);




}


