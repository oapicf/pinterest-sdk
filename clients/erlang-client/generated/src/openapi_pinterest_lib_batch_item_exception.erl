-module(openapi_pinterest_lib_batch_item_exception).

-export([encode/1]).

-export_type([openapi_pinterest_lib_batch_item_exception/0]).

-type openapi_pinterest_lib_batch_item_exception() ::
    #{ 'code' => integer(),
       'message' := binary()
     }.

encode(#{ 'code' := Code,
          'message' := Message
        }) ->
    #{ 'code' => Code,
       'message' => Message
     }.
