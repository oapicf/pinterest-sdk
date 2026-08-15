
#include "PinUpdate.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PinUpdate_alt_text_is_assigned_from_json()
{


    bourne::json input =
    {
        "alt_text", "hello"
    };

    PinUpdate obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAltText().c_str());






}


void test_PinUpdate_board_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "board_id", "hello"
    };

    PinUpdate obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBoardId().c_str());






}


void test_PinUpdate_board_section_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "board_section_id", "hello"
    };

    PinUpdate obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBoardSectionId().c_str());






}



void test_PinUpdate_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "description", "hello"
    };

    PinUpdate obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}


void test_PinUpdate_link_is_assigned_from_json()
{


    bourne::json input =
    {
        "link", "hello"
    };

    PinUpdate obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLink().c_str());






}


void test_PinUpdate_title_is_assigned_from_json()
{


    bourne::json input =
    {
        "title", "hello"
    };

    PinUpdate obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getTitle().c_str());






}



void test_PinUpdate_alt_text_is_converted_to_json()
{

    bourne::json input =
    {
        "alt_text", "hello"
    };

    PinUpdate obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["alt_text"] == output["alt_text"]);



}


void test_PinUpdate_board_id_is_converted_to_json()
{

    bourne::json input =
    {
        "board_id", "hello"
    };

    PinUpdate obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["board_id"] == output["board_id"]);



}


void test_PinUpdate_board_section_id_is_converted_to_json()
{

    bourne::json input =
    {
        "board_section_id", "hello"
    };

    PinUpdate obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["board_section_id"] == output["board_section_id"]);



}



void test_PinUpdate_description_is_converted_to_json()
{

    bourne::json input =
    {
        "description", "hello"
    };

    PinUpdate obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}


void test_PinUpdate_link_is_converted_to_json()
{

    bourne::json input =
    {
        "link", "hello"
    };

    PinUpdate obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["link"] == output["link"]);



}


void test_PinUpdate_title_is_converted_to_json()
{

    bourne::json input =
    {
        "title", "hello"
    };

    PinUpdate obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["title"] == output["title"]);



}


