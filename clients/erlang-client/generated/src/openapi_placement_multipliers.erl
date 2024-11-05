-module(openapi_placement_multipliers).

-export([encode/1]).

-export_type([openapi_placement_multipliers/0]).

-type openapi_placement_multipliers() ::
    #{ 'PLACEMENT' => binary()
     }.

encode(#{ 'PLACEMENT' := PLACEMENT
        }) ->
    #{ 'PLACEMENT' => PLACEMENT
     }.
