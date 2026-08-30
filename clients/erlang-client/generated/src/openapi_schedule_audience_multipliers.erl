-module(openapi_schedule_audience_multipliers).

-export([encode/1]).

-export_type([openapi_schedule_audience_multipliers/0]).

-type openapi_schedule_audience_multipliers() ::
    #{ 'AUDIENCE_ID' => binary()
     }.

encode(#{ 'AUDIENCE_ID' := AUDIENCEID
        }) ->
    #{ 'AUDIENCE_ID' => AUDIENCEID
     }.
