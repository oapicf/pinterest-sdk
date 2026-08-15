
#include "LeadFormCommon_policy_links_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_LeadFormCommon_policy_links_inner_label_is_assigned_from_json()
{


    bourne::json input =
    {
        "label", "hello"
    };

    LeadFormCommon_policy_links_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLabel().c_str());






}


void test_LeadFormCommon_policy_links_inner_link_is_assigned_from_json()
{


    bourne::json input =
    {
        "link", "hello"
    };

    LeadFormCommon_policy_links_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLink().c_str());






}



void test_LeadFormCommon_policy_links_inner_label_is_converted_to_json()
{

    bourne::json input =
    {
        "label", "hello"
    };

    LeadFormCommon_policy_links_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["label"] == output["label"]);



}


void test_LeadFormCommon_policy_links_inner_link_is_converted_to_json()
{

    bourne::json input =
    {
        "link", "hello"
    };

    LeadFormCommon_policy_links_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["link"] == output["link"]);



}


