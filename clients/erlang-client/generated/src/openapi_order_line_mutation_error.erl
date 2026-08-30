-module(openapi_order_line_mutation_error).

-export([encode/1]).

-export_type([openapi_order_line_mutation_error/0]).

-type openapi_order_line_mutation_error() ::
    #{ 'data' => openapi_order_line:openapi_order_line(),
       'error_messages' => list()
     }.

encode(#{ 'data' := Data,
          'error_messages' := ErrorMessages
        }) ->
    #{ 'data' => Data,
       'error_messages' => ErrorMessages
     }.
