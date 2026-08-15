
#include "Pins_save_request.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_Pins_save_request_board_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "board_id", "hello"
    };

    Pins_save_request obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBoardId().c_str());






}


void test_Pins_save_request_board_section_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "board_section_id", "hello"
    };

    Pins_save_request obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBoardSectionId().c_str());






}



void test_Pins_save_request_board_id_is_converted_to_json()
{

    bourne::json input =
    {
        "board_id", "hello"
    };

    Pins_save_request obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["board_id"] == output["board_id"]);



}


void test_Pins_save_request_board_section_id_is_converted_to_json()
{

    bourne::json input =
    {
        "board_section_id", "hello"
    };

    Pins_save_request obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["board_section_id"] == output["board_section_id"]);



}


