
#include "Board.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_Board_board_pins_modified_at_is_assigned_from_json()
{








}


void test_Board_collaborator_count_is_assigned_from_json()
{
    bourne::json input =
    {
        "collaborator_count", 1
    };

    Board obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCollaboratorCount());








}


void test_Board_created_at_is_assigned_from_json()
{








}


void test_Board_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "description", "hello"
    };

    Board obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}


void test_Board_follower_count_is_assigned_from_json()
{
    bourne::json input =
    {
        "follower_count", 1
    };

    Board obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getFollowerCount());








}


void test_Board_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    Board obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_Board_is_ads_only_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_ads_only", true
    };

    Board obj(input.dump());

    TEST_ASSERT(true == obj.isIsAdsOnly());




}



void test_Board_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    Board obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}



void test_Board_pin_count_is_assigned_from_json()
{
    bourne::json input =
    {
        "pin_count", 1
    };

    Board obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPinCount());








}




void test_Board_board_pins_modified_at_is_converted_to_json()
{




}


void test_Board_collaborator_count_is_converted_to_json()
{
    bourne::json input =
    {
        "collaborator_count", 1
    };

    Board obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["collaborator_count"] == output["collaborator_count"]);




}


void test_Board_created_at_is_converted_to_json()
{




}


void test_Board_description_is_converted_to_json()
{

    bourne::json input =
    {
        "description", "hello"
    };

    Board obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}


void test_Board_follower_count_is_converted_to_json()
{
    bourne::json input =
    {
        "follower_count", 1
    };

    Board obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["follower_count"] == output["follower_count"]);




}


void test_Board_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    Board obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_Board_is_ads_only_is_converted_to_json()
{


    bourne::json input =
    {
        "is_ads_only", true
    };

    Board obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_ads_only"] == output["is_ads_only"]);


}



void test_Board_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    Board obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}



void test_Board_pin_count_is_converted_to_json()
{
    bourne::json input =
    {
        "pin_count", 1
    };

    Board obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["pin_count"] == output["pin_count"]);




}



