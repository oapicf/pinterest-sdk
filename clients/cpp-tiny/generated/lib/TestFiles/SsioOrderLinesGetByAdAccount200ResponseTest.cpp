
#include "Ssio_order_lines_get_by_ad_account_200_response.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_Ssio_order_lines_get_by_ad_account_200_response_bookmark_is_assigned_from_json()
{


    bourne::json input =
    {
        "bookmark", "hello"
    };

    Ssio_order_lines_get_by_ad_account_200_response obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBookmark().c_str());






}




void test_Ssio_order_lines_get_by_ad_account_200_response_bookmark_is_converted_to_json()
{

    bourne::json input =
    {
        "bookmark", "hello"
    };

    Ssio_order_lines_get_by_ad_account_200_response obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["bookmark"] == output["bookmark"]);



}



