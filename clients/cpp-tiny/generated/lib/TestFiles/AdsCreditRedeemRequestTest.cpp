
#include "AdsCreditRedeemRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_AdsCreditRedeemRequest_offerCodeHash_is_assigned_from_json()
{


    bourne::json input =
    {
        "offerCodeHash", "hello"
    };

    AdsCreditRedeemRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOfferCodeHash().c_str());






}


void test_AdsCreditRedeemRequest_validateOnly_is_assigned_from_json()
{




    bourne::json input =
    {
        "validateOnly", true
    };

    AdsCreditRedeemRequest obj(input.dump());

    TEST_ASSERT(true == obj.isValidateOnly());




}



void test_AdsCreditRedeemRequest_offerCodeHash_is_converted_to_json()
{

    bourne::json input =
    {
        "offerCodeHash", "hello"
    };

    AdsCreditRedeemRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["offerCodeHash"] == output["offerCodeHash"]);



}


void test_AdsCreditRedeemRequest_validateOnly_is_converted_to_json()
{


    bourne::json input =
    {
        "validateOnly", true
    };

    AdsCreditRedeemRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["validateOnly"] == output["validateOnly"]);


}


