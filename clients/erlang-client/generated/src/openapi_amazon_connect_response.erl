-module(openapi_amazon_connect_response).

-export([encode/1]).

-export_type([openapi_amazon_connect_response/0]).

-type openapi_amazon_connect_response() ::
    #{ 'message' => binary()
     }.

encode(#{ 'message' := Message
        }) ->
    #{ 'message' => Message
     }.
