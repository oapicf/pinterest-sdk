-module(openapi_schedule_audience_multipliers).

-include("openapi.hrl").

-export([openapi_schedule_audience_multipliers/0]).

-export([openapi_schedule_audience_multipliers/1]).

-export_type([openapi_schedule_audience_multipliers/0]).

-type openapi_schedule_audience_multipliers() ::
  [ {'AUDIENCE_ID', binary() }
  ].


openapi_schedule_audience_multipliers() ->
    openapi_schedule_audience_multipliers([]).

openapi_schedule_audience_multipliers(Fields) ->
  Default = [ {'AUDIENCE_ID', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

