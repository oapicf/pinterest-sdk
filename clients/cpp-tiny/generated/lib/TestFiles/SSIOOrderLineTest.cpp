
#include "SSIOOrderLine.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_SSIOOrderLine_accepted_terms_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "accepted_terms_id", "hello"
    };

    SSIOOrderLine obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAcceptedTermsId().c_str());






}


void test_SSIOOrderLine_accepted_terms_time_is_assigned_from_json()
{


    bourne::json input =
    {
        "accepted_terms_time", "hello"
    };

    SSIOOrderLine obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAcceptedTermsTime().c_str());






}


void test_SSIOOrderLine_ads_manager_order_line_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "ads_manager_order_line_id", "hello"
    };

    SSIOOrderLine obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAdsManagerOrderLineId().c_str());






}


void test_SSIOOrderLine_agency_link_is_assigned_from_json()
{


    bourne::json input =
    {
        "agency_link", "hello"
    };

    SSIOOrderLine obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAgencyLink().c_str());






}


void test_SSIOOrderLine_bill_to_company_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "bill_to_company_name", "hello"
    };

    SSIOOrderLine obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBillToCompanyName().c_str());






}


void test_SSIOOrderLine_billing_contact_email_is_assigned_from_json()
{


    bourne::json input =
    {
        "billing_contact_email", "hello"
    };

    SSIOOrderLine obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBillingContactEmail().c_str());






}


void test_SSIOOrderLine_billing_contact_firstname_is_assigned_from_json()
{


    bourne::json input =
    {
        "billing_contact_firstname", "hello"
    };

    SSIOOrderLine obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBillingContactFirstname().c_str());






}


void test_SSIOOrderLine_billing_contact_lastname_is_assigned_from_json()
{


    bourne::json input =
    {
        "billing_contact_lastname", "hello"
    };

    SSIOOrderLine obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBillingContactLastname().c_str());






}


void test_SSIOOrderLine_budget_amount_is_assigned_from_json()
{








}




void test_SSIOOrderLine_estimated_monthly_spend_is_assigned_from_json()
{








}


void test_SSIOOrderLine_last_modified_date_time_is_assigned_from_json()
{


    bourne::json input =
    {
        "last_modified_date_time", "hello"
    };

    SSIOOrderLine obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLastModifiedDateTime().c_str());






}


void test_SSIOOrderLine_media_contact_email_is_assigned_from_json()
{


    bourne::json input =
    {
        "media_contact_email", "hello"
    };

    SSIOOrderLine obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMediaContactEmail().c_str());






}


void test_SSIOOrderLine_media_contact_firstname_is_assigned_from_json()
{


    bourne::json input =
    {
        "media_contact_firstname", "hello"
    };

    SSIOOrderLine obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMediaContactFirstname().c_str());






}


void test_SSIOOrderLine_media_contact_lastname_is_assigned_from_json()
{


    bourne::json input =
    {
        "media_contact_lastname", "hello"
    };

    SSIOOrderLine obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMediaContactLastname().c_str());






}


void test_SSIOOrderLine_order_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "order_name", "hello"
    };

    SSIOOrderLine obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOrderName().c_str());






}


void test_SSIOOrderLine_pin_order_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "pin_order_id", "hello"
    };

    SSIOOrderLine obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPinOrderId().c_str());






}


void test_SSIOOrderLine_pmp_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "pmp_name", "hello"
    };

    SSIOOrderLine obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPmpName().c_str());






}


void test_SSIOOrderLine_po_number_is_assigned_from_json()
{


    bourne::json input =
    {
        "po_number", "hello"
    };

    SSIOOrderLine obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPoNumber().c_str());






}


void test_SSIOOrderLine_salesforce_order_line_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "salesforce_order_line_id", "hello"
    };

    SSIOOrderLine obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSalesforceOrderLineId().c_str());






}




void test_SSIOOrderLine_accepted_terms_id_is_converted_to_json()
{

    bourne::json input =
    {
        "accepted_terms_id", "hello"
    };

    SSIOOrderLine obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["accepted_terms_id"] == output["accepted_terms_id"]);



}


