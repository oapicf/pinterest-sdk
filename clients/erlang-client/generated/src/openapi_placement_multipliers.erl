-module(openapi_placement_multipliers).

-export([encode/1]).

-export_type([openapi_placement_multipliers/0]).

-type openapi_placement_multipliers() ::
    #{ 'PLACEMENT' => openapi_placement_type:openapi_placement_type()
     }.

encode(#{ 'PLACEMENT' := PLACEMENT
        }) ->
    #{ 'PLACEMENT' => PLACEMENT
     }.
