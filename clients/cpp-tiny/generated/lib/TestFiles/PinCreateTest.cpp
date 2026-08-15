
#include "PinCreate.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PinCreate_alt_text_is_assigned_from_json()
{


    bourne::json input =
    {
        "alt_text", "hello"
    };

    PinCreate obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAltText().c_str());






}


void test_PinCreate_board_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "board_id", "hello"
    };

    PinCreate obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBoardId().c_str());






}


void test_PinCreate_board_section_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "board_section_id", "hello"
    };

    PinCreate obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBoardSectionId().c_str());






}


void test_PinCreate_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "description", "hello"
    };

    PinCreate obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}


void test_PinCreate_dominant_color_is_assigned_from_json()
{


    bourne::json input =
    {
        "dominant_color", "hello"
    };

    PinCreate obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDominantColor().c_str());






}


void test_PinCreate_link_is_assigned_from_json()
{


    bourne::json input =
    {
        "link", "hello"
    };

    PinCreate obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLink().c_str());






}



void test_PinCreate_parent_pin_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "parent_pin_id", "hello"
    };

    PinCreate obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getParentPinId().c_str());






}


void test_PinCreate_sponsor_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "sponsor_id", "hello"
    };

    PinCreate obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSponsorId().c_str());






}


void test_PinCreate_title_is_assigned_from_json()
{


    bourne::json input =
    {
        "title", "hello"
    };

    PinCreate obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getTitle().c_str());






}



void test_PinCreate_alt_text_is_converted_to_json()
{

    bourne::json input =
    {
        "alt_text", "hello"
    };

    PinCreate obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["alt_text"] == output["alt_text"]);



}


void test_PinCreate_board_id_is_converted_to_json()
{

    bourne::json input =
    {
        "board_id", "hello"
    };

    PinCreate obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["board_id"] == output["board_id"]);



}


void test_PinCreate_board_section_id_is_converted_to_json()
{

    bourne::json input =
    {
        "board_section_id", "hello"
    };

    PinCreate obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["board_section_id"] == output["board_section_id"]);



}


void test_PinCreate_description_is_converted_to_json()
{

    bourne::json input =
    {
        "description", "hello"
    };

    PinCreate obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}


void test_PinCreate_dominant_color_is_converted_to_json()
{

    bourne::json input =
    {
        "dominant_color", "hello"
    };

    PinCreate obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["dominant_color"] == output["dominant_color"]);



}


void test_PinCreate_link_is_converted_to_json()
{

    bourne::json input =
    {
        "link", "hello"
    };

    PinCreate obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["link"] == output["link"]);



}



void test_PinCreate_parent_pin_id_is_converted_to_json()
{

    bourne::json input =
    {
        "parent_pin_id", "hello"
    };

    PinCreate obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["parent_pin_id"] == output["parent_pin_id"]);



}


void test_PinCreate_sponsor_id_is_converted_to_json()
{

    bourne::json input =
    {
        "sponsor_id", "hello"
    };

    PinCreate obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["sponsor_id"] == output["sponsor_id"]);



}


void test_PinCreate_title_is_converted_to_json()
{

    bourne::json input =
    {
        "title", "hello"
    };

    PinCreate obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["title"] == output["title"]);



}


