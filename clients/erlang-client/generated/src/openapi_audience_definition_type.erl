-module(openapi_audience_definition_type).

-export([encode/1]).

-export_type([openapi_audience_definition_type/0]).

-type openapi_audience_definition_type() ::
    #{ 'scope' => binary()
     }.

encode(#{ 'scope' := Scope
        }) ->
    #{ 'scope' => Scope
     }.
