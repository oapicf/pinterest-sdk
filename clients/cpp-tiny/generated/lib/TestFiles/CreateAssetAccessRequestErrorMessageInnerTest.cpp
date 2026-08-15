
#include "CreateAssetAccessRequestErrorMessage_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CreateAssetAccessRequestErrorMessage_inner_code_is_assigned_from_json()
{
    bourne::json input =
    {
        "code", 1
    };

    CreateAssetAccessRequestErrorMessage_inner obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCode());








}




void test_CreateAssetAccessRequestErrorMessage_inner_code_is_converted_to_json()
{
    bourne::json input =
    {
        "code", 1
    };

    CreateAssetAccessRequestErrorMessage_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["code"] == output["code"]);




}



