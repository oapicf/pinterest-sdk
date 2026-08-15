
#include "AdsCreditDiscountsResponse.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_AdsCreditDiscountsResponse_active_is_assigned_from_json()
{




    bourne::json input =
    {
        "active", true
    };

    AdsCreditDiscountsResponse obj(input.dump());

    TEST_ASSERT(true == obj.isActive());




}


void test_AdsCreditDiscountsResponse_advertiser_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "advertiser_id", "hello"
    };

    AdsCreditDiscountsResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAdvertiserId().c_str());






}


void test_AdsCreditDiscountsResponse_discountCurrency_is_assigned_from_json()
{


    bourne::json input =
    {
        "discountCurrency", "hello"
    };

    AdsCreditDiscountsResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDiscountCurrency().c_str());






}


void test_AdsCreditDiscountsResponse_discountInMicroCurrency_is_assigned_from_json()
{








}


void test_AdsCreditDiscountsResponse_discountType_is_assigned_from_json()
{


    bourne::json input =
    {
        "discountType", "hello"
    };

    AdsCreditDiscountsResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDiscountType().c_str());






}


void test_AdsCreditDiscountsResponse_remainingDiscountInMicroCurrency_is_assigned_from_json()
{








}


void test_AdsCreditDiscountsResponse_title_is_assigned_from_json()
{


    bourne::json input =
    {
        "title", "hello"
    };

    AdsCreditDiscountsResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getTitle().c_str());






}



void test_AdsCreditDiscountsResponse_active_is_converted_to_json()
{


    bourne::json input =
    {
        "active", true
    };

    AdsCreditDiscountsResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["active"] == output["active"]);


}


void test_AdsCreditDiscountsResponse_advertiser_id_is_converted_to_json()
{

    bourne::json input =
    {
        "advertiser_id", "hello"
    };

    AdsCreditDiscountsResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["advertiser_id"] == output["advertiser_id"]);



}


void test_AdsCreditDiscountsResponse_discountCurrency_is_converted_to_json()
{

    bourne::json input =
    {
        "discountCurrency", "hello"
    };

    AdsCreditDiscountsResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["discountCurrency"] == output["discountCurrency"]);



}


void test_AdsCreditDiscountsResponse_discountInMicroCurrency_is_converted_to_json()
{




}


void test_AdsCreditDiscountsResponse_discountType_is_converted_to_json()
{

    bourne::json input =
    {
        "discountType", "hello"
    };

    AdsCreditDiscountsResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["discountType"] == output["discountType"]);



}


void test_AdsCreditDiscountsResponse_remainingDiscountInMicroCurrency_is_converted_to_json()
{




}


void test_AdsCreditDiscountsResponse_title_is_converted_to_json()
{

    bourne::json input =
    {
        "title", "hello"
    };

    AdsCreditDiscountsResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["title"] == output["title"]);



}


