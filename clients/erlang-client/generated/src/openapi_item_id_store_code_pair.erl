-module(openapi_item_id_store_code_pair).

-export([encode/1]).

-export_type([openapi_item_id_store_code_pair/0]).

-type openapi_item_id_store_code_pair() ::
    #{ 'item_id' := binary(),
       'store_code' := binary()
     }.

encode(#{ 'item_id' := ItemId,
          'store_code' := StoreCode
        }) ->
    #{ 'item_id' => ItemId,
       'store_code' => StoreCode
     }.
