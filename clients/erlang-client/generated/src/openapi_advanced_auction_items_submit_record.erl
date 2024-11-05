-module(openapi_advanced_auction_items_submit_record).

-export([encode/1]).

-export_type([openapi_advanced_auction_items_submit_record/0]).

-type openapi_advanced_auction_items_submit_record() ::
    #{ 'operation' := openapi_advanced_auction_operation:openapi_advanced_auction_operation(),
       'item_id' := binary(),
       'country' := openapi_country:openapi_country(),
       'language' := openapi_language:openapi_language(),
       'bid_options' := openapi_advanced_auction_bid_options:openapi_advanced_auction_bid_options(),
       'update_mask' := list()
     }.

encode(#{ 'operation' := Operation,
          'item_id' := ItemId,
          'country' := Country,
          'language' := Language,
          'bid_options' := BidOptions,
          'update_mask' := UpdateMask
        }) ->
    #{ 'operation' => Operation,
       'item_id' => ItemId,
       'country' => Country,
       'language' => Language,
       'bid_options' => BidOptions,
       'update_mask' => UpdateMask
     }.
