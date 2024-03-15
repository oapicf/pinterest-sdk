-module(openapi_bid_floor_request).

-include("openapi.hrl").

-export([openapi_bid_floor_request/0]).

-export([openapi_bid_floor_request/1]).

-export_type([openapi_bid_floor_request/0]).

-type openapi_bid_floor_request() ::
  [ {'bid_floor_specs', list(openapi_bid_floor_spec:openapi_bid_floor_spec()) }
  | {'targeting_spec', openapi_targeting_spec:openapi_targeting_spec() }
  ].


openapi_bid_floor_request() ->
    openapi_bid_floor_request([]).

openapi_bid_floor_request(Fields) ->
  Default = [ {'bid_floor_specs', list(openapi_bid_floor_spec:openapi_bid_floor_spec()) }
            , {'targeting_spec', openapi_targeting_spec:openapi_targeting_spec() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

