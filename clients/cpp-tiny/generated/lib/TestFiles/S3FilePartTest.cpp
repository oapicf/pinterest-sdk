
#include "S3FilePart.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_S3FilePart_part_number_is_assigned_from_json()
{
    bourne::json input =
    {
        "part_number", 1
    };

    S3FilePart obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPartNumber());








}


void test_S3FilePart_presigned_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "presigned_url", "hello"
    };

    S3FilePart obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPresignedUrl().c_str());






}



void test_S3FilePart_part_number_is_converted_to_json()
{
    bourne::json input =
    {
        "part_number", 1
    };

    S3FilePart obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["part_number"] == output["part_number"]);




}


void test_S3FilePart_presigned_url_is_converted_to_json()
{

    bourne::json input =
    {
        "presigned_url", "hello"
    };

    S3FilePart obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["presigned_url"] == output["presigned_url"]);



}


