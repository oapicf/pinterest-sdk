
#include "CarouselSlot.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CarouselSlot_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "description", "hello"
    };

    CarouselSlot obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}


void test_CarouselSlot_link_is_assigned_from_json()
{


    bourne::json input =
    {
        "link", "hello"
    };

    CarouselSlot obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLink().c_str());






}


void test_CarouselSlot_title_is_assigned_from_json()
{


    bourne::json input =
    {
        "title", "hello"
    };

    CarouselSlot obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getTitle().c_str());






}



void test_CarouselSlot_description_is_converted_to_json()
{

    bourne::json input =
    {
        "description", "hello"
    };

    CarouselSlot obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}


void test_CarouselSlot_link_is_converted_to_json()
{

    bourne::json input =
    {
        "link", "hello"
    };

    CarouselSlot obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["link"] == output["link"]);



}


void test_CarouselSlot_title_is_converted_to_json()
{

    bourne::json input =
    {
        "title", "hello"
    };

    CarouselSlot obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["title"] == output["title"]);



}


