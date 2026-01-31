-module(openapi_item_update_batch_record).

-export([encode/1]).

-export_type([openapi_item_update_batch_record/0]).

-type openapi_item_update_batch_record() ::
    #{ 'attributes' => openapi_updatable_item_attributes:openapi_updatable_item_attributes(),
       'item_id' => binary(),
       'update_mask' => list()
     }.

encode(#{ 'attributes' := Attributes,
          'item_id' := ItemId,
          'update_mask' := UpdateMask
        }) ->
    #{ 'attributes' => Attributes,
       'item_id' => ItemId,
       'update_mask' => UpdateMask
     }.
