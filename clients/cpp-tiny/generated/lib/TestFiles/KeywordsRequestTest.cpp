
#include "KeywordsRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_KeywordsRequest_parent_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "parent_id", "hello"
    };

    KeywordsRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getParentId().c_str());






}




void test_KeywordsRequest_parent_id_is_converted_to_json()
{

    bourne::json input =
    {
        "parent_id", "hello"
    };

    KeywordsRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["parent_id"] == output["parent_id"]);



}


