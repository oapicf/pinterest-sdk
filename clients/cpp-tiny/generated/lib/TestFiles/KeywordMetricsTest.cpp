
#include "KeywordMetrics.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_KeywordMetrics_keyword_query_volume_is_assigned_from_json()
{


    bourne::json input =
    {
        "keyword_query_volume", "hello"
    };

    KeywordMetrics obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getKeywordQueryVolume().c_str());






}



void test_KeywordMetrics_keyword_query_volume_is_converted_to_json()
{

    bourne::json input =
    {
        "keyword_query_volume", "hello"
    };

    KeywordMetrics obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["keyword_query_volume"] == output["keyword_query_volume"]);



}


