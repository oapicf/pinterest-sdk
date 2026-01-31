-module(openapi_audience_definition_scope).

-export([encode/1]).

-export_type([openapi_audience_definition_scope/0]).

-type openapi_audience_definition_scope() ::
    #{ 'scope' => binary()
     }.

encode(#{ 'scope' := Scope
        }) ->
    #{ 'scope' => Scope
     }.
