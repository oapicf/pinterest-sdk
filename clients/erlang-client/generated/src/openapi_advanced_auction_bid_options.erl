-module(openapi_advanced_auction_bid_options).

-export([encode/1]).

-export_type([openapi_advanced_auction_bid_options/0]).

-type openapi_advanced_auction_bid_options() ::
    #{ 'bid_in_micro_currency' => integer(),
       'app_type_multipliers' => openapi_app_type_multipliers:openapi_app_type_multipliers(),
       'placement_multipliers' => openapi_placement_multipliers:openapi_placement_multipliers()
     }.

encode(#{ 'bid_in_micro_currency' := BidInMicroCurrency,
          'app_type_multipliers' := AppTypeMultipliers,
          'placement_multipliers' := PlacementMultipliers
        }) ->
    #{ 'bid_in_micro_currency' => BidInMicroCurrency,
       'app_type_multipliers' => AppTypeMultipliers,
       'placement_multipliers' => PlacementMultipliers
     }.
