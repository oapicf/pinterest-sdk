-module(openapi_catalogs_update_retail_item).

-export([encode/1]).

-export_type([openapi_catalogs_update_retail_item/0]).

-type openapi_catalogs_update_retail_item() ::
    #{ 'item_id' := binary(),
       'operation' := binary(),
       'attributes' := openapi_updatable_item_attributes:openapi_updatable_item_attributes(),
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
