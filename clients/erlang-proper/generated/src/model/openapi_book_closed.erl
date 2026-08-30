-module(openapi_book_closed).

-include("openapi.hrl").

-export([openapi_book_closed/0]).

-export([openapi_book_closed/1]).

-export_type([openapi_book_closed/0]).

-type openapi_book_closed() ::
  [ {'conversion_metrics_ready', boolean() }
  | {'non_conversion_metrics_ready', boolean() }
  ].


openapi_book_closed() ->
    openapi_book_closed([]).

openapi_book_closed(Fields) ->
  Default = [ {'conversion_metrics_ready', boolean() }
            , {'non_conversion_metrics_ready', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

