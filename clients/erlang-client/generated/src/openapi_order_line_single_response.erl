-module(openapi_order_line_single_response).

-export([encode/1]).

-export_type([openapi_order_line_single_response/0]).

-type openapi_order_line_single_response() ::
    #{ 'data' => openapi_order_line_response:openapi_order_line_response()
     }.

encode(#{ 'data' := Data
        }) ->
    #{ 'data' => Data
     }.
