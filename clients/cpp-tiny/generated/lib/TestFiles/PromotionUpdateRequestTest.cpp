
#include "PromotionUpdateRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PromotionUpdateRequest_discount_status_is_assigned_from_json()
{


    bourne::json input =
    {
        "discount_status", "hello"
    };

    PromotionUpdateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDiscountStatus().c_str());






}


void test_PromotionUpdateRequest_end_time_is_assigned_from_json()
{
    bourne::json input =
    {
        "end_time", 1
    };

    PromotionUpdateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getEndTime());








}


void test_PromotionUpdateRequest_external_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "external_id", "hello"
    };

    PromotionUpdateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getExternalId().c_str());






}


void test_PromotionUpdateRequest_platform_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "platform_type", "hello"
    };

    PromotionUpdateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPlatformType().c_str());






}


void test_PromotionUpdateRequest_promotion_code_is_assigned_from_json()
{


    bourne::json input =
    {
        "promotion_code", "hello"
    };

    PromotionUpdateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPromotionCode().c_str());






}


void test_PromotionUpdateRequest_promotion_custom_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "promotion_custom_id", "hello"
    };

    PromotionUpdateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPromotionCustomId().c_str());






}


void test_PromotionUpdateRequest_promotion_title_is_assigned_from_json()
{


    bourne::json input =
    {
        "promotion_title", "hello"
    };

    PromotionUpdateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPromotionTitle().c_str());






}



void test_PromotionUpdateRequest_start_time_is_assigned_from_json()
{
    bourne::json input =
    {
        "start_time", 1
    };

    PromotionUpdateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getStartTime());








}



void test_PromotionUpdateRequest_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    PromotionUpdateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}




void test_PromotionUpdateRequest_discount_status_is_converted_to_json()
{

    bourne::json input =
    {
        "discount_status", "hello"
    };

    PromotionUpdateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["discount_status"] == output["discount_status"]);



}


void test_PromotionUpdateRequest_end_time_is_converted_to_json()
{
    bourne::json input =
    {
        "end_time", 1
    };

    PromotionUpdateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["end_time"] == output["end_time"]);




}


void test_PromotionUpdateRequest_external_id_is_converted_to_json()
{

    bourne::json input =
    {
        "external_id", "hello"
    };

    PromotionUpdateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["external_id"] == output["external_id"]);



}


void test_PromotionUpdateRequest_platform_type_is_converted_to_json()
{

    bourne::json input =
    {
        "platform_type", "hello"
    };

    PromotionUpdateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["platform_type"] == output["platform_type"]);



}


void test_PromotionUpdateRequest_promotion_code_is_converted_to_json()
{

    bourne::json input =
    {
        "promotion_code", "hello"
    };

    PromotionUpdateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["promotion_code"] == output["promotion_code"]);



}


void test_PromotionUpdateRequest_promotion_custom_id_is_converted_to_json()
{

    bourne::json input =
    {
        "promotion_custom_id", "hello"
    };

    PromotionUpdateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["promotion_custom_id"] == output["promotion_custom_id"]);



}


void test_PromotionUpdateRequest_promotion_title_is_converted_to_json()
{

    bourne::json input =
    {
        "promotion_title", "hello"
    };

    PromotionUpdateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["promotion_title"] == output["promotion_title"]);



}



void test_PromotionUpdateRequest_start_time_is_converted_to_json()
{
    bourne::json input =
    {
        "start_time", 1
    };

    PromotionUpdateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["start_time"] == output["start_time"]);




}



void test_PromotionUpdateRequest_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    PromotionUpdateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}



