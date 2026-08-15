
#include "ConversionEventResponse.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ConversionEventResponse_ad_account_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "ad_account_id", "hello"
    };

    ConversionEventResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAdAccountId().c_str());






}



void test_ConversionEventResponse_conversion_tag_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "conversion_tag_id", "hello"
    };

    ConversionEventResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getConversionTagId().c_str());






}


void test_ConversionEventResponse_created_time_is_assigned_from_json()
{
    bourne::json input =
    {
        "created_time", 1
    };

    ConversionEventResponse obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCreatedTime());








}



void test_ConversionEventResponse_ad_account_id_is_converted_to_json()
{

    bourne::json input =
    {
        "ad_account_id", "hello"
    };

    ConversionEventResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["ad_account_id"] == output["ad_account_id"]);



}



void test_ConversionEventResponse_conversion_tag_id_is_converted_to_json()
{

    bourne::json input =
    {
        "conversion_tag_id", "hello"
    };

    ConversionEventResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["conversion_tag_id"] == output["conversion_tag_id"]);



}


void test_ConversionEventResponse_created_time_is_converted_to_json()
{
    bourne::json input =
    {
        "created_time", 1
    };

    ConversionEventResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["created_time"] == output["created_time"]);




}


