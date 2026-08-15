
#include "ConversionMSOTEvents.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_ConversionMSOTEvents_ad_group_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "ad_group_id", "hello"
    };

    ConversionMSOTEvents obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAdGroupId().c_str());






}


void test_ConversionMSOTEvents_attribution_model_is_assigned_from_json()
{


    bourne::json input =
    {
        "attribution_model", "hello"
    };

    ConversionMSOTEvents obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAttributionModel().c_str());






}


void test_ConversionMSOTEvents_attribution_scope_is_assigned_from_json()
{


    bourne::json input =
    {
        "attribution_scope", "hello"
    };

    ConversionMSOTEvents obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAttributionScope().c_str());






}


void test_ConversionMSOTEvents_attribution_score_is_assigned_from_json()
{








}


void test_ConversionMSOTEvents_campaign_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "campaign_id", "hello"
    };

    ConversionMSOTEvents obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCampaignId().c_str());






}



void test_ConversionMSOTEvents_event_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "event_id", "hello"
    };

    ConversionMSOTEvents obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEventId().c_str());






}


void test_ConversionMSOTEvents_event_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "event_name", "hello"
    };

    ConversionMSOTEvents obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEventName().c_str());






}


void test_ConversionMSOTEvents_event_timestamp_is_assigned_from_json()
{






    bourne::json input =
    {
        "event_timestamp", 1
    };

    ConversionMSOTEvents obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getEventTimestamp());


}


void test_ConversionMSOTEvents_total_event_touchpoints_is_assigned_from_json()
{
    bourne::json input =
    {
        "total_event_touchpoints", 1
    };

    ConversionMSOTEvents obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getTotalEventTouchpoints());








}


void test_ConversionMSOTEvents_total_events_is_assigned_from_json()
{
    bourne::json input =
    {
        "total_events", 1
    };

    ConversionMSOTEvents obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getTotalEvents());








}


void test_ConversionMSOTEvents_value_is_assigned_from_json()
{








}




void test_ConversionMSOTEvents_ad_group_id_is_converted_to_json()
{

    bourne::json input =
    {
        "ad_group_id", "hello"
    };

    ConversionMSOTEvents obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["ad_group_id"] == output["ad_group_id"]);



}


void test_ConversionMSOTEvents_attribution_model_is_converted_to_json()
{

    bourne::json input =
    {
        "attribution_model", "hello"
    };

    ConversionMSOTEvents obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["attribution_model"] == output["attribution_model"]);



}


void test_ConversionMSOTEvents_attribution_scope_is_converted_to_json()
{

    bourne::json input =
    {
        "attribution_scope", "hello"
    };

    ConversionMSOTEvents obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["attribution_scope"] == output["attribution_scope"]);



}


void test_ConversionMSOTEvents_attribution_score_is_converted_to_json()
{




}


void test_ConversionMSOTEvents_campaign_id_is_converted_to_json()
{

    bourne::json input =
    {
        "campaign_id", "hello"
    };

    ConversionMSOTEvents obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["campaign_id"] == output["campaign_id"]);



}



void test_ConversionMSOTEvents_event_id_is_converted_to_json()
{

    bourne::json input =
    {
        "event_id", "hello"
    };

    ConversionMSOTEvents obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["event_id"] == output["event_id"]);



}


void test_ConversionMSOTEvents_event_name_is_converted_to_json()
{

    bourne::json input =
    {
        "event_name", "hello"
    };

    ConversionMSOTEvents obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["event_name"] == output["event_name"]);



}


void test_ConversionMSOTEvents_event_timestamp_is_converted_to_json()
{



    bourne::json input =
    {
        "event_timestamp", 1
    };

    ConversionMSOTEvents obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["event_timestamp"] == output["event_timestamp"]);

}


void test_ConversionMSOTEvents_total_event_touchpoints_is_converted_to_json()
{
    bourne::json input =
    {
        "total_event_touchpoints", 1
    };

    ConversionMSOTEvents obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["total_event_touchpoints"] == output["total_event_touchpoints"]);




}


void test_ConversionMSOTEvents_total_events_is_converted_to_json()
{
    bourne::json input =
    {
        "total_events", 1
    };

    ConversionMSOTEvents obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["total_events"] == output["total_events"]);




}


void test_ConversionMSOTEvents_value_is_converted_to_json()
{




}


