-module(openapi_exception).

-export([encode/1]).

-export_type([openapi_exception/0]).

-type openapi_exception() ::
    #{ 'code' => integer(),
       'message' => binary()
     }.

encode(#{ 'code' := Code,
          'message' := Message
        }) ->
    #{ 'code' => Code,
       'message' => Message
     }.
