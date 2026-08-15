
#include "KeywordMetricsResponse.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_KeywordMetricsResponse_keyword_is_assigned_from_json()
{


    bourne::json input =
    {
        "keyword", "hello"
    };

    KeywordMetricsResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getKeyword().c_str());






}




void test_KeywordMetricsResponse_keyword_is_converted_to_json()
{

    bourne::json input =
    {
        "keyword", "hello"
    };

    KeywordMetricsResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["keyword"] == output["keyword"]);



}



