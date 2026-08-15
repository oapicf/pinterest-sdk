
#include "Account.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_Account_about_is_assigned_from_json()
{


    bourne::json input =
    {
        "about", "hello"
    };

    Account obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAbout().c_str());






}


void test_Account_account_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "account_type", "hello"
    };

    Account obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAccountType().c_str());






}


void test_Account_board_count_is_assigned_from_json()
{
    bourne::json input =
    {
        "board_count", 1
    };

    Account obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getBoardCount());








}


void test_Account_business_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "business_name", "hello"
    };

    Account obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBusinessName().c_str());






}


void test_Account_follower_count_is_assigned_from_json()
{
    bourne::json input =
    {
        "follower_count", 1
    };

    Account obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getFollowerCount());








}


void test_Account_following_count_is_assigned_from_json()
{
    bourne::json input =
    {
        "following_count", 1
    };

    Account obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getFollowingCount());








}


void test_Account_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    Account obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_Account_monthly_views_is_assigned_from_json()
{
    bourne::json input =
    {
        "monthly_views", 1
    };

    Account obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMonthlyViews());








}


void test_Account_pin_count_is_assigned_from_json()
{
    bourne::json input =
    {
        "pin_count", 1
    };

    Account obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPinCount());








}


void test_Account_profile_image_is_assigned_from_json()
{


    bourne::json input =
    {
        "profile_image", "hello"
    };

    Account obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getProfileImage().c_str());






}


void test_Account_username_is_assigned_from_json()
{


    bourne::json input =
    {
        "username", "hello"
    };

    Account obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUsername().c_str());






}


void test_Account_website_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "website_url", "hello"
    };

    Account obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getWebsiteUrl().c_str());






}



void test_Account_about_is_converted_to_json()
{

    bourne::json input =
    {
        "about", "hello"
    };

    Account obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["about"] == output["about"]);



}


void test_Account_account_type_is_converted_to_json()
{

    bourne::json input =
    {
        "account_type", "hello"
    };

    Account obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["account_type"] == output["account_type"]);



}


void test_Account_board_count_is_converted_to_json()
{
    bourne::json input =
    {
        "board_count", 1
    };

    Account obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["board_count"] == output["board_count"]);




}


void test_Account_business_name_is_converted_to_json()
{

    bourne::json input =
    {
        "business_name", "hello"
    };

    Account obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["business_name"] == output["business_name"]);



}


void test_Account_follower_count_is_converted_to_json()
{
    bourne::json input =
    {
        "follower_count", 1
    };

    Account obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["follower_count"] == output["follower_count"]);




}


void test_Account_following_count_is_converted_to_json()
{
    bourne::json input =
    {
        "following_count", 1
    };

    Account obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["following_count"] == output["following_count"]);




}


void test_Account_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    Account obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_Account_monthly_views_is_converted_to_json()
{
    bourne::json input =
    {
        "monthly_views", 1
    };

    Account obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["monthly_views"] == output["monthly_views"]);




}


void test_Account_pin_count_is_converted_to_json()
{
    bourne::json input =
    {
        "pin_count", 1
    };

    Account obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["pin_count"] == output["pin_count"]);




}


void test_Account_profile_image_is_converted_to_json()
{

    bourne::json input =
    {
        "profile_image", "hello"
    };

    Account obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["profile_image"] == output["profile_image"]);



}


void test_Account_username_is_converted_to_json()
{

    bourne::json input =
    {
        "username", "hello"
    };

    Account obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["username"] == output["username"]);



}


void test_Account_website_url_is_converted_to_json()
{

    bourne::json input =
    {
        "website_url", "hello"
    };

    Account obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["website_url"] == output["website_url"]);



}


