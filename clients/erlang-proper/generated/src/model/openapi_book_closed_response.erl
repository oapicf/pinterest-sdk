-module(openapi_book_closed_response).

-include("openapi.hrl").

-export([openapi_book_closed_response/0]).

-export([openapi_book_closed_response/1]).

-export_type([openapi_book_closed_response/0]).

-type openapi_book_closed_response() ::
  [ {'conversion_metrics_ready', boolean() }
  | {'non_conversion_metrics_ready', boolean() }
  ].


openapi_book_closed_response() ->
    openapi_book_closed_response([]).

openapi_book_closed_response(Fields) ->
  Default = [ {'conversion_metrics_ready', boolean() }
            , {'non_conversion_metrics_ready', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

