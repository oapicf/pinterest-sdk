
#include "LocalStoreUpdate.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_LocalStoreUpdate_address_primary_is_assigned_from_json()
{


    bourne::json input =
    {
        "address_primary", "hello"
    };

    LocalStoreUpdate obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAddressPrimary().c_str());






}


void test_LocalStoreUpdate_address_secondary_is_assigned_from_json()
{


    bourne::json input =
    {
        "address_secondary", "hello"
    };

    LocalStoreUpdate obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAddressSecondary().c_str());






}


void test_LocalStoreUpdate_city_is_assigned_from_json()
{


    bourne::json input =
    {
        "city", "hello"
    };

    LocalStoreUpdate obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCity().c_str());






}



void test_LocalStoreUpdate_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    LocalStoreUpdate obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_LocalStoreUpdate_latitude_is_assigned_from_json()
{








    bourne::json input =
    {
        "latitude", 1.0
    };

    LocalStoreUpdate obj(input.dump());

    TEST_ASSERT_EQUAL_FLOAT(1.0, obj.getLatitude());
}


void test_LocalStoreUpdate_longitude_is_assigned_from_json()
{








    bourne::json input =
    {
        "longitude", 1.0
    };

    LocalStoreUpdate obj(input.dump());

    TEST_ASSERT_EQUAL_FLOAT(1.0, obj.getLongitude());
}


void test_LocalStoreUpdate_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    LocalStoreUpdate obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_LocalStoreUpdate_postal_code_is_assigned_from_json()
{


    bourne::json input =
    {
        "postal_code", "hello"
    };

    LocalStoreUpdate obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPostalCode().c_str());






}


void test_LocalStoreUpdate_region_is_assigned_from_json()
{


    bourne::json input =
    {
        "region", "hello"
    };

    LocalStoreUpdate obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRegion().c_str());






}


void test_LocalStoreUpdate_store_code_is_assigned_from_json()
{


    bourne::json input =
    {
        "store_code", "hello"
    };

    LocalStoreUpdate obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getStoreCode().c_str());






}



void test_LocalStoreUpdate_address_primary_is_converted_to_json()
{

    bourne::json input =
    {
        "address_primary", "hello"
    };

    LocalStoreUpdate obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["address_primary"] == output["address_primary"]);



}


void test_LocalStoreUpdate_address_secondary_is_converted_to_json()
{

    bourne::json input =
    {
        "address_secondary", "hello"
    };

    LocalStoreUpdate obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["address_secondary"] == output["address_secondary"]);



}


void test_LocalStoreUpdate_city_is_converted_to_json()
{

    bourne::json input =
    {
        "city", "hello"
    };

    LocalStoreUpdate obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["city"] == output["city"]);



}



void test_LocalStoreUpdate_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    LocalStoreUpdate obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_LocalStoreUpdate_latitude_is_converted_to_json()
{




    bourne::json input =
    {
        "latitude", 1.0
    };

    LocalStoreUpdate obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["latitude"] == output["latitude"]);
}


void test_LocalStoreUpdate_longitude_is_converted_to_json()
{




    bourne::json input =
    {
        "longitude", 1.0
    };

    LocalStoreUpdate obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["longitude"] == output["longitude"]);
}


void test_LocalStoreUpdate_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    LocalStoreUpdate obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_LocalStoreUpdate_postal_code_is_converted_to_json()
{

    bourne::json input =
    {
        "postal_code", "hello"
    };

    LocalStoreUpdate obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["postal_code"] == output["postal_code"]);



}


void test_LocalStoreUpdate_region_is_converted_to_json()
{

    bourne::json input =
    {
        "region", "hello"
    };

    LocalStoreUpdate obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["region"] == output["region"]);



}


void test_LocalStoreUpdate_store_code_is_converted_to_json()
{

    bourne::json input =
    {
        "store_code", "hello"
    };

    LocalStoreUpdate obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["store_code"] == output["store_code"]);



}


