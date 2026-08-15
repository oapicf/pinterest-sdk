
#include "SSIOEditInsertionOrderRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_SSIOEditInsertionOrderRequest_agency_link_is_assigned_from_json()
{


    bourne::json input =
    {
        "agency_link", "hello"
    };

    SSIOEditInsertionOrderRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAgencyLink().c_str());






}


void test_SSIOEditInsertionOrderRequest_billing_contact_email_is_assigned_from_json()
{


    bourne::json input =
    {
        "billing_contact_email", "hello"
    };

    SSIOEditInsertionOrderRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBillingContactEmail().c_str());






}


void test_SSIOEditInsertionOrderRequest_billing_contact_firstname_is_assigned_from_json()
{


    bourne::json input =
    {
        "billing_contact_firstname", "hello"
    };

    SSIOEditInsertionOrderRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBillingContactFirstname().c_str());






}


void test_SSIOEditInsertionOrderRequest_billing_contact_lastname_is_assigned_from_json()
{


    bourne::json input =
    {
        "billing_contact_lastname", "hello"
    };

    SSIOEditInsertionOrderRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBillingContactLastname().c_str());






}


void test_SSIOEditInsertionOrderRequest_budget_amount_is_assigned_from_json()
{








}


void test_SSIOEditInsertionOrderRequest_end_date_is_assigned_from_json()
{


    bourne::json input =
    {
        "end_date", "hello"
    };

    SSIOEditInsertionOrderRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEndDate().c_str());






}


void test_SSIOEditInsertionOrderRequest_media_contact_email_is_assigned_from_json()
{


    bourne::json input =
    {
        "media_contact_email", "hello"
    };

    SSIOEditInsertionOrderRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMediaContactEmail().c_str());






}


void test_SSIOEditInsertionOrderRequest_media_contact_firstname_is_assigned_from_json()
{


    bourne::json input =
    {
        "media_contact_firstname", "hello"
    };

    SSIOEditInsertionOrderRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMediaContactFirstname().c_str());






}


void test_SSIOEditInsertionOrderRequest_media_contact_lastname_is_assigned_from_json()
{


    bourne::json input =
    {
        "media_contact_lastname", "hello"
    };

    SSIOEditInsertionOrderRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMediaContactLastname().c_str());






}


void test_SSIOEditInsertionOrderRequest_po_number_is_assigned_from_json()
{


    bourne::json input =
    {
        "po_number", "hello"
    };

    SSIOEditInsertionOrderRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPoNumber().c_str());






}


void test_SSIOEditInsertionOrderRequest_start_date_is_assigned_from_json()
{


    bourne::json input =
    {
        "start_date", "hello"
    };

    SSIOEditInsertionOrderRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getStartDate().c_str());






}


void test_SSIOEditInsertionOrderRequest_user_email_is_assigned_from_json()
{


    bourne::json input =
    {
        "user_email", "hello"
    };

    SSIOEditInsertionOrderRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUserEmail().c_str());






}


void test_SSIOEditInsertionOrderRequest_ads_manager_order_line_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "ads_manager_order_line_id", "hello"
    };

    SSIOEditInsertionOrderRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAdsManagerOrderLineId().c_str());






}


void test_SSIOEditInsertionOrderRequest_oracle_line_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "oracle_line_id", "hello"
    };

    SSIOEditInsertionOrderRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOracleLineId().c_str());






}


void test_SSIOEditInsertionOrderRequest_salesforce_order_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "salesforce_order_id", "hello"
    };

    SSIOEditInsertionOrderRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSalesforceOrderId().c_str());






}


void test_SSIOEditInsertionOrderRequest_salesforce_order_line_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "salesforce_order_line_id", "hello"
    };

    SSIOEditInsertionOrderRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSalesforceOrderLineId().c_str());






}



void test_SSIOEditInsertionOrderRequest_agency_link_is_converted_to_json()
{

    bourne::json input =
    {
        "agency_link", "hello"
    };

    SSIOEditInsertionOrderRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["agency_link"] == output["agency_link"]);



}


