-module(openapi_error).

-export([encode/1]).

-export_type([openapi_error/0]).

-type openapi_error() ::
    #{ 'code' := integer(),
       'message' := binary()
     }.

encode(#{ 'code' := Code,
          'message' := Message
        }) ->
    #{ 'code' => Code,
       'message' => Message
     }.
