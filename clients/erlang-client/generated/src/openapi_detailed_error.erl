-module(openapi_detailed_error).

-export([encode/1]).

-export_type([openapi_detailed_error/0]).

-type openapi_detailed_error() ::
    #{ 'code' := integer(),
       'message' := binary(),
       'details' := maps:map()
     }.

encode(#{ 'code' := Code,
          'message' := Message,
          'details' := Details
        }) ->
    #{ 'code' => Code,
       'message' => Message,
       'details' => Details
     }.
