-module(openapi_business_access_error).

-export([encode/1]).

-export_type([openapi_business_access_error/0]).

-type openapi_business_access_error() ::
    #{ 'code' := integer(),
       'message' := binary()
     }.

encode(#{ 'code' := Code,
          'message' := Message
        }) ->
    #{ 'code' => Code,
       'message' => Message
     }.
