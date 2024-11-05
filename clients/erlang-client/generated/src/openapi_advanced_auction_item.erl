-module(openapi_advanced_auction_item).

-export([encode/1]).

-export_type([openapi_advanced_auction_item/0]).

-type openapi_advanced_auction_item() ::
    #{ 'item_id' := binary(),
       'country' := openapi_country:openapi_country(),
       'language' := openapi_language:openapi_language(),
       'bid_options' := openapi_advanced_auction_bid_options:openapi_advanced_auction_bid_options()
     }.

encode(#{ 'item_id' := ItemId,
          'country' := Country,
          'language' := Language,
          'bid_options' := BidOptions
        }) ->
    #{ 'item_id' => ItemId,
       'country' => Country,
       'language' => Language,
       'bid_options' => BidOptions
     }.
