
#include "ConversionEventDeviceInfo.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ConversionEventDeviceInfo_battery_level_is_assigned_from_json()
{
    bourne::json input =
    {
        "battery_level", 1
    };

    ConversionEventDeviceInfo obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getBatteryLevel());








}


void test_ConversionEventDeviceInfo_brand_is_assigned_from_json()
{


    bourne::json input =
    {
        "brand", "hello"
    };

    ConversionEventDeviceInfo obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBrand().c_str());






}


void test_ConversionEventDeviceInfo_carrier_is_assigned_from_json()
{


    bourne::json input =
    {
        "carrier", "hello"
    };

    ConversionEventDeviceInfo obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCarrier().c_str());






}


void test_ConversionEventDeviceInfo_cpu_cores_is_assigned_from_json()
{
    bourne::json input =
    {
        "cpu_cores", 1
    };

    ConversionEventDeviceInfo obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCpuCores());








}


void test_ConversionEventDeviceInfo_external_storage_free_space_is_assigned_from_json()
{
    bourne::json input =
    {
        "external_storage_free_space", 1
    };

    ConversionEventDeviceInfo obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getExternalStorageFreeSpace());








}


void test_ConversionEventDeviceInfo_external_storage_size_is_assigned_from_json()
{
    bourne::json input =
    {
        "external_storage_size", 1
    };

    ConversionEventDeviceInfo obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getExternalStorageSize());








}


void test_ConversionEventDeviceInfo_form_factor_is_assigned_from_json()
{


    bourne::json input =
    {
        "form_factor", "hello"
    };

    ConversionEventDeviceInfo obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFormFactor().c_str());






}


void test_ConversionEventDeviceInfo_kernel_version_is_assigned_from_json()
{


    bourne::json input =
    {
        "kernel_version", "hello"
    };

    ConversionEventDeviceInfo obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getKernelVersion().c_str());






}



void test_ConversionEventDeviceInfo_locale_is_assigned_from_json()
{


    bourne::json input =
    {
        "locale", "hello"
    };

    ConversionEventDeviceInfo obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLocale().c_str());






}


void test_ConversionEventDeviceInfo_model_is_assigned_from_json()
{


    bourne::json input =
    {
        "model", "hello"
    };

    ConversionEventDeviceInfo obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getModel().c_str());






}


void test_ConversionEventDeviceInfo_network_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "network_type", "hello"
    };

    ConversionEventDeviceInfo obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getNetworkType().c_str());






}


void test_ConversionEventDeviceInfo_os_family_is_assigned_from_json()
{


    bourne::json input =
    {
        "os_family", "hello"
    };

    ConversionEventDeviceInfo obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOsFamily().c_str());






}


void test_ConversionEventDeviceInfo_os_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "os_name", "hello"
    };

    ConversionEventDeviceInfo obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOsName().c_str());






}


void test_ConversionEventDeviceInfo_os_release_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "os_release_name", "hello"
    };

    ConversionEventDeviceInfo obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOsReleaseName().c_str());






}


void test_ConversionEventDeviceInfo_os_version_is_assigned_from_json()
{


    bourne::json input =
    {
        "os_version", "hello"
    };

    ConversionEventDeviceInfo obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOsVersion().c_str());






}


void test_ConversionEventDeviceInfo_screen_density_is_assigned_from_json()
{
    bourne::json input =
    {
        "screen_density", 1
    };

    ConversionEventDeviceInfo obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getScreenDensity());








}


void test_ConversionEventDeviceInfo_screen_height_is_assigned_from_json()
{
    bourne::json input =
    {
        "screen_height", 1
    };

    ConversionEventDeviceInfo obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getScreenHeight());








}


void test_ConversionEventDeviceInfo_screen_width_is_assigned_from_json()
{
    bourne::json input =
    {
        "screen_width", 1
    };

    ConversionEventDeviceInfo obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getScreenWidth());








}


void test_ConversionEventDeviceInfo_storage_free_space_is_assigned_from_json()
{
    bourne::json input =
    {
        "storage_free_space", 1
    };

    ConversionEventDeviceInfo obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getStorageFreeSpace());








}


void test_ConversionEventDeviceInfo_storage_size_is_assigned_from_json()
{
    bourne::json input =
    {
        "storage_size", 1
    };

    ConversionEventDeviceInfo obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getStorageSize());








}


void test_ConversionEventDeviceInfo_timezone_is_assigned_from_json()
{


    bourne::json input =
    {
        "timezone", "hello"
    };

    ConversionEventDeviceInfo obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getTimezone().c_str());






}


void test_ConversionEventDeviceInfo_timezone_abbr_is_assigned_from_json()
{


    bourne::json input =
    {
        "timezone_abbr", "hello"
    };

    ConversionEventDeviceInfo obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getTimezoneAbbr().c_str());






}


void test_ConversionEventDeviceInfo_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    ConversionEventDeviceInfo obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}



void test_ConversionEventDeviceInfo_battery_level_is_converted_to_json()
{
    bourne::json input =
    {
        "battery_level", 1
    };

    ConversionEventDeviceInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["battery_level"] == output["battery_level"]);




}


