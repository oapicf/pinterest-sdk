
#include "SSIOCreateInsertionOrderRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_SSIOCreateInsertionOrderRequest_agency_link_is_assigned_from_json()
{


    bourne::json input =
    {
        "agency_link", "hello"
    };

    SSIOCreateInsertionOrderRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAgencyLink().c_str());






}


void test_SSIOCreateInsertionOrderRequest_billing_contact_email_is_assigned_from_json()
{


    bourne::json input =
    {
        "billing_contact_email", "hello"
    };

    SSIOCreateInsertionOrderRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBillingContactEmail().c_str());






}


void test_SSIOCreateInsertionOrderRequest_billing_contact_firstname_is_assigned_from_json()
{


    bourne::json input =
    {
        "billing_contact_firstname", "hello"
    };

    SSIOCreateInsertionOrderRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBillingContactFirstname().c_str());






}


void test_SSIOCreateInsertionOrderRequest_billing_contact_lastname_is_assigned_from_json()
{


    bourne::json input =
    {
        "billing_contact_lastname", "hello"
    };

    SSIOCreateInsertionOrderRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBillingContactLastname().c_str());






}


void test_SSIOCreateInsertionOrderRequest_budget_amount_is_assigned_from_json()
{








}


void test_SSIOCreateInsertionOrderRequest_end_date_is_assigned_from_json()
{


    bourne::json input =
    {
        "end_date", "hello"
    };

    SSIOCreateInsertionOrderRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEndDate().c_str());






}


void test_SSIOCreateInsertionOrderRequest_media_contact_email_is_assigned_from_json()
{


    bourne::json input =
    {
        "media_contact_email", "hello"
    };

    SSIOCreateInsertionOrderRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMediaContactEmail().c_str());






}


void test_SSIOCreateInsertionOrderRequest_media_contact_firstname_is_assigned_from_json()
{


    bourne::json input =
    {
        "media_contact_firstname", "hello"
    };

    SSIOCreateInsertionOrderRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMediaContactFirstname().c_str());






}


void test_SSIOCreateInsertionOrderRequest_media_contact_lastname_is_assigned_from_json()
{


    bourne::json input =
    {
        "media_contact_lastname", "hello"
    };

    SSIOCreateInsertionOrderRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMediaContactLastname().c_str());






}


void test_SSIOCreateInsertionOrderRequest_po_number_is_assigned_from_json()
{


    bourne::json input =
    {
        "po_number", "hello"
    };

    SSIOCreateInsertionOrderRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPoNumber().c_str());






}


void test_SSIOCreateInsertionOrderRequest_start_date_is_assigned_from_json()
{


    bourne::json input =
    {
        "start_date", "hello"
    };

    SSIOCreateInsertionOrderRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getStartDate().c_str());






}


void test_SSIOCreateInsertionOrderRequest_user_email_is_assigned_from_json()
{


    bourne::json input =
    {
        "user_email", "hello"
    };

    SSIOCreateInsertionOrderRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUserEmail().c_str());






}


void test_SSIOCreateInsertionOrderRequest_accepted_terms_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "accepted_terms_id", "hello"
    };

    SSIOCreateInsertionOrderRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAcceptedTermsId().c_str());






}


void test_SSIOCreateInsertionOrderRequest_accepted_terms_time_is_assigned_from_json()
{
    bourne::json input =
    {
        "accepted_terms_time", 1
    };

    SSIOCreateInsertionOrderRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getAcceptedTermsTime());








}


void test_SSIOCreateInsertionOrderRequest_billto_billing_address_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "billto_billing_address_id", "hello"
    };

    SSIOCreateInsertionOrderRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBilltoBillingAddressId().c_str());






}


void test_SSIOCreateInsertionOrderRequest_billto_business_address_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "billto_business_address_id", "hello"
    };

    SSIOCreateInsertionOrderRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBilltoBusinessAddressId().c_str());






}


void test_SSIOCreateInsertionOrderRequest_billto_company_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "billto_company_id", "hello"
    };

    SSIOCreateInsertionOrderRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBilltoCompanyId().c_str());






}



void test_SSIOCreateInsertionOrderRequest_estimated_monthly_spend_is_assigned_from_json()
{








}


void test_SSIOCreateInsertionOrderRequest_order_line_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "order_line_type", "hello"
    };

    SSIOCreateInsertionOrderRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOrderLineType().c_str());






}


void test_SSIOCreateInsertionOrderRequest_order_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "order_name", "hello"
    };

    SSIOCreateInsertionOrderRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOrderName().c_str());






}


void test_SSIOCreateInsertionOrderRequest_pmp_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "pmp_id", "hello"
    };

    SSIOCreateInsertionOrderRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPmpId().c_str());






}



void test_SSIOCreateInsertionOrderRequest_agency_link_is_converted_to_json()
{

    bourne::json input =
    {
        "agency_link", "hello"
    };

    SSIOCreateInsertionOrderRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["agency_link"] == output["agency_link"]);



}


