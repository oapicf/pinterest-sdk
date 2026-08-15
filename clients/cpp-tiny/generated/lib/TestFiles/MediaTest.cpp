
#include "Media.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_Media_media_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "media_id", "hello"
    };

    Media obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMediaId().c_str());






}





void test_Media_media_id_is_converted_to_json()
{

    bourne::json input =
    {
        "media_id", "hello"
    };

    Media obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["media_id"] == output["media_id"]);



}




