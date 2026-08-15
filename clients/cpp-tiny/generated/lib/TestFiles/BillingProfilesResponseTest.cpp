
#include "BillingProfilesResponse.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_BillingProfilesResponse_advertiser_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "advertiser_id", "hello"
    };

    BillingProfilesResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAdvertiserId().c_str());






}


void test_BillingProfilesResponse_billing_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "billing_type", "hello"
    };

    BillingProfilesResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBillingType().c_str());






}


void test_BillingProfilesResponse_card_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "card_type", "hello"
    };

    BillingProfilesResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCardType().c_str());






}


void test_BillingProfilesResponse_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    BillingProfilesResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_BillingProfilesResponse_payment_method_brand_is_assigned_from_json()
{


    bourne::json input =
    {
        "payment_method_brand", "hello"
    };

    BillingProfilesResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPaymentMethodBrand().c_str());






}


void test_BillingProfilesResponse_status_is_assigned_from_json()
{


    bourne::json input =
    {
        "status", "hello"
    };

    BillingProfilesResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getStatus().c_str());






}



void test_BillingProfilesResponse_advertiser_id_is_converted_to_json()
{

    bourne::json input =
    {
        "advertiser_id", "hello"
    };

    BillingProfilesResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["advertiser_id"] == output["advertiser_id"]);



}


void test_BillingProfilesResponse_billing_type_is_converted_to_json()
{

    bourne::json input =
    {
        "billing_type", "hello"
    };

    BillingProfilesResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["billing_type"] == output["billing_type"]);



}


void test_BillingProfilesResponse_card_type_is_converted_to_json()
{

    bourne::json input =
    {
        "card_type", "hello"
    };

    BillingProfilesResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["card_type"] == output["card_type"]);



}


void test_BillingProfilesResponse_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    BillingProfilesResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_BillingProfilesResponse_payment_method_brand_is_converted_to_json()
{

    bourne::json input =
    {
        "payment_method_brand", "hello"
    };

    BillingProfilesResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["payment_method_brand"] == output["payment_method_brand"]);



}


void test_BillingProfilesResponse_status_is_converted_to_json()
{

    bourne::json input =
    {
        "status", "hello"
    };

    BillingProfilesResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["status"] == output["status"]);



}


