
#include "CustomerListUpdateRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_CustomerListUpdateRequest_records_is_assigned_from_json()
{


    bourne::json input =
    {
        "records", "hello"
    };

    CustomerListUpdateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRecords().c_str());






}




void test_CustomerListUpdateRequest_records_is_converted_to_json()
{

    bourne::json input =
    {
        "records", "hello"
    };

    CustomerListUpdateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["records"] == output["records"]);



}


