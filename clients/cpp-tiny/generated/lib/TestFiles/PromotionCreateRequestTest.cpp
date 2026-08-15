
#include "PromotionCreateRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PromotionCreateRequest_discount_status_is_assigned_from_json()
{


    bourne::json input =
    {
        "discount_status", "hello"
    };

    PromotionCreateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDiscountStatus().c_str());






}


void test_PromotionCreateRequest_end_time_is_assigned_from_json()
{
    bourne::json input =
    {
        "end_time", 1
    };

    PromotionCreateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getEndTime());








}


void test_PromotionCreateRequest_external_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "external_id", "hello"
    };

    PromotionCreateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getExternalId().c_str());






}


void test_PromotionCreateRequest_platform_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "platform_type", "hello"
    };

    PromotionCreateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPlatformType().c_str());






}


void test_PromotionCreateRequest_promotion_code_is_assigned_from_json()
{


    bourne::json input =
    {
        "promotion_code", "hello"
    };

    PromotionCreateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPromotionCode().c_str());






}


void test_PromotionCreateRequest_promotion_custom_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "promotion_custom_id", "hello"
    };

    PromotionCreateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPromotionCustomId().c_str());






}


void test_PromotionCreateRequest_promotion_title_is_assigned_from_json()
{


    bourne::json input =
    {
        "promotion_title", "hello"
    };

    PromotionCreateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPromotionTitle().c_str());






}



void test_PromotionCreateRequest_start_time_is_assigned_from_json()
{
    bourne::json input =
    {
        "start_time", 1
    };

    PromotionCreateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getStartTime());








}




void test_PromotionCreateRequest_discount_status_is_converted_to_json()
{

    bourne::json input =
    {
        "discount_status", "hello"
    };

    PromotionCreateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["discount_status"] == output["discount_status"]);



}


void test_PromotionCreateRequest_end_time_is_converted_to_json()
{
    bourne::json input =
    {
        "end_time", 1
    };

    PromotionCreateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["end_time"] == output["end_time"]);




}


void test_PromotionCreateRequest_external_id_is_converted_to_json()
{

    bourne::json input =
    {
        "external_id", "hello"
    };

    PromotionCreateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["external_id"] == output["external_id"]);



}


void test_PromotionCreateRequest_platform_type_is_converted_to_json()
{

    bourne::json input =
    {
        "platform_type", "hello"
    };

    PromotionCreateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["platform_type"] == output["platform_type"]);



}


void test_PromotionCreateRequest_promotion_code_is_converted_to_json()
{

    bourne::json input =
    {
        "promotion_code", "hello"
    };

    PromotionCreateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["promotion_code"] == output["promotion_code"]);



}


void test_PromotionCreateRequest_promotion_custom_id_is_converted_to_json()
{

    bourne::json input =
    {
        "promotion_custom_id", "hello"
    };

    PromotionCreateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["promotion_custom_id"] == output["promotion_custom_id"]);



}


void test_PromotionCreateRequest_promotion_title_is_converted_to_json()
{

    bourne::json input =
    {
        "promotion_title", "hello"
    };

    PromotionCreateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["promotion_title"] == output["promotion_title"]);



}



void test_PromotionCreateRequest_start_time_is_converted_to_json()
{
    bourne::json input =
    {
        "start_time", 1
    };

    PromotionCreateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["start_time"] == output["start_time"]);




}



