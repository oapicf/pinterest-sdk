-module(openapi_catalogs_retail_batch_request_items_items).

-export([encode/1]).

-export_type([openapi_catalogs_retail_batch_request_items_items/0]).

-type openapi_catalogs_retail_batch_request_items_items() ::
    #{ 'attributes' := openapi_item_attributes_request:openapi_item_attributes_request(),
       'item_id' := binary(),
       'operation' := binary(),
       'update_mask' => list(),
       'last_updated_time' => integer()
     }.

encode(#{ 'attributes' := Attributes,
          'item_id' := ItemId,
          'operation' := Operation,
          'update_mask' := UpdateMask,
          'last_updated_time' := LastUpdatedTime
        }) ->
    #{ 'attributes' => Attributes,
       'item_id' => ItemId,
       'operation' => Operation,
       'update_mask' => UpdateMask,
       'last_updated_time' => LastUpdatedTime
     }.
