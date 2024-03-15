-module(openapi_item_batch_record).

-export([encode/1]).

-export_type([openapi_item_batch_record/0]).

-type openapi_item_batch_record() ::
    #{ 'item_id' => binary(),
       'attributes' => openapi_item_attributes:openapi_item_attributes(),
       'update_mask' => list()
     }.

encode(#{ 'item_id' := ItemId,
          'attributes' := Attributes,
          'update_mask' := UpdateMask
        }) ->
    #{ 'item_id' => ItemId,
       'attributes' => Attributes,
       'update_mask' => UpdateMask
     }.
