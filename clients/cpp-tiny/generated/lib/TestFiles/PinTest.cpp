
#include "Pin.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_Pin_alt_text_is_assigned_from_json()
{


    bourne::json input =
    {
        "alt_text", "hello"
    };

    Pin obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAltText().c_str());






}


void test_Pin_board_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "board_id", "hello"
    };

    Pin obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBoardId().c_str());






}



void test_Pin_board_section_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "board_section_id", "hello"
    };

    Pin obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBoardSectionId().c_str());






}


void test_Pin_created_at_is_assigned_from_json()
{








}



void test_Pin_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "description", "hello"
    };

    Pin obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}


void test_Pin_dominant_color_is_assigned_from_json()
{


    bourne::json input =
    {
        "dominant_color", "hello"
    };

    Pin obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDominantColor().c_str());






}


void test_Pin_has_been_promoted_is_assigned_from_json()
{




    bourne::json input =
    {
        "has_been_promoted", true
    };

    Pin obj(input.dump());

    TEST_ASSERT(true == obj.isHasBeenPromoted());




}


void test_Pin_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    Pin obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_Pin_is_owner_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_owner", true
    };

    Pin obj(input.dump());

    TEST_ASSERT(true == obj.isIsOwner());




}


void test_Pin_is_standard_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_standard", true
    };

    Pin obj(input.dump());

    TEST_ASSERT(true == obj.isIsStandard());




}


void test_Pin_link_is_assigned_from_json()
{


    bourne::json input =
    {
        "link", "hello"
    };

    Pin obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLink().c_str());






}



void test_Pin_parent_pin_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "parent_pin_id", "hello"
    };

    Pin obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getParentPinId().c_str());






}



void test_Pin_title_is_assigned_from_json()
{


    bourne::json input =
    {
        "title", "hello"
    };

    Pin obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getTitle().c_str());






}



void test_Pin_alt_text_is_converted_to_json()
{

    bourne::json input =
    {
        "alt_text", "hello"
    };

    Pin obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["alt_text"] == output["alt_text"]);



}


void test_Pin_board_id_is_converted_to_json()
{

    bourne::json input =
    {
        "board_id", "hello"
    };

    Pin obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["board_id"] == output["board_id"]);



}



void test_Pin_board_section_id_is_converted_to_json()
{

    bourne::json input =
    {
        "board_section_id", "hello"
    };

    Pin obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["board_section_id"] == output["board_section_id"]);



}


void test_Pin_created_at_is_converted_to_json()
{




}



void test_Pin_description_is_converted_to_json()
{

    bourne::json input =
    {
        "description", "hello"
    };

    Pin obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}


void test_Pin_dominant_color_is_converted_to_json()
{

    bourne::json input =
    {
        "dominant_color", "hello"
    };

    Pin obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["dominant_color"] == output["dominant_color"]);



}


void test_Pin_has_been_promoted_is_converted_to_json()
{


    bourne::json input =
    {
        "has_been_promoted", true
    };

    Pin obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["has_been_promoted"] == output["has_been_promoted"]);


}


void test_Pin_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    Pin obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_Pin_is_owner_is_converted_to_json()
{


    bourne::json input =
    {
        "is_owner", true
    };

    Pin obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_owner"] == output["is_owner"]);


}


void test_Pin_is_standard_is_converted_to_json()
{


    bourne::json input =
    {
        "is_standard", true
    };

    Pin obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_standard"] == output["is_standard"]);


}


void test_Pin_link_is_converted_to_json()
{

    bourne::json input =
    {
        "link", "hello"
    };

    Pin obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["link"] == output["link"]);



}



void test_Pin_parent_pin_id_is_converted_to_json()
{

    bourne::json input =
    {
        "parent_pin_id", "hello"
    };

    Pin obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["parent_pin_id"] == output["parent_pin_id"]);



}



void test_Pin_title_is_converted_to_json()
{

    bourne::json input =
    {
        "title", "hello"
    };

    Pin obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["title"] == output["title"]);



}


