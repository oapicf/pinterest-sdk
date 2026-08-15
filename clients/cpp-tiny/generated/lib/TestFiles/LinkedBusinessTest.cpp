
#include "LinkedBusiness.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_LinkedBusiness_image_large_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "image_large_url", "hello"
    };

    LinkedBusiness obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getImageLargeUrl().c_str());






}


void test_LinkedBusiness_image_medium_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "image_medium_url", "hello"
    };

    LinkedBusiness obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getImageMediumUrl().c_str());






}


void test_LinkedBusiness_image_small_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "image_small_url", "hello"
    };

    LinkedBusiness obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getImageSmallUrl().c_str());






}


void test_LinkedBusiness_image_xlarge_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "image_xlarge_url", "hello"
    };

    LinkedBusiness obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getImageXlargeUrl().c_str());






}


void test_LinkedBusiness_username_is_assigned_from_json()
{


    bourne::json input =
    {
        "username", "hello"
    };

    LinkedBusiness obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUsername().c_str());






}



void test_LinkedBusiness_image_large_url_is_converted_to_json()
{

    bourne::json input =
    {
        "image_large_url", "hello"
    };

    LinkedBusiness obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["image_large_url"] == output["image_large_url"]);



}


void test_LinkedBusiness_image_medium_url_is_converted_to_json()
{

    bourne::json input =
    {
        "image_medium_url", "hello"
    };

    LinkedBusiness obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["image_medium_url"] == output["image_medium_url"]);



}


void test_LinkedBusiness_image_small_url_is_converted_to_json()
{

    bourne::json input =
    {
        "image_small_url", "hello"
    };

    LinkedBusiness obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["image_small_url"] == output["image_small_url"]);



}


void test_LinkedBusiness_image_xlarge_url_is_converted_to_json()
{

    bourne::json input =
    {
        "image_xlarge_url", "hello"
    };

    LinkedBusiness obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["image_xlarge_url"] == output["image_xlarge_url"]);



}


void test_LinkedBusiness_username_is_converted_to_json()
{

    bourne::json input =
    {
        "username", "hello"
    };

    LinkedBusiness obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["username"] == output["username"]);



}


