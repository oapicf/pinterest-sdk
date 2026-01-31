-module(openapi_pinterest_lib_error).

-export([encode/1]).

-export_type([openapi_pinterest_lib_error/0]).

-type openapi_pinterest_lib_error() ::
    #{ 'code' := integer(),
       'message' := binary()
     }.

encode(#{ 'code' := Code,
          'message' := Message
        }) ->
    #{ 'code' => Code,
       'message' => Message
     }.
