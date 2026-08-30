-module(openapi_order_line_mutation_response).

-include("openapi.hrl").

-export([openapi_order_line_mutation_response/0]).

-export([openapi_order_line_mutation_response/1]).

-export_type([openapi_order_line_mutation_response/0]).

-type openapi_order_line_mutation_response() ::
  [ {'data', openapi_order_line_mutation_result:openapi_order_line_mutation_result() }
  ].


openapi_order_line_mutation_response() ->
    openapi_order_line_mutation_response([]).

openapi_order_line_mutation_response(Fields) ->
  Default = [ {'data', openapi_order_line_mutation_result:openapi_order_line_mutation_result() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

