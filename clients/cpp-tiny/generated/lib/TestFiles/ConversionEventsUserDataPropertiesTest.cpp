
#include "ConversionEventsUserDataProperties.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ConversionEventsUserDataProperties_click_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "click_id", "hello"
    };

    ConversionEventsUserDataProperties obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getClickId().c_str());






}


void test_ConversionEventsUserDataProperties_client_ip_address_is_assigned_from_json()
{


    bourne::json input =
    {
        "client_ip_address", "hello"
    };

    ConversionEventsUserDataProperties obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getClientIpAddress().c_str());






}


void test_ConversionEventsUserDataProperties_client_user_agent_is_assigned_from_json()
{


    bourne::json input =
    {
        "client_user_agent", "hello"
    };

    ConversionEventsUserDataProperties obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getClientUserAgent().c_str());






}











void test_ConversionEventsUserDataProperties_partner_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "partner_id", "hello"
    };

    ConversionEventsUserDataProperties obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPartnerId().c_str());






}






void test_ConversionEventsUserDataProperties_click_id_is_converted_to_json()
{

    bourne::json input =
    {
        "click_id", "hello"
    };

    ConversionEventsUserDataProperties obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["click_id"] == output["click_id"]);



}


void test_ConversionEventsUserDataProperties_client_ip_address_is_converted_to_json()
{

    bourne::json input =
    {
        "client_ip_address", "hello"
    };

    ConversionEventsUserDataProperties obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["client_ip_address"] == output["client_ip_address"]);



}


void test_ConversionEventsUserDataProperties_client_user_agent_is_converted_to_json()
{

    bourne::json input =
    {
        "client_user_agent", "hello"
    };

    ConversionEventsUserDataProperties obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["client_user_agent"] == output["client_user_agent"]);



}











void test_ConversionEventsUserDataProperties_partner_id_is_converted_to_json()
{

    bourne::json input =
    {
        "partner_id", "hello"
    };

    ConversionEventsUserDataProperties obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["partner_id"] == output["partner_id"]);



}





