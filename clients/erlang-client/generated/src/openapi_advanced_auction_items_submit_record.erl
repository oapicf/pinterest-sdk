-module(openapi_advanced_auction_items_submit_record).

-export([encode/1]).

-export_type([openapi_advanced_auction_items_submit_record/0]).

-type openapi_advanced_auction_items_submit_record() ::
    #{ 'operation' := openapi_advanced_auction_operation:openapi_advanced_auction_operation(),
       'country' := openapi_country:openapi_country(),
       'item_id' := binary(),
       'language' := openapi_language:openapi_language(),
       'bid_options' := openapi_advanced_auction_bid_options:openapi_advanced_auction_bid_options(),
       'errors' => list(),
       'update_mask' := list()
     }.

encode(#{ 'operation' := Operation,
          'country' := Country,
          'item_id' := ItemId,
          'language' := Language,
          'bid_options' := BidOptions,
          'errors' := Errors,
          'update_mask' := UpdateMask
        }) ->
    #{ 'operation' => Operation,
       'country' => Country,
       'item_id' => ItemId,
       'language' => Language,
       'bid_options' => BidOptions,
       'errors' => Errors,
       'update_mask' => UpdateMask
     }.
