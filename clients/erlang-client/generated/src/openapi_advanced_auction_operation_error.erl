-module(openapi_advanced_auction_operation_error).

-export([encode/1]).

-export_type([openapi_advanced_auction_operation_error/0]).

-type openapi_advanced_auction_operation_error() ::
    #{ 'code' => integer(),
       'message' => binary()
     }.

encode(#{ 'code' := Code,
          'message' := Message
        }) ->
    #{ 'code' => Code,
       'message' => Message
     }.
