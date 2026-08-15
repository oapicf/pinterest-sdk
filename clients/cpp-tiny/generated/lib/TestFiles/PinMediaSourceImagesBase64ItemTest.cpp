
#include "PinMediaSourceImagesBase64Item.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_PinMediaSourceImagesBase64Item_data_is_assigned_from_json()
{


    bourne::json input =
    {
        "data", "hello"
    };

    PinMediaSourceImagesBase64Item obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getData().c_str());






}


void test_PinMediaSourceImagesBase64Item_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "description", "hello"
    };

    PinMediaSourceImagesBase64Item obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}


void test_PinMediaSourceImagesBase64Item_link_is_assigned_from_json()
{


    bourne::json input =
    {
        "link", "hello"
    };

    PinMediaSourceImagesBase64Item obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLink().c_str());






}


void test_PinMediaSourceImagesBase64Item_title_is_assigned_from_json()
{


    bourne::json input =
    {
        "title", "hello"
    };

    PinMediaSourceImagesBase64Item obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getTitle().c_str());






}




void test_PinMediaSourceImagesBase64Item_data_is_converted_to_json()
{

    bourne::json input =
    {
        "data", "hello"
    };

    PinMediaSourceImagesBase64Item obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["data"] == output["data"]);



}


void test_PinMediaSourceImagesBase64Item_description_is_converted_to_json()
{

    bourne::json input =
    {
        "description", "hello"
    };

    PinMediaSourceImagesBase64Item obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}


void test_PinMediaSourceImagesBase64Item_link_is_converted_to_json()
{

    bourne::json input =
    {
        "link", "hello"
    };

    PinMediaSourceImagesBase64Item obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["link"] == output["link"]);



}


void test_PinMediaSourceImagesBase64Item_title_is_converted_to_json()
{

    bourne::json input =
    {
        "title", "hello"
    };

    PinMediaSourceImagesBase64Item obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["title"] == output["title"]);



}


