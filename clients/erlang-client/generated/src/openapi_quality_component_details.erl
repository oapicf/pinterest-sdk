-module(openapi_quality_component_details).

-export([encode/1]).

-export_type([openapi_quality_component_details/0]).

-type openapi_quality_component_details() ::
    #{ 'coverage' := integer(),
       'issues' => list(),
       'overlap' => integer()
     }.

encode(#{ 'coverage' := Coverage,
          'issues' := Issues,
          'overlap' := Overlap
        }) ->
    #{ 'coverage' => Coverage,
       'issues' => Issues,
       'overlap' => Overlap
     }.
