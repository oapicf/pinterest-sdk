-module(openapi_item_create_batch_record).

-export([encode/1]).

-export_type([openapi_item_create_batch_record/0]).

-type openapi_item_create_batch_record() ::
    #{ 'attributes' => openapi_item_attributes_request:openapi_item_attributes_request(),
       'item_id' => binary()
     }.

encode(#{ 'attributes' := Attributes,
          'item_id' := ItemId
        }) ->
    #{ 'attributes' => Attributes,
       'item_id' => ItemId
     }.
