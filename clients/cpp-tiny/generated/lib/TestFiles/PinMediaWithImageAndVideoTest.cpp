
#include "PinMediaWithImageAndVideo.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_PinMediaWithImageAndVideo_media_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "media_type", "hello"
    };

    PinMediaWithImageAndVideo obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMediaType().c_str());






}




void test_PinMediaWithImageAndVideo_media_type_is_converted_to_json()
{

    bourne::json input =
    {
        "media_type", "hello"
    };

    PinMediaWithImageAndVideo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["media_type"] == output["media_type"]);



}


