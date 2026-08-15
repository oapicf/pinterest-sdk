
#include "CustomerListUploadCreateRequest.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_CustomerListUploadCreateRequest_total_parts_is_assigned_from_json()
{
    bourne::json input =
    {
        "total_parts", 1
    };

    CustomerListUploadCreateRequest obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getTotalParts());








}




void test_CustomerListUploadCreateRequest_total_parts_is_converted_to_json()
{
    bourne::json input =
    {
        "total_parts", 1
    };

    CustomerListUploadCreateRequest obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["total_parts"] == output["total_parts"]);




}


