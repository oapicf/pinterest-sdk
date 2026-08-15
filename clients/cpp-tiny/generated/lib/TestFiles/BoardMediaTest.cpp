
#include "BoardMedia.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_BoardMedia_image_cover_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "image_cover_url", "hello"
    };

    BoardMedia obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getImageCoverUrl().c_str());






}




void test_BoardMedia_image_cover_url_is_converted_to_json()
{

    bourne::json input =
    {
        "image_cover_url", "hello"
    };

    BoardMedia obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["image_cover_url"] == output["image_cover_url"]);



}



