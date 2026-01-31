-module(openapi_error_detail).

-export([encode/1]).

-export_type([openapi_error_detail/0]).

-type openapi_error_detail() ::
    #{ 'count' := integer(),
       'error_code' := integer(),
       'message' := binary()
     }.

encode(#{ 'count' := Count,
          'error_code' := ErrorCode,
          'message' := Message
        }) ->
    #{ 'count' => Count,
       'error_code' => ErrorCode,
       'message' => Message
     }.
