-module(openapi_order_lines_array_response).

-include("openapi.hrl").

-export([openapi_order_lines_array_response/0]).

-export([openapi_order_lines_array_response/1]).

-export_type([openapi_order_lines_array_response/0]).

-type openapi_order_lines_array_response() ::
  [ {'items', list(openapi_order_lines:openapi_order_lines()) }
  ].


openapi_order_lines_array_response() ->
    openapi_order_lines_array_response([]).

openapi_order_lines_array_response(Fields) ->
  Default = [ {'items', list(openapi_order_lines:openapi_order_lines()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

