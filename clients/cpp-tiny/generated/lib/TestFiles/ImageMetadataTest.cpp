
#include "ImageMetadata.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ImageMetadata_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "description", "hello"
    };

    ImageMetadata obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}



void test_ImageMetadata_item_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "item_type", "hello"
    };

    ImageMetadata obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getItemType().c_str());






}


void test_ImageMetadata_link_is_assigned_from_json()
{


    bourne::json input =
    {
        "link", "hello"
    };

    ImageMetadata obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLink().c_str());






}


void test_ImageMetadata_title_is_assigned_from_json()
{


    bourne::json input =
    {
        "title", "hello"
    };

    ImageMetadata obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getTitle().c_str());






}



void test_ImageMetadata_description_is_converted_to_json()
{

    bourne::json input =
    {
        "description", "hello"
    };

    ImageMetadata obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}



void test_ImageMetadata_item_type_is_converted_to_json()
{

    bourne::json input =
    {
        "item_type", "hello"
    };

    ImageMetadata obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["item_type"] == output["item_type"]);



}


void test_ImageMetadata_link_is_converted_to_json()
{

    bourne::json input =
    {
        "link", "hello"
    };

    ImageMetadata obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["link"] == output["link"]);



}


void test_ImageMetadata_title_is_converted_to_json()
{

    bourne::json input =
    {
        "title", "hello"
    };

    ImageMetadata obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["title"] == output["title"]);



}