void test_SSIOEditInsertionOrderRequest_billing_contact_email_is_converted_to_json()
{

    bourne::json input =
    {
        "billing_contact_email", "hello"
    };

    SSIOEditInsertionOrderRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["billing_contact_email"] == output["billing_contact_email"]);



}


void test_SSIOEditInsertionOrderRequest_billing_contact_firstname_is_converted_to_json()
{

    bourne::json input =
    {
        "billing_contact_firstname", "hello"
    };

    SSIOEditInsertionOrderRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["billing_contact_firstname"] == output["billing_contact_firstname"]);



}


void test_SSIOEditInsertionOrderRequest_billing_contact_lastname_is_converted_to_json()
{

    bourne::json input =
    {
        "billing_contact_lastname", "hello"
    };

    SSIOEditInsertionOrderRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["billing_contact_lastname"] == output["billing_contact_lastname"]);



}


void test_SSIOEditInsertionOrderRequest_budget_amount_is_converted_to_json()
{




}


void test_SSIOEditInsertionOrderRequest_end_date_is_converted_to_json()
{

    bourne::json input =
    {
        "end_date", "hello"
    };

    SSIOEditInsertionOrderRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["end_date"] == output["end_date"]);



}


void test_SSIOEditInsertionOrderRequest_media_contact_email_is_converted_to_json()
{

    bourne::json input =
    {
        "media_contact_email", "hello"
    };

    SSIOEditInsertionOrderRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["media_contact_email"] == output["media_contact_email"]);



}


void test_SSIOEditInsertionOrderRequest_media_contact_firstname_is_converted_to_json()
{

    bourne::json input =
    {
        "media_contact_firstname", "hello"
    };

    SSIOEditInsertionOrderRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["media_contact_firstname"] == output["media_contact_firstname"]);



}


void test_SSIOEditInsertionOrderRequest_media_contact_lastname_is_converted_to_json()
{

    bourne::json input =
    {
        "media_contact_lastname", "hello"
    };

    SSIOEditInsertionOrderRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["media_contact_lastname"] == output["media_contact_lastname"]);



}


void test_SSIOEditInsertionOrderRequest_po_number_is_converted_to_json()
{

    bourne::json input =
    {
        "po_number", "hello"
    };

    SSIOEditInsertionOrderRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["po_number"] == output["po_number"]);



}


void test_SSIOEditInsertionOrderRequest_start_date_is_converted_to_json()
{

    bourne::json input =
    {
        "start_date", "hello"
    };

    SSIOEditInsertionOrderRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["start_date"] == output["start_date"]);



}


void test_SSIOEditInsertionOrderRequest_user_email_is_converted_to_json()
{

    bourne::json input =
    {
        "user_email", "hello"
    };

    SSIOEditInsertionOrderRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["user_email"] == output["user_email"]);



}


void test_SSIOEditInsertionOrderRequest_ads_manager_order_line_id_is_converted_to_json()
{

    bourne::json input =
    {
        "ads_manager_order_line_id", "hello"
    };

    SSIOEditInsertionOrderRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["ads_manager_order_line_id"] == output["ads_manager_order_line_id"]);



}


void test_SSIOEditInsertionOrderRequest_oracle_line_id_is_converted_to_json()
{

    bourne::json input =
    {
        "oracle_line_id", "hello"
    };

    SSIOEditInsertionOrderRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["oracle_line_id"] == output["oracle_line_id"]);



}


void test_SSIOEditInsertionOrderRequest_salesforce_order_id_is_converted_to_json()
{

    bourne::json input =
    {
        "salesforce_order_id", "hello"
    };

    SSIOEditInsertionOrderRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["salesforce_order_id"] == output["salesforce_order_id"]);



}


void test_SSIOEditInsertionOrderRequest_salesforce_order_line_id_is_converted_to_json()
{

    bourne::json input =
    {
        "salesforce_order_line_id", "hello"
    };

    SSIOEditInsertionOrderRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["salesforce_order_line_id"] == output["salesforce_order_line_id"]);



}


