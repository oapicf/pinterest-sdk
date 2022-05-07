-module(openapi_targeting_type_filter).

-export([encode/1]).

-export_type([openapi_targeting_type_filter/0]).

-type openapi_targeting_type_filter() ::
    #{ 'targeting_types' => list()
     }.

encode(#{ 'targeting_types' := TargetingTypes
        }) ->
    #{ 'targeting_types' => TargetingTypes
     }.
