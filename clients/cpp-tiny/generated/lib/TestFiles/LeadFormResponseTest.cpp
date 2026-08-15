
#include "LeadFormResponse.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_LeadFormResponse_completion_message_is_assigned_from_json()
{


    bourne::json input =
    {
        "completion_message", "hello"
    };

    LeadFormResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCompletionMessage().c_str());






}


void test_LeadFormResponse_disclosure_language_is_assigned_from_json()
{


    bourne::json input =
    {
        "disclosure_language", "hello"
    };

    LeadFormResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDisclosureLanguage().c_str());






}


void test_LeadFormResponse_has_accepted_terms_is_assigned_from_json()
{




    bourne::json input =
    {
        "has_accepted_terms", true
    };

    LeadFormResponse obj(input.dump());

    TEST_ASSERT(true == obj.isHasAcceptedTerms());




}


void test_LeadFormResponse_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    LeadFormResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}



void test_LeadFormResponse_privacy_policy_link_is_assigned_from_json()
{


    bourne::json input =
    {
        "privacy_policy_link", "hello"
    };

    LeadFormResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPrivacyPolicyLink().c_str());






}




void test_LeadFormResponse_ad_account_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "ad_account_id", "hello"
    };

    LeadFormResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAdAccountId().c_str());






}


void test_LeadFormResponse_created_time_is_assigned_from_json()
{
    bourne::json input =
    {
        "created_time", 1
    };

    LeadFormResponse obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCreatedTime());








}


void test_LeadFormResponse_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    LeadFormResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_LeadFormResponse_updated_time_is_assigned_from_json()
{
    bourne::json input =
    {
        "updated_time", 1
    };

    LeadFormResponse obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getUpdatedTime());








}



void test_LeadFormResponse_completion_message_is_converted_to_json()
{

    bourne::json input =
    {
        "completion_message", "hello"
    };

    LeadFormResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["completion_message"] == output["completion_message"]);



}


void test_LeadFormResponse_disclosure_language_is_converted_to_json()
{

    bourne::json input =
    {
        "disclosure_language", "hello"
    };

    LeadFormResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["disclosure_language"] == output["disclosure_language"]);



}


void test_LeadFormResponse_has_accepted_terms_is_converted_to_json()
{


    bourne::json input =
    {
        "has_accepted_terms", true
    };

    LeadFormResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["has_accepted_terms"] == output["has_accepted_terms"]);


}


void test_LeadFormResponse_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    LeadFormResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}



void test_LeadFormResponse_privacy_policy_link_is_converted_to_json()
{

    bourne::json input =
    {
        "privacy_policy_link", "hello"
    };

    LeadFormResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["privacy_policy_link"] == output["privacy_policy_link"]);



}




void test_LeadFormResponse_ad_account_id_is_converted_to_json()
{

    bourne::json input =
    {
        "ad_account_id", "hello"
    };

    LeadFormResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["ad_account_id"] == output["ad_account_id"]);



}


void test_LeadFormResponse_created_time_is_converted_to_json()
{
    bourne::json input =
    {
        "created_time", 1
    };

    LeadFormResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["created_time"] == output["created_time"]);




}


void test_LeadFormResponse_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    LeadFormResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_LeadFormResponse_updated_time_is_converted_to_json()
{
    bourne::json input =
    {
        "updated_time", 1
    };

    LeadFormResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["updated_time"] == output["updated_time"]);




}


