-module(openapi_frequency_goal_metadata_timerange).

-include("openapi.hrl").

-export([openapi_frequency_goal_metadata_timerange/0]).

-export_type([openapi_frequency_goal_metadata_timerange/0]).

-type openapi_frequency_goal_metadata_timerange() ::
  binary().

openapi_frequency_goal_metadata_timerange() ->
  elements([<<"THIRTY_DAY">>, <<"DAY">>, <<"SEVEN_DAY">>, <<"TWENTY_MINUTE">>, <<"TEN_MINUTE">>, <<"TWENTY_FOUR_HOUR">>]).

