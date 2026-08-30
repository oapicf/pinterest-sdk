-module(openapi_frequency_goal_metadata).

-include("openapi.hrl").

-export([openapi_frequency_goal_metadata/0]).

-export([openapi_frequency_goal_metadata/1]).

-export_type([openapi_frequency_goal_metadata/0]).

-type openapi_frequency_goal_metadata() ::
  [ {'frequency', integer() }
  | {'timerange', openapi_frequency_goal_metadata_timerange:openapi_frequency_goal_metadata_timerange() }
  ].


openapi_frequency_goal_metadata() ->
    openapi_frequency_goal_metadata([]).

openapi_frequency_goal_metadata(Fields) ->
  Default = [ {'frequency', integer(2, 20) }
            , {'timerange', openapi_frequency_goal_metadata_timerange:openapi_frequency_goal_metadata_timerange() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

