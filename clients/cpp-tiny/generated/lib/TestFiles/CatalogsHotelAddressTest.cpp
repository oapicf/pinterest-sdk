
#include "CatalogsHotelAddress.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CatalogsHotelAddress_addr1_is_assigned_from_json()
{


    bourne::json input =
    {
        "addr1", "hello"
    };

    CatalogsHotelAddress obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getAddr1().c_str());






}


void test_CatalogsHotelAddress_city_is_assigned_from_json()
{


    bourne::json input =
    {
        "city", "hello"
    };

    CatalogsHotelAddress obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCity().c_str());






}


void test_CatalogsHotelAddress_country_is_assigned_from_json()
{


    bourne::json input =
    {
        "country", "hello"
    };

    CatalogsHotelAddress obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCountry().c_str());






}


void test_CatalogsHotelAddress_postal_code_is_assigned_from_json()
{


    bourne::json input =
    {
        "postal_code", "hello"
    };

    CatalogsHotelAddress obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPostalCode().c_str());






}


void test_CatalogsHotelAddress_region_is_assigned_from_json()
{


    bourne::json input =
    {
        "region", "hello"
    };

    CatalogsHotelAddress obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRegion().c_str());






}



void test_CatalogsHotelAddress_addr1_is_converted_to_json()
{

    bourne::json input =
    {
        "addr1", "hello"
    };

    CatalogsHotelAddress obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["addr1"] == output["addr1"]);



}


void test_CatalogsHotelAddress_city_is_converted_to_json()
{

    bourne::json input =
    {
        "city", "hello"
    };

    CatalogsHotelAddress obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["city"] == output["city"]);



}


void test_CatalogsHotelAddress_country_is_converted_to_json()
{

    bourne::json input =
    {
        "country", "hello"
    };

    CatalogsHotelAddress obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["country"] == output["country"]);



}


void test_CatalogsHotelAddress_postal_code_is_converted_to_json()
{

    bourne::json input =
    {
        "postal_code", "hello"
    };

    CatalogsHotelAddress obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["postal_code"] == output["postal_code"]);



}


void test_CatalogsHotelAddress_region_is_converted_to_json()
{

    bourne::json input =
    {
        "region", "hello"
    };

    CatalogsHotelAddress obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["region"] == output["region"]);



}


