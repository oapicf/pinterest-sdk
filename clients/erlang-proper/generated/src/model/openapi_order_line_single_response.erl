-module(openapi_order_line_single_response).

-include("openapi.hrl").

-export([openapi_order_line_single_response/0]).

-export([openapi_order_line_single_response/1]).

-export_type([openapi_order_line_single_response/0]).

-type openapi_order_line_single_response() ::
  [ {'data', openapi_order_line_response:openapi_order_line_response() }
  ].


openapi_order_line_single_response() ->
    openapi_order_line_single_response([]).

openapi_order_line_single_response(Fields) ->
  Default = [ {'data', openapi_order_line_response:openapi_order_line_response() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