void test_ConversionEventDeviceInfo_brand_is_converted_to_json()
{

    bourne::json input =
    {
        "brand", "hello"
    };

    ConversionEventDeviceInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["brand"] == output["brand"]);



}


void test_ConversionEventDeviceInfo_carrier_is_converted_to_json()
{

    bourne::json input =
    {
        "carrier", "hello"
    };

    ConversionEventDeviceInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["carrier"] == output["carrier"]);



}


void test_ConversionEventDeviceInfo_cpu_cores_is_converted_to_json()
{
    bourne::json input =
    {
        "cpu_cores", 1
    };

    ConversionEventDeviceInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["cpu_cores"] == output["cpu_cores"]);




}


void test_ConversionEventDeviceInfo_external_storage_free_space_is_converted_to_json()
{
    bourne::json input =
    {
        "external_storage_free_space", 1
    };

    ConversionEventDeviceInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["external_storage_free_space"] == output["external_storage_free_space"]);




}


void test_ConversionEventDeviceInfo_external_storage_size_is_converted_to_json()
{
    bourne::json input =
    {
        "external_storage_size", 1
    };

    ConversionEventDeviceInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["external_storage_size"] == output["external_storage_size"]);




}


void test_ConversionEventDeviceInfo_form_factor_is_converted_to_json()
{

    bourne::json input =
    {
        "form_factor", "hello"
    };

    ConversionEventDeviceInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["form_factor"] == output["form_factor"]);



}


void test_ConversionEventDeviceInfo_kernel_version_is_converted_to_json()
{

    bourne::json input =
    {
        "kernel_version", "hello"
    };

    ConversionEventDeviceInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["kernel_version"] == output["kernel_version"]);



}



void test_ConversionEventDeviceInfo_locale_is_converted_to_json()
{

    bourne::json input =
    {
        "locale", "hello"
    };

    ConversionEventDeviceInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["locale"] == output["locale"]);



}


void test_ConversionEventDeviceInfo_model_is_converted_to_json()
{

    bourne::json input =
    {
        "model", "hello"
    };

    ConversionEventDeviceInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["model"] == output["model"]);



}


void test_ConversionEventDeviceInfo_network_type_is_converted_to_json()
{

    bourne::json input =
    {
        "network_type", "hello"
    };

    ConversionEventDeviceInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["network_type"] == output["network_type"]);



}


void test_ConversionEventDeviceInfo_os_family_is_converted_to_json()
{

    bourne::json input =
    {
        "os_family", "hello"
    };

    ConversionEventDeviceInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["os_family"] == output["os_family"]);



}


void test_ConversionEventDeviceInfo_os_name_is_converted_to_json()
{

    bourne::json input =
    {
        "os_name", "hello"
    };

    ConversionEventDeviceInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["os_name"] == output["os_name"]);



}


void test_ConversionEventDeviceInfo_os_release_name_is_converted_to_json()
{

    bourne::json input =
    {
        "os_release_name", "hello"
    };

    ConversionEventDeviceInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["os_release_name"] == output["os_release_name"]);



}


void test_ConversionEventDeviceInfo_os_version_is_converted_to_json()
{

    bourne::json input =
    {
        "os_version", "hello"
    };

    ConversionEventDeviceInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["os_version"] == output["os_version"]);



}


void test_ConversionEventDeviceInfo_screen_density_is_converted_to_json()
{
    bourne::json input =
    {
        "screen_density", 1
    };

    ConversionEventDeviceInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["screen_density"] == output["screen_density"]);




}


void test_ConversionEventDeviceInfo_screen_height_is_converted_to_json()
{
    bourne::json input =
    {
        "screen_height", 1
    };

    ConversionEventDeviceInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["screen_height"] == output["screen_height"]);




}


void test_ConversionEventDeviceInfo_screen_width_is_converted_to_json()
{
    bourne::json input =
    {
        "screen_width", 1
    };

    ConversionEventDeviceInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["screen_width"] == output["screen_width"]);




}


void test_ConversionEventDeviceInfo_storage_free_space_is_converted_to_json()
{
    bourne::json input =
    {
        "storage_free_space", 1
    };

    ConversionEventDeviceInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["storage_free_space"] == output["storage_free_space"]);




}


void test_ConversionEventDeviceInfo_storage_size_is_converted_to_json()
{
    bourne::json input =
    {
        "storage_size", 1
    };

    ConversionEventDeviceInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["storage_size"] == output["storage_size"]);




}


void test_ConversionEventDeviceInfo_timezone_is_converted_to_json()
{

    bourne::json input =
    {
        "timezone", "hello"
    };

    ConversionEventDeviceInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["timezone"] == output["timezone"]);



}


void test_ConversionEventDeviceInfo_timezone_abbr_is_converted_to_json()
{

    bourne::json input =
    {
        "timezone_abbr", "hello"
    };

    ConversionEventDeviceInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["timezone_abbr"] == output["timezone_abbr"]);



}


void test_ConversionEventDeviceInfo_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    ConversionEventDeviceInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}