void test_SSIOCreateInsertionOrderRequest_billing_contact_email_is_converted_to_json()
{

    bourne::json input =
    {
        "billing_contact_email", "hello"
    };

    SSIOCreateInsertionOrderRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["billing_contact_email"] == output["billing_contact_email"]);



}


void test_SSIOCreateInsertionOrderRequest_billing_contact_firstname_is_converted_to_json()
{

    bourne::json input =
    {
        "billing_contact_firstname", "hello"
    };

    SSIOCreateInsertionOrderRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["billing_contact_firstname"] == output["billing_contact_firstname"]);



}


void test_SSIOCreateInsertionOrderRequest_billing_contact_lastname_is_converted_to_json()
{

    bourne::json input =
    {
        "billing_contact_lastname", "hello"
    };

    SSIOCreateInsertionOrderRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["billing_contact_lastname"] == output["billing_contact_lastname"]);



}


void test_SSIOCreateInsertionOrderRequest_budget_amount_is_converted_to_json()
{




}


void test_SSIOCreateInsertionOrderRequest_end_date_is_converted_to_json()
{

    bourne::json input =
    {
        "end_date", "hello"
    };

    SSIOCreateInsertionOrderRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["end_date"] == output["end_date"]);



}


void test_SSIOCreateInsertionOrderRequest_media_contact_email_is_converted_to_json()
{

    bourne::json input =
    {
        "media_contact_email", "hello"
    };

    SSIOCreateInsertionOrderRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["media_contact_email"] == output["media_contact_email"]);



}


void test_SSIOCreateInsertionOrderRequest_media_contact_firstname_is_converted_to_json()
{

    bourne::json input =
    {
        "media_contact_firstname", "hello"
    };

    SSIOCreateInsertionOrderRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["media_contact_firstname"] == output["media_contact_firstname"]);



}


void test_SSIOCreateInsertionOrderRequest_media_contact_lastname_is_converted_to_json()
{

    bourne::json input =
    {
        "media_contact_lastname", "hello"
    };

    SSIOCreateInsertionOrderRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["media_contact_lastname"] == output["media_contact_lastname"]);



}


void test_SSIOCreateInsertionOrderRequest_po_number_is_converted_to_json()
{

    bourne::json input =
    {
        "po_number", "hello"
    };

    SSIOCreateInsertionOrderRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["po_number"] == output["po_number"]);



}


void test_SSIOCreateInsertionOrderRequest_start_date_is_converted_to_json()
{

    bourne::json input =
    {
        "start_date", "hello"
    };

    SSIOCreateInsertionOrderRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["start_date"] == output["start_date"]);



}


void test_SSIOCreateInsertionOrderRequest_user_email_is_converted_to_json()
{

    bourne::json input =
    {
        "user_email", "hello"
    };

    SSIOCreateInsertionOrderRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["user_email"] == output["user_email"]);



}


void test_SSIOCreateInsertionOrderRequest_accepted_terms_id_is_converted_to_json()
{

    bourne::json input =
    {
        "accepted_terms_id", "hello"
    };

    SSIOCreateInsertionOrderRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["accepted_terms_id"] == output["accepted_terms_id"]);



}


void test_SSIOCreateInsertionOrderRequest_accepted_terms_time_is_converted_to_json()
{
    bourne::json input =
    {
        "accepted_terms_time", 1
    };

    SSIOCreateInsertionOrderRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["accepted_terms_time"] == output["accepted_terms_time"]);




}


void test_SSIOCreateInsertionOrderRequest_billto_billing_address_id_is_converted_to_json()
{

    bourne::json input =
    {
        "billto_billing_address_id", "hello"
    };

    SSIOCreateInsertionOrderRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["billto_billing_address_id"] == output["billto_billing_address_id"]);



}


void test_SSIOCreateInsertionOrderRequest_billto_business_address_id_is_converted_to_json()
{

    bourne::json input =
    {
        "billto_business_address_id", "hello"
    };

    SSIOCreateInsertionOrderRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["billto_business_address_id"] == output["billto_business_address_id"]);



}


void test_SSIOCreateInsertionOrderRequest_billto_company_id_is_converted_to_json()
{

    bourne::json input =
    {
        "billto_company_id", "hello"
    };

    SSIOCreateInsertionOrderRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["billto_company_id"] == output["billto_company_id"]);



}



void test_SSIOCreateInsertionOrderRequest_estimated_monthly_spend_is_converted_to_json()
{




}


void test_SSIOCreateInsertionOrderRequest_order_line_type_is_converted_to_json()
{

    bourne::json input =
    {
        "order_line_type", "hello"
    };

    SSIOCreateInsertionOrderRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["order_line_type"] == output["order_line_type"]);



}


void test_SSIOCreateInsertionOrderRequest_order_name_is_converted_to_json()
{

    bourne::json input =
    {
        "order_name", "hello"
    };

    SSIOCreateInsertionOrderRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["order_name"] == output["order_name"]);



}


void test_SSIOCreateInsertionOrderRequest_pmp_id_is_converted_to_json()
{

    bourne::json input =
    {
        "pmp_id", "hello"
    };

    SSIOCreateInsertionOrderRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["pmp_id"] == output["pmp_id"]);



}


