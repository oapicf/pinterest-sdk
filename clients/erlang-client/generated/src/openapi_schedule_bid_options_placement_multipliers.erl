-module(openapi_schedule_bid_options_placement_multipliers).

-export([encode/1]).

-export_type([openapi_schedule_bid_options_placement_multipliers/0]).

-type openapi_schedule_bid_options_placement_multipliers() ::
    #{ 'browse' => float(),
       'related_pins' => float(),
       'search' => float()
     }.

encode(#{ 'browse' := Browse,
          'related_pins' := RelatedPins,
          'search' := Search
        }) ->
    #{ 'browse' => Browse,
       'related_pins' => RelatedPins,
       'search' => Search
     }.
