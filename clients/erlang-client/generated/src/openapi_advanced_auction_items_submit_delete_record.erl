-module(openapi_advanced_auction_items_submit_delete_record).

-export([encode/1]).

-export_type([openapi_advanced_auction_items_submit_delete_record/0]).

-type openapi_advanced_auction_items_submit_delete_record() ::
    #{ 'country' := openapi_country:openapi_country(),
       'errors' => list(),
       'item_id' := binary(),
       'language' := openapi_language:openapi_language(),
       'operation' := binary()
     }.

encode(#{ 'country' := Country,
          'errors' := Errors,
          'item_id' := ItemId,
          'language' := Language,
          'operation' := Operation
        }) ->
    #{ 'country' => Country,
       'errors' => Errors,
       'item_id' => ItemId,
       'language' => Language,
       'operation' => Operation
     }.
