-module(openapi_catalogs_delete_retail_item).

-export([encode/1]).

-export_type([openapi_catalogs_delete_retail_item/0]).

-type openapi_catalogs_delete_retail_item() ::
    #{ 'item_id' := binary(),
       'last_updated_time' => integer(),
       'operation' := binary()
     }.

encode(#{ 'item_id' := ItemId,
          'last_updated_time' := LastUpdatedTime,
          'operation' := Operation
        }) ->
    #{ 'item_id' => ItemId,
       'last_updated_time' => LastUpdatedTime,
       'operation' => Operation
     }.
