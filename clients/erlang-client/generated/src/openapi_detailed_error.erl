-module(openapi_detailed_error).

-export([encode/1]).

-export_type([openapi_detailed_error/0]).

-type openapi_detailed_error() ::
    #{ 'code' := integer(),
       'details' := maps:map(),
       'message' := binary()
     }.

encode(#{ 'code' := Code,
          'details' := Details,
          'message' := Message
        }) ->
    #{ 'code' => Code,
       'details' => Details,
       'message' => Message
     }.
