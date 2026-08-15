
#include "MediaUploadParameters.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_MediaUploadParameters_contentType_is_assigned_from_json()
{


    bourne::json input =
    {
        "contentType", "hello"
    };

    MediaUploadParameters obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getContentType().c_str());






}


void test_MediaUploadParameters_key_is_assigned_from_json()
{


    bourne::json input =
    {
        "key", "hello"
    };

    MediaUploadParameters obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getKey().c_str());






}


void test_MediaUploadParameters_policy_is_assigned_from_json()
{


    bourne::json input =
    {
        "policy", "hello"
    };

    MediaUploadParameters obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPolicy().c_str());






}


void test_MediaUploadParameters_xamzalgorithm_is_assigned_from_json()
{


    bourne::json input =
    {
        "xamzalgorithm", "hello"
    };

    MediaUploadParameters obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getXamzalgorithm().c_str());






}


void test_MediaUploadParameters_xamzcredential_is_assigned_from_json()
{


    bourne::json input =
    {
        "xamzcredential", "hello"
    };

    MediaUploadParameters obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getXamzcredential().c_str());






}


void test_MediaUploadParameters_xamzdate_is_assigned_from_json()
{


    bourne::json input =
    {
        "xamzdate", "hello"
    };

    MediaUploadParameters obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getXamzdate().c_str());






}


void test_MediaUploadParameters_xamzsecuritytoken_is_assigned_from_json()
{


    bourne::json input =
    {
        "xamzsecuritytoken", "hello"
    };

    MediaUploadParameters obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getXamzsecuritytoken().c_str());






}


void test_MediaUploadParameters_xamzsignature_is_assigned_from_json()
{


    bourne::json input =
    {
        "xamzsignature", "hello"
    };

    MediaUploadParameters obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getXamzsignature().c_str());






}



void test_MediaUploadParameters_contentType_is_converted_to_json()
{

    bourne::json input =
    {
        "contentType", "hello"
    };

    MediaUploadParameters obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["contentType"] == output["contentType"]);



}


void test_MediaUploadParameters_key_is_converted_to_json()
{

    bourne::json input =
    {
        "key", "hello"
    };

    MediaUploadParameters obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["key"] == output["key"]);



}


void test_MediaUploadParameters_policy_is_converted_to_json()
{

    bourne::json input =
    {
        "policy", "hello"
    };

    MediaUploadParameters obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["policy"] == output["policy"]);



}


void test_MediaUploadParameters_xamzalgorithm_is_converted_to_json()
{

    bourne::json input =
    {
        "xamzalgorithm", "hello"
    };

    MediaUploadParameters obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["xamzalgorithm"] == output["xamzalgorithm"]);



}


void test_MediaUploadParameters_xamzcredential_is_converted_to_json()
{

    bourne::json input =
    {
        "xamzcredential", "hello"
    };

    MediaUploadParameters obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["xamzcredential"] == output["xamzcredential"]);



}


void test_MediaUploadParameters_xamzdate_is_converted_to_json()
{

    bourne::json input =
    {
        "xamzdate", "hello"
    };

    MediaUploadParameters obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["xamzdate"] == output["xamzdate"]);



}


void test_MediaUploadParameters_xamzsecuritytoken_is_converted_to_json()
{

    bourne::json input =
    {
        "xamzsecuritytoken", "hello"
    };

    MediaUploadParameters obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["xamzsecuritytoken"] == output["xamzsecuritytoken"]);



}


void test_MediaUploadParameters_xamzsignature_is_converted_to_json()
{

    bourne::json input =
    {
        "xamzsignature", "hello"
    };

    MediaUploadParameters obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["xamzsignature"] == output["xamzsignature"]);



}


