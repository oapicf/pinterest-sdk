-module(openapi_item_create_batch_record).

-export([encode/1]).

-export_type([openapi_item_create_batch_record/0]).

-type openapi_item_create_batch_record() ::
    #{ 'item_id' => binary(),
       'attributes' => openapi_item_attributes_request:openapi_item_attributes_request()
     }.

encode(#{ 'item_id' := ItemId,
          'attributes' := Attributes
        }) ->
    #{ 'item_id' => ItemId,
       'attributes' => Attributes
     }.
