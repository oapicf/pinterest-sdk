-module(openapi_bid_options_audience_multipliers).

-export([encode/1]).

-export_type([openapi_bid_options_audience_multipliers/0]).

-type openapi_bid_options_audience_multipliers() ::
    #{ 'audience_id' := binary(),
       'multiplier' := integer()
     }.

encode(#{ 'audience_id' := AudienceId,
          'multiplier' := Multiplier
        }) ->
    #{ 'audience_id' => AudienceId,
       'multiplier' => Multiplier
     }.
