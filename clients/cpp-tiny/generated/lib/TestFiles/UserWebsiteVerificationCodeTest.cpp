
#include "UserWebsiteVerificationCode.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_UserWebsiteVerificationCode_dns_txt_record_is_assigned_from_json()
{


    bourne::json input =
    {
        "dns_txt_record", "hello"
    };

    UserWebsiteVerificationCode obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDnsTxtRecord().c_str());






}


void test_UserWebsiteVerificationCode_file_content_is_assigned_from_json()
{


    bourne::json input =
    {
        "file_content", "hello"
    };

    UserWebsiteVerificationCode obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFileContent().c_str());






}


void test_UserWebsiteVerificationCode_filename_is_assigned_from_json()
{


    bourne::json input =
    {
        "filename", "hello"
    };

    UserWebsiteVerificationCode obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFilename().c_str());






}


void test_UserWebsiteVerificationCode_metatag_is_assigned_from_json()
{


    bourne::json input =
    {
        "metatag", "hello"
    };

    UserWebsiteVerificationCode obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMetatag().c_str());






}


void test_UserWebsiteVerificationCode_verification_code_is_assigned_from_json()
{


    bourne::json input =
    {
        "verification_code", "hello"
    };

    UserWebsiteVerificationCode obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getVerificationCode().c_str());






}



void test_UserWebsiteVerificationCode_dns_txt_record_is_converted_to_json()
{

    bourne::json input =
    {
        "dns_txt_record", "hello"
    };

    UserWebsiteVerificationCode obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["dns_txt_record"] == output["dns_txt_record"]);



}


void test_UserWebsiteVerificationCode_file_content_is_converted_to_json()
{

    bourne::json input =
    {
        "file_content", "hello"
    };

    UserWebsiteVerificationCode obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["file_content"] == output["file_content"]);



}


void test_UserWebsiteVerificationCode_filename_is_converted_to_json()
{

    bourne::json input =
    {
        "filename", "hello"
    };

    UserWebsiteVerificationCode obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["filename"] == output["filename"]);



}


void test_UserWebsiteVerificationCode_metatag_is_converted_to_json()
{

    bourne::json input =
    {
        "metatag", "hello"
    };

    UserWebsiteVerificationCode obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["metatag"] == output["metatag"]);



}


void test_UserWebsiteVerificationCode_verification_code_is_converted_to_json()
{

    bourne::json input =
    {
        "verification_code", "hello"
    };

    UserWebsiteVerificationCode obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["verification_code"] == output["verification_code"]);



}


