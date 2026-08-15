
#include "LeadSubscriptionPostParamsCreate.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_LeadSubscriptionPostParamsCreate_lead_form_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "lead_form_id", "hello"
    };

    LeadSubscriptionPostParamsCreate obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLeadFormId().c_str());






}


void test_LeadSubscriptionPostParamsCreate_webhook_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "webhook_url", "hello"
    };

    LeadSubscriptionPostParamsCreate obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getWebhookUrl().c_str());






}


void test_LeadSubscriptionPostParamsCreate_partner_access_token_is_assigned_from_json()
{


    bourne::json input =
    {
        "partner_access_token", "hello"
    };

    LeadSubscriptionPostParamsCreate obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPartnerAccessToken().c_str());






}



void test_LeadSubscriptionPostParamsCreate_partner_refresh_token_is_assigned_from_json()
{


    bourne::json input =
    {
        "partner_refresh_token", "hello"
    };

    LeadSubscriptionPostParamsCreate obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPartnerRefreshToken().c_str());






}



void test_LeadSubscriptionPostParamsCreate_lead_form_id_is_converted_to_json()
{

    bourne::json input =
    {
        "lead_form_id", "hello"
    };

    LeadSubscriptionPostParamsCreate obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["lead_form_id"] == output["lead_form_id"]);



}


void test_LeadSubscriptionPostParamsCreate_webhook_url_is_converted_to_json()
{

    bourne::json input =
    {
        "webhook_url", "hello"
    };

    LeadSubscriptionPostParamsCreate obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["webhook_url"] == output["webhook_url"]);



}


void test_LeadSubscriptionPostParamsCreate_partner_access_token_is_converted_to_json()
{

    bourne::json input =
    {
        "partner_access_token", "hello"
    };

    LeadSubscriptionPostParamsCreate obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["partner_access_token"] == output["partner_access_token"]);



}



void test_LeadSubscriptionPostParamsCreate_partner_refresh_token_is_converted_to_json()
{

    bourne::json input =
    {
        "partner_refresh_token", "hello"
    };

    LeadSubscriptionPostParamsCreate obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["partner_refresh_token"] == output["partner_refresh_token"]);



}


