-module(openapi_bid_options_gender_multipliers).

-include("openapi.hrl").

-export([openapi_bid_options_gender_multipliers/0]).

-export([openapi_bid_options_gender_multipliers/1]).

-export_type([openapi_bid_options_gender_multipliers/0]).

-type openapi_bid_options_gender_multipliers() ::
  [ {'female', integer() }
  | {'male', integer() }
  ].


openapi_bid_options_gender_multipliers() ->
    openapi_bid_options_gender_multipliers([]).

openapi_bid_options_gender_multipliers(Fields) ->
  Default = [ {'female', integer() }
            , {'male', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

