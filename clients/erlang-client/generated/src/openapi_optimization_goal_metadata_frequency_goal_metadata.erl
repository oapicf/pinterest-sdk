-module(openapi_optimization_goal_metadata_frequency_goal_metadata).

-export([encode/1]).

-export_type([openapi_optimization_goal_metadata_frequency_goal_metadata/0]).

-type openapi_optimization_goal_metadata_frequency_goal_metadata() ::
    #{ 'frequency' => integer(),
       'timerange' => binary()
     }.

encode(#{ 'frequency' := Frequency,
          'timerange' := Timerange
        }) ->
    #{ 'frequency' => Frequency,
       'timerange' => Timerange
     }.
