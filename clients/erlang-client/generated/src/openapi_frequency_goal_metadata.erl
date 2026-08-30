-module(openapi_frequency_goal_metadata).

-export([encode/1]).

-export_type([openapi_frequency_goal_metadata/0]).

-type openapi_frequency_goal_metadata() ::
    #{ 'frequency' => integer(),
       'timerange' => openapi_frequency_goal_metadata_timerange:openapi_frequency_goal_metadata_timerange()
     }.

encode(#{ 'frequency' := Frequency,
          'timerange' := Timerange
        }) ->
    #{ 'frequency' => Frequency,
       'timerange' => Timerange
     }.
