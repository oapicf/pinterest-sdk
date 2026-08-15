
#include "BulkDownloadRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"







void test_BulkDownloadRequest_updated_since_is_assigned_from_json()
{


    bourne::json input =
    {
        "updated_since", "hello"
    };

    BulkDownloadRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUpdatedSince().c_str());






}







void test_BulkDownloadRequest_updated_since_is_converted_to_json()
{

    bourne::json input =
    {
        "updated_since", "hello"
    };

    BulkDownloadRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["updated_since"] == output["updated_since"]);



}


