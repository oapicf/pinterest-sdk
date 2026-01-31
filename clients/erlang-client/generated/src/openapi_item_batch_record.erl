-module(openapi_item_batch_record).

-export([encode/1]).

-export_type([openapi_item_batch_record/0]).

-type openapi_item_batch_record() ::
    #{ 'attributes' => openapi_item_attributes_request:openapi_item_attributes_request(),
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
