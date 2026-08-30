-module(openapi_bid_options_audience_multipliers).

-include("openapi.hrl").

-export([openapi_bid_options_audience_multipliers/0]).

-export([openapi_bid_options_audience_multipliers/1]).

-export_type([openapi_bid_options_audience_multipliers/0]).

-type openapi_bid_options_audience_multipliers() ::
  [ {'audience_id', binary() }
  | {'multiplier', integer() }
  ].


openapi_bid_options_audience_multipliers() ->
    openapi_bid_options_audience_multipliers([]).

openapi_bid_options_audience_multipliers(Fields) ->
  Default = [ {'audience_id', binary() }
            , {'multiplier', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

