-module(openapi_advanced_auction_items_submit_delete_record).

-export([encode/1]).

-export_type([openapi_advanced_auction_items_submit_delete_record/0]).

-type openapi_advanced_auction_items_submit_delete_record() ::
    #{ 'country' := openapi_country:openapi_country(),
       'item_id' := binary(),
       'language' := openapi_language:openapi_language(),
       'errors' => list()
     }.

encode(#{ 'country' := Country,
          'item_id' := ItemId,
          'language' := Language,
          'errors' := Errors
        }) ->
    #{ 'country' => Country,
       'item_id' => ItemId,
       'language' => Language,
       'errors' => Errors
     }.
