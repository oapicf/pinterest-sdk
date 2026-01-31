-module(openapi_optimization_goal_metadata_frequency_goal_metadata).

-include("openapi.hrl").

-export([openapi_optimization_goal_metadata_frequency_goal_metadata/0]).

-export([openapi_optimization_goal_metadata_frequency_goal_metadata/1]).

-export_type([openapi_optimization_goal_metadata_frequency_goal_metadata/0]).

-type openapi_optimization_goal_metadata_frequency_goal_metadata() ::
  [ {'frequency', integer() }
  | {'timerange', binary() }
  ].


openapi_optimization_goal_metadata_frequency_goal_metadata() ->
    openapi_optimization_goal_metadata_frequency_goal_metadata([]).

openapi_optimization_goal_metadata_frequency_goal_metadata(Fields) ->
  Default = [ {'frequency', integer(2, 20) }
            , {'timerange', elements([<<"THIRTY_DAY">>, <<"DAY">>, <<"SEVEN_DAY">>, <<"TWENTY_MINUTE">>, <<"TEN_MINUTE">>, <<"TWENTY_FOUR_HOUR">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

