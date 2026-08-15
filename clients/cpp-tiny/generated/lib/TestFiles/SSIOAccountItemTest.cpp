
#include "SSIOAccountItem.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_SSIOAccountItem_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    SSIOAccountItem obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_SSIOAccountItem_io_terms_is_assigned_from_json()
{


    bourne::json input =
    {
        "io_terms", "hello"
    };

    SSIOAccountItem obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getIoTerms().c_str());






}


void test_SSIOAccountItem_io_terms_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "io_terms_id", "hello"
    };

    SSIOAccountItem obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getIoTermsId().c_str());






}


void test_SSIOAccountItem_io_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "io_type", "hello"
    };

    SSIOAccountItem obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getIoType().c_str());






}


void test_SSIOAccountItem_row_terms_is_assigned_from_json()
{


    bourne::json input =
    {
        "row_terms", "hello"
    };

    SSIOAccountItem obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRowTerms().c_str());






}


void test_SSIOAccountItem_row_terms_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "row_terms_id", "hello"
    };

    SSIOAccountItem obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRowTermsId().c_str());






}


void test_SSIOAccountItem_us_terms_is_assigned_from_json()
{


    bourne::json input =
    {
        "us_terms", "hello"
    };

    SSIOAccountItem obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUsTerms().c_str());






}


void test_SSIOAccountItem_us_terms_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "us_terms_id", "hello"
    };

    SSIOAccountItem obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUsTermsId().c_str());






}




void test_SSIOAccountItem_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    SSIOAccountItem obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_SSIOAccountItem_io_terms_is_converted_to_json()
{

    bourne::json input =
    {
        "io_terms", "hello"
    };

    SSIOAccountItem obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["io_terms"] == output["io_terms"]);



}


void test_SSIOAccountItem_io_terms_id_is_converted_to_json()
{

    bourne::json input =
    {
        "io_terms_id", "hello"
    };

    SSIOAccountItem obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["io_terms_id"] == output["io_terms_id"]);



}


void test_SSIOAccountItem_io_type_is_converted_to_json()
{

    bourne::json input =
    {
        "io_type", "hello"
    };

    SSIOAccountItem obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["io_type"] == output["io_type"]);



}


void test_SSIOAccountItem_row_terms_is_converted_to_json()
{

    bourne::json input =
    {
        "row_terms", "hello"
    };

    SSIOAccountItem obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["row_terms"] == output["row_terms"]);



}


void test_SSIOAccountItem_row_terms_id_is_converted_to_json()
{

    bourne::json input =
    {
        "row_terms_id", "hello"
    };

    SSIOAccountItem obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["row_terms_id"] == output["row_terms_id"]);



}


void test_SSIOAccountItem_us_terms_is_converted_to_json()
{

    bourne::json input =
    {
        "us_terms", "hello"
    };

    SSIOAccountItem obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["us_terms"] == output["us_terms"]);



}


void test_SSIOAccountItem_us_terms_id_is_converted_to_json()
{

    bourne::json input =
    {
        "us_terms_id", "hello"
    };

    SSIOAccountItem obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["us_terms_id"] == output["us_terms_id"]);



}


