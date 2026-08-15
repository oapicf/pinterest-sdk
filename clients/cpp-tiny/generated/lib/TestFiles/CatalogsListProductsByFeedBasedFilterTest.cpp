
#include "CatalogsListProductsByFeedBasedFilter.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CatalogsListProductsByFeedBasedFilter_feed_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "feed_id", "hello"
    };

    CatalogsListProductsByFeedBasedFilter obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFeedId().c_str());






}




void test_CatalogsListProductsByFeedBasedFilter_feed_id_is_converted_to_json()
{

    bourne::json input =
    {
        "feed_id", "hello"
    };

    CatalogsListProductsByFeedBasedFilter obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["feed_id"] == output["feed_id"]);



}



