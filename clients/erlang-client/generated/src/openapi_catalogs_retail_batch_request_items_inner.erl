-module(openapi_catalogs_retail_batch_request_items_inner).

-export([encode/1]).

-export_type([openapi_catalogs_retail_batch_request_items_inner/0]).

-type openapi_catalogs_retail_batch_request_items_inner() ::
    #{ 'item_id' := binary(),
       'operation' := binary(),
       'attributes' := openapi_item_attributes_request:openapi_item_attributes_request(),
       'update_mask' => list()
     }.

encode(#{ 'item_id' := ItemId,
          'operation' := Operation,
          'attributes' := Attributes,
          'update_mask' := UpdateMask
        }) ->
    #{ 'item_id' => ItemId,
       'operation' => Operation,
       'attributes' => Attributes,
       'update_mask' => UpdateMask
     }.
