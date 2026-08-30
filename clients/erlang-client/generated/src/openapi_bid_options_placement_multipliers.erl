-module(openapi_bid_options_placement_multipliers).

-export([encode/1]).

-export_type([openapi_bid_options_placement_multipliers/0]).

-type openapi_bid_options_placement_multipliers() ::
    #{ 'browse' => integer(),
       'related_pins' => integer(),
       'search' => integer()
     }.

encode(#{ 'browse' := Browse,
          'related_pins' := RelatedPins,
          'search' := Search
        }) ->
    #{ 'browse' => Browse,
       'related_pins' => RelatedPins,
       'search' => Search
     }.
