-module(openapi_order_line_response).

-include("openapi.hrl").

-export([openapi_order_line_response/0]).

-export([openapi_order_line_response/1]).

-export_type([openapi_order_line_response/0]).

-type openapi_order_line_response() ::
  [ {'errors', list(openapi_order_line_error:openapi_order_line_error()) }
  | {'order_line', list(openapi_order_line:openapi_order_line()) }
  ].


openapi_order_line_response() ->
    openapi_order_line_response([]).

openapi_order_line_response(Fields) ->
  Default = [ {'errors', list(openapi_order_line_error:openapi_order_line_error()) }
            , {'order_line', list(openapi_order_line:openapi_order_line()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

