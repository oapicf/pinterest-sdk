
#include "BulkUpsertStatusResponse.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_BulkUpsertStatusResponse_result_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "result_url", "hello"
    };

    BulkUpsertStatusResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getResultUrl().c_str());






}




void test_BulkUpsertStatusResponse_result_url_is_converted_to_json()
{

    bourne::json input =
    {
        "result_url", "hello"
    };

    BulkUpsertStatusResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["result_url"] == output["result_url"]);



}



