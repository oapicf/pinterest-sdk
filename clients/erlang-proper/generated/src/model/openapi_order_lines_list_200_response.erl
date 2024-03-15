-module(openapi_order_lines_list_200_response).

-include("openapi.hrl").

-export([openapi_order_lines_list_200_response/0]).

-export([openapi_order_lines_list_200_response/1]).

-export_type([openapi_order_lines_list_200_response/0]).

-type openapi_order_lines_list_200_response() ::
  [ {'items', list(openapi_order_line:openapi_order_line()) }
  | {'bookmark', binary() }
  ].


openapi_order_lines_list_200_response() ->
    openapi_order_lines_list_200_response([]).

openapi_order_lines_list_200_response(Fields) ->
  Default = [ {'items', list(openapi_order_line:openapi_order_line()) }
            , {'bookmark', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

