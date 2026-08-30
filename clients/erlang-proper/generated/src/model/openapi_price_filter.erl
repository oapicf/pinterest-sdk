-module(openapi_price_filter).

-include("openapi.hrl").

-export([openapi_price_filter/0]).

-export([openapi_price_filter/1]).

-export_type([openapi_price_filter/0]).

-type openapi_price_filter() ::
  [ {'PRICE', openapi_price_filter_price:openapi_price_filter_price() }
  ].


openapi_price_filter() ->
    openapi_price_filter([]).

openapi_price_filter(Fields) ->
  Default = [ {'PRICE', openapi_price_filter_price:openapi_price_filter_price() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

