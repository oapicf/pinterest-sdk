
#include "AdvancedAuctionBidOptions.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_AdvancedAuctionBidOptions_bid_in_micro_currency_is_assigned_from_json()
{






    bourne::json input =
    {
        "bid_in_micro_currency", 1
    };

    AdvancedAuctionBidOptions obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getBidInMicroCurrency());


}





void test_AdvancedAuctionBidOptions_bid_in_micro_currency_is_converted_to_json()
{



    bourne::json input =
    {
        "bid_in_micro_currency", 1
    };

    AdvancedAuctionBidOptions obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["bid_in_micro_currency"] == output["bid_in_micro_currency"]);

}



