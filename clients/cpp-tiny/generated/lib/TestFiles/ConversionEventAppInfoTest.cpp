
#include "ConversionEventAppInfo.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ConversionEventAppInfo_app_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "app_id", "hello"
    };

    ConversionEventAppInfo obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAppId().c_str());






}


void test_ConversionEventAppInfo_app_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "app_name", "hello"
    };

    ConversionEventAppInfo obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAppName().c_str());






}


void test_ConversionEventAppInfo_app_package_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "app_package_name", "hello"
    };

    ConversionEventAppInfo obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAppPackageName().c_str());






}


void test_ConversionEventAppInfo_app_store_is_assigned_from_json()
{


    bourne::json input =
    {
        "app_store", "hello"
    };

    ConversionEventAppInfo obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAppStore().c_str());






}


void test_ConversionEventAppInfo_app_version_is_assigned_from_json()
{


    bourne::json input =
    {
        "app_version", "hello"
    };

    ConversionEventAppInfo obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAppVersion().c_str());






}


void test_ConversionEventAppInfo_install_time_is_assigned_from_json()
{
    bourne::json input =
    {
        "install_time", 1
    };

    ConversionEventAppInfo obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getInstallTime());








}


void test_ConversionEventAppInfo_user_agent_is_assigned_from_json()
{


    bourne::json input =
    {
        "user_agent", "hello"
    };

    ConversionEventAppInfo obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUserAgent().c_str());






}


void test_ConversionEventAppInfo_window_height_is_assigned_from_json()
{
    bourne::json input =
    {
        "window_height", 1
    };

    ConversionEventAppInfo obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getWindowHeight());








}


void test_ConversionEventAppInfo_window_width_is_assigned_from_json()
{
    bourne::json input =
    {
        "window_width", 1
    };

    ConversionEventAppInfo obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getWindowWidth());








}



void test_ConversionEventAppInfo_app_id_is_converted_to_json()
{

    bourne::json input =
    {
        "app_id", "hello"
    };

    ConversionEventAppInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["app_id"] == output["app_id"]);



}


void test_ConversionEventAppInfo_app_name_is_converted_to_json()
{

    bourne::json input =
    {
        "app_name", "hello"
    };

    ConversionEventAppInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["app_name"] == output["app_name"]);



}


void test_ConversionEventAppInfo_app_package_name_is_converted_to_json()
{

    bourne::json input =
    {
        "app_package_name", "hello"
    };

    ConversionEventAppInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["app_package_name"] == output["app_package_name"]);



}


void test_ConversionEventAppInfo_app_store_is_converted_to_json()
{

    bourne::json input =
    {
        "app_store", "hello"
    };

    ConversionEventAppInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["app_store"] == output["app_store"]);



}


void test_ConversionEventAppInfo_app_version_is_converted_to_json()
{

    bourne::json input =
    {
        "app_version", "hello"
    };

    ConversionEventAppInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["app_version"] == output["app_version"]);



}


void test_ConversionEventAppInfo_install_time_is_converted_to_json()
{
    bourne::json input =
    {
        "install_time", 1
    };

    ConversionEventAppInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["install_time"] == output["install_time"]);




}


void test_ConversionEventAppInfo_user_agent_is_converted_to_json()
{

    bourne::json input =
    {
        "user_agent", "hello"
    };

    ConversionEventAppInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["user_agent"] == output["user_agent"]);



}


void test_ConversionEventAppInfo_window_height_is_converted_to_json()
{
    bourne::json input =
    {
        "window_height", 1
    };

    ConversionEventAppInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["window_height"] == output["window_height"]);




}


void test_ConversionEventAppInfo_window_width_is_converted_to_json()
{
    bourne::json input =
    {
        "window_width", 1
    };

    ConversionEventAppInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["window_width"] == output["window_width"]);




}


