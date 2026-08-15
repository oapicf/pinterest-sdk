
#include "BoardCreate.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_BoardCreate_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "description", "hello"
    };

    BoardCreate obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}


void test_BoardCreate_is_ads_only_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_ads_only", true
    };

    BoardCreate obj(input.dump());

    TEST_ASSERT(true == obj.isIsAdsOnly());




}


void test_BoardCreate_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    BoardCreate obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}




void test_BoardCreate_description_is_converted_to_json()
{

    bourne::json input =
    {
        "description", "hello"
    };

    BoardCreate obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}


void test_BoardCreate_is_ads_only_is_converted_to_json()
{


    bourne::json input =
    {
        "is_ads_only", true
    };

    BoardCreate obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_ads_only"] == output["is_ads_only"]);


}


void test_BoardCreate_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    BoardCreate obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}



