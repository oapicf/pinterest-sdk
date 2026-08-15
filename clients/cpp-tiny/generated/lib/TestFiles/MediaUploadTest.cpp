
#include "MediaUpload.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_MediaUpload_media_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "media_id", "hello"
    };

    MediaUpload obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMediaId().c_str());






}




void test_MediaUpload_upload_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "upload_url", "hello"
    };

    MediaUpload obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUploadUrl().c_str());






}



void test_MediaUpload_media_id_is_converted_to_json()
{

    bourne::json input =
    {
        "media_id", "hello"
    };

    MediaUpload obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["media_id"] == output["media_id"]);



}




void test_MediaUpload_upload_url_is_converted_to_json()
{

    bourne::json input =
    {
        "upload_url", "hello"
    };

    MediaUpload obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["upload_url"] == output["upload_url"]);



}


