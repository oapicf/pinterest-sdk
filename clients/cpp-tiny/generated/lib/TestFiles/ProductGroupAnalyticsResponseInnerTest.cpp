
#include "ProductGroupAnalyticsResponse_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_ProductGroupAnalyticsResponse_inner_pRODUCT_GROUP_ID_is_assigned_from_json()
{


    bourne::json input =
    {
        "pRODUCT_GROUP_ID", "hello"
    };

    ProductGroupAnalyticsResponse_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPRODUCTGROUPID().c_str());






}




void test_ProductGroupAnalyticsResponse_inner_pRODUCT_GROUP_ID_is_converted_to_json()
{

    bourne::json input =
    {
        "pRODUCT_GROUP_ID", "hello"
    };

    ProductGroupAnalyticsResponse_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["pRODUCT_GROUP_ID"] == output["pRODUCT_GROUP_ID"]);



}


