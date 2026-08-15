
#include "LeadFormTestResponse.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_LeadFormTestResponse_subscription_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "subscription_id", "hello"
    };

    LeadFormTestResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSubscriptionId().c_str());






}



void test_LeadFormTestResponse_subscription_id_is_converted_to_json()
{

    bourne::json input =
    {
        "subscription_id", "hello"
    };

    LeadFormTestResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["subscription_id"] == output["subscription_id"]);



}


