
#include "CatalogsUpdatableCreativeAssetsAttributes.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CatalogsUpdatableCreativeAssetsAttributes_android_deep_link_is_assigned_from_json()
{


    bourne::json input =
    {
        "android_deep_link", "hello"
    };

    CatalogsUpdatableCreativeAssetsAttributes obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAndroidDeepLink().c_str());






}


void test_CatalogsUpdatableCreativeAssetsAttributes_custom_label_0_is_assigned_from_json()
{


    bourne::json input =
    {
        "custom_label_0", "hello"
    };

    CatalogsUpdatableCreativeAssetsAttributes obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCustomLabel0().c_str());






}


void test_CatalogsUpdatableCreativeAssetsAttributes_custom_label_1_is_assigned_from_json()
{


    bourne::json input =
    {
        "custom_label_1", "hello"
    };

    CatalogsUpdatableCreativeAssetsAttributes obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCustomLabel1().c_str());






}


void test_CatalogsUpdatableCreativeAssetsAttributes_custom_label_2_is_assigned_from_json()
{


    bourne::json input =
    {
        "custom_label_2", "hello"
    };

    CatalogsUpdatableCreativeAssetsAttributes obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCustomLabel2().c_str());






}


void test_CatalogsUpdatableCreativeAssetsAttributes_custom_label_3_is_assigned_from_json()
{


    bourne::json input =
    {
        "custom_label_3", "hello"
    };

    CatalogsUpdatableCreativeAssetsAttributes obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCustomLabel3().c_str());






}


void test_CatalogsUpdatableCreativeAssetsAttributes_custom_label_4_is_assigned_from_json()
{


    bourne::json input =
    {
        "custom_label_4", "hello"
    };

    CatalogsUpdatableCreativeAssetsAttributes obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCustomLabel4().c_str());






}


void test_CatalogsUpdatableCreativeAssetsAttributes_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "description", "hello"
    };

    CatalogsUpdatableCreativeAssetsAttributes obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}


void test_CatalogsUpdatableCreativeAssetsAttributes_google_product_category_is_assigned_from_json()
{


    bourne::json input =
    {
        "google_product_category", "hello"
    };

    CatalogsUpdatableCreativeAssetsAttributes obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getGoogleProductCategory().c_str());






}


void test_CatalogsUpdatableCreativeAssetsAttributes_ios_deep_link_is_assigned_from_json()
{


    bourne::json input =
    {
        "ios_deep_link", "hello"
    };

    CatalogsUpdatableCreativeAssetsAttributes obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getIosDeepLink().c_str());






}


void test_CatalogsUpdatableCreativeAssetsAttributes_link_is_assigned_from_json()
{


    bourne::json input =
    {
        "link", "hello"
    };

    CatalogsUpdatableCreativeAssetsAttributes obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLink().c_str());






}


void test_CatalogsUpdatableCreativeAssetsAttributes_title_is_assigned_from_json()
{


    bourne::json input =
    {
        "title", "hello"
    };

    CatalogsUpdatableCreativeAssetsAttributes obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getTitle().c_str());






}


void test_CatalogsUpdatableCreativeAssetsAttributes_visibility_is_assigned_from_json()
{


    bourne::json input =
    {
        "visibility", "hello"
    };

    CatalogsUpdatableCreativeAssetsAttributes obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getVisibility().c_str());






}



void test_CatalogsUpdatableCreativeAssetsAttributes_android_deep_link_is_converted_to_json()
{

    bourne::json input =
    {
        "android_deep_link", "hello"
    };

    CatalogsUpdatableCreativeAssetsAttributes obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["android_deep_link"] == output["android_deep_link"]);



}


void test_CatalogsUpdatableCreativeAssetsAttributes_custom_label_0_is_converted_to_json()
{

    bourne::json input =
    {
        "custom_label_0", "hello"
    };

    CatalogsUpdatableCreativeAssetsAttributes obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["custom_label_0"] == output["custom_label_0"]);



}


void test_CatalogsUpdatableCreativeAssetsAttributes_custom_label_1_is_converted_to_json()
{

    bourne::json input =
    {
        "custom_label_1", "hello"
    };

    CatalogsUpdatableCreativeAssetsAttributes obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["custom_label_1"] == output["custom_label_1"]);



}


void test_CatalogsUpdatableCreativeAssetsAttributes_custom_label_2_is_converted_to_json()
{

    bourne::json input =
    {
        "custom_label_2", "hello"
    };

    CatalogsUpdatableCreativeAssetsAttributes obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["custom_label_2"] == output["custom_label_2"]);



}


void test_CatalogsUpdatableCreativeAssetsAttributes_custom_label_3_is_converted_to_json()
{

    bourne::json input =
    {
        "custom_label_3", "hello"
    };

    CatalogsUpdatableCreativeAssetsAttributes obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["custom_label_3"] == output["custom_label_3"]);



}


void test_CatalogsUpdatableCreativeAssetsAttributes_custom_label_4_is_converted_to_json()
{

    bourne::json input =
    {
        "custom_label_4", "hello"
    };

    CatalogsUpdatableCreativeAssetsAttributes obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["custom_label_4"] == output["custom_label_4"]);



}


void test_CatalogsUpdatableCreativeAssetsAttributes_description_is_converted_to_json()
{

    bourne::json input =
    {
        "description", "hello"
    };

    CatalogsUpdatableCreativeAssetsAttributes obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}


void test_CatalogsUpdatableCreativeAssetsAttributes_google_product_category_is_converted_to_json()
{

    bourne::json input =
    {
        "google_product_category", "hello"
    };

    CatalogsUpdatableCreativeAssetsAttributes obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["google_product_category"] == output["google_product_category"]);



}


void test_CatalogsUpdatableCreativeAssetsAttributes_ios_deep_link_is_converted_to_json()
{

    bourne::json input =
    {
        "ios_deep_link", "hello"
    };

    CatalogsUpdatableCreativeAssetsAttributes obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["ios_deep_link"] == output["ios_deep_link"]);



}


void test_CatalogsUpdatableCreativeAssetsAttributes_link_is_converted_to_json()
{

    bourne::json input =
    {
        "link", "hello"
    };

    CatalogsUpdatableCreativeAssetsAttributes obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["link"] == output["link"]);



}


void test_CatalogsUpdatableCreativeAssetsAttributes_title_is_converted_to_json()
{

    bourne::json input =
    {
        "title", "hello"
    };

    CatalogsUpdatableCreativeAssetsAttributes obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["title"] == output["title"]);



}


void test_CatalogsUpdatableCreativeAssetsAttributes_visibility_is_converted_to_json()
{

    bourne::json input =
    {
        "visibility", "hello"
    };

    CatalogsUpdatableCreativeAssetsAttributes obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["visibility"] == output["visibility"]);



}


