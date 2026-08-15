
#include "TermsOfService.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_TermsOfService_ad_account_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "ad_account_id", "hello"
    };

    TermsOfService obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAdAccountId().c_str());






}


void test_TermsOfService_has_accepted_is_assigned_from_json()
{




    bourne::json input =
    {
        "has_accepted", true
    };

    TermsOfService obj(input.dump());

    TEST_ASSERT(true == obj.isHasAccepted());




}


void test_TermsOfService_html_is_assigned_from_json()
{


    bourne::json input =
    {
        "html", "hello"
    };

    TermsOfService obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getHtml().c_str());






}


void test_TermsOfService_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    TermsOfService obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}



void test_TermsOfService_ad_account_id_is_converted_to_json()
{

    bourne::json input =
    {
        "ad_account_id", "hello"
    };

    TermsOfService obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["ad_account_id"] == output["ad_account_id"]);



}


void test_TermsOfService_has_accepted_is_converted_to_json()
{


    bourne::json input =
    {
        "has_accepted", true
    };

    TermsOfService obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["has_accepted"] == output["has_accepted"]);


}


void test_TermsOfService_html_is_converted_to_json()
{

    bourne::json input =
    {
        "html", "hello"
    };

    TermsOfService obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["html"] == output["html"]);



}


void test_TermsOfService_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    TermsOfService obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