void test_SSIOOrderLine_accepted_terms_time_is_converted_to_json()
{

    bourne::json input =
    {
        "accepted_terms_time", "hello"
    };

    SSIOOrderLine obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["accepted_terms_time"] == output["accepted_terms_time"]);



}


void test_SSIOOrderLine_ads_manager_order_line_id_is_converted_to_json()
{

    bourne::json input =
    {
        "ads_manager_order_line_id", "hello"
    };

    SSIOOrderLine obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["ads_manager_order_line_id"] == output["ads_manager_order_line_id"]);



}


void test_SSIOOrderLine_agency_link_is_converted_to_json()
{

    bourne::json input =
    {
        "agency_link", "hello"
    };

    SSIOOrderLine obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["agency_link"] == output["agency_link"]);



}


void test_SSIOOrderLine_bill_to_company_name_is_converted_to_json()
{

    bourne::json input =
    {
        "bill_to_company_name", "hello"
    };

    SSIOOrderLine obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["bill_to_company_name"] == output["bill_to_company_name"]);



}


void test_SSIOOrderLine_billing_contact_email_is_converted_to_json()
{

    bourne::json input =
    {
        "billing_contact_email", "hello"
    };

    SSIOOrderLine obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["billing_contact_email"] == output["billing_contact_email"]);



}


void test_SSIOOrderLine_billing_contact_firstname_is_converted_to_json()
{

    bourne::json input =
    {
        "billing_contact_firstname", "hello"
    };

    SSIOOrderLine obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["billing_contact_firstname"] == output["billing_contact_firstname"]);



}


void test_SSIOOrderLine_billing_contact_lastname_is_converted_to_json()
{

    bourne::json input =
    {
        "billing_contact_lastname", "hello"
    };

    SSIOOrderLine obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["billing_contact_lastname"] == output["billing_contact_lastname"]);



}


void test_SSIOOrderLine_budget_amount_is_converted_to_json()
{




}




void test_SSIOOrderLine_estimated_monthly_spend_is_converted_to_json()
{




}


void test_SSIOOrderLine_last_modified_date_time_is_converted_to_json()
{

    bourne::json input =
    {
        "last_modified_date_time", "hello"
    };

    SSIOOrderLine obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["last_modified_date_time"] == output["last_modified_date_time"]);



}


void test_SSIOOrderLine_media_contact_email_is_converted_to_json()
{

    bourne::json input =
    {
        "media_contact_email", "hello"
    };

    SSIOOrderLine obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["media_contact_email"] == output["media_contact_email"]);



}


void test_SSIOOrderLine_media_contact_firstname_is_converted_to_json()
{

    bourne::json input =
    {
        "media_contact_firstname", "hello"
    };

    SSIOOrderLine obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["media_contact_firstname"] == output["media_contact_firstname"]);



}


void test_SSIOOrderLine_media_contact_lastname_is_converted_to_json()
{

    bourne::json input =
    {
        "media_contact_lastname", "hello"
    };

    SSIOOrderLine obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["media_contact_lastname"] == output["media_contact_lastname"]);



}


void test_SSIOOrderLine_order_name_is_converted_to_json()
{

    bourne::json input =
    {
        "order_name", "hello"
    };

    SSIOOrderLine obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["order_name"] == output["order_name"]);



}


void test_SSIOOrderLine_pin_order_id_is_converted_to_json()
{

    bourne::json input =
    {
        "pin_order_id", "hello"
    };

    SSIOOrderLine obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["pin_order_id"] == output["pin_order_id"]);



}


void test_SSIOOrderLine_pmp_name_is_converted_to_json()
{

    bourne::json input =
    {
        "pmp_name", "hello"
    };

    SSIOOrderLine obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["pmp_name"] == output["pmp_name"]);



}


void test_SSIOOrderLine_po_number_is_converted_to_json()
{

    bourne::json input =
    {
        "po_number", "hello"
    };

    SSIOOrderLine obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["po_number"] == output["po_number"]);



}


void test_SSIOOrderLine_salesforce_order_line_id_is_converted_to_json()
{

    bourne::json input =
    {
        "salesforce_order_line_id", "hello"
    };

    SSIOOrderLine obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["salesforce_order_line_id"] == output["salesforce_order_line_id"]);



}



