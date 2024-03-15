-module(openapi_item_validation_event).

-export([encode/1]).

-export_type([openapi_item_validation_event/0]).

-type openapi_item_validation_event() ::
    #{ 'attribute' => binary(),
       'code' => integer(),
       'message' => binary()
     }.

encode(#{ 'attribute' := Attribute,
          'code' := Code,
          'message' := Message
        }) ->
    #{ 'attribute' => Attribute,
       'code' => Code,
       'message' => Message
     }.
