
#include "AdvancedAuctionItemsGetRecord.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_AdvancedAuctionItemsGetRecord_item_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "item_id", "hello"
    };

    AdvancedAuctionItemsGetRecord obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getItemId().c_str());






}





void test_AdvancedAuctionItemsGetRecord_item_id_is_converted_to_json()
{

    bourne::json input =
    {
        "item_id", "hello"
    };

    AdvancedAuctionItemsGetRecord obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["item_id"] == output["item_id"]);



}



