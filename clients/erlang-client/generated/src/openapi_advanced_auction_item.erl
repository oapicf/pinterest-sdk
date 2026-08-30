-module(openapi_advanced_auction_item).

-export([encode/1]).

-export_type([openapi_advanced_auction_item/0]).

-type openapi_advanced_auction_item() ::
    #{ 'bid_options' := openapi_advanced_auction_bid_options:openapi_advanced_auction_bid_options(),
       'country' := openapi_country:openapi_country(),
       'item_id' := binary(),
       'language' := openapi_language:openapi_language()
     }.

encode(#{ 'bid_options' := BidOptions,
          'country' := Country,
          'item_id' := ItemId,
          'language' := Language
        }) ->
    #{ 'bid_options' => BidOptions,
       'country' => Country,
       'item_id' => ItemId,
       'language' => Language
     }.
