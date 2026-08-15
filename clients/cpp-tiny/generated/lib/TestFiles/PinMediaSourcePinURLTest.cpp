
#include "PinMediaSourcePinURL.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PinMediaSourcePinURL_is_affiliate_link_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_affiliate_link", true
    };

    PinMediaSourcePinURL obj(input.dump());

    TEST_ASSERT(true == obj.isIsAffiliateLink());




}


void test_PinMediaSourcePinURL_source_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "source_type", "hello"
    };

    PinMediaSourcePinURL obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSourceType().c_str());






}



void test_PinMediaSourcePinURL_is_affiliate_link_is_converted_to_json()
{


    bourne::json input =
    {
        "is_affiliate_link", true
    };

    PinMediaSourcePinURL obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_affiliate_link"] == output["is_affiliate_link"]);


}


void test_PinMediaSourcePinURL_source_type_is_converted_to_json()
{

    bourne::json input =
    {
        "source_type", "hello"
    };

    PinMediaSourcePinURL obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["source_type"] == output["source_type"]);



}


