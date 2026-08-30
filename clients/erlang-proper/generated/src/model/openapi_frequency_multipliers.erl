-module(openapi_frequency_multipliers).

-include("openapi.hrl").

-export([openapi_frequency_multipliers/0]).

-export([openapi_frequency_multipliers/1]).

-export_type([openapi_frequency_multipliers/0]).

-type openapi_frequency_multipliers() ::
  [ {'IMPRESSION_COUNT', binary() }
  ].


openapi_frequency_multipliers() ->
    openapi_frequency_multipliers([]).

openapi_frequency_multipliers(Fields) ->
  Default = [ {'IMPRESSION_COUNT', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

