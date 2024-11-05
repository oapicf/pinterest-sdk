-module(openapi_placement_multipliers).

-include("openapi.hrl").

-export([openapi_placement_multipliers/0]).

-export([openapi_placement_multipliers/1]).

-export_type([openapi_placement_multipliers/0]).

-type openapi_placement_multipliers() ::
  [ {'PLACEMENT', binary() }
  ].


openapi_placement_multipliers() ->
    openapi_placement_multipliers([]).

openapi_placement_multipliers(Fields) ->
  Default = [ {'PLACEMENT', elements([<<"SEARCH">>, <<"BROWSE">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

