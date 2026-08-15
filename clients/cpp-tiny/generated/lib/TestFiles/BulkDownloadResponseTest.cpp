
#include "BulkDownloadResponse.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_BulkDownloadResponse_request_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "request_id", "hello"
    };

    BulkDownloadResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRequestId().c_str());






}



void test_BulkDownloadResponse_request_id_is_converted_to_json()
{

    bourne::json input =
    {
        "request_id", "hello"
    };

    BulkDownloadResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["request_id"] == output["request_id"]);



}


