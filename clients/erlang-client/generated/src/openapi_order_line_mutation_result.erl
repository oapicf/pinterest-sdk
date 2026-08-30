-module(openapi_order_line_mutation_result).

-export([encode/1]).

-export_type([openapi_order_line_mutation_result/0]).

-type openapi_order_line_mutation_result() ::
    #{ 'errors' => list(),
       'order_line' => list()
     }.

encode(#{ 'errors' := Errors,
          'order_line' := OrderLine
        }) ->
    #{ 'errors' => Errors,
       'order_line' => OrderLine
     }.
