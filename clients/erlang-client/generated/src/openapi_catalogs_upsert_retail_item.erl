-module(openapi_catalogs_upsert_retail_item).

-export([encode/1]).

-export_type([openapi_catalogs_upsert_retail_item/0]).

-type openapi_catalogs_upsert_retail_item() ::
    #{ 'attributes' := openapi_item_attributes_request:openapi_item_attributes_request(),
       'item_id' := binary(),
       'operation' := binary()
     }.

encode(#{ 'attributes' := Attributes,
          'item_id' := ItemId,
          'operation' := Operation
        }) ->
    #{ 'attributes' => Attributes,
       'item_id' => ItemId,
       'operation' => Operation
     }.
