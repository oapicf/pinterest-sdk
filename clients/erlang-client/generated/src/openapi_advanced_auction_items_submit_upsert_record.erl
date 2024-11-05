-module(openapi_advanced_auction_items_submit_upsert_record).

-export([encode/1]).

-export_type([openapi_advanced_auction_items_submit_upsert_record/0]).

-type openapi_advanced_auction_items_submit_upsert_record() ::
    #{ 'item_id' := binary(),
       'country' := openapi_country:openapi_country(),
       'language' := openapi_language:openapi_language(),
       'bid_options' := openapi_advanced_auction_bid_options:openapi_advanced_auction_bid_options(),
       'update_mask' := list()
     }.

encode(#{ 'item_id' := ItemId,
          'country' := Country,
          'language' := Language,
          'bid_options' := BidOptions,
          'update_mask' := UpdateMask
        }) ->
    #{ 'item_id' => ItemId,
       'country' => Country,
       'language' => Language,
       'bid_options' => BidOptions,
       'update_mask' => UpdateMask
     }.
