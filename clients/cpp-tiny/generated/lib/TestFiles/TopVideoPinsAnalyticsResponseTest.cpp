
#include "TopVideoPinsAnalyticsResponse.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"





void test_TopVideoPinsAnalyticsResponse_sort_by_is_assigned_from_json()
{


    bourne::json input =
    {
        "sort_by", "hello"
    };

    TopVideoPinsAnalyticsResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSortBy().c_str());






}





void test_TopVideoPinsAnalyticsResponse_sort_by_is_converted_to_json()
{

    bourne::json input =
    {
        "sort_by", "hello"
    };

    TopVideoPinsAnalyticsResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["sort_by"] == output["sort_by"]);



}


