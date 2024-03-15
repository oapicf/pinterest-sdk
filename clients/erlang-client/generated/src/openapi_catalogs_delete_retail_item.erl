-module(openapi_catalogs_delete_retail_item).

-export([encode/1]).

-export_type([openapi_catalogs_delete_retail_item/0]).

-type openapi_catalogs_delete_retail_item() ::
    #{ 'item_id' := binary(),
       'operation' := binary()
     }.

encode(#{ 'item_id' := ItemId,
          'operation' := Operation
        }) ->
    #{ 'item_id' => ItemId,
       'operation' => Operation
     }.
