
#include "ConversionEvents_data_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ConversionEvents_data_inner_action_source_is_assigned_from_json()
{


    bourne::json input =
    {
        "action_source", "hello"
    };

    ConversionEvents_data_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getActionSource().c_str());






}


void test_ConversionEvents_data_inner_app_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "app_id", "hello"
    };

    ConversionEvents_data_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAppId().c_str());






}



void test_ConversionEvents_data_inner_app_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "app_name", "hello"
    };

    ConversionEvents_data_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAppName().c_str());






}


void test_ConversionEvents_data_inner_app_version_is_assigned_from_json()
{


    bourne::json input =
    {
        "app_version", "hello"
    };

    ConversionEvents_data_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAppVersion().c_str());






}



void test_ConversionEvents_data_inner_device_brand_is_assigned_from_json()
{


    bourne::json input =
    {
        "device_brand", "hello"
    };

    ConversionEvents_data_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDeviceBrand().c_str());






}


void test_ConversionEvents_data_inner_device_carrier_is_assigned_from_json()
{


    bourne::json input =
    {
        "device_carrier", "hello"
    };

    ConversionEvents_data_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDeviceCarrier().c_str());






}



void test_ConversionEvents_data_inner_device_model_is_assigned_from_json()
{


    bourne::json input =
    {
        "device_model", "hello"
    };

    ConversionEvents_data_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDeviceModel().c_str());






}


void test_ConversionEvents_data_inner_device_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "device_type", "hello"
    };

    ConversionEvents_data_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDeviceType().c_str());






}


void test_ConversionEvents_data_inner_event_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "event_id", "hello"
    };

    ConversionEvents_data_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEventId().c_str());






}


void test_ConversionEvents_data_inner_event_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "event_name", "hello"
    };

    ConversionEvents_data_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEventName().c_str());






}


void test_ConversionEvents_data_inner_event_source_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "event_source_url", "hello"
    };

    ConversionEvents_data_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEventSourceUrl().c_str());






}


void test_ConversionEvents_data_inner_event_time_is_assigned_from_json()
{






    bourne::json input =
    {
        "event_time", 1
    };

    ConversionEvents_data_inner obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getEventTime());


}


void test_ConversionEvents_data_inner_language_is_assigned_from_json()
{


    bourne::json input =
    {
        "language", "hello"
    };

    ConversionEvents_data_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLanguage().c_str());






}


void test_ConversionEvents_data_inner_opt_out_is_assigned_from_json()
{




    bourne::json input =
    {
        "opt_out", true
    };

    ConversionEvents_data_inner obj(input.dump());

    TEST_ASSERT(true == obj.isOptOut());




}


void test_ConversionEvents_data_inner_os_version_is_assigned_from_json()
{


    bourne::json input =
    {
        "os_version", "hello"
    };

    ConversionEvents_data_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOsVersion().c_str());






}


void test_ConversionEvents_data_inner_partner_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "partner_name", "hello"
    };

    ConversionEvents_data_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPartnerName().c_str());






}



void test_ConversionEvents_data_inner_wifi_is_assigned_from_json()
{




    bourne::json input =
    {
        "wifi", true
    };

    ConversionEvents_data_inner obj(input.dump());

    TEST_ASSERT(true == obj.isWifi());




}



void test_ConversionEvents_data_inner_action_source_is_converted_to_json()
{

    bourne::json input =
    {
        "action_source", "hello"
    };

    ConversionEvents_data_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["action_source"] == output["action_source"]);



}


void test_ConversionEvents_data_inner_app_id_is_converted_to_json()
{

    bourne::json input =
    {
        "app_id", "hello"
    };

    ConversionEvents_data_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["app_id"] == output["app_id"]);



}



void test_ConversionEvents_data_inner_app_name_is_converted_to_json()
{

    bourne::json input =
    {
        "app_name", "hello"
    };

    ConversionEvents_data_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["app_name"] == output["app_name"]);



}


void test_ConversionEvents_data_inner_app_version_is_converted_to_json()
{

    bourne::json input =
    {
        "app_version", "hello"
    };

    ConversionEvents_data_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["app_version"] == output["app_version"]);



}



void test_ConversionEvents_data_inner_device_brand_is_converted_to_json()
{

    bourne::json input =
    {
        "device_brand", "hello"
    };

    ConversionEvents_data_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["device_brand"] == output["device_brand"]);



}


void test_ConversionEvents_data_inner_device_carrier_is_converted_to_json()
{

    bourne::json input =
    {
        "device_carrier", "hello"
    };

    ConversionEvents_data_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["device_carrier"] == output["device_carrier"]);



}



void test_ConversionEvents_data_inner_device_model_is_converted_to_json()
{

    bourne::json input =
    {
        "device_model", "hello"
    };

    ConversionEvents_data_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["device_model"] == output["device_model"]);



}


void test_ConversionEvents_data_inner_device_type_is_converted_to_json()
{

    bourne::json input =
    {
        "device_type", "hello"
    };

    ConversionEvents_data_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["device_type"] == output["device_type"]);



}


void test_ConversionEvents_data_inner_event_id_is_converted_to_json()
{

    bourne::json input =
    {
        "event_id", "hello"
    };

    ConversionEvents_data_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["event_id"] == output["event_id"]);



}


void test_ConversionEvents_data_inner_event_name_is_converted_to_json()
{

    bourne::json input =
    {
        "event_name", "hello"
    };

    ConversionEvents_data_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["event_name"] == output["event_name"]);



}


void test_ConversionEvents_data_inner_event_source_url_is_converted_to_json()
{

    bourne::json input =
    {
        "event_source_url", "hello"
    };

    ConversionEvents_data_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["event_source_url"] == output["event_source_url"]);



}


void test_ConversionEvents_data_inner_event_time_is_converted_to_json()
{



    bourne::json input =
    {
        "event_time", 1
    };

    ConversionEvents_data_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["event_time"] == output["event_time"]);

}


void test_ConversionEvents_data_inner_language_is_converted_to_json()
{

    bourne::json input =
    {
        "language", "hello"
    };

    ConversionEvents_data_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["language"] == output["language"]);



}


void test_ConversionEvents_data_inner_opt_out_is_converted_to_json()
{


    bourne::json input =
    {
        "opt_out", true
    };

    ConversionEvents_data_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["opt_out"] == output["opt_out"]);


}


void test_ConversionEvents_data_inner_os_version_is_converted_to_json()
{

    bourne::json input =
    {
        "os_version", "hello"
    };

    ConversionEvents_data_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["os_version"] == output["os_version"]);



}


void test_ConversionEvents_data_inner_partner_name_is_converted_to_json()
{

    bourne::json input =
    {
        "partner_name", "hello"
    };

    ConversionEvents_data_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["partner_name"] == output["partner_name"]);



}



void test_ConversionEvents_data_inner_wifi_is_converted_to_json()
{


    bourne::json input =
    {
        "wifi", true
    };

    ConversionEvents_data_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["wifi"] == output["wifi"]);


}


