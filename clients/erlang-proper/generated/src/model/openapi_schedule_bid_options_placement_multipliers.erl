-module(openapi_schedule_bid_options_placement_multipliers).

-include("openapi.hrl").

-export([openapi_schedule_bid_options_placement_multipliers/0]).

-export([openapi_schedule_bid_options_placement_multipliers/1]).

-export_type([openapi_schedule_bid_options_placement_multipliers/0]).

-type openapi_schedule_bid_options_placement_multipliers() ::
  [ {'browse', float() }
  | {'related_pins', float() }
  | {'search', float() }
  ].


openapi_schedule_bid_options_placement_multipliers() ->
    openapi_schedule_bid_options_placement_multipliers([]).

openapi_schedule_bid_options_placement_multipliers(Fields) ->
  Default = [ {'browse', float() }
            , {'related_pins', float() }
            , {'search', float() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

