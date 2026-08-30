-module(openapi_order_line_mutation_response).

-export([encode/1]).

-export_type([openapi_order_line_mutation_response/0]).

-type openapi_order_line_mutation_response() ::
    #{ 'data' => openapi_order_line_mutation_result:openapi_order_line_mutation_result()
     }.

encode(#{ 'data' := Data
        }) ->
    #{ 'data' => Data
     }.
