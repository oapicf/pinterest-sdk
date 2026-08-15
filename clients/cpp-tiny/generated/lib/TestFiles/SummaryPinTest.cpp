
#include "SummaryPin.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_SummaryPin_alt_text_is_assigned_from_json()
{


    bourne::json input =
    {
        "alt_text", "hello"
    };

    SummaryPin obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAltText().c_str());






}


void test_SummaryPin_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "description", "hello"
    };

    SummaryPin obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}


void test_SummaryPin_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    SummaryPin obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_SummaryPin_link_is_assigned_from_json()
{


    bourne::json input =
    {
        "link", "hello"
    };

    SummaryPin obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLink().c_str());






}



void test_SummaryPin_title_is_assigned_from_json()
{


    bourne::json input =
    {
        "title", "hello"
    };

    SummaryPin obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getTitle().c_str());






}



void test_SummaryPin_alt_text_is_converted_to_json()
{

    bourne::json input =
    {
        "alt_text", "hello"
    };

    SummaryPin obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["alt_text"] == output["alt_text"]);



}


void test_SummaryPin_description_is_converted_to_json()
{

    bourne::json input =
    {
        "description", "hello"
    };

    SummaryPin obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}


void test_SummaryPin_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    SummaryPin obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_SummaryPin_link_is_converted_to_json()
{

    bourne::json input =
    {
        "link", "hello"
    };

    SummaryPin obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["link"] == output["link"]);



}



void test_SummaryPin_title_is_converted_to_json()
{

    bourne::json input =
    {
        "title", "hello"
    };

    SummaryPin obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["title"] == output["title"]);



}


