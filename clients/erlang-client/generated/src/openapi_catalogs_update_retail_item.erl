-module(openapi_catalogs_update_retail_item).

-export([encode/1]).

-export_type([openapi_catalogs_update_retail_item/0]).

-type openapi_catalogs_update_retail_item() ::
    #{ 'attributes' := openapi_updatable_item_attributes:openapi_updatable_item_attributes(),
       'item_id' := binary(),
       'operation' := binary(),
       'update_mask' => list()
     }.

encode(#{ 'attributes' := Attributes,
          'item_id' := ItemId,
          'operation' := Operation,
          'update_mask' := UpdateMask
        }) ->
    #{ 'attributes' => Attributes,
       'item_id' => ItemId,
       'operation' => Operation,
       'update_mask' => UpdateMask
     }.
