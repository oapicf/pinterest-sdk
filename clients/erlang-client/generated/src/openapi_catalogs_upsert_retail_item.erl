-module(openapi_catalogs_upsert_retail_item).

-export([encode/1]).

-export_type([openapi_catalogs_upsert_retail_item/0]).

-type openapi_catalogs_upsert_retail_item() ::
    #{ 'item_id' := binary(),
       'operation' := binary(),
       'attributes' := openapi_item_attributes_request:openapi_item_attributes_request()
     }.

encode(#{ 'item_id' := ItemId,
          'operation' := Operation,
          'attributes' := Attributes
        }) ->
    #{ 'item_id' => ItemId,
       'operation' => Operation,
       'attributes' => Attributes
     }.
