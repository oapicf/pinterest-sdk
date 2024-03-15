-module(openapi_bid_floor).

-include("openapi.hrl").

-export([openapi_bid_floor/0]).

-export([openapi_bid_floor/1]).

-export_type([openapi_bid_floor/0]).

-type openapi_bid_floor() ::
  [ {'bid_floors', list(integer()) }
  | {'type', binary() }
  ].


openapi_bid_floor() ->
    openapi_bid_floor([]).

openapi_bid_floor(Fields) ->
  Default = [ {'bid_floors', list(integer()) }
            , {'type', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

