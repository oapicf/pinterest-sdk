
#include "LeadSubscriptionPostParamsCreate_allOf_partner_metadata.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_LeadSubscriptionPostParamsCreate_allOf_partner_metadata_subscriber_key_is_assigned_from_json()
{


    bourne::json input =
    {
        "subscriber_key", "hello"
    };

    LeadSubscriptionPostParamsCreate_allOf_partner_metadata obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSubscriberKey().c_str());






}



void test_LeadSubscriptionPostParamsCreate_allOf_partner_metadata_subscriber_key_is_converted_to_json()
{

    bourne::json input =
    {
        "subscriber_key", "hello"
    };

    LeadSubscriptionPostParamsCreate_allOf_partner_metadata obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["subscriber_key"] == output["subscriber_key"]);



}


