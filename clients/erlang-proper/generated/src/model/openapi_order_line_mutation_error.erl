-module(openapi_order_line_mutation_error).

-include("openapi.hrl").

-export([openapi_order_line_mutation_error/0]).

-export([openapi_order_line_mutation_error/1]).

-export_type([openapi_order_line_mutation_error/0]).

-type openapi_order_line_mutation_error() ::
  [ {'data', openapi_order_line:openapi_order_line() }
  | {'error_messages', list(binary()) }
  ].


openapi_order_line_mutation_error() ->
    openapi_order_line_mutation_error([]).

openapi_order_line_mutation_error(Fields) ->
  Default = [ {'data', openapi_order_line:openapi_order_line() }
            , {'error_messages', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

