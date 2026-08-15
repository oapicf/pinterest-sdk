
#include "PinMediaSourceImagesURLItem.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PinMediaSourceImagesURLItem_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "description", "hello"
    };

    PinMediaSourceImagesURLItem obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}


void test_PinMediaSourceImagesURLItem_link_is_assigned_from_json()
{


    bourne::json input =
    {
        "link", "hello"
    };

    PinMediaSourceImagesURLItem obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLink().c_str());






}


void test_PinMediaSourceImagesURLItem_title_is_assigned_from_json()
{


    bourne::json input =
    {
        "title", "hello"
    };

    PinMediaSourceImagesURLItem obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getTitle().c_str());






}


void test_PinMediaSourceImagesURLItem_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "url", "hello"
    };

    PinMediaSourceImagesURLItem obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUrl().c_str());






}



void test_PinMediaSourceImagesURLItem_description_is_converted_to_json()
{

    bourne::json input =
    {
        "description", "hello"
    };

    PinMediaSourceImagesURLItem obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}


void test_PinMediaSourceImagesURLItem_link_is_converted_to_json()
{

    bourne::json input =
    {
        "link", "hello"
    };

    PinMediaSourceImagesURLItem obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["link"] == output["link"]);



}


void test_PinMediaSourceImagesURLItem_title_is_converted_to_json()
{

    bourne::json input =
    {
        "title", "hello"
    };

    PinMediaSourceImagesURLItem obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["title"] == output["title"]);



}


void test_PinMediaSourceImagesURLItem_url_is_converted_to_json()
{

    bourne::json input =
    {
        "url", "hello"
    };

    PinMediaSourceImagesURLItem obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["url"] == output["url"]);



}


