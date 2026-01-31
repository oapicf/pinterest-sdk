-module(openapi_advanced_auction_bid_options).

-export([encode/1]).

-export_type([openapi_advanced_auction_bid_options/0]).

-type openapi_advanced_auction_bid_options() ::
    #{ 'app_type_multipliers' => openapi_app_type_multipliers:openapi_app_type_multipliers(),
       'bid_in_micro_currency' => integer(),
       'placement_multipliers' => openapi_placement_multipliers:openapi_placement_multipliers()
     }.

encode(#{ 'app_type_multipliers' := AppTypeMultipliers,
          'bid_in_micro_currency' := BidInMicroCurrency,
          'placement_multipliers' := PlacementMultipliers
        }) ->
    #{ 'app_type_multipliers' => AppTypeMultipliers,
       'bid_in_micro_currency' => BidInMicroCurrency,
       'placement_multipliers' => PlacementMultipliers
     }.
