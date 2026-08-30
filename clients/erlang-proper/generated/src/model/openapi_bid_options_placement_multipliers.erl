-module(openapi_bid_options_placement_multipliers).

-include("openapi.hrl").

-export([openapi_bid_options_placement_multipliers/0]).

-export([openapi_bid_options_placement_multipliers/1]).

-export_type([openapi_bid_options_placement_multipliers/0]).

-type openapi_bid_options_placement_multipliers() ::
  [ {'browse', integer() }
  | {'related_pins', integer() }
  | {'search', integer() }
  ].


openapi_bid_options_placement_multipliers() ->
    openapi_bid_options_placement_multipliers([]).

openapi_bid_options_placement_multipliers(Fields) ->
  Default = [ {'browse', integer() }
            , {'related_pins', integer() }
            , {'search', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

