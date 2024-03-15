-module(openapi_item_delete_discontinued_batch_record).

-export([encode/1]).

-export_type([openapi_item_delete_discontinued_batch_record/0]).

-type openapi_item_delete_discontinued_batch_record() ::
    #{ 'item_id' => binary()
     }.

encode(#{ 'item_id' := ItemId
        }) ->
    #{ 'item_id' => ItemId
     }.
