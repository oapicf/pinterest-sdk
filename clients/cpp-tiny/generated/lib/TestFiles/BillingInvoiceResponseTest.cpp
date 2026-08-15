
#include "BillingInvoiceResponse.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_BillingInvoiceResponse_ad_account_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "ad_account_id", "hello"
    };

    BillingInvoiceResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAdAccountId().c_str());






}


void test_BillingInvoiceResponse_ad_account_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "ad_account_name", "hello"
    };

    BillingInvoiceResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAdAccountName().c_str());






}


void test_BillingInvoiceResponse_amount_billed_micro_currency_is_assigned_from_json()
{
    bourne::json input =
    {
        "amount_billed_micro_currency", 1
    };

    BillingInvoiceResponse obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getAmountBilledMicroCurrency());








}


void test_BillingInvoiceResponse_amount_discount_micro_currency_is_assigned_from_json()
{
    bourne::json input =
    {
        "amount_discount_micro_currency", 1
    };

    BillingInvoiceResponse obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getAmountDiscountMicroCurrency());








}


void test_BillingInvoiceResponse_amount_net_micro_currency_is_assigned_from_json()
{
    bourne::json input =
    {
        "amount_net_micro_currency", 1
    };

    BillingInvoiceResponse obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getAmountNetMicroCurrency());








}


void test_BillingInvoiceResponse_amount_tax_micro_currency_is_assigned_from_json()
{
    bourne::json input =
    {
        "amount_tax_micro_currency", 1
    };

    BillingInvoiceResponse obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getAmountTaxMicroCurrency());








}


void test_BillingInvoiceResponse_bill_to_country_is_assigned_from_json()
{


    bourne::json input =
    {
        "bill_to_country", "hello"
    };

    BillingInvoiceResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBillToCountry().c_str());






}





void test_BillingInvoiceResponse_document_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "document_type", "hello"
    };

    BillingInvoiceResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDocumentType().c_str());






}


void test_BillingInvoiceResponse_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    BillingInvoiceResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}



void test_BillingInvoiceResponse_payment_terms_is_assigned_from_json()
{


    bourne::json input =
    {
        "payment_terms", "hello"
    };

    BillingInvoiceResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPaymentTerms().c_str());






}


void test_BillingInvoiceResponse_status_is_assigned_from_json()
{


    bourne::json input =
    {
        "status", "hello"
    };

    BillingInvoiceResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getStatus().c_str());






}



void test_BillingInvoiceResponse_ad_account_id_is_converted_to_json()
{

    bourne::json input =
    {
        "ad_account_id", "hello"
    };

    BillingInvoiceResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["ad_account_id"] == output["ad_account_id"]);



}


void test_BillingInvoiceResponse_ad_account_name_is_converted_to_json()
{

    bourne::json input =
    {
        "ad_account_name", "hello"
    };

    BillingInvoiceResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["ad_account_name"] == output["ad_account_name"]);



}


void test_BillingInvoiceResponse_amount_billed_micro_currency_is_converted_to_json()
{
    bourne::json input =
    {
        "amount_billed_micro_currency", 1
    };

    BillingInvoiceResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["amount_billed_micro_currency"] == output["amount_billed_micro_currency"]);




}


void test_BillingInvoiceResponse_amount_discount_micro_currency_is_converted_to_json()
{
    bourne::json input =
    {
        "amount_discount_micro_currency", 1
    };

    BillingInvoiceResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["amount_discount_micro_currency"] == output["amount_discount_micro_currency"]);




}


void test_BillingInvoiceResponse_amount_net_micro_currency_is_converted_to_json()
{
    bourne::json input =
    {
        "amount_net_micro_currency", 1
    };

    BillingInvoiceResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["amount_net_micro_currency"] == output["amount_net_micro_currency"]);




}


void test_BillingInvoiceResponse_amount_tax_micro_currency_is_converted_to_json()
{
    bourne::json input =
    {
        "amount_tax_micro_currency", 1
    };

    BillingInvoiceResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["amount_tax_micro_currency"] == output["amount_tax_micro_currency"]);




}


void test_BillingInvoiceResponse_bill_to_country_is_converted_to_json()
{

    bourne::json input =
    {
        "bill_to_country", "hello"
    };

    BillingInvoiceResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["bill_to_country"] == output["bill_to_country"]);



}





void test_BillingInvoiceResponse_document_type_is_converted_to_json()
{

    bourne::json input =
    {
        "document_type", "hello"
    };

    BillingInvoiceResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["document_type"] == output["document_type"]);



}


void test_BillingInvoiceResponse_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    BillingInvoiceResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}



void test_BillingInvoiceResponse_payment_terms_is_converted_to_json()
{

    bourne::json input =
    {
        "payment_terms", "hello"
    };

    BillingInvoiceResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["payment_terms"] == output["payment_terms"]);



}


void test_BillingInvoiceResponse_status_is_converted_to_json()
{

    bourne::json input =
    {
        "status", "hello"
    };

    BillingInvoiceResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["status"] == output["status"]);



}


