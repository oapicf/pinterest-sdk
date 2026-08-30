-module(openapi_advanced_auction_items_submit_record).

-export([encode/1]).

-export_type([openapi_advanced_auction_items_submit_record/0]).

-type openapi_advanced_auction_items_submit_record() ::
    #{ 'bid_options' := openapi_advanced_auction_bid_options:openapi_advanced_auction_bid_options(),
       'country' := openapi_country:openapi_country(),
       'errors' => list(),
       'item_id' := binary(),
       'language' := openapi_language:openapi_language(),
       'operation' := binary(),
       'update_mask' := list()
     }.

encode(#{ 'bid_options' := BidOptions,
          'country' := Country,
          'errors' := Errors,
          'item_id' := ItemId,
          'language' := Language,
          'operation' := Operation,
          'update_mask' := UpdateMask
        }) ->
    #{ 'bid_options' => BidOptions,
       'country' => Country,
       'errors' => Errors,
       'item_id' => ItemId,
       'language' => Language,
       'operation' => Operation,
       'update_mask' => UpdateMask
     }.
