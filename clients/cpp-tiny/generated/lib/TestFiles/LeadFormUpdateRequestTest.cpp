
#include "LeadFormUpdateRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_LeadFormUpdateRequest_completion_message_is_assigned_from_json()
{


    bourne::json input =
    {
        "completion_message", "hello"
    };

    LeadFormUpdateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCompletionMessage().c_str());






}


void test_LeadFormUpdateRequest_disclosure_language_is_assigned_from_json()
{


    bourne::json input =
    {
        "disclosure_language", "hello"
    };

    LeadFormUpdateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDisclosureLanguage().c_str());






}


void test_LeadFormUpdateRequest_has_accepted_terms_is_assigned_from_json()
{




    bourne::json input =
    {
        "has_accepted_terms", true
    };

    LeadFormUpdateRequest obj(input.dump());

    TEST_ASSERT(true == obj.isHasAcceptedTerms());




}


void test_LeadFormUpdateRequest_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    LeadFormUpdateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}



void test_LeadFormUpdateRequest_privacy_policy_link_is_assigned_from_json()
{


    bourne::json input =
    {
        "privacy_policy_link", "hello"
    };

    LeadFormUpdateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPrivacyPolicyLink().c_str());






}




void test_LeadFormUpdateRequest_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    LeadFormUpdateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}



void test_LeadFormUpdateRequest_completion_message_is_converted_to_json()
{

    bourne::json input =
    {
        "completion_message", "hello"
    };

    LeadFormUpdateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["completion_message"] == output["completion_message"]);



}


void test_LeadFormUpdateRequest_disclosure_language_is_converted_to_json()
{

    bourne::json input =
    {
        "disclosure_language", "hello"
    };

    LeadFormUpdateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["disclosure_language"] == output["disclosure_language"]);



}


void test_LeadFormUpdateRequest_has_accepted_terms_is_converted_to_json()
{


    bourne::json input =
    {
        "has_accepted_terms", true
    };

    LeadFormUpdateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["has_accepted_terms"] == output["has_accepted_terms"]);


}


void test_LeadFormUpdateRequest_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    LeadFormUpdateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}



void test_LeadFormUpdateRequest_privacy_policy_link_is_converted_to_json()
{

    bourne::json input =
    {
        "privacy_policy_link", "hello"
    };

    LeadFormUpdateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["privacy_policy_link"] == output["privacy_policy_link"]);



}




void test_LeadFormUpdateRequest_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    LeadFormUpdateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


