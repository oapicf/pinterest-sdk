-module(openapi_pinterest_lib_status204).

-export([encode/1]).

-export_type([openapi_pinterest_lib_status204/0]).

-type openapi_pinterest_lib_status204() ::
    #{ 'statusCode' := integer()
     }.

encode(#{ 'statusCode' := StatusCode
        }) ->
    #{ 'statusCode' => StatusCode
     }.
