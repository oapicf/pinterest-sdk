-module(openapi_bid_floor_create).

-include("openapi.hrl").

-export([openapi_bid_floor_create/0]).

-export([openapi_bid_floor_create/1]).

-export_type([openapi_bid_floor_create/0]).

-type openapi_bid_floor_create() ::
  [ {'bid_floor_specs', list(openapi_bid_floor_spec:openapi_bid_floor_spec()) }
  | {'targeting_spec', openapi_targeting_spec_optimal:openapi_targeting_spec_optimal() }
  ].


openapi_bid_floor_create() ->
    openapi_bid_floor_create([]).

openapi_bid_floor_create(Fields) ->
  Default = [ {'bid_floor_specs', list(openapi_bid_floor_spec:openapi_bid_floor_spec()) }
            , {'targeting_spec', openapi_targeting_spec_optimal:openapi_targeting_spec_optimal() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

