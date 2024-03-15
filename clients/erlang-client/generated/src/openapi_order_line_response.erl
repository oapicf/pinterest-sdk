-module(openapi_order_line_response).

-export([encode/1]).

-export_type([openapi_order_line_response/0]).

-type openapi_order_line_response() ::
    #{ 'errors' => list(),
       'order_line' => list()
     }.

encode(#{ 'errors' := Errors,
          'order_line' := OrderLine
        }) ->
    #{ 'errors' => Errors,
       'order_line' => OrderLine
     }.
