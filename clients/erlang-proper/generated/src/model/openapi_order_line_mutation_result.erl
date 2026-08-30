-module(openapi_order_line_mutation_result).

-include("openapi.hrl").

-export([openapi_order_line_mutation_result/0]).

-export([openapi_order_line_mutation_result/1]).

-export_type([openapi_order_line_mutation_result/0]).

-type openapi_order_line_mutation_result() ::
  [ {'errors', list(openapi_order_line_mutation_error:openapi_order_line_mutation_error()) }
  | {'order_line', list(openapi_order_line:openapi_order_line()) }
  ].


openapi_order_line_mutation_result() ->
    openapi_order_line_mutation_result([]).

openapi_order_line_mutation_result(Fields) ->
  Default = [ {'errors', list(openapi_order_line_mutation_error:openapi_order_line_mutation_error()) }
            , {'order_line', list(openapi_order_line:openapi_order_line()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

